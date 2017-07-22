/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFAutorizadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.view.RelatorioGerencialGUI
 *  br.gov.sp.fazenda.dsen.view.RelatorioGerencialGUI$1
 *  br.gov.sp.fazenda.dsen.view.RelatorioGerencialGUI$2
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.DSGETabbedPane
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.DateFormatter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFAutorizadaTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;
import br.gov.sp.fazenda.dsen.view.RelatorioGerencialGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.DSGETabbedPane;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.DateFormatter;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RelatorioGerencialGUI
extends DSGESimplePanel
implements ItemListener {
    private static final long a = -5797351958529963623L;
    private HashMap<String, JComponent[]> a;
    private DateFormatter a;
    private DateFormatter b;
    private JDSGETable<RelatorioNotaFiscalTO> a;
    private JDSGETable<RelatorioNotaFiscalTO> b;
    private JDSGETable<RelatorioNotaFiscalTO> c;
    private JDSGETable<RelatorioNotaFiscalTO> d;
    private JDSGETable<RelatorioNotaFiscalTO> e;
    private JDSGETable<RelatorioNotaFiscalTO> f;
    private JDSGETable<RelatorioNotaFiscalTO> g;
    private JDSGETable<RelatorioNotaFiscalTO> h;
    private JDSGETable<RelatorioNotaFiscalTO> i;
    private JDSGETable<RelatorioNotaFiscalTO> j;
    private static final String a = SituacaoNFeEnum.AUTORIZADA.getDescricao();
    private static final String b = SituacaoNFeEnum.CANCELADA.getDescricao();
    private static final String c = SituacaoNFeEnum.DENEGADA.getDescricao();
    private static final String d = SituacaoNFeEnum.REJEITADA.getDescricao();
    private static final String e = SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ.getDescricao();
    private static final String f = SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA.getDescricao();
    private static final String g = SituacaoNFeEnum.VALIDADA.getDescricao();
    private static final String h = SituacaoNFeEnum.ASSINADA.getDescricao();
    private static final String i = SituacaoNFeEnum.EM_DIGITACAO.getDescricao();
    private static final String j = "Inutiliza\u00e7\u00e3o";
    private JButton a;
    private JButton b;
    private JButton c;
    private JCheckBox a;
    private JCheckBox b;
    private JCheckBox c;
    private JCheckBox d;
    private JCheckBox e;
    private JCheckBox f;
    private JCheckBox g;
    private JCheckBox h;
    private JCheckBox i;
    private JCheckBox j;
    private JCheckBox k;
    private JComboBox a;
    private JPanel a;
    private JPanel b;
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
    private JLabel A;
    private JLabel B;
    private JLabel C;
    private JLabel D;
    private JLabel E;
    private JLabel F;
    private JLabel G;
    private JLabel H;
    private JLabel I;
    private JLabel J;
    private JLabel K;
    private JLabel L;
    private JLabel M;
    private JLabel N;
    private JPanel c;
    private JPanel d;
    private JPanel e;
    private JPanel f;
    private JPanel g;
    private JPanel h;
    private JPanel i;
    private JPanel j;
    private JPanel k;
    private JPanel l;
    private JPanel m;
    private JPanel n;
    private JPanel o;
    private JPanel p;
    private JScrollPane a;
    private JScrollPane b;
    private JScrollPane c;
    private JScrollPane d;
    private JScrollPane e;
    private JScrollPane f;
    private JScrollPane g;
    private JScrollPane h;
    private JScrollPane i;
    private JScrollPane j;
    private JTabbedPane a;
    private JFormattedTextField a;
    private JFormattedTextField b;

    public RelatorioGerencialGUI() throws DSGEViewException {
        this.b();
        this.a();
        this.c();
        this.d();
        this.o();
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.j = new JPanel();
        this.g = new JCheckBox();
        this.h = new JCheckBox();
        this.b = new JPanel();
        this.A = new JLabel();
        this.z = new JLabel();
        this.a = new JComboBox();
        this.a = new JCheckBox();
        this.a.setText(SituacaoNFeEnum.ASSINADA.getDescricao());
        this.b = new JCheckBox();
        this.b.setText(SituacaoNFeEnum.AUTORIZADA.getDescricao());
        this.c = new JCheckBox();
        this.c.setText(SituacaoNFeEnum.CANCELADA.getDescricao());
        this.d = new JCheckBox();
        this.d.setText(SituacaoNFeEnum.DENEGADA.getDescricao());
        this.e = new JCheckBox();
        this.e.setText(SituacaoNFeEnum.EM_DIGITACAO.getDescricao());
        this.i = new JCheckBox();
        this.i.setText(SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ.getDescricao());
        this.j = new JCheckBox();
        this.j.setText(SituacaoNFeEnum.REJEITADA.getDescricao());
        this.f = new JCheckBox();
        this.f.setText(SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA.getDescricao());
        this.k = new JCheckBox();
        this.k.setText(SituacaoNFeEnum.VALIDADA.getDescricao());
        this.a = new JButton();
        this.c = new JButton();
        this.m = new JPanel();
        this.a = new DSGETabbedPane();
        this.d = new JPanel();
        this.q = new JLabel();
        this.e = new JPanel();
        this.b = new JScrollPane();
        this.i = new JLabel();
        this.h = new JLabel();
        this.N = new JLabel();
        this.B = new JLabel();
        this.F = new JLabel();
        this.e = new JLabel();
        this.G = new JLabel();
        this.n = new JLabel();
        this.H = new JLabel();
        this.d = new JLabel();
        this.I = new JLabel();
        this.f = new JLabel();
        this.J = new JLabel();
        this.g = new JLabel();
        this.K = new JLabel();
        this.l = new JLabel();
        this.L = new JLabel();
        this.b = new JLabel();
        this.M = new JLabel();
        this.m = new JLabel();
        this.C = new JLabel();
        this.c = new JLabel();
        this.D = new JLabel();
        this.j = new JLabel();
        this.E = new JLabel();
        this.k = new JLabel();
        this.f = new JPanel();
        this.r = new JLabel();
        this.c = new JScrollPane();
        this.g = new JPanel();
        this.s = new JLabel();
        this.d = new JScrollPane();
        this.l = new JPanel();
        this.w = new JLabel();
        this.h = new JScrollPane();
        this.i = new JPanel();
        this.u = new JLabel();
        this.f = new JScrollPane();
        this.n = new JPanel();
        this.x = new JLabel();
        this.i = new JScrollPane();
        this.o = new JPanel();
        this.y = new JLabel();
        this.p = new JPanel();
        this.j = new JScrollPane();
        this.c = new JPanel();
        this.p = new JLabel();
        this.a = new JScrollPane();
        this.h = new JPanel();
        this.t = new JLabel();
        this.e = new JScrollPane();
        this.k = new JPanel();
        this.v = new JLabel();
        this.g = new JScrollPane();
        this.b = new JButton();
        this.a = new JPanel();
        this.o = new JLabel();
        this.b = new JFormattedTextField();
        this.a.install(this.b);
        this.a = new JLabel();
        this.a = new JFormattedTextField();
        this.b.install(this.a);
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Relat\u00f3rio Gerencial", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.j.setBorder(BorderFactory.createTitledBorder(""));
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("Pesquisar por n\u00fameros inutilizados");
        this.g.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.g.setMargin(new Insets(0, 0, 0, 0));
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("Pesquisar por notas fiscais");
        this.h.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.h.setMargin(new Insets(0, 0, 0, 0));
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Nota Fiscal", 2, 0));
        this.A.setFont(new Font("Tahoma", 1, 11));
        this.A.setText("Tipo");
        this.z.setFont(new Font("Tahoma", 1, 11));
        this.z.setText("Situa\u00e7\u00e3o");
        this.a.setModel(new DefaultComboBoxModel<String>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Assinada");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Autorizada");
        this.b.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.b.setMargin(new Insets(0, 0, 0, 0));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Cancelada");
        this.c.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.c.setMargin(new Insets(0, 0, 0, 0));
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("Denegada");
        this.d.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.d.setMargin(new Insets(0, 0, 0, 0));
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("Em Digita\u00e7\u00e3o");
        this.e.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.e.setMargin(new Insets(0, 0, 0, 0));
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("Em Processamento na SEFAZ");
        this.i.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.i.setMargin(new Insets(0, 0, 0, 0));
        this.j.setFont(new Font("Tahoma", 1, 11));
        this.j.setText("Rejeitada");
        this.j.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.j.setMargin(new Insets(0, 0, 0, 0));
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("Transmitida com Pend\u00eancia");
        this.f.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.f.setMargin(new Insets(0, 0, 0, 0));
        this.k.setFont(new Font("Tahoma", 1, 11));
        this.k.setText("Validada");
        this.k.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.k.setMargin(new Insets(0, 0, 0, 0));
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.A).addComponent(this.z)).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -2, -1, -2).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.j).addComponent(this.a).addComponent(this.d)).addGap(57, 57, 57).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.e).addComponent(this.f)).addGap(41, 41, 41).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.k).addComponent(this.c).addComponent(this.i)))).addContainerGap(152, 32767)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.A).addComponent(this.a, -2, 20, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.z).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j)).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k)).addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f)))).addContainerGap(-1, 32767)));
        GroupLayout pnlFiltroLayout = new GroupLayout(this.j);
        this.j.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addContainerGap().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767).addComponent(this.g).addComponent(this.h)).addContainerGap()));
        pnlFiltroLayout.setVerticalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2).addContainerGap()));
        this.a.setText("Gerar relat\u00f3rio");
        this.c.setText("Sair");
        this.m.setBorder(BorderFactory.createTitledBorder(null, "Resultado do filtro", 2, 0));
        this.a.setMinimumSize(new Dimension(131, 140));
        this.q.setHorizontalAlignment(0);
        this.q.setText("Nenhum resultado encontrado");
        this.i.setHorizontalAlignment(4);
        this.i.setText("00,00");
        this.h.setHorizontalAlignment(4);
        this.h.setText("00,00");
        this.N.setText("Valor total do ICMS:");
        this.B.setText("Valor total do ICMS Sub.:");
        this.F.setText("Valor total do Frete:");
        this.e.setHorizontalAlignment(4);
        this.e.setText("00,00");
        this.G.setText("Valor total do Seguro:");
        this.n.setHorizontalAlignment(4);
        this.n.setText("00,00");
        this.H.setText("Valor total do Desconto:");
        this.d.setHorizontalAlignment(4);
        this.d.setText("00,00");
        this.I.setText("Valor total do Imp. Imp:");
        this.f.setHorizontalAlignment(4);
        this.f.setText("00,00");
        this.J.setText("Valor total do IPI:");
        this.g.setHorizontalAlignment(4);
        this.g.setText("00,00");
        this.K.setText("Valor total do PIS:");
        this.l.setHorizontalAlignment(4);
        this.l.setText("00,00");
        this.L.setText("Valor total do COFINS:");
        this.b.setHorizontalAlignment(4);
        this.b.setText("00,00");
        this.M.setText("Valor total do PIS Sub.:");
        this.m.setHorizontalAlignment(4);
        this.m.setText("00,00");
        this.C.setText("Valor total do COFINS Sub.:");
        this.c.setHorizontalAlignment(4);
        this.c.setText("00,00");
        this.D.setText("Valor total do ISSQN:");
        this.j.setHorizontalAlignment(4);
        this.j.setText("00,00");
        this.E.setText("Valor total das NF-e:");
        this.k.setHorizontalAlignment(4);
        this.k.setText("00,00");
        GroupLayout pnlAutorizadasPrincipalLayout = new GroupLayout(this.e);
        this.e.setLayout(pnlAutorizadasPrincipalLayout);
        pnlAutorizadasPrincipalLayout.setHorizontalGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlAutorizadasPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlAutorizadasPrincipalLayout.createSequentialGroup().addComponent(this.b, -1, 736, 32767).addContainerGap()).addGroup(pnlAutorizadasPrincipalLayout.createSequentialGroup().addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.E).addComponent(this.G).addComponent(this.F).addComponent(this.B).addComponent(this.N)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.i, -1, 61, 32767).addComponent(this.e, -1, 61, 32767).addComponent(this.n, -1, 61, 32767).addComponent(this.k, -1, 61, 32767).addComponent(this.h, -1, 61, 32767)).addGap(15, 15, 15).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(pnlAutorizadasPrincipalLayout.createSequentialGroup().addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.K).addComponent(this.J).addComponent(this.I)).addGap(8, 8, 8)).addGroup(pnlAutorizadasPrincipalLayout.createSequentialGroup().addComponent(this.H).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.d, GroupLayout.Alignment.TRAILING, -1, 60, 32767).addComponent(this.g, GroupLayout.Alignment.TRAILING, -1, 60, 32767).addComponent(this.l, GroupLayout.Alignment.TRAILING, -1, 60, 32767).addComponent(this.f, GroupLayout.Alignment.TRAILING, -1, 60, 32767)).addGap(16, 16, 16).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.D).addComponent(this.C).addComponent(this.M).addComponent(this.L)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.m, GroupLayout.Alignment.TRAILING, -1, 63, 32767).addComponent(this.c, GroupLayout.Alignment.TRAILING, -1, 63, 32767).addComponent(this.j, GroupLayout.Alignment.TRAILING, -1, 63, 32767).addComponent(this.b, -1, 63, 32767)).addGap(43, 43, 43)))));
        pnlAutorizadasPrincipalLayout.setVerticalGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlAutorizadasPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, 67, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.N).addComponent(this.H).addComponent(this.d).addComponent(this.L).addComponent(this.b).addComponent(this.h)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.B).addComponent(this.i).addComponent(this.I).addComponent(this.M).addComponent(this.m).addComponent(this.f)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.F).addComponent(this.e).addComponent(this.J).addComponent(this.g).addComponent(this.C).addComponent(this.c)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.G).addComponent(this.n).addComponent(this.K).addComponent(this.l).addComponent(this.D).addComponent(this.j)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlAutorizadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.E).addComponent(this.k))));
        GroupLayout pnlAutorizadasLayout = new GroupLayout(this.d);
        this.d.setLayout(pnlAutorizadasLayout);
        pnlAutorizadasLayout.setHorizontalGroup(pnlAutorizadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e, -1, -1, 32767).addGroup(pnlAutorizadasLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.q, -1, 738, 32767).addContainerGap()));
        pnlAutorizadasLayout.setVerticalGroup(pnlAutorizadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e, -1, -1, 32767).addGroup(pnlAutorizadasLayout.createSequentialGroup().addComponent(this.q, -2, 81, -2).addContainerGap(103, 32767)));
        this.a.addTab("Autorizadas", this.d);
        this.r.setHorizontalAlignment(0);
        this.r.setText("Nenhum resultado encontrado");
        GroupLayout pnlCanceladasLayout = new GroupLayout(this.f);
        this.f.setLayout(pnlCanceladasLayout);
        pnlCanceladasLayout.setHorizontalGroup(pnlCanceladasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlCanceladasLayout.createSequentialGroup().addContainerGap().addGroup(pnlCanceladasLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.r, GroupLayout.Alignment.LEADING, -1, 736, 32767).addComponent(this.c, GroupLayout.Alignment.LEADING, -1, 736, 32767)).addContainerGap()));
        pnlCanceladasLayout.setVerticalGroup(pnlCanceladasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCanceladasLayout.createSequentialGroup().addGroup(pnlCanceladasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlCanceladasLayout.createSequentialGroup().addContainerGap().addComponent(this.c, -1, 160, 32767)).addComponent(this.r, -2, 105, -2)).addContainerGap()));
        this.a.addTab("Canceladas", this.f);
        this.s.setHorizontalAlignment(0);
        this.s.setText("Nenhum resultado encontrado");
        GroupLayout pnlDenegadasLayout = new GroupLayout(this.g);
        this.g.setLayout(pnlDenegadasLayout);
        pnlDenegadasLayout.setHorizontalGroup(pnlDenegadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDenegadasLayout.createSequentialGroup().addContainerGap().addGroup(pnlDenegadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.s, -1, 736, 32767).addComponent(this.d, -1, 736, 32767)).addContainerGap()));
        pnlDenegadasLayout.setVerticalGroup(pnlDenegadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDenegadasLayout.createSequentialGroup().addGroup(pnlDenegadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlDenegadasLayout.createSequentialGroup().addContainerGap().addComponent(this.d, -1, 160, 32767)).addComponent(this.s, -2, 105, -2)).addContainerGap()));
        this.a.addTab("Denegadas", this.g);
        this.w.setHorizontalAlignment(0);
        this.w.setText("Nenhum resultado encontrado");
        GroupLayout pnlRejeitadasLayout = new GroupLayout(this.l);
        this.l.setLayout(pnlRejeitadasLayout);
        pnlRejeitadasLayout.setHorizontalGroup(pnlRejeitadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlRejeitadasLayout.createSequentialGroup().addContainerGap().addGroup(pnlRejeitadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.w, -1, 736, 32767).addComponent(this.h, -1, 736, 32767)).addContainerGap()));
        pnlRejeitadasLayout.setVerticalGroup(pnlRejeitadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlRejeitadasLayout.createSequentialGroup().addGroup(pnlRejeitadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlRejeitadasLayout.createSequentialGroup().addContainerGap().addComponent(this.h, -1, 160, 32767)).addComponent(this.w, -2, 105, -2)).addContainerGap()));
        this.a.addTab("Rejeitadas", this.l);
        this.u.setHorizontalAlignment(0);
        this.u.setText("Nenhum resultado encontrado");
        GroupLayout pnlEmProcessamentoLayout = new GroupLayout(this.i);
        this.i.setLayout(pnlEmProcessamentoLayout);
        pnlEmProcessamentoLayout.setHorizontalGroup(pnlEmProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmProcessamentoLayout.createSequentialGroup().addContainerGap().addGroup(pnlEmProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.u, -1, 736, 32767).addComponent(this.f, -1, 736, 32767)).addContainerGap()));
        pnlEmProcessamentoLayout.setVerticalGroup(pnlEmProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmProcessamentoLayout.createSequentialGroup().addGroup(pnlEmProcessamentoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmProcessamentoLayout.createSequentialGroup().addContainerGap().addComponent(this.f, -1, 160, 32767)).addComponent(this.u, -2, 105, -2)).addContainerGap()));
        this.a.addTab("Em Processamento Sefaz", this.i);
        this.x.setHorizontalAlignment(0);
        this.x.setText("Nenhum resultado encontrado");
        GroupLayout pnlTransmitidaPendenciaLayout = new GroupLayout(this.n);
        this.n.setLayout(pnlTransmitidaPendenciaLayout);
        pnlTransmitidaPendenciaLayout.setHorizontalGroup(pnlTransmitidaPendenciaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransmitidaPendenciaLayout.createSequentialGroup().addContainerGap().addGroup(pnlTransmitidaPendenciaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.x, -1, 736, 32767).addComponent(this.i, -1, 736, 32767)).addContainerGap()));
        pnlTransmitidaPendenciaLayout.setVerticalGroup(pnlTransmitidaPendenciaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransmitidaPendenciaLayout.createSequentialGroup().addGroup(pnlTransmitidaPendenciaLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlTransmitidaPendenciaLayout.createSequentialGroup().addContainerGap().addComponent(this.i, -1, 160, 32767)).addComponent(this.x, -2, 105, -2)).addContainerGap()));
        this.a.addTab("Transmitida com Pend\u00eancia", this.n);
        this.y.setHorizontalAlignment(0);
        this.y.setText("Nenhum resultado encontrado");
        GroupLayout pnlValidadasPrincipalLayout = new GroupLayout(this.p);
        this.p.setLayout(pnlValidadasPrincipalLayout);
        pnlValidadasPrincipalLayout.setHorizontalGroup(pnlValidadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlValidadasPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.j, -1, 736, 32767).addContainerGap()));
        pnlValidadasPrincipalLayout.setVerticalGroup(pnlValidadasPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlValidadasPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.j, -1, 160, 32767).addContainerGap()));
        GroupLayout pnlValidadasLayout = new GroupLayout(this.o);
        this.o.setLayout(pnlValidadasLayout);
        pnlValidadasLayout.setHorizontalGroup(pnlValidadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.p, -1, -1, 32767).addGroup(pnlValidadasLayout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.y, -1, 738, 32767).addContainerGap()));
        pnlValidadasLayout.setVerticalGroup(pnlValidadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.p, -1, -1, 32767).addGroup(pnlValidadasLayout.createSequentialGroup().addComponent(this.y, -2, 105, -2).addContainerGap(79, 32767)));
        this.a.addTab("Validadas", this.o);
        this.p.setHorizontalAlignment(0);
        this.p.setText("Nenhum resultado encontrado");
        GroupLayout pnlAssinadasLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlAssinadasLayout);
        pnlAssinadasLayout.setHorizontalGroup(pnlAssinadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlAssinadasLayout.createSequentialGroup().addContainerGap().addGroup(pnlAssinadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.p, -1, 736, 32767).addComponent(this.a, -1, 736, 32767)).addContainerGap()));
        pnlAssinadasLayout.setVerticalGroup(pnlAssinadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlAssinadasLayout.createSequentialGroup().addGroup(pnlAssinadasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlAssinadasLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 160, 32767)).addComponent(this.p, -2, 105, -2)).addContainerGap()));
        this.a.addTab("Assinadas", this.c);
        this.t.setHorizontalAlignment(0);
        this.t.setText("Nenhum resultado encontrado");
        GroupLayout pnlEmDigitacaoLayout = new GroupLayout(this.h);
        this.h.setLayout(pnlEmDigitacaoLayout);
        pnlEmDigitacaoLayout.setHorizontalGroup(pnlEmDigitacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmDigitacaoLayout.createSequentialGroup().addContainerGap().addGroup(pnlEmDigitacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.t, -1, 736, 32767).addComponent(this.e, -1, 736, 32767)).addContainerGap()));
        pnlEmDigitacaoLayout.setVerticalGroup(pnlEmDigitacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmDigitacaoLayout.createSequentialGroup().addGroup(pnlEmDigitacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlEmDigitacaoLayout.createSequentialGroup().addContainerGap().addComponent(this.e, -1, 160, 32767)).addComponent(this.t, -2, 105, -2)).addContainerGap()));
        this.a.addTab("Em Digita\u00e7\u00e3o", this.h);
        this.v.setHorizontalAlignment(0);
        this.v.setText("Nenhum resultado encontrado");
        GroupLayout pnlInutilizacaoLayout = new GroupLayout(this.k);
        this.k.setLayout(pnlInutilizacaoLayout);
        pnlInutilizacaoLayout.setHorizontalGroup(pnlInutilizacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInutilizacaoLayout.createSequentialGroup().addContainerGap().addGroup(pnlInutilizacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.v, -1, 736, 32767).addComponent(this.g, -1, 736, 32767)).addContainerGap()));
        pnlInutilizacaoLayout.setVerticalGroup(pnlInutilizacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInutilizacaoLayout.createSequentialGroup().addGroup(pnlInutilizacaoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlInutilizacaoLayout.createSequentialGroup().addContainerGap().addComponent(this.g, -1, 160, 32767)).addComponent(this.v, -2, 105, -2)).addContainerGap()));
        this.a.addTab("Inutiliza\u00e7\u00e3o", this.k);
        GroupLayout pnlResultadoFiltroLayout = new GroupLayout(this.m);
        this.m.setLayout(pnlResultadoFiltroLayout);
        pnlResultadoFiltroLayout.setHorizontalGroup(pnlResultadoFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlResultadoFiltroLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 765, 32767).addContainerGap()));
        pnlResultadoFiltroLayout.setVerticalGroup(pnlResultadoFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlResultadoFiltroLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 229, 32767)));
        this.a.getAccessibleContext().setAccessibleName("");
        this.b.setText("Imprimir");
        this.a.setBorder(BorderFactory.createTitledBorder(""));
        this.o.setFont(new Font("Tahoma", 1, 11));
        this.o.setText("Data de emiss\u00e3o/inutiliza\u00e7\u00e3o");
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("at\u00e9");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.o).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 92, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 87, -2).addContainerGap(374, 32767)));
        jPanel1Layout.linkSize(0, this.a, this.b);
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.o).addComponent(this.b, -2, -1, -2).addComponent(this.a).addComponent(this.a, -2, 20, -2)));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.m, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c)).addComponent(this.j, -1, -1, 32767).addComponent(this.a, -1, -1, 32767)).addContainerGap()));
        layout.linkSize(0, this.a, this.b, this.c);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j, -2, 179, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b).addComponent(this.c)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.m, -1, -1, 32767).addContainerGap()));
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.h.addActionListener((ActionListener)listener);
        this.g.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        this.a = new HashMap();
        this.a.put("RELATORIO_COPONENTES", new JComponent[]{this.a, this.b, this.c, this.a, this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.k});
        this.a.put("RELATORIO_ABRIR", new JComponent[]{this.c});
        this.a.put("RELATORIO_FILTRO_NF", new JComponent[]{this.c, this.a, this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.k, this.a});
        this.a.put("RELATORIO_FILTRO_INUTILIZACAO", new JComponent[]{this.c, this.a});
        this.a.put("RELATORIO_GERAR", new JComponent[0]);
        this.a.put("RELATORIO_PRONTO", new JComponent[]{this.a, this.b, this.c, this.a, this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.k});
        this.a.put("RELATORIO_NOTA_FISCAL", new JComponent[]{this.a, this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.k});
        return this.a;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
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

    private void c() {
        this.a.setActionCommand("ACTION_GERAR_RELATORIO");
        this.b.setActionCommand("ACTION_IMPRIMIR_RELATORIO");
        this.c.setActionCommand("voltar");
        this.h.setActionCommand("ACTION_PESQUISAR_NF");
        this.g.setActionCommand("ACTION_SELECIONAR_INUTILIZACAO");
    }

    private void d() {
        this.a.removeAll();
        this.e();
        this.f();
        this.g();
        this.h();
        this.i();
        this.j();
        this.k();
        this.l();
        this.m();
        this.n();
    }

    private void e() {
        this.a.addTab(a, this.d);
        this.a = new JDSGETable();
        this.a.addColumn(0, "numero", "N\u00famero", false);
        this.a.addColumn(1, "serie", "S\u00e9rie", false);
        this.a.addColumn(2, "dataEmissao", "Data Emiss\u00e3o", false);
        this.a.addColumn(3, "valotTotalProduto", "Produtos", false);
        this.a.addColumn(4, "valorIcmsSt", "ICMS ST", false);
        this.a.addColumn(5, "valorFrete", "Frete", false);
        this.a.addColumn(6, "valorSeguro", "Seguro", false);
        this.a.addColumn(7, "valorTotalIpi", "IPI", false);
        this.a.addColumn(8, "outrasDespesasAcessorias", "Outras Despesas", false);
        this.a.addColumn(9, "valorTotalDesconto", "Desconto", false);
        this.a.addColumn(10, "valorTotalNfe", "Total NFe", false);
        this.a.addColumn(11, "baseIcms", "BC ICMS", false);
        this.a.addColumn(12, "valorIcms", "ICMS", false);
        this.a.addColumn(13, "tipoNfe", "Tipo", false);
        this.a.addColumn(14, "entradaSaida", "E/S", false);
        this.a.addColumn(15, "protocoloAutorizacao", "N\u00ba do Protocolo de Autoriza\u00e7\u00e3o", false);
        this.a.addColumn(16, "dataAutorizacao", "Data da Autoriza\u00e7\u00e3o", false);
        this.b.setViewportView((Component)this.a);
        this.a.setAutoFitTableColumns(true);
    }

    private void f() {
        this.a.addTab(b, this.f);
        this.b = new JDSGETable();
        this.b.addColumn(0, "numero", "N\u00famero", false);
        this.b.addColumn(1, "serie", "S\u00e9rie", false);
        this.b.addColumn(2, "ano", "Ano", false);
        this.b.addColumn(3, "mes", "M\u00eas", false);
        this.b.addColumn(4, "dataEmissao", "Data Emiss\u00e3o", false);
        this.b.addColumn(5, "tipoNfe", "Tipo", false);
        this.b.addColumn(6, "protocoloCancelamento", "N\u00ba do Protocolo de Cancelamento", false);
        this.b.addColumn(7, "dataCancelamento", "Data do Cancelamento", false);
        this.b.addColumn(8, "motivoCancelamento", "Motivo do Cancelamento", false);
        this.c.setViewportView((Component)this.b);
        this.b.setAutoFitTableColumns(true);
    }

    private void g() {
        this.a.addTab(c, this.g);
        this.c = new JDSGETable();
        this.c.addColumn(0, "numero", "N\u00famero", false);
        this.c.addColumn(1, "serie", "S\u00e9rie", false);
        this.c.addColumn(2, "ano", "Ano", false);
        this.c.addColumn(3, "mes", "M\u00eas", false);
        this.c.addColumn(4, "dataEmissao", "Data Emiss\u00e3o", false);
        this.c.addColumn(5, "entradaSaida", "Entrada/Sa\u00edda", false);
        this.c.addColumn(6, "tipoNfe", "Tipo", false);
        this.c.addColumn(7, "protocoloDenegacao", "N\u00ba Protocolo de Denega\u00e7\u00e3o", false);
        this.c.addColumn(8, "dataDenegacao", "Data da Denega\u00e7\u00e3o", false);
        this.c.addColumn(9, "motivoDenegacao", "Motivo da Denega\u00e7\u00e3o", false);
        this.d.setViewportView((Component)this.c);
        this.c.setAutoFitTableColumns(true);
    }

    private void h() {
        this.a.addTab(d, this.l);
        this.d = new JDSGETable();
        this.d.addColumn(0, "numero", "N\u00famero", false);
        this.d.addColumn(1, "serie", "S\u00e9rie", false);
        this.d.addColumn(2, "ano", "Ano", false);
        this.d.addColumn(3, "mes", "M\u00eas", false);
        this.d.addColumn(4, "dataEmissao", "Data Emiss\u00e3o", false);
        this.d.addColumn(5, "entradaSaida", "Entrada/Sa\u00edda", false);
        this.d.addColumn(6, "tipoNfe", "Tipo", false);
        this.d.addColumn(7, "motivoRejeicao", "Motivo da Rejei\u00e7\u00e3o", false);
        this.h.setViewportView((Component)this.d);
        this.d.setAutoFitTableColumns(true);
    }

    private void i() {
        this.a.addTab(e, this.i);
        this.e = new JDSGETable();
        this.e.addColumn(0, "numero", "N\u00famero", false);
        this.e.addColumn(1, "serie", "S\u00e9rie", false);
        this.e.addColumn(2, "ano", "Ano", false);
        this.e.addColumn(3, "mes", "M\u00eas", false);
        this.e.addColumn(4, "dataEmissao", "Data Emiss\u00e3o", false);
        this.e.addColumn(5, "entradaSaida", "Entrada/Sa\u00edda", false);
        this.e.addColumn(6, "tipoNfe", "Tipo", false);
        this.f.setViewportView((Component)this.e);
        this.e.setAutoFitTableColumns(true);
    }

    private void j() {
        this.a.addTab(f, this.n);
        this.f = new JDSGETable();
        this.f.addColumn(0, "numero", "N\u00famero", false);
        this.f.addColumn(1, "serie", "S\u00e9rie", false);
        this.f.addColumn(2, "ano", "Ano", false);
        this.f.addColumn(3, "mes", "M\u00eas", false);
        this.f.addColumn(4, "dataEmissao", "Data Emiss\u00e3o", false);
        this.f.addColumn(5, "entradaSaida", "Entrada/Sa\u00edda", false);
        this.f.addColumn(6, "tipoNfe", "Tipo", false);
        this.i.setViewportView((Component)this.f);
        this.f.setAutoFitTableColumns(true);
    }

    private void k() {
        this.a.addTab(g, this.o);
        this.g = new JDSGETable();
        this.g.addColumn(0, "numero", "N\u00famero", false);
        this.g.addColumn(1, "serie", "S\u00e9rie", false);
        this.g.addColumn(2, "ano", "Ano", false);
        this.g.addColumn(3, "mes", "M\u00eas", false);
        this.g.addColumn(4, "dataEmissao", "Data Emiss\u00e3o", false);
        this.g.addColumn(5, "entradaSaida", "Entrada/Sa\u00edda", false);
        this.g.addColumn(6, "tipoNfe", "Tipo", false);
        this.g.addColumn(7, "valorTotalNfe", "Valor Total NF-e", false);
        this.j.setViewportView((Component)this.g);
        this.g.setAutoFitTableColumns(true);
    }

    private void l() {
        this.a.addTab(h, this.c);
        this.h = new JDSGETable();
        this.h.addColumn(0, "numero", "N\u00famero", false);
        this.h.addColumn(1, "serie", "S\u00e9rie", false);
        this.h.addColumn(2, "ano", "Ano", false);
        this.h.addColumn(3, "mes", "M\u00eas", false);
        this.h.addColumn(4, "dataEmissao", "Data Emiss\u00e3o", false);
        this.h.addColumn(5, "entradaSaida", "Entrada/Sa\u00edda", false);
        this.h.addColumn(6, "tipoNfe", "Tipo", false);
        this.h.addColumn(7, "danfeImpresso", "Danfe Impresso", false);
        this.a.setViewportView((Component)this.h);
        this.h.setAutoFitTableColumns(true);
    }

    private void m() {
        this.a.addTab(i, this.h);
        this.i = new JDSGETable();
        this.i.addColumn(0, "numero", "N\u00famero", false);
        this.i.addColumn(1, "serie", "S\u00e9rie", false);
        this.i.addColumn(2, "ano", "Ano", false);
        this.i.addColumn(3, "mes", "M\u00eas", false);
        this.i.addColumn(4, "dataEmissao", "Data Emiss\u00e3o", false);
        this.i.addColumn(5, "entradaSaida", "Entrada/Sa\u00edda", false);
        this.i.addColumn(6, "tipoNfe", "Tipo", false);
        this.e.setViewportView((Component)this.i);
        this.i.setAutoFitTableColumns(true);
    }

    private void n() {
        this.a.addTab("Inutiliza\u00e7\u00e3o", this.k);
        this.j = new JDSGETable();
        this.j.addColumn(0, "serie", "S\u00e9rie", false);
        this.j.addColumn(1, "faixaInicial", "Faixa Inicial", false);
        this.j.addColumn(2, "faixaFinal", "Faixa Final", false);
        this.j.addColumn(3, "protocoloInutilizacao", "N\u00ba do Protocolo de Inutiliza\u00e7\u00e3o", false);
        this.j.addColumn(4, "dataInutilizacao", "Data da Inutiliza\u00e7\u00e3o", false);
        this.j.addColumn(5, "motivoInutilizacao", "Motivo da Inutiliza\u00e7\u00e3o", false);
        this.g.setViewportView((Component)this.j);
        this.j.setAutoFitTableColumns(true);
    }

    private void o() {
        int i;
        TipoEmissaoEnum[] enumTpNFe = TipoEmissaoEnum.values();
        ArrayList<TipoEmissaoEnum> lista = new ArrayList<TipoEmissaoEnum>();
        for (i = 0; i < enumTpNFe.length; ++i) {
            lista.add(enumTpNFe[i]);
        }
        this.a.removeAllItems();
        this.a.addItem("Todos");
        if (lista != null) {
            for (i = 0; i < lista.size(); ++i) {
                this.a.addItem(lista.get(i));
            }
        }
    }

    public void setResultadoVisivel(boolean visivel) {
        this.m.setVisible(visivel);
    }

    public void setSituacaoNFeSelected(List<SituacaoNFeEnum> situacao) {
        if (situacao != null) {
            block11 : for (int i = 0; i < situacao.size(); ++i) {
                SituacaoNFeEnum element = situacao.get(i);
                switch (2.a[element.ordinal()]) {
                    case 1: {
                        this.a.setSelected(true);
                        continue block11;
                    }
                    case 2: {
                        this.b.setSelected(true);
                        continue block11;
                    }
                    case 3: {
                        this.c.setSelected(true);
                        continue block11;
                    }
                    case 4: {
                        this.d.setSelected(true);
                        continue block11;
                    }
                    case 5: {
                        this.e.setSelected(true);
                        continue block11;
                    }
                    case 6: {
                        this.i.setSelected(true);
                        continue block11;
                    }
                    case 7: {
                        this.j.setSelected(true);
                        continue block11;
                    }
                    case 8: {
                        this.f.setSelected(true);
                        continue block11;
                    }
                    case 9: {
                        this.k.setSelected(true);
                    }
                }
            }
        }
    }

    public void setCmbTipoEnable(boolean b) {
        this.a.setEnabled(b);
    }

    public void setLstSituacaoEnable(boolean b) {
        this.a.setEnabled(b);
        this.b.setEnabled(b);
        this.c.setEnabled(b);
        this.d.setEnabled(b);
        this.e.setEnabled(b);
        this.f.setEnabled(b);
        this.i.setEnabled(b);
        this.j.setEnabled(b);
        this.k.setEnabled(b);
    }

    public void setBtnGerarEnable(boolean b) {
        this.a.setEnabled(b);
    }

    public void setTipoEmissaoNFeSelected(TipoEmissaoEnum tipo) {
        if (tipo == null) {
            this.a.setSelectedIndex(0);
        } else {
            this.a.setSelectedItem((Object)tipo);
        }
    }

    public void setIntervaloDataEmissao(Date dataInicio, Date dataFim) {
        if (dataInicio != null && dataFim != null) {
            this.b.setText(DateHelper.formataData((Date)dataInicio));
            this.a.setText(DateHelper.formataData((Date)dataFim));
        }
    }

    public Date getDataEmissaoInicio() {
        return DateHelper.getDateTime((String)(this.b.getText() + " 00:00:00 000"), (SimpleDateFormat)DateHelper.DATE_TIME_MILLISECOND_FORMAT);
    }

    public Date getDataEmissaoFim() {
        return DateHelper.getDateTime((String)(this.a.getText() + " 23:59:59 999"), (SimpleDateFormat)DateHelper.DATE_TIME_MILLISECOND_FORMAT);
    }

    public TipoEmissaoEnum getTipoEmissaoNFeSelected() {
        if (this.a.getSelectedIndex() == 0) {
            return null;
        }
        return (TipoEmissaoEnum)this.a.getSelectedItem();
    }

    public List<SituacaoNFeEnum> getSituacaoNFeSelected() {
        ArrayList<SituacaoNFeEnum> list = new ArrayList<SituacaoNFeEnum>();
        if (this.a.isSelected()) {
            list.add(SituacaoNFeEnum.ASSINADA);
        }
        if (this.b.isSelected()) {
            list.add(SituacaoNFeEnum.AUTORIZADA);
        }
        if (this.c.isSelected()) {
            list.add(SituacaoNFeEnum.CANCELADA);
        }
        if (this.d.isSelected()) {
            list.add(SituacaoNFeEnum.DENEGADA);
        }
        if (this.e.isSelected()) {
            list.add(SituacaoNFeEnum.EM_DIGITACAO);
        }
        if (this.i.isSelected()) {
            list.add(SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ);
        }
        if (this.j.isSelected()) {
            list.add(SituacaoNFeEnum.REJEITADA);
        }
        if (this.f.isSelected()) {
            list.add(SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA);
        }
        if (this.k.isSelected()) {
            list.add(SituacaoNFeEnum.VALIDADA);
        }
        return list;
    }

    public void setResultadoFiltro(RelatorioNotaFiscalTO relatorio) {
        this.a.removeAll();
        if (this.isPesquisaNotaFiscal()) {
            for (SituacaoNFeEnum situacaoSelecionada : this.getSituacaoNFeSelected()) {
                if (situacaoSelecionada.equals((Object)SituacaoNFeEnum.AUTORIZADA)) {
                    this.a.addTab(a, this.d);
                    if (relatorio.getAutorizadas() != null && relatorio.getAutorizadas().size() > 0) {
                        this.a(this.a, relatorio.getAutorizadas());
                        RelatorioNFAutorizadaTO r = (RelatorioNFAutorizadaTO)relatorio.getAutorizadas().get(relatorio.getAutorizadas().size() - 1);
                        this.h.setText(r.getResultadoTotalIcms());
                        this.i.setText(r.getResultadoTotalIcmsSt());
                        this.e.setText(r.getResultadoTotalFrete());
                        this.n.setText(r.getResultadoTotalSeguro());
                        this.d.setText(r.getResultadoTotalDesconto());
                        this.f.setText(r.getResultadoTotalII());
                        this.g.setText(r.getResultadoTotalIpi());
                        this.l.setText(r.getResultadoTotalPis());
                        this.b.setText(r.getResultadoTotalCofins());
                        this.m.setText(r.getResultadoTotalPisSt());
                        this.c.setText(r.getResultadoTotalCofinsSt());
                        this.j.setText(r.getResultadoTotalIssqn());
                        this.k.setText(r.getResultadoTotalValorNfe());
                        this.e.setVisible(true);
                        this.q.setVisible(false);
                        continue;
                    }
                    this.e.setVisible(false);
                    this.q.setVisible(true);
                    continue;
                }
                if (situacaoSelecionada.equals((Object)SituacaoNFeEnum.CANCELADA)) {
                    this.a.addTab(b, this.f);
                    if (relatorio.getCanceladas() != null && relatorio.getCanceladas().size() > 0) {
                        this.a(this.b, relatorio.getCanceladas());
                        this.c.setVisible(true);
                        this.r.setVisible(false);
                        continue;
                    }
                    this.c.setVisible(false);
                    this.r.setVisible(true);
                    continue;
                }
                if (situacaoSelecionada.equals((Object)SituacaoNFeEnum.DENEGADA)) {
                    this.a.addTab(c, this.g);
                    if (relatorio.getDenegadas() != null && relatorio.getDenegadas().size() > 0) {
                        this.a(this.c, relatorio.getDenegadas());
                        this.d.setVisible(true);
                        this.s.setVisible(false);
                        continue;
                    }
                    this.d.setVisible(false);
                    this.s.setVisible(true);
                    continue;
                }
                if (situacaoSelecionada.equals((Object)SituacaoNFeEnum.REJEITADA)) {
                    this.a.addTab(d, this.l);
                    if (relatorio.getRejeitadas() != null && relatorio.getRejeitadas().size() > 0) {
                        this.a(this.d, relatorio.getRejeitadas());
                        this.h.setVisible(true);
                        this.w.setVisible(false);
                        continue;
                    }
                    this.h.setVisible(false);
                    this.w.setVisible(true);
                    continue;
                }
                if (situacaoSelecionada.equals((Object)SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ)) {
                    this.a.addTab(e, this.i);
                    if (relatorio.getEmProcessamentoSefaz() != null && relatorio.getEmProcessamentoSefaz().size() > 0) {
                        this.a(this.e, relatorio.getEmProcessamentoSefaz());
                        this.f.setVisible(true);
                        this.u.setVisible(false);
                        continue;
                    }
                    this.f.setVisible(false);
                    this.u.setVisible(true);
                    continue;
                }
                if (situacaoSelecionada.equals((Object)SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA)) {
                    this.a.addTab(f, this.n);
                    if (relatorio.getTransmitidaPendencia() != null && relatorio.getTransmitidaPendencia().size() > 0) {
                        this.a(this.f, relatorio.getTransmitidaPendencia());
                        this.i.setVisible(true);
                        this.x.setVisible(false);
                        continue;
                    }
                    this.i.setVisible(false);
                    this.x.setVisible(true);
                    continue;
                }
                if (situacaoSelecionada.equals((Object)SituacaoNFeEnum.VALIDADA)) {
                    this.a.addTab(g, this.o);
                    if (relatorio.getValidada() != null && relatorio.getValidada().size() > 0) {
                        this.a(this.g, relatorio.getValidada());
                        this.p.setVisible(true);
                        this.y.setVisible(false);
                        continue;
                    }
                    this.p.setVisible(false);
                    this.y.setVisible(true);
                    continue;
                }
                if (situacaoSelecionada.equals((Object)SituacaoNFeEnum.ASSINADA)) {
                    this.a.addTab(h, this.c);
                    if (relatorio.getAssinada() != null && relatorio.getAssinada().size() > 0) {
                        this.a(this.h, relatorio.getAssinada());
                        this.a.setVisible(true);
                        this.p.setVisible(false);
                        continue;
                    }
                    this.a.setVisible(false);
                    this.p.setVisible(true);
                    continue;
                }
                if (!situacaoSelecionada.equals((Object)SituacaoNFeEnum.EM_DIGITACAO)) continue;
                this.a.addTab(i, this.h);
                if (relatorio.getEmDigitacao() != null && relatorio.getEmDigitacao().size() > 0) {
                    this.a(this.i, relatorio.getEmDigitacao());
                    this.e.setVisible(true);
                    this.t.setVisible(false);
                    continue;
                }
                this.e.setVisible(false);
                this.t.setVisible(true);
            }
        }
        if (this.isPesquisaInutilizacao()) {
            this.a.addTab("Inutiliza\u00e7\u00e3o", this.k);
            if (relatorio.getInutilizacao() != null && relatorio.getInutilizacao().size() > 0) {
                this.a(this.j, relatorio.getInutilizacao());
                this.g.setVisible(true);
                this.v.setVisible(false);
            } else {
                this.g.setVisible(false);
                this.v.setVisible(true);
            }
        }
    }

    private void a(JDSGETable<RelatorioNotaFiscalTO> tabela, List<RelatorioNotaFiscalTO> resultado) {
        tabela.removeAllTO();
        if (resultado != null) {
            SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
        }
    }

    public boolean isPesquisaNotaFiscal() {
        return this.h.isSelected();
    }

    public boolean isPesquisaInutilizacao() {
        return this.g.isSelected();
    }

    public void setChkPesquisarInutilizadas(Boolean bool) {
        this.g.setSelected(bool);
    }

    public void setChkPesquisarNF(Boolean bool) {
        this.h.setSelected(bool);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

