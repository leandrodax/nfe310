/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.model.business.WSBusiness
 *  br.gov.sp.fazenda.dsen.model.business.WSBusiness$1
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLocator
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLocator
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLoteResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Locator
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastroNF2Result
 *  br.gov.sp.fazenda.dsen.ws.cadastro.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamento2Locator
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamento2Soap
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamentoNF2Result
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeConsulta2Locator
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeConsulta2Soap
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeConsultaNF2Result
 *  br.gov.sp.fazenda.dsen.ws.consulta.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBLocator
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceConsultaDPECResult
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBLocator
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoap
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SceDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SceRecepcaoDPECResult
 *  br.gov.sp.fazenda.dsen.ws.evento.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.evento.NfeRecepcaoEventoResult
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoLocator
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoap
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacao2Locator
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacao2Soap
 *  br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacaoNF2Result
 *  br.gov.sp.fazenda.dsen.ws.ssl.DSENProtocolSocketFactory
 *  br.gov.sp.fazenda.dsen.ws.status.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.status.NfeStatusServico2Locator
 *  br.gov.sp.fazenda.dsen.ws.status.NfeStatusServico2Soap
 *  br.gov.sp.fazenda.dsen.ws.status.NfeStatusServicoNF2Result
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.model.business.DSGEWSBusiness
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException
 *  br.gov.sp.fazenda.dsge.ws.ssl.DSGEProtocolSocketFactory
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.configuration.FileProvider
 *  org.apache.axis.message.MessageElement
 *  org.apache.commons.httpclient.protocol.Protocol
 *  org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.model.business.WSBusiness;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLocator;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLocator;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLoteResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap;
import br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Locator;
import br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap;
import br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastroNF2Result;
import br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamento2Locator;
import br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamento2Soap;
import br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamentoNF2Result;
import br.gov.sp.fazenda.dsen.ws.consulta.NfeConsulta2Locator;
import br.gov.sp.fazenda.dsen.ws.consulta.NfeConsulta2Soap;
import br.gov.sp.fazenda.dsen.ws.consulta.NfeConsultaNF2Result;
import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBLocator;
import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap;
import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceConsultaDPECResult;
import br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBLocator;
import br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoap;
import br.gov.sp.fazenda.dsen.ws.dpec.envio.SceDadosMsg;
import br.gov.sp.fazenda.dsen.ws.dpec.envio.SceRecepcaoDPECResult;
import br.gov.sp.fazenda.dsen.ws.evento.NfeRecepcaoEventoResult;
import br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoLocator;
import br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoap;
import br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacao2Locator;
import br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacao2Soap;
import br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeInutilizacaoNF2Result;
import br.gov.sp.fazenda.dsen.ws.ssl.DSENProtocolSocketFactory;
import br.gov.sp.fazenda.dsen.ws.status.NfeDadosMsg;
import br.gov.sp.fazenda.dsen.ws.status.NfeStatusServico2Locator;
import br.gov.sp.fazenda.dsen.ws.status.NfeStatusServico2Soap;
import br.gov.sp.fazenda.dsen.ws.status.NfeStatusServicoNF2Result;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.model.business.DSGEWSBusiness;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException;
import br.gov.sp.fazenda.dsge.ws.ssl.DSGEProtocolSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.rpc.ServiceException;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.message.MessageElement;
import org.apache.commons.httpclient.protocol.Protocol;
import org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class WSBusiness
extends DSGEWSBusiness {
    private X509Certificate a;
    private PrivateKey a;

    public String servico(String cabecMsg, String dadosMsg, EstadoTO estadoTO, ServicoSefazEnum servicoSefazEnum, X509Certificate certificate, PrivateKey privateKey) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        this.a = certificate;
        this.a = privateKey;
        this.configurarProxy();
        switch (1.a[servicoSefazEnum.ordinal()]) {
            case 1: {
                return this.g(cabecMsg, dadosMsg, estadoTO);
            }
            case 2: {
                return this.b(cabecMsg, dadosMsg, estadoTO);
            }
            case 3: {
                return this.d(cabecMsg, dadosMsg, estadoTO);
            }
            case 4: {
                return this.e(cabecMsg, dadosMsg, estadoTO);
            }
            case 5: {
                return this.f(cabecMsg, dadosMsg, estadoTO);
            }
            case 6: {
                return this.c(cabecMsg, dadosMsg, estadoTO);
            }
            case 7: {
                return this.h(cabecMsg, dadosMsg, estadoTO);
            }
            case 8: {
                return this.a(cabecMsg, dadosMsg);
            }
            case 9: {
                return this.b(cabecMsg, dadosMsg);
            }
            case 10: {
                return this.a(cabecMsg, dadosMsg, estadoTO);
            }
        }
        return null;
    }

    private String a(String cabecMsg, String dadosMsg, EstadoTO estadoTO) throws DSGEWebServiceException, DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.RecepcaoEvento);
            RecepcaoEventoLocator eventoLocator = new RecepcaoEventoLocator(this.getEngineConfiguration());
            RecepcaoEventoSoap eventoSoap = eventoLocator.getNfeInutilizacao2Soap12(new URL(url), 60000);
            NfeRecepcaoEventoResult recepcaoEventoResult = eventoSoap.nfeRecepcaoEvento(this.a(cabecMsg), new br.gov.sp.fazenda.dsen.ws.evento.NfeDadosMsg(this.a(dadosMsg)));
            return recepcaoEventoResult.get_any()[0].getAsString();
        }
        catch (DSGEUtilException e) {
            throw new DSGEWebServiceException((DSGEBaseException)e, e.getMessage());
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.lancarExceptionWS(e);
            return null;
        }
    }

    private String b(String nfeCabecMsg, String nfeDadosMsg, EstadoTO estadoTO) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.Cancelamento);
            NfeCancelamento2Locator nfeCancelamentoLocator = new NfeCancelamento2Locator(this.getEngineConfiguration());
            NfeCancelamento2Soap nfeCancelamentoSoap = nfeCancelamentoLocator.getNfeCancelamento2Soap12(new URL(url), 60000);
            NfeCancelamentoNF2Result nfeCancelamentoNF2Result = nfeCancelamentoSoap.nfeCancelamentoNF2(this.a(nfeCabecMsg), new br.gov.sp.fazenda.dsen.ws.cancelamento.NfeDadosMsg(this.a(nfeDadosMsg)));
            return nfeCancelamentoNF2Result.get_any()[0].getAsString();
        }
        catch (DSGEUtilException e) {
            throw new DSGEWebServiceException((DSGEBaseException)e, e.getMessage());
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.lancarExceptionWS(e);
            return null;
        }
    }

    private String c(String nfeCabecMsg, String nfeDadosMsg, EstadoTO estadoTO) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.ConsultaNf);
            NfeConsulta2Locator nfeConsultaLocator = new NfeConsulta2Locator(this.getEngineConfiguration());
            NfeConsulta2Soap nfeConsultaSoap = nfeConsultaLocator.getNfeConsulta2Soap12(new URL(url), 60000);
            NfeConsultaNF2Result nfeConsultaNF2Result = nfeConsultaSoap.nfeConsultaNF2(this.a(nfeCabecMsg), new br.gov.sp.fazenda.dsen.ws.consulta.NfeDadosMsg(this.a(nfeDadosMsg)));
            System.out.println(nfeConsultaNF2Result.get_any()[0].getAsString());
            return nfeConsultaNF2Result.get_any()[0].getAsString();
        }
        catch (DSGEUtilException e) {
            throw new DSGEWebServiceException((DSGEBaseException)e, e.getMessage());
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.lancarExceptionWS(e);
            return null;
        }
    }

    private String d(String nfeCabecMsg, String nfeDadosMsg, EstadoTO estadoTO) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.Inutilizacao);
            NfeInutilizacao2Locator nfeInutilizacaoLocator = new NfeInutilizacao2Locator(this.getEngineConfiguration());
            NfeInutilizacao2Soap nfeInutilizacaoSoap = nfeInutilizacaoLocator.getNfeInutilizacao2Soap12(new URL(url), 60000);
            NfeInutilizacaoNF2Result nfeInutilizacaoNF2Result = nfeInutilizacaoSoap.nfeInutilizacaoNF2(this.a(nfeCabecMsg), new br.gov.sp.fazenda.dsen.ws.inutilizacao.NfeDadosMsg(this.a(nfeDadosMsg)));
            return nfeInutilizacaoNF2Result.get_any()[0].getAsString();
        }
        catch (DSGEUtilException e) {
            throw new DSGEWebServiceException((DSGEBaseException)e, e.getMessage());
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.lancarExceptionWS(e);
            return null;
        }
    }

    private String e(String nfeCabecMsg, String nfeDadosMsg, EstadoTO estadoTO) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.Recepcao);
            NfeAutorizacaoLocator nfeAutorizacaoLocator = new NfeAutorizacaoLocator(this.getEngineConfiguration());
            NfeAutorizacaoSoap autSoap = nfeAutorizacaoLocator.getNfeAutorizacaoSoap(new URL(url), 60000);
            NfeAutorizacaoLoteResult nfeAutorizacaoLoteResult = autSoap.nfeAutorizacaoLote(this.a(nfeCabecMsg), new br.gov.sp.fazenda.dsen.ws.autorizacao.NfeDadosMsg(this.a(nfeDadosMsg)));
            return nfeAutorizacaoLoteResult.get_any()[0].getAsString();
        }
        catch (DSGEUtilException e) {
            throw new DSGEWebServiceException((DSGEBaseException)e, e.getMessage());
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.lancarExceptionWS(e);
            return null;
        }
    }

    private String f(String nfeCabecMsg, String nfeDadosMsg, EstadoTO estadoTO) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.RetRecepcao);
            NfeRetAutorizacaoLocator nfeRetAutorizacaoLocator = new NfeRetAutorizacaoLocator(this.getEngineConfiguration());
            NfeRetAutorizacaoSoap nfeRetAutorizacaoSoap = nfeRetAutorizacaoLocator.getNfeRetAutorizacaoSoap(new URL(url), 60000);
            NfeRetAutorizacaoLoteResult nfeRetAutorizacaoLoteResult = nfeRetAutorizacaoSoap.nfeRetAutorizacaoLote(this.a(nfeCabecMsg), new br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeDadosMsg(this.a(nfeDadosMsg)));
            return nfeRetAutorizacaoLoteResult.get_any()[0].getAsString();
        }
        catch (DSGEUtilException e) {
            throw new DSGEWebServiceException((DSGEBaseException)e, e.getMessage());
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.lancarExceptionWS(e);
            return null;
        }
    }

    private String g(String nfeCabecMsg, String nfeDadosMsg, EstadoTO estadoTO) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.StatusServico);
            NfeStatusServico2Locator nfeStatusServicoLocator = new NfeStatusServico2Locator(this.getEngineConfiguration());
            NfeStatusServico2Soap nfeStatusServicoSoap = nfeStatusServicoLocator.getNfeStatusServico2Soap12(new URL(url), 60000);
            NfeStatusServicoNF2Result nfeStatusServicoNF2Result = nfeStatusServicoSoap.nfeStatusServicoNF2(this.a(nfeCabecMsg), new NfeDadosMsg(this.a(nfeDadosMsg)));
            return nfeStatusServicoNF2Result.get_any()[0].getAsString();
        }
        catch (DSGEUtilException e) {
            throw new DSGEWebServiceException((DSGEBaseException)e, e.getMessage());
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.lancarExceptionWS(e);
            return null;
        }
    }

    private String h(String nfeCabecMsg, String nfeDadosMsg, EstadoTO estadoTO) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.ConsultaCadastro);
            CadConsultaCadastro2Locator cadConsultaCadastroLocator = new CadConsultaCadastro2Locator(this.getEngineConfiguration());
            CadConsultaCadastro2Soap cadConsultaCadastroSoap = cadConsultaCadastroLocator.getCadConsultaCadastro2Soap12(new URL(url), 60000);
            CadConsultaCadastroNF2Result result = cadConsultaCadastroSoap.consultaCadastro2(this.a(nfeCabecMsg), new br.gov.sp.fazenda.dsen.ws.cadastro.NfeDadosMsg(this.a(nfeDadosMsg)));
            return result.get_any()[0].getAsString();
        }
        catch (DSGEUtilException e) {
            throw new DSGEWebServiceException((DSGEBaseException)e, e.getMessage());
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.lancarExceptionWS(e);
            return null;
        }
    }

    private String a(String sceCabecMsg, String sceDadosMsg) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new ByteArrayInputStream(sceCabecMsg.getBytes("UTF-8")));
            Element element = doc.getDocumentElement();
            MessageElement messageElement = new MessageElement(db.parse(new ByteArrayInputStream(sceDadosMsg.getBytes("UTF-8"))).getDocumentElement());
            String url = DSENProperties.getInstance().getDpecUrlEnvio();
            SCERecepcaoRFBLocator recepcaoRFBLocator = new SCERecepcaoRFBLocator(this.getEngineConfiguration());
            SCERecepcaoRFBSoap recepcaoRFBSoap = recepcaoRFBLocator.getSCERecepcaoRFBSoap12(new URL(url), 60000);
            SceRecepcaoDPECResult sceRecepcaoDPECResult = recepcaoRFBSoap.sceRecepcaoDPEC(element, new SceDadosMsg(new MessageElement[]{messageElement}));
            return sceRecepcaoDPECResult.get_any()[0].getAsString();
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (RemoteException e) {
            this.lancarExceptionWS((Exception)e);
        }
        catch (ParserConfigurationException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (FileNotFoundException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (SAXException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        return null;
    }

    private String b(String sceCabecMsg, String sceDadosMsg) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new ByteArrayInputStream(sceCabecMsg.getBytes("UTF-8")));
            Element element = doc.getDocumentElement();
            MessageElement messageElement = new MessageElement(db.parse(new ByteArrayInputStream(sceDadosMsg.getBytes("UTF-8"))).getDocumentElement());
            String url = DSENProperties.getInstance().getDpecUrlConsulta();
            SCEConsultaRFBLocator consultaRFBLocator = new SCEConsultaRFBLocator(this.getEngineConfiguration());
            SCEConsultaRFBSoap consultaRFBSoap = consultaRFBLocator.getSCEConsultaRFBSoap12(new URL(url), 60000);
            SceConsultaDPECResult sceConsultaDPECResult = consultaRFBSoap.sceConsultaDPEC(element, new br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceDadosMsg(new MessageElement[]{messageElement}));
            return sceConsultaDPECResult.get_any()[0].getAsString();
        }
        catch (MalformedURLException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (ServiceException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (RemoteException e) {
            this.lancarExceptionWS((Exception)e);
        }
        catch (ParserConfigurationException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (FileNotFoundException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (SAXException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        return null;
    }

    public String getPortaProxy() {
        return ((ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_PORTA_PROXY, ParametroTO.class)).getValor();
    }

    public String getProxyServidor() {
        return ((ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_PROXY_SERVIDOR, ParametroTO.class)).getValor();
    }

    public String getSenhaProxy() {
        return ((ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_SENHA_PROXY, ParametroTO.class)).getValor();
    }

    public String getUsuarioProxy() {
        return ((ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_USUARIO_PROXY, ParametroTO.class)).getValor();
    }

    public EngineConfiguration getEngineConfiguration() {
        Protocol protocol = new Protocol("https", (SecureProtocolSocketFactory)new DSENProtocolSocketFactory(this.a, this.a), 443);
        Protocol.registerProtocol((String)"https", (Protocol)protocol);
        FileProvider engineConfiguration = new FileProvider(DSGEProtocolSocketFactory.class.getResourceAsStream("client-config.wsdd"));
        return engineConfiguration;
    }

    public static void main(String[] args) {
        String cabecMsg = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><cabecMsg versao=\"1.02\" xmlns=\"http://www.portalfiscal.inf.br/nfe\"><versaoDados>1.01</versaoDados></cabecMsg>";
        try {
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            keyStore.load(new FileInputStream("/home/carlos/Documents/Certificados/SEFAZ_SP_Renato.pfx"), "renato".toCharArray());
            String alias = "";
            X509Certificate certificate = null;
            PrivateKey privateKey = null;
            Enumeration<String> e = keyStore.aliases();
            while (e.hasMoreElements()) {
                alias = e.nextElement();
                certificate = (X509Certificate)keyStore.getCertificate(alias);
                privateKey = (PrivateKey)keyStore.getKey(alias, "renato".toCharArray());
            }
            System.out.println(new WSBusiness().servico(cabecMsg, "<?xml version=\"1.0\" encoding=\"UTF-8\"?><ConsCad xmlns=\"http://www.portalfiscal.inf.br/nfe\" versao=\"1.01\"><infCons><xServ>CONS-CAD</xServ><UF>SP</UF><IE>108383949112</IE></infCons></ConsCad>", new EstadoTO("35", "SP", "Sao Paulo"), ServicoSefazEnum.ConsultaCadastro, certificate, privateKey));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Document a(InputStream message) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(message);
    }

    private Element a(String nfeCabecMsg) throws Exception {
        return this.a((InputStream)new ByteArrayInputStream(nfeCabecMsg.getBytes("UTF-8"))).getDocumentElement();
    }

    private MessageElement[] a(String nfeDadosMsg) throws Exception {
        MessageElement messageElement = new MessageElement(this.a((InputStream)new ByteArrayInputStream(nfeDadosMsg.getBytes("UTF-8"))).getDocumentElement());
        return new MessageElement[]{messageElement};
    }
}

