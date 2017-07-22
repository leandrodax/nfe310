/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.controller.ManterEmitenteController
 *  br.gov.sp.fazenda.dsen.view.ManterEmitenteGUI
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
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.PhoneFormatter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.controller.ManterEmitenteController;
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
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.PhoneFormatter;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.io.ByteArrayOutputStream;
import java.text.ParseException;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

public class ManterEmitenteGUI
extends DSGESimplePanel
implements FocusListener {
    private static final long a = -1133072629986720437L;
    private String a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JComboBox a;
    private JComboBox b;
    private JComboBox c;
    private JComboBox d;
    private JLabel a;
    private JLabel b;
    private JPanel a;
    private JPanel b;
    private JPanel c;
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
    private JLabel q;
    private JLabel r;
    private JLabel s;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JTextField d;
    private JTextField e;
    private JTextField f;
    private JTextField g;
    private JTextField h;
    private Map<String, JComponent[]> a;
    private ManterEmitenteController a;
    private EmitenteTO a;
    private CNPJFormatter a;
    private CEPFormatter a;
    private PhoneFormatter a;
    private byte[] a;

    public ManterEmitenteGUI(String operacao, EmitenteTO emitente) throws DSGEViewException {
        this.a = emitente;
        this.setOperacao(operacao);
        try {
            this.a = new CNPJFormatter();
            this.a = new CEPFormatter();
            this.a = new PhoneFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        this.d();
        this.b();
        this.c();
        this.a();
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.c.addFocusListener((FocusListener)this);
        this.b.addFocusListener((FocusListener)this);
    }

    public void populaComboRegimeTributario(RegimeTributarioEnum[] values) {
        for (RegimeTributarioEnum reg : values) {
            this.c.addItem(reg);
        }
    }

    private void b() {
        this.a = new HashMap();
        this.a.put("DETALHE_EMITENTE_SELECIONADO_CAMPOS_ATIVOS", new JComponent[]{this.d, this.a});
        this.a.put("DETALHE_EMITENTE_SELECIONADO_CAMPOS_INATIVOS", new JComponent[]{this.c, this.e, this.b, this.b, this.e, this.f, this.h, this.b, this.d, this.g, this.c, this.d, this.c, this.a, this.a, this.e, this.d, this.a, this.c});
        this.a.put("EDICAO_EMITENTE_SELECIONADO_CAMPOS_ATIVOS", new JComponent[]{this.e, this.b, this.b, this.e, this.f, this.h, this.b, this.d, this.g, this.c, this.d, this.c, this.a, this.a, this.e, this.d, this.a});
        this.a.put("EDICAO_EMITENTE_SELECIONADO_CAMPOS_INATIVOS", new JComponent[]{this.c, this.c, this.d});
        this.a.put("INSERCAO_EMITENTE_CAMPOS_ATIVOS", new JComponent[]{this.c, this.h, this.b, this.d, this.g, this.c, this.d, this.c, this.a, this.a, this.e, this.d, this.a, this.a});
        this.a.put("INSERCAO_EMITENTE_CAMPOS_INATIVOS", new JComponent[]{this.c, this.d});
        this.a.put("DETALHE_EMITENTE_CAMPOS_ATIVOS", new JComponent[]{this.c, this.d, this.a});
        this.a.put("DETALHE_EMITENTE_CAMPOS_INATIVOS", new JComponent[]{this.e, this.b, this.c, this.b, this.e, this.f, this.h, this.b, this.d, this.g, this.c, this.d, this.c, this.a, this.a, this.e, this.d, this.a});
        this.a.put("EDICAO_EMITENTE_CAMPOS_ATIVOS", new JComponent[]{this.e, this.b, this.b, this.e, this.f, this.h, this.b, this.d, this.g, this.c, this.d, this.c, this.a, this.a, this.e, this.d, this.a, this.a, this.c});
        this.a.put("EDICAO_EMITENTE_CAMPOS_INATIVOS", new JComponent[]{this.c, this.d});
    }

    private void c() {
        this.a.setActionCommand("alterar");
        this.c.setActionCommand("excluir");
        this.d.setActionCommand("exportar");
        this.f.setActionCommand("voltar");
        this.a.setActionCommand("municipio");
        this.b.setActionCommand("pais");
        this.d.setActionCommand("estado");
        this.e.setActionCommand("buscarLogotipo");
        this.b.setActionCommand("ACTION_LIMPAR_LOGO");
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.a.addItemListener((ItemListener)listener);
        this.b.addItemListener((ItemListener)listener);
        this.d.addItemListener((ItemListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void selecionaEstado(EstadoTO estadoTO) {
        this.d.setSelectedItem((Object)estadoTO);
    }

    public void selecionaPais(PaisTO paisTO) {
        this.b.setSelectedItem((Object)paisTO);
    }

    public void selecionaMunicipio(MunicipioTO municipioTO) {
        this.a.setSelectedItem((Object)municipioTO);
    }

    private byte[] a(BufferedImage bufImage) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write((RenderedImage)bufImage, "jpeg", baos);
            byte[] bytesOut = baos.toByteArray();
            return bytesOut;
        }
        catch (Exception baos) {
            return null;
        }
    }

    public EmitenteTO populaEmitenteTO() {
        EstadoTO estado;
        MunicipioTO municipio;
        try {
            this.a.setNrDocumento((String)this.a.stringToValue(this.c.getText()));
        }
        catch (ParseException ex) {
            this.a.setNrDocumento(null);
        }
        this.a.setTpDocumentoEnum(TipoDocumentoEnum.CNPJ);
        this.a.setIe(StringHelper.getNullIfEmpty((String)this.b.getText().trim()));
        this.a.setXNome(StringHelper.getNullIfEmpty((String)this.h.getText().trim()));
        this.a.setXFant(StringHelper.getNullIfEmpty((String)this.d.getText().trim()));
        this.a.setXLgr(StringHelper.getNullIfEmpty((String)this.g.getText().trim()));
        this.a.setNro(StringHelper.getNullIfEmpty((String)this.d.getText().trim()));
        this.a.setXCpl(StringHelper.getNullIfEmpty((String)this.c.getText().trim()));
        this.a.setXBairro(StringHelper.getNullIfEmpty((String)this.a.getText().trim()));
        this.a.setCnae(StringHelper.getNullIfEmpty((String)this.b.getText().trim()));
        this.a.setIest(StringHelper.getNullIfEmpty((String)this.e.getText()));
        this.a.setIm(StringHelper.getNullIfEmpty((String)this.f.getText()));
        this.a.setRegimeTributarioEnum((RegimeTributarioEnum)this.c.getSelectedItem());
        try {
            String tel = (String)this.a.stringToValue(this.e.getText().trim());
            this.a.setFone(StringHelper.getNullIfEmpty((String)tel));
        }
        catch (ParseException tel) {
            // empty catch block
        }
        ImageIcon img = (ImageIcon)this.a.getIcon();
        if (img != null) {
            this.a.setLogotipo(this.a(this.a(img.getImage(), 100, 100)));
        } else {
            this.a.setLogotipo(null);
        }
        PaisTO pais = (PaisTO)this.b.getSelectedItem();
        if (pais != null) {
            this.a.setCPais(pais.getCodigo());
            this.a.setXPais(pais.getNome());
        }
        if ((estado = (EstadoTO)this.d.getSelectedItem()) != null) {
            this.a.setUf(estado.getSigla());
        }
        if ((municipio = (MunicipioTO)this.a.getSelectedItem()) != null) {
            this.a.setCMun(municipio.getCodigo());
            this.a.setXMun(municipio.getNome());
        }
        try {
            String cep = (String)this.a.stringToValue(this.a.getText().trim());
            this.a.setCep(StringHelper.getNullIfEmpty((String)cep));
        }
        catch (ParseException cep) {
            // empty catch block
        }
        this.a.clearErrors();
        this.a.clearMessages();
        return this.a;
    }

    public void firePropertyChange(String propertyActionStr) {
        this.firePropertyChange(propertyActionStr, (Object)null, (Object)null);
    }

    public void ativaModoDetalhe() {
        this.a.setActionCommand("editar");
        this.a.setText(DSENLabelConstants.EDITAR);
        this.disableComponents("DETALHE_EMITENTE_CAMPOS_INATIVOS");
        this.enableComponents("DETALHE_EMITENTE_CAMPOS_ATIVOS");
    }

    public void ativaModoDetalheEmitenteLogado() {
        this.a.setActionCommand("editar");
        this.a.setText(DSENLabelConstants.EDITAR);
        this.disableComponents("DETALHE_EMITENTE_SELECIONADO_CAMPOS_INATIVOS");
        this.enableComponents("DETALHE_EMITENTE_SELECIONADO_CAMPOS_ATIVOS");
        this.f.setName(DSENLabelConstants.FECHAR);
    }

    public void ativaModoInclusao() {
        this.a.setActionCommand("incluir");
        this.a.setText(DSENLabelConstants.INCLUIR);
        this.c.setVisible(false);
        this.d.setVisible(false);
    }

    public void ativaModoEdicao() {
        this.a.setActionCommand("alterar");
        this.a.setText(DSENLabelConstants.ALTERAR);
        this.disableComponents("EDICAO_EMITENTE_CAMPOS_INATIVOS");
        this.enableComponents("EDICAO_EMITENTE_CAMPOS_ATIVOS");
    }

    public void ativaModoEdicaoEmitenteSelecionado() {
        this.a.setActionCommand("alterar");
        this.a.setText(DSENLabelConstants.ALTERAR);
        this.disableComponents("EDICAO_EMITENTE_SELECIONADO_CAMPOS_INATIVOS");
        this.enableComponents("EDICAO_EMITENTE_SELECIONADO_CAMPOS_ATIVOS");
    }

    public void atualizaListaEstados(List<EstadoTO> estado) {
        this.d.removeAllItems();
        this.a.removeAllItems();
        if (estado != null) {
            this.d.addItem(new EstadoTO("", "", ""));
            for (int i = 0; i < estado.size(); ++i) {
                this.d.addItem(estado.get(i));
            }
        }
    }

    public void atualizaListaMunicipios(List<MunicipioTO> municipioLst) {
        this.a.removeAllItems();
        if (municipioLst != null) {
            MunicipioTO municipioTO = new MunicipioTO();
            municipioTO.setCodigo("");
            municipioTO.setNome("");
            municipioLst.add(0, municipioTO);
            for (int i = 0; i < municipioLst.size(); ++i) {
                this.a.addItem(municipioLst.get(i));
            }
        }
    }

    private void d() {
        this.a = new JButton();
        this.c = new JButton();
        this.d = new JButton();
        this.f = new JButton();
        this.a = new JPanel();
        this.n = new JLabel();
        this.h = new JTextField();
        ((AbstractDocument)this.h.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.d = new JTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.h = new JLabel();
        this.e = new JLabel();
        this.c = new JFormattedTextField();
        this.a.install(this.c);
        this.i = new JLabel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}", 14));
        this.f = new JTextField();
        ((AbstractDocument)this.f.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(15));
        this.k = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(7));
        this.d = new JLabel();
        this.j = new JLabel();
        this.e = new JTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(14));
        this.q = new JLabel();
        this.c = new JComboBox();
        this.b = new JPanel();
        this.l = new JLabel();
        this.g = new JTextField();
        ((AbstractDocument)this.g.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.o = new JLabel();
        this.d = new JFormattedTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 9));
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.f = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.c = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.g = new JLabel();
        this.p = new JLabel();
        this.b = new JComboBox();
        this.s = new JLabel();
        this.d = new JComboBox();
        this.m = new JLabel();
        this.a = new JComboBox();
        this.r = new JLabel();
        this.e = new JFormattedTextField();
        this.c = new JPanel();
        this.a = new JLabel();
        this.e = new JButton();
        this.b = new JButton();
        this.b = new JLabel();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Cadastro de Emitente", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.a.setText("Editar");
        this.c.setText("Excluir");
        this.d.setText("Exportar");
        this.f.setText("Fechar");
        this.a.setBorder(BorderFactory.createTitledBorder("Emitente"));
        this.n.setFont(new Font("Tahoma", 1, 11));
        this.n.setText("* Nome/Raz\u00e3o Social");
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("Nome Fantasia");
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* CNPJ");
        this.c.setHorizontalAlignment(4);
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("* Inscri\u00e7\u00e3o Estadual");
        this.b.setHorizontalAlignment(4);
        this.f.setHorizontalAlignment(4);
        this.k.setFont(new Font("Tahoma", 1, 11));
        this.k.setText("Inscri\u00e7\u00e3o Municipal");
        this.b.setHorizontalAlignment(4);
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("CNAE Fiscal");
        this.j.setFont(new Font("Tahoma", 1, 11));
        this.j.setText("Inscri\u00e7\u00e3o Estadual (Subst. Tribut\u00e1rio)");
        this.e.setHorizontalAlignment(4);
        this.q.setFont(new Font("Tahoma", 1, 11));
        this.q.setText("* Regime Tribut\u00e1rio");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.n).addComponent(this.h, -2, 90, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, -1, 523, 32767).addComponent(this.h, -1, 523, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, -2, 70, -2).addComponent(this.e)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.b).addComponent(this.c, -2, 186, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.k).addComponent(this.i)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.f).addComponent(this.b, -2, 197, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 68, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.j, -2, 220, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 236, -2))).addGap(26, 26, 26)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.q).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 414, -2).addContainerGap(142, 32767)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.n).addComponent(this.h, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.d, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.i).addComponent(this.c, -2, -1, -2).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.b, -2, -1, -2)).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.k).addComponent(this.f, -2, 19, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j).addComponent(this.e, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.q).addComponent(this.c, -2, -1, -2)).addContainerGap(-1, 32767)));
        this.b.setBorder(BorderFactory.createTitledBorder("Endere\u00e7o"));
        this.l.setFont(new Font("Tahoma", 1, 11));
        this.l.setText("* Logradouro");
        this.o.setFont(new Font("Tahoma", 1, 11));
        this.o.setText("* N\u00famero");
        this.d.setHorizontalAlignment(4);
        this.d.setMaximumSize(new Dimension(4, 19));
        this.a.setHorizontalAlignment(4);
        this.a.setMaximumSize(new Dimension(4, 19));
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("CEP");
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("* Bairro");
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("Complemento");
        this.p.setFont(new Font("Tahoma", 1, 11));
        this.p.setText("Pa\u00eds");
        this.b.setEnabled(false);
        this.s.setFont(new Font("Tahoma", 1, 11));
        this.s.setText("* UF");
        this.m.setFont(new Font("Tahoma", 1, 11));
        this.m.setText("* Munic\u00edpio");
        this.r.setFont(new Font("Tahoma", 1, 11));
        this.r.setText("Telefone");
        this.e.setHorizontalAlignment(4);
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}", 14));
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.p).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g).addComponent(this.r).addComponent(this.l)).addGap(10, 10, 10).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e, -2, 158, -2).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.b, 0, 178, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.s).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 50, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.m).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, 0, 242, 32767)).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.g, GroupLayout.Alignment.LEADING, -1, 384, 32767).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.c, -1, 181, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 151, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.o).addComponent(this.f)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.d, -1, -1, 32767).addComponent(this.a, -2, 127, -2)))))).addContainerGap()));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g, -2, -1, -2).addComponent(this.o).addComponent(this.d, -2, -1, -2).addComponent(this.l)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g).addComponent(this.c, -2, -1, -2).addComponent(this.c, -2, 20, -2).addComponent(this.a, -2, -1, -2).addComponent(this.f).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.p).addComponent(this.b, -2, -1, -2).addComponent(this.s).addComponent(this.d, -2, -1, -2).addComponent(this.m, -2, 20, -2).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.r, -2, 20, -2).addComponent(this.e, -2, -1, -2))));
        this.c.setBorder(BorderFactory.createTitledBorder("Logotipo"));
        this.a.setFont(new Font("Dialog", 1, 10));
        this.a.setForeground(new Color(153, 153, 153));
        this.a.setHorizontalAlignment(0);
        this.a.setText("Sem logotipo");
        this.a.setBorder(BorderFactory.createEtchedBorder());
        this.a.setHorizontalTextPosition(0);
        this.a.setMaximumSize(new Dimension(100, 100));
        this.a.setMinimumSize(new Dimension(100, 100));
        this.a.setOpaque(true);
        this.a.setPreferredSize(new Dimension(100, 100));
        this.e.setText("Selecionar Imagem...");
        this.b.setText("Deixar em Branco");
        GroupLayout jPanel3Layout = new GroupLayout(this.c);
        this.c.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, 100, -2).addGap(41, 41, 41).addComponent(this.e, -2, 170, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap(238, 32767)));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, 100, -2).addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup().addContainerGap(35, 32767).addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.b)).addGap(43, 43, 43)));
        this.b.setFont(new Font("Dialog", 0, 10));
        this.b.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.c, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.b, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 222, 32767).addComponent(this.b))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, -1, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addGap(13, 13, 13).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.c).addComponent(this.d).addComponent(this.f)).addContainerGap(-1, 32767)).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap()))));
    }

    public void atualizaListaPaises(List listaPais) {
        this.b.removeAllItems();
        this.d.removeAllItems();
        this.a.removeAllItems();
        if (listaPais != null) {
            for (int i = 0; i < listaPais.size(); ++i) {
                this.b.addItem(listaPais.get(i));
            }
        }
    }

    public void setEmitenteTO(EmitenteTO emitente) {
        this.a = emitente;
    }

    public EmitenteTO getEmitenteTO() {
        return this.a;
    }

    public void carregaCamposEmitente() {
        if (this.a == null) {
            return;
        }
        this.c.setText(this.a.getNrDocumento());
        this.b.setText(this.a.getIe());
        this.e.setText(this.a.getIest());
        this.h.setText(this.a.getXNome());
        this.a = this.a.getLogotipo();
        this.d.setText(this.a.getXFant());
        this.g.setText(this.a.getXLgr());
        this.c.setSelectedItem((Object)this.a.getRegimeTributarioEnum());
        this.d.setText(this.a.getNro());
        this.c.setText(this.a.getXCpl());
        this.a.setText(this.a.getXBairro());
        this.a.setText(this.a.getCep());
        if (this.a.getLogotipo() == null) {
            this.a.setText(DSENLabelConstants.SEM_LOGOTIPO);
            this.a.setIcon(null);
        } else {
            this.a.setText(null);
            this.a.setIcon(new ImageIcon(this.a.getLogotipo()));
        }
        if (this.a.getFone() != null) {
            this.e.setText(this.a.getFone().toString());
        }
        this.f.setText(this.a.getIm());
        if (this.a.getCnae() != null) {
            this.b.setText(this.a.getCnae().toString());
        }
    }

    public void setLogotipo(byte[] imagemBuffer) {
        if (imagemBuffer == null) {
            this.a.setText(DSENLabelConstants.SEM_LOGOTIPO);
            this.a.setIcon(null);
            return;
        }
        this.a = imagemBuffer;
        this.a.setText(null);
        ImageIcon icon = new ImageIcon(this.a);
        BufferedImage img = this.a(icon.getImage(), 100, 100);
        this.a.setIcon(new ImageIcon(img));
    }

    private BufferedImage a(Image image, int width, int height) {
        int imageHeight;
        double thumbRatio = (double)width / (double)height;
        int imageWidth = image.getWidth(null);
        double imageRatio = (double)imageWidth / (double)(imageHeight = image.getHeight(null));
        if (thumbRatio < imageRatio) {
            height = (int)((double)width / imageRatio);
        } else {
            width = (int)((double)height * imageRatio);
        }
        BufferedImage thumbImage = new BufferedImage(width, height, 1);
        Graphics2D graphics2D = thumbImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(image, 0, 0, width, height, null);
        return thumbImage;
    }

    public byte[] getImageBuffer() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public void setOperacao(String operacao) {
        this.a = operacao;
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.c) {
            String cnpj = null;
            try {
                cnpj = this.a.stringToValue(this.c.getText()).toString();
            }
            catch (ParseException parseException) {
                // empty catch block
            }
            if (!StringHelper.isBlankOrNull((Object)cnpj)) {
                this.c.setText(StringHelper.completaComZerosAEsquerda((String)cnpj, (int)14));
            }
        } else if (e.getSource() == this.b && !StringHelper.isBlankOrNull((Object)this.b.getText())) {
            this.b.setText(StringHelper.completaComZerosAEsquerda((String)this.b.getText(), (int)7));
        }
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

