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
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.WSBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.business.util.ConsultaStatusServicoHelper
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.business.util.ScanHelper
 *  br.gov.sp.fazenda.dsen.model.dao.InutilizacaoDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException
 *  org.apache.commons.logging.Log
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.WSBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.business.util.ConsultaStatusServicoHelper;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.business.util.ScanHelper;
import br.gov.sp.fazenda.dsen.model.dao.InutilizacaoDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class InutilizacaoBusiness {
    private NotaFiscalBusiness a;
    private WSBusiness a;
    private Log a;
    private InutilizacaoDAO a = new InutilizacaoDAO();

    public InutilizacaoTO validarFiltroPesquisarFaixasParaInutilizar(InutilizacaoTO pesquisaInutilizacaoTO) {
        int numeroFinal;
        int numeroInicial = !StringHelper.isBlankOrNull((Object)pesquisaInutilizacaoTO.getNumeroInicial()) ? Integer.parseInt(pesquisaInutilizacaoTO.getNumeroInicial()) : -1;
        int n = numeroFinal = !StringHelper.isBlankOrNull((Object)pesquisaInutilizacaoTO.getNumeroFinal()) ? Integer.parseInt(pesquisaInutilizacaoTO.getNumeroFinal()) : -1;
        if (numeroFinal != -1 && numeroInicial != -1 && numeroFinal < numeroInicial) {
            pesquisaInutilizacaoTO.addError(DSENMessageConstants.MSG_FILTRO_INUTILIZACAO_FIM_MENOR_INICIO);
        }
        return pesquisaInutilizacaoTO;
    }

    public HashMap<String, List<InutilizacaoTO>> obterFaixasParaInutilizar(InutilizacaoTO pesquisaInutilizacaoTO) throws DSENBusinessException {
        HashMap inutilizadasMap = new HashMap();
        ArrayList<SituacaoNFeEnum> situacoes = new ArrayList<SituacaoNFeEnum>();
        situacoes.add(SituacaoNFeEnum.CANCELADA);
        situacoes.add(SituacaoNFeEnum.AUTORIZADA);
        situacoes.add(SituacaoNFeEnum.DENEGADA);
        situacoes.add(SituacaoNFeEnum.CANCELADA_EVENTO);
        List seriesNumerosList = this.a().getSerieNumeroAnoPorSituacoes(pesquisaInutilizacaoTO.getEmitenteTO().getIdEmitente(), pesquisaInutilizacaoTO.getSerie(), pesquisaInutilizacaoTO.getNumeroInicial(), "", situacoes);
        int numeroInicial = !StringHelper.isBlankOrNull((Object)pesquisaInutilizacaoTO.getNumeroInicial()) ? Integer.parseInt(pesquisaInutilizacaoTO.getNumeroInicial()) : 1;
        LinkedHashMap<String, List<InutilizacaoTO>> seriesInutilizacoesMap = new LinkedHashMap<String, List<InutilizacaoTO>>();
        String serieAtual = "";
        ArrayList listaInutilizacaoAtual = new ArrayList();
        int numeroInicialAtual = -1;
        int primeiroNumeroUtilizadoSerie = -1;
        boolean terminouSerie = false;
        for (Object[] obj : seriesNumerosList) {
            String serie = obj[0].toString();
            String numero = obj[1].toString();
            String ano = obj[2].toString();
            if (!serie.equals(serieAtual)) {
                listaInutilizacaoAtual = new ArrayList();
                seriesInutilizacoesMap.put(serie, listaInutilizacaoAtual);
                numeroInicialAtual = numeroInicial;
                serieAtual = serie;
                primeiroNumeroUtilizadoSerie = Integer.parseInt(numero);
                terminouSerie = false;
            } else {
                if (terminouSerie) continue;
                primeiroNumeroUtilizadoSerie = -1;
            }
            int numeroFinalAtual = Integer.parseInt(numero) - 1;
            if (!StringHelper.isBlankOrNull((Object)pesquisaInutilizacaoTO.getNumeroFinal()) && Integer.parseInt(pesquisaInutilizacaoTO.getNumeroFinal()) < primeiroNumeroUtilizadoSerie) {
                numeroInicialAtual = numeroInicial;
                numeroFinalAtual = Integer.parseInt(pesquisaInutilizacaoTO.getNumeroFinal());
            }
            if (!StringHelper.isBlankOrNull((Object)pesquisaInutilizacaoTO.getNumeroFinal()) && numeroFinalAtual > Integer.parseInt(pesquisaInutilizacaoTO.getNumeroFinal())) {
                numeroFinalAtual = Integer.parseInt(pesquisaInutilizacaoTO.getNumeroFinal());
                terminouSerie = true;
            }
            if (numeroFinalAtual >= numeroInicialAtual) {
                InutilizacaoTO inutTO = new InutilizacaoTO();
                inutTO.setSerie(serie);
                inutTO.setNumeroInicial(StringHelper.completaComZerosAEsquerda((String)Integer.toString(numeroInicialAtual), (int)9));
                inutTO.setNumeroFinal(StringHelper.completaComZerosAEsquerda((String)Integer.toString(numeroFinalAtual), (int)9));
                inutTO.setAno(ano);
                inutTO.setEmitenteTO(pesquisaInutilizacaoTO.getEmitenteTO());
                ArrayList inutilizadasList = (ArrayList)inutilizadasMap.get(serie);
                if (inutilizadasList == null) {
                    InutilizacaoTO pesquisaInutilizacaoSerieTO = new InutilizacaoTO();
                    pesquisaInutilizacaoSerieTO.setSerie(serie);
                    pesquisaInutilizacaoSerieTO.setEmitenteTO(pesquisaInutilizacaoTO.getEmitenteTO());
                    pesquisaInutilizacaoSerieTO.setNumeroInicial(pesquisaInutilizacaoTO.getNumeroInicial());
                    pesquisaInutilizacaoSerieTO.setNumeroFinal(pesquisaInutilizacaoTO.getNumeroFinal());
                    inutilizadasList = this.obterFaixasInutilizadas(pesquisaInutilizacaoSerieTO);
                    if (inutilizadasList == null) {
                        inutilizadasList = new ArrayList();
                    }
                    inutilizadasMap.put(serie, inutilizadasList);
                }
                listaInutilizacaoAtual.addAll(this.a(inutTO, (List)inutilizadasList));
            }
            numeroInicialAtual = Integer.parseInt(numero) + 1;
        }
        return seriesInutilizacoesMap;
    }

    private Collection<? extends InutilizacaoTO> a(InutilizacaoTO novaInutilizacaoTO, List<InutilizacaoTO> inutilizadasList) {
        ArrayList<InutilizacaoTO> resultList = new ArrayList<InutilizacaoTO>();
        if (inutilizadasList == null || inutilizadasList.size() == 0) {
            resultList.add(novaInutilizacaoTO);
            return resultList;
        }
        int indicePrimeiraColisao = 0;
        for (int i = 0; i < inutilizadasList.size(); ++i) {
            InutilizacaoTO proximaInutilizada;
            int inicio;
            int fim;
            InutilizacaoTO inutilizadaTO = inutilizadasList.get(i);
            int numeroInicialInutilizada = Integer.parseInt(inutilizadaTO.getNumeroInicial());
            int numeroFinalInutilizada = Integer.parseInt(inutilizadaTO.getNumeroFinal());
            int numeroInicialNova = Integer.parseInt(novaInutilizacaoTO.getNumeroInicial());
            int numeroFinalNova = Integer.parseInt(novaInutilizacaoTO.getNumeroFinal());
            if (numeroFinalInutilizada < numeroInicialNova || numeroInicialInutilizada > numeroFinalNova) {
                if (++indicePrimeiraColisao != inutilizadasList.size()) continue;
                resultList.add(novaInutilizacaoTO);
            }
            if (numeroInicialInutilizada <= numeroInicialNova && numeroFinalInutilizada >= numeroFinalNova) {
                return resultList;
            }
            if (numeroInicialInutilizada < numeroInicialNova && numeroFinalInutilizada >= numeroInicialNova) {
                inicio = numeroFinalInutilizada + 1;
                if (i < inutilizadasList.size() - 1) {
                    proximaInutilizada = inutilizadasList.get(i + 1);
                    fim = Integer.parseInt(proximaInutilizada.getNumeroInicial()) - 1;
                    if (fim > numeroFinalNova) {
                        fim = numeroFinalNova;
                    }
                } else {
                    fim = numeroFinalNova;
                }
                if (fim < inicio) continue;
                resultList.add(this.a(novaInutilizacaoTO.getSerie(), inicio, fim, novaInutilizacaoTO.getAno(), novaInutilizacaoTO.getEmitenteTO()));
                continue;
            }
            if (numeroInicialInutilizada >= numeroInicialNova && numeroFinalInutilizada <= numeroFinalNova) {
                if (i == indicePrimeiraColisao && (fim = numeroInicialInutilizada - 1) >= (inicio = numeroInicialNova)) {
                    resultList.add(this.a(novaInutilizacaoTO.getSerie(), inicio, fim, novaInutilizacaoTO.getAno(), novaInutilizacaoTO.getEmitenteTO()));
                }
                inicio = numeroFinalInutilizada + 1;
                if (i < inutilizadasList.size() - 1) {
                    proximaInutilizada = inutilizadasList.get(i + 1);
                    fim = Integer.parseInt(proximaInutilizada.getNumeroInicial()) - 1;
                    if (fim > numeroFinalNova) {
                        fim = numeroFinalNova;
                    }
                } else {
                    fim = numeroFinalNova;
                }
                if (fim < inicio) continue;
                resultList.add(this.a(novaInutilizacaoTO.getSerie(), inicio, fim, novaInutilizacaoTO.getAno(), novaInutilizacaoTO.getEmitenteTO()));
                continue;
            }
            if (numeroInicialInutilizada < numeroInicialNova || numeroFinalInutilizada <= numeroFinalNova || i != indicePrimeiraColisao || (fim = numeroInicialInutilizada - 1) < (inicio = numeroInicialNova)) continue;
            resultList.add(this.a(novaInutilizacaoTO.getSerie(), inicio, fim, novaInutilizacaoTO.getAno(), novaInutilizacaoTO.getEmitenteTO()));
        }
        return resultList;
    }

    private InutilizacaoTO a(String serie, int inicio, int fim, String ano, EmitenteTO emitenteTO) {
        InutilizacaoTO inutTO = new InutilizacaoTO();
        inutTO.setSerie(serie);
        inutTO.setNumeroInicial(StringHelper.completaComZerosAEsquerda((String)Integer.toString(inicio), (int)9));
        inutTO.setNumeroFinal(StringHelper.completaComZerosAEsquerda((String)Integer.toString(fim), (int)9));
        inutTO.setAno(ano);
        inutTO.setEmitenteTO(emitenteTO);
        return inutTO;
    }

    public List<InutilizacaoTO> assinarFaixasParaInutilizar(List<InutilizacaoTO> listaInutilizacaoTO, EmitenteTO emitenteTO, CertificadoTO certificadoTO, String justificativa) throws DSENBusinessException {
        for (InutilizacaoTO inutilizacaoTO : listaInutilizacaoTO) {
            try {
                EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(inutilizacaoTO.getEmitenteTO().getUf());
                inutilizacaoTO.setCodigoUf(estadoTO.getCodigo());
                String xmlString = DocumentoUtil.criarDocumentoXmlInutilizacaoFaixasNFe((InutilizacaoTO)inutilizacaoTO, (String)justificativa);
                inutilizacaoTO.setDocXmlString(xmlString);
                Certificado certificado = new Certificado();
                String referenceURI = DocumentoUtil.criarIdDocumentoInutilizacao((InutilizacaoTO)inutilizacaoTO);
                String xmlAssinado = certificado.assinarXML(certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey(), referenceURI, xmlString, inutilizacaoTO.getEmitenteTO().getNrDocumento());
                inutilizacaoTO.setDocXmlString(xmlAssinado);
            }
            catch (Throwable e) {
                this.a.error((Object)e);
                throw new DSENBusinessException(e, e.getMessage());
            }
        }
        return listaInutilizacaoTO;
    }

    private InutilizacaoDAO a() throws DSENBusinessException {
        if (this.a == null) {
            this.a = new InutilizacaoDAO();
        }
        return this.a;
    }

    public List<InutilizacaoTO> obterFaixasInutilizadas(InutilizacaoTO inutilizacaoTO) throws DSENBusinessException {
        try {
            List listaInutilizacaoEntity = this.a().pesquisarFaixasInutilizadas(DSENBusinessConverter.getInutilizacaoEntity((InutilizacaoTO)inutilizacaoTO));
            if (listaInutilizacaoEntity == null) {
                return null;
            }
            ArrayList<InutilizacaoTO> listaInutilizacaoTO = new ArrayList<InutilizacaoTO>();
            for (InutilizacaoEntity inutilizacaoEntity : listaInutilizacaoEntity) {
                listaInutilizacaoTO.add(DSENBusinessConverter.getInutilizacaoTO((InutilizacaoEntity)inutilizacaoEntity));
            }
            return listaInutilizacaoTO;
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    @DSGETransaction
    public InutilizacaoTO inutilizarFaixa(EstadoTO emitenteEstadoTO, EstadoTO estadoTO, InutilizacaoTO inutilizacaoTO, CertificadoTO certificadoTO, boolean isSefaz) throws Throwable {
        String docXML = inutilizacaoTO.getDocXmlString();
        String inutilizacaoRetorno = this.a().servico(DocumentoUtil.criarCabecalhoMensagem((ServicoSefazEnum)ServicoSefazEnum.Inutilizacao, (String)emitenteEstadoTO.getCodigo(), (String)DSENProperties.getInstance().getVersaoSchemaInutilizacao()), docXML, estadoTO, ServicoSefazEnum.Inutilizacao, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey());
        WSStatusRetorno statusRetorno = DocumentoUtil.validarXmlRetornoInutilizacao((String)inutilizacaoRetorno, (InutilizacaoTO)inutilizacaoTO);
        switch (1.a[statusRetorno.ordinal()]) {
            case 1: {
                inutilizacaoTO.addError(MessageFormat.format(DSENMessageConstants.FAIXA_NAO_INUTILIZADA_REJEICAO, inutilizacaoTO.getCErro(), inutilizacaoTO.getMensagemErro()));
                break;
            }
            case 2: {
                String urlSefaz = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.Inutilizacao);
                Object[] arrobject = new Object[2];
                arrobject[0] = new ErroXmlResposta(ServicoSefazEnum.Inutilizacao, urlSefaz, docXML, inutilizacaoRetorno, isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB);
                arrobject[1] = inutilizacaoTO;
                EnumItf[] arrenumItf = new EnumItf[1];
                arrenumItf[0] = isSefaz ? br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_INUTILIZACAO : br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_INUTILIZACAO;
                Notificador.getInstance().notificar((Object)arrobject, arrenumItf);
                Object[] arrobject2 = new Object[1];
                arrobject2[0] = isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB;
                inutilizacaoTO.addError(MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, arrobject2));
                break;
            }
            default: {
                InutilizacaoEntity inutilizacaoEntity = DSENBusinessConverter.getInutilizacaoEntity((InutilizacaoTO)inutilizacaoTO);
                this.a().insert((Serializable)inutilizacaoEntity);
                inutilizacaoTO = DSENBusinessConverter.getInutilizacaoTO((InutilizacaoEntity)inutilizacaoEntity);
                this.a().excluirNotasFiscaisInutilizadas(inutilizacaoTO);
                inutilizacaoTO.addMessage(DSENMessageConstants.FAIXA_INUTILIZADA_COM_SUCESSO);
            }
        }
        return inutilizacaoTO;
    }

    public void inutilizarFaixas(EmitenteTO emitenteTO, List<InutilizacaoTO> listaInutilizacaoTO, CertificadoTO certTO) throws DSENBusinessException {
        try {
            EstadoTO emitenteEstadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteTO.getUf());
            if (DSENUtilHelper.getInstance().isEstadoEspecifico(emitenteEstadoTO)) {
                Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.UF_NAO_HABILITADA, emitenteEstadoTO.getSigla()), new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.UF_NAO_HABILITADA});
                return;
            }
            ScanHelper scanHelper = new ScanHelper();
            Map inutMap = scanHelper.agruparInutilizacaoPorSerie(listaInutilizacaoTO);
            List inutSefazList = (List)inutMap.get((Object)TipoEmissaoEnum.NORMAL);
            List inutReceitaList = (List)inutMap.get((Object)TipoEmissaoEnum.CONTINGENCIA_SCAN);
            if (inutSefazList != null && !inutSefazList.isEmpty()) {
                this.inutilizarFaixas(emitenteTO, inutSefazList, certTO, true, TipoEmissaoEnum.NORMAL);
            }
            if (inutReceitaList != null && !inutReceitaList.isEmpty()) {
                this.inutilizarFaixas(emitenteTO, inutReceitaList, certTO, false, TipoEmissaoEnum.CONTINGENCIA_SCAN);
            }
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public List<InutilizacaoTO> inutilizarFaixas(EmitenteTO emitenteTO, List<InutilizacaoTO> listaInutilizacaoTO, CertificadoTO certificadoTO, boolean isSefaz, TipoEmissaoEnum tipoEmissaoEnum) {
        EstadoTO emitenteEstadoTO = null;
        String wsReceptor = isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB;
        br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum notificacaoErroEnum = isSefaz ? br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.INUTILIZACAO_ERRO_SEFAZ : br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.INUTILIZACAO_ERRO_SCAN;
        ArrayList<InutilizacaoTO> naoEnviadas = new ArrayList<InutilizacaoTO>(listaInutilizacaoTO.size());
        naoEnviadas.addAll(listaInutilizacaoTO);
        try {
            emitenteEstadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteTO.getUf());
            ScanHelper scanHelper = new ScanHelper();
            EstadoTO estadoTO = scanHelper.getEstadoTO(emitenteEstadoTO, isSefaz, tipoEmissaoEnum);
            ConsultaStatusServicoHelper consultaStatusServicoHelper = new ConsultaStatusServicoHelper();
            boolean statusServicoOK = consultaStatusServicoHelper.consultarStatusServico(emitenteEstadoTO, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey(), ServicoSefazEnum.Inutilizacao, true, tipoEmissaoEnum);
            if (statusServicoOK) {
                for (InutilizacaoTO inutilizacaoTO : listaInutilizacaoTO) {
                    InutilizacaoTO inutilizacaoTOAtualizado = this.inutilizarFaixa(emitenteEstadoTO, estadoTO, inutilizacaoTO, certificadoTO, isSefaz);
                    naoEnviadas.remove((Object)inutilizacaoTO);
                    Notificador.getInstance().notificar((Object)inutilizacaoTOAtualizado, new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.INUTILIZACAO});
                }
            }
        }
        catch (DSGEConnectionClientException e) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_CLIENT, wsReceptor), naoEnviadas, notificacaoErroEnum);
            this.a(emitenteTO, naoEnviadas, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
        catch (DSGEConnectionServerException e) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_SERVER, wsReceptor), naoEnviadas, notificacaoErroEnum);
            this.a(emitenteTO, naoEnviadas, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
        catch (DSGETimeoutException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_CONEXAO_TIMEOUT, naoEnviadas, notificacaoErroEnum);
            this.a(emitenteTO, naoEnviadas, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
        catch (DSGESocketException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_SOCKET, naoEnviadas, notificacaoErroEnum);
            this.a(emitenteTO, naoEnviadas, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
        catch (DSGEProxyException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_PROXY, naoEnviadas, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.ERRO_FATAL);
        }
        catch (DSENBusinessException e) {
            this.a((Object)e, naoEnviadas, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.EXCEPTION);
        }
        catch (DSGEWebServiceException e) {
            this.a((Object)e, naoEnviadas, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.EXCEPTION);
        }
        catch (Throwable e) {
            this.a((Object)e, naoEnviadas, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.EXCEPTION);
        }
        return listaInutilizacaoTO;
    }

    private void a(EmitenteTO emitenteTO, List<InutilizacaoTO> listaInutilizacaoTO, CertificadoTO certificadoTO, boolean isSefaz, TipoEmissaoEnum tipoEmissaoEnum) {
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.inutilizarFaixas(emitenteTO, listaInutilizacaoTO, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
    }

    private void a(Object mensagemErro, List<InutilizacaoTO> inutTOList, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum grupoNotificacaoEnum) {
        Notificador.getInstance().notificar((Object)new Object[]{mensagemErro, inutTOList, grupoNotificacaoEnum}, new EnumItf[]{grupoNotificacaoEnum});
    }

    private WSBusiness a() {
        if (this.a == null) {
            this.a = new WSBusiness();
        }
        return this.a;
    }

    private NotaFiscalBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (NotaFiscalBusiness)BusinessFactory.create((String)NotaFiscalBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    public boolean numeroInutilizado(Integer idEmitente, String serie, String numero) throws DSENBusinessException {
        try {
            return this.a().numeroInutilizado(idEmitente, serie, numero);
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    public List<InutilizacaoTO> pesquisarInutilizacaoByData(PesquisaRelatorioGerencialTO pesquisaRelatorioGerencialTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaRelatorioGerencialTO.getIdEmitente());
            List inutilizacaoEntityList = this.a().selectInutilizacaoByIntervaloData(emitenteEntity, pesquisaRelatorioGerencialTO.getDataIni(), pesquisaRelatorioGerencialTO.getDataFim());
            return DSENBusinessConverter.getInutilizacaoTO((List)inutilizacaoEntityList);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public List<InutilizacaoTO> pesquisarInutilizacaoByChave(PesquisaRelatorioGerencialTO pesquisaRelatorioGerencialTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaRelatorioGerencialTO.getIdEmitente());
            List inutilizacaoEntityList = this.a().selectInutilizacaoByIntervaloData(emitenteEntity, pesquisaRelatorioGerencialTO.getDataIni(), pesquisaRelatorioGerencialTO.getDataFim());
            return DSENBusinessConverter.getInutilizacaoTO((List)inutilizacaoEntityList);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public void exportarInutilizacao(List<InutilizacaoTO> listaInutilizacaoTO, String path) throws DSENBusinessException {
        int totalRegistros = listaInutilizacaoTO.size();
        int qtdeRegistrosExportados = 0;
        int qtdeArquivosGerados = 0;
        try {
            for (InutilizacaoTO inutilizacaoTO : listaInutilizacaoTO) {
                String xmlString = inutilizacaoTO.getProtocoloXmlString();
                String nomeArquivo = !StringHelper.isBlankOrNull((Object)inutilizacaoTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)inutilizacaoTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (InutilizacaoTO)inutilizacaoTO, (ExtensaoArquivoEnum)ExtensaoArquivoEnum.XML, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.ProcInutNFe);
                boolean ok = ExportacaoHelper.exportar((String)nomeArquivo, (String)xmlString);
                if (!ok) continue;
                ++qtdeRegistrosExportados;
                ++qtdeArquivosGerados;
            }
        }
        catch (CancelarExportacaoException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosExportados, qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_TOTAIS});
    }

    @DSGETransaction
    public InutilizacaoTO alterarInutilizacao(InutilizacaoTO inutilizacaoTO) throws DSENBusinessException {
        try {
            InutilizacaoEntity entity = DSENBusinessConverter.getInutilizacaoEntity((InutilizacaoTO)inutilizacaoTO);
            entity = (InutilizacaoEntity)this.a().update((Serializable)entity);
            inutilizacaoTO = DSENBusinessConverter.getInutilizacaoTO((InutilizacaoEntity)entity);
            inutilizacaoTO.addMessage(MessageFormat.format(DSENMessageConstants.ALTERADO_COM_SUCESSO, "Inutiliza\u00e7\u00e3o " + inutilizacaoTO.getIdInutilizacao()));
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return inutilizacaoTO;
    }
}

