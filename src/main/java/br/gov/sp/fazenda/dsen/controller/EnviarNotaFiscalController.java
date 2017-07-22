/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta$ErroXmlRespostaAcao
 *  br.gov.sp.fazenda.dsen.controller.EnviarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.EnviarNotaFiscalController$1
 *  br.gov.sp.fazenda.dsen.controller.EnviarNotaFiscalController$2
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.controller.EnviarNotaFiscalController;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.ErroXmlRespostaGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
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
public class EnviarNotaFiscalController
extends DSGEBaseController
implements Observer,
WindowListener {
    CertificadoTO a;
    List<NotaFiscalTO> a;
    Map<String, NotaFiscalTO> a;
    EnviarNotaFiscalGUI a;
    ImageIcon a = new ImageIcon(EnviarNotaFiscalGUI.class.getResource("resources/warning.gif"));
    ImageIcon b = new ImageIcon(EnviarNotaFiscalGUI.class.getResource("resources/error.gif"));
    ImageIcon c = new ImageIcon(EnviarNotaFiscalGUI.class.getResource("resources/check.gif"));

    public EnviarNotaFiscalController(CertificadoTO cTO, List<NotaFiscalTO> lista) {
        this.a = cTO;
        this.a = lista;
        this.a(this.a);
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.NOTA_FISCAL_ENVIADA, GrupoNotificacaoEnum.ERRO_CONEXAO_ENVIO_SEFAZ, GrupoNotificacaoEnum.CONSULTA_STATUS_SERVICO_NOK_SEFAZ, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_CONSULTA_STATUS, GrupoNotificacaoEnum.ERRO_RESPOSTA_SEFAZ_ENVIO, GrupoNotificacaoEnum.ERRO_FATAL, GrupoNotificacaoEnum.UF_NAO_HABILITADA, GrupoNotificacaoEnum.EXCEPTION});
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
         s = new /* Unavailable Anonymous Inner Class!! */;
        s.execute();
    }

    public EnviarNotaFiscalGUI showNewGUI() {
        this.a = new EnviarNotaFiscalGUI((Frame)DSENDesktop.getInstance());
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
        List cancNaoEnv = this.a();
        for (NotaFiscalTO n : cancNaoEnv) {
            this.a.addNotaFiscalTO(this.a(n));
        }
    }

    public void update(Object data, EnumItf source) {
        switch (2.a[((GrupoNotificacaoEnum)source).ordinal()]) {
            case 1: {
                NotaFiscalTO nfe = (NotaFiscalTO)data;
                this.a.put(nfe.getAno() + "-" + nfe.getSerie() + "-" + nfe.getNumero(), nfe);
                this.a.addNotaFiscalTO(this.a(nfe));
                int percentCompleted = this.a();
                if (percentCompleted != 100) {
                    this.a.setPercentCompleted(percentCompleted);
                }
                this.a.firePropertyChange("NOTA_TRANSMITIDA", (Object)null, (Object)null);
                break;
            }
            case 2: {
                this.c(data);
                break;
            }
            case 3: {
                this.d(data);
                break;
            }
            case 4: {
                this.a(ServicoSefazEnum.StatusServico, data);
                break;
            }
            case 5: {
                this.a(ServicoSefazEnum.Cancelamento, data);
                break;
            }
            case 6: {
                this.b(data);
                break;
            }
            case 7: {
                this.b(data);
                break;
            }
            case 8: {
                this.e(data);
            }
        }
    }

    private void a(Object nfeObject) {
        if (nfeObject instanceof NotaFiscalTO) {
            this.a((NotaFiscalTO)nfeObject);
        } else if (nfeObject instanceof List) {
            for (NotaFiscalTO cancelamentoTO : (List)nfeObject) {
                this.a(cancelamentoTO);
            }
        }
    }

    private void a(NotaFiscalTO NotaFiscalTO2) {
        this.a.put(NotaFiscalTO2.getAno() + "-" + NotaFiscalTO2.getSerie() + "-" + NotaFiscalTO2.getNumero(), NotaFiscalTO2);
        this.a.addNotaFiscalTO(this.a(NotaFiscalTO2));
        this.a.setPercentCompleted(this.a());
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
        for (NotaFiscalTO nTO : this.a.values()) {
            if (nTO.sucessoOperacao() == null) {
                ++naoEnviada;
                continue;
            }
            if (nTO.sucessoOperacao().booleanValue()) {
                ++ok;
                continue;
            }
            ++erro;
        }
        return MessageFormat.format(DSENMessageConstants.MSG_FIM_ENVIO_NFE, "" + (ok + erro), "" + ok, "" + erro);
    }

    private NotaFiscalTO a(NotaFiscalTO nTO) {
        if (nTO.sucessoOperacao() == null) {
            nTO.setIcon((Icon)this.a);
        } else if (nTO.sucessoOperacao().booleanValue()) {
            nTO.setIcon((Icon)this.c);
        } else if (SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA.equals((Object)nTO.getSituacao())) {
            nTO.setIcon((Icon)this.a);
        } else {
            nTO.setIcon((Icon)this.b);
        }
        return nTO;
    }

    private void b(Object data) {
        if (data == null) {
            return;
        }
        if (data instanceof Object[]) {
            Object[] dataArray = (Object[])data;
            if (dataArray != null && !StringHelper.isBlankOrNull((Object)dataArray[0])) {
                this.a.showMessage((String)dataArray[0]);
            }
            this.a(dataArray[1]);
        } else {
            this.a.showMessage(data.toString());
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

    private void c(Object data) {
        Object[] dataArray = (Object[])data;
        this.a((String)dataArray[0], DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_MENSAGEM, dataArray[1]);
    }

    private void d(Object data) {
        this.a((String)data, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_TITULO, DSENMessageConstants.PROBLEMA_CONEXAO_SEFAZ_INDISPONIVEL_MENSAGEM, (Object)this.a);
    }

    private void e(Object data) {
        Object[] dataArray = (Object[])data;
        this.a.showErrors((DSGEBaseException)dataArray[0]);
        this.a(dataArray[1]);
    }

    private void a(String detalhe, String titulo, String mensagem, Object data) {
        ProblemaConexaoAcao problemaConexaoAcao = ProblemaConexaoGUI.showGUI((JDialog)this.a, (int)DSENConstants.INTERV_TENT_CONEXAO, (String)detalhe, (String)titulo, (String)mensagem);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            this.a.setProgressBarIndeterminated(true);
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.RECONECTAR);
        } else if (problemaConexaoAcao == ProblemaConexaoAcao.CANCELAR) {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, (Object)ProblemaConexaoAcao.CANCELAR);
            this.a(data);
        }
    }

    private void a(ServicoSefazEnum servico, Object data) {
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
        ErroXmlResposta.ErroXmlRespostaAcao acao = ErroXmlRespostaGUI.showError((String)erroXmlResposta.toHTML(), (ServicoSefazEnum)servico, (Dialog)null, (String)null, (String)null);
        if (servico == ServicoSefazEnum.StatusServico) {
            if (acao == ErroXmlResposta.ErroXmlRespostaAcao.CONTINUAR) {
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.ERRO_XML_RETORNO_ACAO, (Object)ErroXmlResposta.ErroXmlRespostaAcao.CONTINUAR);
            } else if (acao == ErroXmlResposta.ErroXmlRespostaAcao.FECHAR) {
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.ERRO_XML_RETORNO_ACAO, (Object)ErroXmlResposta.ErroXmlRespostaAcao.FECHAR);
                this.a((Object)listaTOs);
            }
        }
    }

    static /* synthetic */ List a(EnviarNotaFiscalController x0) {
        return x0.a();
    }

    static /* synthetic */ String a(EnviarNotaFiscalController x0) {
        return x0.a();
    }

    static /* synthetic */ void a(EnviarNotaFiscalController x0, String x1) {
        x0.a(x1);
    }
}

