/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta$ErroXmlRespostaAcao
 *  br.gov.sp.fazenda.dsen.controller.EnviarEventoController
 *  br.gov.sp.fazenda.dsen.controller.EnviarEventoController$1
 *  br.gov.sp.fazenda.dsen.controller.EnviarEventoController$2
 *  br.gov.sp.fazenda.dsen.view.EnviarEventoGUI
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.EnviarEventoController;
import br.gov.sp.fazenda.dsen.view.EnviarEventoGUI;
import br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EnviarEventoController
extends DSGEBaseController
implements Observer,
WindowListener {
    CertificadoTO a;
    EventoTO a;
    Map<String, EventoTO> a;
    EnviarEventoGUI a;
    ImageIcon a;
    ImageIcon b = new ImageIcon(EnviarEventoGUI.class.getResource("resources/error.gif"));
    ImageIcon c = new ImageIcon(EnviarEventoGUI.class.getResource("resources/check.gif"));
    private List<EventoTO> a = new ImageIcon(EnviarEventoGUI.class.getResource("resources/warning.gif"));

    public EnviarEventoController(List<EventoTO> listaEventos, CertificadoTO cTO) {
        this.a = cTO;
        this.a = listaEventos;
        this.a(listaEventos);
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.EVENTO_ENVIADO, GrupoNotificacaoEnum.ERRO_CONEXAO_EVENTO_SCAN, GrupoNotificacaoEnum.ERRO_CONEXAO_EVENTO_SEFAZ, GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_EVENTO, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_EVENTO, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_CONSULTA_STATUS, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SEFAZ, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SCAN, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.EXCEPTION, GrupoNotificacaoEnum.UF_NAO_HABILITADA});
    }

    private void a(List<EventoTO> listaEventoTO) {
        for (EventoTO eventoTO : listaEventoTO) {
            eventoTO.clearErrors();
            eventoTO.clearMessages();
        }
    }

    private int a() {
        return this.a.size() * 100 / this.a.size();
    }

    private List<EventoTO> a() {
        ArrayList<EventoTO> eventos = new ArrayList<EventoTO>();
        for (EventoTO eventoTO : this.a) {
            String key = DocumentoUtil.criarIdDocumentoEvento((EventoTO)eventoTO);
            if (this.a.containsKey(key)) continue;
            eventos.add(eventoTO);
        }
        return eventos;
    }

    private void a() {
        this.a.setProgressBarIndeterminated(true);
         s = new /* Unavailable Anonymous Inner Class!! */;
        s.execute();
    }

    public EnviarEventoGUI showNewGUI(Window parent, String titulo) {
        this.a = new EnviarEventoGUI(parent);
        this.a.setTituloPersonalizado(titulo);
        this.a.addWindowListener((WindowListener)this);
        this.a.addActionListener((EventListener)this);
        this.a();
        return this.a;
    }

    public void actionPerformed(ActionEvent e) {
        if ("cancelar".equals(e.getActionCommand())) {
            this.a.dispose();
        }
    }

    private void b() {
        List naoEnviados = this.a();
        for (EventoTO eventoTO : naoEnviados) {
            this.a.addEventoTO(this.a(eventoTO));
        }
    }

    public void update(Object data, EnumItf source) {
        if (this.a.isProgressBarIndeterminated()) {
            this.a.setProgressBarIndeterminated(false);
        }
        switch (2.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                EventoTO eventoTO = (EventoTO)data;
                this.a(eventoTO);
                if (!Boolean.TRUE.equals(eventoTO.sucessoOperacao())) break;
                this.a.firePropertyChange("EVENTO_ENVIADO", (Object)null, (Object)eventoTO);
                break;
            }
            case 2: {
                this.a(data, true);
                break;
            }
            case 3: {
                this.a(data, false);
                break;
            }
            case 4: {
                this.b(data, true);
                break;
            }
            case 5: {
                this.b(data, false);
                break;
            }
            case 6: 
            case 7: {
                this.b(data);
                break;
            }
            case 8: 
            case 9: {
                this.b(data);
                break;
            }
            case 10: {
                this.d(data);
                break;
            }
            case 11: {
                this.d(data);
                break;
            }
            case 12: {
                this.c(data);
            }
        }
    }

    private void a(String finishMessage) {
        this.b();
        this.a.setProgressBarIndeterminated(false);
        this.a.setPercentCompleted(100);
        this.a.setDefaultCloseOperation(2);
        this.a.setBtnFecharEnabled(true);
        if (finishMessage != null) {
            this.a.showMessage(finishMessage);
        }
        Notificador.getInstance().remove((Observer)this);
    }

    private String a() {
        int ok = 0;
        int erro = 0;
        int naoEnviada = 0;
        for (EventoTO cTO : this.a.values()) {
            if (cTO.sucessoOperacao() == null) {
                ++naoEnviada;
                continue;
            }
            if (cTO.sucessoOperacao().booleanValue()) {
                ++ok;
                continue;
            }
            ++erro;
        }
        return MessageFormat.format(DSENMessageConstants.MSG_FIM_ENVIO_EVENTO, "" + (ok + erro), "" + ok, "" + erro);
    }

    private EventoTO a(EventoTO eventoTO) {
        if (eventoTO.sucessoOperacao() == null) {
            eventoTO.setIcon((Icon)this.a);
        } else if (eventoTO.sucessoOperacao().booleanValue()) {
            eventoTO.setIcon((Icon)this.c);
        } else {
            eventoTO.setIcon((Icon)this.b);
        }
        return eventoTO;
    }

    private void a(Object eventoObject) {
        if (eventoObject instanceof EventoTO) {
            this.a((EventoTO)eventoObject);
        } else if (eventoObject instanceof List) {
            for (EventoTO eventoTO : (List)eventoObject) {
                this.a(eventoTO);
            }
        }
    }

    private void a(EventoTO eventoTO) {
        String key = DocumentoUtil.criarIdDocumentoEvento((EventoTO)eventoTO);
        if (!this.a.containsKey(key)) {
            this.a.put(key, eventoTO);
            this.a.addEventoTO(this.a(eventoTO));
            this.a.setPercentCompleted(this.a());
        }
    }

    private void a(Object data, boolean isSefaz) {
        Object[] dataArray = (Object[])data;
        this.a((String)dataArray[0], isSefaz ? DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_TITULO : DSENMessageConstants.PROBLEMA_CONEXAO_SCAN_TITULO, isSefaz ? DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_MENSAGEM : DSENMessageConstants.PROBLEMA_CONEXAO_SCAN_MENSAGEM, dataArray[1]);
    }

    private void b(Object data, boolean isSefaz) {
        this.a((String)data, isSefaz ? DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_TITULO : DSENMessageConstants.PROBLEMA_CONEXAO_SCAN_INDISPONIVEL_TITULO, isSefaz ? DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_MENSAGEM : DSENMessageConstants.PROBLEMA_CONEXAO_SCAN_INDISPONIVEL_MENSAGEM, (Object)this.a);
    }

    private void a(String detalhe, String titulo, String mensagem, Object data) {
        ProblemaConexaoAcao problemaConexaoAcao = ProblemaConexaoGUI.showGUI((JDialog)this.a, (int)DSENConstants.INTERV_TENT_CONEXAO, (String)detalhe, (String)titulo, (String)mensagem);
        if (ProblemaConexaoAcao.RECONECTAR.equals((Object)problemaConexaoAcao)) {
            this.a.setProgressBarIndeterminated(true);
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.RECONECTAR);
        } else if (ProblemaConexaoAcao.CANCELAR.equals((Object)problemaConexaoAcao)) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.CANCELAR);
            this.a(data);
        }
    }

    private void b(Object data) {
        List listaTOs;
        ErroXmlResposta erroXmlResposta = null;
        if (data instanceof Object[]) {
            Object[] dataArray = (Object[])data;
            erroXmlResposta = (ErroXmlResposta)dataArray[0];
            listaTOs = (List)dataArray[1];
        } else {
            erroXmlResposta = (ErroXmlResposta)data;
            listaTOs = this.a;
        }
        String title = MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, erroXmlResposta.getLocalRecepcao());
        ErroXmlResposta.ErroXmlRespostaAcao acao = ErroXmlRespostaGUI.showError((String)erroXmlResposta.toHTML(), (ServicoSefazEnum)erroXmlResposta.getServicoPrincipal(), (Dialog)this.a, (String)title, (String)title);
        if (erroXmlResposta.getServicoPrincipal() == ServicoSefazEnum.StatusServico && acao == ErroXmlResposta.ErroXmlRespostaAcao.FECHAR) {
            this.a((Object)listaTOs);
        }
        AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.ERRO_XML_RETORNO_ACAO, (Object)acao);
    }

    private void c(Object data) {
        if (data instanceof Object[]) {
            Object[] dataArray = (Object[])data;
            this.a.showErrors((DSGEBaseException)dataArray[0]);
            this.a(dataArray[1]);
        } else {
            this.a.showErrors((DSGEBaseException)data);
            this.a((Object)this.a);
        }
    }

    private void d(Object data) {
        if (data instanceof Object[]) {
            Object[] dataArray = (Object[])data;
            this.a.showMessage((String)dataArray[0]);
            this.a(dataArray[1]);
        } else {
            this.a.showMessage(data.toString());
            this.a((Object)this.a);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        this.a.firePropertyChange("NOTA_FISCAL_CHANGED", (Object)null, (Object)null);
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    static /* synthetic */ List a(EnviarEventoController x0) {
        return x0.a();
    }

    static /* synthetic */ String a(EnviarEventoController x0) {
        return x0.a();
    }

    static /* synthetic */ void a(EnviarEventoController x0, String x1) {
        x0.a(x1);
    }
}

