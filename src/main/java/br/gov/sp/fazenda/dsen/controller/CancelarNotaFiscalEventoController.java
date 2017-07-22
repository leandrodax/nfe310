/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta$ErroXmlRespostaAcao
 *  br.gov.sp.fazenda.dsen.controller.CancelarNotaFiscalEventoController
 *  br.gov.sp.fazenda.dsen.controller.CancelarNotaFiscalEventoController$1
 *  br.gov.sp.fazenda.dsen.controller.CancelarNotaFiscalEventoController$2
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.CancelarNotaFiscalEventoController;
import br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI;
import java.awt.Dialog;
import java.awt.Frame;
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
public class CancelarNotaFiscalEventoController
extends DSGEBaseController
implements Observer,
WindowListener {
    CertificadoTO a;
    String a;
    List<NotaFiscalTO> a;
    Map<String, NotaFiscalTO> a;
    CancelarNotaFiscalGUI a;
    boolean a;
    ImageIcon a = new ImageIcon(CancelarNotaFiscalGUI.class.getResource("resources/warning.gif"));
    ImageIcon b = new ImageIcon(CancelarNotaFiscalGUI.class.getResource("resources/error.gif"));
    ImageIcon c = new ImageIcon(CancelarNotaFiscalGUI.class.getResource("resources/check.gif"));

    public CancelarNotaFiscalEventoController(CertificadoTO cTO, String justificativa, List<NotaFiscalTO> listaN) {
        this.a = cTO;
        this.a = justificativa;
        this.a = listaN;
        this.a(this.a);
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.CANCELAMENTO, GrupoNotificacaoEnum.CANCELAMENTO_ERRO_SEFAZ, GrupoNotificacaoEnum.CANCELAMENTO_ERRO_SCAN, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CANCELAMENTO, GrupoNotificacaoEnum.ERRO_RESPOSTA_SCAN_CANCELAMENTO, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SEFAZ, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SCAN, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.EXCEPTION, GrupoNotificacaoEnum.UF_NAO_HABILITADA});
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

    public CancelarNotaFiscalEventoController(CertificadoTO cTO, String justificativa, String chaveAcesso, String nProtocolo) {
        this.a = cTO;
        this.a = justificativa.replaceAll("[\\r\\n]", "");
        NotaFiscalTO nfe = null;
        try {
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            nfe = ChaveAcessoUtil.gerarNotaFiscalTO((ChaveAcessoTO)ChaveAcessoUtil.obterChaveAcessoTO((String)chaveAcesso), (EmitenteTO)emitenteTO);
        }
        catch (DSENCommonException emitenteTO) {
            // empty catch block
        }
        this.a = new ArrayList();
        if (nfe != null) {
            this.a.add(nfe);
            nfe.setNumeroProtocolo(nProtocolo);
        }
        this.a = true;
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.CANCELAMENTO, GrupoNotificacaoEnum.CANCELAMENTO_ERRO_SEFAZ, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CANCELAMENTO, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SEFAZ, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.EXCEPTION, GrupoNotificacaoEnum.UF_NAO_HABILITADA});
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
         s = new /* Unavailable Anonymous Inner Class!! */;
        s.execute();
    }

    public CancelarNotaFiscalGUI showNewGUI() {
        this.a = new CancelarNotaFiscalGUI((Frame)DSENDesktop.getInstance());
        this.a.addWindowListener((WindowListener)this);
        this.a.addActionListener((EventListener)this);
        this.a();
        return this.a;
    }

    public CancelarNotaFiscalGUI showNewGUI(Dialog dialog) {
        this.a = new CancelarNotaFiscalGUI(dialog);
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
        List nfesNaoEnv = this.a();
        for (NotaFiscalTO nfe : nfesNaoEnv) {
            this.a.addNfeTO(this.a(nfe));
        }
    }

    public void update(Object data, EnumItf source) {
        if (this.a.isProgressBarIndeterminated()) {
            this.a.setProgressBarIndeterminated(false);
        }
        switch (2.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                NotaFiscalTO nfeTO = (NotaFiscalTO)data;
                this.a(nfeTO);
                if (!nfeTO.sucessoOperacao().booleanValue()) break;
                this.a.firePropertyChange("NOTA_CANCELADA", (Object)null, (Object)nfeTO);
                break;
            }
            case 2: 
            case 3: {
                this.b(data);
                break;
            }
            case 4: 
            case 5: {
                this.c(data);
                break;
            }
            case 6: 
            case 7: {
                this.d(data);
                break;
            }
            case 8: 
            case 9: {
                this.d(data);
                break;
            }
            case 10: {
                this.f(data);
                break;
            }
            case 11: {
                this.f(data);
                break;
            }
            case 12: {
                this.e(data);
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
        for (NotaFiscalTO cTO : this.a.values()) {
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
        return MessageFormat.format(DSENMessageConstants.MSG_FIM_CANCELAMENTO_NFE, "" + (ok + erro), "" + ok, "" + erro);
    }

    private NotaFiscalTO a(NotaFiscalTO cTO) {
        if (cTO.sucessoOperacao() == null) {
            cTO.setIcon((Icon)this.a);
        } else if (cTO.sucessoOperacao().booleanValue()) {
            cTO.setIcon((Icon)this.c);
        } else {
            cTO.setIcon((Icon)this.b);
        }
        return cTO;
    }

    private void a(Object cancelamentoObject) {
        if (cancelamentoObject instanceof NotaFiscalTO) {
            this.a((NotaFiscalTO)cancelamentoObject);
        } else if (cancelamentoObject instanceof List) {
            for (NotaFiscalTO nfeTO : (List)cancelamentoObject) {
                this.a(nfeTO);
            }
        }
    }

    private void a(NotaFiscalTO cTO) {
        if (!this.a.containsKey(cTO.getAno() + "-" + cTO.getSerie() + "-" + cTO.getNumero())) {
            this.a.put(cTO.getAno() + "-" + cTO.getSerie() + "-" + cTO.getNumero(), cTO);
            this.a.addNfeTO(this.a(cTO));
            this.a.setPercentCompleted(this.a());
        }
    }

    private void b(Object data) {
        Object[] dataArray = (Object[])data;
        this.a((String)dataArray[0], DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_MENSAGEM, dataArray[1]);
    }

    private void c(Object data) {
        this.a((String)data, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_MENSAGEM, (Object)this.a);
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

    private void d(Object data) {
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

    private void e(Object data) {
        if (data instanceof Object[]) {
            Object[] dataArray = (Object[])data;
            this.a.showErrors((DSGEBaseException)dataArray[0]);
            this.a(dataArray[1]);
        } else {
            this.a.showErrors((DSGEBaseException)data);
            this.a((Object)this.a);
        }
    }

    private void f(Object data) {
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

    static /* synthetic */ List a(CancelarNotaFiscalEventoController x0) {
        return x0.a();
    }

    static /* synthetic */ String a(CancelarNotaFiscalEventoController x0) {
        return x0.a();
    }

    static /* synthetic */ void a(CancelarNotaFiscalEventoController x0, String x1) {
        x0.a(x1);
    }
}

