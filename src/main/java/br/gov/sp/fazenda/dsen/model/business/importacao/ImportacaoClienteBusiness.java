/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.model.business.ClienteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroClienteConverter
 *  br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoClienteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
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
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.business.ClienteBusiness;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroClienteConverter;
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
class ImportacaoClienteBusiness
extends BaseImportacaoBusiness {
    private static final String a = "nrDocumento";
    private static final String b = "xNome";
    private ClienteBusiness a = new ClienteBusiness();

    ImportacaoClienteBusiness() {
    }

    public ImportacaoResultadoTO a(ImportacaoTelaTO importacaoTela) throws DSENBusinessException {
        return this.importarTemplateMethod(importacaoTela);
    }

    protected DSGERegistroConverter getDSGERegistroConverter() {
        return new DSENRegistroClienteConverter();
    }

    protected String getIdRegistro(Registro child) {
        Registro dest = child.getChild(0);
        String id = dest.getCampo("nrDocumento").getValue();
        if (StringHelper.isBlankOrNull((Object)id)) {
            id = dest.getCampo("xNome").getValue();
        }
        return id;
    }

    protected ImportacaoRegistroTO validarRegras(String nomeArquivo, String idRegistro, ExpImpInterface to) throws DSGEUtilException {
        ClienteTO clienteTO = (ClienteTO)to;
        ArrayList erros = new ArrayList();
        this.validarCnpjCpf("Cliente", clienteTO.getNrDocumento(), clienteTO.getTpDocumentoEnum(), erros);
        this.validarIE("Cliente", clienteTO.getIe(), clienteTO.getUf(), erros);
        this.validarIESUF("Cliente", clienteTO.getIesuf(), clienteTO.getUf(), clienteTO.getCMun(), erros);
        if (this.validarPais("Cliente", clienteTO.getCPais(), clienteTO.getXPais(), erros, true) && this.validarUF("Cliente", clienteTO.getCPais(), clienteTO.getUf(), erros, true)) {
            this.validarMunicipioExterior("Cliente", clienteTO.getCPais(), clienteTO.getXMun(), erros);
            if (this.validarMunicipioCodigoNome("Cliente", clienteTO.getCMun(), clienteTO.getXMun(), erros)) {
                this.validarCodigoMunicipioSiglaUF("Cliente", clienteTO.getUf(), clienteTO.getCMun(), ImportacaoErroTO.Status.ERROR, erros);
            }
        }
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
                erros.add(ImportacaoClienteBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"nrDocumento", (String)DSENMessageConstants.MSG_IMPORTACAO_NR_DOCUMENTO_INVALIDO, (Object[])new Object[]{tipoDocumentoEnum.toString(), nrDocumento}));
                valid = false;
            }
        }
        return valid;
    }

    protected ImportacaoRegistroTO verificarDuplicidadeRegistro(ExpImpInterface to, String nomeArquivo, String idRegistro) throws DSENBusinessException {
        ClienteTO duplicado;
        ClienteTO importado = (ClienteTO)to;
        importado.setEmitente(this.getEmitenteAtual());
        ClienteTO clienteTO = duplicado = !StringHelper.isBlankOrNull((Object)importado.getNrDocumento()) ? this.a.pesquisarClientePorDocumento(importado) : null;
        if (duplicado == null) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.INSERIDO, new ImportacaoErroTO[0]);
        }
        importado.setIdCliente(duplicado.getIdCliente());
        String mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_REGISTRO, new Object[]{TipoDocumentoArquivoEnum.Cliente, idRegistro, nomeArquivo});
        String mensagemSobrescrever = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_REGISTRO_SOBRESCREVER, new Object[]{TipoDocumentoArquivoEnum.Cliente, idRegistro, nomeArquivo});
        return this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem, mensagemSobrescrever);
    }

    protected void atualizarRegistro(ExpImpInterface to) throws DSENBusinessException {
        this.a.alterarCliente((ClienteTO)to);
    }
}

