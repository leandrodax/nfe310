/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.controller.InformacaoConsultaCadastroController
 *  br.gov.sp.fazenda.dsen.controller.InformacaoConsultaCadastroController$1
 *  br.gov.sp.fazenda.dsen.controller.InformacaoConsultaCadastroController$2
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaCadastroGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.InformacaoConsultaCadastroController;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI;
import br.gov.sp.fazenda.dsen.view.InformacaoConsultaCadastroGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;
import javax.swing.JDialog;

public class InformacaoConsultaCadastroController
extends DSGEBaseController
implements Observer,
WindowListener {
    CertificadoTO a;
    ConsultaCadastroTO a;
    InformacaoConsultaCadastroGUI a;

    public InformacaoConsultaCadastroController(ConsultaCadastroTO consultaCadastroTO, CertificadoTO certificadoTO) {
        this.a = certificadoTO;
        this.a = consultaCadastroTO;
    }

    public void consultar() {
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.CONSULTA_CADASTRO_ERRO, GrupoNotificacaoEnum.ERRO_RESPOSTA_CONSULTA_CADASTRO, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.EXCEPTION});
         s = new /* Unavailable Anonymous Inner Class!! */;
        s.execute();
    }

    public InformacaoConsultaCadastroGUI getGUI() {
        this.a = new InformacaoConsultaCadastroGUI((Frame)DSENDesktop.getInstance());
        this.a.addWindowListener((WindowListener)this);
        this.a.addActionListener((EventListener)this);
        return this.a;
    }

    public void actionPerformed(ActionEvent e) {
        if ("fechar".equals(e.getActionCommand())) {
            this.a();
        }
    }

    private void a() {
        this.a.setVisible(false);
        this.a.dispose();
    }

    public void update(Object data, EnumItf source) {
        this.a.setProgressBarIndeterminate(false);
        switch (2.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                this.b(data);
                break;
            }
            case 2: {
                this.a(ServicoSefazEnum.ConsultaCadastro, data);
                break;
            }
            case 3: {
                this.a(data);
                break;
            }
            case 4: {
                this.c(data);
            }
        }
    }

    private void a(List<ConsultaCadastroTO> listaResultadoConsulta) {
        this.a();
        try {
            if (listaResultadoConsulta != null && !listaResultadoConsulta.isEmpty()) {
                ConsultaCadastroGUI consGUI = new ConsultaCadastroGUI((Frame)DSENDesktop.getInstance(), true, listaResultadoConsulta);
                consGUI.setVisible(true);
            }
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    private void a(Object data) {
        this.a.showMessage((String)data);
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        Notificador.getInstance().remove((Observer)this);
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

    private void b(Object data) {
        this.a((String)data, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_MENSAGEM);
    }

    private void c(Object data) {
        this.a.showErrors((DSGEBaseException)data);
    }

    private void a(String detalhe, String titulo, String mensagem) {
        ParametroTO tempoTentativas = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_INTERV_TENT_TRANSM, ParametroTO.class);
        int tempo = Integer.parseInt(tempoTentativas.getValor());
        ProblemaConexaoAcao problemaConexaoAcao = ProblemaConexaoGUI.showGUI((JDialog)this.a, (int)tempo, (String)detalhe, (String)titulo, (String)mensagem);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.RECONECTAR);
        } else if (problemaConexaoAcao == ProblemaConexaoAcao.CANCELAR) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.CANCELAR);
        }
    }

    private void a(ServicoSefazEnum servico, Object data) {
        String title = MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, DSENMessageConstants.MSG_WS_SEFAZ);
        ErroXmlResposta erroXmlResposta = (ErroXmlResposta)data;
        ErroXmlRespostaGUI.showError((String)erroXmlResposta.toHTML(), (ServicoSefazEnum)servico, (Dialog)this.a, (String)title, (String)title);
    }

    static /* synthetic */ void a(InformacaoConsultaCadastroController x0, List x1) {
        x0.a(x1);
    }
}

