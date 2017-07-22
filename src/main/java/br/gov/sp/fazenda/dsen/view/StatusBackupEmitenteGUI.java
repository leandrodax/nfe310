/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.StatusBackupEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.StatusBackupEmitenteGUI$1
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.StatusBackupEmitenteGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class StatusBackupEmitenteGUI
extends DSGEDialog {
    private int a;
    private JButton a;
    private JPanel a;
    private JLabel a;
    private JProgressBar a;
    private Map<String, JComponent[]> a;

    public StatusBackupEmitenteGUI(Frame parent, boolean modal, int operacao) {
        super((Window)parent, modal);
        this.a = operacao;
        this.a();
        this.b();
        this.c();
        WindowManager.getInstance().centralizarDialogo((JDialog)this);
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JProgressBar();
        this.a = new JButton();
        this.setDefaultCloseOperation(0);
        this.setTitle(this.a());
        this.setModal(true);
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(""));
        this.a.setText(this.b());
        this.a.setIndeterminate(true);
        this.a.setText("Fechar");
        this.a.setEnabled(false);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 450, 32767).addComponent(this.a))).addGroup(jPanel1Layout.createSequentialGroup().addGap(196, 196, 196).addComponent(this.a))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void terminate(String message) {
        this.enableComponents("fechar");
        this.a.setIndeterminate(false);
        this.a.setValue(100);
        String mensagem = MessageFormat.format(message, "Backup");
        if (this.a == 1) {
            mensagem = MessageFormat.format(message, "Restore");
        }
        this.a.setText(mensagem);
    }

    private void b() {
        this.a = new HashMap();
        this.a.put("fechar", new JComponent[]{this.a});
    }

    private void c() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private String a() {
        String title = DSENLabelConstants.BACKUP_EMITENTE;
        if (this.a == 1) {
            title = DSENLabelConstants.RESTORE_EMITENTE;
        }
        return title;
    }

    private String b() {
        String mensagem = MessageFormat.format(DSENLabelConstants.AGUARDE_EXECUCAO, "backup");
        if (this.a == 1) {
            mensagem = MessageFormat.format(DSENLabelConstants.AGUARDE_EXECUCAO, "restore");
        }
        return mensagem;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

