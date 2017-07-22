/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.controller.TransmitirDpecController
 *  br.gov.sp.fazenda.dsen.controller.TransmitirDpecController$1
 *  br.gov.sp.fazenda.dsen.controller.TransmitirDpecController$2
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI
 *  br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.TransmitirDpecController;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI;
import br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TransmitirDpecController
extends DSGEBaseController
implements Observer,
WindowListener {
    CertificadoTO a;
    List<DpecTO> a;
    TransmitirDpecGUI a;
    ImageIcon a;
    ImageIcon b = new ImageIcon(TransmitirDpecGUI.class.getResource("resources/error.gif"));
    ImageIcon c = new ImageIcon(TransmitirDpecGUI.class.getResource("resources/check.gif"));
    int a = 0;

    public TransmitirDpecController(CertificadoTO cTO, List<DpecTO> lista) {
        this.a = cTO;
        this.a = lista;
        this.a(this.a);
    }

    private void a(List<DpecTO> lista) {
        for (DpecTO dpec : lista) {
            dpec.clearErrors();
            dpec.clearMessages();
        }
    }

    public void transmitir() {
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.ENVIO_DPEC, GrupoNotificacaoEnum.ENVIO_DPEC_ERRO, GrupoNotificacaoEnum.ERRO_RESPOSTA_DPEC_ENVIO, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.EXCEPTION});
         s = new /* Unavailable Anonymous Inner Class!! */;
        s.execute();
    }

    public TransmitirDpecGUI getGUI() {
        this.a = new TransmitirDpecGUI((Frame)DSENDesktop.getInstance());
        this.a.addWindowListener((WindowListener)this);
        this.a.addActionListener((EventListener)this);
        return this.a;
    }

    public void actionPerformed(ActionEvent e) {
        if ("cancelar".equals(e.getActionCommand())) {
            this.a.dispose();
        }
    }

    public void update(Object data, EnumItf source) {
        this.a.setProgressBarIndeterminated(false);
        switch (2.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                DpecTO dpecTO = (DpecTO)data;
                this.a.addDpecTO(this.a(dpecTO));
                int percentCompleted = ++this.a * 100 / this.a.size();
                if (percentCompleted >= 100) break;
                this.a.setPercentCompleted(percentCompleted);
                break;
            }
            case 2: {
                this.c(data);
                break;
            }
            case 3: {
                this.a(ServicoSefazEnum.EnvioDpec, data);
                break;
            }
            case 4: {
                this.b(data);
                break;
            }
            case 5: {
                this.d(data);
            }
        }
    }

    private void a(Object dpecObject) {
        if (dpecObject instanceof DpecTO) {
            this.a.addDpecTO(this.a((DpecTO)dpecObject));
        } else if (dpecObject instanceof List) {
            for (DpecTO to : (List)dpecObject) {
                this.a.addDpecTO(this.a(to));
            }
        }
    }

    private void a() {
        this.a.setProgressBarIndeterminated(false);
        this.a.setPercentCompleted(100);
        this.a.setDefaultCloseOperation(2);
        this.a.setBtnFecharEnabled(true);
        this.a.setMessage(this.a());
        this.a.fitTableColumns();
        Notificador.getInstance().remove((Observer)this);
    }

    private String a() {
        int ok = 0;
        int erro = 0;
        int alerta = 0;
        for (DpecTO to : this.a) {
            if (!StringHelper.isBlankOrNull((Object)to.getErrorsString())) {
                ++erro;
                continue;
            }
            if (StringHelper.isBlankOrNull((Object)to.getMessagesString())) continue;
            if (to.getMessagesString().equals(DSENMessageConstants.DPEC_NAO_FOI_ENVIADO)) {
                ++alerta;
                continue;
            }
            ++ok;
        }
        return MessageFormat.format(DSENMessageConstants.MSG_FIM_ENVIO_DPEC, "" + ok, "" + alerta, "" + erro);
    }

    private DpecTO a(DpecTO to) {
        String status = to.getCodigoStatus();
        if (StringHelper.isBlankOrNull((Object)status)) {
            to.setIcon((Icon)this.a);
        } else if (DSENConstants.DPEC_RECEBIDO.equals(status)) {
            to.setIcon((Icon)this.c);
        } else {
            to.setIcon((Icon)this.b);
        }
        return to;
    }

    private void b(Object data) {
        Object[] dataArray = (Object[])data;
        this.a.showMessage((String)dataArray[0]);
        this.a(dataArray[1]);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        this.a(this.a);
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

    private void c(Object data) {
        Object[] dataArray = (Object[])data;
        this.a((String)dataArray[0], DSENMessageConstants.PROBLEMA_CONEXAO_RECEITA_FEDERAL_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_RECEITA_FEDERAL_MENSAGEM, dataArray[1]);
    }

    private void d(Object data) {
        Object[] dataArray = (Object[])data;
        this.a.showErrors((DSGEBaseException)dataArray[0]);
        this.a(dataArray[1]);
    }

    private void a(String detalhe, String titulo, String mensagem, Object data) {
        ParametroTO tempoTentativas = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_INTERV_TENT_TRANSM, ParametroTO.class);
        int tempo = Integer.parseInt(tempoTentativas.getValor());
        ProblemaConexaoAcao problemaConexaoAcao = ProblemaConexaoGUI.showGUI((JDialog)this.a, (int)tempo, (String)detalhe, (String)titulo, (String)mensagem);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.RECONECTAR);
        } else if (problemaConexaoAcao == ProblemaConexaoAcao.CANCELAR) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.CANCELAR);
            this.a(data);
        }
    }

    private void a(ServicoSefazEnum servico, Object data) {
        Object[] dataArray = (Object[])data;
        String title = MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, DSENMessageConstants.MSG_WS_DPEC);
        ErroXmlResposta erroXmlResposta = (ErroXmlResposta)dataArray[0];
        ErroXmlRespostaGUI.showError((String)erroXmlResposta.toHTML(), (ServicoSefazEnum)servico, (Dialog)this.a, (String)title, (String)title);
    }

    static /* synthetic */ void a(TransmitirDpecController x0) {
        x0.a();
    }
}

