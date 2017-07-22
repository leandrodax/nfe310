/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.HTMLMessageGUI
 *  br.gov.sp.fazenda.dsge.view.HTMLMessageGUI$1
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.view.HTMLMessageGUI;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;

public class HTMLMessageGUI
extends JDialog {
    private static final long a = -2449881709774383536L;
    private JButton a;
    private JEditorPane a;
    private JScrollPane a;

    public HTMLMessageGUI(Frame parent, boolean modal) {
        super(parent, modal);
        this.a();
        this.a.setContentType("text/html");
        this.a.setEditable(false);
        this.a.setEnabled(true);
        DSGEWindowUtilHelper.centralizarDialogo((Component)parent, (JDialog)this);
    }

    private void a() {
        this.a = new JScrollPane();
        this.a = new JEditorPane();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.a.setViewportView(this.a);
        this.a.setText("OK");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 614, 32767).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(280, 32767).addComponent(this.a).addContainerGap(281, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.a, -1, 385, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.setVisible(false);
        this.dispose();
    }

    public void setText(String t) {
        this.a.setText(t);
        this.a.setCaretPosition(0);
    }

    static /* synthetic */ void a(HTMLMessageGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

