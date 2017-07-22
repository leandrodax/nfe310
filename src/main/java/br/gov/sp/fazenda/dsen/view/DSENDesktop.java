/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.controller.DSENSystemController
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop$1
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop$2
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop$3
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop$4
 *  br.gov.sp.fazenda.dsen.view.DSENMenuBuilder
 *  br.gov.sp.fazenda.dsen.view.DSENPnlEmitente
 *  br.gov.sp.fazenda.dsen.view.DSENStatusBAR
 *  br.gov.sp.fazenda.dsen.view.StartPanel
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Subject
 *  br.gov.sp.fazenda.dsge.controller.DSGESystemController
 *  br.gov.sp.fazenda.dsge.view.DSGEDesktop
 *  br.gov.sp.fazenda.dsge.view.DSGETrayIcon
 *  br.gov.sp.fazenda.dsge.view.HTMLMessageGUI
 *  br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.controller.DSENSystemController;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.DSENMenuBuilder;
import br.gov.sp.fazenda.dsen.view.DSENPnlEmitente;
import br.gov.sp.fazenda.dsen.view.DSENStatusBAR;
import br.gov.sp.fazenda.dsen.view.StartPanel;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Subject;
import br.gov.sp.fazenda.dsge.controller.DSGESystemController;
import br.gov.sp.fazenda.dsge.view.DSGEDesktop;
import br.gov.sp.fazenda.dsge.view.DSGETrayIcon;
import br.gov.sp.fazenda.dsge.view.HTMLMessageGUI;
import br.gov.sp.fazenda.dsge.view.message.DSGEExceptionGUI;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class DSENDesktop
extends DSGEDesktop {
    private static Log a = LogFactory.getLog(DSENDesktop.class);
    public static long INICIO_APLICATIVO;
    private static final long a = -8876914273317507478L;
    private static DSENDesktop a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private DSENPnlEmitente a;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private static Image a;
    private boolean a;
    private JSplitPane a;
    private DSGETrayIcon a;
    private final DSENStatusBAR a = new DSENStatusBAR();

    public DSENDesktop() {
        this.addWindowListener((WindowListener)this);
        this.setDefaultCloseOperation(0);
        JPanel mainPanel = new JPanel(new BorderLayout());
        this.a = new JSplitPane(0, this.a(), new JScrollPane((Component)new StartPanel()));
        this.a.setDividerSize(2);
        this.a.setEnabled(false);
        mainPanel.add((Component)this.a, "Center");
        this.a.setBorder((Border)new EtchedBorder());
        mainPanel.add((Component)this.a, "South");
        this.setContentPane((Container)mainPanel);
        this.setTitle(DSENProperties.getInstance().getAplicativoWindowTitle());
        this.setIconImage(this.getIcon());
        this.createMnuPrincipal();
        WindowManager.getInstance().setFrame(this);
        this.setCursor(new Cursor(3));
        this.mnuPrincipal.setVisible(false);
        this.a.setVisible(false);
         t = new /* Unavailable Anonymous Inner Class!! */;
        t.start();
        this.a();
        WindowManager.getInstance().setMenuEmitenteLogado(false);
    }

    public Image getIcon() {
        if (a == null) {
            a = new ImageIcon(DSENDesktop.class.getResource("resources/nfe.png")).getImage();
        }
        return a;
    }

    private void a() {
        if (SystemTray.isSupported()) {
            try {
                ImageIcon icon = new ImageIcon(DSENDesktop.class.getResource("resources/nfe_fundo_branco.gif"));
                this.a = new DSGETrayIcon(icon, DSENProperties.getInstance().getAplicativoWindowTitle());
                this.getTrayIcon().setImageAutoSize(true);
                this.getTrayIcon().addMouseListener((MouseListener)new /* Unavailable Anonymous Inner Class!! */);
                SystemTray tray = SystemTray.getSystemTray();
                this.a(tray, this.getTrayIcon());
                tray.add((TrayIcon)this.getTrayIcon());
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private PopupMenu a(SystemTray tray, DSGETrayIcon trayIcon) throws Exception {
        PopupMenu popup = new PopupMenu();
        MenuItem aboutItem = new MenuItem("   " + DSENLabelConstants.SOBRE + "   ");
        MenuItem exitItem = new MenuItem("   " + DSENLabelConstants.SAIR + "   ");
        popup.add(aboutItem);
        popup.addSeparator();
        popup.add(exitItem);
        trayIcon.setPopupMenu(popup);
        exitItem.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        aboutItem.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        return popup;
    }

    private JPanel a() {
        this.c = new JLabel();
        this.f = new JLabel();
        this.a = new JLabel();
        this.d = new JLabel();
        this.b = new JLabel();
        this.e = new JLabel();
        this.a = new DSENPnlEmitente(this.f, this.d, this.e, (Subject)Notificador.getInstance(), AppContextEnum.EMITENTE);
        this.a.setBorder((Border)BorderFactory.createTitledBorder(null, "Emitente", 0, 0, new Font("Dialog", 0, 11), Color.blue));
        this.c.setForeground(Color.blue);
        this.c.setText("Raz\u00e3o Social:");
        this.f.setFont(new Font("Dialog", 0, 10));
        this.f.setText(null);
        this.a.setForeground(Color.blue);
        this.a.setText("CNPJ:");
        this.d.setFont(new Font("Dialog", 0, 10));
        this.d.setText(null);
        this.b.setForeground(Color.blue);
        this.b.setText("IE:");
        this.e.setFont(new Font("Dialog", 0, 10));
        this.e.setText(null);
        GroupLayout pnlEmitenteLayout = new GroupLayout((Container)this.a);
        this.a.setLayout((LayoutManager)pnlEmitenteLayout);
        pnlEmitenteLayout.setHorizontalGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitenteLayout.createSequentialGroup().addContainerGap().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, -2, 320, 600).addGap(16, 16, 16).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 130, -2).addGap(15, 15, 15).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addContainerGap(-1, 32767)));
        pnlEmitenteLayout.setVerticalGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmitenteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.f).addComponent(this.a).addComponent(this.d).addComponent(this.b).addComponent(this.e)));
        return this.a;
    }

    protected void createMnuPrincipal() {
        this.mnuPrincipal = DSENMenuBuilder.createMnus();
        this.setJMenuBar(this.mnuPrincipal);
    }

    public static DSENDesktop getInstance() {
        if (a == null) {
            a.debug((Object)"Iniciando aplicativo...");
            INICIO_APLICATIVO = System.currentTimeMillis();
            a = new DSENDesktop();
        }
        return a;
    }

    public static void destroyInstance() {
        a = null;
    }

    public static void setInstance(DSENDesktop inst) {
        a = inst;
    }

    public JSplitPane getDesktop() {
        return this.a;
    }

    private JDialog a() {
        HTMLMessageGUI gui = new HTMLMessageGUI((Frame)this, true);
        gui.setText(DSENMessageConstants.EXIT_MESSAGE);
        gui.setTitle(DSENMessageConstants.AVISO_DO_NFE);
        return gui;
    }

    public void exitApp() {
        this.exitApp(true, false);
    }

    public void exitApp(boolean showExitMessage, boolean force) {
        if ((this.a || force) && WindowManager.getInstance().resetPanels()) {
            if (showExitMessage) {
                this.a().setVisible(true);
            }
            if (this.getTrayIcon() != null) {
                SystemTray.getSystemTray().remove((TrayIcon)this.getTrayIcon());
            }
            try {
                ((DSENSystemController)DSGESystemController.getInstance(DSENSystemController.class)).stopApp();
                System.exit(0);
            }
            catch (Exception e) {
                DSGEExceptionGUI exGUI = new DSGEExceptionGUI((Throwable)e);
                DSGEWindowUtilHelper.centralizarDialogo((Component)null, (JDialog)exGUI);
                exGUI.setVisible(true);
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        DSENDesktop.getInstance();
    }

    public DSGETrayIcon getTrayIcon() {
        return this.a;
    }

    public DSENStatusBAR getStatusBar() {
        return this.a;
    }

    static /* synthetic */ JMenuBar a(DSENDesktop x0) {
        return x0.mnuPrincipal;
    }

    static /* synthetic */ DSENPnlEmitente a(DSENDesktop x0) {
        return x0.a;
    }

    static /* synthetic */ boolean a(DSENDesktop x0, boolean x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ DSENDesktop a() {
        return a;
    }

    static {
    }
}

