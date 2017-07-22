/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO$DpecStatus
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.controller.InformacaoConsultaDpecController
 *  br.gov.sp.fazenda.dsen.controller.InformacaoConsultaDpecController$1
 *  br.gov.sp.fazenda.dsen.controller.InformacaoConsultaDpecController$2
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.DetalharDpecGUI
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.InformacaoConsultaDpecController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.DetalharDpecGUI;
import br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI;
import br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
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
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class InformacaoConsultaDpecController
extends DSGEBaseController
implements Observer,
WindowListener {
    CertificadoTO a;
    TipoConsultaDpecEnum a;
    String a;
    DpecTO a;
    InformacaoConsultaDpecGUI a;
    ImageIcon a;
    ImageIcon b = new ImageIcon(InformacaoConsultaDpecGUI.class.getResource("resources/error.gif"));
    ImageIcon c = new ImageIcon(InformacaoConsultaDpecGUI.class.getResource("resources/check.gif"));
    int a = 0;

    public InformacaoConsultaDpecController(TipoConsultaDpecEnum tipoConsulta, String idDepc, CertificadoTO certificadoTO) {
        this.a = certificadoTO;
        this.a = idDepc;
        this.a = tipoConsulta;
    }

    public void consultar() {
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.CONSULTA_DPEC, GrupoNotificacaoEnum.CONSULTA_DPEC_ERRO, GrupoNotificacaoEnum.ERRO_RESPOSTA_DPEC_CONSULTA, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.EXCEPTION, GrupoNotificacaoEnum.DPEC_SALVAR});
         s = new /* Unavailable Anonymous Inner Class!! */;
        s.execute();
    }

    public InformacaoConsultaDpecGUI getGUI() {
        this.a = new InformacaoConsultaDpecGUI((Frame)DSENDesktop.getInstance());
        this.a.addWindowListener((WindowListener)this);
        this.a.addActionListener((EventListener)this);
        return this.a;
    }

    public void actionPerformed(ActionEvent e) {
        if ("fechar".equals(e.getActionCommand())) {
            this.a();
        } else if ("salvar".equals(e.getActionCommand())) {
            this.b();
        } else if ("visualizar".equals(e.getActionCommand())) {
            this.c();
        }
    }

    private void a() {
        this.a.setVisible(false);
        this.a.dispose();
    }

    private void b() {
        String path = FileChooserHelper.chooseFile((Component)this.a, (String)this.a.getNomeArquivo(), (FileNameExtensionFilter)new FileNameExtensionFilter("Arquivos de DPEC(*.xml)", "xml"));
        if (!StringHelper.isBlankOrNull((Object)path)) {
            NotaFiscalFacade facade = new NotaFiscalFacade();
            this.a.setPathArquivo(path);
            try {
                facade.gravarDpec(this.a);
            }
            catch (DSENBusinessException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        }
    }

    private void c() {
        this.a();
        try {
            WindowManager.getInstance().showPanel((DSGEPanel)new DetalharDpecGUI(this.a, this.a.isBtnSalvarVisible()), false);
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    public void update(Object data, EnumItf source) {
        this.a.setProgressBarIndeterminated(false);
        switch (2.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                this.a = (DpecTO)data;
                this.a(data);
                if (!DpecTO.DpecStatus.AUTORIZADO.equals((Object)this.a.getDpecStatus())) break;
                this.a.enableComponents("VISUALIZAR_DPEC_CONSULTADO");
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
                this.a.showMessage(data.toString());
                break;
            }
            case 5: {
                this.b(data);
                break;
            }
            case 6: {
                this.d(data);
            }
        }
    }

    private void a(Object dpecObject) {
        if (dpecObject instanceof DpecTO) {
            ((DpecTO)dpecObject).setNumeroRegistro(this.a);
            this.a.addDpecTO(this.a((DpecTO)dpecObject));
        } else if (dpecObject instanceof List) {
            for (DpecTO to : (List)dpecObject) {
                to.setNumeroRegistro(this.a);
                this.a.addDpecTO(this.a(to));
            }
        }
    }

    private void d() {
        this.a.setProgressBarIndeterminated(false);
        this.a.setPercentCompleted(100);
        this.a.setDefaultCloseOperation(2);
        this.a.setBtnFecharEnabled(true);
        this.a.setMessage(this.a());
        this.a.fitTableColumns();
    }

    private String a() {
        int ok = 0;
        int erro = 0;
        int alerta = 0;
        if (DSENMessageConstants.DPEC_CONSULTA_CANCELADA.equals(this.a.getMotivo())) {
            ++alerta;
        } else if (DpecTO.DpecStatus.AUTORIZADO.equals((Object)this.a.getDpecStatus())) {
            ++ok;
        } else {
            ++erro;
        }
        return MessageFormat.format(DSENMessageConstants.MSG_FIM_CONSULTA_DPEC, "" + ok, "" + alerta, "" + erro);
    }

    private DpecTO a(DpecTO to) {
        if (DSENMessageConstants.DPEC_CONSULTA_CANCELADA.equals(this.a.getMotivo())) {
            to.setIcon((Icon)this.a);
        } else if (DpecTO.DpecStatus.AUTORIZADO.equals((Object)to.getDpecStatus())) {
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
        this.a((Object)((DpecTO)dataArray[1]));
        String title = MessageFormat.format(DSENMessageConstants.MSG_WS_RETORNO_INVALIDO, DSENMessageConstants.MSG_WS_DPEC);
        ErroXmlResposta erroXmlResposta = (ErroXmlResposta)dataArray[0];
        ErroXmlRespostaGUI.showError((String)erroXmlResposta.toHTML(), (ServicoSefazEnum)servico, (Dialog)this.a, (String)title, (String)title);
    }

    static /* synthetic */ void a(InformacaoConsultaDpecController x0) {
        x0.d();
    }
}

