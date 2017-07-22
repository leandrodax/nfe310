/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RepositorioCertificadoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ManterCertificadoController
 *  br.gov.sp.fazenda.dsen.controller.ManterCertificadoController$1
 *  br.gov.sp.fazenda.dsen.controller.ManterCertificadoController$2
 *  br.gov.sp.fazenda.dsen.controller.ManterCertificadoController$3
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ManterCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.ProgressoProcuraCertificadoA3GUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarDiretorioBibliotecaA3GUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.certif.RepositorioInfo
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RepositorioCertificadoEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.ManterCertificadoController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ManterCertificadoGUI;
import br.gov.sp.fazenda.dsen.view.ProgressoProcuraCertificadoA3GUI;
import br.gov.sp.fazenda.dsen.view.SelecionarDiretorioBibliotecaA3GUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.certif.RepositorioInfo;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EventListener;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingWorker;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ManterCertificadoController
extends DSGEBaseController
implements Observer,
PageableSortableTableActionListener<CertificadoInfoTO>,
PropertyChangeListener,
CellEditorListener {
    ManterCertificadoGUI a;
    SelecionarDiretorioBibliotecaA3GUI a;
    ProgressoProcuraCertificadoA3GUI a;
    SwingWorker<List<CertificadoInfoTO>, Object> a;
    PropriedadeTO a;
    static String a = "A1";
    static String b = "A3";
    int a;
    SistemaFacade a = new SistemaFacade();
    private static Log a = LogFactory.getLog(ManterCertificadoController.class);

    public ManterCertificadoController(ViewItf gui) {
        this.a = (ManterCertificadoGUI)gui;
        gui.addActionListener((EventListener)this);
        this.a();
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.CERTIFICADO_BUSCA_AUTOMATICA_ARQUIVO_LIDO, GrupoNotificacaoEnum.CERTIFICADO_SENHA_A3, GrupoNotificacaoEnum.CERTIFICADO_SENHA_ERRADA_A3});
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        try {
            this.a.getTblA1().removeAllTO();
            this.a.getTblA3().removeAllTO();
            EmitenteTO emitenteTO = this.a();
            RepositorioCertificadoEnum tipoRepositorio = this.a.obterTipoRepositorio(emitenteTO);
            if (tipoRepositorio != null) {
                switch (3.a[tipoRepositorio.ordinal()]) {
                    case 1: {
                        this.a.setUsarRepositorioWindows(false);
                        this.a(emitenteTO);
                        break;
                    }
                    case 2: {
                        this.a.setUsarRepositorioWindows(true);
                    }
                }
            } else {
                this.a.setUsarRepositorioWindows(false);
                this.a(emitenteTO);
            }
        }
        catch (DSGEBaseException e) {
            this.a.showErrors(e);
        }
        finally {
            this.g();
        }
    }

    private void a(EmitenteTO emitenteTO) throws DSENBusinessException {
        List tos = this.a.pesquisarCertificados(emitenteTO);
        if (tos != null) {
            ArrayList<CertificadoInfoTO> a1Tos = new ArrayList<CertificadoInfoTO>();
            ArrayList<CertificadoInfoTO> a3Tos = new ArrayList<CertificadoInfoTO>();
            for (CertificadoInfoTO to : tos) {
                if (a.equals(to.getTipoCertificado())) {
                    a1Tos.add(to);
                    continue;
                }
                if (!b.equals(to.getTipoCertificado())) continue;
                a3Tos.add(to);
            }
            this.a.getTblA1().addTO(a1Tos);
            this.a.getTblA3().addTO(a3Tos);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ACTION_ADICIONAR_A1")) {
            this.c();
        } else if (e.getActionCommand().equals("ACTION_REMOVER_A1")) {
            this.a(a);
        } else if (e.getActionCommand().equals("ACTION_PROCURAR_A3")) {
            this.a(null);
        } else if (e.getActionCommand().equals("ACTION_REMOVER_A3")) {
            this.a(b);
        } else if (e.getActionCommand().equals("ACTION_INFORMAR_BIBLIOTECA")) {
            this.b();
        } else if (e.getActionCommand().equals("ACTION_CERTIFICADO_SELECIONAR_CADASTRO_APLICATIVO")) {
            this.e();
        } else if (e.getActionCommand().equals("ACTION_CERTIFICADO_SELECIONAR_REPOSITORIO_WINDOWS")) {
            this.f();
        } else if (e.getActionCommand().equals("fechar")) {
            this.d();
        }
    }

    private void b() {
        String path = FileChooserHelper.chooseFile((Component)this.a, (boolean)false, (boolean)true, (FileNameExtensionFilter)new FileNameExtensionFilter("Bibliotecas (*.dll; *.so)", "dll", "so"));
        if (path != null) {
            this.a(path);
        }
    }

    private void c() {
        String path = FileChooserHelper.chooseFile((Component)this.a, (boolean)false, (boolean)true, (FileNameExtensionFilter)new FileNameExtensionFilter("Certificado (*.pfx; *.p12)", "pfx", "p12"));
        if (path != null) {
            if (path.length() > 255) {
                this.a.showMessage(DSENMessageConstants.TAMANHO_CAMINHO_NAO_PODE_ULTRAPASSAR_255);
                return;
            }
            try {
                JLabel label = new JLabel("Digite a senha:");
                JPasswordField jpf = new JPasswordField();
                if (JOptionPane.showConfirmDialog((Component)this.a, new Object[]{label, jpf}, "Senha:", 2) == 2) {
                    return;
                }
                String senha = new String(jpf.getPassword());
                CertificadoInfoTO certificadoTO = this.a.obterInformacoesCertificadoA1(path, senha);
                if (!(certificadoTO = this.a.incluirCertificado(certificadoTO)).hasErrors()) {
                    this.a.getTblA1().addTO((BaseTO)certificadoTO);
                }
                this.a.showMessage((BaseTO)certificadoTO);
            }
            catch (DSGEBaseException e) {
                if (e.getSourceException() instanceof DSGECertificadoException) {
                    this.a.showMessage(e.getSourceException().getMessage());
                }
                this.a.showErrors(e);
            }
        }
    }

    private void a(String tipo) {
        List certs = null;
        if (a.equals(tipo)) {
            certs = this.a.getTblA1().getSelectedTOs();
        } else if (b.equals(tipo)) {
            certs = this.a.getTblA3().getSelectedTOs();
        }
        if (certs != null && !certs.isEmpty()) {
            this.a(certs);
            if (this.a.showQuestion(DSENMessageConstants.MSG_CONFIRM_EXCLUSAO_CERTIFICADO) == 0) {
                try {
                    this.a.showMessage(this.a.excluirCertificados(certs));
                }
                catch (DSGEBaseException e) {
                    this.a.showErrors(e);
                }
            }
        }
        this.a();
    }

    private void a(List<CertificadoInfoTO> certs) {
        if (certs == null) {
            return;
        }
        for (CertificadoInfoTO cert : certs) {
            cert.clearErrors();
            cert.clearMessages();
        }
    }

    private List<CertificadoInfoTO> a(String diretorio) {
        this.a = new ProgressoProcuraCertificadoA3GUI((Frame)DSENDesktop.getInstance(), true);
        this.a.addPropertyChangeListener("PROCURAR_A3_CANCELADO", (PropertyChangeListener)this);
        this.a = new /* Unavailable Anonymous Inner Class!! */;
        this.a.execute();
        this.a.setVisible(true);
        List result = null;
        try {
            if (!this.a.isCancelled()) {
                result = (List)this.a.get();
            }
        }
        catch (Throwable e) {
            a.error((Object)e);
        }
        if (!this.a.isCancelled()) {
            if (result == null) {
                if (diretorio != null && new File(diretorio).isFile()) {
                    this.a.showMessage(DSENMessageConstants.MSG_NAO_E_POSSIVEL_LER_CERTIFICADO);
                } else {
                    this.a = new SelecionarDiretorioBibliotecaA3GUI((Frame)DSENDesktop.getInstance(), true);
                    WindowManager.getInstance().centralizarDialogo((JDialog)this.a);
                    this.a.addPropertyChangeListener("REPETIR_PROCURA_A3", (PropertyChangeListener)this);
                    this.a.addPropertyChangeListener("REPETIR_PROCURA_A3_CANCELADA", (PropertyChangeListener)this);
                    this.a.setVisible(true);
                }
            } else {
                this.a();
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.MSG_CERTIFICADOS_A3_ENCONTRADOS, result.size()));
            }
        }
        return result;
    }

    private void d() {
        WindowManager.getInstance().closePanel();
    }

    public void update(Object o, EnumItf source) {
        if (GrupoNotificacaoEnum.CERTIFICADO_BUSCA_AUTOMATICA_ARQUIVO_LIDO.equals((Object)source)) {
            if (this.a != null && o != null) {
                this.a.appendMessage(o.toString());
            }
        } else if (GrupoNotificacaoEnum.CERTIFICADO_SENHA_A3.equals((Object)source)) {
            this.a = 1;
            RepositorioInfo repInf = (RepositorioInfo)o;
            JLabel label = new JLabel("Digite a senha para acessar o certificado \"" + repInf.getNome() + "\":");
            JPasswordField jpf = new JPasswordField();
            String senha = this.a.isVisible() && JOptionPane.showConfirmDialog((Component)this.a, new Object[]{label, jpf}, "Senha:", 2) == 0 ? new String(jpf.getPassword()) : null;
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PARAMETRO_SENHA_A3, (Object)senha);
        } else if (GrupoNotificacaoEnum.CERTIFICADO_SENHA_ERRADA_A3.equals((Object)source)) {
            ++this.a;
            RepositorioInfo repInf = (RepositorioInfo)o;
            JLabel label = new JLabel("Digite a senha para acessar o certificado \"" + repInf.getNome() + "\":");
            JPasswordField jpf = new JPasswordField();
            String senha = this.a.isVisible() && JOptionPane.showConfirmDialog((Component)this.a, new Object[]{new JLabel("Senha Incorreta. Tentativa " + this.a + " de " + DSENConstants.MAX_TENTATIVAS_SENHA_A3), label, jpf}, "Senha Incorreta:", 2) == 0 ? new String(jpf.getPassword()) : null;
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PARAMETRO_SENHA_A3, (Object)senha);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("REPETIR_PROCURA_A3".equals(evt.getPropertyName())) {
            this.a.setVisible(false);
            this.a.dispose();
            this.a((String)evt.getNewValue());
        } else if ("REPETIR_PROCURA_A3_CANCELADA".equals(evt.getPropertyName())) {
            this.a.setVisible(false);
            this.a.dispose();
        }
        if ("PROCURAR_A3_CANCELADO".equals(evt.getPropertyName())) {
            try {
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PARAMETRO_BUSCA_A3_PAUSADO, (Object)new Boolean(true));
                if (this.a.isVisible() && this.a.showQuestion(DSENMessageConstants.QUESTION_CANCELAR_PROCURA_A3) == 0) {
                    this.a.cancel(true);
                }
            }
            catch (Throwable t) {
                a.error((Object)t);
            }
            finally {
                AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.PARAMETRO_BUSCA_A3_PAUSADO, (Object)new Boolean(false));
            }
        }
    }

    private void e() {
        try {
            this.a.usarRepositorioAplicativo(this.a());
        }
        catch (DSENBusinessException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
        this.a();
    }

    private void f() {
        if (this.a.getTblA1().getAllTO().size() == 0 && this.a.getTblA3().getAllTO().size() == 0 || (this.a.getTblA1().getAllTO().size() > 0 || this.a.getTblA3().getAllTO().size() > 0) && this.a.showQuestion(DSENMessageConstants.MSG_CONFIRM_UTILIZAR_REPOSITORIO_WINDOWS) == 0) {
            try {
                this.a.usarRepositorioWindows(this.a());
            }
            catch (DSENBusinessException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        }
        this.a();
    }

    private EmitenteTO a() {
        return (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
    }

    public void sortColumnChanged(JDSGEPageableTable<CertificadoInfoTO> source) {
        String fieldName = source.getSortColumnDbFieldName();
        boolean asc = source.isSortColumnASC();
        source.sortTOs((Comparator)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void pageChanged(JDSGEPageableTable<CertificadoInfoTO> source) {
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.g();
    }

    private void g() {
        if (this.a.getTblA1().isEnabled() && this.a.getTblA3().isEnabled()) {
            this.a.enableComponents("SELECT_GERENCIAR_CERTIFICADOS_INIT");
        }
        if (this.a.getTblA1().getSelectedTOs().size() == 0) {
            this.a.disableComponents("SELECT_GERENCIAR_CERTIFICADOS_A1_NONE_SELECTED_DISABLED");
        }
        if (this.a.getTblA3().getSelectedTOs().size() == 0) {
            this.a.disableComponents("SELECT_GERENCIAR_CERTIFICADOS_A3_NONE_SELECTED_DISABLED");
        }
    }

    static /* synthetic */ Log a() {
        return a;
    }
}

