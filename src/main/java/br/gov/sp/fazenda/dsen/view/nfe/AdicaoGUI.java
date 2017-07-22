/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.AdicaoTO
 *  br.gov.sp.fazenda.dsen.view.nfe.AdicaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.AdicaoTO;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.BigDecimal;
import java.text.ParseException;
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

public class AdicaoGUI
extends DSGEDialog
implements ActionListener,
WindowListener {
    private static final long a = -339153294488159865L;
    private AdicaoTO a;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JPanel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JFormattedTextField a;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private Map<String, JComponent[]> a;
    private String a;

    public AdicaoGUI(ProdutoDeclaracaoImportacaoGUI diGUI, AdicaoTO adicaoTO) {
        super((Window)diGUI, true);
        this.a = diGUI.getOperacaoNota();
        this.b();
        this.c();
        this.a();
        this.addActionListener((EventListener)this);
        this.updateGUI(adicaoTO);
        this.setLocationRelativeTo(null);
        this.addWindowListener((WindowListener)this);
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    public void updateGUI(AdicaoTO adicaoTO) {
        if (adicaoTO == null) {
            adicaoTO = new AdicaoTO();
        }
        this.a = adicaoTO;
        this.b.setText(adicaoTO.getNAdicao());
        this.a.setText(adicaoTO.getCFabricante());
        this.c.setText(adicaoTO.getNDraw());
        if (!StringHelper.isBlankOrNull((Object)adicaoTO.getVDescDI())) {
            try {
                this.a.setText(NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(adicaoTO.getVDescDI())));
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
        if ("manterNotaOperacaoDetalhe".equals(this.a)) {
            this.disableComponents("CAMPOS_ADICAO_DI");
        } else {
            this.b.requestFocus();
        }
    }

    public void updateTO() {
        this.a.setCFabricante(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setNAdicao(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        this.a.setVDescDI(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? StringHelper.formataValorXML((String)this.a.getText()) : null);
        this.a.setNDraw(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText() : null);
    }

    public AdicaoTO getAdicaoTO() {
        return this.a;
    }

    private void b() {
        this.a = new JPanel();
        this.c = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[1-9]{1}[0-9]{0,2}"));
        this.b = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.e = new JLabel();
        this.a = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.a, (int)13, (int)2);
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.d = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{11}", 11));
        this.setDefaultCloseOperation(0);
        this.setTitle("Adi\u00e7\u00e3o");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Adi\u00e7\u00e3o", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* N\u00famero");
        this.b.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* C\u00f3d. Fabricante");
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("Desconto");
        this.a.setHorizontalAlignment(4);
        this.b.setText("OK");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText(" N\u00famero do ato concess\u00f3rio de Drawback");
        this.c.setHorizontalAlignment(4);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.a)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 97, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 385, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 182, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c))).addContainerGap()))));
        jPanel1Layout.linkSize(0, this.b, this.c, this.e);
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, GroupLayout.Alignment.TRAILING, -2, -1, -2).addComponent(this.d, GroupLayout.Alignment.TRAILING)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap()).addComponent(this.a, GroupLayout.Alignment.TRAILING))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addGap(0, 0, 32767)));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("CAMPOS_ADICAO_DI", new JComponent[]{this.b, this.a, this.a, this.b});
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            this.updateTO();
            this.fechar();
        } else if ("fechar".equals(e.getActionCommand())) {
            this.a = null;
            this.fechar();
        }
    }

    public void fechar() {
        this.setVisible(false);
        this.dispose();
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.a = null;
        this.fechar();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }
}

