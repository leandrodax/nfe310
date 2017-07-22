/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.DuplicarNFeGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
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
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class DuplicarNFeGUI
extends DSGEDialog
implements FocusListener {
    private static final long a = 1482235894066180649L;
    private NotaFiscalTO a;
    private JButton a;
    private JButton b;
    private JPanel a;
    private JLabel a;
    private JLabel b;
    private JFormattedTextField a;
    private JFormattedTextField b;

    public DuplicarNFeGUI(NotaFiscalTO aDuplicar) throws DSGEViewException {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = aDuplicar;
        this.c();
        this.b();
        this.a();
        this.setLocationRelativeTo(null);
        this.bindController((ViewItf)this);
    }

    public NotaFiscalTO getNotaFiscalTO() {
        return this.a;
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("cancelar");
    }

    private void b() {
        this.b.addFocusListener((FocusListener)this);
        this.a.addFocusListener((FocusListener)this);
    }

    public void setSerie(String serie) {
        this.b.setText(serie);
    }

    public void setNumero(String numero) {
        this.a.setText(numero);
    }

    public String getSerie() {
        return this.b.getText();
    }

    public String getNumero() {
        return this.a.getText();
    }

    private void c() {
        this.a = new JPanel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.a = new JLabel();
        this.b = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Duplicar NF-e");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Duplicar NF-e", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.b.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Nova S\u00e9rie");
        this.a.setHorizontalAlignment(4);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("*Novo  N\u00famero");
        this.b.setText("OK");
        this.a.setText("Cancelar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.a).addComponent(this.a, -1, -1, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a))).addContainerGap(155, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addGap(1, 1, 1).addComponent(this.b, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addGap(1, 1, 1).addComponent(this.a, -2, -1, -2))).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(19, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.b.addFocusListener((FocusListener)listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.b) {
            String serie = StringHelper.completaComZerosAEsquerda((String)this.b.getText(), (int)3);
            this.b.setText(serie);
        } else if (e.getSource() == this.a) {
            String nnf = StringHelper.completaComZerosAEsquerda((String)this.a.getText(), (int)9);
            this.a.setText(nnf);
        }
    }
}

