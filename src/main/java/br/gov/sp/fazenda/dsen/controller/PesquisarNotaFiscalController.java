/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO
 *  br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.EnviarEventoController
 *  br.gov.sp.fazenda.dsen.controller.EnviarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.GerarDpecController
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$1
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$2
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$3
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$4
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$5
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$6
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$7
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$BotoesEnum
 *  br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController$EstadoNF
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
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoLoteGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DuplicarNFeGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ManterNotaFiscalGUI
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO;
import br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.LoteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController;
import br.gov.sp.fazenda.dsen.controller.EnviarEventoController;
import br.gov.sp.fazenda.dsen.controller.EnviarNotaFiscalController;
import br.gov.sp.fazenda.dsen.controller.GerarDpecController;
import br.gov.sp.fazenda.dsen.controller.PesquisarNotaFiscalController;
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
import br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoLoteGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.nfe.ChaveSemFormatacaoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.DuplicarNFeGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ManterNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.model.queue.QueueListener;
import br.gov.sp.fazenda.dsge.model.queue.QueueManager;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class PesquisarNotaFiscalController
extends DSGEBaseController
implements Observer,
QueueListener<BuscaRetornoQueueItem>,
PageableSortableTableActionListener,
ActionListener,
PropertyChangeListener,
CellEditorListener {
    private PesquisarNotaFiscalGUI a;
    private NotaFiscalFacade a;
    private PesquisaNotaFiscalTO a;
    private static boolean[][] a = PesquisarNotaFiscalController.a();
    private BotoesEnum[] a;
    private Map a = new BotoesEnum[]{BotoesEnum.DETALHAR, BotoesEnum.DUPLICAR, BotoesEnum.MOSTRAR_CHAVE_ACESSO, BotoesEnum.CARTA_CORRECAO};

    public PesquisarNotaFiscalController(ViewItf view) {
        this.a = (PesquisarNotaFiscalGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a = new NotaFiscalFacade();
        this.a(this.a.getOperacao());
        this.q();
        this.a.setPararBuscaRetornoEnabled(QueueManager.getInstance(BuscaRetornoQueueItem.class).containsItens() && !QueueManager.getInstance(BuscaRetornoQueueItem.class).isCanceled());
        QueueManager.getInstance(BuscaRetornoQueueItem.class).addListener((QueueListener)this);
    }

    private void a(String operacao) {
        try {
            if ("ACTION_VISUALIZAR_NFE_CONTING_N_TRANS".equals(operacao)) {
                this.a.setSituacaoNfe(SituacaoNFeEnum.ASSINADA);
                this.a.setTipoNfe(TipoEmissaoEnum.CONTINGENCIA);
                this.a.setDanfeImpresso(true);
                this.s();
                this.a(this.a.getPesquisaNotaFiscalTO(), false);
            } else if ("ACTION_VISUALIZAR_NFE_EM_PROCESSAMENTO_SEFAZ".equals(operacao)) {
                this.a.setSituacaoNfe(SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ);
                this.s();
                this.a(this.a.getPesquisaNotaFiscalTO(), false);
            } else if ("ACTION_VISUALIZAR_NFE_CONTING_DPEC_N_TRANS".equals(operacao)) {
                this.a.setSituacaoNfe(SituacaoNFeEnum.ASSINADA);
                this.a.setTipoNfe(TipoEmissaoEnum.CONTINGENCIA_DPEC);
                this.a.setDanfeImpresso(true);
                this.s();
                this.a(this.a.getPesquisaNotaFiscalTO(), false);
            } else if ("ACTION_VISUALIZAR_NFE_CONTING_FSDA_N_TRANS".equals(operacao)) {
                this.a.setSituacaoNfe(SituacaoNFeEnum.ASSINADA);
                this.a.setTipoNfe(TipoEmissaoEnum.CONTINGENCIA_FS_DA);
                this.a.setDanfeImpresso(true);
                this.s();
                this.a(this.a.getPesquisaNotaFiscalTO(), false);
            } else if ("ACTION_VISUALIZAR_AUTORIZADA_NAO_EXPORTADA_XML".equals(operacao)) {
                this.a.setAutorizadaExportada(Boolean.FALSE);
                this.s();
                this.a(this.a.getPesquisaNotaFiscalTO(), false);
            } else {
                PesquisaNotaFiscalTO pesquisaTO = this.a.carregarPesquisaNotaFiscal((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
                this.a.populaFiltro(pesquisaTO);
                if (pesquisaTO != null) {
                    this.a = pesquisaTO.getIdPesquisa();
                }
            }
        }
        catch (DSGEBaseException e) {
            this.a.showErrors(e);
        }
    }

    private static boolean[][] a() {
        boolean[][] table = new boolean[BotoesEnum.values().length][EstadoNF.values().length];
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.ASSINADA.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.CANCELADA.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.DENEGADA.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.DIGITACAO.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.REJEITADA.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.VALIDADA.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = true;
        table[BotoesEnum.DETALHAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.ASSINADA.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.DIGITACAO.ordinal()] = true;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.VALIDAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.ASSINADA.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.VALIDADA.ordinal()] = true;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.ASSINAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.ASSINADA.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.CANCELADA.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.DENEGADA.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.REJEITADA.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.VALIDADA.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = true;
        table[BotoesEnum.MOSTRAR_CHAVE_ACESSO.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.ASSINADA.ordinal()] = true;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = true;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.TRANSMITIR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.ASSINADA.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.DANFE.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.ASSINADA.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.VALIDADA.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = true;
        table[BotoesEnum.PRE_VISUALIZAR_DANFE.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.ASSINADA.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.CANCELADA.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.REJEITADA.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = true;
        table[BotoesEnum.SEFAZ.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.ASSINADA.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.CANCELADA.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.DENEGADA.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.DIGITACAO.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.REJEITADA.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.VALIDADA.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = true;
        table[BotoesEnum.EXPORTAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.ASSINADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.CANCELAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.ASSINADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.CANCELAR_EVENTO.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.ASSINADA.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.CANCELADA.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.DENEGADA.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.DIGITACAO.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.REJEITADA.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.VALIDADA.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = true;
        table[BotoesEnum.DUPLICAR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.ASSINADA.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = false;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.CANCELADA.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.DENEGADA.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.DIGITACAO.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.REJEITADA.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.VALIDADA.ordinal()] = true;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.EXCLUIR.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.ASSINADA.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = true;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = true;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.GERAR_DPEC.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.ASSINADA.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = true;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = true;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.VERIFICAR_PROCESSAMENTOS_PENDENTES.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.ASSINADA.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.AUTORIZADA.ordinal()] = true;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.CANCELADA.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.CANCELADA_EVENTO.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.DENEGADA.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.DIGITACAO.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.PROCESSAMENTO.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.REJEITADA.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.VALIDADA.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA.ordinal()] = false;
        table[BotoesEnum.CARTA_CORRECAO.ordinal()][EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE.ordinal()] = false;
        return table;
    }

    private List<NotaFiscalTO> a(PesquisaNotaFiscalTO pesquisaNotaFiscalTO, boolean userAction) throws DSGEBaseException {
        if (pesquisaNotaFiscalTO == null) {
            return null;
        }
        pesquisaNotaFiscalTO.setIdEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
        this.a = pesquisaNotaFiscalTO;
        if (this.a != null) {
            boolean erro;
            this.a.verificaPesquisaTO(this.a);
            List errors = this.a.getErrors();
            boolean bl = erro = errors != null && errors.size() > 0;
            if (erro) {
                this.a.showMessage((BaseTO)this.a);
                return null;
            }
            LinkedHashMap<String, Boolean> sortColumns = new LinkedHashMap<String, Boolean>();
            if (this.a.getTable().getSortColumnDbFieldName() != null) {
                sortColumns.put(this.a.getTable().getSortColumnDbFieldName(), this.a.getTable().isSortColumnASC());
            }
            OrdenacaoTO ordenacaoTO = new OrdenacaoTO();
            ordenacaoTO.setSortColumns(sortColumns);
            ordenacaoTO.setStart(this.a.getTable().getStartPageIndex());
            ordenacaoTO.setMaxResults(this.a.getTable().getPageSize());
            Collection cN = this.a.pesquisarNotaFiscal(this.a, ordenacaoTO);
            ArrayList<NotaFiscalTO> listaNotas = new ArrayList<NotaFiscalTO>(cN);
            errors = this.a.getErrors();
            boolean bl2 = erro = errors != null && errors.size() > 0;
            if (erro) {
                this.a.showMessage((BaseTO)this.a);
            } else {
                this.verificarItensSelecionados(this.a.getSelectedNotas(), listaNotas);
                this.a.setNotaFiscalTOList(listaNotas);
                if (userAction) {
                    this.a.setIdPesquisa(this.a);
                    this.a.salvarPesquisaNotaFiscal(this.a);
                    if (this.a == null) {
                        this.a = this.a.carregarPesquisaNotaFiscal((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
                        if (this.a != null) {
                            this.a = this.a.getIdPesquisa();
                        }
                        this.a = this.a.getIdPesquisa();
                    }
                }
            }
            if (userAction && (listaNotas == null || listaNotas.size() == 0)) {
                this.a.showMessage(DSENMessageConstants.NENHUM_RESULTADO_ENCONTRADO);
            }
            return listaNotas;
        }
        return null;
    }

    private void a() throws Exception {
        List notaFiscalTOList = this.a.getSelectedNotas();
        if (notaFiscalTOList != null) {
            notaFiscalTOList = this.a.detalhar(notaFiscalTOList);
            notaFiscalTOList = this.a.validarNotaFiscal(notaFiscalTOList);
            int notasOK = 0;
            StringBuilder sb = new StringBuilder();
            for (NotaFiscalTO notaTO : notaFiscalTOList) {
                if (notaTO.getQuestionEnum() != null || notaTO.getErrors() != null && notaTO.getErrors().size() > 0) {
                    sb.append(MessageFormat.format(DSENMessageConstants.NOTA_ANO_SERIE_NUMERO_INVALIDA, notaTO.getAno(), notaTO.getSerie(), notaTO.getNumero()));
                    sb.append("\n");
                    continue;
                }
                ++notasOK;
            }
            if (notasOK > 0) {
                this.a(this.a, false);
            }
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.N_NOTAS_VALIDADAS_COM_SUCESSO, notasOK) + "\n" + sb.toString());
        }
    }

    private void b() {
        NotaFiscalTO notaFiscalTO = this.a.getSelectedNotaFiscalTO();
        if (notaFiscalTO != null) {
            try {
                notaFiscalTO.clearErrors();
                notaFiscalTO.clearMessages();
                notaFiscalTO = this.a.detalharNotaFiscal(notaFiscalTO);
                if (notaFiscalTO.getErrors() != null) {
                    this.a.showMessage((BaseTO)notaFiscalTO);
                } else {
                    ManterNotaFiscalGUI manterNotaFiscalGUI = new ManterNotaFiscalGUI("manterNotaOperacaoDetalhe", notaFiscalTO);
                    manterNotaFiscalGUI.addPropertyChangeListener((PropertyChangeListener)this);
                    WindowManager.getInstance().showPanel((DSGEPanel)manterNotaFiscalGUI, false);
                }
            }
            catch (DSENBusinessException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void c() throws Exception {
        String questionStr;
        List lista = this.a.getSelectedNotas();
        boolean temAutorizada = false;
        for (NotaFiscalTO nota : lista) {
            if (nota.getSituacao() != SituacaoNFeEnum.AUTORIZADA) continue;
            temAutorizada = true;
            break;
        }
        String string = lista.size() > 1 ? (temAutorizada ? DSENMessageConstants.MSG_EXCLUIR_NOTAS_SELECIONADAS_AUTORIZADA : DSENMessageConstants.MSG_EXCLUIR_NOTAS_SELECIONADAS) : (questionStr = temAutorizada ? DSENMessageConstants.MSG_EXCLUIR_NOTA_SELECIONADA_AUTORIZADA : DSENMessageConstants.MSG_EXCLUIR_NOTA_SELECIONADA);
        if (this.a.showQuestion(questionStr) == 0 && lista != null) {
            List list = this.a.excluirNotaFiscal(lista);
            this.r();
            this.a(this.a, false);
            this.a.showMessage(list);
        }
    }

    private void d() throws Exception {
        List lst_base = this.a.detalhar(this.a.getSelectedNotas());
        ExportacaoGUI exportacaoGUI = new ExportacaoGUI(lst_base, TipoDocumentoArquivoEnum.NotaFiscal, (Window)DSENDesktop.getInstance(), true);
        if (this.a(lst_base)) {
            exportacaoGUI.setBtnXmlEnabled(false);
        }
        exportacaoGUI.setVisible(true);
        this.a(this.a, false);
    }

    private boolean a(List<NotaFiscalTO> notas) {
        for (NotaFiscalTO nota : notas) {
            if (!SituacaoNFeEnum.EM_DIGITACAO.equals((Object)nota.getSituacao()) && !SituacaoNFeEnum.VALIDADA.equals((Object)nota.getSituacao())) continue;
            return true;
        }
        return false;
    }

    private void e() throws Exception {
        CertificadoTO certificado;
        List notaFiscalTOList = this.a.getSelectedNotas();
        if (notaFiscalTOList != null && !notaFiscalTOList.isEmpty() && (certificado = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA)) != null) {
            try {
                notaFiscalTOList = this.a.detalhar(notaFiscalTOList);
                CertificadoTO certificadoTO = new CertificadoTO();
                certificadoTO.setX509Certificate(certificado.getX509Certificate());
                certificadoTO.setPrivateKey(certificado.getPrivateKey());
                notaFiscalTOList = this.a.assinarNotaFiscal(notaFiscalTOList, certificadoTO);
                int notasOK = 0;
                StringBuilder sb = new StringBuilder();
                for (NotaFiscalTO notaTO : notaFiscalTOList) {
                    if (notaTO.getQuestionEnum() != null || notaTO.getErrors() != null && notaTO.getErrors().size() > 0) {
                        sb.append(MessageFormat.format(DSENMessageConstants.NOTA_ANO_SERIE_NUMERO_NAO_PODE_SER_ASSINADA, notaTO.getAno(), notaTO.getSerie(), notaTO.getNumero()));
                        sb.append("\n");
                        continue;
                    }
                    ++notasOK;
                }
                if (notasOK > 0) {
                    this.a(this.a, false);
                }
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.N_NOTAS_ASSINADAS_COM_SUCESSO, notasOK) + "\n" + sb.toString());
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void a(boolean readOnly) throws Exception {
        List listaNotas = this.a.detalhar(this.a.getSelectedNotas());
        if (listaNotas != null && listaNotas.size() > 0) {
            EmitirDanfeGUI emitirDanfeGUI = new EmitirDanfeGUI((Frame)DSENDesktop.getInstance(), readOnly);
            emitirDanfeGUI.setSelectedNotas(listaNotas);
            emitirDanfeGUI.addPropertyChangeListener((PropertyChangeListener)this);
            emitirDanfeGUI.setVisible(true);
        }
    }

    private void f() throws Exception {
        CertificadoTO certificado = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.CONEXAO);
        if (certificado != null) {
            List notaTOList = this.a.detalhar(this.a.getSelectedNotas());
            this.a(notaTOList);
            EnviarNotaFiscalController enviarNotaController = new EnviarNotaFiscalController(certificado, notaTOList);
            EnviarNotaFiscalGUI envGUI = enviarNotaController.showNewGUI();
            envGUI.addPropertyChangeListener((PropertyChangeListener)this);
            envGUI.setVisible(true);
        }
    }

    private void g() throws Exception {
        try {
            EstadoTO estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(this.a.getSelectedNotaFiscalTO().getEmitenteTO().getUf());
            try {
                CancelamentoEventoTO cancelamentoEventoTO = new CancelamentoEventoTO();
                cancelamentoEventoTO.setNotaFiscalTO(this.a.detalharNotaFiscal(this.a.getSelectedNotaFiscalTO()));
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

    private void h() {
        try {
            CartaCorrecaoTO cartaCorrecaoTO = new CartaCorrecaoTO();
            cartaCorrecaoTO.setNotaFiscalTO(this.a.detalharNotaFiscal(this.a.getSelectedNotaFiscalTO()));
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

    private void i() {
    }

    private void a(EventoTO eventoTO, String tituloPersonalizado) throws Exception {
        CertificadoTO certificado = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA);
        ArrayList<EventoTO> listaEventos = new ArrayList<EventoTO>();
        listaEventos.add(eventoTO);
        if (certificado != null) {
            EnviarEventoController enviarEventoController = new EnviarEventoController(listaEventos, certificado);
            EnviarEventoGUI enviarEventoGUI = enviarEventoController.showNewGUI((Window)DSENDesktop.getInstance(), tituloPersonalizado);
            enviarEventoGUI.addPropertyChangeListener((PropertyChangeListener)this);
            enviarEventoGUI.setVisible(true);
        }
    }

    private void j() throws Exception {
        CertificadoTO certificado = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.CONEXAO);
        if (certificado != null) {
            List notaTOList = this.a.detalhar(this.a.getSelectedNotas());
            this.a(notaTOList);
            ConsultarNotaFiscalController consultaController = new ConsultarNotaFiscalController(certificado, notaTOList, false);
            ConsultarNotaFiscalGUI consultaGUI = consultaController.showNewGUI();
            consultaGUI.addPropertyChangeListener((PropertyChangeListener)this);
            consultaGUI.setVisible(true);
        }
    }

    private void k() throws Exception {
        ManterNotaFiscalGUI manterNotaFiscalGUI = new ManterNotaFiscalGUI("manterNotaOperacaoInclusao", null);
        manterNotaFiscalGUI.addPropertyChangeListener((PropertyChangeListener)this);
        WindowManager.getInstance().showPanel((DSGEPanel)manterNotaFiscalGUI, false);
    }

    private void l() throws Exception {
        CertificadoTO certificadoTO;
        List notaFiscalTOList = this.a.detalhar(this.a.getSelectedNotas());
        if (notaFiscalTOList != null && !notaFiscalTOList.isEmpty() && (certificadoTO = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA)) != null) {
            GerarDpecController controller = new GerarDpecController();
            GerarDpecGUI gui = controller.getGUI();
            controller.gerarDPEC(notaFiscalTOList, certificadoTO);
            gui.setVisible(true);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block28 : {
            try {
                if (actionEvent.getActionCommand().equals("pesquisar")) {
                    this.s();
                    List list = this.a(this.a.getPesquisaNotaFiscalTO(), true);
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_VALIDAR")) {
                    this.a();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("detalhar")) {
                    this.b();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("excluir")) {
                    this.c();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("exportar")) {
                    this.d();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_PRE_VISUALIZAR_DANFE")) {
                    this.a(true);
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_IMPRIMIR_DANFE")) {
                    this.a(false);
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_ASSINAR")) {
                    this.e();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_TRANSMITIR")) {
                    this.f();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_CANCELAR_NFE")) {
                    this.g();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_CONSULTAR_SITUACAO_SEFAZ")) {
                    this.j();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_EMITIR_NOVA_NFE")) {
                    this.k();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_VER_CHAVE_SEM_FORMATACAO")) {
                    this.p();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_GERAR_DPEC")) {
                    this.l();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_PARAR_BUSCA")) {
                    this.n();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_VERIFICAR_PROCESSAMENTOS_PENDENTES")) {
                    this.o();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_DUPLICAR")) {
                    this.m();
                    break block28;
                }
                if (actionEvent.getActionCommand().equals("ACTION_ENVIAR_CARTA_CORRECAO")) {
                    try {
                        this.h();
                    }
                    catch (Throwable ex) {
                        this.a.showErrors(ex);
                    }
                    break block28;
                }
                if (!actionEvent.getActionCommand().equals("ACTION_CANCELAR_NFE_EVENTO")) break block28;
                try {
                    this.i();
                }
                catch (Throwable ex) {
                    this.a.showErrors(ex);
                }
            }
            catch (DSENBusinessException dex) {
                this.a.showErrors((DSGEBaseException)dex);
                {
                    catch (Throwable throwable) {
                        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                        throw throwable;
                    }
                }
                SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                return;
                catch (Exception ex) {
                    this.a.showErrors((DSGEBaseException)new DSGEViewException((Throwable)ex, ex.getMessage()));
                    SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                    return;
                }
            }
        }
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        return;
    }

    private void m() {
        NotaFiscalTO notaFiscalTO = this.a.getSelectedNotaFiscalTO();
        if (notaFiscalTO != null) {
            try {
                notaFiscalTO.clearErrors();
                notaFiscalTO.clearMessages();
                notaFiscalTO = this.a.detalharNotaFiscal(notaFiscalTO);
                if (notaFiscalTO.getErrors() != null) {
                    this.a.showMessage((BaseTO)notaFiscalTO);
                } else {
                    DuplicarNFeGUI duplicarNFeGUI = new DuplicarNFeGUI(notaFiscalTO);
                    duplicarNFeGUI.addPropertyChangeListener((PropertyChangeListener)this);
                    duplicarNFeGUI.setVisible(true);
                }
            }
            catch (Throwable t) {
                this.a.showErrors(t);
            }
        }
    }

    private void n() {
        if (QueueManager.getInstance(BuscaRetornoQueueItem.class).containsItens()) {
            if (0 == this.a.showQuestion(DSENMessageConstants.QUESTION_PARAR_BUSCA_RETORNO)) {
                QueueManager.getInstance(BuscaRetornoQueueItem.class).cancel();
                this.a.setPararBuscaRetornoEnabled(false);
            }
        } else {
            this.a.showMessage(DSENMessageConstants.MSG_NAO_EXISTE_ITENS_PARA_CANCELAR_BUSCA_RETORNO);
            this.a.setPararBuscaRetornoEnabled(false);
        }
    }

    private void o() {
        block14 : {
            try {
                List notaTOList = this.a.detalhar(this.a.getSelectedNotas());
                this.a(notaTOList);
                String msg = "";
                if (notaTOList == null || notaTOList.isEmpty()) break block14;
                Map mapCertificado = new HashMap();
                for (NotaFiscalTO notaTO : notaTOList) {
                    try {
                        String erro = this.a.verificarItemFilaBuscaRetorno(notaTO);
                        if (erro != null) {
                            msg = msg + erro + "\n";
                            continue;
                        }
                    }
                    catch (DSGEBaseException e) {
                        this.a.showErrors(e);
                    }
                    String cnpj = notaTO.getLoteTO().getCnpjTransmissao();
                    CertificadoLoteTO certLoteTO = (CertificadoLoteTO)mapCertificado.get(cnpj);
                    if (certLoteTO == null) {
                        certLoteTO = new CertificadoLoteTO();
                        certLoteTO.setCnpjTransmissao(cnpj);
                        certLoteTO.setQuantidadeLote(Integer.valueOf(1));
                        mapCertificado.put(cnpj, certLoteTO);
                        continue;
                    }
                    certLoteTO.setQuantidadeLote(Integer.valueOf(certLoteTO.getQuantidadeLote() + 1));
                }
                if (!StringHelper.isBlankOrNull((Object)msg)) {
                    this.a.showMessage(msg);
                }
                if (mapCertificado.size() == 0) {
                    return;
                }
                boolean isCancelled = false;
                SelecionarCertificadoLoteGUI certificadoLotegui = new SelecionarCertificadoLoteGUI((Frame)DSENDesktop.getInstance(), true, mapCertificado);
                certificadoLotegui.setVisible(true);
                mapCertificado = certificadoLotegui.getMapCertificadoLoteTO();
                isCancelled = certificadoLotegui.isCancelled();
                if (!isCancelled) {
                    CertificadoLoteTO cert2 = null;
                    for (CertificadoLoteTO cert2 : mapCertificado.values()) {
                        if (!Certificado.A3.equals(cert2.getTpCertificado())) continue;
                        certificadoLotegui.showMessage(DSENMessageConstants.MANTENHA_A3_CONECTADO);
                        break;
                    }
                    if (cert2 != null) {
                        boolean statusServicoOK = this.a.verificarStatusServicoAtivo(cert2, true);
                        if (!statusServicoOK) {
                            certificadoLotegui.showMessage(DSENMessageConstants.SERVICO_SEFAZ_INATIVO);
                        } else {
                            this.a.agendarBuscaRetorno(notaTOList, mapCertificado);
                            this.a.setPararBuscaRetornoEnabled(QueueManager.getInstance(BuscaRetornoQueueItem.class).containsItens());
                        }
                    }
                }
            }
            catch (DSGEBaseException ex) {
                DSGEMessageDialog.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void p() {
        ChaveSemFormatacaoGUI chaveGUI = new ChaveSemFormatacaoGUI((Frame)DSENDesktop.getInstance(), false);
        try {
            chaveGUI.setChave(ChaveAcessoUtil.gerarChaveAcessoTO((NotaFiscalTO)this.a.getSelectedNotaFiscalTO()).getChaveAcesso());
            WindowManager.getInstance().centralizarDialogo((JDialog)chaveGUI);
            chaveGUI.setVisible(true);
        }
        catch (ParseException e) {
            this.a.showErrors((DSGEBaseException)new DSGEViewException((Throwable)e, e.getMessage()));
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        try {
            if (this.a != null && "NOTA_FISCAL_CHANGED".equals(event.getPropertyName())) {
                this.r();
                this.a(this.a, false);
                SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void q() {
        List notasSelecionadas = this.a.getSelectedNotas();
        BotoesEnum[] botoes = BotoesEnum.values();
        if (notasSelecionadas == null || notasSelecionadas.size() == 0) {
            for (int i = 0; i < botoes.length; ++i) {
                BotoesEnum botao = botoes[i];
                this.a.disableComponents(botao.getName());
            }
            return;
        }
        for (int i = 0; i < botoes.length; ++i) {
            BotoesEnum botao = botoes[i];
            boolean habilita = true;
            for (int k = 0; k < notasSelecionadas.size(); ++k) {
                NotaFiscalTO nota = (NotaFiscalTO)notasSelecionadas.get(k);
                EstadoNF estadoNota = null;
                SituacaoNFeEnum situacao = nota.getSituacao();
                TipoEmissaoEnum tipoEmissao = nota.getTipoEmissao();
                boolean danfe = nota.getDanfeImpresso() != null && nota.getDanfeImpresso() != false;
                switch (7.a[situacao.ordinal()]) {
                    case 1: {
                        if (tipoEmissao == TipoEmissaoEnum.CONTINGENCIA || tipoEmissao == TipoEmissaoEnum.CONTINGENCIA_FS_DA) {
                            if (danfe) {
                                estadoNota = EstadoNF.ASSINADA_CONTINGENCIA_DANFE;
                                break;
                            }
                            estadoNota = EstadoNF.ASSINADA_CONTINGENCIA;
                            break;
                        }
                        if (tipoEmissao == TipoEmissaoEnum.CONTINGENCIA_DPEC) {
                            if (danfe) {
                                estadoNota = EstadoNF.ASSINADA_CONTINGENCIA_DPEC_DANFE;
                                break;
                            }
                            estadoNota = EstadoNF.ASSINADA_CONTINGENCIA_DPEC;
                            break;
                        }
                        estadoNota = EstadoNF.ASSINADA;
                        break;
                    }
                    case 2: {
                        estadoNota = EstadoNF.AUTORIZADA;
                        break;
                    }
                    case 3: {
                        estadoNota = EstadoNF.CANCELADA;
                        break;
                    }
                    case 4: {
                        estadoNota = EstadoNF.CANCELADA_EVENTO;
                        break;
                    }
                    case 5: {
                        estadoNota = EstadoNF.DENEGADA;
                        break;
                    }
                    case 6: {
                        estadoNota = EstadoNF.DIGITACAO;
                        break;
                    }
                    case 7: {
                        if (danfe && tipoEmissao == TipoEmissaoEnum.CONTINGENCIA) {
                            estadoNota = EstadoNF.PROCESSAMENTO_CONTINGENCIA_DANFE;
                            break;
                        }
                        estadoNota = EstadoNF.PROCESSAMENTO;
                        break;
                    }
                    case 8: {
                        estadoNota = EstadoNF.REJEITADA;
                        break;
                    }
                    case 9: {
                        if (danfe && tipoEmissao == TipoEmissaoEnum.CONTINGENCIA) {
                            estadoNota = EstadoNF.TRANSMITIDA_PENDENCIA_CONTINGENCIA_DANFE;
                            break;
                        }
                        estadoNota = EstadoNF.TRANSMITIDA_PENDENCIA;
                        break;
                    }
                    case 10: {
                        estadoNota = EstadoNF.VALIDADA;
                    }
                }
                if (estadoNota == null || a[i][estadoNota.ordinal()]) continue;
                habilita = false;
                break;
            }
            if (habilita) {
                this.a.enableComponents(botao.getName());
            } else {
                this.a.disableComponents(botao.getName());
            }
            if (notasSelecionadas.size() <= 1) continue;
            for (BotoesEnum b : this.a) {
                this.a.disableComponents(b.getName());
            }
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    public void update(Object o, EnumItf source) {
        switch (7.b[((AppContextEnum)source).ordinal()]) {
            case 1: {
                Boolean running = (Boolean)o;
                if (running.booleanValue()) break;
                try {
                    this.s();
                    this.a(this.a, false);
                    this.q();
                    break;
                }
                catch (DSGEBaseException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void sortColumnChanged(JDSGEPageableTable source) {
        try {
            this.a(this.a, false);
        }
        catch (DSGEBaseException ex) {
            try {
                this.a.showErrors(ex);
            }
            catch (Throwable throwable) {
                SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                throw throwable;
            }
            SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        }
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void pageChanged(JDSGEPageableTable source) {
        try {
            this.a(this.a, false);
        }
        catch (DSGEBaseException ex) {
            try {
                this.a.showErrors(ex);
            }
            catch (Throwable throwable) {
                SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                throw throwable;
            }
            SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        }
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void r() {
        try {
            PesquisaNotaFiscalTO to = this.a.getPesquisaNotaFiscalTO();
            int count = this.a.getCountNotaFiscal(to);
            this.a.getTable().setNumberOfLines(count);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void s() {
        this.a.getTable().reset();
        this.r();
    }

    public boolean canCloseGUI() {
        Notificador.getInstance().remove((Observer)this);
        return super.canCloseGUI();
    }

    public void onCancel(int agendadosCancelados, int prontosCancelados) {
        this.a.setPararBuscaRetornoEnabled(QueueManager.getInstance(BuscaRetornoQueueItem.class).containsItens());
    }

    public void onConsume(BuscaRetornoQueueItem obj) {
    }

    public void onError(BuscaRetornoQueueItem obj, Throwable error) {
    }

    public void onShutdown(BuscaRetornoQueueItem obj) {
    }

    public void onSleep(BuscaRetornoQueueItem obj) {
        this.a.setPararBuscaRetornoEnabled(QueueManager.getInstance(BuscaRetornoQueueItem.class).containsItens());
        this.s();
        try {
            this.a(this.a, false);
        }
        catch (DSGEBaseException e) {
            this.a.showErrors(e);
        }
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void onStartup(BuscaRetornoQueueItem obj) {
    }

    public void onWakeup(BuscaRetornoQueueItem obj, int queueSize) {
    }

    public void onPush(BuscaRetornoQueueItem obj) {
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

    private List<NotaFiscalTO> a(List<NotaFiscalTO> lista) {
        if (lista == null) {
            return null;
        }
        for (NotaFiscalTO notaTO : lista) {
            this.a(notaTO);
        }
        return lista;
    }

    static /* synthetic */ void a(PesquisarNotaFiscalController x0) {
        x0.q();
    }

    static {
    }
}

