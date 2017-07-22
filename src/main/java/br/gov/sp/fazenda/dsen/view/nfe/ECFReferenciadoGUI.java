/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModeloECFEnum
 *  br.gov.sp.fazenda.dsen.common.to.RefECFTO
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ECFReferenciadoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ECFReferenciadoGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.ModeloECFEnum;
import br.gov.sp.fazenda.dsen.common.to.RefECFTO;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ECFReferenciadoGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ECFReferenciadoGUI
extends DSGEDialog
implements FocusListener {
    private static final long a = 7791997096764965481L;
    private DigitarNotaFiscalGUI a;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private JLabel a;
    private JPanel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private String a;
    private String b;
    private RefECFTO a;
    private Map<String, JComponent[]> a;

    public ECFReferenciadoGUI(String operacao, DigitarNotaFiscalGUI digitarNotaGUI) throws DSGEViewException {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = operacao;
        this.b = digitarNotaGUI.getOperacao();
        this.a = digitarNotaGUI;
        this.d();
        this.b.setActionCommand(operacao);
        this.b.addFocusListener((FocusListener)this);
        this.a.addFocusListener((FocusListener)this);
        this.a();
        this.b();
        this.bindController((ViewItf)this);
        this.setLocationRelativeTo(null);
    }

    private void a(RefECFTO refECFTO) throws DSGEUtilException {
        this.a.setSelectedIndex(-1);
        if (!StringHelper.isBlankOrNull((Object)refECFTO.getNECF())) {
            this.b.setText(StringHelper.completaComZerosAEsquerda((String)refECFTO.getNECF(), (int)3));
        }
        if (!StringHelper.isBlankOrNull((Object)refECFTO.getNCOO())) {
            this.a.setText(StringHelper.completaComZerosAEsquerda((String)refECFTO.getNCOO(), (int)6));
        }
        this.a.setSelectedItem((Object)ModeloECFEnum.getEnumPeloCodigo((String)refECFTO.getMod()));
    }

    private void a() {
        this.a = new HashMap();
        this.a.put("notaECFReferenciadoAll", new JComponent[]{this.b, this.a, this.a, this.b});
        this.a.put("notaECFReferenciadoInit", new JComponent[]{this.b, this.a, this.a, this.b, this.a});
    }

    private void b() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c() {
        this.b.setText(null);
        this.a.setText(null);
        this.a.setSelectedIndex(-1);
    }

    private void d() {
        this.a = new JPanel();
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.c = new JLabel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.d = new JLabel();
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(6));
        this.b = new JLabel();
        this.a = new JComboBox();
        this.setDefaultCloseOperation(2);
        this.setTitle("Cupom Fiscal Vinculado \u00e0 NF-e");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Cumpom Fiscal Vinculado \u00e0 NF-e", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* N\u00famero ECF");
        this.b.setHorizontalAlignment(4);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* N\u00famero COO");
        this.a.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Modelo");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b, -2, 114, -2).addGap(18, 18, 18).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 111, -2)).addComponent(this.a, -2, 53, -2))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 97, 32767).addComponent(this.a))).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b, -2, -1, -2).addComponent(this.d).addComponent(this.a, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, -1, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public String getOperacaoNota() {
        return this.b;
    }

    public RefECFTO getRefECFTO() {
        if (this.a == null) {
            this.a = new RefECFTO();
        }
        this.a.setNECF(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? new Long(this.b.getText()).toString() : null);
        this.a.setNCOO(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? new Long(this.a.getText()).toString() : null);
        this.a.setMod(!StringHelper.isBlankOrNull((Object)this.a.getSelectedItem()) ? this.a.getSelectedItem().toString() : null);
        return this.a;
    }

    public void setRefECFTO(RefECFTO refECFTO) throws DSGEUtilException {
        this.a = refECFTO;
        this.c();
        if (refECFTO != null) {
            this.a(refECFTO);
        }
    }

    public void firePropertyChange(String propertyName, RefECFTO refECFTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)refECFTO);
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    public void setListaModeloECF(ModeloECFEnum[] lista) {
        this.a.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.a.addItem(lista[i]);
            }
        }
        this.a.setSelectedIndex(-1);
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.b) {
            if (!StringHelper.isBlankOrNull((Object)this.b.getText())) {
                String nECF = StringHelper.completaComZerosAEsquerda((String)this.b.getText(), (int)3);
                this.b.setText(nECF);
            }
        } else if (e.getSource() == this.a && !StringHelper.isBlankOrNull((Object)this.a.getText())) {
            String nCOO = StringHelper.completaComZerosAEsquerda((String)this.a.getText(), (int)6);
            this.a.setText(nCOO);
        }
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public DigitarNotaFiscalGUI getDigitarNotaGUI() {
        return this.a;
    }
}

