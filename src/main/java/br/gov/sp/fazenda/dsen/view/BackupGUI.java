/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.BackupGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class BackupGUI
extends DSGESimplePanel {
    private JButton a;
    private JButton b;
    private JButton c;
    private JPanel a;
    private JLabel a;
    private JLabel b;
    private JPanel b;
    private JProgressBar a;
    private JTextField a;

    public BackupGUI() throws DSGEViewException {
        this.a();
        this.b();
        this.bindController((ViewItf)this);
        this.setBackupRunning(false);
    }

    private void a() {
        this.b = new JPanel();
        this.a = new JTextField();
        this.c = new JButton();
        this.b = new JLabel();
        this.a = new JProgressBar();
        this.a = new JPanel();
        this.a = new JButton();
        this.b = new JButton();
        this.a = new JLabel();
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Backup", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.b.setName("pnlSelecionar");
        this.a.setEnabled(false);
        this.a.setName("txtLocal");
        this.c.setLabel("Selecionar");
        this.b.setText("Diret\u00f3rio de Destino:");
        this.b.setName("lblBackup");
        this.a.setText("Iniciar");
        this.b.setText("Fechar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b)));
        this.a.setText("Gerando arquivo de Backup. Por favor, aguarde...");
        GroupLayout pnlSelecionarLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlSelecionarLayout);
        pnlSelecionarLayout.setHorizontalGroup(pnlSelecionarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSelecionarLayout.createSequentialGroup().addGroup(pnlSelecionarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSelecionarLayout.createSequentialGroup().addContainerGap().addGroup(pnlSelecionarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addGroup(pnlSelecionarLayout.createSequentialGroup().addComponent(this.a, -1, 368, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addGap(124, 124, 124)).addComponent(this.a, GroupLayout.Alignment.TRAILING, -1, 595, 32767).addComponent(this.a))).addGroup(pnlSelecionarLayout.createSequentialGroup().addContainerGap(211, 32767).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 220, 32767))).addContainerGap()));
        pnlSelecionarLayout.setVerticalGroup(pnlSelecionarLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSelecionarLayout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlSelecionarLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, -1, -2).addComponent(this.c, -2, 22, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addGap(5, 5, 5).addComponent(this.a, -2, -1, -2).addGap(20, 20, 20).addComponent(this.a, -2, -1, -2).addContainerGap()));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.b, -2, -1, -2).addContainerGap(-1, 32767)));
    }

    public void addActionListener(EventListener listener) {
        this.c.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public Map getMapComponents() {
        return null;
    }

    private void b() {
        this.c.setActionCommand("selecionarBackup");
        this.b.setActionCommand("voltar");
        this.a.setActionCommand("executarBackup");
    }

    public void setTxtLocal(String caminhoBackup) {
        this.a.setText(caminhoBackup);
    }

    public void setlblBackup(String estadoBackup) {
        this.b.setText(estadoBackup);
    }

    public ControllerItf getController(ViewItf viewItf) throws DSGEViewException {
        return null;
    }

    public void setBackupRunning(boolean running) {
        this.a.setVisible(running);
        this.a.setVisible(running);
        this.b.setVisible(!running);
        this.c.setVisible(!running);
        this.a.setVisible(!running);
        this.a.setVisible(!running);
        this.b.setVisible(!running);
    }

    public JProgressBar getProgressBar() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

