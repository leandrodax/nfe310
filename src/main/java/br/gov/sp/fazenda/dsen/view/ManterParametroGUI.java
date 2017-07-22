/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTOList
 *  br.gov.sp.fazenda.dsen.controller.ParametroController
 *  br.gov.sp.fazenda.dsen.view.ManterParametroGUI
 *  br.gov.sp.fazenda.dsen.view.ManterParametroGUI$1
 *  br.gov.sp.fazenda.dsen.view.ManterParametroGUI$2
 *  br.gov.sp.fazenda.dsen.view.ManterParametroGUI$3
 *  br.gov.sp.fazenda.dsen.view.ManterParametroGUI$4
 *  br.gov.sp.fazenda.dsen.view.ManterParametroGUI$5
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocument
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTOList;
import br.gov.sp.fazenda.dsen.controller.ParametroController;
import br.gov.sp.fazenda.dsen.view.ManterParametroGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocument;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
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
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ManterParametroGUI
extends DSGESimplePanel {
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JCheckBox a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JLabel j;
    private JLabel k;
    private JLabel l;
    private JPanel a;
    private JPanel b;
    private JPanel c;
    private JTextField a;
    private JTextField b;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JPasswordField a;
    private JTextField c;
    private JTextField d;
    private HashMap a;
    private ParametroController a;
    private String a;
    private ParametroTOList a;

    public ManterParametroGUI() {
        this.d();
        this.a = "detailParametro";
        this.a();
        this.b();
        this.c();
        this.a = new ParametroController((ViewItf)this);
        this.a.actionPerformed(new ActionEvent((Object)this, 1, "detalhar"));
        this.a.setVisible(false);
    }

    public ManterParametroGUI(String operacao) {
        this.d();
        this.a = operacao;
        this.a();
        this.b();
        this.c();
        this.a = new ParametroController((ViewItf)this);
    }

    private void a() {
        this.a = new HashMap();
        this.a.put("detailParametro", new JComponent[]{this.c, this.d, this.d, this.a, this.a, this.b, this.c, this.a, this.b, this.c});
        this.a.put("updateParametro", new JComponent[]{this.c, this.d, this.d, this.a, this.a, this.b, this.c, this.a, this.b, this.c, this.a});
    }

    private void b() {
        this.a.setActionCommand("editar");
        this.d.setActionCommand("voltar");
        this.b.setActionCommand("SELECIONAR_DIR_AUTORIZADOS");
        this.c.setActionCommand("SELECIONAR_DIR_GERADOS");
    }

    private void c() {
    }

    private void d() {
        this.c = new JPanel();
        this.k = new JLabel();
        this.i = new JLabel();
        this.l = new JLabel();
        this.j = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(255));
        this.d = new JTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(255));
        this.d = new JFormattedTextField();
        this.d.setDocument((Document)new NumberDocument());
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(5));
        this.a = new JPasswordField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(255));
        this.b = new JPanel();
        this.g = new JLabel();
        this.f = new JLabel();
        this.h = new JLabel();
        this.a = new JCheckBox();
        this.b = new JFormattedTextField();
        this.b.setDocument((Document)new NumberDocument());
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.a = new JFormattedTextField();
        this.a.setDocument((Document)new NumberDocument());
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.c = new JFormattedTextField();
        this.c.setDocument((Document)new NumberDocument());
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(5));
        this.a = new JLabel();
        this.b = new JLabel();
        this.d = new JButton();
        this.a = new JButton();
        this.c = new JLabel();
        this.a = new JPanel();
        this.e = new JLabel();
        this.d = new JLabel();
        this.b = new JTextField();
        this.a = new JTextField();
        this.c = new JButton();
        this.b = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Par\u00e2metros do Sistema", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.c.setBorder(BorderFactory.createTitledBorder(null, "Configura\u00e7\u00e3o de Acesso a Internet (opcional)", 1, 2));
        this.k.setFont(new Font("Dialog", 1, 11));
        this.k.setText("Servidor Proxy");
        this.i.setFont(new Font("Dialog", 1, 11));
        this.i.setText("Porta");
        this.l.setFont(new Font("Dialog", 1, 11));
        this.l.setText("Usu\u00e1rio");
        this.j.setFont(new Font("Dialog", 1, 11));
        this.j.setText("Senha");
        this.a.setText("jPasswordField1");
        GroupLayout pnlProxyLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlProxyLayout);
        pnlProxyLayout.setHorizontalGroup(pnlProxyLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProxyLayout.createSequentialGroup().addContainerGap().addGroup(pnlProxyLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.l).addComponent(this.k)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProxyLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProxyLayout.createSequentialGroup().addComponent(this.c, -1, 267, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 74, -2)).addGroup(pnlProxyLayout.createSequentialGroup().addComponent(this.d, -1, 180, 32767).addGap(26, 26, 26).addComponent(this.j).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 144, -2))).addGap(144, 144, 144)));
        pnlProxyLayout.setVerticalGroup(pnlProxyLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProxyLayout.createSequentialGroup().addGroup(pnlProxyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.k).addComponent(this.c, -2, -1, -2).addComponent(this.i).addComponent(this.d, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProxyLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.l).addComponent(this.d, -2, -1, -2).addComponent(this.j).addComponent(this.a, -2, -1, -2)).addContainerGap(23, 32767)));
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Outras Configura\u00e7\u00f5es ", 1, 2));
        this.g.setFont(new Font("Dialog", 1, 11));
        this.g.setText("* Intervalo entre tentativas de transmiss\u00e3o");
        this.f.setFont(new Font("Dialog", 1, 11));
        this.f.setText("* Intervalo entre consultas de processamentos pendentes");
        this.h.setFont(new Font("Dialog", 1, 11));
        this.h.setText("* N\u00famero de registros por p\u00e1gina de consulta");
        this.a.setFont(new Font("Dialog", 1, 11));
        this.a.setText("Aviso de inutiliza\u00e7\u00e3o apenas mensal");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setFont(new Font("Dialog", 1, 11));
        this.a.setText("segundos");
        this.b.setFont(new Font("Dialog", 1, 11));
        this.b.setText("segundos");
        GroupLayout pnlNegocioLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlNegocioLayout);
        pnlNegocioLayout.setHorizontalGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlNegocioLayout.createSequentialGroup().addContainerGap().addGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(pnlNegocioLayout.createSequentialGroup().addGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.h).addComponent(this.f).addComponent(this.g)).addGap(14, 14, 14).addGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.c).addComponent(this.a).addComponent(this.b, -1, 65, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.a))).addComponent(this.a)).addGap(170, 170, 170)));
        pnlNegocioLayout.setVerticalGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlNegocioLayout.createSequentialGroup().addGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g).addComponent(this.b, -2, -1, -2).addComponent(this.a)).addGap(6, 6, 6).addGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.a, -2, -1, -2).addComponent(this.b)).addGap(9, 9, 9).addGroup(pnlNegocioLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.c, -2, -1, -2)).addGap(11, 11, 11).addComponent(this.a).addContainerGap(28, 32767)));
        this.d.setText("Fechar");
        this.a.setText("Editar");
        this.c.setFont(new Font("Dialog", 0, 10));
        this.c.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.a.setBorder(BorderFactory.createTitledBorder("Configura\u00e7\u00f5es de Diret\u00f3rios para DPEC"));
        this.e.setFont(new Font("Dialog", 1, 11));
        this.e.setText("Diret\u00f3rio de lotes gerados");
        this.d.setFont(new Font("Dialog", 1, 11));
        this.d.setText("Diret\u00f3rio de lotes autorizados");
        this.b.setEditable(false);
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setEditable(false);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.c.setText("...");
        this.c.setMargin(new Insets(2, 8, 2, 8));
        this.c.setMaximumSize(new Dimension(43, 20));
        this.c.setMinimumSize(new Dimension(43, 20));
        this.c.setPreferredSize(new Dimension(31, 20));
        this.c.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setText("...");
        this.b.setMargin(new Insets(2, 8, 2, 8));
        this.b.setMaximumSize(new Dimension(43, 20));
        this.b.setMinimumSize(new Dimension(43, 20));
        this.b.setPreferredSize(new Dimension(31, 20));
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout pnlDirsDPECLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlDirsDPECLayout);
        pnlDirsDPECLayout.setHorizontalGroup(pnlDirsDPECLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDirsDPECLayout.createSequentialGroup().addContainerGap().addGroup(pnlDirsDPECLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e).addComponent(this.d)).addGap(20, 20, 20).addGroup(pnlDirsDPECLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 391, 32767).addComponent(this.b, -1, 391, 32767)).addGap(10, 10, 10).addGroup(pnlDirsDPECLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, -2, 31, -2).addComponent(this.b, -2, 31, -2)).addContainerGap()));
        pnlDirsDPECLayout.setVerticalGroup(pnlDirsDPECLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDirsDPECLayout.createSequentialGroup().addContainerGap().addGroup(pnlDirsDPECLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.c, -2, -1, -2).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDirsDPECLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.b, -2, -1, -2).addComponent(this.a, -2, -1, -2)).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, -1, -1, 32767).addComponent(this.a, -1, -1, 32767).addComponent(this.b, GroupLayout.Alignment.TRAILING, -1, 655, 32767).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, 80, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d)).addComponent(this.c, GroupLayout.Alignment.TRAILING)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.c, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.a))).addGroup(layout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.c))).addContainerGap(-1, 32767)));
    }

    private void a(ActionEvent evt) {
    }

    private void b(ActionEvent evt) {
    }

    private void c(ActionEvent evt) {
    }

    private void d(ActionEvent evt) {
    }

    private void e(ActionEvent evt) {
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
    }

    public Map getMapComponents() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public List<ParametroTO> getParametroTOList() {
        if (this.a == null) {
            this.a = new ParametroTOList();
        }
        this.a.clear();
        this.a.add((Object)new ParametroTO(ParametroEnum.PROXY_SERVIDOR, this.c.getText().trim()));
        this.a.add((Object)new ParametroTO(ParametroEnum.PROXY_PORTA, this.d.getText().trim()));
        this.a.add((Object)new ParametroTO(ParametroEnum.PROXY_USUARIO, this.d.getText().trim()));
        this.a.add((Object)new ParametroTO(ParametroEnum.PROXY_SENHA, this.a.getText().trim()));
        this.a.add((Object)new ParametroTO(ParametroEnum.INTERVALO_TRANSMISSAO, this.b.getText().trim()));
        this.a.add((Object)new ParametroTO(ParametroEnum.INTERVALO_CONSULTA, this.a.getText().trim()));
        this.a.add((Object)new ParametroTO(ParametroEnum.NUM_REGISTROS_PAGINA, this.c.getText().trim()));
        this.a.add((Object)new ParametroTO(ParametroEnum.DPEC_GERADO_DIR, this.b.getText().trim()));
        this.a.add((Object)new ParametroTO(ParametroEnum.DPEC_AUTORIZADO_DIR, this.a.getText().trim()));
        if (this.a.isSelected()) {
            this.a.add((Object)new ParametroTO(ParametroEnum.AVISO_INUTILIZACAO, "S"));
        } else {
            this.a.add((Object)new ParametroTO(ParametroEnum.AVISO_INUTILIZACAO, "N"));
        }
        return this.a;
    }

    public void setParametroTOList(ParametroTOList listaParametros) {
        this.a = listaParametros;
        if (listaParametros == null) {
            return;
        }
        this.c.setText(listaParametros.getValue(ParametroEnum.PROXY_SERVIDOR));
        this.d.setText(listaParametros.getValue(ParametroEnum.PROXY_PORTA));
        this.d.setText(listaParametros.getValue(ParametroEnum.PROXY_USUARIO));
        this.a.setText(listaParametros.getValue(ParametroEnum.PROXY_SENHA));
        this.b.setText(listaParametros.getValue(ParametroEnum.INTERVALO_TRANSMISSAO));
        this.a.setText(listaParametros.getValue(ParametroEnum.INTERVALO_CONSULTA));
        this.c.setText(listaParametros.getValue(ParametroEnum.NUM_REGISTROS_PAGINA));
        this.b.setText(listaParametros.getValue(ParametroEnum.DPEC_GERADO_DIR));
        this.a.setText(listaParametros.getValue(ParametroEnum.DPEC_AUTORIZADO_DIR));
        this.a.setSelected(listaParametros.getValue(ParametroEnum.AVISO_INUTILIZACAO).equals("S"));
    }

    public void setActionAlterar() {
        this.a.setActionCommand("alterar");
        this.a.setText("Alterar");
    }

    public void setActionEditar() {
        this.a.setActionCommand("editar");
        this.a.setText("Editar");
    }

    public void setDirLotesAutorizados(String dir) {
        this.a.setText(dir);
    }

    public void setDirLotesGerados(String dir) {
        this.b.setText(dir);
    }

    public void firePropertyChange(String property) {
        this.firePropertyChange(property, (Object)null, (Object)null);
    }

    public void itemStateChanged(ItemEvent e) {
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ void a(ManterParametroGUI x0, ActionEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void b(ManterParametroGUI x0, ActionEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ void c(ManterParametroGUI x0, ActionEvent x1) {
        x0.c(x1);
    }

    static /* synthetic */ void d(ManterParametroGUI x0, ActionEvent x1) {
        x0.d(x1);
    }

    static /* synthetic */ void e(ManterParametroGUI x0, ActionEvent x1) {
        x0.e(x1);
    }
}

