/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormatoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.view.EmitirDanfeGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.FormatoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class EmitirDanfeGUI
extends DSGEDialog {
    private static final long a = -4480526206447452730L;
    private HashMap<String, JComponent[]> a;
    private List<NotaFiscalTO> a;
    private boolean a;
    private JButton a;
    private JButton b;
    private JCheckBox a;
    private JComboBox a;
    private JComboBox b;
    private JPanel a;
    private JLabel a = false;
    private JLabel b;
    private JPanel b;

    public EmitirDanfeGUI(Frame parent, boolean readOnly) throws DSGEViewException {
        super((Window)parent, true);
        this.a = readOnly;
        this.a();
    }

    public EmitirDanfeGUI(Dialog parent, boolean readOnly) throws DSGEViewException {
        super((Window)parent, true);
        this.a = readOnly;
        this.a();
    }

    private void a() throws DSGEViewException {
        this.b();
        this.d();
        this.e();
        this.c();
        this.bindController((ViewItf)this);
        if (this.a) {
            this.setTitle(DSENMessageConstants.TITLE_PRE_VISUALIZAR_DANFE);
            this.a.setText(DSENLabelConstants.PRE_VISUALIZAR_DANFE);
        } else {
            this.setTitle(DSENMessageConstants.TITLE_IMPRIMIR_DANFE);
            this.a.setText(DSENLabelConstants.IMPRIMIR_DANFE);
        }
    }

    private void b() {
        this.b = new JPanel();
        this.a = new JLabel();
        this.a = new JComboBox();
        this.a = new JCheckBox();
        this.a = new JPanel();
        this.a = new JButton();
        this.b = new JButton();
        this.b = new JLabel();
        this.b = new JComboBox();
        this.setDefaultCloseOperation(2);
        this.setTitle("Impress\u00e3o do DANFE");
        this.setResizable(false);
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Op\u00e7\u00f5es para Impress\u00e3o do DANFE", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setText("Formato de Impress\u00e3o:");
        this.a.setText("Com Formul\u00e1rio Pr\u00e9-Impresso");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.setText("Visualizar");
        this.b.setText("Fechar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b)));
        this.b.setText("Tipo de Papel:");
        GroupLayout pnlCentroLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlCentroLayout);
        pnlCentroLayout.setHorizontalGroup(pnlCentroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCentroLayout.createSequentialGroup().addContainerGap().addGroup(pnlCentroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCentroLayout.createSequentialGroup().addGroup(pnlCentroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlCentroLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b, 0, -1, 32767).addComponent(this.a, 0, 208, 32767))).addComponent(this.a)).addContainerGap(54, 32767)).addGroup(GroupLayout.Alignment.TRAILING, pnlCentroLayout.createSequentialGroup().addContainerGap(117, 32767).addComponent(this.a, -2, -1, -2).addContainerGap(113, 32767)));
        pnlCentroLayout.setVerticalGroup(pnlCentroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCentroLayout.createSequentialGroup().addContainerGap().addGroup(pnlCentroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlCentroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a).addGap(18, 18, 18).addComponent(this.a, -2, -1, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -2, -1, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -2, -1, -2));
        this.pack();
    }

    private void c() {
        for (FormatoImpressaoEnum e : FormatoImpressaoEnum.values()) {
            this.a.addItem(e);
        }
        for (FormatoImpressaoEnum e : TipoPapelImpressaoEnum.values()) {
            this.b.addItem(e);
        }
    }

    public void setFormatoImpressaoSelected(FormatoImpressaoEnum formatoImpressao) {
        this.a.setSelectedItem((Object)formatoImpressao);
    }

    public void setTipoPapel(TipoPapelImpressaoEnum t) {
        this.b.setSelectedItem((Object)t);
    }

    public void setPreImpressaoSelected(boolean selected) {
        this.a.setSelected(selected);
    }

    public void setSelectedNotas(List<NotaFiscalTO> notaFiscalTOList) {
        this.a = notaFiscalTOList;
    }

    public List<NotaFiscalTO> getSelectedNotas() {
        return this.a;
    }

    public FormatoImpressaoEnum getFormatoImpressao() {
        return (FormatoImpressaoEnum)this.a.getSelectedItem();
    }

    public TipoPapelImpressaoEnum getTipoPapel() {
        return (TipoPapelImpressaoEnum)this.b.getSelectedItem();
    }

    public boolean getPreImpresso() {
        return this.a.isSelected();
    }

    private void d() {
        this.a.setActionCommand("visualizar");
        this.b.setActionCommand("voltar");
    }

    private void e() {
        this.a = new HashMap();
        this.a.put("danfeAllComponents", new JComponent[]{this.a, this.a, this.a});
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void itemStateChanged(ItemEvent e) {
    }

    public ControllerItf getController(ViewItf viewItf) throws DSGEViewException {
        return null;
    }

    public void firePropertyChange(String propertyName) {
        this.firePropertyChange(propertyName, (Object)null, (Object)null);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public boolean isReadOnly() {
        return this.a;
    }

    public void setReadOnly(boolean readOnly) {
        this.a = readOnly;
    }
}

