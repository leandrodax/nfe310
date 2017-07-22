/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.AutorizacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.AutorizacaoGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CPFFormatter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.AutorizacaoGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.CPFFormatter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
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

public class AutorizacaoGUI
extends DSGEDialog
implements FocusListener,
ItemListener {
    private static final long a = -5187490303847839520L;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private JLabel a;
    private JPanel a;
    private JLabel b;
    private JLabel c;
    private JPanel b;
    private JFormattedTextField a;
    private AutorizacaoTO a;
    private String a;
    private String b;
    private CNPJFormatter a;
    private CPFFormatter a;
    private Map<String, JComponent[]> a;

    public AutorizacaoGUI(String acao, String operacaoNota) throws DSGEViewException {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = acao;
        this.b = operacaoNota;
        this.setTitle("Autoriza\u00e7\u00e3o para obter XML");
        this.c();
        this.g();
        this.e();
        this.d();
        this.f();
        this.b();
        this.a();
        this.setLocationRelativeTo(null);
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.a.addFocusListener((FocusListener)this);
        this.a.addItemListener((ItemListener)this);
    }

    private void b() {
        for (TipoDocumentoEnum e : TipoDocumentoEnum.values()) {
            this.a.addItem(e);
        }
    }

    private void c() {
        try {
            this.a = new CNPJFormatter();
            this.a = new CPFFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
    }

    private void d() {
        this.a = new HashMap();
        this.a.put("autorizacaoTodos", new JComponent[]{this.a, this.a, this.b});
    }

    private void e() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void fechar() {
        this.setVisible(false);
        this.dispose();
    }

    private void f() {
        this.b.setActionCommand("ok");
    }

    private void a(AutorizacaoTO autorizacaoTO) throws DSGEUtilException {
        this.a.setSelectedIndex(-1);
        this.a.uninstall();
        this.a.uninstall();
        if (autorizacaoTO.getCPF() != null) {
            this.a.setSelectedItem((Object)TipoDocumentoEnum.CPF);
            this.a.setText(StringHelper.cpfFormat((String)autorizacaoTO.getCPF()));
        } else if (autorizacaoTO.getCNPJ() != null) {
            this.a.setSelectedItem((Object)TipoDocumentoEnum.CNPJ);
            this.a.setText(StringHelper.cnpjFormat((String)autorizacaoTO.getCNPJ()));
        } else {
            this.a.setSelectedIndex(-1);
            this.a.setText("");
        }
    }

    private void g() {
        this.a = new JPanel();
        this.b = new JPanel();
        this.c = new JLabel();
        this.a = new JComboBox();
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Documento", 2, 2, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.b.setBorder(BorderFactory.createTitledBorder(""));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Tipo de documento");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("CNPJ/CPF");
        this.a.setHorizontalAlignment(2);
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 68, -2).addGap(18, 18, 18).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 184, -2).addContainerGap(64, 32767)));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a, -2, -1, -2).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 217, 32767).addComponent(this.a))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a).addComponent(this.a)).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 94, -2));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void setAutorizacaoTO(AutorizacaoTO autorizacaoTO) throws DSGEUtilException {
        this.a = autorizacaoTO;
        if (autorizacaoTO != null) {
            this.a(autorizacaoTO);
        }
    }

    public AutorizacaoTO getAutorizacaoTO() {
        if (this.a != null) {
            if (this.a.getCNPJ() != null) {
                this.a.setCNPJ(null);
            }
            if (this.a.getCPF() != null) {
                this.a.setCPF(null);
            }
            try {
                TipoDocumentoEnum tipoDocumento = (TipoDocumentoEnum)this.a.getSelectedItem();
                String nrDocumento = this.a.getText().replaceAll("[_/-[ ][.]]", "");
                if (TipoDocumentoEnum.CNPJ.equals((Object)tipoDocumento)) {
                    this.a.setCNPJ(this.a.stringToValue(nrDocumento).toString());
                } else if (TipoDocumentoEnum.CPF.equals((Object)tipoDocumento)) {
                    this.a.setCPF(this.a.stringToValue(nrDocumento).toString());
                }
            }
            catch (ParseException tipoDocumento) {
                // empty catch block
            }
        }
        return this.a;
    }

    public void firePropertyChange(String propertyName, AutorizacaoTO autorizacaoTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)autorizacaoTO);
    }

    public String getAcao() {
        return this.a;
    }

    public String getOperacaoNota() {
        return this.b;
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        TipoDocumentoEnum tpDocumento;
        if (e.getSource() == this.a && (tpDocumento = (TipoDocumentoEnum)this.a.getSelectedItem()) != null && !StringHelper.isBlankOrNull((Object)this.a.getText())) {
            if (tpDocumento.equals((Object)TipoDocumentoEnum.CNPJ)) {
                try {
                    String cnpj = this.a.stringToValue(this.a.getText()).toString();
                    if (!StringHelper.isBlankOrNull((Object)cnpj)) {
                        cnpj = StringHelper.completaComZerosAEsquerda((String)cnpj, (int)14);
                    }
                    this.a.setText(cnpj);
                }
                catch (ParseException cnpj) {}
            } else {
                try {
                    String cpf = this.a.stringToValue(this.a.getText()).toString();
                    if (!StringHelper.isBlankOrNull((Object)cpf)) {
                        cpf = StringHelper.completaComZerosAEsquerda((String)cpf, (int)11);
                    }
                    this.a.setText(cpf);
                }
                catch (ParseException cpf) {
                    // empty catch block
                }
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.a) {
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.a.getSelectedItem();
            this.a.setText("");
            if (tpDocumento == null) {
                this.a.uninstall();
                this.a.uninstall();
                this.a.setEnabled(false);
                this.b.setText((Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
                this.a.setText("");
            } else if (tpDocumento != null && e.getStateChange() == 1) {
                if (tpDocumento.equals((Object)TipoDocumentoEnum.CPF)) {
                    if (!this.b.equals("manterNotaOperacaoDetalhe")) {
                        this.a.setEnabled(true);
                    }
                    this.b.setText("* " + (Object)TipoDocumentoEnum.CPF);
                    this.a.uninstall();
                    this.a.uninstall();
                    this.a.install(this.a);
                } else {
                    if (!this.b.equals("manterNotaOperacaoDetalhe")) {
                        this.a.setEnabled(true);
                    }
                    this.b.setText("* " + TipoDocumentoEnum.CNPJ.toString());
                    this.a.uninstall();
                    this.a.uninstall();
                    this.a.install(this.a);
                }
            }
        }
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

