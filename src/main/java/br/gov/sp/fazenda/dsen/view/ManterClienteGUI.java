/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$1
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$2
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$3
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$4
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$5
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$6
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$7
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$8
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI$9
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CEPFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CPFFormatter
 *  br.gov.sp.fazenda.dsge.view.format.PhoneFormatter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.ManterClienteGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CEPFormatter;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.CPFFormatter;
import br.gov.sp.fazenda.dsge.view.format.PhoneFormatter;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ManterClienteGUI
extends DSGESimplePanel
implements FocusListener,
ItemListener {
    private static final long a = 4704144586647202910L;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JCheckBox a;
    private JComboBox a;
    private JComboBox b;
    private JComboBox c;
    private JComboBox d;
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
    private JLabel m;
    private JLabel n;
    private JLabel o;
    private JLabel p;
    private JPanel a;
    private JPanel b;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JFormattedTextField f;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JTextField d;
    private JTextField e;
    private Map<String, JComponent[]> a;
    private String a;
    private ClienteTO a;
    private CNPJFormatter a;
    private CPFFormatter a;
    private CEPFormatter a;
    private PhoneFormatter a;

    public ManterClienteGUI() throws DSGEViewException {
        try {
            this.a = new CNPJFormatter();
            this.a = new CPFFormatter();
            this.a = new CEPFormatter();
            this.a = new PhoneFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        this.d();
        this.a();
        this.b();
        this.c();
        this.bindController((ViewItf)this);
        this.b.setVisible(true);
    }

    private void a() {
        this.a = new HashMap();
        this.a.put("insertCliente", new JComponent[]{this.a, this.c, this.d});
        this.a.put("detailCliente", new JComponent[]{this.c, this.c, this.e, this.b, this.a, this.e, this.d, this.d, this.b, this.a, this.c, this.a, this.f, this.b, this.d, this.a, this.e});
        this.a.put("updateClienteEnable", new JComponent[]{this.c, this.c, this.e, this.b, this.e, this.d, this.a, this.d, this.b, this.a, this.c, this.a, this.b, this.d, this.a, this.f});
        this.a.put("updateClienteDisable", new JComponent[]{this.c, this.d});
    }

    private void b() {
        this.a.setActionCommand("editar");
        this.c.setActionCommand("excluir");
        this.d.setActionCommand("exportar");
        this.e.setActionCommand("incluir");
        this.f.setActionCommand("voltar");
        this.b.setActionCommand("pais");
        this.d.setActionCommand("estado");
        this.b.setActionCommand("consultarNFe");
    }

    private void c() {
        this.c.addFocusListener((FocusListener)this);
        this.e.addFocusListener((FocusListener)this);
        this.b.addFocusListener((FocusListener)this);
        this.c.addItemListener((ItemListener)this);
        this.b.addItemListener((ItemListener)this);
    }

    private void d() {
        this.a = new JPanel();
        this.o = new JLabel();
        this.c = new JComboBox();
        this.j = new JLabel();
        this.c = new JFormattedTextField();
        this.a.install(this.c);
        this.i = new JLabel();
        this.e = new JTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.f = new JLabel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}|[pP]{1}[rR]{1}[0-9]{1,8}", 14));
        this.m = new JLabel();
        this.e = new JFormattedTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{8,9}", 9));
        this.a = new JCheckBox();
        this.e = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.b = new JPanel();
        this.g = new JLabel();
        this.d = new JTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.k = new JLabel();
        this.d = new JFormattedTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 9));
        this.d = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.b = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.c = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.l = new JLabel();
        this.b = new JComboBox();
        this.p = new JLabel();
        this.d = new JComboBox();
        this.h = new JLabel();
        this.n = new JLabel();
        this.a = new JComboBox();
        this.f = new JFormattedTextField();
        this.f = new JButton();
        this.d = new JButton();
        this.c = new JButton();
        this.a = new JButton();
        this.e = new JButton();
        this.a = new JLabel();
        this.b = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Cadastro de Cliente", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Cliente", 1, 2));
        this.o.setFont(new Font("Tahoma", 1, 11));
        this.o.setText(" Tipo de documento");
        this.c.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.j.setFont(new Font("Tahoma", 1, 11));
        this.j.setText("N\u00famero do documento");
        this.c.setHorizontalAlignment(4);
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("* Nome/Raz\u00e3o Social");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("Inscri\u00e7\u00e3o Estadual");
        this.b.setHorizontalAlignment(4);
        this.m.setFont(new Font("Tahoma", 1, 11));
        this.m.setText("Inscri\u00e7\u00e3o SUFRAMA");
        this.e.setHorizontalAlignment(4);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Isento do ICMS");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("Email");
        GroupLayout pnlClienteLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlClienteLayout.createSequentialGroup().addContainerGap().addGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlClienteLayout.createSequentialGroup().addGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.i).addComponent(this.o)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlClienteLayout.createSequentialGroup().addComponent(this.b, -2, 159, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.m).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 173, -2)).addGroup(pnlClienteLayout.createSequentialGroup().addComponent(this.c, -2, 105, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.j).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 183, -2)).addComponent(this.e, -1, 644, 32767))).addComponent(this.f).addGroup(pnlClienteLayout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, 733, 32767))).addContainerGap()));
        pnlClienteLayout.setVerticalGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlClienteLayout.createSequentialGroup().addGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.i).addComponent(this.e, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.o).addComponent(this.c, -2, -1, -2).addComponent(this.j).addComponent(this.c, -2, -1, -2)).addGap(11, 11, 11).addGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.b, -2, -1, -2).addComponent(this.a).addComponent(this.m).addComponent(this.e, -2, -1, -2)).addGap(8, 8, 8).addGroup(pnlClienteLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.c, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Endere\u00e7o", 1, 2));
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("Logradouro");
        this.k.setFont(new Font("Tahoma", 1, 11));
        this.k.setText("N\u00famero");
        this.d.setHorizontalAlignment(4);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("Complemento");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Bairro");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("CEP");
        this.a.setHorizontalAlignment(4);
        this.l.setFont(new Font("Tahoma", 1, 11));
        this.l.setText("Pa\u00eds");
        this.p.setFont(new Font("Tahoma", 1, 11));
        this.p.setText("UF");
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("Munic\u00edpio");
        this.n.setFont(new Font("Tahoma", 1, 11));
        this.n.setText("Telefone");
        this.f.setHorizontalAlignment(4);
        ((AbstractDocument)this.f.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}", 14));
        GroupLayout pnlContatoLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlContatoLayout);
        pnlContatoLayout.setHorizontalGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoLayout.createSequentialGroup().addContainerGap().addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d).addComponent(this.g).addComponent(this.l).addComponent(this.n)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoLayout.createSequentialGroup().addComponent(this.b, 0, 264, 32767).addGap(18, 18, 18).addComponent(this.p).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 58, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, 0, 265, 32767)).addGroup(pnlContatoLayout.createSequentialGroup().addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoLayout.createSequentialGroup().addComponent(this.b, -1, 244, 32767).addGap(28, 28, 28).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 182, 32767)).addComponent(this.d, GroupLayout.Alignment.TRAILING, -1, 492, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.k).addComponent(this.c)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 99, -2).addComponent(this.d, -1, 140, 32767))).addComponent(this.f, -2, 158, -2)).addContainerGap()));
        pnlContatoLayout.setVerticalGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlContatoLayout.createSequentialGroup().addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g).addComponent(this.k).addComponent(this.d, -2, 19, -2).addComponent(this.d, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.b).addComponent(this.c).addComponent(this.a, -2, -1, -2).addComponent(this.b, -2, -1, -2).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.l).addComponent(this.b, -2, -1, -2).addComponent(this.d, -2, -1, -2).addComponent(this.h).addComponent(this.p).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 9, 32767).addGroup(pnlContatoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.n).addComponent(this.f, -2, -1, -2)).addGap(17, 17, 17)));
        this.f.setText("Fechar");
        this.d.setText("Exportar");
        this.c.setText("Excluir");
        this.a.setText("Editar");
        this.e.setText("Incluir");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.b.setText("Consultar Cadastro");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addGap(6, 6, 6).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(617, 32767).addComponent(this.a)).addGroup(layout.createSequentialGroup().addGap(8, 8, 8).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767).addComponent(this.b, -1, -1, 32767)))).addContainerGap()));
        layout.linkSize(0, this.a, this.c, this.d, this.e, this.f);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.a).addComponent(this.c).addComponent(this.d).addComponent(this.f).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 7, 32767).addComponent(this.a)));
    }

    private void a(ItemEvent evt) {
    }

    private void b(ItemEvent evt) {
        if (this.a.isSelected()) {
            this.b.setText("");
            this.b.setEnabled(false);
            this.b.setEnabled(false);
        } else {
            this.b.setEnabled(true);
            this.b.setEnabled(true);
        }
        this.e();
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.b.addItemListener((ItemListener)listener);
        this.d.addItemListener((ItemListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public void setPais(List<PaisTO> lista) {
        this.b.removeAllItems();
        this.d.removeAllItems();
        this.a.removeAllItems();
        if (lista != null) {
            PaisTO paisTO = new PaisTO();
            paisTO.setCodigo("");
            paisTO.setNome("");
            lista.add(0, paisTO);
            for (int i = 0; i < lista.size(); ++i) {
                this.b.addItem(lista.get(i));
            }
        }
    }

    public void setEstado(List<EstadoTO> lista) {
        this.d.removeAllItems();
        this.a.removeAllItems();
        if (lista != null) {
            this.d.addItem(new EstadoTO("", "", ""));
            for (int i = 0; i < lista.size(); ++i) {
                this.d.addItem(lista.get(i));
            }
        }
    }

    public void setMunicipio(List<MunicipioTO> lista) {
        this.a.removeAllItems();
        if (lista != null) {
            MunicipioTO municipioTO = new MunicipioTO();
            municipioTO.setCodigo("");
            municipioTO.setNome("");
            lista.add(0, municipioTO);
            for (int i = 0; i < lista.size(); ++i) {
                this.a.addItem(lista.get(i));
            }
        }
    }

    public void setTipoDocumento(List lista) {
        this.c.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.c.addItem(lista.get(i));
            }
        }
    }

    public void selectPais(PaisTO pais) {
        this.b.setSelectedItem((Object)pais);
    }

    public void selectEstado(EstadoTO estado) {
        this.d.setSelectedItem((Object)estado);
    }

    public void selectMunicipio(MunicipioTO municipio) {
        this.a.setSelectedItem((Object)municipio);
    }

    public ClienteTO getClienteTO() {
        if (this.a == null) {
            this.a = new ClienteTO();
        }
        TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.c.getSelectedItem();
        Object nrDocumento = null;
        try {
            if (tpDocumento != null) {
                nrDocumento = tpDocumento.equals((Object)TipoDocumentoEnum.CNPJ) ? this.a.stringToValue(this.c.getText()) : this.a.stringToValue(this.c.getText());
            }
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        this.a.setTpDocumentoEnum(tpDocumento);
        if (nrDocumento != null) {
            this.a.setNrDocumento(nrDocumento.toString());
        } else {
            this.a.setNrDocumento(null);
        }
        if (this.a.isSelected()) {
            this.a.setIe(DSENConstants.ISENTO);
        } else {
            this.a.setIe(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        }
        this.a.setIesuf(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? this.e.getText() : null);
        this.a.setXNome(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? this.e.getText() : null);
        this.a.setXLgr(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? this.d.getText() : null);
        this.a.setNro(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? this.d.getText() : null);
        this.a.setXCpl(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        this.a.setXBairro(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        this.a.setEmail(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText() : null);
        PaisTO pais = (PaisTO)this.b.getSelectedItem();
        if (pais != null) {
            this.a.setCPais(pais.getCodigo());
            this.a.setXPais(pais.getNome());
        } else {
            this.a.setCPais(null);
            this.a.setXPais(null);
        }
        EstadoTO estado = (EstadoTO)this.d.getSelectedItem();
        if (estado != null) {
            this.a.setUf(estado.getSigla());
        } else {
            this.a.setUf(null);
        }
        MunicipioTO municipio = (MunicipioTO)this.a.getSelectedItem();
        if (municipio != null) {
            this.a.setCMun(municipio.getCodigo());
            this.a.setXMun(municipio.getNome());
        } else {
            this.a.setCMun(null);
            this.a.setXMun(null);
        }
        Object cep = null;
        try {
            cep = this.a.stringToValue(this.a.getText());
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        if (!StringHelper.isBlankOrNull((Object)cep)) {
            this.a.setCep(cep.toString());
        } else {
            this.a.setCep(null);
        }
        Object tel = null;
        try {
            tel = this.a.stringToValue(this.f.getText());
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        if (!StringHelper.isBlankOrNull((Object)tel)) {
            this.a.setFone(tel.toString());
        } else {
            this.a.setFone(null);
        }
        this.a.clearErrors();
        this.a.clearMessages();
        return this.a;
    }

    public void setClienteTO(ClienteTO cliente) {
        this.a = cliente;
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        TipoDocumentoEnum tipo = null;
        String value = null;
        if (TipoDocumentoEnum.CNPJ.equals((Object)cliente.getTpDocumentoEnum())) {
            tipo = TipoDocumentoEnum.CNPJ;
            SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
            value = StringHelper.cnpjFormat((String)cliente.getNrDocumento());
        } else if (TipoDocumentoEnum.CPF.equals((Object)cliente.getTpDocumentoEnum())) {
            tipo = TipoDocumentoEnum.CPF;
            SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
            value = StringHelper.cpfFormat((String)cliente.getNrDocumento());
        }
        String text = value;
        this.c.setSelectedItem((Object)tipo);
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        if (DSENConstants.ISENTO.equals(cliente.getIe())) {
            this.a.setSelected(true);
            this.b.setText("");
        } else {
            this.a.setSelected(false);
            this.b.setText(cliente.getIe());
        }
        this.e();
        this.e.setText(cliente.getIesuf());
        this.e.setText(cliente.getXNome());
        this.d.setText(cliente.getXLgr());
        this.d.setText(cliente.getNro());
        this.b.setText(cliente.getXCpl());
        this.a.setText(cliente.getXBairro());
        this.c.setText(cliente.getEmail());
        this.a.setText(cliente.getCep());
        if (cliente.getFone() != null) {
            this.f.setText(cliente.getFone().toString());
        }
    }

    public void setActionAlterar() {
        PaisTO paisTO;
        this.a.setActionCommand("alterar");
        this.a.setText("Alterar");
        if (DSENConstants.ISENTO.equals(this.a.getIe())) {
            this.b.setEnabled(false);
        }
        if (this.a.getTpDocumentoEnum() == null) {
            this.c.setEnabled(false);
            this.j.setText((Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
        }
        if ((paisTO = (PaisTO)this.b.getSelectedItem()) == null || !DSENConstants.BRASIL.equals(paisTO.getCodigo())) {
            this.a.setEnabled(false);
            this.c.setEnabled(false);
            this.c.setEnabled(false);
            this.b.setEnabled(false);
            this.e.setEnabled(false);
        }
    }

    public void setActionEditar() {
        this.a.setActionCommand("editar");
        this.a.setText("Editar");
    }

    public void firePropertyChange(String property) {
        this.firePropertyChange(property, (Object)null, (Object)null);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.b && e.getStateChange() == 1) {
            PaisTO paisTO = (PaisTO)this.b.getSelectedItem();
            if (!DSENConstants.BRASIL.equals(paisTO.getCodigo())) {
                this.a.setEnabled(false);
                this.a.setSelected(false);
                this.c.setEnabled(false);
                this.c.setSelectedIndex(-1);
                this.c.setEnabled(false);
                this.j.setText((Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
                this.c.setText("");
                this.b.setEnabled(false);
                this.b.setText("");
                this.e.setEnabled(false);
                this.e.setText("");
            } else {
                this.c.setEnabled(true);
                this.c.setSelectedIndex(-1);
                this.c.setEnabled(false);
                this.b.setEnabled(true);
                this.a.setEnabled(true);
                this.e.setEnabled(true);
            }
            this.e();
        } else if (e.getSource() == this.c) {
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.c.getSelectedItem();
            this.c.setText(null);
            if (tpDocumento == null) {
                SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
            } else if (tpDocumento != null && e.getStateChange() == 1) {
                this.c.setEnabled(true);
                if (tpDocumento.equals((Object)TipoDocumentoEnum.CPF)) {
                    SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                } else {
                    SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                }
            }
        }
    }

    private void e() {
        if (StringHelper.isBlankOrNull((Object)this.b.getText())) {
            this.p.setText(DSENLabelConstants.UF);
        } else {
            this.p.setText("* " + DSENLabelConstants.UF);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.c) {
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.c.getSelectedItem();
            try {
                if (tpDocumento != null && tpDocumento.equals((Object)TipoDocumentoEnum.CNPJ)) {
                    if (!StringHelper.isBlankOrNull((Object)this.a.stringToValue(this.c.getText()))) {
                        String cnpj = StringHelper.completaComZerosAEsquerda((String)this.a.stringToValue(this.c.getText()).toString(), (int)14);
                        this.c.setText(cnpj);
                    }
                } else if (tpDocumento != null && tpDocumento.equals((Object)TipoDocumentoEnum.CPF) && !StringHelper.isBlankOrNull((Object)this.a.stringToValue(this.c.getText()))) {
                    String cpf = StringHelper.completaComZerosAEsquerda((String)this.a.stringToValue(this.c.getText()).toString(), (int)11);
                    this.c.setText(cpf);
                }
            }
            catch (ParseException cpf) {}
        } else if (e.getSource() == this.e) {
            if (!StringHelper.isBlankOrNull((Object)this.e.getText())) {
                String suf = StringHelper.completaComZerosAEsquerda((String)this.e.getText(), (int)8);
                this.e.setText(suf);
            }
        } else if (e.getSource() == this.b) {
            this.e();
        }
    }

    public ControllerItf getController(ViewItf viewItf) throws DSGEViewException {
        return this.getController((ViewItf)this);
    }

    public void setBtnVoltarTitle(String title) {
        this.f.setText(title);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ void a(ManterClienteGUI x0, ItemEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void b(ManterClienteGUI x0, ItemEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ CPFFormatter a(ManterClienteGUI x0) {
        return x0.a;
    }

    static /* synthetic */ CNPJFormatter a(ManterClienteGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JFormattedTextField a(ManterClienteGUI x0) {
        return x0.c;
    }

    static /* synthetic */ JLabel a(ManterClienteGUI x0) {
        return x0.j;
    }
}

