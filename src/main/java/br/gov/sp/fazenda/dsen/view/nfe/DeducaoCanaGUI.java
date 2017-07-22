/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DeducaoTO
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.DeducaoCanaGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.DeducaoTO;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
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
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.NumberFormatter;

public class DeducaoCanaGUI
extends DSGEDialog
implements ActionListener,
WindowListener {
    private static final long a = 3719165100969320929L;
    private DeducaoTO a;
    private Map<String, JComponent[]> a;
    private String a;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JPanel a;
    private JTextArea a;
    private JLabel b;
    private JLabel c;
    private JFormattedTextField a;

    public DeducaoCanaGUI(DigitarNotaFiscalGUI digitarNotaGUI, DeducaoTO deducaoTO) {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = digitarNotaGUI.getOperacao();
        this.b();
        this.c();
        this.a();
        this.addActionListener((EventListener)this);
        this.updateGUI(deducaoTO);
        this.setLocationRelativeTo(null);
        this.addWindowListener((WindowListener)this);
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    public void updateGUI(DeducaoTO deducaoTO) {
        if (deducaoTO == null) {
            deducaoTO = new DeducaoTO();
        }
        this.a = deducaoTO;
        this.a.setText(deducaoTO.getXDed());
        if (deducaoTO.getVDed() != null) {
            NumberFormatter formatter1302 = NumberFormatterHelper.getFormatter1302();
            try {
                this.a.setText(formatter1302.valueToString(deducaoTO.getVDed()));
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
        if ("manterNotaOperacaoDetalhe".equals(this.a)) {
            this.disableComponents("CAMPOS_DEDUCAO_CANA");
        } else {
            this.a.requestFocus();
        }
    }

    public void updateTO() {
        this.a.setXDed(this.a.getText());
        this.a.setVDed(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? new BigDecimal(StringHelper.formataValorXML((String)this.a.getText())) : null);
    }

    private void b() {
        this.a = new JPanel();
        this.c = new JLabel();
        this.a = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.a, (int)13, (int)2);
        this.b = new JLabel();
        this.a = new JTextArea();
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(0);
        this.setTitle("Dedu\u00e7\u00e3o");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Dedu\u00e7\u00e3o", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Valor");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Descri\u00e7\u00e3o");
        this.a.setColumns(20);
        this.a.setLineWrap(true);
        this.a.setRows(5);
        this.a.setWrapStyleWord(true);
        this.a.setBorder(BorderFactory.createLineBorder(UIManager.getDefaults().getColor("Button.disabledText")));
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio. ");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 436, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 232, -2)).addComponent(this.b).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 123, 32767).addComponent(this.a))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap()).addComponent(this.a))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, -1, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("CAMPOS_DEDUCAO_CANA", new JComponent[]{this.b, this.a, this.a});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            this.updateTO();
            if (this.a.getVDed() == null || this.a.getXDed() == null) {
                this.showMessage("Informe os valores da Dedu\u00e7\u00e3o");
            } else {
                this.fechar();
            }
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

    public DeducaoTO getDeducaoTO() {
        return this.a;
    }
}

