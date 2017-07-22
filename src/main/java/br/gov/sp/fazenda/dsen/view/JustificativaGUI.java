/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.JustificativaGUI
 *  br.gov.sp.fazenda.dsen.view.JustificativaGUI$1
 *  br.gov.sp.fazenda.dsen.view.JustificativaGUI$2
 *  br.gov.sp.fazenda.dsen.view.JustificativaGUI$3
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.JustificativaGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class JustificativaGUI
extends DSGEDialog {
    private String a;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JScrollPane a;
    private JLabel b;
    private JPanel a;
    private JTextArea a = null;

    public JustificativaGUI(Frame parent, boolean modal) {
        super((Window)parent, modal);
        this.b();
        this.a();
    }

    public JustificativaGUI(JDialog parent, boolean modal) {
        super((Window)parent, modal);
        this.b();
        this.a();
    }

    private void a() {
        this.a.addKeyListener((KeyListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
        this.a = new JPanel();
        this.b = new JLabel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 255));
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Justificativa");
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(""));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Justificativa");
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(5);
        this.a.setWrapStyleWord(true);
        this.a.setViewportView(this.a);
        this.b.setText("Ok");
        this.b.setEnabled(false);
        this.a.setText("Cancelar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("m\u00ednimo de 15 e m\u00e1ximo de 255 caracteres.");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 348, 32767)).addGroup(pnlPrincipalLayout.createSequentialGroup().addGap(102, 102, 102).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.b)).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 348, 32767))).addContainerGap()));
        pnlPrincipalLayout.linkSize(0, this.a, this.b);
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 137, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(17, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public String getJustificativa() {
        return this.a;
    }

    public static String showGUI() {
        JustificativaGUI gui = new JustificativaGUI((Frame)DSENDesktop.getInstance(), true);
        WindowManager.getInstance().centralizarDialogo((JDialog)gui);
        gui.setVisible(true);
        return gui.getJustificativa();
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ JTextArea a(JustificativaGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JButton a(JustificativaGUI x0) {
        return x0.b;
    }

    static /* synthetic */ String a(JustificativaGUI x0, String x1) {
        x0.a = x1;
        return x0.a;
    }
}

