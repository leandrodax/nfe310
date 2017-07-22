/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta$ErroXmlRespostaAcao
 *  br.gov.sp.fazenda.dsen.controller.PesquisarFaixaParaInutilizarController
 *  br.gov.sp.fazenda.dsen.controller.PesquisarFaixaParaInutilizarController$1
 *  br.gov.sp.fazenda.dsen.controller.PesquisarFaixaParaInutilizarController$2
 *  br.gov.sp.fazenda.dsen.controller.PesquisarFaixaParaInutilizarController$3
 *  br.gov.sp.fazenda.dsen.controller.PesquisarFaixaParaInutilizarController$InutilizacaoWorker
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI
 *  br.gov.sp.fazenda.dsen.view.FaixaInutilizadaAvisoGUI
 *  br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI
 *  br.gov.sp.fazenda.dsen.view.JustificativaGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarFaixaParaInutilizarGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.PesquisarFaixaParaInutilizarController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI;
import br.gov.sp.fazenda.dsen.view.FaixaInutilizadaAvisoGUI;
import br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI;
import br.gov.sp.fazenda.dsen.view.JustificativaGUI;
import br.gov.sp.fazenda.dsen.view.PesquisarFaixaParaInutilizarGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.model.queue.QueueListener;
import br.gov.sp.fazenda.dsge.model.queue.QueueManager;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class PesquisarFaixaParaInutilizarController
extends DSGEBaseController
implements Observer,
QueueListener<BuscaRetornoQueueItem>,
CellEditorListener {
    private PesquisarFaixaParaInutilizarGUI a;
    private FaixaInutilizadaAvisoGUI a;
    private NotaFiscalFacade a;
    private InutilizarFaixaGUI a;
    private InutilizacaoWorker a;
    private Map<String, InutilizacaoTO> a;
    private List<InutilizacaoTO> a;
    private CertificadoTO a;
    private InutilizacaoTO a;

    public PesquisarFaixaParaInutilizarController(ViewItf view) throws DSGEUtilException {
        this.a = (PesquisarFaixaParaInutilizarGUI)view;
        this.a.addActionListener((EventListener)this);
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.INUTILIZACAO, GrupoNotificacaoEnum.UF_NAO_HABILITADA, GrupoNotificacaoEnum.INUTILIZACAO_ERRO_SEFAZ, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SEFAZ, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_INUTILIZACAO, GrupoNotificacaoEnum.EXCEPTION});
        QueueManager.getInstance(BuscaRetornoQueueItem.class).addListener((QueueListener)this);
        this.a.disableComponents("inutilizarFaixaInicio");
        this.a.disableComponents("inutilizarFaixaNumeracao");
        this.a = new NotaFiscalFacade();
        if (AppContext.getInstance().isBuscaRetornoSEFAZRunning()) {
            this.b();
        }
        this.a(this.a.getOperacao());
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("pesquisar")) {
                HashMap map;
                InutilizacaoTO inutilizacaoTO = this.a.getInutilizacaoTO();
                if (this.a(inutilizacaoTO) && ((map = this.a(inutilizacaoTO)) == null || map.size() == 0)) {
                    this.a.showMessage(DSENMessageConstants.NENHUM_RESULTADO_ENCONTRADO);
                }
                this.a = null;
            } else if (e.getActionCommand().equals("inutilizar")) {
                this.c();
            } else if (e.getActionCommand().equals("cancelar")) {
                this.a.dispose();
                this.a = null;
                this.d();
            } else if (e.getActionCommand().equals("fechar")) {
                this.d();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private boolean a(InutilizacaoTO pesquisaInutilizacaoTO) {
        try {
            InutilizacaoTO validado = this.a.validarFiltroPesquisarFaixasParaInutilizar(pesquisaInutilizacaoTO);
            if (validado.hasErrors()) {
                this.a.showMessage((BaseTO)validado);
                return false;
            }
            return true;
        }
        catch (DSENBusinessException e) {
            this.a.showErrors((DSGEBaseException)e);
            return false;
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.e();
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    public void update(Object data, EnumItf source) {
        if (this.a.isProgressBarIndeterminated()) {
            this.a.setProgressBarIndeterminated(false);
        }
        switch (3.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                this.a(data);
                break;
            }
            case 2: {
                this.a(true, data);
                break;
            }
            case 3: {
                this.b(true, data);
                break;
            }
            case 4: {
                this.a(ServicoSefazEnum.StatusServico, data, true);
                break;
            }
            case 5: {
                this.a(ServicoSefazEnum.Inutilizacao, data, true);
                break;
            }
            case 6: {
                this.c(data);
                break;
            }
            case 7: {
                this.c(data);
                break;
            }
            case 8: {
                this.b(data);
            }
        }
    }

    private String a(InutilizacaoTO inutTO) {
        return inutTO.getSerie() + "-" + inutTO.getNumeroInicial() + "-" + inutTO.getNumeroFinal();
    }

    private void a(Object obj) {
        if (obj instanceof InutilizacaoTO) {
            InutilizacaoTO inutTO = (InutilizacaoTO)obj;
            this.a().put(this.a(inutTO), inutTO);
            this.a.a(inutTO);
        } else if (obj instanceof List) {
            for (Object inutTO : (List)obj) {
                this.a(inutTO);
            }
        }
    }

    private void a(boolean isSefaz, Object data) {
        Object[] dataArray = (Object[])data;
        if (isSefaz) {
            this.a((String)dataArray[0], DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_MENSAGEM, dataArray[1]);
        } else {
            this.a((String)dataArray[0], DSENMessageConstants.PROBLEMA_CONEXAO_SCAN_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SCAN_MENSAGEM, dataArray[1]);
        }
    }

    private void b(boolean isSefaz, Object data) {
        Object[] dataArray = (Object[])data;
        if (isSefaz) {
            this.a((String)dataArray[0], DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_MENSAGEM, dataArray[1]);
        } else {
            this.a((String)dataArray[0], DSENMessageConstants.PROBLEMA_CONEXAO_SCAN_INDISPONIVEL_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SCAN_INDISPONIVEL_MENSAGEM, dataArray[1]);
        }
    }

    private void a(String detalhe, String titulo, String mensagem, Object data) {
        int tempo = DSENConstants.INTERV_TENT_CONEXAO;
        ProblemaConexaoAcao problemaConexaoAcao = ProblemaConexaoGUI.showGUI((JDialog)this.a, (int)tempo, (String)detalhe, (String)titulo, (String)mensagem);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.a.setProgressBarIndeterminated(true);
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.RECONECTAR);
        } else if (problemaConexaoAcao == ProblemaConexaoAcao.CANCELAR) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.CANCELAR);
        }
    }

    private void a(ServicoSefazEnum servico, Object data, boolean isSefaz) {
        Object[] dataArray = (Object[])data;
        ErroXmlResposta erroXmlResposta = (ErroXmlResposta)dataArray[0];
        String message = isSefaz ? DSENMessageConstants.ERRO_NA_RESPOSTA_DA_SEFAZ : DSENMessageConstants.ERRO_NA_RESPOSTA_DO_SCAN;
        ErroXmlResposta.ErroXmlRespostaAcao acao = ErroXmlRespostaGUI.showError((String)erroXmlResposta.toHTML(), (ServicoSefazEnum)servico, (Dialog)null, (String)message, (String)message);
        if (servico == ServicoSefazEnum.StatusServico) {
            if (acao == ErroXmlResposta.ErroXmlRespostaAcao.CONTINUAR) {
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.ERRO_XML_RETORNO_ACAO, (Object)ErroXmlResposta.ErroXmlRespostaAcao.CONTINUAR);
            } else if (acao == ErroXmlResposta.ErroXmlRespostaAcao.FECHAR) {
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.ERRO_XML_RETORNO_ACAO, (Object)ErroXmlResposta.ErroXmlRespostaAcao.FECHAR);
            }
        }
    }

    private void b(Object data) {
        Object[] dataArray = (Object[])data;
        this.a.showErrors((DSGEBaseException)dataArray[0]);
    }

    private void c(Object data) {
        Object[] dataArray = (Object[])data;
        this.a.showMessage((String)dataArray[0]);
    }

    private void a() {
        List listaNaoProcessada = this.a();
        if (listaNaoProcessada != null) {
            for (InutilizacaoTO inutilizacaoTO : listaNaoProcessada) {
                inutilizacaoTO.setIcon(this.a(inutilizacaoTO));
                inutilizacaoTO.addError(DSENMessageConstants.FAIXA_NAO_INUTILIZADA);
                this.a.updateGUI(inutilizacaoTO);
            }
        }
    }

    private PesquisarFaixaParaInutilizarController a() {
        return this;
    }

    private void b() {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    private HashMap<String, List<InutilizacaoTO>> a(InutilizacaoTO inutilizacaoTO) throws DSGEUtilException {
        this.a = inutilizacaoTO = inutilizacaoTO == null ? this.a.getInutilizacaoTO() : inutilizacaoTO;
        if (inutilizacaoTO != null) {
            inutilizacaoTO.setEmitenteTO((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
            try {
                HashMap map = this.a.obterFaixasParaInutilizar(inutilizacaoTO);
                this.a.disableComponents("inutilizarFaixaInicio");
                this.a.setListaInutilizacaoTO(map);
                return map;
            }
            catch (DSENBusinessException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
        return null;
    }

    private void c() {
        this.a = null;
        this.a = this.a();
        try {
            if (this.a != null && !this.a.isEmpty()) {
                ArrayList<SituacaoNFeEnum> situacoes = new ArrayList<SituacaoNFeEnum>();
                situacoes.add(SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ);
                int numeroEmProcessamento = 0;
                for (InutilizacaoTO pesquisaInutilizacaoTO : this.a) {
                    List seriesNumerosList = this.a.getSerieNumeroAnoPorSituacoes(pesquisaInutilizacaoTO.getEmitenteTO().getIdEmitente(), pesquisaInutilizacaoTO.getSerie(), pesquisaInutilizacaoTO.getNumeroInicial(), pesquisaInutilizacaoTO.getNumeroFinal(), situacoes);
                    if (seriesNumerosList == null) continue;
                    numeroEmProcessamento += seriesNumerosList.size();
                }
                situacoes.clear();
                situacoes.add(SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA);
                int numeroTransmitidoPendencia = 0;
                for (InutilizacaoTO pesquisaInutilizacaoTO : this.a) {
                    List seriesNumerosList = this.a.getSerieNumeroAnoPorSituacoes(pesquisaInutilizacaoTO.getEmitenteTO().getIdEmitente(), pesquisaInutilizacaoTO.getSerie(), pesquisaInutilizacaoTO.getNumeroInicial(), pesquisaInutilizacaoTO.getNumeroFinal(), situacoes);
                    if (seriesNumerosList == null) continue;
                    numeroTransmitidoPendencia += seriesNumerosList.size();
                }
                String pergunta = "";
                if (numeroEmProcessamento > 0) {
                    pergunta = pergunta + MessageFormat.format(DSENMessageConstants.MSG_EXISTE_X_NFE_EM_PROCESSAMENTO_SEFAZ, numeroEmProcessamento) + "\n";
                }
                if (numeroTransmitidoPendencia > 0) {
                    pergunta = pergunta + MessageFormat.format(DSENMessageConstants.MSG_EXISTE_X_NFE_TRANSMITIDA_PENDENCIA, numeroTransmitidoPendencia) + "\n";
                }
                if (numeroTransmitidoPendencia > 0 || numeroEmProcessamento > 0) {
                    pergunta = pergunta + DSENMessageConstants.QUESTION_INUTILIZAR_NFE_PENDENTE_RETORNO;
                }
                if (!StringHelper.isBlankOrNull((Object)pergunta) && 0 != this.a.showQuestion(pergunta)) {
                    return;
                }
            }
        }
        catch (Throwable e) {
            this.a.showErrors(e);
        }
        if (this.a.showQuestion(DSENMessageConstants.MSG_INUTILIZAR_FAIXA_CONFIRMA_INUTILIZACAO) == 0 && this.a != null) {
            try {
                String justificativa = JustificativaGUI.showGUI();
                if (!StringHelper.isBlankOrNull((Object)justificativa)) {
                    this.a = SelecionarCertificadoGUI.getCertificado((Component)DSENDesktop.getInstance(), (TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA);
                    if (this.a != null) {
                        this.a = this.a.assinarFaixasParaInutilizar((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class), this.a, this.a, justificativa);
                        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                        this.a = new InutilizacaoWorker(this, this.a, this.a);
                        this.a.execute();
                    }
                }
            }
            catch (DSENBusinessException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void d() {
        WindowManager.getInstance().closePanel();
    }

    public boolean canCloseGUI() {
        Notificador.getInstance().remove((Observer)this);
        QueueManager.getInstance(BuscaRetornoQueueItem.class).removeListener((QueueListener)this);
        return true;
    }

    private void e() {
        List lista = this.a.getSelectedInutilizacaoTOs();
        this.a.disableComponents("inutilizarFaixaInicio");
        if (lista != null && lista.size() == 1) {
            this.a.enableComponents("inutilizarFaixaUmaSelecionada");
        } else if (lista != null && lista.size() > 0) {
            this.a.enableComponents("inutilizarFaixaVariasSelecionadas");
        }
    }

    private void a(String op) throws DSGEUtilException {
        if ("PESQUISAR_FAIXAS_INUTILIZACAO".equals(op)) {
            this.a(null);
        }
    }

    private Map<String, InutilizacaoTO> a() {
        if (this.a == null) {
            this.a = new HashMap();
        }
        return this.a;
    }

    private List<InutilizacaoTO> a() {
        List lista = this.a == null ? this.a.getSelectedInutilizacaoTOs() : this.a;
        ArrayList<InutilizacaoTO> listaNova = new ArrayList<InutilizacaoTO>();
        if (lista != null) {
            Map mapInutilizacao = this.a();
            for (InutilizacaoTO inutilizacaoTO : lista) {
                if (mapInutilizacao.containsKey(this.a(inutilizacaoTO))) continue;
                listaNova.add(inutilizacaoTO);
            }
        }
        this.a = listaNova;
        return listaNova;
    }

    private Icon a(InutilizacaoTO inutilizacaoTO) {
        ImageIcon icon = null;
        icon = inutilizacaoTO.isSucesso() == null ? new ImageIcon(DSENDesktop.class.getResource("resources/warning.gif")) : (inutilizacaoTO.isSucesso() != false ? new ImageIcon(DSENDesktop.class.getResource("resources/check.gif")) : new ImageIcon(DSENDesktop.class.getResource("resources/error.gif")));
        return icon;
    }

    public void onCancel(int agendadosCancelados, int prontosCancelados) {
    }

    public void onConsume(BuscaRetornoQueueItem obj) {
    }

    public void onError(BuscaRetornoQueueItem obj, Throwable error) {
    }

    public void onPush(BuscaRetornoQueueItem obj) {
    }

    public void onShutdown(BuscaRetornoQueueItem obj) {
    }

    public void onSleep(BuscaRetornoQueueItem obj) {
        if (this.a != null) {
            this.a.setVisible(false);
            this.a.dispose();
        }
    }

    public void onStartup(BuscaRetornoQueueItem obj) {
    }

    public void onWakeup(BuscaRetornoQueueItem obj, int queueSize) {
    }

    static /* synthetic */ FaixaInutilizadaAvisoGUI a(PesquisarFaixaParaInutilizarController x0, FaixaInutilizadaAvisoGUI x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ PesquisarFaixaParaInutilizarController a(PesquisarFaixaParaInutilizarController x0) {
        return x0.a();
    }

    static /* synthetic */ FaixaInutilizadaAvisoGUI a(PesquisarFaixaParaInutilizarController x0) {
        return x0.a;
    }

    static /* synthetic */ InutilizarFaixaGUI a(PesquisarFaixaParaInutilizarController x0, InutilizarFaixaGUI x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ InutilizarFaixaGUI a(PesquisarFaixaParaInutilizarController x0) {
        return x0.a;
    }

    static /* synthetic */ NotaFiscalFacade a(PesquisarFaixaParaInutilizarController x0) {
        return x0.a;
    }

    static /* synthetic */ Icon a(PesquisarFaixaParaInutilizarController x0, InutilizacaoTO x1) {
        return x0.a(x1);
    }

    static /* synthetic */ List a(PesquisarFaixaParaInutilizarController x0) {
        return x0.a;
    }

    static /* synthetic */ Map a(PesquisarFaixaParaInutilizarController x0) {
        return x0.a();
    }

    static /* synthetic */ void a(PesquisarFaixaParaInutilizarController x0) {
        x0.a();
    }

    static /* synthetic */ Map a(PesquisarFaixaParaInutilizarController x0, Map x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ InutilizacaoTO a(PesquisarFaixaParaInutilizarController x0) {
        return x0.a;
    }

    static /* synthetic */ HashMap a(PesquisarFaixaParaInutilizarController x0, InutilizacaoTO x1) throws DSGEUtilException {
        return x0.a(x1);
    }
}

