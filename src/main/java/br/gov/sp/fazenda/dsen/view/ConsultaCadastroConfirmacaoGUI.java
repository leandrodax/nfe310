/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$DocumentoConsultaEnum
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$TipoConsultaEnum
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI$1
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI$2
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI$3
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI$4
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI$5
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI$6
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ConsultaCadastroConfirmacaoGUI
extends DSGEDialog {
    private JButton a;
    private JButton b;
    private ButtonGroup a;
    private JPanel a;
    private JPanel b;
    private JRadioButton a;
    private JRadioButton b;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JTextField a;
    private ConsultaCadastroTO a;

    public ConsultaCadastroConfirmacaoGUI(ConsultaCadastroTO to, Frame parent, boolean modal) throws DSGEViewException {
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
        this.a.setDocumentoConsulta(ConsultaCadastroTO.DocumentoConsultaEnum.IE);
        this.b.setSelected(true);
        this.b.setFocusable(true);
        this.b.setText(to.getIeSuframaFormatada());
        this.a.setText(to.getUf());
        switch (6.a[to.getTipoConsultaEnum().ordinal()]) {
            case 1: {
                this.c.setVisible(true);
                this.b.setVisible(true);
                break;
            }
            case 2: {
                this.c.setVisible(false);
                this.b.setVisible(false);
            }
        }
        if (StringHelper.isBlankOrNull((Object)this.a.getText())) {
            if (StringHelper.isBlankOrNull((Object)this.a.getCNPJ().trim().replace(".", "").replace("/", "").replace("-", ""))) {
                this.a.setVisible(false);
                this.a.setVisible(false);
                this.a.setVisible(false);
                this.d.setVisible(false);
                this.b.setVisible(false);
                this.a.setVisible(false);
                this.b.setVisible(false);
            } else {
                this.b.setEnabled(false);
                this.a.setEnabled(true);
                this.a.setSelected(true);
                this.a.setText("CNPJ");
                this.a.setDocumentoConsulta(ConsultaCadastroTO.DocumentoConsultaEnum.CNPJ);
                this.a.setText(this.a.getCNPJ());
            }
        } else if (StringHelper.isBlankOrNull((Object)this.a.getCNPJ().trim().replace(".", "").replace("/", "").replace("-", ""))) {
            this.a.setEnabled(false);
        }
        if (StringHelper.isBlankOrNull((Object)this.b.getText())) {
            this.c.setVisible(false);
            this.b.setVisible(false);
        }
    }

    private void a() {
        this.a.setActionCommand("cancelar");
        this.b.setActionCommand("ok");
    }

    private void b() {
        this.a = new ButtonGroup();
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JFormattedTextField();
        this.c = new JLabel();
        this.b = new JFormattedTextField();
        this.d = new JLabel();
        this.a = new JTextField();
        this.b = new JPanel();
        this.b = new JButton();
        this.a = new JButton();
        this.b = new JLabel();
        this.a = new JRadioButton();
        this.b = new JRadioButton();
        this.a.add(this.a);
        this.a.add(this.b);
        this.setDefaultCloseOperation(2);
        this.setTitle("Consulta Cadastro");
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Consulta Cadastro de Contribuintes do ICMS", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Inscri\u00e7\u00e3o Estadual");
        this.a.setEditable(false);
        this.a.setHorizontalAlignment(4);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Inscri\u00e7\u00e3o SUFRAMA");
        this.b.setEditable(false);
        this.b.setHorizontalAlignment(4);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("UF");
        this.a.setEditable(false);
        this.b.setText("OK");
        this.a.setText("Cancelar");
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(-1, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Consulta por :");
        this.a.setText("CNPJ");
        this.a.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addPropertyChangeListener((PropertyChangeListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setText("Inscri\u00e7\u00e3o Estadual");
        this.b.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.addPropertyChangeListener((PropertyChangeListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addComponent(this.c).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -2, -1, -2).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, 209, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 209, 32767).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.b).addGap(18, 18, 18).addComponent(this.a))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 30, -2))).addGap(14, 14, 14)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.b).addComponent(this.a)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 6, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a, -2, -1, -2).addComponent(this.d).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.b, -2, -1, -2).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    private void a(ActionEvent evt) {
    }

    private void a(PropertyChangeEvent evt) {
    }

    private void b(PropertyChangeEvent evt) {
    }

    private void a(ItemEvent evt) {
        if (this.a.isSelected()) {
            this.a.setText("CNPJ");
            this.a.setText(this.a.getCNPJ());
            this.a.setDocumentoConsulta(ConsultaCadastroTO.DocumentoConsultaEnum.CNPJ);
        }
        if (this.b.isSelected()) {
            this.a.setText("Inscri\u00e7\u00e3o Estadual");
            this.a.setText(this.a.getIEFormatada());
            this.a.setDocumentoConsulta(ConsultaCadastroTO.DocumentoConsultaEnum.IE);
        }
    }

    private void b(ItemEvent evt) {
        if (this.a.isSelected()) {
            this.a.setText("CNPJ");
            this.a.setText(this.a.getCNPJ());
            this.a.setDocumentoConsulta(ConsultaCadastroTO.DocumentoConsultaEnum.CNPJ);
        }
        if (this.b.isSelected()) {
            this.a.setText("Inscri\u00e7\u00e3o Estadual");
            this.a.setText(this.a.getIEFormatada());
            this.a.setDocumentoConsulta(ConsultaCadastroTO.DocumentoConsultaEnum.IE);
        }
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

    static /* synthetic */ void a(ConsultaCadastroConfirmacaoGUI x0, ItemEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void a(ConsultaCadastroConfirmacaoGUI x0, ActionEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void a(ConsultaCadastroConfirmacaoGUI x0, PropertyChangeEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void b(ConsultaCadastroConfirmacaoGUI x0, ItemEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ void b(ConsultaCadastroConfirmacaoGUI x0, PropertyChangeEvent x1) {
        x0.b(x1);
    }
}

