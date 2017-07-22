/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.SelecionarDiretorioBibliotecaA3GUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarDiretorioBibliotecaA3GUI$1
 *  br.gov.sp.fazenda.dsen.view.SelecionarDiretorioBibliotecaA3GUI$2
 *  br.gov.sp.fazenda.dsen.view.SelecionarDiretorioBibliotecaA3GUI$3
 *  br.gov.sp.fazenda.dsen.view.SelecionarDiretorioBibliotecaA3GUI$4
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.view.SelecionarDiretorioBibliotecaA3GUI;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class SelecionarDiretorioBibliotecaA3GUI
extends DSGEDialog {
    private static final long a = -8930960458935723467L;
    private JButton a;
    private JButton b;
    private JButton c;
    private JLabel a;
    private JLabel b;
    private JPanel a;
    private JPanel b;
    private JTextField a;

    public SelecionarDiretorioBibliotecaA3GUI(Frame parent, boolean modal) {
        super((Window)parent, modal);
        this.a();
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.b = new JLabel();
        this.a = new JTextField();
        this.b = new JButton();
        this.b = new JPanel();
        this.c = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Procurando dispositivos A3 (Smart Card/Token)");
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Procurando dispositivos A3 (Smart Card/Token)", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setFont(new Font("SansSerif", 1, 12));
        this.a.setText("N\u00e3o foi poss\u00edvel encontrar o(s) dispositivo(s) A3 conectado(s) ao computador.");
        this.b.setFont(new Font("SansSerif", 0, 12));
        this.b.setText("<html><p>Se o dispositivo n\u00e3o estava conectado ao computador, conecte-o corretamente e clique em Repetir.<br>Caso o arquivo com o driver do dispositivo esteja em outro local, informe o diret\u00f3rio onde se encontra e clique em Repetir.<br>Ou cancele a opera\u00e7\u00e3o e inclua a biblioteca com o driver manualmente clicando em Incluir Manualmente.</p></html>");
        this.a.setEnabled(false);
        this.b.setText("...");
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, 634, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a, -1, 540, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addGap(45, 45, 45)).addComponent(this.a, -1, 634, 32767)).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(24, 24, 24).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, 91, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addContainerGap()));
        this.c.setText("Repetir");
        this.c.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setText("Cancelar Opera\u00e7\u00e3o");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -1, -1, 32767).addContainerGap()).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 211, 32767).addComponent(this.b, -2, -1, -2).addContainerGap(212, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.firePropertyChange("REPETIR_PROCURA_A3", (Object)null, (Object)this.a.getText());
    }

    private void b(ActionEvent evt) {
        this.firePropertyChange("REPETIR_PROCURA_A3_CANCELADA", (Object)null, (Object)null);
    }

    private void c(ActionEvent evt) {
        String fileName = FileChooserHelper.chooseDirectory((Component)this, (boolean)false, (boolean)true);
        this.a.setText(fileName);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    static /* synthetic */ void a(SelecionarDiretorioBibliotecaA3GUI x0, ActionEvent x1) {
        x0.c(x1);
    }

    static /* synthetic */ void b(SelecionarDiretorioBibliotecaA3GUI x0, ActionEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void c(SelecionarDiretorioBibliotecaA3GUI x0, ActionEvent x1) {
        x0.b(x1);
    }
}

