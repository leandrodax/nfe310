/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.HashMap;
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
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ProdutoExportacaoGUI
extends DSGEDialog {
    private static final long a = 7765556896677576662L;
    ProdutoNotaGUI a;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JPanel a;
    private JPanel b;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JTextField a;
    private JTextField b;
    private Map<String, JComponent[]> a;
    private String a;
    private String b;
    private ProdutoExportacaoTO a;

    public ProdutoExportacaoGUI(String operacao, String operacaoNota, ProdutoNotaGUI produtoNotaGUI) throws DSGEViewException {
        super((Window)produtoNotaGUI, true);
        this.a = produtoNotaGUI;
        this.setOperacao(operacao);
        this.setOperacaoNota(operacaoNota);
        this.a();
        this.c();
        this.b();
        this.setLocationRelativeTo(null);
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.a = new JPanel();
        this.e = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{11}", 11));
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.b = new JPanel();
        this.f = new JLabel();
        this.g = new JLabel();
        this.d = new JLabel();
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{12}", 12));
        this.b = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.b, (int)11, (int)4);
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{44}", 44));
        this.c = new JLabel();
        this.b = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Detalhe de Exporta\u00e7\u00e3o");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Exporta\u00e7\u00e3o", 2, 2, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText(" N\u00famero do ato concess\u00f3rio de Drawback");
        this.b.setHorizontalAlignment(4);
        this.b.setText("OK");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.b.setBorder(BorderFactory.createTitledBorder("Exporta\u00e7\u00e3o Indireta"));
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* N\u00famero Registro de Exporta\u00e7\u00e3o");
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("* Quantidade");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* Chave de Acesso");
        this.a.setHorizontalAlignment(4);
        this.b.setHorizontalAlignment(4);
        this.c.setFont(new Font("Dialog", 0, 10));
        this.c.setText("(1)");
        GroupLayout pnlDesembaraco1Layout = new GroupLayout(this.b);
        this.b.setLayout(pnlDesembaraco1Layout);
        pnlDesembaraco1Layout.setHorizontalGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDesembaraco1Layout.createSequentialGroup().addContainerGap().addGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDesembaraco1Layout.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 205, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b)).addGroup(pnlDesembaraco1Layout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 12, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a))).addContainerGap()));
        pnlDesembaraco1Layout.setVerticalGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDesembaraco1Layout.createSequentialGroup().addGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f, GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.g, GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.TRAILING, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, GroupLayout.Alignment.TRAILING).addGroup(GroupLayout.Alignment.TRAILING, pnlDesembaraco1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, -1, -2).addComponent(this.c)))));
        this.b.setFont(new Font("Dialog", 0, 10));
        this.b.setText("(1) No caso de opera\u00e7\u00e3o com CFOP 3.503, informar a chave de acesso da NF-e que efetivou a exporta\u00e7\u00e3o.");
        GroupLayout pnlDI1Layout = new GroupLayout(this.a);
        this.a.setLayout(pnlDI1Layout);
        pnlDI1Layout.setHorizontalGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDI1Layout.createSequentialGroup().addContainerGap().addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767).addGroup(pnlDI1Layout.createSequentialGroup().addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDI1Layout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 186, -2)).addGroup(pnlDI1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addGap(63, 63, 63).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b).addComponent(this.a)))).addGap(0, 0, 32767))).addContainerGap()));
        pnlDI1Layout.setVerticalGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDI1Layout.createSequentialGroup().addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.e, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDI1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(pnlDI1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a).addComponent(this.a)).addGap(102, 102, 102)).addGroup(pnlDI1Layout.createSequentialGroup().addGap(29, 29, 29).addComponent(this.b, -2, 29, -2).addContainerGap(-1, 32767)))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 180, 32767));
        this.pack();
    }

    public void firePropertyChange(String propertyName, ProdutoExportacaoTO exportTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)exportTO);
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public String getOperacao() {
        return this.a;
    }

    public void setOperacao(String operacao) {
        this.a = operacao;
    }

    public String getOperacaoNota() {
        return this.b;
    }

    public void setOperacaoNota(String operacaoNota) {
        this.b = operacaoNota;
    }

    public ProdutoExportacaoTO getProdutoExportacaoTO() {
        if (this.a == null) {
            this.a = new ProdutoExportacaoTO();
        }
        this.a.setNDraw(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        this.a.setChNFe(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setNRE(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setQExport(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        return this.a;
    }

    public void setProdutoExportacaoTO(ProdutoExportacaoTO prodExportTO) throws DSGEUtilException {
        this.a = prodExportTO;
        if (prodExportTO != null) {
            this.b.setText(prodExportTO.getNDraw());
            this.a.setText(prodExportTO.getChNFe());
            this.a.setText(prodExportTO.getNRE());
            this.b.setText(prodExportTO.getQExport());
        }
    }

    private void b() {
        this.a = new HashMap();
        this.a.put("EXPORT_TODOS", new JComponent[]{this.b, this.a, this.a, this.b, this.b});
    }

    private void c() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    public ProdutoNotaGUI getProdutoNotaGUI() {
        return this.a;
    }
}

