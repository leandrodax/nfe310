/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RefNFTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.format.MesDecadaFormatter
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI$1
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI$2
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI$3
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI$4
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.RefNFTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.format.MesDecadaFormatter;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import javax.swing.text.MaskFormatter;

public class NotaReferenciadaGUI
extends DSGEDialog
implements FocusListener {
    private static final long a = 405783443153918962L;
    DigitarNotaFiscalGUI a;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private ButtonGroup a;
    private JLabel a;
    private JPanel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JLabel g;
    private JLabel h;
    private JPanel b;
    private JPanel c;
    private JRadioButton a;
    private JRadioButton b;
    private JRadioButton c;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JTextField a;
    private MaskFormatter a;
    private String a;
    private String b;
    private RefNFTO a;
    private Map<String, JComponent[]> a;
    private CNPJFormatter a;

    public NotaReferenciadaGUI(String operacao, DigitarNotaFiscalGUI digitarNfeGUI) throws DSGEViewException {
        super((Window)DSENDesktop.getInstance(), true);
        this.a = operacao;
        this.b = digitarNfeGUI.getOperacao();
        this.a = digitarNfeGUI;
        this.a();
        this.h();
        this.b.setActionCommand(operacao);
        this.a.addFocusListener((FocusListener)this);
        this.e.addFocusListener((FocusListener)this);
        this.c.addFocusListener((FocusListener)this);
        this.b();
        this.c();
        this.d();
        this.bindController((ViewItf)this);
        this.setLocationRelativeTo(null);
    }

    private void a() throws DSGEViewException {
        try {
            this.a = new CNPJFormatter();
            this.a = new MesDecadaFormatter();
        }
        catch (ParseException ex) {
            throw new DSGEViewException((Throwable)ex, ex.getMessage());
        }
    }

    private void a(RefNFTO refNFTO) throws DSGEUtilException {
        this.d.setText(refNFTO.getChave());
        this.a.setText(refNFTO.getCNPJ());
        if (!StringHelper.isBlankOrNull((Object)refNFTO.getSerie())) {
            this.e.setText(StringHelper.completaComZerosAEsquerda((String)refNFTO.getSerie(), (int)3));
        }
        if (!StringHelper.isBlankOrNull((Object)refNFTO.getNNF())) {
            this.c.setText(StringHelper.completaComZerosAEsquerda((String)refNFTO.getNNF(), (int)9));
        }
        this.b.setText(refNFTO.getMMAA());
        EstadoTO estadoTO = refNFTO.getCUF() != null ? DSENUtilHelper.getInstance().getEstadoTO(refNFTO.getCUF()) : null;
        this.a.setSelectedItem((Object)estadoTO);
    }

    private void b() {
        this.a = new HashMap();
        this.a.put("notaReferenciadaAll", new JComponent[]{this.a, this.c, this.b, this.d, this.a, this.b, this.a, this.e, this.c, this.b});
        this.a.put("notaReferenciadaInit", new JComponent[]{this.c, this.a, this.b, this.d, this.b, this.a});
        this.a.put("notaReferenciadaNFe", new JComponent[]{this.c, this.a, this.b, this.d, this.b, this.a});
        this.a.put("notaReferenciadaNFPapel", new JComponent[]{this.c, this.a, this.b, this.a, this.b, this.a, this.e, this.c, this.b, this.a});
        this.a.put("notaReferenciadaCTe", new JComponent[]{this.c, this.a, this.b, this.d, this.b, this.a});
    }

    private void c() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void d() {
        this.c.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void e() {
        this.h.setText("* S\u00e9rie");
        this.f.setText("* N\u00famero");
        this.e.setText("* Modelo");
        this.c.setText("* UF");
        this.d.setText("* M\u00eas e ano de emiss\u00e3o (mm/aa)");
        this.b.setText("* CNPJ");
        this.g.setText("Chave de acesso");
    }

    private void f() {
        this.h.setText("S\u00e9rie");
        this.f.setText("N\u00famero");
        this.e.setText("Modelo");
        this.c.setText("UF");
        this.d.setText("M\u00eas e ano de emiss\u00e3o (mm/aa)");
        this.b.setText("CNPJ");
        this.g.setText("* Chave de acesso");
    }

    private void g() {
        this.b.setText(null);
        this.a.setText(null);
        this.c.setText(null);
        this.d.setText("");
        this.e.setText(null);
        this.a.setSelectedIndex(-1);
        this.a.setText(null);
    }

    private void h() {
        this.a = new ButtonGroup();
        this.a = new JPanel();
        this.c = new JRadioButton();
        this.b = new JRadioButton();
        this.b = new JPanel();
        this.g = new JLabel();
        this.d = new JFormattedTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{44}", 44));
        this.c = new JPanel();
        this.c = new JLabel();
        this.a = new JComboBox();
        this.d = new JLabel();
        this.b = new JFormattedTextField();
        this.a.install(this.b);
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.h = new JLabel();
        this.f = new JLabel();
        this.c = new JFormattedTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.e = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(2));
        this.e = new JFormattedTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.a = new JRadioButton();
        this.a = new JButton();
        this.b = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("NF-e/CT-e/Nota Fiscal Referenciada");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Notas e Conhecimentos Fiscais Referenciados", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.a.add(this.c);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setSelected(true);
        this.c.setText("NF-e");
        this.c.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.c.setMargin(new Insets(0, 0, 0, 0));
        this.a.add(this.b);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Nota Fiscal");
        this.b.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.b.setMargin(new Insets(0, 0, 0, 0));
        this.b.setBorder(BorderFactory.createTitledBorder("NF-e / CT-e"));
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("Chave de acesso");
        GroupLayout pnlChaveLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlChaveLayout);
        pnlChaveLayout.setHorizontalGroup(pnlChaveLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlChaveLayout.createSequentialGroup().addContainerGap().addGroup(pnlChaveLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, -2, 380, -2).addComponent(this.g)).addContainerGap(20, 32767)));
        pnlChaveLayout.setVerticalGroup(pnlChaveLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlChaveLayout.createSequentialGroup().addComponent(this.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, -1, -2).addContainerGap(-1, 32767)));
        this.c.setBorder(BorderFactory.createTitledBorder("Nota Fiscal"));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("UF");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("M\u00eas e ano de emiss\u00e3o (mm/aa)");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("CNPJ");
        this.a.setHorizontalAlignment(2);
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("S\u00e9rie");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("N\u00famero");
        this.c.setHorizontalAlignment(4);
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("Modelo");
        this.a.setHorizontalAlignment(4);
        this.a.setText(DSENConstants.MODELO_NFREF);
        this.a.setEnabled(false);
        this.e.setHorizontalAlignment(4);
        GroupLayout pnlInfoLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addContainerGap().addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.h).addComponent(this.c).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.e).addComponent(this.a, 0, 65, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 95, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 55, -2)).addGroup(pnlInfoLayout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 88, -2)))).addComponent(this.a, -2, 150, -2)).addContainerGap(21, 32767)));
        pnlInfoLayout.linkSize(0, this.b, this.c, this.h);
        pnlInfoLayout.setVerticalGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInfoLayout.createSequentialGroup().addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.e, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a, -2, -1, -2))).addGroup(pnlInfoLayout.createSequentialGroup().addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.c, -2, -1, -2).addComponent(this.a, -2, -1, -2).addComponent(this.e)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.b, -2, -1, -2)))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlInfoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.a.add(this.a);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("CT-e");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.setText("Fechar");
        this.b.setText("Ok");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 116, 32767).addComponent(this.a).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.b).addGap(20, 20, 20)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.c, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.b, -1, -1, 32767)).addContainerGap()))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, -1, -2).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()))));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 462, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 296, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767)));
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

    public RefNFTO getRefNFTO() {
        if (this.a == null) {
            this.a = new RefNFTO();
        }
        if (this.c.isSelected()) {
            this.a.setChave(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? this.d.getText() : null);
            this.a.setTipoRefNF(RefNFTO.TIPO_NFE);
            this.a.setMMAA(null);
            this.a.setCNPJ(null);
            this.a.setCUF(null);
            this.a.setMod(null);
            this.a.setNNF(null);
            this.a.setSerie(null);
        } else if (this.a.isSelected()) {
            this.a.setChave(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? this.d.getText() : null);
            this.a.setTipoRefNF(RefNFTO.TIPO_CTE);
            this.a.setMMAA(null);
            this.a.setCNPJ(null);
            this.a.setCUF(null);
            this.a.setMod(null);
            this.a.setNNF(null);
            this.a.setSerie(null);
        } else {
            EstadoTO estadoTO = (EstadoTO)this.a.getSelectedItem();
            this.a.setMMAA(!StringHelper.isBlankOrNull((Object)this.b.getText().replaceAll("\\D", "")) ? this.b.getText() : null);
            try {
                this.a.setCNPJ(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.stringToValue(this.a.getText()).toString() : null);
            }
            catch (ParseException ex) {
                this.showErrors((Throwable)ex);
            }
            this.a.setNNF(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? new Long(this.c.getText()).toString() : null);
            this.a.setSerie(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? new Integer(this.e.getText()).toString() : null);
            this.a.setMod(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
            this.a.setCUF(estadoTO != null ? estadoTO.getCodigo() : null);
            this.a.setTipoRefNF(RefNFTO.TIPO_NFPAPEL);
            this.a.setChave(null);
        }
        return this.a;
    }

    public void setRefNFTO(RefNFTO refNFTO) throws DSGEUtilException {
        this.a = refNFTO;
        this.g();
        if (!StringHelper.isBlankOrNull((Object)refNFTO.getChave())) {
            if (refNFTO.getTipoRefNF() == RefNFTO.TIPO_NFE) {
                this.c.doClick();
                this.c.setSelected(true);
            } else {
                this.a.doClick();
                this.a.setSelected(true);
            }
        } else {
            this.b.doClick();
            this.b.setSelected(true);
        }
        if (refNFTO != null) {
            this.a(refNFTO);
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

    public void firePropertyChange(String propertyName, RefNFTO refNFTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)refNFTO);
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.a) {
            try {
                String cnpj = this.a.stringToValue(this.a.getText()).toString();
                if (!StringHelper.isBlankOrNull((Object)cnpj)) {
                    cnpj = StringHelper.completaComZerosAEsquerda((String)cnpj, (int)14);
                    this.a.setText(cnpj);
                }
            }
            catch (ParseException cnpj) {}
        } else if (e.getSource() == this.e) {
            if (!StringHelper.isBlankOrNull((Object)this.e.getText())) {
                String serie = StringHelper.completaComZerosAEsquerda((String)this.e.getText(), (int)3);
                this.e.setText(serie);
            }
        } else if (e.getSource() == this.c && !StringHelper.isBlankOrNull((Object)this.c.getText())) {
            String nnf = StringHelper.completaComZerosAEsquerda((String)this.c.getText(), (int)9);
            this.c.setText(nnf);
        }
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public DigitarNotaFiscalGUI getDigitarNfeGUI() {
        return this.a;
    }

    static /* synthetic */ void a(NotaReferenciadaGUI x0) {
        x0.g();
    }

    static /* synthetic */ void b(NotaReferenciadaGUI x0) {
        x0.f();
    }

    static /* synthetic */ void c(NotaReferenciadaGUI x0) {
        x0.e();
    }

    static /* synthetic */ JTextField a(NotaReferenciadaGUI x0) {
        return x0.a;
    }
}

