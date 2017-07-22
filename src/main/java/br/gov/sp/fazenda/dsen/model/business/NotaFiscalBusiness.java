/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.NumeracaoTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DSENXSLTConverter
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NumeracaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.business.util.NotaFiscalBuilderBusiness
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidation
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationItf
 *  br.gov.sp.fazenda.dsen.model.dao.NotaFiscalDAO
 *  br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndPag
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$IndPag$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpEmis
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpEmis$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpImp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpImp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi$Enum
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.apache.xmlbeans.XmlException
 *  org.apache.xmlbeans.XmlObject
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.LoteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.NumeracaoTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DSENXSLTConverter;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.NumeracaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.business.util.NotaFiscalBuilderBusiness;
import br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidation;
import br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationItf;
import br.gov.sp.fazenda.dsen.model.dao.NotaFiscalDAO;
import br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity;
import br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TAmb;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TCodUfIBGE;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TMod;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TProcEmi;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NotaFiscalBusiness {
    private NotaFiscalDAO a;
    private PesquisaDAO a;
    private InutilizacaoBusiness a;
    private NumeracaoBusiness a;
    private NotaFiscalBuilderBusiness a = new PesquisaDAO();
    private static Log a = LogFactory.getLog(NotaFiscalBusiness.class);

    @DSGETransaction
    public NotaFiscalTO assinar(NotaFiscalTO notaFiscalTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        try {
            boolean numeroBytesValido = this.validarMaximoBytes(notaFiscalTO);
            if (!numeroBytesValido) {
                return notaFiscalTO;
            }
            Certificado certificado = new Certificado();
            String referenceURI = DSENConstants.ID_NFE + ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO);
            String xmlAssinado = certificado.assinarXML(certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey(), referenceURI, notaFiscalTO.getDocXmlString(), notaFiscalTO.getEmitenteTO().getNrDocumento());
            notaFiscalTO.setDocXmlString(xmlAssinado);
            notaFiscalTO.setSituacao(SituacaoNFeEnum.ASSINADA);
            notaFiscalTO = this.alterarSemTransaction(notaFiscalTO);
            if (notaFiscalTO.getErrors() != null) {
                return notaFiscalTO;
            }
            notaFiscalTO.addMessage(DSENMessageConstants.NOTA_FISCAL_ASSINADA_COM_SUCESSO);
            return notaFiscalTO;
        }
        catch (DSGECertificadoException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public List<NotaFiscalTO> assinar(List<NotaFiscalTO> listaNotaFiscalTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        ArrayList<NotaFiscalTO> listaConhecimentoTO = new ArrayList<NotaFiscalTO>();
        for (int i = 0; i < listaNotaFiscalTO.size(); ++i) {
            if (listaNotaFiscalTO.get(i).getSituacao() != SituacaoNFeEnum.VALIDADA) continue;
            listaConhecimentoTO.add(this.assinar(listaNotaFiscalTO.get(i), certificadoTO));
        }
        return listaConhecimentoTO;
    }

    @DSGETransaction
    public List<NotaFiscalTO> excluir(List<NotaFiscalTO> listaNotaFiscalTO) throws DSENBusinessException {
        ArrayList<NotaFiscalTO> excluidos = new ArrayList<NotaFiscalTO>();
        if (listaNotaFiscalTO != null) {
            for (NotaFiscalTO transporteTO : listaNotaFiscalTO) {
                if (SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ.equals((Object)transporteTO.getSituacao()) || SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA.equals((Object)transporteTO.getSituacao())) {
                    transporteTO.addError(MessageFormat.format(DSENMessageConstants.MSG_NAO_E_PERMITIDO_EXCLUIR_NFE_NA_SITUACAO_X, transporteTO.getSituacao().toString()));
                    continue;
                }
                if (SituacaoNFeEnum.ASSINADA.equals((Object)transporteTO.getSituacao()) && transporteTO.getDanfeImpresso().booleanValue()) {
                    transporteTO.addError(MessageFormat.format(DSENMessageConstants.MSG_NAO_E_PERMITIDO_EXCLUIR_NFE_NA_SITUACAO_X_COM_DANFE_IMPRESSO, transporteTO.getSituacao().toString()));
                    continue;
                }
                try {
                    NotaFiscalEntity entity = DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)transporteTO);
                    this.a().delete((Serializable)entity);
                    transporteTO.addMessage(MessageFormat.format(DSENMessageConstants.EXCLUIDO_COM_SUCESSO, "" + listaNotaFiscalTO.size() + " NF-e(s)"));
                }
                catch (DSENConverterException ex) {
                    throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
                }
                catch (DSGEDAOException ex) {
                    throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
                }
                excluidos.add(transporteTO);
            }
        }
        return excluidos;
    }

    @DSGETransaction
    public void excluirNotasFiscaisInutilizadas(InutilizacaoTO inutilizacaoTO) throws DSENBusinessException {
        try {
            this.a().excluirNotasFiscaisInutilizadas(DSENBusinessConverter.getInutilizacaoEntity((InutilizacaoTO)inutilizacaoTO));
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    @DSGETransaction
    public NotaFiscalTO editar(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            if (SituacaoNFeEnum.ASSINADA.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.REJEITADA.equals((Object)notaFiscalTO.getSituacao())) {
                DocumentoUtil.excluirAssinatura((NotaFiscalTO)notaFiscalTO);
            }
            notaFiscalTO.setCodigoErro(null);
            notaFiscalTO.setMensagemErro(null);
            notaFiscalTO.setSituacao(SituacaoNFeEnum.EM_DIGITACAO);
            notaFiscalTO.setNumeroProtocolo(null);
            notaFiscalTO.setDataProtocolo(null);
            notaFiscalTO.setDataAutorizacao(null);
            notaFiscalTO.setAutorizacaoExportadaXml(Boolean.FALSE);
            return this.alterarSemTransaction(notaFiscalTO);
        }
        catch (UnsupportedEncodingException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (XmlException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    @DSGETransaction
    public NotaFiscalTO duplicar(NotaFiscalTO notaFiscalTO, String novaSerie, String novoNumero) throws DSENBusinessException {
        try {
            NotaFiscalTO clone = DSENBusinessConverter.getNotaFiscalTO((NotaFiscalEntity)DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO), (boolean)false);
            clone.setCancelamentoTO(null);
            DocumentoUtil.excluirAssinatura((NotaFiscalTO)clone);
            clone.setProtocoloString(null);
            clone.setNumeroRecibo(null);
            clone.setCodigoErro(null);
            clone.setMensagemErro(null);
            clone.setSituacao(SituacaoNFeEnum.EM_DIGITACAO);
            clone.setNumeroProtocolo(null);
            clone.setAutorizacaoExportadaXml(Boolean.FALSE);
            clone.setSerie(novaSerie);
            clone.setNumero(novoNumero);
            clone.setDanfeImpresso(Boolean.valueOf(false));
            clone.setDataAutorizacao(null);
            clone.setDataProtocolo(null);
            clone.setDataRegistroDPEC(null);
            clone.setDataSistema(new Date());
            clone.setIdNotaFiscal(null);
            clone.setLoteTO(null);
            clone.setEventoTOList(null);
            NFeDocument nfeDocument = DocumentoUtil.getNFeDocument((String)clone.getDocXmlString());
            nfeDocument.getNFe().getInfNFe().getIde().setSerie(String.valueOf(Integer.parseInt(clone.getSerie())));
            nfeDocument.getNFe().getInfNFe().getIde().setNNF(String.valueOf(Integer.parseInt(clone.getNumero())));
            try {
                nfeDocument.getNFe().getInfNFe().setId("NFe" + ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)clone));
            }
            catch (Throwable t) {
                nfeDocument.getNFe().getInfNFe().setId("NFe");
            }
            try {
                nfeDocument.getNFe().getInfNFe().getIde().setCDV(ChaveAcessoUtil.gerarDigitoChaveAcesso((NotaFiscalTO)clone));
            }
            catch (Throwable t) {
                nfeDocument.getNFe().getInfNFe().getIde().setCDV(null);
            }
            clone.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfeDocument, (boolean)true));
            return this.salvarSemTransaction(clone);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (Throwable e) {
            throw new DSENBusinessException(e, e.getMessage());
        }
    }

    public NotaFiscalTO detalhar(NotaFiscalTO nfeTO) throws DSENBusinessException {
        if (nfeTO == null) {
            return null;
        }
        NotaFiscalTO detalheNotaFiscal = this.pesquisarPorId(nfeTO.getIdNotaFiscal());
        if (detalheNotaFiscal == null || StringHelper.isBlankOrNull((Object)detalheNotaFiscal.getDocXmlString())) {
            detalheNotaFiscal.addError(DSENMessageConstants.NOTA_FISCAL_SEM_DETALHES);
        }
        return detalheNotaFiscal;
    }

    public List<NotaFiscalTO> detalhar(List<NotaFiscalTO> notaTOList) throws DSENBusinessException {
        ArrayList<NotaFiscalTO> detalhados = new ArrayList<NotaFiscalTO>();
        if (notaTOList == null) {
            return detalhados;
        }
        for (NotaFiscalTO notaTO : notaTOList) {
            detalhados.add(this.detalhar(notaTO));
        }
        return detalhados;
    }

    private boolean a(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        if (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getNumero()) && Integer.parseInt(notaFiscalTO.getNumero()) == 0) {
            notaFiscalTO.addError(MessageFormat.format(DSENMessageConstants.NOTA_FISCAL_NUMERO_NAO_DISPONIVEL, notaFiscalTO.getSerie(), notaFiscalTO.getNumero()));
            return false;
        }
        NotaFiscalTO transporteTO = this.pesquisarPorSerieNumeroEmitente(notaFiscalTO);
        if (transporteTO != null) {
            notaFiscalTO.addError(MessageFormat.format(DSENMessageConstants.NOTA_FISCAL_NUMERO_NAO_DISPONIVEL, notaFiscalTO.getSerie(), notaFiscalTO.getNumero()));
            return false;
        }
        boolean inutilizado = this.a().numeroInutilizado(notaFiscalTO.getEmitenteTO().getIdEmitente(), notaFiscalTO.getSerie(), notaFiscalTO.getNumero());
        if (inutilizado) {
            notaFiscalTO.addError(MessageFormat.format(DSENMessageConstants.NOTA_FISCAL_NUMERO_INUTILIZADO, notaFiscalTO.getSerie(), notaFiscalTO.getNumero()));
            return false;
        }
        return true;
    }

    private boolean a(NotaFiscalEntity notaFiscalEntity) throws DSENBusinessException {
        NotaFiscalEntity NFePesquisado;
        if (notaFiscalEntity.getIdNotaFiscal() == null) {
            return true;
        }
        try {
            NFePesquisado = this.a().pesquisarPorId(notaFiscalEntity.getIdNotaFiscal());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return !notaFiscalEntity.getSerie().equals(NFePesquisado.getSerie()) || !notaFiscalEntity.getNumero().equals(NFePesquisado.getNumero());
    }

    @DSGETransaction
    public NotaFiscalTO salvar(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        return this.salvarSemTransaction(notaFiscalTO);
    }

    public NotaFiscalTO salvarSemTransaction(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            notaFiscalTO.setAutorizacaoExportadaXml(Boolean.valueOf(false));
            NotaFiscalEntity notaFiscalEntity = DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO);
            boolean isNovoNumeroNFe = this.a(notaFiscalEntity);
            if (isNovoNumeroNFe && !this.a(notaFiscalTO)) {
                return notaFiscalTO;
            }
            if (notaFiscalTO.getErrors() != null) {
                return notaFiscalTO;
            }
            boolean numeroBytesNotaFiscalValido = this.validarMaximoBytes(notaFiscalTO);
            if (!numeroBytesNotaFiscalValido) {
                return notaFiscalTO;
            }
            NotaFiscalTO nfeTOAtualizada = this.alterarSemTransaction(notaFiscalTO);
            if (isNovoNumeroNFe) {
                this.a().alterar(nfeTOAtualizada);
            }
            if (notaFiscalTO.getSituacao() != SituacaoNFeEnum.VALIDADA) {
                nfeTOAtualizada.addMessage(MessageFormat.format(DSENMessageConstants.NFE_SALVA_COM_SUCESSO, nfeTOAtualizada.getSerie(), nfeTOAtualizada.getNumero(), nfeTOAtualizada.getAno()));
            }
            return nfeTOAtualizada;
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    private boolean b(NotaFiscalTO notaFiscalTO) {
        if (StringHelper.isBlankOrNull((Object)notaFiscalTO.getCodigoUfEmitente())) {
            notaFiscalTO.addError(DSENMessageConstants.UF_EMITENTE_NAO_INFORMADA);
            return false;
        }
        if (StringHelper.isBlankOrNull((Object)notaFiscalTO.getUfDest())) {
            notaFiscalTO.addError(DSENMessageConstants.UF_EMITENTE_NAO_INFORMADA);
            return false;
        }
        return true;
    }

    @DSGETransaction
    public NotaFiscalTO alterar(NotaFiscalTO notaFiscal) throws DSENBusinessException {
        return this.alterarSemTransaction(notaFiscal);
    }

    public NotaFiscalTO alterarSemTransaction(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            if (StringHelper.isBlankOrNull((Object)notaFiscalTO.getVersao())) {
                notaFiscalTO.setVersao(DSENProperties.getInstance().getVersaoSchema());
            }
            notaFiscalTO.setDataSistema(new Date());
            NotaFiscalEntity notaFiscalEntity = DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO);
            this.a().update((Serializable)notaFiscalEntity);
            notaFiscalEntity = this.a().pesquisarPorSerieNumeroEmitente(notaFiscalEntity);
            notaFiscalTO = DSENBusinessConverter.getNotaFiscalTO((NotaFiscalEntity)notaFiscalEntity, (boolean)false);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return notaFiscalTO;
    }

    public NotaFiscalTO pesquisarPorId(Long id) throws DSENBusinessException {
        try {
            return DSENBusinessConverter.getNotaFiscalTO((NotaFiscalEntity)this.a().pesquisarPorId(id), (boolean)false);
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    public List getSerieNumeroAnoPorSituacoes(Integer idEmitente, String serie, String numeroInicial, String numeroFinal, List<SituacaoNFeEnum> situacoes) throws DSENBusinessException {
        try {
            return this.a().getSerieNumeroAnoPorSituacoes(idEmitente, serie, numeroInicial, numeroFinal, situacoes);
        }
        catch (Throwable e) {
            throw new DSENBusinessException(e, e.getMessage());
        }
    }

    public NotaFiscalTO validar(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            NotaFiscalValidationItf notaFiscalValidation = NotaFiscalValidation.getInstance();
            NFeDocument nfeDocument = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
            boolean codigoNumericoGeradoAutomaticamente = false;
            if (StringHelper.isBlankOrNull((Object)notaFiscalTO.getCodigoNumericoChaveAcesso()) || notaFiscalTO.getCodigoNumericoChaveAcesso().length() != 8) {
                notaFiscalTO.setCodigoNumericoChaveAcesso(ChaveAcessoUtil.gerarCodigoNumerico((NotaFiscalTO)notaFiscalTO));
                codigoNumericoGeradoAutomaticamente = true;
            }
            notaFiscalTO.setDigitoChaveAcesso(ChaveAcessoUtil.gerarDigitoChaveAcesso((String)ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO)));
            nfeDocument.getNFe().getInfNFe().getIde().setCNF(notaFiscalTO.getCodigoNumericoChaveAcesso());
            nfeDocument.getNFe().getInfNFe().getIde().setCDV(notaFiscalTO.getDigitoChaveAcesso());
            nfeDocument.getNFe().getInfNFe().setId(DSENConstants.ID_NFE + ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)notaFiscalTO));
            notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfeDocument, (boolean)true));
            boolean totalNotaCalculadoIgualInformado = this.a(notaFiscalTO, this.a());
            nfeDocument = DocumentoUtil.getNFeDocument((String)notaFiscalTO.getDocXmlString());
            notaFiscalTO = notaFiscalValidation.validarDocumentoNotaFiscalXML(notaFiscalTO, nfeDocument);
            if (notaFiscalTO.getListaErroNFe().size() == 0) {
                notaFiscalTO = notaFiscalValidation.validarNotaFiscal(notaFiscalTO, nfeDocument);
            }
            if (notaFiscalTO.getListaErroNFe().size() == 0) {
                notaFiscalTO = notaFiscalValidation.executarValidacaoXMLBeans(notaFiscalTO, nfeDocument);
            }
            if (notaFiscalTO.getListaErroNFe().size() != 0) {
                notaFiscalTO.addError(MessageFormat.format(DSENMessageConstants.NFE_ANO_SERIE_NUMERO_INVALIDA, notaFiscalTO.getAno(), notaFiscalTO.getSerie(), notaFiscalTO.getNumero()));
                if (codigoNumericoGeradoAutomaticamente) {
                    notaFiscalTO.setCodigoNumericoChaveAcesso(null);
                    notaFiscalTO.setDigitoChaveAcesso(null);
                    DocumentoUtil.excluirCodigoNumerico((NotaFiscalTO)notaFiscalTO);
                }
                return notaFiscalTO;
            }
            if (!totalNotaCalculadoIgualInformado) {
                notaFiscalTO.addMessage(notaFiscalTO.getQuestionTotais());
                notaFiscalTO.setQuestionEnum(QuestionEnum.YES_NO);
                return notaFiscalTO;
            }
            notaFiscalTO.setSituacao(SituacaoNFeEnum.VALIDADA);
            DocumentoUtil.removerNamespaceDeclaration((XmlObject)nfeDocument, (String)"xsi");
            notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfeDocument, (boolean)true));
            notaFiscalTO = this.salvar(notaFiscalTO);
            if (!notaFiscalTO.hasErrors()) {
                notaFiscalTO.addMessage(MessageFormat.format(DSENMessageConstants.NOTA_FISCAL_VALIDADA_COM_SUCESSO, SituacaoNFeEnum.VALIDADA.getDescricao()));
            }
            return notaFiscalTO;
        }
        catch (XmlException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (UnsupportedEncodingException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public List<NotaFiscalTO> validar(List<NotaFiscalTO> listaNotaFiscalTO) throws DSENBusinessException {
        ArrayList<NotaFiscalTO> validados = new ArrayList<NotaFiscalTO>();
        for (NotaFiscalTO nfeTO : listaNotaFiscalTO) {
            if (nfeTO.getSituacao() != SituacaoNFeEnum.EM_DIGITACAO) continue;
            validados.add(this.validar(nfeTO));
        }
        return validados;
    }

    public NotaFiscalTO acrescentarDadosDanfe(NotaFiscalTO nfeTO) throws DSENBusinessException {
        nfeTO.setDanfeImpresso(Boolean.valueOf(true));
        return this.salvar(nfeTO);
    }

    public NotaFiscalTO obterRascunho(EmitenteTO emitenteTO) throws DSENBusinessException, DSGEUtilException {
        Calendar calendar = Calendar.getInstance();
        NotaFiscalTO notaFiscalTO = new NotaFiscalTO();
        notaFiscalTO.setSituacao(SituacaoNFeEnum.EM_DIGITACAO);
        notaFiscalTO.setVersao(DSENProperties.getInstance().getVersaoSchema());
        notaFiscalTO.setDataSistema(calendar.getTime());
        notaFiscalTO.setDataEmissao(calendar.getTime());
        notaFiscalTO.setAno(ChaveAcessoUtil.DATA_MODELO_FORMAT.format(calendar.get(1) % 100));
        notaFiscalTO.setMes(ChaveAcessoUtil.DATA_MODELO_FORMAT.format(calendar.get(2) + 1));
        notaFiscalTO.setModelo(DSENConstants.MODELO_NFE);
        notaFiscalTO.setCodigoUfEmitente(DSENUtilHelper.getInstance().getEstadoTOBySigla(emitenteTO.getUf()).getCodigo());
        notaFiscalTO.setDanfeImpresso(Boolean.FALSE);
        notaFiscalTO.setEmitenteTO(emitenteTO);
        notaFiscalTO.setTipoEmissao(TipoEmissaoEnum.NORMAL);
        NumeracaoTO numeracaoTO = this.a().pesquisarUltimoNumero(emitenteTO);
        Integer serie = numeracaoTO == null ? 1 : new Integer(numeracaoTO.getSerie());
        Integer numero = numeracaoTO == null ? 1 : Integer.parseInt(numeracaoTO.getNumero()) + 1;
        notaFiscalTO.setSerie(ChaveAcessoUtil.SERIE_FORMAT.format(serie));
        notaFiscalTO.setNumero(ChaveAcessoUtil.NUMERO_NFE_FORMAT.format(numero));
        NFeDocument nfeDocument = NFeDocument.Factory.newInstance();
        TNFe tCte = nfeDocument.addNewNFe();
        TNFe.InfNFe infCTe = tCte.addNewInfNFe();
        infCTe.setVersao(notaFiscalTO.getVersao());
        TNFe.InfNFe.Ide ide = infCTe.getIde() == null ? infCTe.addNewIde() : infCTe.getIde();
        ide.setMod(TMod.Enum.forString((String)notaFiscalTO.getModelo()));
        ide.setSerie(serie.toString());
        ide.setNNF(numero.toString());
        ide.setDhEmi(DateHelper.formataDataHora((Date)notaFiscalTO.getDataEmissao(), (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT310));
        ide.setCUF(TCodUfIBGE.Enum.forString((String)notaFiscalTO.getCodigoUfEmitente()));
        ide.setTpAmb(TAmb.Enum.forString((String)DSENProperties.getInstance().getAplicativoTipoAmbiente()));
        ide.setProcEmi(TProcEmi.Enum.forString((String)"3"));
        ide.setVerProc(DSENProperties.getInstance().getAplicativoVersao());
        ide.setTpNF(TNFe.InfNFe.Ide.TpNF.Enum.forString((String)TipoDocumentoNFeEnum.SAIDA.getCodigo()));
        ide.setIndPag(TNFe.InfNFe.Ide.IndPag.Enum.forString((String)FormaPagamentoEnum.A_VISTA.getCodigo()));
        ide.setFinNFe(TFinNFe.Enum.forString((String)FinalidadeEmissaoEnum.NFE_NORMAL.getCodigo()));
        ide.setTpImp(TNFe.InfNFe.Ide.TpImp.Enum.forString((String)TipoImpressaoEnum.RETRATO.getCodigo()));
        ide.setTpEmis(TNFe.InfNFe.Ide.TpEmis.Enum.forString((String)notaFiscalTO.getTipoEmissao().getCodigo()));
        try {
            notaFiscalTO.setDocXmlString(DocumentoUtil.getDocumentString((Object)nfeDocument, (boolean)true));
        }
        catch (UnsupportedEncodingException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        return notaFiscalTO;
    }

    public NotaFiscalTO pesquisarNotaFiscalPorChaveAcesso(ChaveAcessoTO chaveAcessoTO, EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            NotaFiscalEntity notaFiscalEntity = new NotaFiscalEntity();
            notaFiscalEntity.setEmitenteEntity(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO));
            notaFiscalEntity.setAno(chaveAcessoTO.getAno());
            notaFiscalEntity.setMes(chaveAcessoTO.getMes());
            notaFiscalEntity.setModelo(chaveAcessoTO.getModelo());
            notaFiscalEntity.setSerie(chaveAcessoTO.getSerie());
            notaFiscalEntity.setNumero(chaveAcessoTO.getNumeroNFe());
            notaFiscalEntity.setCodigoNumericoChaveAcesso(chaveAcessoTO.getCodigoNumerico());
            notaFiscalEntity.setDigitoChaveAcesso(chaveAcessoTO.getDigito());
            NotaFiscalEntity notaFiscalEntityPesquisado = this.a().pesquisarPorChaveAcesso(notaFiscalEntity);
            if (notaFiscalEntityPesquisado == null) {
                return null;
            }
            return DSENBusinessConverter.getNotaFiscalTO((NotaFiscalEntity)notaFiscalEntityPesquisado, (boolean)false);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            e.printStackTrace();
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    @DSGETransaction
    public int getNumeroNotaFiscalContingenciaDANFE(EmitenteTO emitenteTO, TipoEmissaoEnum tipoEmissaoEnum) throws DSENBusinessException {
        try {
            NotaFiscalEntity notaFiscalEntity = new NotaFiscalEntity();
            notaFiscalEntity.setEmitenteEntity(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO));
            return this.a().getNumeroNotaFiscalContingenciaDANFE(notaFiscalEntity, tipoEmissaoEnum);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public NotaFiscalTO pesquisarPorSerieNumeroEmitente(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            NotaFiscalEntity notaFiscalEntity = new NotaFiscalEntity();
            notaFiscalEntity = DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO);
            notaFiscalEntity = this.a().pesquisarPorSerieNumeroEmitente(notaFiscalEntity);
            notaFiscalTO = DSENBusinessConverter.getNotaFiscalTO((NotaFiscalEntity)notaFiscalEntity, (boolean)false);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return notaFiscalTO;
    }

    public boolean contemNFeChaveAcesso(EmitenteTO emitenteTO, ChaveAcessoTO chaveAcessoTO) throws DSENBusinessException {
        try {
            return this.a().pesquisarPorChaveAcesso(chaveAcessoTO) != null;
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public NotaFiscalTO validarDadosParaConsultarNFeNaoCadastrado(String chaveAcesso) throws DSENBusinessException {
        NotaFiscalTO to = new NotaFiscalTO();
        if (!this.a(to, chaveAcesso)) {
            return to;
        }
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        try {
            ChaveAcessoTO chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso);
            if (this.contemNFeChaveAcesso(emitenteTO, chaveAcessoTO)) {
                to.addError(DSENMessageConstants.MSG_NFE_CONSULTAR_EXISTE_BD);
            }
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        return to;
    }

    public void calcularValorICMS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorICMS(notaFiscalTO);
        }
    }

    public void calcularValorICMSST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorICMSST(notaFiscalTO);
        }
    }

    public void calcularValorIPI(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorIPI(notaFiscalTO);
        }
    }

    public void calcularValorPIS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorPIS(notaFiscalTO);
        }
    }

    public void calcularValorPISST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorPISST(notaFiscalTO);
        }
    }

    public void calcularValorCOFINS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorCOFINS(notaFiscalTO);
        }
    }

    public void calcularValorCOFINSST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorCOFINSST(notaFiscalTO);
        }
    }

    public void calcularValorISSQN(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorISSQN(notaFiscalTO);
        }
    }

    public void calcularValorICMSTransporte(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorICMSTransporte(notaFiscalTO);
        }
    }

    public void calcularValorCIDE(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularValorCIDE(notaFiscalTO);
        }
    }

    public void calcularNotaFiscalTotais(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        NotaFiscalBuilderBusiness notaFiscalBuilder = this.a();
        if (notaFiscalTO.getErrors() == null) {
            notaFiscalBuilder.calcularNotaFiscalTotais(notaFiscalTO);
        }
    }

    private boolean a(NotaFiscalTO notaFiscalTO, NotaFiscalBuilderBusiness notaFiscalBuilder) throws DSENBusinessException {
        try {
            String valorTotalOriginal = XMLUtil.getFirstTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"vNF", (boolean)false, (boolean)false);
            notaFiscalBuilder.calcularNotaFiscalTotais(notaFiscalTO);
            if (StringHelper.isBlankOrNull((Object)valorTotalOriginal)) {
                return true;
            }
            String valorTotalCalculado = XMLUtil.getFirstTagConteudo((String)notaFiscalTO.getDocXmlString(), (String)"vNF", (boolean)false, (boolean)false);
            DocumentoUtil.setValorTotalNotaFiscal((NotaFiscalTO)notaFiscalTO, (String)valorTotalOriginal);
            if (!notaFiscalTO.getTotalVerificado().booleanValue() && !valorTotalCalculado.equals(valorTotalOriginal)) {
                notaFiscalTO.setQuestionTotais(MessageFormat.format(DSENMessageConstants.NOTA_FISCAL_TOTAL_INCONSISTENTE, StringHelper.formataValor((String)valorTotalOriginal, (int)2, (int)2), StringHelper.formataValor((String)valorTotalCalculado, (int)2, (int)2)));
                return false;
            }
            return true;
        }
        catch (UnsupportedEncodingException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (XmlException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public Boolean validarMaximoBytes(NotaFiscalTO nfeTO) throws DSENBusinessException {
        NotaFiscalValidationItf notaFiscalValidation = NotaFiscalValidation.getInstance();
        if (!notaFiscalValidation.validarMaximoBytes(nfeTO.getDocXmlString())) {
            nfeTO.addError(DSENMessageConstants.NOTA_FISCAL_MAXIMO_BYTES);
            return false;
        }
        return true;
    }

    public Integer pesquisarQtdadeNotaFiscalSituacaoNf(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            return this.a().selectQuantityByEmitenteSituacaoNf(DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO));
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    private void a(Object mensagemErro, List<NotaFiscalTO> listaNotaFiscalTO, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum grupoNotificacaoEnum) {
        Notificador.getInstance().notificar((Object)new Object[]{mensagemErro, listaNotaFiscalTO}, new EnumItf[]{grupoNotificacaoEnum});
    }

    private NotaFiscalDAO a() {
        if (this.a == null) {
            this.a = new NotaFiscalDAO();
        }
        return this.a;
    }

    private InutilizacaoBusiness a() {
        if (this.a == null) {
            this.a = new InutilizacaoBusiness();
        }
        return this.a;
    }

    private NumeracaoBusiness a() {
        if (this.a == null) {
            this.a = new NumeracaoBusiness();
        }
        return this.a;
    }

    private NotaFiscalBuilderBusiness a() throws DSENBusinessException {
        if (this.a == null) {
            this.a = new NotaFiscalBuilderBusiness();
        }
        return this.a;
    }

    public void exportarNotaFiscal(List<NotaFiscalTO> listaNotaFiscalTO, ExtensaoArquivoEnum extensaoArquivo, String path) throws DSENBusinessException {
        String tipoArquivo = TipoDocumentoArquivoEnum.NotaFiscal.toString().toUpperCase();
        StringBuffer notasExportadas = new StringBuffer();
        StringBuffer arquivoSaida = new StringBuffer();
        int totalRegistros = listaNotaFiscalTO.size();
        int qtdeRegistrosExportados = 0;
        int qtdeArquivosGerados = 0;
        try {
            if (ExtensaoArquivoEnum.TXT.equals((Object)extensaoArquivo)) {
                for (NotaFiscalTO notaFiscalTO : listaNotaFiscalTO) {
                    try {
                        if (notaFiscalTO == null) continue;
                        if (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocXmlString())) {
                            DSENXSLTConverter converter = new DSENXSLTConverter();
                            String xsltName = System.getProperty("os.name").toUpperCase().indexOf("WINDOWS") >= 0 ? MessageFormat.format(DSENConstants.XSL_NOTA_FISCAL_LAYOUT_WINDOWS, StringHelper.getDigits((String)notaFiscalTO.getVersao())) : MessageFormat.format(DSENConstants.XSL_NOTA_FISCAL_LAYOUT, StringHelper.getDigits((String)notaFiscalTO.getVersao()));
                            InputStream xsltInputStream = this.getClass().getResourceAsStream(xsltName);
                            String notaTXT = converter.transformXmlFile((Reader)new StringReader(notaFiscalTO.getDocXmlString()), xsltInputStream);
                            notasExportadas.append(notaTXT);
                            ++qtdeRegistrosExportados;
                            continue;
                        }
                        this.a(notaFiscalTO, new String[0]);
                    }
                    catch (DSENCommonException e) {
                        a.error((Object)e.getMessage(), (Throwable)e);
                        this.a(notaFiscalTO, new String[0]);
                    }
                }
                if (qtdeRegistrosExportados > 0) {
                    String cabecalho = new String(tipoArquivo + DSENConstants.SEPARADOR_ARQ_TXT + qtdeRegistrosExportados);
                    arquivoSaida.append(cabecalho).append(notasExportadas);
                    if (!ExportacaoHelper.exportar((String)path, (String)arquivoSaida.toString())) {
                        qtdeRegistrosExportados = 0;
                    } else {
                        ++qtdeArquivosGerados;
                    }
                }
            } else {
                for (NotaFiscalTO notaFiscalTO : listaNotaFiscalTO) {
                    try {
                        String nomeArquivo;
                        String nomeArquivo2;
                        List eventoTOList;
                        if (SituacaoNFeEnum.EM_DIGITACAO.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.VALIDADA.equals((Object)notaFiscalTO.getSituacao())) {
                            this.a(notaFiscalTO, new String[]{MessageFormat.format(DSENMessageConstants.MSG_NOTA_FISCAL_NAO_EXPORTADA_XML, new Object[]{notaFiscalTO.getSituacao()})});
                            continue;
                        }
                        if (SituacaoNFeEnum.ASSINADA.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.REJEITADA.equals((Object)notaFiscalTO.getSituacao())) {
                            String string = nomeArquivo = !StringHelper.isBlankOrNull((Object)notaFiscalTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)notaFiscalTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (NotaFiscalTO)notaFiscalTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.nfe);
                            if (ExportacaoHelper.exportar((String)nomeArquivo, (String)notaFiscalTO.getDocXmlString())) {
                                ++qtdeRegistrosExportados;
                                ++qtdeArquivosGerados;
                            }
                        }
                        if (SituacaoNFeEnum.DENEGADA.equals((Object)notaFiscalTO.getSituacao())) {
                            String string = nomeArquivo = !StringHelper.isBlankOrNull((Object)notaFiscalTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)notaFiscalTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (NotaFiscalTO)notaFiscalTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procNFe);
                            if (ExportacaoHelper.exportar((String)nomeArquivo, (String)DocumentoUtil.criarNFeProcXML((NotaFiscalTO)notaFiscalTO))) {
                                ++qtdeRegistrosExportados;
                                ++qtdeArquivosGerados;
                            }
                        }
                        if (SituacaoNFeEnum.AUTORIZADA.equals((Object)notaFiscalTO.getSituacao())) {
                            String string = nomeArquivo = !StringHelper.isBlankOrNull((Object)notaFiscalTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)notaFiscalTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (NotaFiscalTO)notaFiscalTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procNFe);
                            if (ExportacaoHelper.exportar((String)nomeArquivo, (String)DocumentoUtil.criarNFeProcXML((NotaFiscalTO)notaFiscalTO))) {
                                this.alterarNotaFiscalAutorizadaParaExportada(notaFiscalTO);
                                ++qtdeRegistrosExportados;
                                ++qtdeArquivosGerados;
                            }
                        }
                        if (SituacaoNFeEnum.CANCELADA_EVENTO.equals((Object)notaFiscalTO.getSituacao())) {
                            String string = nomeArquivo = !StringHelper.isBlankOrNull((Object)notaFiscalTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)notaFiscalTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (NotaFiscalTO)notaFiscalTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procNFe);
                            if (ExportacaoHelper.exportar((String)nomeArquivo, (String)DocumentoUtil.criarNFeProcXML((NotaFiscalTO)notaFiscalTO))) {
                                this.alterarNotaFiscalCanceladaParaExportada(notaFiscalTO);
                                ++qtdeRegistrosExportados;
                                ++qtdeArquivosGerados;
                            }
                        }
                        if (SituacaoNFeEnum.CANCELADA.equals((Object)notaFiscalTO.getSituacao())) {
                            CancelamentoTO cancelamentoTO;
                            String protocolo;
                            int arquivosGeradosCancelamento = 0;
                            if (notaFiscalTO != null && !StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocXmlString())) {
                                String nomeArquivo3;
                                if (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getProtocoloString())) {
                                    String string = nomeArquivo3 = !StringHelper.isBlankOrNull((Object)notaFiscalTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)notaFiscalTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (NotaFiscalTO)notaFiscalTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procNFe);
                                    if (ExportacaoHelper.exportar((String)nomeArquivo3, (String)DocumentoUtil.criarNFeProcXML((NotaFiscalTO)notaFiscalTO))) {
                                        ++arquivosGeradosCancelamento;
                                    }
                                } else {
                                    String string = nomeArquivo3 = !StringHelper.isBlankOrNull((Object)notaFiscalTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)notaFiscalTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (NotaFiscalTO)notaFiscalTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.nfe);
                                    if (ExportacaoHelper.exportar((String)nomeArquivo3, (String)notaFiscalTO.getDocXmlString())) {
                                        ++arquivosGeradosCancelamento;
                                    }
                                }
                            }
                            if (!StringHelper.isBlankOrNull((Object)(protocolo = (cancelamentoTO = notaFiscalTO.getCancelamentoTO()).getProtocoloString()))) {
                                String tagProcCanc = XMLUtil.getFirstTagConteudo((String)protocolo, (String)"procCancNFe", (boolean)false, (boolean)false);
                                if (!StringHelper.isBlankOrNull((Object)tagProcCanc)) {
                                    String string = nomeArquivo2 = !StringHelper.isBlankOrNull((Object)cancelamentoTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)cancelamentoTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (CancelamentoTO)cancelamentoTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procCancNFe);
                                    if (ExportacaoHelper.exportar((String)nomeArquivo2, (String)protocolo)) {
                                        ++arquivosGeradosCancelamento;
                                    }
                                } else {
                                    String string = nomeArquivo2 = !StringHelper.isBlankOrNull((Object)cancelamentoTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)cancelamentoTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (CancelamentoTO)cancelamentoTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.retCancNFe);
                                    if (ExportacaoHelper.exportar((String)nomeArquivo2, (String)protocolo)) {
                                        ++arquivosGeradosCancelamento;
                                    }
                                }
                            }
                            if (arquivosGeradosCancelamento > 0) {
                                qtdeArquivosGerados += arquivosGeradosCancelamento;
                                ++qtdeRegistrosExportados;
                            }
                        }
                        if ((eventoTOList = notaFiscalTO.getEventoTOList()) == null) continue;
                        int arquivosGeradosEventos = 0;
                        for (EventoTO eventoTO : eventoTOList) {
                            nomeArquivo2 = !StringHelper.isBlankOrNull((Object)eventoTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)eventoTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (EventoTO)eventoTO, (ExtensaoArquivoEnum)extensaoArquivo, (DSENSchemaTypeEnum)DSENSchemaTypeEnum.procEventoNFe);
                            if (!ExportacaoHelper.exportar((String)nomeArquivo2, (String)eventoTO.getXmlProcString())) continue;
                            ++arquivosGeradosEventos;
                        }
                        if (arquivosGeradosEventos <= 0) continue;
                        qtdeArquivosGerados += arquivosGeradosEventos;
                        ++qtdeRegistrosExportados;
                    }
                    catch (DSENBusinessException e) {
                        a.error((Object)e.getMessage(), (Throwable)e);
                        this.a(notaFiscalTO, new String[0]);
                    }
                }
            }
        }
        catch (CancelarExportacaoException e) {
            a.error((Object)e.getMessage(), (Throwable)e);
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (Throwable t) {
            a.error((Object)t.getMessage(), t);
            Notificador.getInstance().notificar((Object)DSENMessageConstants.MSG_EXPORTACAO_ERRO, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_RESULTADO});
            Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosExportados, qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_TOTAIS});
            throw new DSENBusinessException(t, t.getMessage());
        }
        Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosExportados, qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_TOTAIS});
    }

    @DSGETransaction
    public void alterarNotaFiscalAutorizadaParaExportada(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            notaFiscalTO.setAutorizacaoExportadaXml(Boolean.TRUE);
            NotaFiscalEntity notaFiscalEntity = DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO);
            this.a().update((Serializable)notaFiscalEntity);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    @DSGETransaction
    public void alterarNotaFiscalCanceladaParaExportada(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            NotaFiscalEntity notaFiscalEntity = DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO);
            this.a().update((Serializable)notaFiscalEntity);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public Integer pesquisarQtdadeNotaFiscalAutorizadaNaoExportada(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        try {
            return this.a().selectQuantityByEmitenteNfeAutorNaoExport(DSENBusinessConverter.getNotaFiscalEntity((NotaFiscalTO)notaFiscalTO));
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    private /* varargs */ void a(NotaFiscalTO notaFiscalTO, String ... mensagem) {
        String complementoMensagem = mensagem != null && mensagem.length > 0 ? mensagem[0] : "";
        Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_NOTA_FISCAL_NAO_EXPORTADA, notaFiscalTO.getSerie(), notaFiscalTO.getNumero(), complementoMensagem), new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_RESULTADO});
    }

    public List<NotaFiscalTO> pesquisarNotaFiscal(PesquisaNotaFiscalTO filtro, OrdenacaoTO ordenacaoTO, boolean lazy) throws DSENBusinessException {
        ArrayList<NotaFiscalTO> listaNotaTO = new ArrayList();
        try {
            List listaPesquisa = DSENBusinessConverter.getPesquisaEntity((PesquisaNotaFiscalTO)filtro);
            List listaNotaEntity = this.a().pesquisar(listaPesquisa, ordenacaoTO);
            listaNotaTO = DSENBusinessConverter.getListaNotaFiscalTO((List)listaNotaEntity, (boolean)lazy);
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return listaNotaTO;
    }

    public List<NotaFiscalTO> pesquisarNotaFiscal(PesquisaNotaFiscalTO filtro, OrdenacaoTO ordenacaoTO) throws DSENBusinessException {
        return this.pesquisarNotaFiscal(filtro, ordenacaoTO, true);
    }

    public int getCountNotaFiscal(PesquisaNotaFiscalTO pesquisaNotaFiscalTO) throws DSENBusinessException {
        try {
            return this.a().getCountNotaFiscal(DSENBusinessConverter.getPesquisaEntity((PesquisaNotaFiscalTO)pesquisaNotaFiscalTO));
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public void verificaPesquisaTO(PesquisaNotaFiscalTO pesquisaNotaFiscalTO) {
        Date dIni = pesquisaNotaFiscalTO.getDataIni();
        Date dFim = pesquisaNotaFiscalTO.getDataFim();
        if (dIni == null && dFim != null) {
            pesquisaNotaFiscalTO.addError(DSENMessageConstants.INFORME_DATA_INICIAL_PERIODO);
        } else if (dIni != null && dFim == null) {
            pesquisaNotaFiscalTO.addError(DSENMessageConstants.INFORME_DATA_FINAL_PERIODO);
        } else if (dIni != null && dFim != null && !dFim.after(dIni) && !dFim.equals(dIni)) {
            pesquisaNotaFiscalTO.addError(DSENMessageConstants.PERIODO_DATA_INVALIDO);
        }
        Integer numIni = StringHelper.getInteger((String)pesquisaNotaFiscalTO.getNumIni());
        Integer numFim = StringHelper.getInteger((String)pesquisaNotaFiscalTO.getNumFim());
        if (numIni == null && numFim != null) {
            pesquisaNotaFiscalTO.addError(DSENMessageConstants.INFORME_NUMERO_INICIAL_NOTA);
        } else if (numIni != null && numFim == null) {
            pesquisaNotaFiscalTO.addError(DSENMessageConstants.INFORME_NUMERO_FINAL_NOTA);
        } else if (numIni != null && numFim != null && numFim < numIni) {
            pesquisaNotaFiscalTO.addError(DSENMessageConstants.INTERVALO_NOTAS_INVALIDO);
        }
    }

    @DSGETransaction
    public void salvarPesquisaNotaFiscal(PesquisaNotaFiscalTO pesquisaNotaFiscalTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaNotaFiscalTO.getIdEmitente());
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(pesquisaNotaFiscalTO.getTelaPesquisaEnum());
            List listPesquisaBanco = this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity);
            List listPesquisaTela = DSENBusinessConverter.getPesquisaEntity((PesquisaNotaFiscalTO)pesquisaNotaFiscalTO);
            if (listPesquisaBanco != null) {
                for (int i = 0; i < listPesquisaBanco.size(); ++i) {
                    PesquisaEntity element = (PesquisaEntity)listPesquisaBanco.get(i);
                    element.setValor(((PesquisaEntity)listPesquisaTela.get(i)).getValor());
                    this.a.update((Serializable)element);
                }
            } else {
                for (PesquisaEntity element : listPesquisaTela) {
                    this.a.insert((Serializable)element);
                }
            }
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public PesquisaNotaFiscalTO carregarPesquisaNotaFiscal(EmitenteTO emitenteTO) throws DSENBusinessException {
        PesquisaNotaFiscalTO pesquisaNotaFiscalTO = null;
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(TelaPesquisaEnum.GERENCIAR_NOTA_FISCAL);
            pesquisaNotaFiscalTO = DSENBusinessConverter.getPesquisaNotaFiscalTO((List)this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity));
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaNotaFiscalTO;
    }

    @DSGETransaction
    public List<NotaFiscalTO> validarNotasFiscais(List<NotaFiscalTO> notaFiscalTOList) throws DSENBusinessException {
        List listaNotaFiscalTO = null;
        try {
            NotaFiscalBusiness notaFiscalBusiness = new NotaFiscalBusiness();
            listaNotaFiscalTO = notaFiscalBusiness.validar(notaFiscalTOList);
        }
        catch (DSENBusinessException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return listaNotaFiscalTO;
    }

    @DSGETransaction
    private boolean a(List<NotaFiscalTO> listaNotaFiscalTO, EstadoTO estadoTO) throws DSGEUtilException {
        if (DSENUtilHelper.getInstance().isEstadoEspecifico(estadoTO)) {
            this.a((Object)MessageFormat.format(DSENMessageConstants.UF_NAO_HABILITADA, estadoTO.getSigla()), listaNotaFiscalTO, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.UF_NAO_HABILITADA);
            return false;
        }
        return true;
    }

    public NotaFiscalTO salvarNFECancelado(NotaFiscalTO nfeTO) throws DSENBusinessException {
        nfeTO.setSituacao(SituacaoNFeEnum.CANCELADA);
        nfeTO.setDataSistema(new Date());
        if (nfeTO.getDataEmissao() == null) {
            nfeTO.setDataEmissao(nfeTO.getCancelamentoTO().getDataProtocolo());
        }
        if (nfeTO.getIdNotaFiscal() != null) {
            nfeTO.getCancelamentoTO().setIdNotaFiscal(nfeTO.getIdNotaFiscal());
            nfeTO = this.alterarSemTransaction(nfeTO);
        } else {
            CancelamentoTO cancTO = nfeTO.getCancelamentoTO();
            nfeTO.setCancelamentoTO(null);
            nfeTO = this.salvarSemTransaction(nfeTO);
            cancTO.setIdNotaFiscal(nfeTO.getIdNotaFiscal());
            nfeTO.setCancelamentoTO(cancTO);
            nfeTO = this.alterarSemTransaction(nfeTO);
        }
        nfeTO.clearMessages();
        nfeTO.addMessage(DSENMessageConstants.MSG_NFE_CANCELADA_SUCESSO);
        return nfeTO;
    }

    public NotaFiscalTO validarDadosParaConsultarNFENaoCadastrada(String chaveAcesso) throws DSENBusinessException {
        NotaFiscalTO to = new NotaFiscalTO();
        if (!this.a(to, chaveAcesso)) {
            return to;
        }
        if (!ChaveAcessoUtil.validaCamposChaveAcesso((String)chaveAcesso, (NotaFiscalTO)to)) {
            return to;
        }
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        try {
            ChaveAcessoTO chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso);
            if (this.contemNFeChaveAcesso(emitenteTO, chaveAcessoTO)) {
                to.addError(DSENMessageConstants.MSG_NFE_CONSULTAR_EXISTE_BD);
            }
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        return to;
    }

    public NotaFiscalTO validarCamposParaCancelarNFENaoCadastrado(String chaveAcesso, String protocolo, String justificativa, EmitenteTO emitenteTO) throws DSENBusinessException {
        NotaFiscalTO to = new NotaFiscalTO();
        if (StringHelper.isBlankOrNull((Object)protocolo)) {
            to.addError(MessageFormat.format(DSENMessageConstants.CAMPO_X_PREENCHIMENTO_OBRIGATORIO, DSENLabelConstants.NRO_PROTOCOLO));
        } else if (protocolo.length() != 15) {
            to.addError(DSENMessageConstants.NUMERO_PROTOCOLO_TAMANHO_INVALIDO);
        }
        if (StringHelper.isBlankOrNull((Object)justificativa)) {
            to.addError(MessageFormat.format(DSENMessageConstants.CAMPO_X_PREENCHIMENTO_OBRIGATORIO, DSENLabelConstants.JUSTIFICATIVA));
        } else if (justificativa.trim().length() < 15) {
            to.addError(DSENMessageConstants.JUSTIFICATIVA_TAMANHO_INVALIDO);
        }
        if (!this.a(to, chaveAcesso)) {
            return to;
        }
        try {
            ChaveAcessoTO chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso);
            if (!ChaveAcessoUtil.validaCamposChaveAcesso((String)chaveAcesso, (NotaFiscalTO)to)) {
                return to;
            }
            if (!emitenteTO.getNrDocumento().equals(chaveAcessoTO.getCnpjEmitente())) {
                to.addError(DSENMessageConstants.MSG_NFE_CANCELAR_CHAVE_NAO_PERTENCE_EMITENTE_LOGADO);
                return to;
            }
            if (this.contemNFeChaveAcesso(emitenteTO, chaveAcessoTO)) {
                to.addError(DSENMessageConstants.MSG_NFE_CANCELAR_EXISTE_BD);
            }
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        return to;
    }

    private boolean a(NotaFiscalTO to, String chaveAcesso) {
        if (StringHelper.isBlankOrNull((Object)chaveAcesso)) {
            to.addError(MessageFormat.format(DSENMessageConstants.CAMPO_X_PREENCHIMENTO_OBRIGATORIO, DSENLabelConstants.CHAVE_DE_ACESSO));
            return false;
        }
        if (chaveAcesso.trim().length() != 44) {
            to.addError(DSENMessageConstants.CHAVE_ACESSO_DEVE_POSSUIR_44_DIGITOS);
            return false;
        }
        if (!ChaveAcessoUtil.verificarDigitoChaveAcesso((String)chaveAcesso)) {
            to.addError(DSENMessageConstants.CHAVE_ACESSO_INVALIDA_DIGITO_NAO_CONFERE);
            return false;
        }
        return true;
    }

    public boolean validarDtAutorizacaoCartaCorrecao(NotaFiscalTO to) {
        if (to != null) {
            Date dtAutorizacao = to.getDataAutorizacao();
            if (DateHelper.getHoursBetweenDates((Date)dtAutorizacao, (Date)new Date()) >= 720) {
                return false;
            }
            return true;
        }
        return false;
    }
}

