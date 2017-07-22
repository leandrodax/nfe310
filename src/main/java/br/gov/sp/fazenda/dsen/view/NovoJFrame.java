/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.NovoJFrame
 *  br.gov.sp.fazenda.dsen.view.NovoJFrame$1
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.view.NovoJFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class NovoJFrame
extends JFrame {
    private JPanel a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;

    public NovoJFrame() {
        this.a();
    }

    private void a() {
        this.a = new JPanel();
        this.c = new JLabel();
        this.f = new JLabel();
        this.a = new JLabel();
        this.d = new JLabel();
        this.b = new JLabel();
        this.e = new JLabel();
        this.setDefaultCloseOperation(3);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Emitente", 0, 0, new Font("Dialog", 0, 11), Color.blue));
        this.c.setForeground(Color.blue);
        this.c.setText("Raz\u00e3o Social:");
        this.f.setFont(new Font("Dialog", 0, 10));
        this.f.setText("123456789012345678901234567890123456789012345678901234567890");
        this.a.setForeground(Color.blue);
        this.a.setText("CNPJ/CPF:");
        this.d.setFont(new Font("Dialog", 0, 10));
        this.d.setText("12.345.678/9012-34");
        this.b.setForeground(Color.blue);
        this.b.setText("IE:");
        this.e.setFont(new Font("Dialog", 0, 10));
        this.e.setText("12.345.678.901.234");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, 32767).addComponent(this.f, -2, 291, 32767).addGap(85, 85, 85).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addGap(15, 15, 15).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.d).addComponent(this.b).addComponent(this.e).addComponent(this.c).addComponent(this.f)).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, GroupLayout.Alignment.TRAILING, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 41, -2));
        this.pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }
}

