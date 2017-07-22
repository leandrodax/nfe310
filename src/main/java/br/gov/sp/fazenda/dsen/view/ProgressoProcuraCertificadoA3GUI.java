/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.ProgressoProcuraCertificadoA3GUI
 *  br.gov.sp.fazenda.dsen.view.ProgressoProcuraCertificadoA3GUI$1
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.ProgressoProcuraCertificadoA3GUI;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ProgressoProcuraCertificadoA3GUI
extends DSGEDialog {
    private static final long a = -8008789569447749594L;
    private JButton a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JPanel a;
    private JScrollPane a;
    private JTextArea a;

    public ProgressoProcuraCertificadoA3GUI(Frame parent, boolean modal) {
        super((Window)parent, modal);
        this.a();
        this.setLocationRelativeTo(null);
    }

    public ProgressoProcuraCertificadoA3GUI(Dialog parent, boolean modal) {
        super((Window)parent, modal);
        this.a();
        this.setLocationRelativeTo(null);
    }

    public void appendMessage(String string) {
        this.a.append(string + "\n");
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.b = new JLabel();
        this.c = new JLabel();
        this.d = new JLabel();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Procurando Dispositivos A3 (Smar Card/Token)");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Procurando Dispositivos A3 (Smart Card/Token)", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setFont(new Font("SansSerif", 0, 12));
        this.a.setText("<html><p>Esta opera\u00e7\u00e3o poder\u00e1 demorar alguns minutos.</p><p> Por favor, aguarde...</p>");
        this.b.setFont(new Font("SansSerif", 0, 12));
        this.b.setText("Certifique-se que o dispositivo A3 esteja conectado ao computador!");
        this.c.setFont(new Font("SansSerif", 1, 12));
        this.c.setText("Realizando busca pelos drivers.");
        this.d.setFont(new Font("SansSerif", 0, 12));
        this.d.setText("Verificando:");
        this.a.setColumns(20);
        this.a.setEditable(false);
        this.a.setRows(5);
        this.a.setViewportView(this.a);
        this.a.setText("Cancelar Opera\u00e7\u00e3o");
        this.a.setToolTipText(DSENLabelConstants.TOOLTIP_CERTIFICADO_BTN_CANCELAR_PROCURA_A3);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 499, 32767).addComponent(this.b).addComponent(this.c).addComponent(this.d).addComponent(this.a, -1, 499, 32767).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 350, 32767).addComponent(this.a))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addGap(12, 12, 12).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 139, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.firePropertyChange("PROCURAR_A3_CANCELADO", (Object)null, (Object)null);
    }

    public void addActionListener(EventListener listener) {
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    static /* synthetic */ void a(ProgressoProcuraCertificadoA3GUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

