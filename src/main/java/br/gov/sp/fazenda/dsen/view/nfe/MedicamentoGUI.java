/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.MedicamentoNotaTO
 *  br.gov.sp.fazenda.dsen.view.nfe.MedicamentoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.DateFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.MedicamentoNotaTO;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.DateFormatter;
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

public class MedicamentoGUI
extends DSGEDialog
implements ActionListener,
WindowListener {
    private static final long a = 5335636511343979839L;
    private MedicamentoNotaTO a;
    private Map<String, JComponent[]> a;
    private String a;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JPanel a;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JTextField a;
    private DateFormatter a;
    private DateFormatter b;

    public MedicamentoGUI(ProdutoNotaGUI produtoNotaGUI, MedicamentoNotaTO medicamentoTO) {
        super((Window)produtoNotaGUI, true);
        this.b();
        this.a = produtoNotaGUI.getOperacaoNota();
        this.d();
        this.e();
        this.a();
        this.addActionListener((EventListener)this);
        this.a(medicamentoTO);
        this.setLocationRelativeTo(null);
        this.addWindowListener((WindowListener)this);
    }

    private void a() {
        this.b.setActionCommand("ok");
        this.a.setActionCommand("fechar");
    }

    private void b() {
        try {
            this.a = new DateFormatter();
            this.b = new DateFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
    }

    private void a(MedicamentoNotaTO medicamentoTO) {
        if (medicamentoTO == null) {
            medicamentoTO = new MedicamentoNotaTO();
        }
        this.a = medicamentoTO;
        this.a.setText(medicamentoTO.getNLote());
        if (medicamentoTO.getQLote() != null) {
            try {
                this.c.setText(NumberFormatterHelper.getFormatter0803().valueToString(new BigDecimal(medicamentoTO.getQLote())));
            }
            catch (ParseException e) {
                this.showErrors((Throwable)e);
            }
        }
        if (medicamentoTO.getDFab() != null) {
            this.a.setText(DateHelper.formataData((Date)medicamentoTO.getDFab().getTime()));
        }
        if (medicamentoTO.getDVal() != null) {
            this.b.setText(DateHelper.formataData((Date)medicamentoTO.getDVal().getTime()));
        }
        if (medicamentoTO.getVPMC() != null) {
            try {
                this.d.setText(NumberFormatterHelper.getFormatter1302().valueToString(new BigDecimal(medicamentoTO.getVPMC())));
            }
            catch (ParseException ex) {
                this.showErrors((Throwable)ex);
            }
        }
        if ("manterNotaOperacaoDetalhe".equals(this.a)) {
            this.disableComponents("CAMPOS_MEDICAMENTO");
        } else {
            this.a.requestFocus();
        }
    }

    private void c() {
        if (!StringHelper.isBlankOrNull((Object)this.a.getText().replaceAll("\\D", ""))) {
            Date dFab = DateHelper.getDate((String)this.a.getText());
            this.a.setDFab(DateHelper.formataCalendar((Date)dFab));
        } else {
            this.a.setDFab(null);
        }
        if (!StringHelper.isBlankOrNull((Object)this.b.getText().replaceAll("\\D", ""))) {
            Date dVal = DateHelper.getDate((String)this.b.getText());
            this.a.setDVal(DateHelper.formataCalendar((Date)dVal));
        } else {
            this.a.setDVal(null);
        }
        this.a.setNLote(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setQLote(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? StringHelper.formataValorXML((String)this.c.getText()) : null);
        this.a.setVPMC(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? StringHelper.formataValorXML((String)this.d.getText()) : null);
    }

    public MedicamentoNotaTO getMedicamentoTO() {
        return this.a;
    }

    private void d() {
        this.a = new JPanel();
        this.d = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 20));
        this.e = new JLabel();
        this.c = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.c, (int)8, (int)3);
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.c = new JLabel();
        this.b = new JFormattedTextField();
        this.b.install(this.b);
        this.f = new JLabel();
        this.d = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.d, (int)13, (int)2);
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(0);
        this.setTitle("Medicamento/Mat\u00e9ria-prima Farmac\u00eautica");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Medicamento/Mat\u00e9ria-prima Farmac\u00eautica", 2, 2, new Font("Dialog", 1, 14), Color.blue));
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* N\u00famero do Lote");
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* Quantidade no Lote");
        this.c.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* Data de Fabrica\u00e7\u00e3o");
        this.a.setHorizontalAlignment(4);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Data de Validade");
        this.b.setHorizontalAlignment(4);
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* Pre\u00e7o M\u00e1x. Consumidor");
        this.d.setHorizontalAlignment(4);
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio. ");
        GroupLayout pnlMedicamento1Layout = new GroupLayout(this.a);
        this.a.setLayout(pnlMedicamento1Layout);
        pnlMedicamento1Layout.setHorizontalGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlMedicamento1Layout.createSequentialGroup().addContainerGap().addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlMedicamento1Layout.createSequentialGroup().addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.a, -2, 135, -2).addComponent(this.a, -2, 135, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.c, -1, -1, 32767).addComponent(this.e, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b).addComponent(this.c, -1, 118, 32767))).addGroup(pnlMedicamento1Layout.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 153, -2)).addGroup(pnlMedicamento1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 260, 32767).addComponent(this.a)))));
        pnlMedicamento1Layout.linkSize(0, this.b, this.d);
        pnlMedicamento1Layout.linkSize(0, this.c, this.e);
        pnlMedicamento1Layout.linkSize(0, this.b, this.c);
        pnlMedicamento1Layout.linkSize(0, this.a, this.a);
        pnlMedicamento1Layout.setVerticalGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlMedicamento1Layout.createSequentialGroup().addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.a, -2, -1, -2).addComponent(this.e).addComponent(this.c, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2).addComponent(this.b, -2, -1, -2).addComponent(this.c)).addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlMedicamento1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.d, -2, -1, -2)).addGap(18, 18, 18).addGroup(pnlMedicamento1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(-1, 32767)).addGroup(pnlMedicamento1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }

    private void e() {
        this.a = new HashMap();
        this.a.put("CAMPOS_MEDICAMENTO", new JComponent[]{this.b, this.a, this.b, this.c, this.d, this.a});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            this.c();
            if (this.a.getNLote() == null || this.a.getQLote() == null || this.a.getDFab() == null || this.a.getDVal() == null || this.a.getVPMC() == null) {
                this.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
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
}

