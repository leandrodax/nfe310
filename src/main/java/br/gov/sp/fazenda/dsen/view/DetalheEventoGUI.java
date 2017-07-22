/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.DetalheEventoGUI
 *  br.gov.sp.fazenda.dsen.view.DetalheEventoGUI$1
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.view.DetalheEventoGUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class DetalheEventoGUI
extends JDialog {
    private static final long a = -4534503513390909488L;
    private JButton a;
    private JPanel a;
    private JScrollPane a;
    private JEditorPane a;

    public DetalheEventoGUI(Window parent, String title, String htmlDetalhe) {
        super(parent);
        this.setModal(true);
        this.setTitle(title);
        this.a();
        this.setLocationRelativeTo(null);
        this.a.setContentType("text/html");
        this.a.setText(htmlDetalhe);
        this.a.setEditable(false);
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JScrollPane();
        this.a = new JEditorPane();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.a.setBorder(BorderFactory.createTitledBorder(null, this.getTitle(), 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setBackground(UIManager.getDefaults().getColor("Panel.background"));
        this.a.setViewportView(this.a);
        this.a.setText("Fechar");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 318, 32767).addComponent(this.a).addContainerGap(314, 32767)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a, -1, 329, 32767).addGap(11, 11, 11).addComponent(this.a)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.setVisible(false);
        this.dispose();
    }

    static /* synthetic */ void a(DetalheEventoGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

