/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModeloNotaProdutorEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoDestEnum
 *  br.gov.sp.fazenda.dsen.common.to.RefNFPTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.format.MesDecadaFormatter
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaProdutorGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaProdutorGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.CPFFormatter
 *  br.gov.sp.fazenda.dsge.view.format.EstrangeiroFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.ModeloNotaProdutorEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoDestEnum;
import br.gov.sp.fazenda.dsen.common.to.RefNFPTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.format.MesDecadaFormatter;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaProdutorGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.CPFFormatter;
import br.gov.sp.fazenda.dsge.view.format.EstrangeiroFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.ItemSelectable;
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
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.MaskFormatter;

public class NotaReferenciadaProdutorGUI
extends DSGEDialog
implements FocusListener,
ItemListener {
    private static final long a = -9176942541747095556L;
    private DigitarNotaFiscalGUI a;
    private JButton a;
    private JButton b;
    private JCheckBox a;
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
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private MaskFormatter a;
    private String a;
    private String b;
    private RefNFPTO a;
    private Map<String, JComponent[]> a;
    private CNPJFormatter a;
    private CPFFormatter a;
    private EstrangeiroFormatter a;

    public NotaReferenciadaProdutorGUI(String operacao, DigitarNotaFiscalGUI digitarNotaGUI) throws DSGEViewException {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = operacao;
        this.b = digitarNotaGUI.getOperacao();
        this.a = digitarNotaGUI;
        this.b();
        this.e();
        this.b.setActionCommand(operacao);
        this.a();
        this.c();
        this.bindController((ViewItf)this);
        this.setLocationRelativeTo(null);
    }

    private void a() {
        this.b.addFocusListener((FocusListener)this);
        this.e.addFocusListener((FocusListener)this);
        this.d.addFocusListener((FocusListener)this);
        this.b.addItemListener((ItemListener)this);
        this.a.addItemListener((ItemListener)this);
        this.a.addItemListener((ItemListener)this);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() throws DSGEViewException {
        try {
            this.a = new CNPJFormatter();
            this.a = new CPFFormatter();
            this.a = new MesDecadaFormatter();
        }
        catch (ParseException ex) {
            throw new DSGEViewException((Throwable)ex, ex.getMessage());
        }
    }

    private void a(RefNFPTO refNFPTO) throws DSGEUtilException {
        this.b.setSelectedIndex(-1);
        this.itemStateChanged(new ItemEvent(this.b, -1, null, 1));
        this.a.uninstall();
        this.a.uninstall();
        if (!StringHelper.isBlankOrNull((Object)refNFPTO.getSerie())) {
            this.e.setText(StringHelper.completaComZerosAEsquerda((String)refNFPTO.getSerie(), (int)3));
        }
        if (!StringHelper.isBlankOrNull((Object)refNFPTO.getNNF())) {
            this.d.setText(StringHelper.completaComZerosAEsquerda((String)refNFPTO.getNNF(), (int)9));
        }
        this.c.setText(refNFPTO.getMMAA());
        this.c.setSelectedItem((Object)ModeloNotaProdutorEnum.getEnumPeloCodigo((String)refNFPTO.getMod()));
        EstadoTO estadoTO = refNFPTO.getCUF() != null ? DSENUtilHelper.getInstance().getEstadoTO(refNFPTO.getCUF()) : null;
        this.a.setSelectedItem((Object)estadoTO);
        if (!StringHelper.isBlankOrNull((Object)refNFPTO.getCPF())) {
            this.b.setSelectedItem((Object)TipoDocumentoDestEnum.CPF);
            this.b.setText(StringHelper.cpfFormat((String)refNFPTO.getCPF()));
        } else if (!StringHelper.isBlankOrNull((Object)refNFPTO.getCNPJ())) {
            this.b.setSelectedItem((Object)TipoDocumentoDestEnum.CNPJ);
            this.b.setText(StringHelper.cnpjFormat((String)refNFPTO.getCNPJ()));
        } else {
            this.b.setSelectedItem((Object)TipoDocumentoDestEnum.ESTRANGEIRO);
            this.b.setText(refNFPTO.getDocumento());
        }
        if (DSENConstants.ISENTO.equals(refNFPTO.getIE())) {
            this.a.setText("");
            this.a.setSelected(true);
        } else {
            this.a.setSelected(false);
            this.a.setText(refNFPTO.getIE() != null ? refNFPTO.getIE() : "");
        }
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("notaReferenciaProdutorAll", new JComponent[]{this.c, this.a, this.a, this.e, this.d, this.c, this.b, this.b, this.b, this.a});
        this.a.put("notaReferenciadaProdutorInit", new JComponent[]{this.c, this.a, this.a, this.e, this.d, this.c, this.b, this.b, this.b, this.a, this.a});
    }

    private void d() {
        this.b.setText("");
        this.c.setSelectedIndex(-1);
        this.d.setText("");
        this.e.setText("");
        this.a.setText("");
        this.c.setText("");
        this.a.setSelectedIndex(-1);
        this.b.setSelectedIndex(-1);
    }

    private void e() {
        this.a = new JPanel();
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.i = new JLabel();
        this.e = new JFormattedTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.h = new JLabel();
        this.d = new JFormattedTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.f = new JLabel();
        this.c = new JFormattedTextField();
        this.a.install(this.c);
        this.g = new JLabel();
        this.c = new JComboBox();
        this.b = new JFormattedTextField();
        this.a.install(this.b);
        this.d = new JLabel();
        this.b = new JComboBox();
        this.e = new JLabel();
        this.a = new JComboBox();
        this.b = new JLabel();
        this.c = new JLabel();
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}|[pP]{1}[rR]{1}[0-9]{1,8}", 14));
        this.a = new JCheckBox();
        this.setDefaultCloseOperation(2);
        this.setTitle("Nota Referenciada de Produtor");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Nota Referenciada de Produtor", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.b.setText("Ok");
        this.a.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("* S\u00e9rie");
        this.e.setHorizontalAlignment(4);
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("* N\u00famero");
        this.d.setHorizontalAlignment(4);
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* M\u00eas e ano de emiss\u00e3o (mm/aa)");
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("* Modelo");
        this.b.setHorizontalAlignment(2);
        this.b.setEnabled(false);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* CNPJ/CPF");
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* Tipo de Documento");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("* UF");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Inscri\u00e7\u00e3o Estadual do Emitente");
        this.a.setHorizontalAlignment(4);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Isento");
        this.a.setToolTipText("Selecione esse item se o Emitente for isento de Incri\u00e7\u00e3o Estadual");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 172, 32767).addComponent(this.a)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 47, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 127, -2)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 85, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, 0, -1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 75, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 66, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 48, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, 149, 32767).addComponent(this.a, -1, 149, 32767)))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.i).addComponent(this.e, -2, -1, -2).addComponent(this.h).addComponent(this.d, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.c, -2, -1, -2).addComponent(this.g).addComponent(this.c, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.b, -2, -1, -2).addComponent(this.d).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2).addComponent(this.c).addComponent(this.a, -2, -1, -2).addComponent(this.a)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, 32767).addComponent(this.a)).addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap()))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, -1, -2));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public String getOperacaoNota() {
        return this.b;
    }

    public RefNFPTO getRefNFPTO() {
        if (this.a == null) {
            this.a = new RefNFPTO();
        }
        EstadoTO estadoTO = (EstadoTO)this.a.getSelectedItem();
        this.a.setMMAA(!StringHelper.isBlankOrNull((Object)this.c.getText().replaceAll("/", "")) ? this.c.getText() : null);
        this.a.setCUF(estadoTO != null ? estadoTO.getCodigo() : null);
        if (this.a.isSelected()) {
            this.a.setIE(DSENConstants.ISENTO);
        } else {
            this.a.setIE(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        }
        this.a.setSerie(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? new Integer(this.e.getText()).toString() : null);
        this.a.setNNF(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? new Long(this.d.getText()).toString() : null);
        this.a.setMod(!StringHelper.isBlankOrNull((Object)this.c.getSelectedItem()) ? this.c.getSelectedItem().toString() : null);
        try {
            TipoDocumentoEnum tipoDocumento = (TipoDocumentoEnum)this.b.getSelectedItem();
            String nrDocumento = this.b.getText().replaceAll("\\D", "");
            if (TipoDocumentoEnum.CNPJ.equals((Object)tipoDocumento)) {
                this.a.setCNPJ(this.a.stringToValue(nrDocumento).toString());
            } else if (TipoDocumentoEnum.CPF.equals((Object)tipoDocumento)) {
                this.a.setCPF(this.a.stringToValue(nrDocumento).toString());
            }
        }
        catch (ParseException tipoDocumento) {
            // empty catch block
        }
        return this.a;
    }

    public void setRefNFPTO(RefNFPTO refNFPTO) throws DSGEUtilException {
        this.a = refNFPTO;
        this.d();
        if (refNFPTO != null) {
            this.a(refNFPTO);
        }
    }

    public void setListaUF(List<EstadoTO> listaUF) {
        this.a.removeAllItems();
        if (listaUF != null) {
            for (int i = 0; i < listaUF.size(); ++i) {
                this.a.addItem(listaUF.get(i));
            }
        }
        this.a.setSelectedIndex(-1);
    }

    public void setListaTipoDocumento(TipoDocumentoEnum[] lista) {
        this.b.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.b.addItem(lista[i]);
            }
        }
        this.b.setSelectedIndex(-1);
    }

    public void setListaModeloNotaProdutor(ModeloNotaProdutorEnum[] lista) {
        this.c.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.c.addItem(lista[i]);
            }
        }
        this.b.setSelectedIndex(-1);
    }

    public void firePropertyChange(String propertyName, RefNFPTO refNFPTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)refNFPTO);
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.b) {
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.b.getSelectedItem();
            if (tpDocumento != null && !StringHelper.isBlankOrNull((Object)this.b.getText())) {
                if (tpDocumento.equals((Object)TipoDocumentoEnum.CNPJ)) {
                    try {
                        String cnpj = this.a.stringToValue(this.b.getText()).toString();
                        if (!StringHelper.isBlankOrNull((Object)cnpj)) {
                            cnpj = StringHelper.completaComZerosAEsquerda((String)cnpj, (int)14);
                        }
                        this.b.setText(cnpj);
                    }
                    catch (ParseException cnpj) {}
                } else {
                    try {
                        String cpf = this.a.stringToValue(this.b.getText()).toString();
                        if (!StringHelper.isBlankOrNull((Object)cpf)) {
                            cpf = StringHelper.completaComZerosAEsquerda((String)cpf, (int)11);
                        }
                        this.b.setText(cpf);
                    }
                    catch (ParseException cpf) {}
                }
            }
        } else if (e.getSource() == this.e) {
            if (!StringHelper.isBlankOrNull((Object)this.e.getText())) {
                String serie = StringHelper.completaComZerosAEsquerda((String)this.e.getText(), (int)3);
                this.e.setText(serie);
            }
        } else if (e.getSource() == this.d && !StringHelper.isBlankOrNull((Object)this.d.getText())) {
            String nnf = StringHelper.completaComZerosAEsquerda((String)this.d.getText(), (int)9);
            this.d.setText(nnf);
        }
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.a && e.getStateChange() == 1) {
            EstadoTO estadoTO = (EstadoTO)this.a.getSelectedItem();
            if ("EX".equals(estadoTO.getSigla())) {
                this.a.uninstall();
                this.a.uninstall();
                this.a.setEnabled(false);
                this.a.setSelected(false);
                this.b.setEnabled(false);
                this.b.setSelectedIndex(-1);
                this.b.setEnabled(false);
                this.d.setText((Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
                this.e.setText(DSENLabelConstants.TIPO_DE_DOCUMENTO);
                this.a.setEnabled(false);
                this.a.setText("");
            } else {
                TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.b.getSelectedItem();
                String nrDocLabel = tpDocumento == null ? (Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ : (TipoDocumentoEnum.CNPJ.equals((Object)tpDocumento) ? TipoDocumentoEnum.CNPJ.toString() : TipoDocumentoEnum.CPF.toString());
                if (this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                    this.b.setEnabled(true);
                }
                this.d.setText("* " + nrDocLabel);
                this.e.setText("* " + DSENLabelConstants.TIPO_DE_DOCUMENTO);
                if (this.b.getSelectedIndex() >= 0) {
                    if (this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                        this.b.setEnabled(true);
                    }
                } else {
                    this.b.setEnabled(false);
                }
                if (this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                    this.a.setEnabled(true);
                }
                if (this.a.isSelected()) {
                    this.a.setEnabled(false);
                } else if (this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                    this.a.setEnabled(true);
                }
            }
        } else if (e.getSource() == this.b) {
            TipoDocumentoEnum tpDocumento = (TipoDocumentoEnum)this.b.getSelectedItem();
            if (tpDocumento == null) {
                this.b.setEnabled(false);
                this.d.setText("* " + (Object)TipoDocumentoEnum.CPF + "/" + (Object)TipoDocumentoEnum.CNPJ);
                this.a.uninstall();
                this.a.uninstall();
            } else if (tpDocumento != null && e.getStateChange() == 1) {
                if (tpDocumento.equals((Object)TipoDocumentoEnum.CPF)) {
                    if (this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                        this.b.setEnabled(true);
                    }
                    this.d.setText("* " + (Object)TipoDocumentoEnum.CPF);
                    this.a.uninstall();
                    this.a.uninstall();
                    this.a.install(this.b);
                } else {
                    if (this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                        this.b.setEnabled(true);
                    }
                    this.d.setText("* " + TipoDocumentoEnum.CNPJ.toString());
                    this.a.uninstall();
                    this.a.uninstall();
                    this.a.install(this.b);
                }
            }
        } else if (e.getSource() == this.a) {
            if (this.a.isSelected()) {
                this.a.setText("");
                this.a.setEnabled(false);
            } else if (this.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                this.a.setEnabled(true);
            }
        }
    }

    public DigitarNotaFiscalGUI getDigitarNotaGUI() {
        return this.a;
    }
}

