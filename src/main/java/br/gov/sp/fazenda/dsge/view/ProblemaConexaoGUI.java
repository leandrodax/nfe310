/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI$1
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI$2
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI$3
 *  br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI$4
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ProblemaConexaoGUI;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ProblemaConexaoGUI
extends DSGEDialog
implements WindowListener {
    private static final long a = -2129290618269069358L;
    private boolean a;
    private boolean b;
    private ProblemaConexaoAcao a;
    private JButton a;
    private JButton b;
    private JCheckBox a;
    private JLabel a;
    private JLabel b = false;
    private JPanel a;
    private JScrollPane a;
    private JLabel c;
    private JLabel d;
    private JEditorPane a = false;

    public ProblemaConexaoGUI(JDialog parent, int tempoEspera, String detalhe, String titulo, String mensagem) {
        super((Window)parent, true);
        this.a(tempoEspera, detalhe, titulo, mensagem);
    }

    public ProblemaConexaoGUI(JFrame parent, int tempoEspera, String detalhe, String titulo, String mensagem) {
        super((Window)parent, true);
        this.a(tempoEspera, detalhe, titulo, mensagem);
    }

    private void a(int tempoEspera, String detalhe, String titulo, String mensagem) {
        this.a();
        this.c.setText("" + tempoEspera + "");
        this.b();
        this.setDefaultCloseOperation(0);
        this.addWindowListener((WindowListener)this);
        this.a.setVisible(false);
        this.a.setText(detalhe);
        this.d.setText(mensagem);
        this.setTitle(titulo);
        DSGEWindowUtilHelper.centralizarDialogo((Component)null, (JDialog)this);
         timeThread = new /* Unavailable Anonymous Inner Class!! */;
        timeThread.start();
    }

    private void a() {
        this.a = new JPanel();
        this.d = new JLabel();
        this.a = new JLabel();
        this.c = new JLabel();
        this.b = new JLabel();
        this.a = new JCheckBox();
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JScrollPane();
        this.a = new JEditorPane();
        this.setDefaultCloseOperation(2);
        this.setTitle("Conex\u00e3o");
        this.setModal(true);
        this.d.setText("N\u00e3o foi poss\u00edvel estabelecer uma conex\u00e3o com a SEFAZ.");
        this.a.setText("Reconectando em:");
        this.c.setText("600");
        this.b.setText("segundos");
        this.a.setText("Mostrar Detalhes");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.b.setText("Reconectar Agora");
        this.a.setText("Cancelar");
        this.a.setContentType("text/html");
        this.a.setEditable(false);
        this.a.setDisabledTextColor(new Color(0, 0, 0));
        this.a.setViewportView(this.a);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 516, 32767).addComponent(this.d).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addGap(20, 20, 20).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)).addComponent(this.a)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.d).addGap(21, 21, 21).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.c).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addGap(28, 28, 28).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 22, 32767).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public ProblemaConexaoAcao getResposta() {
        return this.a;
    }

    public static ProblemaConexaoAcao showGUI(JDialog parent, int tempoEspera, String detalhe, String titulo, String mensagem) {
        ProblemaConexaoGUI problemaConexaoGUI = new ProblemaConexaoGUI(parent, tempoEspera, detalhe, titulo, mensagem);
        problemaConexaoGUI.setVisible(true);
        return problemaConexaoGUI.getResposta();
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    private void b() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c() {
        this.b = true;
        if (this.showQuestion(DSGEMessageConstants.OPERACOES_JA_EXECUTADAS_NAO_SERAO_CANCELADAS) == 0) {
            this.a = true;
            this.a = ProblemaConexaoAcao.CANCELAR;
            this.setVisible(false);
            this.dispose();
        } else {
            this.b = false;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.c();
    }

    @Override
    public void windowClosed(WindowEvent e) {
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

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    static /* synthetic */ boolean a(ProblemaConexaoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ boolean b(ProblemaConexaoGUI x0) {
        return x0.b;
    }

    static /* synthetic */ JLabel a(ProblemaConexaoGUI x0) {
        return x0.c;
    }

    static /* synthetic */ ProblemaConexaoAcao a(ProblemaConexaoGUI x0, ProblemaConexaoAcao x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ void a(ProblemaConexaoGUI x0) {
        x0.c();
    }

    static /* synthetic */ boolean a(ProblemaConexaoGUI x0, boolean x1) {
        x0.a = x1;
        return x0.a;
    }

    static /* synthetic */ JScrollPane a(ProblemaConexaoGUI x0) {
        return x0.a;
    }
}

