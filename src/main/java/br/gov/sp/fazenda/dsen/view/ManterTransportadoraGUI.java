/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI$1
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI$2
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI$3
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI$4
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI$5
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI$6
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI$7
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI$8
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CPFFormatter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.CPFFormatter;
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
import java.util.ArrayList;
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

public class ManterTransportadoraGUI
extends DSGESimplePanel
implements FocusListener,
ItemListener {
    private static final long a = -8922214329445754059L;
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
    private JLabel a;
    private JPanel a;
    private JPanel b;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JTextField a;
    private JTextField b;
    private HashMap<String, JComponent[]> a;
    private String a;
    private TransportadoraTO a;
    private CNPJFormatter a;
    private CPFFormatter a;

    public ManterTransportadoraGUI(String operacao) throws DSGEViewException {
        try {
            this.a = new CNPJFormatter();
            this.a = new CPFFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        this.d();
        this.a = operacao;
        this.a();
        this.b();
        this.c();
        this.bindController((ViewItf)this);
        this.b.setVisible(true);
    }

    private void a() {
        this.a = new HashMap();
        this.a.put("insertTransportadora", new JComponent[]{this.a, this.c, this.d});
        this.a.put("TRANSPORTADORA_ATUALIZAR", new JComponent[]{this.e, this.c, this.d});
        this.a.put("updateTransportadoraDisable", new JComponent[]{this.c, this.d});
        this.a.put("detailTransportadora", new JComponent[]{this.b, this.a, this.b, this.a, this.c, this.a, this.a, this.b, this.e});
        this.a.put("updateTransportadoraEnable", new JComponent[]{this.b, this.b, this.a, this.b, this.a, this.c, this.a, this.a});
    }

    private void b() {
        this.a.setActionCommand("editar");
        this.c.setActionCommand("excluir");
        this.d.setActionCommand("exportar");
        this.e.setActionCommand("incluir");
        this.f.setActionCommand("voltar");
        this.b.setActionCommand("consultarNFe");
        this.c.setActionCommand("estado");
    }

    private void c() {
        this.b.addItemListener((ItemListener)this);
        this.b.addFocusListener((FocusListener)this);
        this.a.addFocusListener((FocusListener)this);
        this.c.addItemListener((ItemListener)this);
    }

    private void d() {
        this.e = new JButton();
        this.a = new JButton();
        this.c = new JButton();
        this.d = new JButton();
        this.f = new JButton();
        this.a = new JPanel();
        this.e = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.b = new JComboBox();
        this.g = new JLabel();
        this.f = new JLabel();
        this.b = new JFormattedTextField();
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{2,14}|[pP]{1}[rR]{1}[0-9]{1,8}", 14));
        this.a = new JCheckBox();
        this.b = new JPanel();
        this.c = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.h = new JLabel();
        this.c = new JComboBox();
        this.a = new JComboBox();
        this.d = new JLabel();
        this.a = new JLabel();
        this.b = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Cadastro de Transportadora", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.e.setText("Incluir");
        this.a.setText("Editar");
        this.c.setText("Excluir");
        this.d.setText("Exportar");
        this.f.setText("Fechar");
        this.a.setBorder(BorderFactory.createTitledBorder("Transportadora"));
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* Nome/Raz\u00e3o Social");
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("Tipo de documento");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("CPF/CNPJ");
        this.b.setHorizontalAlignment(4);
        this.b.setEnabled(false);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Inscri\u00e7\u00e3o Estadual");
        this.a.setHorizontalAlignment(4);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Isento do ICMS");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e).addComponent(this.g).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b, -2, 118, -2).addGap(12, 12, 12).addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, 219, 32767)).addComponent(this.b, -1, 499, 32767).addComponent(this.a, -2, 162, -2))).addComponent(this.a)).addContainerGap()));
        jPanel1Layout.linkSize(0, this.a, this.b);
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g).addComponent(this.b, -2, -1, -2).addComponent(this.f).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addGap(10, 10, 10)));
        this.b.setBorder(BorderFactory.createTitledBorder("Endere\u00e7o"));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Logradouro");
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("UF");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("Munic\u00edpio");
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.h, -1, -1, 32767).addComponent(this.c, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.c, -2, 59, -2).addGap(29, 29, 29).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, 0, 408, 32767)).addComponent(this.a, -1, 553, 32767)).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, -1, -2).addComponent(this.c)).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(6, 6, 6).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c, -2, -1, -2).addComponent(this.h))).addGroup(jPanel2Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.a, -2, -1, -2)))).addContainerGap(15, 32767)));
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.b.setText("Consultar Cadastro");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.b, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addGap(6, 6, 6).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f)).addComponent(this.a, GroupLayout.Alignment.TRAILING)).addContainerGap()));
        layout.linkSize(0, this.a, this.c, this.d, this.e, this.f);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.a).addComponent(this.c).addComponent(this.d).addComponent(this.f).addComponent(this.b)).addContainerGap(34, 32767)).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()))));
    }

    private void a(ItemEvent evt) {
        if (this.a.isSelected()) {
            this.a.setText("");
            this.a.setEnabled(false);
            this.b.setEnabled(false);
        } else {
            this.a.setEnabled(true);
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
        this.c.addItemListener((ItemListener)listener);
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public void setEstado(List<EstadoTO> lista) {
        this.c.removeAllItems();
        this.a.removeAllItems();
        if (lista != null) {
            this.c.addItem(new EstadoTO("", "", ""));
            for (int i = 0; i < lista.size(); ++i) {
                this.c.addItem(lista.get(i));
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

    public void selectEstado(EstadoTO estado) {
        this.c.setSelectedItem((Object)estado);
    }

    public void selectMunicipio(MunicipioTO municipio) {
        this.a.setSelectedItem((Object)municipio);
    }

    public TransportadoraTO getTransportadoraTO() {
        Object nrDocumento = null;
        if (this.a == null) {
            this.a = new TransportadoraTO();
        }
        TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.b.getSelectedItem();
        try {
            nrDocumento = TipoDocumentoEnum.CNPJ.equals((Object)tpDocumento) ? this.a.stringToValue(this.b.getText()) : (TipoDocumentoEnum.CPF.equals((Object)tpDocumento) ? this.a.stringToValue(this.b.getText()) : null);
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        this.a.setTpDocumentoEnum(tpDocumento);
        this.a.setNrDocumento(nrDocumento != null ? nrDocumento.toString() : null);
        if (this.a.isSelected()) {
            this.a.setIe(DSENConstants.ISENTO);
        } else {
            this.a.setIe(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        }
        EstadoTO estado = (EstadoTO)this.c.getSelectedItem();
        if (estado != null) {
            this.a.setUf(estado.getSigla());
        } else {
            this.a.setUf(null);
        }
        MunicipioTO municipio = (MunicipioTO)this.a.getSelectedItem();
        if (municipio != null) {
            this.a.setXMun(municipio.getNome());
        } else {
            this.a.setXMun(null);
        }
        this.a.setXNome(this.b.getText().trim());
        this.a.setXEnder(this.a.getText().trim());
        this.a.clearErrors();
        this.a.clearMessages();
        return this.a;
    }

    public void setTransportadoraTO(TransportadoraTO transportadoraTO) {
        String value = null;
        this.a = transportadoraTO;
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        TipoDocumentoEnum tipo = null;
        if (TipoDocumentoEnum.CNPJ.equals((Object)transportadoraTO.getTpDocumentoEnum())) {
            tipo = TipoDocumentoEnum.CNPJ;
            SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
            value = StringHelper.cnpjFormat((String)transportadoraTO.getNrDocumento());
            this.a.install(this.b);
        } else if (TipoDocumentoEnum.CPF.equals((Object)transportadoraTO.getTpDocumentoEnum())) {
            tipo = TipoDocumentoEnum.CPF;
            SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
            value = StringHelper.cpfFormat((String)transportadoraTO.getNrDocumento());
        }
        this.b.setSelectedItem((Object)tipo);
        String text = value;
        this.b.setSelectedItem((Object)tipo);
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        if (DSENConstants.ISENTO.equals(transportadoraTO.getIe())) {
            this.a.setSelected(true);
            this.a.setText("");
        } else {
            this.a.setSelected(false);
            this.a.setText(transportadoraTO.getIe());
        }
        this.e();
        this.b.setText(transportadoraTO.getXNome());
        this.a.setText(transportadoraTO.getXEnder());
        try {
            EstadoTO estadoTO = DSENUtilHelper.getInstance().getSiglaEstadoTO(transportadoraTO.getUf());
            this.selectEstado(estadoTO);
            this.selectMunicipio(DSENUtilHelper.getInstance().getMunicipioTO(estadoTO, transportadoraTO.getXMun()));
        }
        catch (DSGEUtilException ex) {
            this.showErrors((DSGEBaseException)ex);
        }
    }

    private void e() {
        if (StringHelper.isBlankOrNull((Object)this.a.getText())) {
            this.h.setText(DSENLabelConstants.UF);
        } else {
            this.h.setText("* " + DSENLabelConstants.UF);
        }
    }

    public void setActionAlterar() {
        EstadoTO estadoTO;
        this.enableComponents("updateTransportadoraEnable");
        this.disableComponents("updateTransportadoraDisable");
        this.a.setActionCommand("alterar");
        this.a.setText("Alterar");
        if (DSENConstants.ISENTO.equals(this.a.getIe())) {
            this.a.setEnabled(false);
        }
        if (this.a.getTpDocumentoEnum() == null) {
            this.b.setEnabled(false);
            this.f.setText((Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
        }
        if ((estadoTO = (EstadoTO)this.c.getSelectedItem()) != null && "EX".equals(estadoTO.getSigla())) {
            this.a.setEnabled(false);
            this.b.setEnabled(false);
            this.b.setEnabled(false);
            this.a.setEnabled(false);
        }
        this.a = "TRANSPORTADORA_ATUALIZAR";
    }

    public void setActionEditar() {
        this.disableComponents("detailTransportadora");
        this.enableComponents("updateTransportadoraDisable");
        this.a.setActionCommand("editar");
        this.a.setText("Editar");
        this.a = "detailTransportadora";
    }

    public void firePropertyChange(String property) {
        this.firePropertyChange(property, (Object)null, (Object)null);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.c && e.getStateChange() == 1) {
            EstadoTO estadoTO = (EstadoTO)this.c.getSelectedItem();
            if ("EX".equals(estadoTO.getSigla())) {
                this.a.setEnabled(false);
                this.a.setSelected(false);
                this.b.setEnabled(false);
                this.b.setSelectedIndex(-1);
                this.b.setEnabled(false);
                this.f.setText((Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
                this.b.setText("");
                this.a.setEnabled(false);
                this.a.setText("");
            } else {
                this.b.setEnabled(true);
                this.a.setEnabled(true);
                this.a.setEnabled(true);
            }
            this.e();
        } else if (e.getSource() == this.b) {
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.b.getSelectedItem();
            this.b.setText(null);
            if (tpDocumento == null) {
                SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
            } else if (tpDocumento != null && e.getStateChange() == 1) {
                this.b.setEnabled(true);
                if (tpDocumento.equals((Object)TipoDocumentoEnum.CPF)) {
                    SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                } else {
                    SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
                }
            }
        }
    }

    public void setBtnVoltarTitle(String title) {
        this.f.setText(title);
    }

    public void setTipoDocumento(ArrayList<TipoDocumentoEnum> lista) {
        this.b.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.b.addItem(lista.get(i));
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.b) {
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.b.getSelectedItem();
            try {
                if (tpDocumento != null && tpDocumento.equals((Object)TipoDocumentoEnum.CNPJ)) {
                    if (!StringHelper.isBlankOrNull((Object)this.a.stringToValue(this.b.getText()))) {
                        String cnpj = StringHelper.completaComZerosAEsquerda((String)this.a.stringToValue(this.b.getText()).toString(), (int)14);
                        this.b.setText(cnpj);
                    }
                } else if (tpDocumento != null && tpDocumento.equals((Object)TipoDocumentoEnum.CPF) && !StringHelper.isBlankOrNull((Object)this.a.stringToValue(this.b.getText()))) {
                    String cpf = StringHelper.completaComZerosAEsquerda((String)this.a.stringToValue(this.b.getText()).toString(), (int)11);
                    this.b.setText(cpf);
                }
            }
            catch (ParseException cpf) {}
        } else if (e.getSource() == this.a) {
            this.e();
        }
    }

    public ControllerItf getController(ViewItf viewItf) throws DSGEViewException {
        return this.getController((ViewItf)this);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ void a(ManterTransportadoraGUI x0, ItemEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ CPFFormatter a(ManterTransportadoraGUI x0) {
        return x0.a;
    }

    static /* synthetic */ CNPJFormatter a(ManterTransportadoraGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JFormattedTextField a(ManterTransportadoraGUI x0) {
        return x0.b;
    }

    static /* synthetic */ JLabel a(ManterTransportadoraGUI x0) {
        return x0.f;
    }
}

