/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO
 *  br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.NumeracaoTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.EnviarEventoController
 *  br.gov.sp.fazenda.dsen.controller.EnviarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.GerarDpecController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalAutorizacaoController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalCanaController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalCobrancaController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalController$1
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalDadosController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalDestController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalEmitController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalExportaController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalInfoController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalProdController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalTotaisController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalTransportadoraController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.CancelamentoEventoGUI
 *  br.gov.sp.fazenda.dsen.view.CartaCorrecaoGUI
 *  br.gov.sp.fazenda.dsen.view.ConsultarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.EmitirDanfeGUI
 *  br.gov.sp.fazenda.dsen.view.EnviarEventoGUI
 *  br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.GerarDpecGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ErrosNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ManterNotaFiscalGUI
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO;
import br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.NumeracaoTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController;
import br.gov.sp.fazenda.dsen.controller.EnviarEventoController;
import br.gov.sp.fazenda.dsen.controller.EnviarNotaFiscalController;
import br.gov.sp.fazenda.dsen.controller.GerarDpecController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalAutorizacaoController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalCanaController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalCobrancaController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalDadosController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalDestController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalEmitController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalExportaController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalInfoController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalProdController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalTotaisController;
import br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalTransportadoraController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.CancelamentoEventoGUI;
import br.gov.sp.fazenda.dsen.view.CartaCorrecaoGUI;
import br.gov.sp.fazenda.dsen.view.ConsultarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.EmitirDanfeGUI;
import br.gov.sp.fazenda.dsen.view.EnviarEventoGUI;
import br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.GerarDpecGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ErrosNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ManterNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.model.queue.QueueListener;
import br.gov.sp.fazenda.dsge.model.queue.QueueManager;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ManterNotaFiscalController
extends DSGEBaseController
implements QueueListener<BuscaRetornoQueueItem>,
FocusListener,
PropertyChangeListener {
    private ManterNotaFiscalGUI a;
    private ErrosNotaFiscalGUI a;
    private DigitarNotaFiscalGUI a;
    private NotaFiscalFacade a;
    private String a;
    private boolean a;
    private String b = null;

    public ManterNotaFiscalController(ViewItf view) throws DSGEUtilException {
        this.a = (ManterNotaFiscalGUI)view;
        this.a = this.a.getNotaGUI();
        this.a = this.a.getErrosGUI();
        this.a.addActionListener((EventListener)this);
        this.b();
        this.a = new NotaFiscalFacade();
        if (this.a.getOperacao().equals("manterNotaOperacaoInclusao")) {
            this.a();
        } else if (this.a.getOperacao().equals("manterNotaOperacaoDetalhe")) {
            NotaFiscalTO notaFiscalTO = this.a.getNotaFiscalTO();
            this.a(notaFiscalTO);
        }
        QueueManager.getInstance(BuscaRetornoQueueItem.class).addListener((QueueListener)this);
    }

    private void a() throws DSGEUtilException {
        try {
            this.a.disableComponents("manterNotaInicioDesabilitado");
            this.a.disableComponents("manterNotaTodos");
            this.a.enableComponents("manterNotaInicioHabilitado");
            this.a = true;
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            NotaFiscalTO notaFiscalTO = this.a.obterRascunho(emitenteTO);
            notaFiscalTO.setEmitenteTO(emitenteTO);
            this.a = String.valueOf(notaFiscalTO.getSerie());
            this.a.enableComponents("manterNotaOperacaoEdicao");
            this.a.enableComponents("manterNotaEdicao");
            this.a.setNotaFiscalTO(notaFiscalTO);
            this.a.setSalvarCommand();
            this.a.setOperacao("manterNotaOperacaoEdicao");
            this.a.setTabEnabled(10, false);
        }
        catch (DSENBusinessException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void a(NotaFiscalTO notaFiscalTO) {
        this.a = notaFiscalTO.getSerie();
        this.a.disableComponents("manterNotaInicioDesabilitado");
        this.a.disableComponents("manterNotaTodos");
        this.a.enableComponents("manterNotaInicioHabilitado");
        this.a.enableComponents(notaFiscalTO.getSituacao().toString());
        if (notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.ASSINADA)) {
            if (TipoEmissaoEnum.CONTINGENCIA.equals((Object)notaFiscalTO.getTipoEmissao()) || TipoEmissaoEnum.CONTINGENCIA_FS_DA.equals((Object)notaFiscalTO.getTipoEmissao())) {
                this.a.enableComponents("MANTER_NOTA_IMPRIMIR_DANFE_CONTINGENCIA");
            }
            this.a.enableComponents(notaFiscalTO.getTipoEmissao().toString());
            if (TipoEmissaoEnum.CONTINGENCIA_DPEC.equals((Object)notaFiscalTO.getTipoEmissao())) {
                this.a.enableComponents("MANTER_NOTA_DPEC");
            }
        }
        this.a.setNotaFiscalTO(notaFiscalTO);
        this.a.setEditarCommand();
        if (notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ) || notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.DENEGADA) || notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA) || notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.CANCELADA) || notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.AUTORIZADA)) {
            this.a.disableComponents("manterNotaTodos");
        }
        if (notaFiscalTO.getDanfeImpresso().booleanValue()) {
            this.a.disableComponents("manterNotaOperacaoEdicao");
        }
        this.a.enableComponents("manterNotaDetalhe");
        if (notaFiscalTO.getSituacao().equals((Object)SituacaoNFeEnum.REJEITADA)) {
            this.a.enableComponents("manterNotaOperacaoEdicaoRejeitada");
        }
    }

    private void b() throws DSGEUtilException {
        new ManterNotaFiscalDadosController((ViewItf)this.a, 0);
        new ManterNotaFiscalEmitController((ViewItf)this.a, 1);
        new ManterNotaFiscalDestController((ViewItf)this.a, 2);
        new ManterNotaFiscalProdController((ViewItf)this.a, 3);
        new ManterNotaFiscalTransportadoraController((ViewItf)this.a, 5);
        new ManterNotaFiscalCobrancaController((ViewItf)this.a, 6);
        new ManterNotaFiscalInfoController((ViewItf)this.a, 7);
        new ManterNotaFiscalExportaController((ViewItf)this.a, 8);
        new ManterNotaFiscalTotaisController((ViewItf)this.a, 4);
        new ManterNotaFiscalCanaController((ViewItf)this.a, 9);
        new ManterNotaFiscalAutorizacaoController((ViewItf)this.a, 11);
    }

    private void c() {
        NotaFiscalTO notaFiscalTO = this.a.getNotaFiscalTO();
        ArrayList<NotaFiscalTO> lst = new ArrayList<NotaFiscalTO>();
        lst.add(notaFiscalTO);
        CertificadoTO certificadoTO = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.CONEXAO);
        if (certificadoTO != null) {
            ConsultarNotaFiscalController consultaController = new ConsultarNotaFiscalController(certificadoTO, lst, false);
            ConsultarNotaFiscalGUI consultaGUI = consultaController.showNewGUI();
            consultaGUI.addPropertyChangeListener("NOTA_FISCAL_CONSULTADA", (PropertyChangeListener)this);
            consultaGUI.addPropertyChangeListener("NOTA_FISCAL_ATUALIZADA", (PropertyChangeListener)this);
            consultaGUI.setVisible(true);
            Notificador.getInstance().remove((Observer)consultaController);
        }
    }

    private void d() {
        int resposta = 0;
        NotaFiscalTO notaFiscalTO = this.a.getNotaFiscalTO();
        if (SituacaoNFeEnum.REJEITADA.equals((Object)notaFiscalTO.getSituacao())) {
            String codigoRejeicao;
            String xml = notaFiscalTO.getProtocoloString();
            List lst = XMLUtil.getTagConteudo((String)xml, (String)"cStat", (boolean)false);
            String string = codigoRejeicao = lst != null ? (String)lst.get(0) : null;
            if (DSENConstants.CODIGO_REJEICAO_DUPLICIDADE.equals(codigoRejeicao) && 0 == this.a.showQuestion(DSENMessageConstants.NOTA_FISCAL_REJEITADA_CONSULTA_SEFAZ_QUESTION)) {
                this.c();
                notaFiscalTO = this.a.getNotaFiscalTO();
                if (SituacaoNFeEnum.CANCELADA.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.DENEGADA.equals((Object)notaFiscalTO.getSituacao()) || SituacaoNFeEnum.AUTORIZADA.equals((Object)notaFiscalTO.getSituacao())) {
                    return;
                }
            }
        }
        if (SituacaoNFeEnum.ASSINADA.equals((Object)notaFiscalTO.getSituacao()) && TipoEmissaoEnum.CONTINGENCIA_DPEC.equals((Object)notaFiscalTO.getTipoEmissao())) {
            resposta = this.a.showQuestion(DSENMessageConstants.NOTA_FISCAL_DPEC_STATUS_EM_DIGITACAO);
        } else if (!SituacaoNFeEnum.EM_DIGITACAO.equals((Object)notaFiscalTO.getSituacao())) {
            resposta = this.a.showQuestion(DSENMessageConstants.NOTA_FISCAL_STATUS_EM_DIGITACAO);
        }
        if (resposta == 0) {
            String antigaOperacao = this.a.getOperacao();
            try {
                this.a.setOperacao("manterNotaOperacaoEdicao");
                notaFiscalTO = this.a.editarNotaFiscal(notaFiscalTO);
                this.b = notaFiscalTO.getDocXmlString();
            }
            catch (DSENBusinessException ex) {
                this.a.setOperacao(antigaOperacao);
                this.a.showErrors((DSGEBaseException)ex);
            }
            this.a.setSalvarCommand();
            this.a.disableComponents("manterNotaInicioDesabilitado");
            this.a.enableComponents("manterNotaEdicao");
            this.a.enableComponents("manterNotaOperacaoEdicao");
            this.a.setNotaFiscalTO(notaFiscalTO);
            this.a = true;
        }
    }

    private boolean a(NotaFiscalTO updatedNfeTO) {
        if (updatedNfeTO != null) {
            try {
                this.a(updatedNfeTO);
                updatedNfeTO = this.a.salvarNotaFiscal(updatedNfeTO);
                if (!updatedNfeTO.hasErrors()) {
                    this.b = updatedNfeTO.getDocXmlString();
                    this.a.showMessage((BaseTO)updatedNfeTO);
                    this.a.setOperacao("manterNotaOperacaoDetalhe");
                    this.a(updatedNfeTO);
                    return true;
                }
                this.a.showMessage((BaseTO)updatedNfeTO);
                return false;
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
        return false;
    }

    private void e() {
        NotaFiscalTO notaFiscalTO = this.a.getUpdatedNotaFiscalTO();
        if (notaFiscalTO != null) {
            try {
                boolean respostaNao = false;
                notaFiscalTO = this.a.validarNotaFiscal(notaFiscalTO);
                List errosList = notaFiscalTO.getListaErroNFe();
                this.a.setErros(errosList);
                if (notaFiscalTO.getQuestionEnum() != null) {
                    int resposta = this.a.showQuestion((BaseTO)notaFiscalTO);
                    this.a(notaFiscalTO);
                    if (resposta == 0) {
                        notaFiscalTO.setTotalVerificado(Boolean.TRUE);
                        notaFiscalTO = this.a.validarNotaFiscal(notaFiscalTO);
                        if (errosList != null && errosList.size() > 0) {
                            this.a.setBottomPanelVisible(true);
                            this.a.showMessage(DSENMessageConstants.NOTA_CONTEM_ERRO_OLHE_PAINEL);
                        } else {
                            this.a.showMessage((BaseTO)notaFiscalTO);
                            this.a.setBottomPanelVisible(false);
                        }
                    } else {
                        respostaNao = true;
                    }
                } else if (errosList != null && errosList.size() > 0) {
                    this.a.setBottomPanelVisible(true);
                    this.a.showMessage(DSENMessageConstants.NOTA_CONTEM_ERRO_OLHE_PAINEL);
                } else {
                    this.a.showMessage((BaseTO)notaFiscalTO);
                    this.a.setBottomPanelVisible(false);
                }
                if (!(notaFiscalTO.getErrors() != null && notaFiscalTO.getErrors().size() > 0 || respostaNao)) {
                    this.a = false;
                    this.b = notaFiscalTO.getDocXmlString();
                    this.a.setOperacao("manterNotaOperacaoDetalhe");
                    this.a(notaFiscalTO);
                }
            }
            catch (DSENBusinessException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void f() {
        CertificadoTO certificadoTO;
        NotaFiscalTO notaFiscalTO = this.a.getUpdatedNotaFiscalTO();
        if (notaFiscalTO != null && (certificadoTO = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA)) != null) {
            try {
                notaFiscalTO = this.a.assinarNotaFiscal(notaFiscalTO, certificadoTO);
                if (notaFiscalTO.getQuestionEnum() != null) {
                    int resposta = this.a.showQuestion((BaseTO)notaFiscalTO);
                    notaFiscalTO.clearErrors();
                    notaFiscalTO.clearMessages();
                    notaFiscalTO.setQuestionEnum(null);
                    if (resposta == 0) {
                        notaFiscalTO.setTotalVerificado(Boolean.TRUE);
                        notaFiscalTO = this.a.assinarNotaFiscal(notaFiscalTO, certificadoTO);
                        this.a.showMessage((BaseTO)notaFiscalTO);
                    }
                } else {
                    this.a.showMessage((BaseTO)notaFiscalTO);
                }
                if (notaFiscalTO.getErrors() == null || notaFiscalTO.getErrors().size() <= 0) {
                    this.a = false;
                    this.b = notaFiscalTO.getDocXmlString();
                }
                this.a.setOperacao("manterNotaOperacaoDetalhe");
                this.a(notaFiscalTO);
            }
            catch (DSENBusinessException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void g() {
        try {
            CartaCorrecaoTO cartaCorrecaoTO = new CartaCorrecaoTO();
            cartaCorrecaoTO.setNotaFiscalTO(this.a.getUpdatedNotaFiscalTO());
            cartaCorrecaoTO.setTpEvento(TipoEventoEnum.e110110);
            cartaCorrecaoTO.setnSeqEvento(Integer.valueOf(DocumentoUtil.recuperarProximoNSeqEvento((EventoTO)cartaCorrecaoTO)));
            cartaCorrecaoTO = CartaCorrecaoGUI.showGUI((CartaCorrecaoTO)cartaCorrecaoTO);
            if (cartaCorrecaoTO != null) {
                this.a((EventoTO)cartaCorrecaoTO, DSENMessageConstants.ENVIANDO_CARTA_CORRECAO);
            }
        }
        catch (Throwable t) {
            this.a.showErrors(t);
        }
    }

    private void h() {
        try {
            CancelamentoEventoTO cancelamentoEventoTO = new CancelamentoEventoTO();
            cancelamentoEventoTO.setNotaFiscalTO(this.a.getUpdatedNotaFiscalTO());
            cancelamentoEventoTO.setTpEvento(TipoEventoEnum.e110111);
            cancelamentoEventoTO.setnSeqEvento(Integer.valueOf(DocumentoUtil.recuperarProximoNSeqEvento((EventoTO)cancelamentoEventoTO)));
            cancelamentoEventoTO = CancelamentoEventoGUI.showGUI((CancelamentoEventoTO)cancelamentoEventoTO);
            if (cancelamentoEventoTO != null) {
                this.a((EventoTO)cancelamentoEventoTO, DSENMessageConstants.ENVIANDO_CARTA_CORRECAO);
            }
        }
        catch (Throwable t) {
            this.a.showErrors(t);
        }
    }

    private void a(EventoTO eventoTO, String tituloPersonalizado) throws Exception {
        CertificadoTO certificado = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA);
        ArrayList<EventoTO> listaEventos = new ArrayList<EventoTO>();
        listaEventos.add(eventoTO);
        if (certificado != null) {
            EnviarEventoController enviarEventoController = new EnviarEventoController(listaEventos, certificado);
            EnviarEventoGUI enviarEventoGUI = enviarEventoController.showNewGUI((Window)DSENDesktop.getInstance(), tituloPersonalizado);
            enviarEventoGUI.addPropertyChangeListener("EVENTO_ENVIADO", (PropertyChangeListener)this);
            enviarEventoGUI.setVisible(true);
        }
    }

    private boolean a(EstadoTO estadoTO) {
        try {
            String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.RecepcaoEvento);
            if (url != null && !"".equals(url)) {
                return true;
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
        return false;
    }

    private void i() {
        CertificadoTO certificadoTO = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.CONEXAO);
        if (certificadoTO != null) {
            ArrayList<NotaFiscalTO> lN = new ArrayList<NotaFiscalTO>();
            lN.add(this.a.getUpdatedNotaFiscalTO());
            EnviarNotaFiscalController enviarNotaController = new EnviarNotaFiscalController(certificadoTO, lN);
            Notificador.getInstance().register((Observer)enviarNotaController, new EnumItf[]{GrupoNotificacaoEnum.NOTA_FISCAL_ENVIADA, GrupoNotificacaoEnum.ERRO_CONEXAO_ENVIO_SEFAZ, GrupoNotificacaoEnum.ERRO_CONEXAO_ENVIO_SCAN, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SEFAZ, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SCAN, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CANCELAMENTO, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.UF_NAO_HABILITADA, GrupoNotificacaoEnum.EXCEPTION});
            EnviarNotaFiscalGUI envGUI = enviarNotaController.showNewGUI();
            envGUI.addPropertyChangeListener("NOTA_TRANSMITIDA", (PropertyChangeListener)this);
            envGUI.setVisible(true);
            Notificador.getInstance().remove((Observer)enviarNotaController);
        }
    }

    private void j() {
        try {
            EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(this.a.getNotaFiscalTO().getEmitenteTO().getUf());
            try {
                CancelamentoEventoTO cancelamentoEventoTO = new CancelamentoEventoTO();
                cancelamentoEventoTO.setNotaFiscalTO(this.a.detalharNotaFiscal(this.a.getNotaFiscalTO()));
                cancelamentoEventoTO.setTpEvento(TipoEventoEnum.e110111);
                cancelamentoEventoTO.setnSeqEvento(Integer.valueOf(DocumentoUtil.recuperarProximoNSeqEvento((EventoTO)cancelamentoEventoTO)));
                cancelamentoEventoTO = CancelamentoEventoGUI.showGUI((CancelamentoEventoTO)cancelamentoEventoTO);
                if (cancelamentoEventoTO != null) {
                    this.a((EventoTO)cancelamentoEventoTO, DSENMessageConstants.CANCELANDO_NFE);
                }
            }
            catch (Throwable t) {
                this.a.showErrors(t);
            }
        }
        catch (DSGEUtilException a) {
            this.a.showErrors((DSGEBaseException)a);
        }
    }

    private void a(boolean readOnly) {
        try {
            EmitirDanfeGUI emitirDanfeGUI = new EmitirDanfeGUI((Frame)DSENDesktop.getInstance(), readOnly);
            ArrayList<NotaFiscalTO> listaN = new ArrayList<NotaFiscalTO>();
            listaN.add(this.a.getUpdatedNotaFiscalTO());
            emitirDanfeGUI.setSelectedNotas(listaN);
            emitirDanfeGUI.addPropertyChangeListener((PropertyChangeListener)this);
            emitirDanfeGUI.setVisible(true);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void k() {
        ArrayList<NotaFiscalTO> notaFiscalTOList = new ArrayList<NotaFiscalTO>();
        notaFiscalTOList.add(this.a.getUpdatedNotaFiscalTO());
        try {
            CertificadoTO certificadoTO = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA);
            if (certificadoTO != null) {
                GerarDpecController controller = new GerarDpecController();
                GerarDpecGUI gui = controller.getGUI();
                controller.gerarDPEC(notaFiscalTOList, certificadoTO);
                gui.setVisible(true);
            }
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    private void l() {
        try {
            ArrayList<NotaFiscalTO> lst_base = new ArrayList<NotaFiscalTO>();
            NotaFiscalTO n = this.a.getUpdatedNotaFiscalTO();
            lst_base.add(n);
            ExportacaoGUI exportacaoGUI = new ExportacaoGUI(lst_base, TipoDocumentoArquivoEnum.NotaFiscal, (Window)DSENDesktop.getInstance(), true);
            if (SituacaoNFeEnum.EM_DIGITACAO.equals((Object)n.getSituacao()) || SituacaoNFeEnum.VALIDADA.equals((Object)n.getSituacao())) {
                exportacaoGUI.setBtnXmlEnabled(false);
            }
            exportacaoGUI.setVisible(true);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void m() {
        this.a.setBottomPanelVisible(false);
    }

    private void n() {
        if (WindowManager.getInstance().closePanel()) {
            this.a.firePropertyChange("NOTA_FISCAL_CHANGED", (Object)null, (Object)null);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean canCloseGUI() {
        boolean canClose;
        canClose = false;
        try {
            if (this.a) {
                NotaFiscalTO updatedNFe = this.a.getUpdatedNotaFiscalTO();
                String updatedNFeXml = updatedNFe.getDocXmlString();
                if (updatedNFeXml.equals(this.b)) {
                    canClose = true;
                } else {
                    int ret = this.a.showYesNoCancelQuestion(DSENMessageConstants.QUESTION_SALVAR_ALTERACOES);
                    if (ret == 0) {
                        if (this.a(updatedNFe)) {
                            canClose = true;
                        } else {
                            Object[] options = new Object[]{"Sim", "N\u00e3o"};
                            int n = JOptionPane.showOptionDialog((Component)DSENDesktop.getInstance(), DSENMessageConstants.QUESTION_SALVAR_FALHOU_SAIR_ASSIM_MESMO, "Mensagem do Sistema", 0, 3, null, options, options[1]);
                            canClose = 0 == n;
                        }
                    } else {
                        canClose = ret == 1;
                    }
                }
            } else {
                canClose = true;
            }
        }
        finally {
            if (canClose) {
                QueueManager.getInstance(BuscaRetornoQueueItem.class).removeListener((QueueListener)this);
            }
        }
        return canClose;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("salvar")) {
            this.a(this.a.getUpdatedNotaFiscalTO());
        } else if (e.getActionCommand().equals("ACTION_VALIDAR")) {
            this.e();
        } else if (e.getActionCommand().equals("editar")) {
            this.d();
        } else if (e.getActionCommand().equals("ACTION_ASSINAR")) {
            this.f();
        } else if (e.getActionCommand().equals("ACTION_TRANSMITIR")) {
            this.i();
        } else if (e.getActionCommand().equals("cancelar")) {
            this.j();
        } else if (e.getActionCommand().equals("ACTION_CANCELAR_NFE_EVENTO")) {
            this.o();
        } else if (e.getActionCommand().equals("ACTION_PRE_VISUALIZAR_DANFE")) {
            this.a(true);
        } else if (e.getActionCommand().equals("ACTION_IMPRIMIR_DANFE")) {
            this.a(false);
        } else if (e.getActionCommand().equals("exportar")) {
            this.l();
        } else if (e.getActionCommand().equals("fechar")) {
            this.n();
        } else if (e.getActionCommand().equals("ACTION_HIDE_ERROR_PANEL")) {
            this.m();
        } else if (e.getActionCommand().equals("ACTION_VER_CHAVE_SEM_FORMATACAO")) {
            this.p();
        } else if (e.getActionCommand().equals("ACTION_GERAR_DPEC")) {
            this.k();
        } else if (e.getActionCommand().equals("ACTION_CARTA_CORRECAO")) {
            try {
                this.g();
            }
            catch (Throwable ex) {
                this.a.showErrors(ex);
            }
        } else if (e.getActionCommand().equals("ACTION_CANCELAMENTO")) {
            try {
                this.h();
            }
            catch (Throwable ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void o() {
    }

    private void p() {
        ChaveSemFormatacaoGUI chaveGUI = new ChaveSemFormatacaoGUI((Frame)DSENDesktop.getInstance(), false);
        try {
            chaveGUI.setChave(ChaveAcessoUtil.gerarChaveAcessoTO((NotaFiscalTO)this.a.getNotaFiscalTO()).getChaveAcesso());
            WindowManager.getInstance().centralizarDialogo((JDialog)chaveGUI);
            chaveGUI.setVisible(true);
        }
        catch (ParseException e) {
            this.a.showErrors((DSGEBaseException)new DSGEViewException((Throwable)e, e.getMessage()));
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        NotaFiscalTO nfeTO = this.a.getNotaFiscalTO();
        String serie = this.a.getSerie();
        if (!serie.equals(String.valueOf(nfeTO.getSerie()))) {
            try {
                NumeracaoTO numeracaoTO = this.a.pesquisarUltimoNumero(nfeTO.getEmitenteTO(), serie);
                Integer numero = numeracaoTO == null ? 1 : Integer.parseInt(numeracaoTO.getNumero()) + 1;
                String novoNumero = ChaveAcessoUtil.NUMERO_NFE_FORMAT.format(numero);
                nfeTO.setNumero(novoNumero);
                this.a.setNumero(novoNumero);
            }
            catch (Throwable ex) {
                this.a.showErrors(ex);
            }
        }
        nfeTO.setSerie(serie);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        try {
            NotaFiscalTO notaConsultada;
            if ("NOTA_TRANSMITIDA".equals(evt.getPropertyName()) || "NOTA_CANCELADA".equals(evt.getPropertyName()) || "danfeImpressoPropertyChange".equals(evt.getPropertyName()) || "EVENTO_ENVIADO".equals(evt.getPropertyName())) {
                NotaFiscalTO notaFiscalTO = this.a.getNotaFiscalTO();
                notaFiscalTO = this.a.pesquisarPorId(this.a.getNotaFiscalTO());
                this.b = notaFiscalTO.getDocXmlString();
                this.a(notaFiscalTO);
            } else if ("NOTA_FISCAL_ATUALIZADA".equals(evt.getPropertyName())) {
                NotaFiscalTO notaAtualizada = (NotaFiscalTO)evt.getNewValue();
                if (notaAtualizada != null) {
                    this.a(notaAtualizada);
                }
            } else if ("NOTA_FISCAL_CONSULTADA".equals(evt.getPropertyName()) && SituacaoNFeEnum.REJEITADA.equals((Object)(notaConsultada = (NotaFiscalTO)evt.getNewValue()).getSituacao())) {
                String codigoRetorno;
                String xml = notaConsultada.getProtocoloString();
                List lst = XMLUtil.getTagConteudo((String)xml, (String)"cStat", (boolean)false);
                String string = codigoRetorno = lst != null ? (String)lst.get(0) : null;
                if (DSENConstants.CODIGO_NAO_CONSTA_SEFAZ.equals(codigoRetorno)) {
                    DSGEMessageDialog.showMessage((String)DSENMessageConstants.MSG_NOTA_FISCAL_CODIGO_INEXISTENTE_BASE_SEFAZ);
                }
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private NotaFiscalTO a(NotaFiscalTO notaTO) {
        if (notaTO == null) {
            return null;
        }
        notaTO.clearErrors();
        notaTO.clearMessages();
        notaTO.setAtualizadaPelaConsulta(false);
        notaTO.setException(null);
        notaTO.setErroXmlResposta(null);
        notaTO.setQuestionEnum(null);
        return notaTO;
    }

    public void onCancel(int agendadosCancelados, int prontosCancelados) {
    }

    public void onConsume(BuscaRetornoQueueItem obj) {
        Long idCte;
        Long l = idCte = this.a.getNotaFiscalTO() != null ? this.a.getNotaFiscalTO().getIdNotaFiscal() : new Long(-1);
        if (obj.getNotaFiscalTO().getIdNotaFiscal().equals(idCte)) {
            SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        }
    }

    public void onError(BuscaRetornoQueueItem obj, Throwable error) {
    }

    public void onShutdown(BuscaRetornoQueueItem obj) {
    }

    public void onSleep(BuscaRetornoQueueItem obj) {
    }

    public void onStartup(BuscaRetornoQueueItem obj) {
    }

    public void onWakeup(BuscaRetornoQueueItem obj, int queueSize) {
    }

    public void onPush(BuscaRetornoQueueItem obj) {
    }

    static /* synthetic */ String a(ManterNotaFiscalController x0, String x1) {
        x0.b = x1;
        return x0.b;
    }

    static /* synthetic */ void a(ManterNotaFiscalController x0, NotaFiscalTO x1) {
        x0.a(x1);
    }
}

