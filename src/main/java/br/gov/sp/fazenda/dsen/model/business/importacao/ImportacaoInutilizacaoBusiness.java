/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.exception.DSENImportacaoException
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoInutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcInutNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe$InfInut
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe$InfInut
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.exception.DSENImportacaoException;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.BaseImportacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcInutNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TInutNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcInutNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetInutNFe;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class ImportacaoInutilizacaoBusiness
extends BaseImportacaoBusiness {
    private static Map<String, DSENSchemaTypeEnum> a = new HashMap();

    public ImportacaoInutilizacaoBusiness() {
    }

    public ImportacaoResultadoTO importar(ImportacaoTelaTO importacaoTela) throws DSENImportacaoException {
        ImportacaoResultadoTO resultadoTO = new ImportacaoResultadoTO();
        String conteudoArquivo = null;
        try {
            conteudoArquivo = this.lerArquivo(importacaoTela.getCaminhoArquivo(), importacaoTela.getCharset());
        }
        catch (DSENBusinessException e) {
            ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), null, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{ImportacaoInutilizacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)e.getMessage(), (Object[])new Object[0])});
            this.addResultadoRegistro(resultadoTO, registro);
            throw new DSENImportacaoException(resultadoTO);
        }
        ImportacaoRegistroTO registroTO = this.validarCaracteresEspeciais(importacaoTela.getNomeArquivo(), conteudoArquivo);
        if (this.a(registroTO)) {
            this.addResultadoRegistro(resultadoTO, registroTO);
            throw new DSENImportacaoException(resultadoTO);
        }
        return this.a(conteudoArquivo, importacaoTela);
    }

    private boolean a(ImportacaoRegistroTO registroTO) {
        if (registroTO == null) {
            return false;
        }
        return this.hasErro(registroTO.getImportacaoErros());
    }

    private ImportacaoResultadoTO a(String conteudoArquivo, ImportacaoTelaTO importacaoTela) throws DSENImportacaoException {
        ImportacaoResultadoTO resultadoTO = new ImportacaoResultadoTO();
        ImportacaoRegistroTO registroTO = null;
        String idRegistro = null;
        try {
            String procInutNFe = XMLUtil.getFirstTagConteudo((String)conteudoArquivo, (String)"procInutNFe", (boolean)false, (boolean)false);
            if (procInutNFe != null) {
                conteudoArquivo = conteudoArquivo.replaceFirst("<procInutNFe", "<" + DSENSchemaTypeEnum.ProcInutNFe.name()).replaceFirst("</procInutNFe", "</" + DSENSchemaTypeEnum.ProcInutNFe.name());
            }
            ProcInutNFeDocument procInutNFeDocument = DocumentoUtil.getProcInutNFeDocument((String)conteudoArquivo);
            TInutNFe inutNFe = procInutNFeDocument.getProcInutNFe().getInutNFe();
            DSENSchemaTypeEnum schemaType = this.a(conteudoArquivo);
            String versao = this.getVersao(conteudoArquivo);
            if (schemaType.equals((Object)DSENSchemaTypeEnum.ProcInutNFe) && inutNFe != null && inutNFe.getInfInut() != null && !StringHelper.isBlankOrNull((Object)inutNFe.getInfInut().getId())) {
                idRegistro = inutNFe.getInfInut().getId().replace("ID", "");
            }
            if (this.a(registroTO = this.a(importacaoTela.getNomeArquivo(), idRegistro, conteudoArquivo, schemaType))) {
                this.addResultadoRegistro(resultadoTO, registroTO);
                throw new DSENImportacaoException(resultadoTO);
            }
            registroTO = this.a(importacaoTela.getNomeArquivo(), idRegistro, conteudoArquivo, versao, schemaType);
            if (this.a(registroTO)) {
                this.addResultadoRegistro(resultadoTO, registroTO);
                throw new DSENImportacaoException(resultadoTO);
            }
            InutilizacaoTO inutilizacaoTO = this.a(conteudoArquivo, procInutNFeDocument.getProcInutNFe());
            registroTO = this.a(inutilizacaoTO, importacaoTela.getNomeArquivo(), idRegistro, inutNFe);
            if (this.a(registroTO)) {
                this.addResultadoRegistro(resultadoTO, registroTO);
                throw new DSENImportacaoException(resultadoTO);
            }
            InutilizacaoBusiness inutilizacaoBusiness = new InutilizacaoBusiness();
            inutilizacaoBusiness.alterarInutilizacao(inutilizacaoTO);
            new NotaFiscalBusiness().excluirNotasFiscaisInutilizadas(inutilizacaoTO);
            this.addResultadoRegistro(resultadoTO, registroTO);
        }
        catch (DSENImportacaoException e) {
            throw e;
        }
        catch (Exception e) {
            e.printStackTrace();
            ImportacaoErroTO erro = ImportacaoInutilizacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)(e.getClass().getSimpleName() + ": " + e.getMessage()), (Object[])new Object[0]);
            ImportacaoRegistroTO registro = this.newImportacaoRegistro(importacaoTela.getNomeArquivo(), idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            this.addResultadoRegistro(resultadoTO, registro);
            throw new DSENImportacaoException(resultadoTO);
        }
        return resultadoTO;
    }

    private DSENSchemaTypeEnum a(String xml) {
        Set xmlTagsKeySet = a.keySet();
        for (String xmlTag : xmlTagsKeySet) {
            List listaConteudoTag = XMLUtil.getTagConteudo((String)xml, (String)xmlTag, (boolean)true);
            if (listaConteudoTag == null || listaConteudoTag.isEmpty() || listaConteudoTag.size() > 1) continue;
            return (DSENSchemaTypeEnum)a.get(xmlTag);
        }
        return null;
    }

    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String conteudoArquivo, String versao, DSENSchemaTypeEnum schemaType) {
        List erros = DSENSchemaValidator.getInstance().validate(schemaType, versao, conteudoArquivo);
        if (this.hasErro(erros)) {
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, erros);
        }
        return null;
    }

    private boolean a(String doc) {
        boolean isValido = false;
        try {
            DSGEDocumentoHelper.validarDocumento((String)doc, (TipoDocumentoEnum)TipoDocumentoEnum.CNPJ);
            isValido = true;
        }
        catch (DSGEValidationException e) {
            isValido = false;
        }
        return isValido;
    }

    private ImportacaoRegistroTO a(String nomeArquivo, String idRegistro, String conteudo, DSENSchemaTypeEnum schemaType) throws DSGECertificadoException {
        try {
            Certificado certificado = new Certificado();
            boolean isAssinaturaValida = certificado.validarAssinaturaXML(conteudo);
            if (isAssinaturaValida) {
                return null;
            }
            ImportacaoErroTO erro = ImportacaoInutilizacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)DSENMessageConstants.MSG_IMPORTACAO_ASSINATURA_INVALIDA, (Object[])new Object[]{nomeArquivo});
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
        }
        catch (Throwable e) {
            throw new DSGECertificadoException(e.getMessage());
        }
    }

    private InutilizacaoTO a(String docXML, TProcInutNFe procInutNFe) {
        EmitenteTO emitente = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        TInutNFe.InfInut inutNFe = null;
        TRetInutNFe.InfInut retInutNFe = null;
        InutilizacaoTO inutlizacaoTO = new InutilizacaoTO();
        inutlizacaoTO.setEmitenteTO(emitente);
        inutlizacaoTO.setProtocoloXmlString(docXML);
        if (procInutNFe != null) {
            if (procInutNFe.getInutNFe() != null && procInutNFe.getInutNFe().getInfInut() != null) {
                inutNFe = procInutNFe.getInutNFe().getInfInut();
                inutlizacaoTO.setCodigoUf(inutNFe.getCUF().toString());
                inutlizacaoTO.setAno(inutNFe.getAno());
                inutlizacaoTO.setSerie(StringHelper.completaComZerosAEsquerda((String)inutNFe.getSerie(), (int)3));
                inutlizacaoTO.setNumeroInicial(StringHelper.completaComZerosAEsquerda((String)inutNFe.getNNFIni(), (int)9));
                inutlizacaoTO.setNumeroFinal(StringHelper.completaComZerosAEsquerda((String)inutNFe.getNNFFin(), (int)9));
            }
            if (procInutNFe.getRetInutNFe() != null && procInutNFe.getRetInutNFe().getInfInut() != null && !StringHelper.isBlankOrNull((Object)(retInutNFe = procInutNFe.getRetInutNFe().getInfInut()).getDhRecbto())) {
                inutlizacaoTO.setDataInutilizacao(DateHelper.getDateTime((String)retInutNFe.getDhRecbto(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
            }
            inutlizacaoTO.setVersao(procInutNFe.getVersao());
        }
        return inutlizacaoTO;
    }

    private ImportacaoRegistroTO a(InutilizacaoTO inutilizacaoTO, String nomeArquivo, String idRegistro, TInutNFe inutNFe) throws DSENBusinessException {
        String mensagemSobrescrever;
        String mensagem;
        InutilizacaoBusiness inutilizacaoBusiness = new InutilizacaoBusiness();
        NotaFiscalBusiness notafiscalBusiness = new NotaFiscalBusiness();
        ImportacaoRegistroTO registroTO = null;
        ArrayList errosAlertas = new ArrayList();
        if (inutNFe != null && inutNFe.getInfInut() != null && !StringHelper.isBlankOrNull((Object)inutNFe.getInfInut().getCNPJ())) {
            if (!this.a(inutNFe.getInfInut().getCNPJ())) {
                ImportacaoErroTO erroTO = ImportacaoInutilizacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"CNPJ", (String)MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_CNPJ_INVALIDO, inutNFe.getInfInut().getCNPJ()), (Object[])new Object[]{nomeArquivo});
                return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erroTO});
            }
            if (!inutilizacaoTO.getEmitenteTO().getNrDocumento().equals(inutNFe.getInfInut().getCNPJ())) {
                ImportacaoErroTO erroTO = ImportacaoInutilizacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)"CNPJ", (String)MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_CNPJ_INUTILIZACAO_DIFERENTE_EMITENTE_LOGADO, inutNFe.getInfInut().getCNPJ(), inutilizacaoTO.getEmitenteTO().getNrDocumento()), (Object[])new Object[]{nomeArquivo});
                return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erroTO});
            }
        }
        ArrayList<SituacaoNFeEnum> situacoes = new ArrayList<SituacaoNFeEnum>();
        situacoes.add(SituacaoNFeEnum.CANCELADA);
        situacoes.add(SituacaoNFeEnum.AUTORIZADA);
        situacoes.add(SituacaoNFeEnum.DENEGADA);
        List seriesNumerosList = notafiscalBusiness.getSerieNumeroAnoPorSituacoes(inutilizacaoTO.getEmitenteTO().getIdEmitente(), inutilizacaoTO.getSerie(), inutilizacaoTO.getNumeroInicial(), inutilizacaoTO.getNumeroFinal(), situacoes);
        if (seriesNumerosList != null && !seriesNumerosList.isEmpty()) {
            ImportacaoErroTO erro = ImportacaoInutilizacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_EXISTEM_NOTAS_COM_SITUACOES_PROIBIDAS_DENTRO_DA_FAIXA, seriesNumerosList.size(), inutilizacaoTO.getSerie(), inutilizacaoTO.getNumeroInicial(), inutilizacaoTO.getNumeroFinal()), (Object[])new Object[]{idRegistro});
            return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
        }
        List inutilizacoesCadastradas = inutilizacaoBusiness.obterFaixasInutilizadas(inutilizacaoTO);
        boolean alterado = false;
        if (inutilizacoesCadastradas != null && !inutilizacoesCadastradas.isEmpty()) {
            if (inutilizacoesCadastradas.size() == 1 && inutilizacaoTO.getNumeroInicial().equals(((InutilizacaoTO)inutilizacoesCadastradas.get(0)).getNumeroInicial()) && inutilizacaoTO.getNumeroFinal().equals(((InutilizacaoTO)inutilizacoesCadastradas.get(0)).getNumeroFinal())) {
                InutilizacaoTO duplicada = (InutilizacaoTO)inutilizacoesCadastradas.get(0);
                inutilizacaoTO.setIdInutilizacao(duplicada.getIdInutilizacao());
                String mensagem2 = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_INUTILIZACAO, inutilizacaoTO.getSerie(), inutilizacaoTO.getNumeroInicial(), inutilizacaoTO.getNumeroFinal());
                String mensagemSobrescrever2 = mensagem2 + DSENMessageConstants.MSG_IMPORTACAO_DUPLICIDADE_SOBRESCREVER;
                registroTO = this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem2, mensagemSobrescrever2);
                if (this.rejeitado(registroTO)) {
                    return registroTO;
                }
                errosAlertas.addAll(registroTO.getImportacaoErros());
                alterado = true;
            } else {
                ImportacaoErroTO erro = ImportacaoInutilizacaoBusiness.newImportacaoErro((ImportacaoErroTO.Status)ImportacaoErroTO.Status.ERROR, (String)null, (String)MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_EXISTEM_INUTILIZACOES_CONFLITANTES, inutilizacaoTO.getSerie(), inutilizacaoTO.getNumeroInicial(), inutilizacaoTO.getNumeroFinal()), (Object[])new Object[]{idRegistro});
                return this.newImportacaoRegistro(nomeArquivo, idRegistro, SituacaoRegistroEnum.REJEITADO, new ImportacaoErroTO[]{erro});
            }
        }
        situacoes.clear();
        situacoes.add(SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ);
        situacoes.add(SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA);
        seriesNumerosList = notafiscalBusiness.getSerieNumeroAnoPorSituacoes(inutilizacaoTO.getEmitenteTO().getIdEmitente(), inutilizacaoTO.getSerie(), inutilizacaoTO.getNumeroInicial(), inutilizacaoTO.getNumeroFinal(), situacoes);
        if (seriesNumerosList != null && !seriesNumerosList.isEmpty()) {
            mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_INUTILIZACAO_CONTEM_EM_PROC_SEFAZ_TRANSM_PEND, seriesNumerosList.size(), inutilizacaoTO.getSerie(), inutilizacaoTO.getNumeroInicial(), inutilizacaoTO.getNumeroFinal());
            registroTO = this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem, mensagemSobrescrever = mensagem + "\n" + DSENMessageConstants.QUESTION_DESEJA_CONTINUAR);
            if (this.rejeitado(registroTO)) {
                return registroTO;
            }
            errosAlertas.addAll(registroTO.getImportacaoErros());
        }
        situacoes.clear();
        situacoes.add(SituacaoNFeEnum.EM_DIGITACAO);
        situacoes.add(SituacaoNFeEnum.VALIDADA);
        situacoes.add(SituacaoNFeEnum.REJEITADA);
        situacoes.add(SituacaoNFeEnum.ASSINADA);
        seriesNumerosList = notafiscalBusiness.getSerieNumeroAnoPorSituacoes(inutilizacaoTO.getEmitenteTO().getIdEmitente(), inutilizacaoTO.getSerie(), inutilizacaoTO.getNumeroInicial(), inutilizacaoTO.getNumeroFinal(), situacoes);
        if (seriesNumerosList != null && !seriesNumerosList.isEmpty()) {
            mensagem = MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_INUTILIZACAO_CONTEM_EM_DIG_VAL_ASSINADA_REJ, seriesNumerosList.size(), inutilizacaoTO.getSerie(), inutilizacaoTO.getNumeroInicial(), inutilizacaoTO.getNumeroFinal());
            registroTO = this.notificarDuplicidade(nomeArquivo, idRegistro, mensagem, mensagemSobrescrever = mensagem + "\n" + DSENMessageConstants.QUESTION_DESEJA_CONTINUAR);
            if (this.rejeitado(registroTO)) {
                return registroTO;
            }
            errosAlertas.addAll(registroTO.getImportacaoErros());
        }
        if (registroTO != null) {
            registroTO.setSituacaoRegistro(alterado ? SituacaoRegistroEnum.ALTERADO : SituacaoRegistroEnum.INSERIDO);
            return registroTO;
        }
        return this.newImportacaoRegistro(nomeArquivo, idRegistro, alterado ? SituacaoRegistroEnum.ALTERADO : SituacaoRegistroEnum.INSERIDO, errosAlertas);
    }

    static {
        a.put("ProcInutNFe", DSENSchemaTypeEnum.ProcInutNFe);
        a.put("procInutNFe", DSENSchemaTypeEnum.ProcInutNFe);
    }
}

