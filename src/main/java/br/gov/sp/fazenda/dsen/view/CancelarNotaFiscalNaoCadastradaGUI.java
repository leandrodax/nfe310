/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class CancelarNotaFiscalNaoCadastradaGUI
extends DSGEDialog {
    private static final long a = -2157456089916125305L;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JLabel b;
    private JPanel a;
    private JPanel b;
    private JScrollPane a;
    private JLabel c;
    private JTextArea a;
    private JTextField a;
    private JTextField b;

    public CancelarNotaFiscalNaoCadastradaGUI(Frame parent, boolean modal) {
        super((Window)parent, modal);
        this.a();
        this.b();
        try {
            this.bindController((ViewItf)this);
        }
        catch (DSGEBaseException e) {
            this.showErrors(e);
        }
        this.setLocationRelativeTo(null);
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(44));
        this.c = new JLabel();
        this.a = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(15));
        this.a = new JScrollPane();
        this.a = new JTextArea();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(255));
        this.b = new JLabel();
        this.b = new JPanel();
        this.a = new JButton();
        this.b = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Cancelar NF-e n\u00e3o cadastrada no Software");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Cancelar NF-e n\u00e3o Cadastrada no Software", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setHorizontalAlignment(4);
        this.c.setFont(new Font("SansSerif", 1, 12));
        this.c.setText("* Chave de Acesso");
        this.a.setFont(new Font("SansSerif", 1, 12));
        this.a.setText("* N\u00famero do Protocolo");
        this.b.setHorizontalAlignment(4);
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(5);
        this.a.setWrapStyleWord(true);
        this.a.setViewportView(this.a);
        this.b.setFont(new Font("SansSerif", 1, 12));
        this.b.setText("* Justificativa");
        this.a.setText("Cancelar NF-e");
        this.a.setAutoscrolls(true);
        this.b.setText("Fechar");
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(26, 26, 26).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap(24, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b)));
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 471, 32767).addComponent(this.b, -1, 471, 32767).addComponent(this.a, -1, 471, 32767).addComponent(this.c, -2, 126, -2).addComponent(this.a).addComponent(this.b)).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 119, 32767).addComponent(this.b, -2, -1, -2).addContainerGap(112, 32767)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 152, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.b, -2, -1, -2).addContainerGap(18, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 505, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 347, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767)));
        this.pack();
    }

    private void b() {
        this.a.setActionCommand("ACTION_CANCELAR_NFE");
        this.b.setActionCommand("cancelar");
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public String getChave() {
        return StringHelper.isBlankOrNull((Object)this.a.getText()) ? null : this.a.getText();
    }

    public String getNrProtocolo() {
        return StringHelper.isBlankOrNull((Object)this.b.getText()) ? null : this.b.getText();
    }

    public String getJustificativa() {
        return StringHelper.isBlankOrNull((Object)this.a.getText()) ? null : this.a.getText();
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

