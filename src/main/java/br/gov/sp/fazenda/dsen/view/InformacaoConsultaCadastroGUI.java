/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaCadastroGUI
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.util.EventListener;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle;

public class InformacaoConsultaCadastroGUI
extends DSGEDialog {
    private JLabel a;
    private JProgressBar a;

    public InformacaoConsultaCadastroGUI(Frame parent) {
        super((Window)parent, true);
        this.a();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(0);
    }

    private void a() {
        this.a = new JLabel();
        this.a = new JProgressBar();
        this.setDefaultCloseOperation(2);
        this.setTitle("Consultando Cadastro de Contribuintes do ICMS");
        this.setResizable(false);
        this.a.setText("<html><p>Consultando Cadastro de Contribuintes do ICMS.</p><p>Por favor, aguarde</p></html>");
        this.a.setIndeterminate(true);
        this.a.setStringPainted(true);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 459, 32767).addComponent(this.a, -1, 459, 32767)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, 54, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void firePropertyChange(String propertyName, Object b, Object c) {
        super.firePropertyChange(propertyName, b, c);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    public void addActionListener(EventListener listener) {
    }

    public void setProgressBarIndeterminate(boolean b) {
        this.a.setIndeterminate(b);
    }

    public void setPercentCompleted(int i) {
        this.a.setValue(i);
    }
}

