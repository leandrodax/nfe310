/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.TransportadoraBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroTransportadoraConverter
 *  br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTransportadoraBusiness
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.business.TransportadoraBusiness;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroTransportadoraConverter;
import br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
class ImportacaoTransportadoraBusiness
extends BaseImportacaoBusiness {
    private static final String a = "nrDocumento";
    private static final String b = "xNome";
    private TransportadoraBusiness a = new TransportadoraBusiness();

    ImportacaoTransportadoraBusiness() {
    }

    public ImportacaoResultadoTO a(ImportacaoTelaTO importacaoTela) throws DSENBusinessException {
        return this.importarTemplateMethod(importacaoTela);
    }

    protected DSGERegistroConverter getDSGERegistroConverter() {
        return new DSENRegistroTransportadoraConverter();
    }

    protected String getIdRegistro(Registro child) {
        Registro transp = child.getChild(0);
        String id = transp.getCampo("nrDocumento").getValue();
        if (StringHelper.isBlankOrNull((Object)id)) {
            id = transp.getCampo("xNome").getValue();
        }
        return id;
    }

    protected ImportacaoRegistroTO validarRegras(String nomeArquivo, String idRegistro, ExpImpInterface to) throws DSGEUtilException {
        TransportadoraTO transportadora = (TransportadoraTO)to;
        ArrayList erros = new ArrayList();
        this.validarCnpjCpf("Transporte", transportadora.getNrDocumento(), transportadora.getTpDocumentoEnum(), erros);
        this.validarIE("Transporte", transportadora.getIe(), transportadora.getUf(), erros);
        this.validarNomeMunicipioSiglaUF("Transporte", transportadora.getUf(), transportadora.getXMun(), ImportacaoErroTO.Status.ERROR, erros);
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, erros);
    }

    protected boolean validarCnpjCpf(String tipoInformacao, String nrDocumento, TipoDocumentoEnum tipoDocumentoEnum, List<ImportacaoErroTO> erros) throws DSGEUtilException {
        boolean valid = true;
        if (tipoDocumentoEnum != null && !StringHelper.isBlankOrNull((Object)nrDocumento)) {
            try {
                DSGEDocumentoHelper.validarDocumento((String)nrDocumento, (TipoDocumentoEnum)tipoDocumentoEnum);
            }
            catch (DSGEValidationException e) {
                erros.add(ImportacaoTransportadoraBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"nrDocumento", (String)DSENMessageConstants.MSG_IMPORTACAO_NR_DOCUMENTO_INVALIDO, (Object[])new Object[]{tipoDocumentoEnum.toString(), nrDocumento}));
                valid = false;
            }
        }
        return valid;
    }

    protected ImportacaoRegistroTO verificarDuplicidadeRegistro(ExpImpInterface to, String nomeArquivo, String idRegistro) throws DSENBusinessException {
        TransportadoraTO duplicado;
        TransportadoraTO importado = (TransportadoraTO)to;
        importado.setEmitente(this.getEmitenteAtual());
        TransportadoraTO transportadoraTO = duplicado = !StringHelper.isBlankOrNull((Object)importado.getNrDocumento()) ? this.a.pesquisarTransportadoraPorDocumento(importado) : null;
        if (duplicado == null) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, new ImportacaoErroTO[0]);
        }
        importado.setIdTransportadora(duplicado.getIdTransportadora());
        String mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_REGISTRO, new Object[]{TipoDocumentoArquivoEnum.Transportadora, idRegistro, nomeArquivo});
        String mensagemSobrescrever = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_REGISTRO_SOBRESCREVER, new Object[]{TipoDocumentoArquivoEnum.Transportadora, idRegistro, nomeArquivo});
        return this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem, mensagemSobrescrever);
    }

    protected void atualizarRegistro(ExpImpInterface to) throws DSENBusinessException {
        this.a.alterarTransportadora((TransportadoraTO)to);
    }
}

