/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.EmitenteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroEmitenteConverter
 *  br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoEmitenteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.business.EmitenteBusiness;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroEmitenteConverter;
import br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

class ImportacaoEmitenteBusiness
extends BaseImportacaoBusiness {
    private static final String a = "nrDocumento";
    private EmitenteBusiness a = new EmitenteBusiness();

    ImportacaoEmitenteBusiness() {
    }

    public ImportacaoResultadoTO a(ImportacaoTelaTO importacaoTela) throws DSENBusinessException {
        return this.importarTemplateMethod(importacaoTela);
    }

    protected DSGERegistroConverter getDSGERegistroConverter() {
        return new DSENRegistroEmitenteConverter();
    }

    protected String getIdRegistro(Registro child) {
        Registro emit = child.getChild(0);
        return emit.getCampo("nrDocumento").getValue();
    }

    protected ImportacaoRegistroTO validarRegras(String nomeArquivo, String idRegistro, ExpImpInterface to) throws DSGEUtilException {
        EmitenteTO emitente = (EmitenteTO)to;
        ArrayList erros = new ArrayList();
        this.validarCnpjCpf("Emitente", emitente.getNrDocumento(), emitente.getTpDocumentoEnum(), erros);
        this.validarIE("Emitente", emitente.getIe(), emitente.getUf(), erros);
        if (this.validarPais("Emitente", emitente.getCPais(), emitente.getXPais(), erros, false) && this.validarUF("Emitente", emitente.getCPais(), emitente.getUf(), erros, false)) {
            this.validarMunicipioExterior("Emitente", emitente.getCPais(), emitente.getXMun(), erros);
            if (this.validarMunicipioCodigoNome("Emitente", emitente.getCMun(), emitente.getXMun(), erros)) {
                this.validarCodigoMunicipioSiglaUF("Emitente", emitente.getUf(), emitente.getCMun(), ImportacaoErroTO.Status.ERROR, erros);
            }
        }
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, erros);
    }

    protected ImportacaoRegistroTO verificarDuplicidadeRegistro(ExpImpInterface to, String nomeArquivo, String idRegistro) throws DSENBusinessException {
        EmitenteTO importado = (EmitenteTO)to;
        EmitenteTO duplicado = this.a.pesquisarEmitentePorDocumento(importado);
        if (duplicado == null) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, new ImportacaoErroTO[0]);
        }
        importado.setIdEmitente(duplicado.getIdEmitente());
        String mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_REGISTRO, DSENLabelConstants.EMITENTE, idRegistro, nomeArquivo);
        String mensagemSobrescrever = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_EMITENTE_SOBRESCREVER, DSENLabelConstants.EMITENTE, idRegistro, nomeArquivo);
        ImportacaoRegistroTO reg = this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem, mensagemSobrescrever);
        if (!SituacaoRegistroEnum.REJEITADO.equals((Object)reg.getSituacaoRegistro())) {
            mensagemSobrescrever = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_EMITENTE_SOBRESCREVER2, idRegistro);
            return this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem, mensagemSobrescrever);
        }
        return reg;
    }

    protected void atualizarRegistro(ExpImpInterface to) throws DSENBusinessException {
        EmitenteTO emitenteTO = (EmitenteTO)to;
        if (emitenteTO.getIdEmitente() == null) {
            this.a.incluirEmitente(emitenteTO);
        } else {
            this.a.excluirEmitente(emitenteTO);
            emitenteTO.setIdEmitente(null);
            this.a.incluirEmitente(emitenteTO);
        }
    }
}

