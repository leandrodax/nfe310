/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$TipoConsultaEnum
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI_2
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI_2$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI_2;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ConsultaCadastroConfirmacaoGUI_2
extends DSGEDialog {
    private JButton a;
    private JButton b;
    private JPanel a;
    private JPanel b;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JTextField a;
    private ConsultaCadastroTO a;

    public ConsultaCadastroConfirmacaoGUI_2(ConsultaCadastroTO to, Frame parent, boolean modal) throws DSGEViewException {
        super((Window)parent, modal);
        this.b();
        this.a();
        this.setConsultaCadastroTO(to);
        this.setLocationRelativeTo(null);
        this.bindController((ViewItf)this);
    }

    public void setConsultaCadastroTO(ConsultaCadastroTO to) {
        this.a = to;
        this.a.setText(to.getIEFormatada());
        this.b.setText(to.getIeSuframaFormatada());
        this.a.setText(to.getUf());
        switch (1.a[to.getTipoConsultaEnum().ordinal()]) {
            case 1: {
                this.b.setVisible(true);
                this.b.setVisible(true);
                break;
            }
            case 2: {
                this.b.setVisible(false);
                this.b.setVisible(false);
            }
        }
        if (StringHelper.isBlankOrNull((Object)this.a.getText())) {
            this.a.setVisible(false);
            this.a.setVisible(false);
            this.a.setVisible(false);
            this.c.setVisible(false);
        }
        if (StringHelper.isBlankOrNull((Object)this.b.getText())) {
            this.b.setVisible(false);
            this.b.setVisible(false);
        }
    }

    private void a() {
        this.a.setActionCommand("cancelar");
        this.b.setActionCommand("ok");
    }

    private void b() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JFormattedTextField();
        this.b = new JLabel();
        this.b = new JFormattedTextField();
        this.c = new JLabel();
        this.a = new JTextField();
        this.b = new JPanel();
        this.b = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Consulta Cadastro");
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Consulta Cadastro de Contribuintes do ICMS", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Inscri\u00e7\u00e3o Estadual");
        this.a.setEditable(false);
        this.a.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Inscri\u00e7\u00e3o SUFRAMA");
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("UF");
        this.a.setEditable(false);
        this.b.setText("OK");
        this.a.setText("Cancelar");
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)));
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -2, -1, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, 209, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 209, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 30, -2))).addGap(14, 14, 14)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a, -2, -1, -2).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.b, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.b, -2, -1, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView(viewItf);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public ConsultaCadastroTO getConsultaCadastroTO() {
        return this.a;
    }
}

