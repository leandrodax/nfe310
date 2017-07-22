/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.ParametroBusiness
 *  br.gov.sp.fazenda.dsen.model.business.PropriedadeBusiness
 *  br.gov.sp.fazenda.dsen.model.business.TransmissorBusiness
 *  br.gov.sp.fazenda.dsen.model.business.TransmissorBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.WSBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.business.util.ConsultaStatusServicoHelper
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.business.util.ScanHelper
 *  br.gov.sp.fazenda.dsen.model.dao.CancelamentoDAO
 *  br.gov.sp.fazenda.dsen.model.dao.LoteDAO
 *  br.gov.sp.fazenda.dsen.model.dao.NotaFiscalDAO
 *  br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcEventoNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsReciNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsReciNFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsSitNFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEvento$InfEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEvento
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProtNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProtNFe$InfProt
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetCancNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsReciNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsSitNFe
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager
 *  br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno;
import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.LoteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.ParametroBusiness;
import br.gov.sp.fazenda.dsen.model.business.PropriedadeBusiness;
import br.gov.sp.fazenda.dsen.model.business.TransmissorBusiness;
import br.gov.sp.fazenda.dsen.model.business.WSBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.business.util.ConsultaStatusServicoHelper;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.business.util.ScanHelper;
import br.gov.sp.fazenda.dsen.model.dao.CancelamentoDAO;
import br.gov.sp.fazenda.dsen.model.dao.LoteDAO;
import br.gov.sp.fazenda.dsen.model.dao.NotaFiscalDAO;
import br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.ProcEventoNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsReciNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.RetConsSitNFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEvento;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProtNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetCancNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsReciNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TRetConsSitNFe;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import br.gov.sp.fazenda.dsge.model.queue.QueueManager;
import br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransmissorBusiness {
    private Log a;
    private LoteDAO a;
    private NotaFiscalBusiness a;
    private NotaFiscalDAO a;
    private WSBusiness a;
    private CancelamentoDAO a;
    private PropriedadeBusiness a;
    private ParametroBusiness a = LogFactory.getLog(TransmissorBusiness.class);

    private NotaFiscalTO a(LoteTO loteTO, SituacaoNFeEnum situacao, NotaFiscalTO nfeTO) throws DSGEUtilException, DSENBusinessException {
        nfeTO.setLoteTO(loteTO);
        nfeTO.setSituacao(situacao);
        try {
            this.a().update((Serializable)DSENBusinessConverter.getLoteEntity((LoteTO)loteTO));
        }
        catch (DSGEDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return this.a().alterarSemTransaction(nfeTO);
    }

    private WSBusiness a() {
        if (this.a == null) {
            this.a = new WSBusiness();
        }
        return this.a;
    }

    public void reagendarBuscaRetorno(BuscaRetornoQueueItem item, long tempoEspera) {
        BuscaRetornoQueueItem novoItem = new BuscaRetornoQueueItem(item.getId(), item, tempoEspera);
        QueueManager.getInstance(BuscaRetornoQueueItem.class).push((QueueRetornoItem)novoItem);
    }

    public void agendarBuscaRetorno(List<NotaFiscalTO> listNfeTO, CertificadoTO certificadoTO, long tempoEspera) {
        for (NotaFiscalTO nfeTO : listNfeTO) {
            this.agendarBuscaRetorno(nfeTO, certificadoTO, tempoEspera);
        }
    }

    public void agendarBuscaRetorno(NotaFiscalTO nfeTO, CertificadoTO certificadoTO, long tempoEspera) {
        QueueManager.getInstance(BuscaRetornoQueueItem.class).push((QueueRetornoItem)new BuscaRetornoQueueItem(0, tempoEspera, nfeTO, certificadoTO));
    }

    public void agendarBuscaRetorno(List<NotaFiscalTO> listaNotaFiscalBusca, Map<String, CertificadoLoteTO> mapaCertificadoLoteTO) {
        for (NotaFiscalTO transporteTO : listaNotaFiscalBusca) {
            CertificadoLoteTO certificadoLoteTO = mapaCertificadoLoteTO.get(transporteTO.getLoteTO().getCnpjTransmissao());
            CertificadoTO certificadoTO = new CertificadoTO();
            certificadoTO.setX509Certificate(certificadoLoteTO.getX509Certificate());
            certificadoTO.setPrivateKey(certificadoLoteTO.getPrivateKey());
            BuscaRetornoQueueItem item = new BuscaRetornoQueueItem(0, 0, transporteTO, certificadoTO);
            QueueManager.getInstance(BuscaRetornoQueueItem.class).push((QueueRetornoItem)item);
        }
    }

    public String verificarItemFilaBuscaRetorno(NotaFiscalTO nfeTO) {
        BuscaRetornoQueueItem item = new BuscaRetornoQueueItem(1, 0, nfeTO, null);
        QueueRetornoItem itemFila = QueueManager.getInstance(BuscaRetornoQueueItem.class).getItem((QueueRetornoItem)item);
        if (itemFila != null) {
            Date data = new Date(itemFila.getTimeToGo());
            return MessageFormat.format(DSENMessageConstants.MSG_NOTAS_JA_NA_FILA_AGENDAMENTO, nfeTO.getSerie(), nfeTO.getNumero(), nfeTO.getAno(), DateHelper.formataDataHora((Date)data, (SimpleDateFormat)DateHelper.TIME_FORMAT));
        }
        return null;
    }

    private LoteDAO a() throws DSENBusinessException {
        if (this.a == null) {
            this.a = new LoteDAO();
        }
        return this.a;
    }

    @DSGETransaction
    public void consultarSituacaoRecibo(NotaFiscalTO nfeTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        try {
            boolean valido;
            boolean isSefaz = true;
            ScanHelper scanHelper = new ScanHelper();
            if (!scanHelper.isSefaz(nfeTO)) {
                isSefaz = false;
            }
            String wsReceptor = isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB;
            LoteTO loteTO = nfeTO.getLoteTO();
            EstadoTO emitenteEstadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(nfeTO.getEmitenteTO().getUf());
            EstadoTO estadoTO = scanHelper.getEstadoTO(emitenteEstadoTO, isSefaz, nfeTO.getTipoEmissao());
            String buscaRetornoCabecalho = DocumentoUtil.criarCabecalhoMensagem((ServicoSefazEnum)ServicoSefazEnum.RetRecepcao, (String)emitenteEstadoTO.getCodigo(), (String)DSENProperties.getInstance().getVersaoSchemaConsRecibo());
            String buscaRetornoEnvioXml = DocumentoUtil.criarXmlConsultaReciboNFeDocument((String)loteTO.getNumRecibo());
            String buscaRetornoResultadoXml = this.a().servico(buscaRetornoCabecalho, buscaRetornoEnvioXml, estadoTO, ServicoSefazEnum.RetRecepcao, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey());
            RetConsReciNFeDocument document = null;
            try {
                document = RetConsReciNFeDocument.Factory.parse((String)buscaRetornoResultadoXml);
                valido = document.validate();
            }
            catch (Throwable e) {
                e.printStackTrace();
                valido = false;
            }
            if (!valido) {
                String urlSefaz = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.RetRecepcao);
                nfeTO.setErroXmlResposta(new ErroXmlResposta(ServicoSefazEnum.RetRecepcao, urlSefaz, buscaRetornoEnvioXml, buscaRetornoResultadoXml, isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB));
                nfeTO.setCodigoErro(null);
                nfeTO.setSituacao(SituacaoNFeEnum.REJEITADA);
                nfeTO.setMensagemErro(MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, wsReceptor));
                this.a().alterarSemTransaction(nfeTO);
                return;
            }
            loteTO.setDataProcessamento(new Date());
            TRetConsReciNFe retConsReci = document.getRetConsReciNFe();
            String codigoRetornoLote = retConsReci.getCStat();
            String motivoRejeicaoLote = retConsReci.getXMotivo();
            loteTO.setCodigoRetorno(codigoRetornoLote);
            TProtNFe[] protNFesArray = retConsReci.getProtNFeArray();
            if (!DSENConstants.CODIGO_LOTE_EM_PROCESSAMENTO.equals(codigoRetornoLote)) {
                if (DSENConstants.CODIGO_LOTE_PROCESSADO.equals(codigoRetornoLote)) {
                    if (protNFesArray == null || protNFesArray.length == 0) {
                        nfeTO.setMensagemErro(MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_LOTE_PROCESSADO_SEM_PROTNFE, wsReceptor));
                        return;
                    }
                    String[] protocoloNFeArray = DocumentoUtil.getProtocolosNfesArray((RetConsReciNFeDocument)document);
                    for (int i = 0; i < protocoloNFeArray.length; ++i) {
                        String protocolo = protocoloNFeArray[i];
                        String chaveAcesso = this.a(protocolo);
                        if (!nfeTO.getChaveAcesso().equals(chaveAcesso) && protocoloNFeArray.length > 1) continue;
                        Date dataProcessamento = XMLUtil.getXmlDate((String)((String)XMLUtil.getTagConteudo((String)protocolo, (String)"dhRecbto", (boolean)false).get(0)));
                        loteTO.setDataProcessamento(dataProcessamento);
                        loteTO.setXmlRetornoString(buscaRetornoResultadoXml);
                        DocumentoUtil.setProtocoloNFeRetornoConsultaSituacao((String)protocolo, (NotaFiscalTO)nfeTO);
                        if (nfeTO.getSituacao() == SituacaoNFeEnum.CANCELADA || nfeTO.getSituacao() == SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ) continue;
                        this.a().alterarSemTransaction(nfeTO);
                    }
                } else if (DSENConstants.CODIGO_LOTE_NAO_LOCALIZADO.equals(codigoRetornoLote)) {
                    TRetConsSitNFe retConsSitNFe = this.a(nfeTO, nfeTO.getEmitenteTO(), certificadoTO, isSefaz);
                    if (retConsSitNFe == null) {
                        return;
                    }
                    this.a(nfeTO, retConsSitNFe, true);
                } else {
                    nfeTO.setSituacao(SituacaoNFeEnum.REJEITADA);
                    nfeTO.setCodigoErro(codigoRetornoLote);
                    nfeTO.setMensagemErro(motivoRejeicaoLote);
                    this.a().alterarSemTransaction(nfeTO);
                }
                this.a().update((Serializable)DSENBusinessConverter.getLoteEntity((LoteTO)loteTO));
            }
            this.a(nfeTO.getEmitenteTO(), new Date());
        }
        catch (Throwable t) {
            this.a.error((Object)t.getMessage());
            nfeTO.setException(new DSGEBaseException(t, t.getMessage()));
        }
    }

    public boolean verificarStatusServicoAtivo(CertificadoLoteTO certificadoLoteTO, boolean isSefaz) throws DSENBusinessException {
        try {
            ConsultaStatusServicoHelper consultaStatusServicoHelper = new ConsultaStatusServicoHelper();
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteTO.getUf());
            return consultaStatusServicoHelper.consultarStatusServico(estadoTO, certificadoLoteTO.getX509Certificate(), certificadoLoteTO.getPrivateKey(), ServicoSefazEnum.StatusServico, isSefaz, TipoEmissaoEnum.NORMAL);
        }
        catch (DSGEUtilException e) {
            this.a.equals(e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (Exception e) {
            this.a.equals(e.getMessage());
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public ParametroBusiness getParametroBusiness() {
        if (this.a == null) {
            this.a = new ParametroBusiness();
        }
        return this.a;
    }

    private CancelamentoDAO a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (CancelamentoDAO)BusinessFactory.create((String)CancelamentoDAO.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
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

    private PropriedadeBusiness a() {
        if (this.a == null) {
            this.a = new PropriedadeBusiness();
        }
        return this.a;
    }

    private NotaFiscalDAO a() {
        if (this.a == null) {
            this.a = new NotaFiscalDAO();
        }
        return this.a;
    }

    @DSGETransaction
    public void consultarSituacaoNFe(List<NotaFiscalTO> listaNotaFiscalTO, EmitenteTO emitenteTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        List listaNotaFiscalTOSvcRs;
        List listaNotaFiscalTOSvcAn;
        List listaNotaFiscalTOScan;
        ScanHelper scanHelper = new ScanHelper();
        Map notaFiscalMap = scanHelper.agruparNotaFiscalPorSerie(listaNotaFiscalTO);
        List listaNotaFiscalTOSefaz = (List)notaFiscalMap.get((Object)TipoEmissaoEnum.NORMAL);
        if (listaNotaFiscalTOSefaz != null && !listaNotaFiscalTOSefaz.isEmpty()) {
            this.consultarSituacaoNFe(listaNotaFiscalTOSefaz, emitenteTO, certificadoTO, true, TipoEmissaoEnum.NORMAL);
        }
        if ((listaNotaFiscalTOScan = (List)notaFiscalMap.get((Object)TipoEmissaoEnum.CONTINGENCIA_SCAN)) != null && !listaNotaFiscalTOScan.isEmpty()) {
            this.consultarSituacaoNFe(listaNotaFiscalTOScan, emitenteTO, certificadoTO, false, TipoEmissaoEnum.CONTINGENCIA_SCAN);
        }
        if ((listaNotaFiscalTOSvcAn = (List)notaFiscalMap.get((Object)TipoEmissaoEnum.CONTINGENCIA_SVC_AN)) != null && !listaNotaFiscalTOSvcAn.isEmpty()) {
            this.consultarSituacaoNFe(listaNotaFiscalTOSvcAn, emitenteTO, certificadoTO, false, TipoEmissaoEnum.CONTINGENCIA_SVC_AN);
        }
        if ((listaNotaFiscalTOSvcRs = (List)notaFiscalMap.get((Object)TipoEmissaoEnum.CONTINGENCIA_SVC_RS)) != null && !listaNotaFiscalTOSvcRs.isEmpty()) {
            this.consultarSituacaoNFe(listaNotaFiscalTOSvcRs, emitenteTO, certificadoTO, false, TipoEmissaoEnum.CONTINGENCIA_SVC_RS);
        }
    }

    @DSGETransaction
    public void consultarSituacaoNFe(List<NotaFiscalTO> listaNotaFiscal, EmitenteTO emitenteTO, CertificadoTO certificadoTO, boolean isSefaz, TipoEmissaoEnum tipoEmissaoEnum) throws DSENBusinessException {
        String wsReceptor = isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB;
        GrupoNotificacaoEnum notificacaoErroConsulta = isSefaz ? GrupoNotificacaoEnum.CONSULTA_NOTA_FISCAL_ERRO_SEFAZ : GrupoNotificacaoEnum.CONSULTA_NOTA_FISCAL_ERRO_SCAN;
        GrupoNotificacaoEnum notificacaoErroRespostaSEFAZ = isSefaz ? GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_NOTA_FISCAL : GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_CONSULTA_NOTA_FISCAL;
        ArrayList<NotaFiscalTO> naoProcessadas = new ArrayList<NotaFiscalTO>(listaNotaFiscal);
        try {
            EstadoTO emitenteEstadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteTO.getUf());
            ConsultaStatusServicoHelper consultaStatusServicoHelper = new ConsultaStatusServicoHelper();
            boolean statusServicoOK = consultaStatusServicoHelper.consultarStatusServico(emitenteEstadoTO, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey(), ServicoSefazEnum.ConsultaNf, isSefaz, tipoEmissaoEnum);
            if (statusServicoOK) {
                for (NotaFiscalTO nfeTO : listaNotaFiscal) {
                    TRetConsSitNFe retConsSitNFe = this.a(nfeTO, emitenteTO, certificadoTO, isSefaz);
                    if (retConsSitNFe == null) {
                        nfeTO.addError(MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, wsReceptor));
                        Notificador.getInstance().notificar((Object)nfeTO.getErroXmlResposta(), new EnumItf[]{notificacaoErroRespostaSEFAZ});
                        Notificador.getInstance().notificar((Object)nfeTO, new EnumItf[]{GrupoNotificacaoEnum.NOTA_FISCAL_CONSULTADA});
                        return;
                    }
                    this.a(nfeTO, retConsSitNFe, true);
                    Notificador.getInstance().notificar((Object)nfeTO, new EnumItf[]{GrupoNotificacaoEnum.NOTA_FISCAL_CONSULTADA});
                    naoProcessadas.remove((Object)nfeTO);
                }
            }
        }
        catch (DSGEConnectionClientException ex) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_CLIENT, wsReceptor), naoProcessadas, notificacaoErroConsulta);
            this.a(naoProcessadas, emitenteTO, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
        catch (DSGEConnectionServerException ex) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_SERVER, wsReceptor), naoProcessadas, notificacaoErroConsulta);
            this.a(naoProcessadas, emitenteTO, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
        catch (DSGETimeoutException ex) {
            this.a((Object)DSENMessageConstants.MSG_WS_CONEXAO_TIMEOUT, naoProcessadas, notificacaoErroConsulta);
            this.a(naoProcessadas, emitenteTO, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
        catch (DSGESocketException ex) {
            this.a((Object)DSENMessageConstants.MSG_WS_SOCKET, naoProcessadas, notificacaoErroConsulta);
            this.a(naoProcessadas, emitenteTO, certificadoTO, isSefaz, tipoEmissaoEnum);
        }
        catch (DSGEProxyException ex) {
            this.a((Object)DSENMessageConstants.MSG_WS_PROXY, naoProcessadas, GrupoNotificacaoEnum.ERRO_FATAL);
            this.a.error((Object)ex);
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEWebServiceException ex) {
            this.a((Object)DSENMessageConstants.MSG_WS_ERRO_DESCONHECIDO, naoProcessadas, GrupoNotificacaoEnum.ERRO_FATAL);
            this.a.error((Object)ex);
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (Throwable ex) {
            this.a((Object)new DSENBusinessException(ex, ex.getMessage()), naoProcessadas, GrupoNotificacaoEnum.EXCEPTION);
            this.a.error((Object)ex);
            throw new DSENBusinessException(ex, ex.getMessage());
        }
    }

    public void consultarSituacaoNFePorChaveAcesso(String chaveAcesso, EmitenteTO emitenteTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        NotaFiscalTO notaFiscalTO = new NotaFiscalTO();
        EmitenteTO emitTO = new EmitenteTO();
        try {
            ChaveAcessoTO chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso);
            emitTO = new EmitenteTO();
            emitTO.setNrDocumento(chaveAcessoTO.getCnpjEmitente());
            EstadoTO emitEstadoTO = DSENUtilHelper.getInstance().getEstadoTO(chaveAcessoTO.getCodigoUfEmitente());
            emitTO.setUf(emitEstadoTO.getSigla());
            notaFiscalTO = ChaveAcessoUtil.gerarNotaFiscalTO((ChaveAcessoTO)ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso), (EmitenteTO)emitTO);
        }
        catch (DSENCommonException e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEUtilException e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        ArrayList<NotaFiscalTO> listaNotaFiscalTO = new ArrayList<NotaFiscalTO>();
        listaNotaFiscalTO.add(notaFiscalTO);
        boolean isSefaz = true;
        ScanHelper scanHelper = new ScanHelper();
        if (!scanHelper.isSefaz(notaFiscalTO)) {
            isSefaz = false;
        }
        String wsReceptor = isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB;
        GrupoNotificacaoEnum notificacaoErroConsulta = isSefaz ? GrupoNotificacaoEnum.CONSULTA_NOTA_FISCAL_ERRO_SEFAZ : GrupoNotificacaoEnum.CONSULTA_NOTA_FISCAL_ERRO_SCAN;
        try {
            NotaFiscalEntity notaFiscalEntity = this.a().pesquisarPorChaveAcesso(ChaveAcessoUtil.gerarChaveAcessoTO((NotaFiscalTO)notaFiscalTO));
            if (notaFiscalEntity != null) {
                notaFiscalTO.addError(DSENMessageConstants.MSG_NFE_CONSULTADA_EXISTE_BD);
                Notificador.getInstance().notificar((Object)notaFiscalTO, new EnumItf[]{GrupoNotificacaoEnum.NOTA_FISCAL_CONSULTADA});
                return;
            }
            ChaveAcessoTO chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso);
            ConsultaStatusServicoHelper consultaStatusServicoHelper = new ConsultaStatusServicoHelper();
            EstadoTO emitenteEstadoTO = DSENUtilHelper.getInstance().getEstadoTO(chaveAcessoTO.getCodigoUfEmitente());
            boolean statusServicoOK = consultaStatusServicoHelper.consultarStatusServico(emitenteEstadoTO, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey(), ServicoSefazEnum.ConsultaNf, isSefaz, notaFiscalTO.getTipoEmissao());
            if (!statusServicoOK) {
                return;
            }
            TRetConsSitNFe retConsSitNFe = this.a(notaFiscalTO, emitTO, certificadoTO, isSefaz);
            if (retConsSitNFe == null) {
                notaFiscalTO.addError(MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, wsReceptor));
                Notificador.getInstance().notificar((Object)notaFiscalTO.getErroXmlResposta(), new EnumItf[]{GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_NOTA_FISCAL});
                Notificador.getInstance().notificar((Object)notaFiscalTO, new EnumItf[]{GrupoNotificacaoEnum.NOTA_FISCAL_CONSULTADA});
                return;
            }
            this.a(notaFiscalTO, retConsSitNFe, false);
            Notificador.getInstance().notificar((Object)notaFiscalTO, new EnumItf[]{GrupoNotificacaoEnum.NOTA_FISCAL_CONSULTADA});
        }
        catch (DSGEConnectionClientException ex) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_CLIENT, wsReceptor), listaNotaFiscalTO, notificacaoErroConsulta);
            this.a(chaveAcesso, emitenteTO, certificadoTO);
        }
        catch (DSGEConnectionServerException ex) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_SERVER, wsReceptor), listaNotaFiscalTO, notificacaoErroConsulta);
            this.a(chaveAcesso, emitenteTO, certificadoTO);
        }
        catch (DSGETimeoutException ex) {
            this.a((Object)DSENMessageConstants.MSG_WS_CONEXAO_TIMEOUT, listaNotaFiscalTO, notificacaoErroConsulta);
            this.a(chaveAcesso, emitenteTO, certificadoTO);
        }
        catch (DSGESocketException ex) {
            this.a((Object)DSENMessageConstants.MSG_WS_SOCKET, listaNotaFiscalTO, notificacaoErroConsulta);
            this.a(chaveAcesso, emitenteTO, certificadoTO);
        }
        catch (DSGEProxyException ex) {
            this.a((Object)DSENMessageConstants.MSG_WS_PROXY, listaNotaFiscalTO, GrupoNotificacaoEnum.ERRO_FATAL);
            this.a.error((Object)ex);
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEWebServiceException ex) {
            this.a((Object)DSENMessageConstants.MSG_WS_ERRO_DESCONHECIDO, listaNotaFiscalTO, GrupoNotificacaoEnum.ERRO_FATAL);
            this.a.error((Object)ex);
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (Throwable ex) {
            this.a((Object)new DSENBusinessException(ex, ex.getMessage()), listaNotaFiscalTO, GrupoNotificacaoEnum.ERRO_FATAL);
            this.a.error((Object)ex);
            throw new DSENBusinessException(ex, ex.getMessage());
        }
    }

    private TRetConsSitNFe a(NotaFiscalTO nfeTO, EmitenteTO emitenteTO, CertificadoTO certificadoTO, boolean isSefaz) throws Exception {
        ScanHelper scanHelper = new ScanHelper();
        EstadoTO emitenteEstadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteTO.getUf());
        EstadoTO estadoTO = scanHelper.getEstadoTO(emitenteEstadoTO, isSefaz, nfeTO.getTipoEmissao());
        String consultaSituacaoCabecalho = DocumentoUtil.criarCabecalhoMensagem((ServicoSefazEnum)ServicoSefazEnum.ConsultaNf, (String)emitenteEstadoTO.getCodigo(), (String)DSENProperties.getInstance().getVersaoSchemaConsultaSituacao());
        String consultaSituacao = DocumentoUtil.criarDocumentoXmlConsultaPorChaveAcesso((String)nfeTO.getChaveAcesso());
        String consultaSituacaoRetorno = this.a().servico(consultaSituacaoCabecalho, consultaSituacao, estadoTO, ServicoSefazEnum.ConsultaNf, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey());
        WSStatusRetorno statusRetorno = DocumentoUtil.validarXMLRetornoConsultaSituacao((String)consultaSituacaoRetorno);
        switch (1.a[statusRetorno.ordinal()]) {
            case 1: {
                String urlSefaz = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.ConsultaNf);
                ErroXmlResposta erroXmlResposta = new ErroXmlResposta(ServicoSefazEnum.ConsultaNf, urlSefaz, consultaSituacao, consultaSituacaoRetorno, isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB);
                nfeTO.setErroXmlResposta(erroXmlResposta);
                return null;
            }
        }
        RetConsSitNFeDocument retConsSitNfeDocument = DocumentoUtil.getRetConsSitNfeDocument((String)consultaSituacaoRetorno);
        return retConsSitNfeDocument.getRetConsSitNFe();
    }

    @DSGETransaction
    public void transmitir(List<NotaFiscalTO> listaNotaFiscalTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        List listaNotaFiscalTOSVCAN;
        List listaNotaFiscalTOSVCRS;
        List listaNotaFiscalTOScan;
        ScanHelper scanHelper = new ScanHelper();
        Map notaFiscalMap = scanHelper.agruparNotaFiscalPorSerie(listaNotaFiscalTO);
        List listaNotaFiscalTOSefaz = (List)notaFiscalMap.get((Object)TipoEmissaoEnum.NORMAL);
        if (listaNotaFiscalTOSefaz != null && !listaNotaFiscalTOSefaz.isEmpty()) {
            this.transmitir(listaNotaFiscalTOSefaz, certificadoTO, true, TipoEmissaoEnum.NORMAL);
        }
        if ((listaNotaFiscalTOScan = (List)notaFiscalMap.get((Object)TipoEmissaoEnum.CONTINGENCIA_SCAN)) != null && !listaNotaFiscalTOScan.isEmpty()) {
            this.transmitir(listaNotaFiscalTOScan, certificadoTO, false, TipoEmissaoEnum.CONTINGENCIA_SCAN);
        }
        if ((listaNotaFiscalTOSVCRS = (List)notaFiscalMap.get((Object)TipoEmissaoEnum.CONTINGENCIA_SVC_RS)) != null && !listaNotaFiscalTOSVCRS.isEmpty()) {
            this.transmitir(listaNotaFiscalTOSVCRS, certificadoTO, false, TipoEmissaoEnum.CONTINGENCIA_SVC_RS);
        }
        if ((listaNotaFiscalTOSVCAN = (List)notaFiscalMap.get((Object)TipoEmissaoEnum.CONTINGENCIA_SVC_AN)) != null && !listaNotaFiscalTOSVCAN.isEmpty()) {
            this.transmitir(listaNotaFiscalTOSVCAN, certificadoTO, false, TipoEmissaoEnum.CONTINGENCIA_SVC_AN);
        }
    }

    /*
     * Exception decompiling
     */
    @DSGETransaction
    public void transmitir(List<NotaFiscalTO> listaNotaFiscalTO, CertificadoTO certificadoTO, boolean isSefaz, TipoEmissaoEnum emissaoEnum) throws DSENBusinessException {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.ClassCastException: org.benf.cfr.reader.bytecode.analysis.parse.statement.Nop cannot be cast to org.benf.cfr.reader.bytecode.analysis.parse.statement.TryStatement
        // org.benf.cfr.reader.bytecode.analysis.parse.utils.finalhelp.FinalAnalyzer.identifyFinally(FinalAnalyzer.java:163)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.FinallyRewriter.identifyFinally(FinallyRewriter.java:40)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:483)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    private void a(Object mensagemErro, List<NotaFiscalTO> transporteTO, GrupoNotificacaoEnum grupoNotificacaoEnum) {
        Notificador.getInstance().notificar((Object)new Object[]{mensagemErro, transporteTO, grupoNotificacaoEnum}, new EnumItf[]{grupoNotificacaoEnum});
    }

    private void a(Object mensagemErro, EventoTO eventoTO, GrupoNotificacaoEnum grupoNotificacaoEnum) {
        Notificador.getInstance().notificar((Object)new Object[]{mensagemErro, eventoTO, grupoNotificacaoEnum}, new EnumItf[]{grupoNotificacaoEnum});
    }

    private void a(List<NotaFiscalTO> notaFiscalTOList, CertificadoTO certificadoTO) throws DSENBusinessException {
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.transmitir(notaFiscalTOList, certificadoTO);
        }
    }

    private void a(List<NotaFiscalTO> listaNotaFiscalTO, EmitenteTO emitenteTO, CertificadoTO certificadoTO, boolean isSefaz, TipoEmissaoEnum emissaoEnum) throws DSENBusinessException {
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.consultarSituacaoNFe(listaNotaFiscalTO, emitenteTO, certificadoTO, isSefaz, emissaoEnum);
        }
    }

    private void a(EventoTO eventoTO, CertificadoTO certificadoTO, boolean isSefaz) throws DSENBusinessException {
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.enviarEvento(eventoTO, certificadoTO);
        }
    }

    private void a(String chaveAcesso, EmitenteTO emitenteTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.consultarSituacaoNFePorChaveAcesso(chaveAcesso, emitenteTO, certificadoTO);
        }
    }

    private String a(String infProt) {
        return (String)XMLUtil.getTagConteudo((String)infProt, (String)"chNFe", (boolean)false).get(0);
    }

    private CancelamentoTO a(CancelamentoTO cancelamentoTO) throws DSENBusinessException {
        try {
            this.a().update((Serializable)DSENBusinessConverter.getCancelamentoEntity((CancelamentoTO)cancelamentoTO));
        }
        catch (DSENConverterException e) {
            cancelamentoTO.addError(MessageFormat.format(DSENMessageConstants.MSG_NFE_CANCELADA_ERRO, cancelamentoTO.getNumeroProtocolo()));
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            cancelamentoTO.addError(MessageFormat.format(DSENMessageConstants.MSG_NFE_CANCELADA_ERRO, cancelamentoTO.getNumeroProtocolo()));
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return cancelamentoTO;
    }

    private void a(EmitenteTO emitenteTO, Date dataProcessamento) throws DSENBusinessException {
        PropriedadeTO propriedadeTO = new PropriedadeTO();
        propriedadeTO.setEmitenteTO(emitenteTO);
        propriedadeTO.setPropriedadeEnum(PropriedadeEnum.DATA_ULTIMA_BUSCA_SEFAZ);
        PropriedadeBusiness propriedadeBusiness = this.a();
        PropriedadeTO propriedadeTOPesquisado = propriedadeBusiness.pesquisarPropriedade(propriedadeTO);
        if (propriedadeTOPesquisado != null) {
            propriedadeTO = propriedadeTOPesquisado;
        }
        propriedadeTO.setValor("" + dataProcessamento.getTime() + "");
        propriedadeBusiness.alterarPropriedade(propriedadeTO);
        this.a.debug((Object)("Ultima busca retorno atualizada para " + dataProcessamento));
    }

    private boolean a(NotaFiscalTO notaFiscalTO, TRetConsSitNFe retConsSitNFe) throws DSENCommonException {
        TProcEvento[] eventosArray = retConsSitNFe.getProcEventoNFeArray();
        if (eventosArray == null || eventosArray.length == 0) {
            return false;
        }
        boolean atualizado = false;
        switch (1.c[notaFiscalTO.getSituacao().ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                HashMap<String, EventoTO> notaIdEventoMap = new HashMap<String, EventoTO>();
                if (notaFiscalTO.getEventoTOList() != null) {
                    for (EventoTO eventoTO : notaFiscalTO.getEventoTOList()) {
                        ProcEventoNFeDocument procEventoDocument = DocumentoUtil.getProcEventoNFeDocument((String)eventoTO.getXmlProcString());
                        notaIdEventoMap.put(procEventoDocument.getProcEventoNFe().getEvento().getInfEvento().getId(), eventoTO);
                    }
                }
                block7 : for (TProcEvento procEvento : eventosArray) {
                    TipoEventoEnum tipoEventoEnum = TipoEventoEnum.getEnumPeloCodigo((String)procEvento.getEvento().getInfEvento().getTpEvento());
                    switch (1.b[tipoEventoEnum.ordinal()]) {
                        case 1: 
                        case 2: {
                            continue block7;
                        }
                        default: {
                            EventoTO eventoTONota = (EventoTO)notaIdEventoMap.get(procEvento.getEvento().getInfEvento().getId());
                            EventoTO eventoTO = DocumentoUtil.getEventoTO((NotaFiscalTO)notaFiscalTO, (TProcEvento)procEvento);
                            if (eventoTONota == null) {
                                if (notaFiscalTO.getEventoTOList() == null) {
                                    notaFiscalTO.setEventoTOList(new ArrayList());
                                }
                                notaFiscalTO.getEventoTOList().add(eventoTO);
                                atualizado = true;
                                continue block7;
                            }
                            if (!eventoTONota.getDataEvento().equals(eventoTO.getDataEvento())) {
                                eventoTONota.setDataEvento(eventoTO.getDataEvento());
                                atualizado = true;
                            }
                            if (eventoTONota.getDataRegEvento() == null ^ eventoTO.getDataRegEvento() == null || eventoTONota.getDataRegEvento() != null && !eventoTONota.getDataRegEvento().equals(eventoTO.getDataRegEvento())) {
                                eventoTONota.setDataRegEvento(eventoTO.getDataRegEvento());
                                atualizado = true;
                            }
                            if (eventoTONota.getNumProtocolo() == null ^ eventoTO.getNumProtocolo() == null || eventoTONota.getNumProtocolo() != null && !eventoTONota.getNumProtocolo().equals(eventoTO.getNumProtocolo())) {
                                eventoTONota.setNumProtocolo(eventoTO.getNumProtocolo());
                                atualizado = true;
                            }
                            if (eventoTONota.getXmlProcString().equals(eventoTO.getXmlProcString())) continue block7;
                            eventoTONota.setXmlProcString(eventoTO.getXmlProcString());
                            atualizado = true;
                        }
                    }
                }
                break;
            }
        }
        return atualizado;
    }

    private void a(NotaFiscalTO notaFiscalTO, TRetConsSitNFe retConsSitNFe, boolean persist) throws DSENBusinessException {
        try {
            String situacao = retConsSitNFe.getCStat();
            TProtNFe protNFe = retConsSitNFe.getProtNFe();
            TRetCancNFe retCancNFe = retConsSitNFe.getRetCancNFe();
            String digValNFe = DocumentoUtil.getDigestValue((NotaFiscalTO)notaFiscalTO);
            if (digValNFe != null && protNFe != null && protNFe.getInfProt() != null && protNFe.getInfProt().getDigVal() != null && !digValNFe.equals(new String(protNFe.getInfProt().getDigVal()))) {
                notaFiscalTO.setMensagemErro(DSENMessageConstants.DIGEST_VALUE_DIFERE_CADASTRADO);
                notaFiscalTO.addError(notaFiscalTO.getMensagemErro());
                return;
            }
            if (DSENConstants.CODIGO_AUTORIZACAO.equals(situacao) || DSENConstants.CODIGO_AUTORIZADO_FORA_PRAZO.equals(situacao)) {
                if (SituacaoNFeEnum.AUTORIZADA.equals((Object)notaFiscalTO.getSituacao())) {
                    notaFiscalTO.addMessage(SituacaoNFeEnum.AUTORIZADA.getDescricao());
                    boolean atualizado = this.a(notaFiscalTO, retConsSitNFe);
                    if (persist && atualizado) {
                        this.a().update((Serializable)DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO));
                        notaFiscalTO.setAtualizadaPelaConsulta(true);
                    }
                    return;
                }
                if (protNFe == null) {
                    notaFiscalTO.setMensagemErro("Erro na Resposta da SEFAZ, n\u00e3o existe a tag protNFe.");
                    notaFiscalTO.addError(notaFiscalTO.getMensagemErro());
                    return;
                }
                notaFiscalTO.setDataProtocolo(DateHelper.getDateTime((String)protNFe.getInfProt().getDhRecbto().toString(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
                notaFiscalTO.setDataAutorizacao(notaFiscalTO.getDataProtocolo());
                if (!StringHelper.isBlankOrNull((Object)protNFe.getInfProt().getNProt())) {
                    notaFiscalTO.setNumeroProtocolo(protNFe.getInfProt().getNProt());
                }
                notaFiscalTO.setProtocoloString(DocumentoUtil.getProtocoloNFeConsultaSituacao((TProtNFe)protNFe));
                notaFiscalTO.setSituacao(SituacaoNFeEnum.AUTORIZADA);
                notaFiscalTO.addMessage(SituacaoNFeEnum.AUTORIZADA.getDescricao());
                notaFiscalTO.setCodigoErro(situacao);
                notaFiscalTO.setMensagemErro(retConsSitNFe.getXMotivo());
            } else if (DSENConstants.CODIGO_DENEGADO.equals(situacao) || DSENConstants.CODIGO_DENEGADO_EMITENTE.equals(situacao) || DSENConstants.CODIGO_DENEGADO_DESTINATARIO.equals(situacao)) {
                if (SituacaoNFeEnum.DENEGADA.equals((Object)notaFiscalTO.getSituacao())) {
                    notaFiscalTO.addMessage(SituacaoNFeEnum.DENEGADA.getDescricao());
                    boolean atualizado = this.a(notaFiscalTO, retConsSitNFe);
                    if (persist && atualizado) {
                        this.a().update((Serializable)DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO));
                        notaFiscalTO.setAtualizadaPelaConsulta(true);
                    }
                    return;
                }
                if (protNFe == null) {
                    notaFiscalTO.setMensagemErro("Erro na Resposta da SEFAZ, n\u00e3o existe a tag protNFe.");
                    notaFiscalTO.addError(notaFiscalTO.getMensagemErro());
                    return;
                }
                notaFiscalTO.setDataProtocolo(DateHelper.getDateTime((String)protNFe.getInfProt().getDhRecbto().toString(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT));
                if (!StringHelper.isBlankOrNull((Object)protNFe.getInfProt().getNProt())) {
                    notaFiscalTO.setNumeroProtocolo(protNFe.getInfProt().getNProt());
                }
                notaFiscalTO.setProtocoloString(DocumentoUtil.getProtocoloNFeConsultaSituacao((TProtNFe)protNFe));
                notaFiscalTO.setSituacao(SituacaoNFeEnum.DENEGADA);
                notaFiscalTO.addMessage(SituacaoNFeEnum.DENEGADA.getDescricao());
                notaFiscalTO.setCodigoErro(situacao);
                notaFiscalTO.setMensagemErro(retConsSitNFe.getXMotivo());
            } else if (DSENConstants.CODIGO_CANCELAMENTO.equals(situacao) || DSENConstants.CODIGO_CANCELAMENTO_FORA_PRAZO.equals(situacao) || DSENConstants.CODIGO_CANCELAMENTO_EVENTO_FORA_PRAZO.equals(situacao)) {
                if (SituacaoNFeEnum.CANCELADA.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.CANCELADA_EVENTO.equals((Object)notaFiscalTO.getSituacao())) {
                    notaFiscalTO.addMessage(SituacaoNFeEnum.CANCELADA.getDescricao());
                    boolean atualizado = this.a(notaFiscalTO, retConsSitNFe);
                    if (persist && atualizado) {
                        this.a().update((Serializable)DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO));
                        notaFiscalTO.setAtualizadaPelaConsulta(true);
                    }
                    return;
                }
                if (SituacaoNFeEnum.CANCELADA.equals((Object)notaFiscalTO.getSituacao())) {
                    if (retCancNFe == null) {
                        notaFiscalTO.setMensagemErro("Erro na Resposta da SEFAZ, n\u00e3o existe a tag retCancNFe.");
                        notaFiscalTO.addError(notaFiscalTO.getMensagemErro());
                        return;
                    }
                } else {
                    notaFiscalTO.addMessage(SituacaoNFeEnum.CANCELADA_EVENTO.getDescricao());
                    notaFiscalTO.setSituacao(SituacaoNFeEnum.CANCELADA_EVENTO);
                }
            } else if (DSENConstants.CODIGO_NAO_CONSTA_SEFAZ.equals(situacao)) {
                notaFiscalTO.setCodigoErro(situacao);
                if (notaFiscalTO.getSituacao() == null || SituacaoNFeEnum.EM_DIGITACAO.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.VALIDADA.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.ASSINADA.equals((Object)notaFiscalTO.getSituacao())) {
                    notaFiscalTO.setMensagemErro(retConsSitNFe.getXMotivo());
                    notaFiscalTO.addError(retConsSitNFe.getXMotivo());
                    return;
                }
                notaFiscalTO.setSituacao(SituacaoNFeEnum.ASSINADA);
                notaFiscalTO.setCodigoErro(null);
                notaFiscalTO.setMensagemErro(DSENMessageConstants.MSG_NFE_INEXISTENTE_SITUACAO_ALTERADA_ASSINADA);
                notaFiscalTO.addError(DSENMessageConstants.MSG_NFE_INEXISTENTE_SITUACAO_ALTERADA_ASSINADA);
            } else {
                notaFiscalTO.setSituacao(SituacaoNFeEnum.REJEITADA);
                notaFiscalTO.setNumeroProtocolo(null);
                notaFiscalTO.setDataProtocolo(null);
                notaFiscalTO.setDataAutorizacao(null);
                notaFiscalTO.setProtocoloString(null);
                notaFiscalTO.setCodigoErro(situacao);
                notaFiscalTO.setMensagemErro(retConsSitNFe.getXMotivo());
                notaFiscalTO.addError(retConsSitNFe.getXMotivo());
            }
            this.a(notaFiscalTO, retConsSitNFe);
            if (persist) {
                this.a().update((Serializable)DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO));
                notaFiscalTO.setAtualizadaPelaConsulta(true);
            }
            return;
        }
        catch (DSENConverterException e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENCommonException e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (Exception e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    @DSGETransaction
    public void enviarEvento(EventoTO eventoTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        boolean isSefaz = !TipoEmissaoEnum.CONTINGENCIA_SCAN.equals((Object)eventoTO.getNotaFiscalTO().getTipoEmissao());
        String wsReceptor = isSefaz ? DSENMessageConstants.MSG_WS_SEFAZ : DSENMessageConstants.MSG_WS_RFB;
        GrupoNotificacaoEnum grupoNotificacaoErroResposta = isSefaz ? GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_EVENTO : GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_EVENTO;
        GrupoNotificacaoEnum grupoNotificacaoErroConexao = isSefaz ? GrupoNotificacaoEnum.ERRO_CONEXAO_EVENTO_SEFAZ : GrupoNotificacaoEnum.ERRO_CONEXAO_EVENTO_SCAN;
        try {
            EstadoTO emitenteEstadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteTO.getUf());
            ScanHelper scanHelper = new ScanHelper();
            EstadoTO estadoTO = (eventoTO.getNotaFiscalTO().getTipoEmissao() == TipoEmissaoEnum.CONTINGENCIA_SVC_AN || eventoTO.getNotaFiscalTO().getTipoEmissao() == TipoEmissaoEnum.CONTINGENCIA_SVC_RS || eventoTO.getNotaFiscalTO().getTipoEmissao() == TipoEmissaoEnum.CONTINGENCIA_SCAN) && eventoTO.getTpEvento() == TipoEventoEnum.e110110 ? emitenteEstadoTO : scanHelper.getEstadoTO(emitenteEstadoTO, isSefaz, eventoTO.getNotaFiscalTO().getTipoEmissao());
            String urlSefaz = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.RecepcaoEvento);
            if (StringHelper.isBlankOrNull((Object)urlSefaz)) {
                this.a((Object)MessageFormat.format(DSENMessageConstants.UF_NAO_HABILITADA_RECEPCAO_EVENTOS, estadoTO.getSigla()), eventoTO, GrupoNotificacaoEnum.UF_NAO_HABILITADA);
                return;
            }
            ConsultaStatusServicoHelper consultaStatusServicoHelper = new ConsultaStatusServicoHelper();
            boolean statusServicoOK = consultaStatusServicoHelper.consultarStatusServico(emitenteEstadoTO, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey(), ServicoSefazEnum.StatusServico, isSefaz, eventoTO.getNotaFiscalTO().getTipoEmissao());
            if (!statusServicoOK) {
                this.a((Object)null, eventoTO, GrupoNotificacaoEnum.ERRO_FATAL);
                return;
            }
            String xmlEnvio = this.a(eventoTO, emitenteEstadoTO, certificadoTO, emitenteTO);
            eventoTO.setDocXmlString(xmlEnvio);
            String retornoXML = this.a().servico(DocumentoUtil.criarCabecalhoMensagem((ServicoSefazEnum)ServicoSefazEnum.RecepcaoEvento, (String)emitenteEstadoTO.getCodigo(), (String)DSENProperties.getInstance().getVersaoSchemaEventos()), xmlEnvio, estadoTO, ServicoSefazEnum.RecepcaoEvento, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey());
            WSStatusRetorno retornoEnum = DocumentoUtil.validarXmlRetornoEvento((String)retornoXML, (EventoTO)eventoTO);
            switch (1.a[retornoEnum.ordinal()]) {
                case 1: {
                    Notificador.getInstance().notificar((Object)new ErroXmlResposta(ServicoSefazEnum.RecepcaoEvento, urlSefaz, xmlEnvio, retornoXML, wsReceptor), new EnumItf[]{grupoNotificacaoErroResposta});
                    eventoTO.addError(MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, wsReceptor));
                    break;
                }
                case 2: {
                    eventoTO.addError(MessageFormat.format(DSENMessageConstants.EVENTO_NAO_REGISTRADO_REJEICAO, eventoTO.getCErro(), eventoTO.getMensagemErro()));
                    break;
                }
                default: {
                    NotaFiscalTO notafiscalTO = eventoTO.getNotaFiscalTO();
                    DocumentoUtil.setProtocoloEvento((EventoTO)eventoTO, (String)retornoXML);
                    ProcEventoNFeDocument e = DocumentoUtil.getProcEventoNFeDocument((String)eventoTO.getXmlProcString());
                    if (notafiscalTO.getEventoTOList() == null) {
                        notafiscalTO.setEventoTOList(new ArrayList());
                    }
                    notafiscalTO.getEventoTOList().add(eventoTO);
                    if (notafiscalTO.getIdNotaFiscal() != null) {
                        notafiscalTO = this.a().alterar(notafiscalTO);
                    } else {
                        notafiscalTO.setDataEmissao(new Date());
                    }
                    eventoTO.addMessage(MessageFormat.format(DSENMessageConstants.MSG_EVENTO_ENVIADO_OK, eventoTO.getTpEvento().getDescricao()));
                    TipoEventoEnum tipoEventoEnum = TipoEventoEnum.getEnumPeloCodigo((String)eventoTO.getTpEvento().getCodigo());
                    switch (1.b[tipoEventoEnum.ordinal()]) {
                        case 3: {
                            notafiscalTO.setSituacao(SituacaoNFeEnum.CANCELADA_EVENTO);
                            notafiscalTO.setDataSistema(new Date());
                            notafiscalTO = this.a().alterar(notafiscalTO);
                        }
                    }
                }
            }
            Notificador.getInstance().notificar((Object)eventoTO, new EnumItf[]{GrupoNotificacaoEnum.EVENTO_ENVIADO});
        }
        catch (DSGEConnectionClientException e) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_CLIENT, wsReceptor), eventoTO, grupoNotificacaoErroConexao);
            this.a(eventoTO, certificadoTO, isSefaz);
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEConnectionServerException e) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_SERVER, wsReceptor), eventoTO, grupoNotificacaoErroConexao);
            this.a(eventoTO, certificadoTO, isSefaz);
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGETimeoutException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_CONEXAO_TIMEOUT, eventoTO, grupoNotificacaoErroConexao);
            this.a(eventoTO, certificadoTO, isSefaz);
            this.a.error((Object)e.getMessage());
        }
        catch (DSGESocketException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_SOCKET, eventoTO, grupoNotificacaoErroConexao);
            this.a(eventoTO, certificadoTO, isSefaz);
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEProxyException e) {
            this.a((Object)DSENMessageConstants.MSG_WS_PROXY, eventoTO, GrupoNotificacaoEnum.ERRO_FATAL);
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEWebServiceException e) {
            this.a((Object)new DSENBusinessException((DSGEBaseException)e, e.getMessage()), eventoTO, GrupoNotificacaoEnum.EXCEPTION);
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            this.a((Object)new DSENBusinessException((DSGEBaseException)e, e.getMessage()), eventoTO, GrupoNotificacaoEnum.EXCEPTION);
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (Throwable e) {
            e.printStackTrace();
            this.a((Object)new DSENBusinessException(e, e.getMessage()), eventoTO, GrupoNotificacaoEnum.EXCEPTION);
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException(e, e.getMessage());
        }
    }

    private String a(EventoTO eventoTO, EstadoTO estadoTO, CertificadoTO certificadoTO, EmitenteTO emitenteTO) throws DSGECertificadoException, DSENCommonException {
        try {
            if (eventoTO.getnSeqEvento() == null) {
                eventoTO.setnSeqEvento(Integer.valueOf(DocumentoUtil.recuperarProximoNSeqEvento((EventoTO)eventoTO)));
            }
            Certificado certificado = new Certificado();
            String xmlString = DocumentoUtil.criarXMLEnvioEvento((EventoTO)eventoTO, (String)estadoTO.getCodigo());
            if (eventoTO.getDocXmlString() == null) {
                eventoTO.setDocXmlString(xmlString);
            }
            String xmlAssinado = certificado.assinarXML(certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey(), DocumentoUtil.criarIdDocumentoEvento((EventoTO)eventoTO), DocumentoUtil.criarXMLEnvioEvento((EventoTO)eventoTO, (String)estadoTO.getCodigo()), emitenteTO.getNrDocumento(), "evento");
            return xmlAssinado;
        }
        catch (Throwable e) {
            this.a.error((Object)e);
            throw new DSENCommonException(e, e.getMessage());
        }
    }
}

