/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.message.DSGEJMessageGUI
 *  br.gov.sp.fazenda.dsge.view.message.DSGEJMessageGUI$1
 */
package br.gov.sp.fazenda.dsge.view.message;

import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.message.DSGEJMessageGUI;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class DSGEJMessageGUI
extends DSGEDialog
implements KeyListener {
    private static final long a = -6905940269044052968L;
    private JButton a;
    private JScrollPane a;
    private JTextArea a;

    public DSGEJMessageGUI(Window parent, boolean modal) {
        super(parent, modal);
        this.a();
        this.a.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.requestFocus();
        this.a.addKeyListener((KeyListener)this);
        this.pack();
    }

    private void a() {
        this.a = new JScrollPane();
        this.a = new JTextArea();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Mensagem do Sistema");
        this.setModal(true);
        this.setResizable(false);
        this.a.setColumns(20);
        this.a.setEditable(false);
        this.a.setFont(new Font("Tahoma", 1, 12));
        this.a.setLineWrap(true);
        this.a.setRows(5);
        this.a.setWrapStyleWord(true);
        this.a.setFocusable(false);
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.setOpaque(false);
        this.a.setViewportView(this.a);
        this.a.setText("Ok");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 536, 32767)).addGroup(layout.createSequentialGroup().addGap(223, 223, 223).addComponent(this.a, -2, 90, -2))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.a, -2, 123, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(-1, 32767)));
        this.pack();
    }

    public void setMessage(String message) {
        this.a.setText(message);
        this.a.setCaretPosition(0);
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10) {
            this.a.doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

