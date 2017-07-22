/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf$Enum
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.nfe.EnderecoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.EnderecoGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CPFFormatter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUf;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.nfe.EnderecoGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.CPFFormatter;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
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
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class EnderecoGUI
extends DSGEDialog
implements FocusListener,
ItemListener {
    private static final long a = -5187490303847839520L;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private JComboBox b;
    private JComboBox c;
    private JLabel a;
    private JPanel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JLabel i;
    private JPanel b;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private TLocal a;
    private String a;
    private String b;
    private CNPJFormatter a;
    private CPFFormatter a;
    private Map<String, JComponent[]> a;

    public EnderecoGUI(String acao, String operacaoNota, String titulo) throws DSGEViewException {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = acao;
        this.b = operacaoNota;
        this.setTitle(titulo);
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
        this.b.addItemListener((ItemListener)this);
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
        this.a.put("enderecoTodos", new JComponent[]{this.a, this.a, this.c, this.b, this.b, this.a, this.b, this.c, this.b});
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
        this.b.setActionCommand("estado");
    }

    private void a(TLocal endereco) throws DSGEUtilException {
        this.a.setSelectedIndex(-1);
        this.a.uninstall();
        this.a.uninstall();
        if (endereco.getUF() != null && "99".equals(endereco.getUF().toString())) {
            this.a.setSelectedIndex(-1);
            this.a.setText("");
        } else if (endereco.getCPF() != null) {
            this.a.setSelectedItem((Object)TipoDocumentoEnum.CPF);
            this.a.setText(StringHelper.cpfFormat((String)endereco.getCPF()));
        } else if (endereco.getCNPJ() != null) {
            this.a.setSelectedItem((Object)TipoDocumentoEnum.CNPJ);
            this.a.setText(StringHelper.cnpjFormat((String)endereco.getCNPJ()));
        } else {
            this.a.setSelectedIndex(-1);
            this.a.setText("");
        }
        this.c.setText(endereco.getXLgr());
        this.b.setText(endereco.getNro());
        this.b.setText(endereco.getXCpl());
        this.a.setText(endereco.getXBairro());
        DSENUtilHelper helper = DSENUtilHelper.getInstance();
        EstadoTO estadoTO = endereco.getUF() != null ? helper.getSiglaEstadoTO(endereco.getUF().toString()) : null;
        MunicipioTO municipioTO = null;
        try {
            municipioTO = endereco.getCMun() != null ? helper.getMunicipioTO(endereco.getCMun()) : null;
        }
        catch (NumberFormatException numberFormatException) {
        }
        catch (DSGEUtilException ex) {
            this.showErrors((DSGEBaseException)ex);
        }
        this.b.setSelectedItem((Object)estadoTO);
        this.c.setSelectedItem((Object)municipioTO);
    }

    private void g() {
        this.a = new JPanel();
        this.b = new JPanel();
        this.h = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.c = new JLabel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.g = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.f = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.e = new JLabel();
        this.b = new JComboBox();
        this.i = new JLabel();
        this.c = new JComboBox();
        this.d = new JLabel();
        this.a = new JComboBox();
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Endere\u00e7o", 2, 2, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.b.setBorder(BorderFactory.createTitledBorder(""));
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("* Logradouro");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* N\u00famero");
        this.b.setHorizontalAlignment(4);
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("Complemento");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* Bairro");
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* UF");
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("* Munic\u00edpio");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* Tipo de documento");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("CNPJ/CPF");
        this.a.setHorizontalAlignment(2);
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 68, -2).addGap(18, 18, 18).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 184, -2)).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.h).addComponent(this.c).addComponent(this.f).addComponent(this.e)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.b, -1, 72, 32767).addGap(18, 18, 18).addComponent(this.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, 239, 32767)).addComponent(this.c, -1, 412, 32767).addComponent(this.a, -1, 412, 32767).addGroup(pnlPrincipalLayout.createSequentialGroup().addComponent(this.b, -2, 72, -2).addGap(18, 18, 18).addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, 0, 255, 32767))))).addContainerGap()));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.a, -2, -1, -2).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.c, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b, -2, -1, -2).addComponent(this.g).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.b, -2, -1, -2).addComponent(this.i).addComponent(this.c, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 217, 32767).addComponent(this.a))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a).addComponent(this.a)).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.b.addItemListener((ItemListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void setEndereco(TLocal endereco) throws DSGEUtilException {
        this.a = endereco;
        if (endereco != null) {
            this.a(endereco);
        }
    }

    public TLocal getEndereco() {
        EstadoTO uf = (EstadoTO)this.b.getSelectedItem();
        if (this.a != null) {
            if (this.a.getCNPJ() != null) {
                this.a.unsetCNPJ();
            }
            if (this.a.getCPF() != null) {
                this.a.unsetCPF();
            }
            try {
                TipoDocumentoEnum tipoDocumento = (TipoDocumentoEnum)this.a.getSelectedItem();
                String nrDocumento = this.a.getText().replaceAll("[_/-[ ][.]]", "");
                if (TipoDocumentoEnum.CNPJ.equals((Object)tipoDocumento)) {
                    this.a.setCNPJ(this.a.stringToValue(nrDocumento).toString());
                } else if (TipoDocumentoEnum.CPF.equals((Object)tipoDocumento)) {
                    this.a.setCPF(this.a.stringToValue(nrDocumento).toString());
                } else if (uf != null && "EX".equals(uf.getSigla())) {
                    this.a.setCNPJ("");
                }
            }
            catch (ParseException tipoDocumento) {
                // empty catch block
            }
            MunicipioTO municipio = (MunicipioTO)this.c.getSelectedItem();
            this.a.setXLgr(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText().trim() : null);
            this.a.setNro(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText().trim() : null);
            this.a.setXBairro(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText().trim() : null);
            this.a.setUF(uf != null ? TUf.Enum.forString((String)uf.getSigla()) : null);
            this.a.setXMun(municipio != null ? municipio.getNome() : null);
            this.a.setCMun(municipio != null ? municipio.getCodigo().toString() : null);
            if (!StringHelper.isBlankOrNull((Object)this.b.getText())) {
                this.a.setXCpl(this.b.getText().trim());
            } else if (this.a.getXCpl() != null) {
                this.a.unsetXCpl();
            }
        }
        return this.a;
    }

    public void setListaUF(List<EstadoTO> listaUF) {
        this.b.removeAllItems();
        if (listaUF != null) {
            for (int i = 0; i < listaUF.size(); ++i) {
                this.b.addItem(listaUF.get(i));
            }
        }
        this.b.setSelectedIndex(-1);
    }

    public void setListaMunicipio(List<MunicipioTO> listaMunicipio) {
        this.c.removeAllItems();
        if (listaMunicipio != null) {
            for (int i = 0; i < listaMunicipio.size(); ++i) {
                this.c.addItem(listaMunicipio.get(i));
            }
        }
        this.c.setSelectedIndex(-1);
    }

    public void firePropertyChange(String propertyName, TLocal endereco) {
        this.firePropertyChange(propertyName, (Object)null, (Object)endereco);
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
        if (e.getSource() == this.b) {
            EstadoTO estado = (EstadoTO)this.b.getSelectedItem();
            if (estado != null && "EX".equals(estado.getSigla())) {
                this.a.setSelectedIndex(-1);
                this.a.setText(null);
                this.a.setEnabled(false);
                this.a.setEnabled(false);
            } else if (!this.b.equals("manterNotaOperacaoDetalhe")) {
                this.a.setEnabled(true);
                this.a.setEnabled(true);
            }
        } else if (e.getSource() == this.a) {
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

