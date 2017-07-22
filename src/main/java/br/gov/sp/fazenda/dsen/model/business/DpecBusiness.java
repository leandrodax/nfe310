/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO$DpecStatus
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.to.ProblemaDpecDanfeTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.model.business.DpecBusiness
 *  br.gov.sp.fazenda.dsen.model.business.DpecBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.DpecBusiness$2
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.WSBusiness
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.IOHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno;
import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.to.ProblemaDpecDanfeTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.model.business.DpecBusiness;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.WSBusiness;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.IOHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException;
import java.io.File;
import java.io.FilenameFilter;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class DpecBusiness {
    private static WSBusiness a = null;

    public DpecBusiness() {
    }

    private static WSBusiness a() {
        if (a == null) {
            a = new WSBusiness();
        }
        return a;
    }

    public void gerarDPEC(List<NotaFiscalTO> listaNotaFiscal, CertificadoTO certificadoTO) {
        try {
            ParametroTO parametroTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_GERADO_DIR, ParametroTO.class);
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            if (!IOHelper.verifyFile((String)parametroTO.getValor(), (boolean)true)) {
                String mensagemErro = MessageFormat.format(DSENMessageConstants.DPEC_GERACAO_ERRO_PERMISSAO, parametroTO.getValor());
                Notificador.getInstance().notificar((Object)mensagemErro, new EnumItf[]{GrupoNotificacaoEnum.DPEC_RESULTADO});
                return;
            }
            Object envioDPECDocument = this.a(emitenteTO, null);
            String envioDPECString = null;
            int totalRegistros = listaNotaFiscal.size();
            int qtdeRegistrosProcessados = 0;
            int qtdeArquivosGerados = 0;
            int totalNotas = 0;
            for (NotaFiscalTO notaFiscalTO : listaNotaFiscal) {
                try {
                    if (++totalNotas > 50) {
                        if (!this.a(parametroTO, emitenteTO, envioDPECDocument, certificadoTO, qtdeArquivosGerados)) {
                            return;
                        }
                        envioDPECDocument = this.a(emitenteTO, notaFiscalTO);
                        totalNotas = 0;
                        Notificador.getInstance().notificar((Object)new int[]{totalRegistros, ++qtdeRegistrosProcessados, ++qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.DPEC_TOTAIS});
                        continue;
                    }
                    DocumentoUtil.addResumoNFeDPEC((Object)envioDPECDocument, (NotaFiscalTO)notaFiscalTO);
                    Notificador.getInstance().notificar((Object)new int[]{totalRegistros, ++qtdeRegistrosProcessados, qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.DPEC_TOTAIS});
                    envioDPECString = DocumentoUtil.getDocumentString((Object)envioDPECDocument, (boolean)false);
                    boolean excedeuMaximoBytes = envioDPECString.getBytes().length + 2939 > 51200;
                    if (!excedeuMaximoBytes) continue;
                    DocumentoUtil.removeUltimoResumoNFe((Object)envioDPECDocument);
                    if (!this.a(parametroTO, emitenteTO, envioDPECDocument, certificadoTO, qtdeArquivosGerados)) {
                        return;
                    }
                    envioDPECDocument = this.a(emitenteTO, notaFiscalTO);
                    Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosProcessados, ++qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.DPEC_TOTAIS});
                }
                catch (CancelarExportacaoException e) {
                    Notificador.getInstance().notificar((Object)DSENMessageConstants.DPEC_GERACAO_CANCELADA, new EnumItf[]{GrupoNotificacaoEnum.DPEC_RESULTADO});
                    return;
                }
                catch (Throwable e) {
                    e.printStackTrace();
                    String mensagemErro = MessageFormat.format(DSENMessageConstants.DPEC_NFE_GERACAO_ERRO, ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO));
                    Notificador.getInstance().notificar((Object)mensagemErro, new EnumItf[]{GrupoNotificacaoEnum.DPEC_RESULTADO});
                    --totalNotas;
                }
            }
            if (this.a(parametroTO, emitenteTO, envioDPECDocument, certificadoTO, qtdeArquivosGerados)) {
                Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosProcessados, ++qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.DPEC_TOTAIS});
            }
        }
        catch (CancelarExportacaoException e) {
            Notificador.getInstance().notificar((Object)DSENMessageConstants.DPEC_GERACAO_CANCELADA, new EnumItf[]{GrupoNotificacaoEnum.DPEC_RESULTADO});
        }
        catch (Throwable e) {
            e.printStackTrace();
            Notificador.getInstance().notificar((Object)DSENMessageConstants.DPEC_GERACAO_ERRO, new EnumItf[]{GrupoNotificacaoEnum.DPEC_RESULTADO});
        }
    }

    private Object a(EmitenteTO emitenteTO, NotaFiscalTO notaFiscalTO) throws DSENCommonException, DSGEUtilException {
        EstadoTO emitenteEstadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteTO.getUf());
        Object envioDPECDocument = DocumentoUtil.criarEnvioDPEC((EmitenteTO)emitenteTO, (String)emitenteEstadoTO.getCodigo());
        if (notaFiscalTO != null) {
            DocumentoUtil.addResumoNFeDPEC((Object)envioDPECDocument, (NotaFiscalTO)notaFiscalTO);
        }
        return envioDPECDocument;
    }

    private boolean a(ParametroTO parametroTO, EmitenteTO emitenteTO, Object envioDPECDocument, CertificadoTO certificadoTO, int qtdeArquivosGerados) throws CancelarExportacaoException, Exception {
        String pathArquivo = this.a(emitenteTO, parametroTO, qtdeArquivosGerados);
        String envioDPECString = DocumentoUtil.getDocumentString((Object)envioDPECDocument, (boolean)false);
        Certificado certificado = new Certificado();
        String referenceURI = DSENConstants.ID_DPEC + emitenteTO.getNrDocumento();
        String envioDPECStringAssinado = certificado.assinarXML(certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey(), referenceURI, envioDPECString, emitenteTO.getNrDocumento());
        if (ExportacaoHelper.exportar((String)pathArquivo, (String)envioDPECStringAssinado)) {
            String mensagem = MessageFormat.format(DSENMessageConstants.DPEC_GERACAO_SUCESSO, pathArquivo);
            Notificador.getInstance().notificar((Object)mensagem, new EnumItf[]{GrupoNotificacaoEnum.DPEC_RESULTADO});
            return true;
        }
        Notificador.getInstance().notificar((Object)DSENMessageConstants.DPEC_GERACAO_ERRO, new EnumItf[]{GrupoNotificacaoEnum.DPEC_RESULTADO});
        return false;
    }

    private String a(EmitenteTO emitenteTO, ParametroTO parametroTO, int qtdeArquivosGerados) {
        StringBuilder builder = new StringBuilder(parametroTO.getValor()).append(File.separator).append(emitenteTO.getNrDocumento()).append('_').append(DateHelper.formataDataHora((Date)new Date(), (SimpleDateFormat)DateHelper.DATE_NOME_ARQUIVO_FORMAT)).append('_').append(qtdeArquivosGerados + 1).append("_envDPEC_v").append(DSENProperties.getInstance().getVersaoSchemaDpec());
        return builder.append(ExtensaoArquivoEnum.XML.getExtensao()).toString();
    }

    private String a(DpecTO dpecTO, ParametroTO parametroTO) {
        StringBuilder builder = new StringBuilder(parametroTO.getValor()).append(File.separator).append(dpecTO.getNumeroRegistro()).append("_retDPEC_v").append(DSENProperties.getInstance().getVersaoSchemaDpec());
        return builder.append(ExtensaoArquivoEnum.XML.getExtensao()).toString();
    }

    private String a(String numeroRegistro) {
        StringBuilder builder = new StringBuilder().append(numeroRegistro).append("_retConsDPEC_v").append(DSENProperties.getInstance().getVersaoSchemaDpec());
        return builder.append(ExtensaoArquivoEnum.XML.getExtensao()).toString();
    }

    public Map<DpecTO.DpecStatus, List<DpecTO>> pesquisarDPEC() throws DSENBusinessException {
        try {
            ParametroTO parametroDpecGeradoDir = (ParametroTO)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PARAMETRO_DPEC_GERADO_DIR, ParametroTO.class);
            ParametroTO parametroDpecAutorizadoDir = (ParametroTO)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PARAMETRO_DPEC_AUTORIZADO_DIR, ParametroTO.class);
            HashMap<DpecTO.DpecStatus, List<DpecTO>> dpecMap = new HashMap<DpecTO.DpecStatus, List<DpecTO>>();
            dpecMap.put(DpecTO.DpecStatus.GERADO, this.pesquisarDPEC(parametroDpecGeradoDir.getValor(), false));
            dpecMap.put(DpecTO.DpecStatus.AUTORIZADO, this.pesquisarDPEC(parametroDpecAutorizadoDir.getValor(), true));
            return dpecMap;
        }
        catch (DSGECommonException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public List<DpecTO> pesquisarDPEC(String dir, boolean autorizados) throws DSGECommonException {
        ArrayList<DpecTO> listaDpecTO = new ArrayList<DpecTO>();
        File[] arquivos = this.a(dir);
        if (arquivos == null) {
            return listaDpecTO;
        }
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        Date dataAutorizacao = null;
        for (int i = 0; i < arquivos.length; ++i) {
            List listaEnvDPEC;
            List cnpj;
            String conteudoArquivo = IOHelper.readFileSemBom((String)arquivos[i].getPath());
            List ideDec = XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"ideDec", (boolean)true);
            if (ideDec == null || (cnpj = XMLUtil.getTagConteudo((String)((String)ideDec.get(0)), (String)"CNPJ", (boolean)false)) == null || !emitenteTO.getNrDocumento().equals(cnpj.get(0))) continue;
            if (autorizados) {
                List infDPECReg = XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"infDPECReg", (boolean)true);
                if (infDPECReg == null) continue;
                String dataRegistro = (String)XMLUtil.getTagConteudo((String)((String)infDPECReg.get(0)), (String)"dhRegDPEC", (boolean)false).get(0);
                dataAutorizacao = XMLUtil.getXmlDate((String)dataRegistro);
                String cStat = (String)XMLUtil.getTagConteudo((String)((String)infDPECReg.get(0)), (String)"cStat", (boolean)false).get(0);
                if (!(DSENConstants.DPEC_RECEBIDO.equals(cStat) && XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"retDPEC", (boolean)true) != null || DSENConstants.DPEC_LOCALIZADO.equals(cStat) && XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"retConsDPEC", (boolean)true) != null)) {
                    continue;
                }
            } else if (XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"retConsDPEC", (boolean)true) != null || XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"retDPEC", (boolean)true) != null || XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"envDPEC", (boolean)true) == null) continue;
            if ((listaEnvDPEC = XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"infDPEC", (boolean)true)) == null || listaEnvDPEC.size() != 1) continue;
            String envDPEC = (String)listaEnvDPEC.get(0);
            DpecTO dpecTO = new DpecTO();
            dpecTO.setNomeArquivo(arquivos[i].getName());
            dpecTO.setPathArquivo(arquivos[i].getPath());
            if (autorizados) {
                dpecTO.setDataRegistro(dataAutorizacao);
                dpecTO.setDpecStatus(DpecTO.DpecStatus.AUTORIZADO);
            } else {
                dpecTO.setDataGeracao(new Date(arquivos[i].lastModified()));
                dpecTO.setDpecStatus(DpecTO.DpecStatus.GERADO);
            }
            List listaNotaFiscal = XMLUtil.getTagConteudo((String)envDPEC, (String)"resNFe", (boolean)true);
            if (listaNotaFiscal != null) {
                dpecTO.setQuantidadeNotas(listaNotaFiscal.size());
            }
            listaDpecTO.add(dpecTO);
        }
        return listaDpecTO;
    }

    public void detalharDPEC(DpecTO dpecTO, boolean validarAssinatura) throws DSENBusinessException, DSGEUtilException {
        try {
            List erros;
            if (dpecTO.getConteudoArquivo() == null) {
                dpecTO.setConteudoArquivo(IOHelper.readFileSemBom((String)dpecTO.getPathArquivo()));
            }
            if ((erros = this.a(dpecTO, validarAssinatura)) == null) {
                this.a(dpecTO);
            } else {
                dpecTO.addError(DSENMessageConstants.DPEC_DETALHAMENTO_ERRO);
            }
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private List<ImportacaoErroTO> a(DpecTO dpecTO, boolean validarAssinatura) {
        List erros = null;
        if (XMLUtil.getTagConteudo((String)dpecTO.getConteudoArquivo(), (String)"retConsDPEC", (boolean)true) != null) {
            erros = DSENSchemaValidator.getInstance().validate(DSENSchemaTypeEnum.retConsDPEC, DSENProperties.getInstance().getVersaoSchemaDpec(), dpecTO.getConteudoArquivo());
            if (erros == null && validarAssinatura) {
                this.a(dpecTO, DSENSchemaTypeEnum.retConsDPEC);
            }
        } else if (XMLUtil.getTagConteudo((String)dpecTO.getConteudoArquivo(), (String)"retDPEC", (boolean)true) != null) {
            erros = DSENSchemaValidator.getInstance().validate(DSENSchemaTypeEnum.retDPEC, DSENProperties.getInstance().getVersaoSchemaDpec(), dpecTO.getConteudoArquivo());
            if (erros == null && validarAssinatura) {
                this.a(dpecTO, DSENSchemaTypeEnum.retDPEC);
            }
        } else if (XMLUtil.getTagConteudo((String)dpecTO.getConteudoArquivo(), (String)"envDPEC", (boolean)true) != null) {
            erros = DSENSchemaValidator.getInstance().validate(DSENSchemaTypeEnum.envDPEC, DSENProperties.getInstance().getVersaoSchemaDpec(), dpecTO.getConteudoArquivo());
        } else {
            dpecTO.addError(DSENMessageConstants.DPEC_DETALHAMENTO_ERRO);
        }
        return erros;
    }

    private void a(DpecTO dpecTO, DSENSchemaTypeEnum schemaType) {
        try {
            Certificado certificado = new Certificado();
            if (!certificado.validarAssinaturaXML(dpecTO.getConteudoArquivo())) {
                dpecTO.addError(DSENMessageConstants.DPEC_DETALHAMENTO_ASSINATURA_ERRO);
            }
        }
        catch (DSGECertificadoException e) {
            dpecTO.addError(DSENMessageConstants.DPEC_DETALHAMENTO_ASSINATURA_ERRO);
        }
        catch (Throwable e) {
            dpecTO.addError(DSENMessageConstants.DPEC_DETALHAMENTO_ASSINATURA_ERRO);
        }
    }

    private void a(DpecTO dpecTO) throws DSGEUtilException {
        List retConsDPEC;
        List infDPECReg;
        List ideDecList = XMLUtil.getTagConteudo((String)dpecTO.getConteudoArquivo(), (String)"ideDec", (boolean)true);
        if (ideDecList != null) {
            String ideDec = (String)ideDecList.get(0);
            dpecTO.setCnpjEmitente((String)XMLUtil.getTagConteudo((String)ideDec, (String)"CNPJ", (boolean)false).get(0));
            dpecTO.setIeEmitente((String)XMLUtil.getTagConteudo((String)ideDec, (String)"IE", (boolean)false).get(0));
            EstadoTO uf = DSENUtilHelper.getInstance().getEstadoTO((String)XMLUtil.getTagConteudo((String)ideDec, (String)"cUF", (boolean)false).get(0));
            dpecTO.setUfEmitente(uf != null ? uf.getSigla() : null);
        }
        if ((infDPECReg = XMLUtil.getTagConteudo((String)dpecTO.getConteudoArquivo(), (String)"infDPECReg", (boolean)true)) != null) {
            dpecTO.setCodigoStatus((String)XMLUtil.getTagConteudo((String)((String)infDPECReg.get(0)), (String)"cStat", (boolean)false).get(0));
            dpecTO.setMotivo((String)XMLUtil.getTagConteudo((String)((String)infDPECReg.get(0)), (String)"xMotivo", (boolean)false).get(0));
            List nRegDPEC = XMLUtil.getTagConteudo((String)((String)infDPECReg.get(0)), (String)"nRegDPEC", (boolean)false);
            if (nRegDPEC != null) {
                dpecTO.setNumeroRegistro((String)nRegDPEC.get(0));
                String dataRegistro = (String)XMLUtil.getTagConteudo((String)((String)infDPECReg.get(0)), (String)"dhRegDPEC", (boolean)false).get(0);
                dpecTO.setDataRegistro(XMLUtil.getXmlDate((String)dataRegistro));
            }
        }
        if ((retConsDPEC = XMLUtil.getTagConteudo((String)dpecTO.getConteudoArquivo(), (String)"retConsDPEC", (boolean)true)) != null) {
            dpecTO.setCodigoStatusProcessamento((String)XMLUtil.getTagConteudo((String)((String)retConsDPEC.get(0)), (String)"cStat", (boolean)false).get(0));
            dpecTO.setMotivoProcessamento((String)XMLUtil.getTagConteudo((String)((String)retConsDPEC.get(0)), (String)"xMotivo", (boolean)false).get(0));
        }
        this.b(dpecTO);
    }

    private void b(DpecTO dpecTO) {
        List listaNotaFiscal = XMLUtil.getTagConteudo((String)dpecTO.getConteudoArquivo(), (String)"resNFe", (boolean)true);
        if (listaNotaFiscal == null) {
            return;
        }
        dpecTO.setListaDpecNotaFiscal(new ArrayList());
        for (String notaFiscal : listaNotaFiscal) {
            DpecNotaFiscalTO dpecNotaFiscalTO = new DpecNotaFiscalTO();
            dpecNotaFiscalTO.setChaveAcesso((String)XMLUtil.getTagConteudo((String)notaFiscal, (String)"chNFe", (boolean)false).get(0));
            List listaCpf = XMLUtil.getTagConteudo((String)notaFiscal, (String)"CPF", (boolean)false);
            if (listaCpf != null) {
                dpecNotaFiscalTO.setDocumentoDestinatario((String)listaCpf.get(0));
            } else {
                List listaCnpj = XMLUtil.getTagConteudo((String)notaFiscal, (String)"CNPJ", (boolean)false);
                if (listaCnpj != null) {
                    dpecNotaFiscalTO.setDocumentoDestinatario((String)listaCnpj.get(0));
                }
            }
            dpecNotaFiscalTO.setUfDestinatario((String)XMLUtil.getTagConteudo((String)notaFiscal, (String)"UF", (boolean)false).get(0));
            dpecNotaFiscalTO.setValorTotal((String)XMLUtil.getTagConteudo((String)notaFiscal, (String)"vNF", (boolean)false).get(0));
            dpecNotaFiscalTO.setValorICMS((String)XMLUtil.getTagConteudo((String)notaFiscal, (String)"vICMS", (boolean)false).get(0));
            dpecNotaFiscalTO.setValorICMSST((String)XMLUtil.getTagConteudo((String)notaFiscal, (String)"vST", (boolean)false).get(0));
            dpecTO.getListaDpecNotaFiscal().add(dpecNotaFiscalTO);
        }
        dpecTO.setQuantidadeNotas(listaNotaFiscal.size());
    }

    private File[] a(String dir) {
        File dirFile = new File(dir);
         dpecFilter = new /* Unavailable Anonymous Inner Class!! */;
        return dirFile.listFiles((FilenameFilter)dpecFilter);
    }

    public int excluirDPEC(List<DpecTO> listaDpecTO) {
        int deletados = 0;
        for (DpecTO dpecTO : listaDpecTO) {
            File f = new File(dpecTO.getPathArquivo());
            try {
                if (!f.exists()) {
                    dpecTO.addError(MessageFormat.format(DSENMessageConstants.ARQUIVO_X_NAO_EXISTE, f.getName()));
                    continue;
                }
                if (f.delete()) {
                    ++deletados;
                    continue;
                }
                dpecTO.addError(MessageFormat.format(DSENMessageConstants.NAO_EXISTE_PERMISSAO_EXCLUIR_ARQUIVO_X, f.getName()));
            }
            catch (SecurityException e) {
                dpecTO.addError(MessageFormat.format(DSENMessageConstants.NAO_EXISTE_PERMISSAO_EXCLUIR_ARQUIVO_X, f.getName()));
            }
        }
        return deletados;
    }

    public List<NotaFiscalTO> pesquisarNotaFiscalDPECNotaFiscal(List<DpecNotaFiscalTO> listaDpecNotaFiscalTO, List<ProblemaDpecDanfeTO> problemas) throws DSENBusinessException {
        NotaFiscalTO notaFiscalTO = null;
        ChaveAcessoTO chaveAcessoTO = null;
        ArrayList<NotaFiscalTO> listaNotaFiscalTO = new ArrayList<NotaFiscalTO>();
        if (listaDpecNotaFiscalTO == null || listaDpecNotaFiscalTO.isEmpty()) {
            return listaNotaFiscalTO;
        }
        EmitenteTO emitenteLogado = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        for (DpecNotaFiscalTO dpecNotaFiscalTO : listaDpecNotaFiscalTO) {
            notaFiscalTO = new NotaFiscalTO();
            try {
                ProblemaDpecDanfeTO problema;
                if (dpecNotaFiscalTO.getChaveAcesso() == null) continue;
                NotaFiscalBusiness notaFiscalBusiness = new NotaFiscalBusiness();
                chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)dpecNotaFiscalTO.getChaveAcesso());
                notaFiscalTO = notaFiscalBusiness.pesquisarNotaFiscalPorChaveAcesso(chaveAcessoTO, emitenteLogado);
                if (notaFiscalTO == null) {
                    problema = new ProblemaDpecDanfeTO();
                    problema.setChaveAcesso(dpecNotaFiscalTO.getChaveAcesso());
                    problema.setErro(DSENMessageConstants.MSG_DPEC_GERAR_DANFE_SEM_CORRESPONDENCIA_BD);
                    problemas.add(problema);
                } else {
                    if (!TipoEmissaoEnum.CONTINGENCIA_DPEC.equals((Object)notaFiscalTO.getTipoEmissao())) {
                        problema = new ProblemaDpecDanfeTO();
                        problema.setChaveAcesso(dpecNotaFiscalTO.getChaveAcesso());
                        problema.setErro(DSENMessageConstants.MSG_DPEC_GERAR_DANFE_NOTA_FORMA_EMISSAO_INCORRETA);
                        problemas.add(problema);
                    }
                    if (!SituacaoNFeEnum.ASSINADA.equals((Object)notaFiscalTO.getSituacao()) && !SituacaoNFeEnum.AUTORIZADA.equals((Object)notaFiscalTO.getSituacao())) {
                        problema = new ProblemaDpecDanfeTO();
                        problema.setChaveAcesso(dpecNotaFiscalTO.getChaveAcesso());
                        problema.setErro(DSENMessageConstants.MSG_DPEC_GERAR_DANFE_NOTA_SITUACAO_INCORRETA);
                        problemas.add(problema);
                    }
                }
                if (notaFiscalTO == null) continue;
                listaNotaFiscalTO.add(notaFiscalTO);
            }
            catch (Throwable e) {
                throw new DSENBusinessException(e, e.getMessage());
            }
        }
        return listaNotaFiscalTO;
    }

    public void transmitirDPEC(List<DpecTO> listaDpecTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        ArrayList<DpecTO> listaDpecNaoProcessados = new ArrayList<DpecTO>(listaDpecTO);
        try {
            String sceCabecMsg = DocumentoUtil.criarCabecMsgEnvioDpecDocument((String)DSENProperties.getInstance().getVersaoSchemaDpec());
            for (DpecTO dpecTO : listaDpecTO) {
                String retDpecXML = DpecBusiness.a().servico(sceCabecMsg, dpecTO.getConteudoArquivo(), null, ServicoSefazEnum.EnvioDpec, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey());
                WSStatusRetorno retDpecRetorno = DocumentoUtil.validarRetDpecDocument((String)retDpecXML, (DpecTO)dpecTO);
                switch (2.a[retDpecRetorno.ordinal()]) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        String urlEnvioDpec = DSENProperties.getInstance().getDpecUrlEnvio();
                        ErroXmlResposta erroXmlResposta = new ErroXmlResposta(ServicoSefazEnum.EnvioDpec, urlEnvioDpec, dpecTO.getConteudoArquivo(), retDpecXML, DSENMessageConstants.MSG_WS_DPEC);
                        Notificador.getInstance().notificar((Object)new Object[]{erroXmlResposta, dpecTO}, new EnumItf[]{GrupoNotificacaoEnum.ERRO_RESPOSTA_DPEC_ENVIO});
                        break;
                    }
                    default: {
                        this.c(dpecTO);
                    }
                }
                listaDpecNaoProcessados.remove((Object)dpecTO);
                Notificador.getInstance().notificar((Object)dpecTO, new EnumItf[]{GrupoNotificacaoEnum.ENVIO_DPEC});
            }
        }
        catch (DSGEConnectionClientException e) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_CLIENT, DSGEMessageConstants.MSG_WS_DPEC), listaDpecNaoProcessados, GrupoNotificacaoEnum.ENVIO_DPEC_ERRO);
            this.a(listaDpecNaoProcessados, certificadoTO);
        }
        catch (DSGEConnectionServerException e) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_SERVER, DSGEMessageConstants.MSG_WS_DPEC), listaDpecNaoProcessados, GrupoNotificacaoEnum.ENVIO_DPEC_ERRO);
            this.a(listaDpecNaoProcessados, certificadoTO);
        }
        catch (DSGETimeoutException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_CONEXAO_TIMEOUT, listaDpecNaoProcessados, GrupoNotificacaoEnum.ENVIO_DPEC_ERRO);
            this.a(listaDpecNaoProcessados, certificadoTO);
        }
        catch (DSGESocketException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_SOCKET, listaDpecNaoProcessados, GrupoNotificacaoEnum.ENVIO_DPEC_ERRO);
            this.a(listaDpecNaoProcessados, certificadoTO);
        }
        catch (DSGEProxyException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_PROXY, listaDpecNaoProcessados, GrupoNotificacaoEnum.ERRO_FATAL);
        }
        catch (DSENBusinessException e) {
            this.a((Object)e, listaDpecNaoProcessados, GrupoNotificacaoEnum.EXCEPTION);
        }
        catch (DSGEWebServiceException e) {
            this.a((Object)e, listaDpecNaoProcessados, GrupoNotificacaoEnum.EXCEPTION);
        }
        catch (Throwable e) {
            this.a((Object)new DSENBusinessException(e, e.getMessage()), listaDpecNaoProcessados, GrupoNotificacaoEnum.EXCEPTION);
        }
    }

    private void c(DpecTO dpecTO) throws DSENBusinessException {
        try {
            ParametroTO parametroTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_AUTORIZADO_DIR, ParametroTO.class);
            String nomeArquivo = this.a(dpecTO, parametroTO);
            if (!IOHelper.verifyFile((String)parametroTO.getValor(), (boolean)true)) {
                dpecTO.setMotivo(MessageFormat.format(DSENMessageConstants.DPEC_GERACAO_ERRO_PERMISSAO, dpecTO.getNomeArquivo()));
            } else if (!ExportacaoHelper.exportar((String)nomeArquivo, (String)dpecTO.getConteudoArquivo())) {
                dpecTO.setMotivo(DSENMessageConstants.DPEC_GERACAO_CANCELADA);
                return;
            }
            if (!IOHelper.delete((String)dpecTO.getPathArquivo())) {
                dpecTO.setMotivo(MessageFormat.format(DSENMessageConstants.DPEC_GERACAO_ERRO_PERMISSAO, dpecTO.getNomeArquivo()));
            }
            dpecTO.setNomeArquivo(new File(nomeArquivo).getName());
            dpecTO.setPathArquivo(nomeArquivo);
        }
        catch (CancelarExportacaoException e) {
            dpecTO.setMotivo(DSENMessageConstants.DPEC_GERACAO_CANCELADA);
        }
    }

    private void a(List<DpecTO> listaDpecTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.transmitirDPEC(listaDpecTO, certificadoTO);
        } else {
            for (DpecTO dpecTO : listaDpecTO) {
                dpecTO.setMotivo(DSENMessageConstants.DPEC_TRANSMISSAO_CANCELADA);
            }
        }
    }

    private void a(DpecTO dpecTO, TipoConsultaDpecEnum tipoConsultaDpecEnum, String chaveConsulta, CertificadoTO certificadoTO) throws DSENBusinessException {
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.consultarDpec(tipoConsultaDpecEnum, chaveConsulta, certificadoTO);
        } else {
            dpecTO.setMotivo(DSENMessageConstants.DPEC_CONSULTA_CANCELADA);
        }
    }

    private void a(Object mensagemErro, List<DpecTO> listaDpecTO, GrupoNotificacaoEnum grupoNotificacaoEnum) {
        Notificador.getInstance().notificar((Object)new Object[]{mensagemErro, listaDpecTO, grupoNotificacaoEnum}, new EnumItf[]{grupoNotificacaoEnum});
    }

    private void a(Object mensagemErro, DpecTO dpecTO, GrupoNotificacaoEnum grupoNotificacaoEnum) {
        Notificador.getInstance().notificar((Object)new Object[]{mensagemErro, dpecTO, grupoNotificacaoEnum}, new EnumItf[]{grupoNotificacaoEnum});
    }

    public ImportacaoResultadoTO importarDPEC(String pathArquivo) throws DSENBusinessException {
        List listImportacaoErroTO = new ArrayList<ImportacaoErroTO>();
        String idDpec = "";
        try {
            List nRegDPEC;
            String conteudoArquivo = IOHelper.readFileSemBom((String)pathArquivo);
            if (XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"retConsDPEC", (boolean)true) != null) {
                listImportacaoErroTO = DSENSchemaValidator.getInstance().validate(DSENSchemaTypeEnum.retConsDPEC, DSENProperties.getInstance().getVersaoSchemaDpec(), conteudoArquivo);
            } else if (XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"retDPEC", (boolean)true) != null) {
                listImportacaoErroTO = DSENSchemaValidator.getInstance().validate(DSENSchemaTypeEnum.retDPEC, DSENProperties.getInstance().getVersaoSchemaDpec(), conteudoArquivo);
            } else {
                ImportacaoErroTO erro = new ImportacaoErroTO("Arquivo", MessageFormat.format(DSENMessageConstants.DPEC_IMPORTACAO_ERRO, pathArquivo), ImportacaoErroTO.Status.ERROR);
                listImportacaoErroTO.add(erro);
            }
            List infDPECReg = XMLUtil.getTagConteudo((String)conteudoArquivo, (String)"infDPECReg", (boolean)true);
            if (infDPECReg != null && (nRegDPEC = XMLUtil.getTagConteudo((String)((String)infDPECReg.get(0)), (String)"nRegDPEC", (boolean)false)) != null && !nRegDPEC.isEmpty()) {
                idDpec = (String)nRegDPEC.get(0);
            }
            if (listImportacaoErroTO != null && !listImportacaoErroTO.isEmpty()) {
                return this.a(idDpec, pathArquivo, SituacaoRegistroEnum.REJEITADO, listImportacaoErroTO, 1, 0);
            }
            listImportacaoErroTO = new ArrayList();
            ParametroTO parametroDpecAutorizadoDir = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_AUTORIZADO_DIR, ParametroTO.class);
            if (!IOHelper.verifyFile((String)parametroDpecAutorizadoDir.getValor(), (boolean)true)) {
                ImportacaoErroTO importacaoErroTO = new ImportacaoErroTO("Arquivo", MessageFormat.format(DSENMessageConstants.DPEC_GERACAO_ERRO_PERMISSAO, parametroDpecAutorizadoDir.getValor()), ImportacaoErroTO.Status.ERROR);
                listImportacaoErroTO.add(importacaoErroTO);
                return this.a(idDpec, pathArquivo, SituacaoRegistroEnum.REJEITADO, listImportacaoErroTO, 1, 0);
            }
            String nomeArquivo = parametroDpecAutorizadoDir.getValor() + File.separator + new File(pathArquivo).getName();
            if (!IOHelper.verifyFile((String)nomeArquivo, (boolean)false)) {
                ImportacaoErroTO importacaoErroTO = new ImportacaoErroTO("Arquivo", MessageFormat.format(DSENMessageConstants.DPEC_GERACAO_ERRO_PERMISSAO, parametroDpecAutorizadoDir.getValor()), ImportacaoErroTO.Status.ERROR);
                listImportacaoErroTO.add(importacaoErroTO);
                return this.a(idDpec, pathArquivo, SituacaoRegistroEnum.REJEITADO, listImportacaoErroTO, 1, 0);
            }
            if (!ExportacaoHelper.exportar((String)nomeArquivo, (String)conteudoArquivo)) {
                ImportacaoErroTO importacaoErroTO = new ImportacaoErroTO("Arquivo", DSENMessageConstants.DPEC_GERACAO_CANCELADA, ImportacaoErroTO.Status.ERROR);
                listImportacaoErroTO.add(importacaoErroTO);
                return this.a(idDpec, pathArquivo, SituacaoRegistroEnum.REJEITADO, listImportacaoErroTO, 1, 0);
            }
            return this.a(idDpec, pathArquivo, SituacaoRegistroEnum.INSERIDO, listImportacaoErroTO, 0, 1);
        }
        catch (CancelarExportacaoException e) {
            ImportacaoErroTO importacaoErroTO = new ImportacaoErroTO("Arquivo", DSENMessageConstants.DPEC_GERACAO_CANCELADA, ImportacaoErroTO.Status.ERROR);
            listImportacaoErroTO.add((ImportacaoErroTO)importacaoErroTO);
            return this.a(idDpec, pathArquivo, SituacaoRegistroEnum.REJEITADO, listImportacaoErroTO, 1, 0);
        }
        catch (DSGECommonException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (Throwable t) {
            t.printStackTrace();
            throw new DSENBusinessException(t, t.getMessage());
        }
    }

    private ImportacaoResultadoTO a(String idRegistro, String nomeArquivo, SituacaoRegistroEnum situacaoRegistroEnum, List<ImportacaoErroTO> listImportacaoErroTO, int qtdeInsucesso, int qtdeSucesso) {
        ImportacaoResultadoTO importacaoResultadoTO = new ImportacaoResultadoTO();
        ImportacaoRegistroTO importacaoRegistroTO = new ImportacaoRegistroTO();
        importacaoRegistroTO.setIdRegistro(idRegistro);
        importacaoRegistroTO.setNomeArquivo(nomeArquivo);
        importacaoRegistroTO.setSituacaoRegistro(situacaoRegistroEnum);
        importacaoRegistroTO.setImportacaoErros(listImportacaoErroTO);
        ArrayList<ImportacaoRegistroTO> listImportacaoRegistroTO = new ArrayList<ImportacaoRegistroTO>();
        listImportacaoRegistroTO.add(importacaoRegistroTO);
        importacaoResultadoTO.setInsucesso(qtdeInsucesso);
        importacaoResultadoTO.setSucesso(qtdeSucesso);
        importacaoResultadoTO.setImportacaoRegistros(listImportacaoRegistroTO);
        return importacaoResultadoTO;
    }

    public void consultarDpec(TipoConsultaDpecEnum tipoConsultaDpecEnum, String chaveConsulta, CertificadoTO certificadoTO) throws DSENBusinessException {
        DpecTO dpecTO = new DpecTO();
        try {
            String sceCabecMsg = DocumentoUtil.criarCabecMsgConsultaDpecDocument((String)DSENProperties.getInstance().getVersaoSchemaDpec());
            String sceDadosMsg = DocumentoUtil.criarConsDPECDocument((TipoConsultaDpecEnum)tipoConsultaDpecEnum, (String)chaveConsulta);
            String retConsDpecXML = DpecBusiness.a().servico(sceCabecMsg, sceDadosMsg, null, ServicoSefazEnum.ConsultaDpec, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey());
            WSStatusRetorno retDpecRetorno = DocumentoUtil.validarRetConsDpecDocument((String)retConsDpecXML, (DpecTO)dpecTO);
            if (WSStatusRetorno.XML_INVALIDO.equals((Object)retDpecRetorno)) {
                String urlConsultaDpec = DSENProperties.getInstance().getDpecUrlConsulta();
                ErroXmlResposta erroXmlResposta = new ErroXmlResposta(ServicoSefazEnum.ConsultaDpec, urlConsultaDpec, sceDadosMsg, retConsDpecXML, DSENMessageConstants.MSG_WS_DPEC);
                Notificador.getInstance().notificar((Object)new Object[]{erroXmlResposta, dpecTO}, new EnumItf[]{GrupoNotificacaoEnum.ERRO_RESPOSTA_DPEC_CONSULTA});
                return;
            }
            dpecTO.setConteudoArquivo(retConsDpecXML);
            this.a(dpecTO);
            dpecTO.setNomeArquivo(this.a(dpecTO.getNumeroRegistro()));
            Notificador.getInstance().notificar((Object)dpecTO, new EnumItf[]{GrupoNotificacaoEnum.CONSULTA_DPEC});
        }
        catch (DSGEConnectionClientException e) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_CLIENT, DSGEMessageConstants.MSG_WS_DPEC), dpecTO, GrupoNotificacaoEnum.CONSULTA_DPEC_ERRO);
            this.a(dpecTO, tipoConsultaDpecEnum, chaveConsulta, certificadoTO);
        }
        catch (DSGEConnectionServerException e) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_SERVER, DSGEMessageConstants.MSG_WS_DPEC), dpecTO, GrupoNotificacaoEnum.CONSULTA_DPEC_ERRO);
            this.a(dpecTO, tipoConsultaDpecEnum, chaveConsulta, certificadoTO);
        }
        catch (DSGETimeoutException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_CONEXAO_TIMEOUT, dpecTO, GrupoNotificacaoEnum.CONSULTA_DPEC_ERRO);
            this.a(dpecTO, tipoConsultaDpecEnum, chaveConsulta, certificadoTO);
        }
        catch (DSGESocketException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_SOCKET, dpecTO, GrupoNotificacaoEnum.CONSULTA_DPEC_ERRO);
            this.a(dpecTO, tipoConsultaDpecEnum, chaveConsulta, certificadoTO);
        }
        catch (DSGEProxyException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_PROXY, dpecTO, GrupoNotificacaoEnum.ERRO_FATAL);
        }
        catch (DSGEWebServiceException e) {
            this.a((Object)e, dpecTO, GrupoNotificacaoEnum.EXCEPTION);
        }
        catch (Throwable e) {
            e.printStackTrace();
            this.a((Object)new DSENBusinessException(e, e.getMessage()), dpecTO, GrupoNotificacaoEnum.EXCEPTION);
        }
    }

    public void gravarDpec(DpecTO dpecTO) throws DSENBusinessException {
        try {
            if (ExportacaoHelper.exportar((String)dpecTO.getPathArquivo(), (String)dpecTO.getConteudoArquivo())) {
                String mensagem = MessageFormat.format(DSENMessageConstants.DPEC_SALVAR_SUCESSO, dpecTO.getPathArquivo());
                Notificador.getInstance().notificar((Object)mensagem, new EnumItf[]{GrupoNotificacaoEnum.DPEC_SALVAR});
            } else {
                Notificador.getInstance().notificar((Object)DSENMessageConstants.DPEC_SALVAR_ERRO, new EnumItf[]{GrupoNotificacaoEnum.DPEC_SALVAR});
            }
        }
        catch (CancelarExportacaoException e) {
            Notificador.getInstance().notificar((Object)DSENMessageConstants.DPEC_SALVAR_CANCELADA, new EnumItf[]{GrupoNotificacaoEnum.DPEC_SALVAR});
        }
    }

    static {
    }
}

