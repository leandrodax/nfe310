/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum
 *  br.gov.sp.fazenda.dsen.view.ConsultarDpecGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ConsultarDpecGUI
extends DSGESimplePanel
implements ItemListener {
    private JButton a;
    private JButton b;
    private JComboBox a;
    private JPanel a;
    private JFormattedTextField a;

    public ConsultarDpecGUI() throws DSGEViewException {
        this.b();
        this.c();
        this.a();
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.a.removeAllItems();
        this.a.addItem(TipoConsultaDpecEnum.CHAVE_ACESSO);
        this.a.addItem(TipoConsultaDpecEnum.NUMERO_REGISTRO);
        this.a.setSelectedIndex(0);
        this.a.addItemListener((ItemListener)this);
    }

    private void b() {
        this.a = new JComboBox();
        this.a = new JFormattedTextField();
        this.a = new JPanel();
        this.a = new JButton();
        this.b = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Consultar DPEC", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setModel(new DefaultComboBoxModel<String>(new String[]{"Consulta por Chave de Acesso", "Consulta por N\u00famero do Registro"}));
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(44));
        this.a.setText("Consultar");
        this.b.setText("Fechar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b)));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, 282, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 306, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(203, 32767).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 204, 32767))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(31, 31, 31).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, -1, -2).addComponent(this.a, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.a, -2, -1, -2).addContainerGap(156, 32767)));
    }

    public TipoConsultaDpecEnum getTipoConsultaDpecEnum() {
        return (TipoConsultaDpecEnum)this.a.getSelectedItem();
    }

    public String getIdDpec() {
        return this.a.getText();
    }

    private void c() {
        this.b.setActionCommand("fechar");
        this.a.setActionCommand("consultarNFe");
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.a && e.getStateChange() == 1) {
            TipoConsultaDpecEnum tipoConsulta = (TipoConsultaDpecEnum)this.a.getSelectedItem();
            this.a.setText(null);
            if (TipoConsultaDpecEnum.CHAVE_ACESSO.equals((Object)tipoConsulta)) {
                ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(44));
            } else {
                ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(15));
            }
        }
    }
}

