/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.BackupEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
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
import java.util.HashMap;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BackupEmitenteGUI
extends DSGESimplePanel {
    public static final int OPERACAO_BACKUP = 0;
    public static final int OPERACAO_RESTORE = 1;
    private int a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JLabel a;
    private JPanel a;
    private JTextField a;
    private Map<String, JComponent[]> a;
    private EmitenteTO a = 0;

    public BackupEmitenteGUI(int operacao) throws DSGEViewException {
        this.a = operacao;
        this.a();
        this.b();
        this.c();
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JTextField();
        this.b = new JButton();
        this.a = new JButton();
        this.c = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, this.a(), 2, 2, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.a.setBorder(BorderFactory.createTitledBorder("Diret\u00f3rio de backup"));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Caminho");
        this.a.setEditable(false);
        this.a.setEnabled(false);
        this.b.setText("Procurar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 380, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.a.setText(this.b());
        this.c.setText("Voltar");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c))).addContainerGap()));
        layout.linkSize(0, this.a, this.c);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.c)).addContainerGap(-1, 32767)));
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void setCaminho(String caminho) {
        this.a.setText(caminho);
    }

    public String getCaminho() {
        return this.a.getText();
    }

    public int getOperacao() {
        return this.a;
    }

    public void setOperacao(int operacao) {
        this.a = operacao;
    }

    public EmitenteTO getEmitenteTO() {
        return this.a;
    }

    public void setEmitenteTO(EmitenteTO emitenteTO) {
        this.a = emitenteTO;
    }

    public void firePropertyChange(String propertyName) {
        this.firePropertyChange(propertyName, (Object)null, (Object)null);
    }

    private void b() {
        this.b.setActionCommand("procurar");
        this.a.setActionCommand("executarBackup");
        this.c.setActionCommand("voltar");
    }

    private void c() {
        this.a = new HashMap();
    }

    private String a() {
        String title = DSENLabelConstants.BACKUP_EMITENTE;
        if (this.a == 1) {
            title = DSENLabelConstants.RESTORE_EMITENTE;
        }
        return title;
    }

    private String b() {
        String text = DSENLabelConstants.BACKUP;
        if (this.a == 1) {
            text = DSENLabelConstants.RESTORE;
        }
        return text;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

