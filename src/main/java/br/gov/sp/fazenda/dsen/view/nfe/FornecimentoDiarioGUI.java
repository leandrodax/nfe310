/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.FornecimentoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.FornecimentoDiarioGUI
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.FornecimentoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
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
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
import javax.swing.text.NumberFormatter;

public class FornecimentoDiarioGUI
extends DSGEDialog
implements ActionListener,
WindowListener {
    private static final long a = -5010566060589952235L;
    private FornecimentoTO a;
    private Map<String, JComponent[]> a;
    private String a;
    private String b;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JPanel a;
    private JLabel b;
    private JLabel c;
    private JFormattedTextField a;
    private JTextField a;

    public FornecimentoDiarioGUI(DigitarNotaFiscalGUI digitarNotaGUI, FornecimentoTO fornecimentoTO, String mesAnoRef) {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = digitarNotaGUI.getOperacao();
        this.b = mesAnoRef;
        this.b();
        this.c();
        this.a();
        this.addActionListener((EventListener)this);
        this.updateGUI(fornecimentoTO);
        this.setLocationRelativeTo(null);
        this.addWindowListener((WindowListener)this);
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    public void updateGUI(FornecimentoTO fornecimentoTO) {
        if (fornecimentoTO == null) {
            fornecimentoTO = new FornecimentoTO();
        }
        this.a = fornecimentoTO;
        this.a.setText(fornecimentoTO.getDia());
        if (fornecimentoTO.getQtde() != null) {
            NumberFormatter formatter1110 = NumberFormatterHelper.getFormatter((int)10, (int)10, (int)11);
            try {
                this.a.setText(formatter1110.valueToString(fornecimentoTO.getQtde()));
            }
            catch (ParseException parseException) {
                // empty catch block
            }
        }
        if ("manterNotaOperacaoDetalhe".equals(this.a)) {
            this.disableComponents("CAMPOS_FORNECIMENTO_CANA");
        } else {
            this.a.requestFocus();
        }
    }

    public boolean updateTO() {
        if (!StringHelper.isBlankOrNull((Object)this.a.getText()) && !StringHelper.isBlankOrNull((Object)this.a.getText())) {
            Date d1 = DateHelper.getDate((String)("01/" + this.b), (SimpleDateFormat)DateHelper.DATE_FORMAT);
            Calendar c = Calendar.getInstance();
            c.setTime(d1);
            int maxDay = c.getActualMaximum(5);
            if (Integer.parseInt(this.a.getText()) <= 0) {
                this.showMessage(MessageFormat.format(DSENMessageConstants.MSG_CANA_DIA_INVALIDO, this.a.getText()));
                return false;
            }
            if (Integer.parseInt(this.a.getText()) > maxDay) {
                this.showMessage(MessageFormat.format(DSENMessageConstants.MSG_CANA_DIA_MES_INVALIDO, this.a.getText(), this.b));
                return false;
            }
        } else {
            this.showMessage(MessageFormat.format(DSENMessageConstants.MSG_PARA_INCLUIR_X_PREENCHA_CAMPOS_1_E_2, DSENLabelConstants.FORNECIMENTOS_DIARIOS, DSENLabelConstants.DIA, DSENLabelConstants.QUANTIDADE));
            return false;
        }
        this.a.setDia(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? StringHelper.completaComZerosAEsquerda((String)this.a.getText(), (int)2) : null);
        this.a.setQtde(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? new BigDecimal(StringHelper.formataValorXML((String)this.a.getText())) : null);
        return true;
    }

    private void b() {
        this.a = new JPanel();
        this.b = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 2));
        this.c = new JLabel();
        this.a = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.a, (int)11, (int)10);
        this.a = new JLabel();
        this.b = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(0);
        this.setTitle("Fornecimento");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Fornecimento", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Dia");
        this.a.setToolTipText("Nome");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Quantidade(KG)");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio. ");
        this.b.setText("Ok");
        this.a.setText("Fechar");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 34, -2).addGap(18, 18, 18).addComponent(this.c).addGap(3, 3, 3).addComponent(this.a, -1, 212, 32767).addContainerGap()).addComponent(this.a, GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(293, 32767)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, 32767).addComponent(this.a)).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap()))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, -1, -2));
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
        this.a.put("CAMPOS_FORNECIMENTO_CANA", new JComponent[]{this.b, this.a, this.a});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            if (this.updateTO()) {
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

    public FornecimentoTO getFornecimentoTO() {
        return this.a;
    }
}

