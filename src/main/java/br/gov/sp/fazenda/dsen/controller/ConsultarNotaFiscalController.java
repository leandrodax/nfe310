/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta$ErroXmlRespostaAcao
 *  br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController$1
 *  br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController$2
 *  br.gov.sp.fazenda.dsen.view.ConsultarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
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
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController;
import br.gov.sp.fazenda.dsen.view.ConsultarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
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
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ConsultarNotaFiscalController
extends DSGEBaseController
implements Observer,
WindowListener,
PropertyChangeListener {
    CertificadoTO a;
    List<NotaFiscalTO> a;
    HashMap<String, NotaFiscalTO> a;
    ConsultarNotaFiscalGUI a;
    boolean a;
    boolean b;
    ImageIcon a = new ImageIcon(ConsultarNotaFiscalGUI.class.getResource("resources/warning.gif"));
    ImageIcon b = new ImageIcon(ConsultarNotaFiscalGUI.class.getResource("resources/error.gif"));
    ImageIcon c = new ImageIcon(ConsultarNotaFiscalGUI.class.getResource("resources/check.gif"));

    public ConsultarNotaFiscalController(CertificadoTO cTO, List<NotaFiscalTO> lista, boolean nfeNaoCadastrada) {
        this.a = cTO;
        this.a = lista;
        this.a = nfeNaoCadastrada;
        this.a(this.a);
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.NOTA_FISCAL_CONSULTADA, GrupoNotificacaoEnum.CONSULTA_NOTA_FISCAL_ERRO_SEFAZ, GrupoNotificacaoEnum.CONSULTA_NOTA_FISCAL_ERRO_SCAN, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SEFAZ, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SCAN, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_NOTA_FISCAL, GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_CONSULTA_NOTA_FISCAL, GrupoNotificacaoEnum.UF_NAO_HABILITADA, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.EXCEPTION});
    }

    private void a(List<NotaFiscalTO> lista) {
        for (NotaFiscalTO nfe : lista) {
            nfe.clearErrors();
            nfe.clearMessages();
            nfe.setAtualizadaPelaConsulta(false);
            nfe.setException(null);
            nfe.setErroXmlResposta(null);
        }
    }

    private int a() {
        return this.a.size() * 100 / this.a.size();
    }

    private List<NotaFiscalTO> a() {
        ArrayList<NotaFiscalTO> nfes = new ArrayList<NotaFiscalTO>();
        for (NotaFiscalTO n : this.a) {
            String key = n.getAno() + "-" + n.getSerie() + "-" + n.getNumero();
            if (this.a.containsKey(key)) continue;
            nfes.add(n);
        }
        return nfes;
    }

    private void a() {
        this.a.setProgressBarIndeterminated(true);
        this.b = false;
         s = new /* Unavailable Anonymous Inner Class!! */;
        s.execute();
    }

    public ConsultarNotaFiscalGUI showNewGUI(Dialog dialog) {
        this.a = new ConsultarNotaFiscalGUI(dialog);
        this.a.addPropertyChangeListener((PropertyChangeListener)this);
        this.a.addWindowListener((WindowListener)this);
        this.a.addActionListener((EventListener)this);
        this.a();
        return this.a;
    }

    public ConsultarNotaFiscalGUI showNewGUI() {
        this.a = new ConsultarNotaFiscalGUI((Frame)DSENDesktop.getInstance());
        this.a.addPropertyChangeListener((PropertyChangeListener)this);
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

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
    }

    private void b() {
        List cancNaoEnv = this.a();
        for (NotaFiscalTO n : cancNaoEnv) {
            this.a.addNfeTO(this.a(n));
        }
    }

    public void update(Object data, EnumItf source) {
        if (this.a.isProgressBarIndeterminated()) {
            this.a.setProgressBarIndeterminated(false);
        }
        switch (2.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                NotaFiscalTO nfeFiscalTO = (NotaFiscalTO)data;
                this.a(nfeFiscalTO);
                if (nfeFiscalTO.isAtualizadaPelaConsulta()) {
                    this.b = true;
                }
                this.a.firePropertyChange("NOTA_FISCAL_CONSULTADA", (Object)null, (Object)nfeFiscalTO);
                break;
            }
            case 2: 
            case 3: {
                this.a(data);
                break;
            }
            case 4: 
            case 5: {
                this.b(data);
                break;
            }
            case 6: 
            case 7: {
                this.c(data);
                break;
            }
            case 8: 
            case 9: {
                this.c(data);
                break;
            }
            case 10: {
                this.e(data);
                break;
            }
            case 11: {
                this.e(data);
                break;
            }
            case 12: {
                this.d(data);
            }
        }
    }

    private void a(Object data) {
        Object[] dataArray = (Object[])data;
        this.a((String)dataArray[0], DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_MENSAGEM, dataArray[1]);
    }

    private void b(Object data) {
        this.a((String)data, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_MENSAGEM, (Object)this.a);
    }

    private void a(String detalhe, String titulo, String mensagem, Object data) {
        ProblemaConexaoAcao problemaConexaoAcao = ProblemaConexaoGUI.showGUI((JDialog)this.a, (int)DSENConstants.INTERV_TENT_CONEXAO, (String)detalhe, (String)titulo, (String)mensagem);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.RECONECTAR);
            this.a.setProgressBarIndeterminated(true);
        } else if (problemaConexaoAcao == ProblemaConexaoAcao.CANCELAR) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.CANCELAR);
            this.f(data);
        }
    }

    private void c(Object data) {
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
            this.f((Object)listaTOs);
        }
        AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.ERRO_XML_RETORNO_ACAO, (Object)acao);
    }

    private void d(Object data) {
        if (data instanceof Object[]) {
            Object[] dataArray = (Object[])data;
            this.a.showErrors((DSGEBaseException)dataArray[0]);
            this.f(dataArray[1]);
        } else {
            this.a.showErrors((DSGEBaseException)data);
            this.f((Object)this.a);
        }
    }

    private void e(Object data) {
        if (data instanceof Object[]) {
            Object[] dataArray = (Object[])data;
            this.a.showMessage((String)dataArray[0]);
            this.f(dataArray[1]);
        } else {
            this.a.showMessage(data.toString());
            this.f((Object)this.a);
        }
    }

    private void a(NotaFiscalTO nfeFiscalTO) {
        if (!this.a.containsKey(nfeFiscalTO.getAno() + "-" + nfeFiscalTO.getSerie() + "-" + nfeFiscalTO.getNumero())) {
            this.a.put(nfeFiscalTO.getAno() + "-" + nfeFiscalTO.getSerie() + "-" + nfeFiscalTO.getNumero(), nfeFiscalTO);
            this.a.addNfeTO(this.a(nfeFiscalTO));
            this.a.setPercentCompleted(this.a());
        }
    }

    private void f(Object data) {
        if (data instanceof NotaFiscalTO) {
            this.a((NotaFiscalTO)data);
        } else if (data instanceof List) {
            for (NotaFiscalTO nfeFiscalTO : (List)data) {
                this.a(nfeFiscalTO);
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
        Iterator it = this.a.values().iterator();
        int atualizadas = 0;
        while (it.hasNext()) {
            NotaFiscalTO nTO = (NotaFiscalTO)it.next();
            if (nTO.sucessoOperacao() == null) {
                ++naoEnviada;
            } else if (nTO.sucessoOperacao().booleanValue()) {
                ++ok;
            } else {
                ++erro;
            }
            if (!nTO.isAtualizadaPelaConsulta()) continue;
            ++atualizadas;
        }
        return MessageFormat.format(DSENMessageConstants.MSG_FIM_CONSULTA_NFE, "" + (ok + erro), "" + atualizadas, "" + erro);
    }

    private NotaFiscalTO a(NotaFiscalTO nTO) {
        if (nTO.sucessoOperacao() == null) {
            nTO.setIcon((Icon)this.a);
        } else if (nTO.sucessoOperacao().booleanValue()) {
            nTO.setIcon((Icon)this.c);
        } else {
            nTO.setIcon((Icon)this.b);
        }
        return nTO;
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        if (this.b) {
            this.a.firePropertyChange("NOTA_FISCAL_CHANGED", (Object)null, (Object)null);
        }
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

    static /* synthetic */ List a(ConsultarNotaFiscalController x0) {
        return x0.a();
    }

    static /* synthetic */ String a(ConsultarNotaFiscalController x0) {
        return x0.a();
    }

    static /* synthetic */ void a(ConsultarNotaFiscalController x0, String x1) {
        x0.a(x1);
    }
}

