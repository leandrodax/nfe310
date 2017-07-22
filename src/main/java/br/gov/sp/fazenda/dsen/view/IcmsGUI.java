/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModBCEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModBcstEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.MotivoDesoneracaoICMSEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.IcmsGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModBCEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ModBcstEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.MotivoDesoneracaoICMSEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.ItemSelectable;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

public class IcmsGUI
extends DSGESimplePanel
implements ItemListener {
    private static final long a = -3793347951268292274L;
    private JButton a;
    private JButton b;
    private JComboBox a;
    private JComboBox b;
    private JComboBox c;
    private JComboBox d;
    private JComboBox e;
    private JComboBox f;
    private JComboBox g;
    private JComboBox h;
    private JComboBox i;
    private JComboBox j;
    private JComboBox k;
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
    private JLabel t;
    private JLabel u;
    private JLabel v;
    private JLabel w;
    private JLabel x;
    private JLabel y;
    private JLabel z;
    private JPanel b;
    private JPanel c;
    private JPanel d;
    private JPanel e;
    private JPanel f;
    private JPanel g;
    private JPanel h;
    private JFormattedTextField a;
    private JFormattedTextField b;
    private JFormattedTextField c;
    private JFormattedTextField d;
    private JFormattedTextField e;
    private JFormattedTextField f;
    private JFormattedTextField g;
    private JFormattedTextField h;
    private JFormattedTextField i;
    private JFormattedTextField j;
    private JFormattedTextField k;
    private JFormattedTextField l;
    private JTextField a;
    private JTextField b;
    private String a;
    private ProdutoTO a;
    private IcmsTO a;
    private Map<String, JComponent[]> a;

    public IcmsGUI(String operacao, ProdutoTO produtoTO) throws DSGEViewException {
        this.a = operacao;
        this.a = produtoTO;
        this.e();
        this.c();
        this.b();
        this.d();
        this.a();
        this.bindController((ViewItf)this);
        this.a.setText(produtoTO.getCProd());
        this.b.setText(produtoTO.getXProd());
        this.f();
    }

    private void a() {
        this.a.addItemListener((ItemListener)this);
        this.b.addItemListener((ItemListener)this);
        this.f.addItemListener((ItemListener)this);
    }

    private void b() {
        this.b.setActionCommand("voltar");
        this.a.setActionCommand(this.a);
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("insertICMS", new JComponent[]{this.a, this.f, this.b});
        this.a.put("updateICMS", new JComponent[]{this.a, this.f, this.b});
        this.a.put("produtoNotaTributoICMSTodos", new JComponent[]{this.f, this.g, this.t, this.s, this.p, this.q, this.i, this.h, this.g, this.g, this.z, this.v, this.w, this.x, this.y, this.k, this.j, this.j, this.k, this.l, this.r, this.h, this.d, this.e, this.j, this.g, this.i, this.c, this.c, this.d, this.m, this.n, this.e, this.l, this.f, this.e, this.f, this.a, this.e, this.b});
        this.a.put(CSTEnum._00.getDescricao(), new JComponent[]{this.f, this.p, this.q, this.g, this.g});
        this.a.put(CSTEnum._10.getDescricao(), new JComponent[]{this.f, this.g, this.p, this.q, this.g, this.g, this.v, this.w, this.x, this.y, this.j, this.j, this.k, this.l});
        this.a.put(CSTEnum._10_Part.getDescricao(), new JComponent[]{this.f, this.g, this.t, this.s, this.p, this.q, this.i, this.h, this.g, this.g, this.z, this.v, this.w, this.x, this.y, this.k, this.j, this.j, this.k, this.l});
        this.a.put(CSTEnum._20.getDescricao(), new JComponent[]{this.f, this.s, this.p, this.q, this.h, this.g, this.g});
        this.a.put(CSTEnum._30.getDescricao(), new JComponent[]{this.g, this.v, this.w, this.x, this.y, this.j, this.j, this.k, this.l});
        this.a.put(CSTEnum._40.getDescricao(), new JComponent[]{this.f, this.r, this.h});
        this.a.put(CSTEnum._41.getDescricao(), new JComponent[]{this.f, this.r, this.h});
        this.a.put(CSTEnum._41_ST.getDescricao(), new JComponent[0]);
        this.a.put(CSTEnum._50.getDescricao(), new JComponent[]{this.f, this.r, this.h});
        this.a.put(CSTEnum._51.getDescricao(), new JComponent[]{this.f, this.s, this.p, this.q, this.h, this.g, this.g});
        this.a.put(CSTEnum._60.getDescricao(), new JComponent[0]);
        this.a.put(CSTEnum._70.getDescricao(), new JComponent[]{this.f, this.g, this.s, this.p, this.q, this.h, this.g, this.g, this.v, this.w, this.x, this.y, this.j, this.j, this.k, this.l});
        this.a.put(CSTEnum._90.getDescricao(), new JComponent[]{this.f, this.g, this.s, this.p, this.q, this.h, this.g, this.g, this.v, this.w, this.x, this.y, this.j, this.j, this.k, this.l});
        this.a.put(CSTEnum._90_Part.getDescricao(), new JComponent[]{this.f, this.g, this.t, this.s, this.p, this.q, this.i, this.h, this.g, this.g, this.z, this.v, this.w, this.x, this.y, this.k, this.j, this.j, this.k, this.l});
        this.a.put(CSOSNEnum._101.getDescricao(), new JComponent[]{this.f, this.b});
        this.a.put(CSOSNEnum._102.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._103.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._201.getDescricao(), new JComponent[]{this.e, this.m, this.n, this.e, this.l, this.f, this.e, this.f, this.a, this.e, this.b});
        this.a.put(CSOSNEnum._202.getDescricao(), new JComponent[]{this.e, this.m, this.n, this.e, this.l, this.e, this.f, this.a, this.e});
        this.a.put(CSOSNEnum._203.getDescricao(), new JComponent[]{this.e, this.m, this.n, this.e, this.l, this.e, this.f, this.a, this.e});
        this.a.put(CSOSNEnum._300.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._400.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._500.getDescricao(), new JComponent[0]);
        this.a.put(CSOSNEnum._900.getDescricao(), new JComponent[]{this.d, this.e, this.j, this.g, this.i, this.c, this.c, this.d, this.m, this.n, this.e, this.l, this.f, this.e, this.f, this.a, this.e, this.b});
    }

    public void setListaICMSCST(CSTEnum[] lista) {
        this.f.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.f.addItem(lista[i]);
            }
        }
        this.f.setSelectedIndex(-1);
    }

    public void setListaTipoTributacao(TipoTributacaoEnum[] lista) {
        this.a.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.a.addItem(lista[i]);
            }
        }
        this.a.setSelectedIndex(-1);
    }

    public void setListaCSOSN(CSOSNEnum[] lista) {
        this.b.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.b.addItem(lista[i]);
            }
        }
        this.b.setSelectedIndex(-1);
    }

    public void setListaICMSModBC(ModBCEnum[] lista) {
        int i;
        this.g.removeAllItems();
        this.g.addItem(null);
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.g.addItem(lista[i]);
            }
        }
        this.g.setSelectedIndex(-1);
        this.c.removeAllItems();
        this.c.addItem(null);
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.c.addItem(lista[i]);
            }
        }
        this.c.setSelectedIndex(-1);
    }

    public void setListaICMSModBCST(ModBcstEnum[] lista) {
        int i;
        this.j.removeAllItems();
        this.j.addItem(null);
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.j.addItem(lista[i]);
            }
        }
        this.j.setSelectedIndex(-1);
        this.e.removeAllItems();
        this.e.addItem(null);
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.e.addItem(lista[i]);
            }
        }
        this.e.setSelectedIndex(-1);
    }

    public void setListaICMSOrigem(OrigemMercadoriaEnum[] lista) {
        int i;
        this.i.removeAllItems();
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.i.addItem(lista[i]);
            }
        }
        this.i.setSelectedIndex(-1);
        this.d.removeAllItems();
        if (lista != null) {
            for (i = 0; i < lista.length; ++i) {
                this.d.addItem(lista[i]);
            }
        }
        this.d.setSelectedIndex(-1);
    }

    public void setListaSTUFDevido(List<EstadoTO> lista) {
        this.k.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                this.k.addItem(lista.get(i));
            }
        }
        this.k.setSelectedIndex(-1);
    }

    public void setListaMotivoDesoneracaoICMS(MotivoDesoneracaoICMSEnum[] lista) {
        this.h.removeAllItems();
        if (lista != null) {
            for (int i = 0; i < lista.length; ++i) {
                this.h.addItem(lista[i]);
            }
        }
        this.h.setSelectedIndex(-1);
    }

    private void d() {
        this.setListaCSOSN(CSOSNEnum.values());
        this.setListaICMSCST(CSTEnum.values());
        this.setListaICMSModBC(ModBCEnum.values());
        this.setListaICMSModBCST(ModBcstEnum.values());
        this.setListaTipoTributacao(TipoTributacaoEnum.values());
        this.setListaICMSOrigem(OrigemMercadoriaEnum.values());
        this.setListaMotivoDesoneracaoICMS(MotivoDesoneracaoICMSEnum.values());
        try {
            this.setListaSTUFDevido(DSENUtilHelper.getInstance().getEstadoTO(true));
        }
        catch (DSGEUtilException e) {
            this.showErrors((DSGEBaseException)e);
        }
    }

    private void e() {
        this.b = new JButton();
        this.a = new JButton();
        this.a = new JLabel();
        this.b = new JPanel();
        this.b = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(60));
        this.c = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(120));
        this.h = new JPanel();
        this.o = new JLabel();
        this.f = new JComboBox();
        this.u = new JLabel();
        this.i = new JComboBox();
        this.f = new JPanel();
        this.q = new JLabel();
        this.g = new JComboBox();
        this.s = new JLabel();
        this.h = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.h, (int)3, (int)2);
        this.p = new JLabel();
        this.g = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.g, (int)3, (int)2);
        this.t = new JLabel();
        this.i = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.i, (int)3, (int)2);
        this.r = new JLabel();
        this.h = new JComboBox();
        this.g = new JPanel();
        this.w = new JLabel();
        this.j = new JComboBox();
        this.y = new JLabel();
        this.l = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.l, (int)3, (int)2);
        this.x = new JLabel();
        this.k = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.k, (int)3, (int)2);
        this.v = new JLabel();
        this.j = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.j, (int)3, (int)2);
        this.z = new JLabel();
        this.k = new JComboBox();
        this.c = new JPanel();
        this.h = new JLabel();
        this.b = new JComboBox();
        this.k = new JLabel();
        this.d = new JComboBox();
        this.f = new JLabel();
        this.b = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.b, (int)3, (int)2);
        this.a = new JPanel();
        this.d = new JPanel();
        this.j = new JLabel();
        this.c = new JComboBox();
        this.g = new JLabel();
        this.c = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.c, (int)3, (int)2);
        this.i = new JLabel();
        this.d = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.d, (int)3, (int)2);
        this.e = new JPanel();
        this.m = new JLabel();
        this.e = new JComboBox();
        this.e = new JLabel();
        this.a = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.a, (int)3, (int)2);
        this.n = new JLabel();
        this.f = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.f, (int)3, (int)2);
        this.l = new JLabel();
        this.e = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.e, (int)3, (int)2);
        this.d = new JLabel();
        this.a = new JComboBox();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Cadastro de ICMS", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.b.setText("Cancelar");
        this.a.setText("Salvar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Produto", 1, 2));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("C\u00f3digo");
        this.a.setEnabled(false);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Descri\u00e7\u00e3o");
        this.b.setEnabled(false);
        GroupLayout pnlProdutoLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlProdutoLayout);
        pnlProdutoLayout.setHorizontalGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutoLayout.createSequentialGroup().addContainerGap().addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutoLayout.createSequentialGroup().addComponent(this.b).addGap(24, 24, 24).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, GroupLayout.Alignment.TRAILING, -1, 804, 32767).addComponent(this.a, -1, 804, 32767))).addComponent(this.c)).addContainerGap()));
        pnlProdutoLayout.setVerticalGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutoLayout.createSequentialGroup().addContainerGap().addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addContainerGap(13, 32767)));
        this.h.setBorder(BorderFactory.createTitledBorder("Tributa\u00e7\u00e3o Normal"));
        this.o.setFont(new Font("Tahoma", 1, 11));
        this.o.setText("* Situa\u00e7\u00e3o tribut\u00e1ria");
        this.u.setFont(new Font("Tahoma", 1, 11));
        this.u.setText("Origem");
        this.f.setBorder(BorderFactory.createTitledBorder("ICMS"));
        this.q.setFont(new Font("Tahoma", 1, 11));
        this.q.setText("Modalid. de determ. da BC ICMS");
        this.s.setFont(new Font("Tahoma", 1, 11));
        this.s.setText("% redu\u00e7\u00e3o da BC ICMS");
        this.h.setHorizontalAlignment(4);
        this.p.setFont(new Font("Tahoma", 1, 11));
        this.p.setText("Al\u00edquota do ICMS");
        this.g.setHorizontalAlignment(4);
        this.t.setFont(new Font("Tahoma", 1, 11));
        this.t.setText("% BC da opera\u00e7\u00e3o pr\u00f3pria");
        this.i.setHorizontalAlignment(4);
        this.r.setFont(new Font("Tahoma", 1, 11));
        this.r.setText("Motivo da Desonera\u00e7\u00e3o do ICMS");
        this.h.setMaximumSize(new Dimension(400, 20));
        GroupLayout pnlTribNormICMSLayout = new GroupLayout(this.f);
        this.f.setLayout(pnlTribNormICMSLayout);
        pnlTribNormICMSLayout.setHorizontalGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.s, -1, -1, 32767)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addGap(12, 12, 12).addComponent(this.q, -1, -1, 32767))).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.p, -2, 188, -2)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.t, -2, 188, -2)).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.r, -2, 188, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.g, 0, 195, 32767).addComponent(this.h, -2, 188, -2).addComponent(this.g, -2, 188, -2).addComponent(this.i, -2, 188, -2).addComponent(this.h, 0, 195, 32767)).addContainerGap(15, 32767)));
        pnlTribNormICMSLayout.linkSize(0, this.p, this.q, this.r, this.s, this.t);
        pnlTribNormICMSLayout.linkSize(0, this.g, this.h, this.g, this.h, this.i);
        pnlTribNormICMSLayout.setVerticalGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSLayout.createSequentialGroup().addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.q, -2, 19, -2).addComponent(this.g, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.s, -2, 19, -2).addComponent(this.h, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.p, -2, 19, -2).addComponent(this.g, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.t, -2, 19, -2).addComponent(this.i, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.r, -2, 19, -2).addComponent(this.h, -2, 16, -2))));
        this.g.setBorder(BorderFactory.createTitledBorder("ICMS ST"));
        this.w.setFont(new Font("Tahoma", 1, 11));
        this.w.setText("Modalid. de determ. da BC ICMS ST");
        this.y.setFont(new Font("Tahoma", 1, 11));
        this.y.setText("% redu\u00e7\u00e3o da BC ICMS ST");
        this.l.setHorizontalAlignment(4);
        this.x.setFont(new Font("Tahoma", 1, 11));
        this.x.setText("% margem de valor adic. ICMS ST");
        this.k.setHorizontalAlignment(4);
        this.v.setFont(new Font("Tahoma", 1, 11));
        this.v.setText("Al\u00edquota do ICMS ST");
        this.j.setHorizontalAlignment(4);
        this.z.setFont(new Font("Tahoma", 1, 11));
        this.z.setText("UF do ICMS ST devido na opera\u00e7\u00e3o");
        GroupLayout pnlTribNormICMSSTLayout = new GroupLayout(this.g);
        this.g.setLayout(pnlTribNormICMSSTLayout);
        pnlTribNormICMSSTLayout.setHorizontalGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addContainerGap().addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.v, -1, -1, 32767).addComponent(this.x, -1, -1, 32767).addComponent(this.y, -1, -1, 32767).addComponent(this.w, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.j).addComponent(this.l, -1, 187, 32767).addComponent(this.j, 0, 187, 32767).addComponent(this.k, -1, 187, 32767))).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addComponent(this.z).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k, -2, 55, -2))).addContainerGap()));
        pnlTribNormICMSSTLayout.linkSize(0, this.v, this.w, this.x, this.y, this.z);
        pnlTribNormICMSSTLayout.setVerticalGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormICMSSTLayout.createSequentialGroup().addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.w, -2, 19, -2).addComponent(this.j, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.y, -2, 19, -2).addComponent(this.l, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.x, -2, 19, -2).addComponent(this.k, -2, 16, -2)).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j, -2, 16, -2).addComponent(this.v, -2, 19, -2)).addGap(0, 0, 0).addGroup(pnlTribNormICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.z, -2, 19, -2).addComponent(this.k, -2, 16, -2))));
        GroupLayout pnlTribNormalLayout = new GroupLayout(this.h);
        this.h.setLayout(pnlTribNormalLayout);
        pnlTribNormalLayout.setHorizontalGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormalLayout.createSequentialGroup().addContainerGap().addGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormalLayout.createSequentialGroup().addComponent(this.f, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g, -1, -1, 32767)).addGroup(pnlTribNormalLayout.createSequentialGroup().addComponent(this.o).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, 0, 458, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.u).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.i, -2, 215, -2))).addContainerGap()));
        pnlTribNormalLayout.setVerticalGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTribNormalLayout.createSequentialGroup().addGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE, false).addComponent(this.o).addComponent(this.u).addComponent(this.f, -2, 16, -2).addComponent(this.i, -2, 16, -2)).addGap(4, 4, 4).addGroup(pnlTribNormalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g, 0, 125, 32767).addComponent(this.f, -1, 125, 32767)).addContainerGap()));
        this.c.setBorder(BorderFactory.createTitledBorder("Simples Nacional"));
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("* Situa\u00e7\u00e3o tribut\u00e1ria");
        this.k.setFont(new Font("Tahoma", 1, 11));
        this.k.setText("Origem");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("Al\u00edquota aplic\u00e1vel de c\u00e1lculo do cr\u00e9dito");
        this.b.setHorizontalAlignment(4);
        this.d.setBorder(BorderFactory.createTitledBorder("ICMS"));
        this.j.setFont(new Font("Tahoma", 1, 11));
        this.j.setText("Modalid. de determ. da BC ICMS");
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("% redu\u00e7\u00e3o da BC ICMS");
        this.c.setHorizontalAlignment(4);
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("Al\u00edquota do ICMS");
        this.d.setHorizontalAlignment(4);
        GroupLayout pnlSimplesNacionalICMSLayout = new GroupLayout(this.d);
        this.d.setLayout(pnlSimplesNacionalICMSLayout);
        pnlSimplesNacionalICMSLayout.setHorizontalGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalICMSLayout.createSequentialGroup().addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(GroupLayout.Alignment.TRAILING, pnlSimplesNacionalICMSLayout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.i, -2, 178, -2)).addGroup(pnlSimplesNacionalICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.g, -1, -1, 32767)).addGroup(pnlSimplesNacionalICMSLayout.createSequentialGroup().addGap(12, 12, 12).addComponent(this.j, -1, -1, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, -2, 144, -2).addComponent(this.c, -2, 188, -2).addComponent(this.d, -2, 108, -2)).addGap(20, 20, 20)));
        pnlSimplesNacionalICMSLayout.linkSize(0, this.g, this.i, this.j);
        pnlSimplesNacionalICMSLayout.linkSize(0, this.c, this.c, this.d);
        pnlSimplesNacionalICMSLayout.setVerticalGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalICMSLayout.createSequentialGroup().addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.j, -2, 19, -2).addComponent(this.c, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g, -2, 19, -2).addComponent(this.c, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.i, -2, 19, -2).addComponent(this.d, -2, 16, -2)).addContainerGap(31, 32767)));
        this.e.setBorder(BorderFactory.createTitledBorder("ICMS ST"));
        this.m.setFont(new Font("Tahoma", 1, 11));
        this.m.setText("Modalid. de determ. da BC ICMS ST");
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("% redu\u00e7\u00e3o da BC ICMS ST");
        this.a.setHorizontalAlignment(4);
        this.n.setFont(new Font("Tahoma", 1, 11));
        this.n.setText("% margem de valor adic. ICMS ST");
        this.f.setHorizontalAlignment(4);
        this.l.setFont(new Font("Tahoma", 1, 11));
        this.l.setText("Al\u00edquota do ICMS ST");
        this.e.setHorizontalAlignment(4);
        GroupLayout pnlSimplesNacionalICMSSTLayout = new GroupLayout(this.e);
        this.e.setLayout(pnlSimplesNacionalICMSSTLayout);
        pnlSimplesNacionalICMSSTLayout.setHorizontalGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalICMSSTLayout.createSequentialGroup().addContainerGap().addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.l, -1, -1, 32767).addComponent(this.n, -1, -1, 32767).addComponent(this.e, -1, -1, 32767).addComponent(this.m, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.e).addComponent(this.a, -1, 187, 32767).addComponent(this.e, 0, 187, 32767).addComponent(this.f, -1, 187, 32767)).addContainerGap(24, 32767)));
        pnlSimplesNacionalICMSSTLayout.linkSize(0, this.e, this.l, this.m, this.n);
        pnlSimplesNacionalICMSSTLayout.setVerticalGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalICMSSTLayout.createSequentialGroup().addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.m, -2, 19, -2).addComponent(this.e, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e, -2, 19, -2).addComponent(this.a, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.n, -2, 19, -2).addComponent(this.f, -2, 16, -2)).addGap(0, 0, 0).addGroup(pnlSimplesNacionalICMSSTLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.l, -2, 19, -2).addComponent(this.e, -2, 16, -2)).addContainerGap()));
        GroupLayout jPanel4Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addComponent(this.d, -1, 420, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -1, -1, 32767)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, -1, -1, 32767).addComponent(this.e, -1, -1, 32767));
        GroupLayout pnlSimplesNacionalLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlSimplesNacionalLayout);
        pnlSimplesNacionalLayout.setHorizontalGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlSimplesNacionalLayout.createSequentialGroup().addContainerGap().addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, pnlSimplesNacionalLayout.createSequentialGroup().addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, 0, 448, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 225, -2)).addGroup(GroupLayout.Alignment.LEADING, pnlSimplesNacionalLayout.createSequentialGroup().addComponent(this.f, -2, 244, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 155, -2))).addContainerGap()));
        pnlSimplesNacionalLayout.setVerticalGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlSimplesNacionalLayout.createSequentialGroup().addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE, false).addComponent(this.h).addComponent(this.k).addComponent(this.d, -2, 16, -2).addComponent(this.b, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlSimplesNacionalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f, -2, 19, -2).addComponent(this.b, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 112, 32767).addContainerGap()));
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("* Regime");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.c, GroupLayout.Alignment.LEADING, 0, -1, 32767).addComponent(this.h, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.a).addComponent(this.b, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b)).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 244, -2))).addContainerGap()));
        layout.linkSize(0, this.a, this.b);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.b, -2, -1, -2).addGap(10, 10, 10).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.a, -2, 16, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.a).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addGap(25, 25, 25)))));
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public void setProdutoTO(ProdutoTO produtoTO) {
        this.a = produtoTO;
    }

    public ProdutoTO getProdutoTO() {
        return this.a;
    }

    public void updateIcmsTO(IcmsTO icmsTO) {
        CSOSNEnum csosnEnum;
        ModBCEnum modBC = null;
        ModBcstEnum modBCST = null;
        OrigemMercadoriaEnum origemMercadoria = null;
        String pIcms = null;
        String pIcmsst = null;
        String pmVast = null;
        String pRedBc = null;
        String pRedBcst = null;
        String pBCOp = null;
        String pCredSN = null;
        TipoTributacaoEnum tipoTributacao = (TipoTributacaoEnum)this.a.getSelectedItem();
        MotivoDesoneracaoICMSEnum motDesEnum = null;
        EstadoTO ufIcmsDevido = null;
        if (TipoTributacaoEnum.NORMAL.equals((Object)tipoTributacao)) {
            CSTEnum cstEnum = (CSTEnum)this.f.getSelectedItem();
            if (cstEnum != null) {
                icmsTO.setCst(cstEnum.getCst());
                modBC = (ModBCEnum)this.g.getSelectedItem();
                modBCST = (ModBcstEnum)this.j.getSelectedItem();
                origemMercadoria = (OrigemMercadoriaEnum)this.i.getSelectedItem();
                motDesEnum = (MotivoDesoneracaoICMSEnum)this.h.getSelectedItem();
                ufIcmsDevido = (EstadoTO)this.k.getSelectedItem();
                pIcms = this.g.getText();
                pIcmsst = this.j.getText();
                pmVast = this.k.getText();
                pRedBc = this.h.getText();
                pRedBcst = this.l.getText();
                pBCOp = this.i.getText();
            }
        } else if (TipoTributacaoEnum.SIMPLES_NACIONAL.equals((Object)tipoTributacao) && (csosnEnum = (CSOSNEnum)this.b.getSelectedItem()) != null) {
            icmsTO.setCst(csosnEnum.getCsosn());
            modBC = (ModBCEnum)this.c.getSelectedItem();
            modBCST = (ModBcstEnum)this.e.getSelectedItem();
            origemMercadoria = (OrigemMercadoriaEnum)this.d.getSelectedItem();
            pIcms = this.d.getText();
            pIcmsst = this.e.getText();
            pmVast = this.f.getText();
            pRedBc = this.c.getText();
            pRedBcst = this.a.getText();
            pCredSN = this.b.getText();
        }
        icmsTO.setOrig(origemMercadoria != null ? origemMercadoria.getCodigo() : null);
        icmsTO.setModBc(modBC != null ? modBC.getCodigo() : null);
        icmsTO.setModBcst(modBCST != null ? modBCST.getCodigo() : null);
        icmsTO.setPIcms(!StringHelper.isBlankOrNull((Object)pIcms) ? StringHelper.formataValorXML((String)pIcms) : null);
        icmsTO.setPIcmsst(!StringHelper.isBlankOrNull((Object)pIcmsst) ? StringHelper.formataValorXML((String)pIcmsst) : null);
        icmsTO.setPMvast(!StringHelper.isBlankOrNull((Object)pmVast) ? StringHelper.formataValorXML((String)pmVast) : null);
        icmsTO.setPRedBc(!StringHelper.isBlankOrNull((Object)pRedBc) ? StringHelper.formataValorXML((String)pRedBc) : null);
        icmsTO.setPRedBcst(!StringHelper.isBlankOrNull((Object)pRedBcst) ? StringHelper.formataValorXML((String)pRedBcst) : null);
        icmsTO.setUFST(ufIcmsDevido != null ? ufIcmsDevido.getSigla() : null);
        icmsTO.setPBCOp(!StringHelper.isBlankOrNull((Object)pBCOp) ? StringHelper.formataValorXML((String)pBCOp) : null);
        icmsTO.setMotDesICMS(motDesEnum != null ? motDesEnum.getCodigo() : null);
        icmsTO.setPCredSN(!StringHelper.isBlankOrNull((Object)pCredSN) ? StringHelper.formataValorXML((String)pCredSN) : null);
    }

    public IcmsTO getIcmsTO() {
        if (this.a == null) {
            this.a = new IcmsTO();
        }
        this.updateIcmsTO(this.a);
        return this.a;
    }

    public void setIcmsTO(IcmsTO icmsTO) {
        this.a = icmsTO;
        if (icmsTO != null) {
            String codigoSituacaoTrib = icmsTO.getCst();
            if (!StringHelper.isBlankOrNull((Object)codigoSituacaoTrib)) {
                CSTEnum cstEnum = CSTEnum.getEnumPeloCodigo((String)codigoSituacaoTrib);
                if (cstEnum != null) {
                    this.a.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                    this.f.setSelectedItem((Object)cstEnum);
                    this.g.setSelectedItem((Object)(!StringHelper.isBlankOrNull((Object)icmsTO.getModBc()) ? ModBCEnum.getEnumPeloCodigo((String)icmsTO.getModBc()) : null));
                    this.j.setSelectedItem((Object)(!StringHelper.isBlankOrNull((Object)icmsTO.getModBcst()) ? ModBcstEnum.getEnumPeloCodigo((String)icmsTO.getModBcst()) : null));
                    this.i.setSelectedItem((Object)(!StringHelper.isBlankOrNull((Object)icmsTO.getOrig()) ? OrigemMercadoriaEnum.getEnumPeloCodigo((String)icmsTO.getOrig()) : null));
                    this.h.setSelectedItem((Object)(!StringHelper.isBlankOrNull((Object)icmsTO.getMotDesICMS()) ? MotivoDesoneracaoICMSEnum.getEnumPeloCodigo((String)icmsTO.getMotDesICMS()) : null));
                    try {
                        this.k.setSelectedItem((Object)(!StringHelper.isBlankOrNull((Object)icmsTO.getUFST()) ? DSENUtilHelper.getInstance().getEstadoTOBySigla(icmsTO.getUFST()) : null));
                    }
                    catch (DSGEUtilException e) {
                        this.showErrors((DSGEBaseException)e);
                    }
                    this.g.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPIcms()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPIcms(), (int)3, (int)2) : null);
                    this.j.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPIcmsst()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPIcmsst(), (int)3, (int)2) : null);
                    this.k.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPMvast()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPMvast(), (int)3, (int)2) : null);
                    this.h.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPRedBc()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPRedBc(), (int)3, (int)2) : null);
                    this.l.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPRedBcst()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPRedBcst(), (int)3, (int)2) : null);
                    this.i.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPBCOp()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPBCOp(), (int)3, (int)2) : null);
                } else {
                    CSOSNEnum csosEnum = CSOSNEnum.getEnumPeloCodigo((String)codigoSituacaoTrib);
                    if (csosEnum != null) {
                        this.a.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                        this.b.setSelectedItem((Object)csosEnum);
                        this.c.setSelectedItem((Object)(!StringHelper.isBlankOrNull((Object)icmsTO.getModBc()) ? ModBCEnum.getEnumPeloCodigo((String)icmsTO.getModBc()) : null));
                        this.e.setSelectedItem((Object)(!StringHelper.isBlankOrNull((Object)icmsTO.getModBcst()) ? ModBcstEnum.getEnumPeloCodigo((String)icmsTO.getModBcst()) : null));
                        this.d.setSelectedItem((Object)(!StringHelper.isBlankOrNull((Object)icmsTO.getOrig()) ? OrigemMercadoriaEnum.getEnumPeloCodigo((String)icmsTO.getOrig()) : null));
                        this.d.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPIcms()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPIcms(), (int)3, (int)2) : null);
                        this.e.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPIcmsst()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPIcmsst(), (int)3, (int)2) : null);
                        this.f.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPMvast()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPMvast(), (int)3, (int)2) : null);
                        this.c.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPRedBc()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPRedBc(), (int)3, (int)2) : null);
                        this.a.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPRedBcst()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPRedBcst(), (int)3, (int)2) : null);
                        this.b.setText(!StringHelper.isBlankOrNull((Object)icmsTO.getPCredSN()) ? NumberFormatterHelper.formatStringAsNumber((String)icmsTO.getPCredSN(), (int)3, (int)2) : null);
                    }
                }
            } else {
                this.a.setSelectedItem(null);
                this.b.setSelectedItem(null);
                this.f.setSelectedItem(null);
                this.f();
            }
        }
    }

    public void firePropertyChange(String property) {
        this.firePropertyChange(property, (Object)null, new ArrayList(this.a.getIcmsTOSet()));
    }

    public CSTEnum getICMSEnumCst() {
        CSTEnum icms = null;
        if (this.a != null) {
            CSTEnum[] icmsEnums = CSTEnum.values();
            for (int i = 0; i < icmsEnums.length; ++i) {
                if (icmsEnums[i].getCst() != this.a.getCst()) continue;
                icms = icmsEnums[i];
                break;
            }
        }
        return icms;
    }

    public void setBtnVoltarTitle(String title) {
        this.b.setText(title);
    }

    public void setBtnSalvarTitle(String title) {
        this.a.setText(title);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == 1) {
            if (this.a == e.getSource()) {
                if (TipoTributacaoEnum.NORMAL.equals(e.getItem())) {
                    this.c.setVisible(false);
                    this.h.setVisible(true);
                } else if (TipoTributacaoEnum.SIMPLES_NACIONAL.equals(e.getItem())) {
                    this.h.setVisible(false);
                    this.c.setVisible(true);
                }
            } else if (this.b == e.getSource()) {
                this.limparCamposCSOSN();
                this.setComponentsVisible("produtoNotaTributoICMSTodos", false);
                if (e.getItem() != null) {
                    this.setComponentsVisible(((CSOSNEnum)e.getItem()).getDescricao(), true);
                }
            } else if (this.f == e.getSource()) {
                this.limparCamposCST();
                this.setComponentsVisible("produtoNotaTributoICMSTodos", false);
                if (e.getItem() != null) {
                    this.setComponentsVisible(((CSTEnum)e.getItem()).getDescricao(), true);
                }
            }
        }
    }

    public void setComponentsVisible(String key, boolean visible) {
        JComponent[] components;
        Map map = this.getMapComponents();
        if (map != null && (components = (JComponent[])map.get(key)) != null) {
            for (int i = 0; i < components.length; ++i) {
                components[i].setVisible(visible);
            }
        }
    }

    public void limparCamposCSOSN() {
        this.c.setSelectedIndex(-1);
        this.c.setText("");
        this.d.setText("");
        this.e.setSelectedIndex(-1);
        this.f.setText("");
        this.a.setText("");
        this.e.setText("");
        this.b.setText("");
    }

    public void limparCamposCST() {
        this.i.setText("");
        this.h.setText("");
        this.g.setText("");
        this.g.setSelectedIndex(-1);
        this.k.setSelectedIndex(-1);
        this.j.setText("");
        this.j.setSelectedIndex(-1);
        this.k.setText("");
        this.l.setText("");
        this.h.setSelectedIndex(-1);
    }

    public TipoTributacaoEnum getTipoTributacaoEnum() {
        return (TipoTributacaoEnum)this.a.getSelectedItem();
    }

    private void f() {
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        RegimeTributarioEnum regimeTributarioEmitente = RegimeTributarioEnum.getEnumPeloCodigo((String)emitenteTO.getCRT());
        if (regimeTributarioEmitente != null) {
            if (RegimeTributarioEnum.SN_1.equals((Object)regimeTributarioEmitente)) {
                this.a.setSelectedItem((Object)TipoTributacaoEnum.SIMPLES_NACIONAL);
                this.itemStateChanged(new ItemEvent(this.b, -1, null, 1));
            } else {
                this.a.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
                this.itemStateChanged(new ItemEvent(this.f, -1, null, 1));
            }
        } else {
            this.a.setSelectedItem((Object)TipoTributacaoEnum.NORMAL);
            this.itemStateChanged(new ItemEvent(this.f, -1, null, 1));
        }
    }
}

