/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.IpiTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.view.ManterProdutoGUI
 *  br.gov.sp.fazenda.dsen.view.ManterProdutoGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.IpiTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.view.ManterProdutoGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ManterProdutoGUI
extends DSGESimplePanel
implements FocusListener {
    private static final long a = -1708131119152869598L;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JButton g;
    private JButton h;
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
    private JPanel c;
    private JPanel d;
    private JScrollPane a;
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
    private JTextField f;
    private JTextField g;
    private JTextField h;
    private JTextField i;
    private JDSGETable<IcmsTO> a;
    private CNPJFormatter a;
    private String a;
    private Map<String, JComponent[]> a;
    private ProdutoTO a;
    private List<IcmsTO> a;

    public ManterProdutoGUI(String operacao) {
        this.a = operacao;
        this.a();
        this.f();
        this.c();
        this.d();
        this.e();
        this.b();
        try {
            this.bindController((ViewItf)this);
        }
        catch (DSGEViewException ex) {
            ex.printStackTrace();
        }
    }

    private void a() {
        try {
            this.a = new CNPJFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
    }

    private void b() {
        this.a.addFocusListener((FocusListener)this);
    }

    private void c() {
        this.a.setActionCommand("editar");
        this.b.setActionCommand("alterarICMS");
        this.c.setActionCommand("excluir");
        this.d.setActionCommand("excluirICMS");
        this.e.setActionCommand("exportar");
        this.h.setActionCommand("voltar");
        this.f.setActionCommand("incluir");
        this.g.setActionCommand("incluirICMS");
    }

    private void d() {
        this.a = new JDSGETable();
        this.a.addColumn(0, "marcado", "", true);
        this.a.addColumn(1, "descricaoSituacaoTributaria", "Situa\u00e7\u00e3o Tribut\u00e1ria", false);
        this.a.addColumn(2, "descricaoOrigem", "Origem", false);
        this.a.getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getColumnModel().getColumn(2).setMaxWidth(225);
        this.a.getColumnModel().getColumn(2).setPreferredWidth(225);
        this.a.setViewportView((Component)this.a);
    }

    private void e() {
        this.a = new HashMap();
        this.a.put("insertProduto", new JComponent[]{this.d, this.b, this.a, this.c, this.e});
        this.a.put("detailProduto", new JComponent[]{this.b, this.c, this.d, this.g, this.f, this.c, this.h, this.e, this.f, this.d, this.e, this.i, this.a, this.g, this.b, this.d, this.a, this.b, this.a, this.f});
        this.a.put("updateProdutoDisabled", new JComponent[]{this.b, this.b, this.d, this.f, this.c, this.e});
        this.a.put("updateProdutoEnabled", new JComponent[]{this.c, this.d, this.g, this.f, this.c, this.h, this.e, this.f, this.d, this.e, this.i, this.a, this.g, this.a, this.b, this.a, this.a, this.h});
        this.a.put("ICMSManySelected", new JComponent[]{this.d});
        this.a.put("ICMSOneSelected", new JComponent[]{this.b, this.d});
    }

    private void f() {
        this.d = new JPanel();
        this.e = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 60));
        this.f = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 120));
        this.g = new JLabel();
        this.d = new JTextField();
        ((AbstractDocument)this.d.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0}|[0-9]{8}|[0-9]{12,14}", 14));
        this.k = new JLabel();
        this.i = new JLabel();
        this.f = new JTextField();
        ((AbstractDocument)this.f.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{2,3}", 3));
        this.j = new JLabel();
        this.c = new JFormattedTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(2));
        this.m = new JLabel();
        this.h = new JTextField();
        ((AbstractDocument)this.h.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 6));
        this.h = new JLabel();
        this.e = new JTextField();
        ((AbstractDocument)this.e.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0}|[0-9]{8}|[0-9]{12,14}", 14));
        this.n = new JLabel();
        this.i = new JTextField();
        ((AbstractDocument)this.i.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 6));
        this.g = new JTextField();
        ((AbstractDocument)this.g.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(8));
        this.o = new JLabel();
        this.e = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.e, (int)12, (int)4);
        this.l = new JLabel();
        this.p = new JLabel();
        this.f = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.f, (int)12, (int)4);
        this.d = new JFormattedTextField();
        NumberFormatterHelper.installNumberFormatter((JFormattedTextField)this.d, (int)15, (int)4);
        this.c = new JPanel();
        this.a = new JPanel();
        this.a = new JScrollPane();
        this.g = new JButton();
        this.b = new JButton();
        this.d = new JButton();
        this.b = new JPanel();
        this.c = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 5));
        this.d = new JLabel();
        this.b = new JFormattedTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[!-\u00ff]{1}[ -\u00ff]{0,}[!-\u00ff]{1}|[!-\u00ff]{1}", 3));
        this.b = new JLabel();
        this.a = new JFormattedTextField();
        this.a.install(this.a);
        this.f = new JButton();
        this.a = new JButton();
        this.c = new JButton();
        this.e = new JButton();
        this.h = new JButton();
        this.a = new JLabel();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Cadastro de Produto", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.d.setBorder(BorderFactory.createTitledBorder(null, "Produto", 1, 2));
        this.e.setFont(new Font("Tahoma", 1, 11));
        this.e.setText("* C\u00f3digo");
        this.f.setFont(new Font("Tahoma", 1, 11));
        this.f.setText("* Descri\u00e7\u00e3o");
        this.g.setFont(new Font("Tahoma", 1, 11));
        this.g.setText("EAN");
        this.k.setFont(new Font("Tahoma", 1, 11));
        this.k.setText("NCM");
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("EX TIPI");
        this.j.setFont(new Font("Tahoma", 1, 11));
        this.j.setText("G\u00eanero");
        this.c.setHorizontalAlignment(4);
        this.m.setFont(new Font("Tahoma", 1, 11));
        this.m.setText("Unid. Com.");
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("EAN Unid. Tribut\u00e1vel");
        this.n.setFont(new Font("Tahoma", 1, 11));
        this.n.setText("Unid. Trib.");
        this.g.setHorizontalAlignment(2);
        this.o.setFont(new Font("Tahoma", 1, 11));
        this.o.setText("Valor Unit. Com.");
        this.e.setHorizontalAlignment(4);
        this.l.setFont(new Font("Dialog", 1, 11));
        this.l.setText("Qtd. Trib.");
        this.p.setFont(new Font("Tahoma", 1, 11));
        this.p.setText("Valor Unit. Trib.");
        this.f.setHorizontalAlignment(4);
        this.d.setHorizontalAlignment(4);
        GroupLayout pnlProdutoLayout = new GroupLayout(this.d);
        this.d.setLayout(pnlProdutoLayout);
        pnlProdutoLayout.setHorizontalGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlProdutoLayout.createSequentialGroup().addContainerGap().addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.f).addGroup(pnlProdutoLayout.createSequentialGroup().addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e).addComponent(this.g).addComponent(this.i).addComponent(this.m).addComponent(this.n)).addGap(13, 13, 13).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutoLayout.createSequentialGroup().addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, pnlProdutoLayout.createSequentialGroup().addComponent(this.f, -2, 56, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c)).addComponent(this.d, GroupLayout.Alignment.LEADING, -2, 169, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.h).addComponent(this.k)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.g, -2, 135, -2).addComponent(this.e, -2, 157, -2))).addComponent(this.b, -1, 644, 32767).addGroup(pnlProdutoLayout.createSequentialGroup().addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.i, GroupLayout.Alignment.LEADING).addComponent(this.h, GroupLayout.Alignment.LEADING, -2, 77, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.o).addComponent(this.l)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.e, GroupLayout.Alignment.TRAILING, -1, 144, 32767).addComponent(this.d, GroupLayout.Alignment.TRAILING, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.p).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, -2, 132, -2)).addComponent(this.c, -1, 644, 32767)))).addContainerGap()));
        pnlProdutoLayout.linkSize(0, this.d, this.e, this.f);
        pnlProdutoLayout.setVerticalGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlProdutoLayout.createSequentialGroup().addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.c, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.e).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g).addComponent(this.h).addComponent(this.e, -2, -1, -2).addComponent(this.d, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.i).addComponent(this.f, -2, -1, -2).addComponent(this.j).addComponent(this.c, -2, -1, -2).addComponent(this.k).addComponent(this.g, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.m).addComponent(this.h, -2, -1, -2).addComponent(this.o).addComponent(this.e, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlProdutoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.n).addComponent(this.i, -2, -1, -2).addComponent(this.l).addComponent(this.d, -2, -1, -2).addComponent(this.p).addComponent(this.f, -2, -1, -2))));
        this.c.setBorder(BorderFactory.createTitledBorder(null, "Impostos", 1, 2));
        this.a.setBorder(BorderFactory.createTitledBorder(null, "ICMS", 1, 2));
        this.g.setText("Incluir");
        this.b.setText("Editar");
        this.d.setText("Excluir");
        GroupLayout pnlICMSLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlICMSLayout);
        pnlICMSLayout.setHorizontalGroup(pnlICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlICMSLayout.createSequentialGroup().addContainerGap().addGroup(pnlICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 680, 32767).addGroup(pnlICMSLayout.createSequentialGroup().addComponent(this.g).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d))).addContainerGap()));
        pnlICMSLayout.linkSize(0, this.b, this.d, this.g);
        pnlICMSLayout.setVerticalGroup(pnlICMSLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlICMSLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 49, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlICMSLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.g).addComponent(this.b).addComponent(this.d))));
        this.b.setBorder(BorderFactory.createTitledBorder(null, "IPI", 1, 2));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Classe de Enquadramento (cigarros e bebidas)");
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("C\u00f3digo de Enquadramento Legal");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("CNPJ do Produtor");
        this.a.setHorizontalAlignment(4);
        GroupLayout pnlIPILayout = new GroupLayout(this.b);
        this.b.setLayout(pnlIPILayout);
        pnlIPILayout.setHorizontalGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlIPILayout.createSequentialGroup().addContainerGap().addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(pnlIPILayout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)).addGroup(pnlIPILayout.createSequentialGroup().addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 90, 32767).addComponent(this.b, -1, 90, 32767)))).addContainerGap(334, 32767)));
        pnlIPILayout.setVerticalGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlIPILayout.createSequentialGroup().addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlIPILayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2))));
        GroupLayout pnlImpostosLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlImpostosLayout);
        pnlImpostosLayout.setHorizontalGroup(pnlImpostosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlImpostosLayout.createSequentialGroup().addContainerGap().addGroup(pnlImpostosLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.b, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addContainerGap()));
        pnlImpostosLayout.setVerticalGroup(pnlImpostosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, pnlImpostosLayout.createSequentialGroup().addComponent(this.a, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, -1, -2)));
        this.f.setText("Incluir");
        this.a.setText("Editar");
        this.c.setText("Excluir");
        this.e.setText("Exportar");
        this.h.setText("Fechar");
        this.a.setFont(new Font("Dialog", 0, 10));
        this.a.setText("(*) Campo de preenchimento obrigat\u00f3rio.");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c, -1, -1, 32767).addComponent(this.d, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.f, -2, 78, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 76, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 75, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 139, 32767).addComponent(this.a, -2, 199, -2))).addContainerGap()));
        layout.linkSize(0, this.a, this.c, this.e, this.f, this.h);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.d, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.a).addComponent(this.c).addComponent(this.e).addComponent(this.h)).addComponent(this.a, -2, 13, -2)).addContainerGap()));
        layout.linkSize(1, this.a, this.c, this.e, this.f, this.h);
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.h.addActionListener((ActionListener)listener);
        this.g.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public String getOperacao() {
        return this.a;
    }

    public ProdutoTO getProdutoTO() {
        if (this.a == null) {
            this.a = new ProdutoTO();
        }
        this.a.setCEan(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? this.d.getText() : null);
        this.a.setCEanTrib(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? this.e.getText() : null);
        this.a.setCProd(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        this.a.setExTipi(!StringHelper.isBlankOrNull((Object)this.f.getText()) ? this.f.getText() : null);
        this.a.setGenero(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText() : null);
        this.a.setNcm(!StringHelper.isBlankOrNull((Object)this.g.getText()) ? this.g.getText() : null);
        this.a.setUCom(!StringHelper.isBlankOrNull((Object)this.h.getText()) ? this.h.getText() : null);
        this.a.setUTrib(!StringHelper.isBlankOrNull((Object)this.i.getText()) ? this.i.getText() : null);
        this.a.setVUnCom(!StringHelper.isBlankOrNull((Object)this.e.getText()) ? StringHelper.formataValorXML((String)this.e.getText()).toString() : null);
        this.a.setVUnTrib(!StringHelper.isBlankOrNull((Object)this.f.getText()) ? StringHelper.formataValorXML((String)this.f.getText()).toString() : null);
        this.a.setXProd(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText() : null);
        this.a.setIpiTOSet(this.getIpiTOCollection());
        this.a.setIcmsTOSet(new HashSet(this.a.getAllTO()));
        this.a.setQTrib(!StringHelper.isBlankOrNull((Object)this.d.getText()) ? StringHelper.formataValorXML((String)this.d.getText()).toString() : null);
        this.a.clearErrors();
        this.a.clearMessages();
        return this.a;
    }

    public Set<IpiTO> getIpiTOCollection() {
        IpiTO ipiTO;
        String classEnq = this.a.getText().trim();
        String codEnq = this.b.getText().trim();
        Object cnpjProd = null;
        try {
            cnpjProd = this.a.stringToValue(this.a.getText());
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        HashSet<IpiTO> ipiTOCollection = this.a.getIpiTOSet();
        if (!(classEnq.equals("") && codEnq.equals("") && cnpjProd.equals(""))) {
            ipiTO = null;
            if (ipiTOCollection == null || ipiTOCollection.size() == 0) {
                ipiTO = new IpiTO();
                ipiTOCollection = new HashSet<IpiTO>();
            } else {
                ipiTO = (IpiTO)ipiTOCollection.iterator().next();
                ipiTOCollection.clear();
            }
            ipiTO.setCEnq(!StringHelper.isBlankOrNull((Object)codEnq) ? codEnq : null);
            ipiTO.setClEnq(!StringHelper.isBlankOrNull((Object)classEnq) ? classEnq : null);
            if (cnpjProd != null) {
                ipiTO.setCnpjProd(cnpjProd.toString());
            } else {
                ipiTO.setCnpjProd(null);
            }
        } else {
            if (ipiTOCollection != null) {
                ipiTOCollection.clear();
            }
            return ipiTOCollection;
        }
        ipiTOCollection.add(ipiTO);
        return ipiTOCollection;
    }

    public void setProdutoTO(ProdutoTO produtoTO) {
        this.a = produtoTO;
        if (produtoTO.getCProd() != null) {
            this.b.setText(produtoTO.getCProd());
        }
        if (produtoTO.getXProd() != null) {
            this.c.setText(produtoTO.getXProd());
        }
        if (produtoTO.getCEan() != null) {
            this.d.setText(produtoTO.getCEan());
        }
        if (produtoTO.getNcm() != null) {
            this.g.setText(produtoTO.getNcm());
        }
        if (produtoTO.getExTipi() != null) {
            this.f.setText(produtoTO.getExTipi());
        }
        if (produtoTO.getGenero() != null) {
            this.c.setText(produtoTO.getGenero());
        }
        if (produtoTO.getUCom() != null) {
            this.h.setText(produtoTO.getUCom());
        }
        if (produtoTO.getVUnCom() != null) {
            this.e.setText(NumberFormatterHelper.formatStringAsNumber((String)produtoTO.getVUnCom(), (int)12, (int)4));
        }
        if (produtoTO.getVUnTrib() != null) {
            this.f.setText(NumberFormatterHelper.formatStringAsNumber((String)produtoTO.getVUnTrib(), (int)12, (int)4));
        }
        if (produtoTO.getCEanTrib() != null) {
            this.e.setText(produtoTO.getCEanTrib());
        }
        if (produtoTO.getUTrib() != null) {
            this.i.setText(produtoTO.getUTrib());
        }
        if (produtoTO.getQTrib() != null) {
            this.d.setText(NumberFormatterHelper.formatStringAsNumber((String)produtoTO.getQTrib(), (int)15, (int)4));
        }
        if (produtoTO.getIpiTOSet() != null && produtoTO.getIpiTOSet().size() > 0) {
            IpiTO ipiTO = (IpiTO)produtoTO.getIpiTOSet().iterator().next();
            if (ipiTO.getCEnq() != null) {
                this.b.setText(ipiTO.getCEnq());
            }
            if (ipiTO.getClEnq() != null) {
                this.a.setText(ipiTO.getClEnq());
            }
            if (ipiTO.getCnpjProd() != null) {
                this.a.setText(ipiTO.getCnpjProd());
            }
        }
        this.setICMSListTO(new ArrayList(produtoTO.getIcmsTOSet()));
    }

    public void setICMSListTO(List<IcmsTO> lista) {
        this.a.removeAllTO();
        if (lista != null) {
            this.a.addTO(lista);
            this.a.sortTOs((Comparator)new /* Unavailable Anonymous Inner Class!! */);
        }
        if (this.a == null) {
            this.a = lista;
        }
    }

    public List<IcmsTO> getICMSListTO() {
        return this.a;
    }

    public void firePropertyChange(String property) {
        this.firePropertyChange(property, (Object)null, (Object)null);
    }

    public void setActionAlterar() {
        this.a.setActionCommand("alterar");
        this.a.setText("Alterar");
    }

    public void setActionEditar() {
        this.a.setActionCommand("editar");
        this.a.setText("Editar");
    }

    public List<IcmsTO> getSelectedICMSTOs() {
        return this.a.getSelectedItens(0);
    }

    public IcmsTO getSelectedICMSTO() {
        List lista = this.getSelectedICMSTOs();
        IcmsTO icmsTO = null;
        if (lista != null && lista.size() > 0) {
            icmsTO = (IcmsTO)lista.get(0);
        }
        return icmsTO;
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        String cnpj = null;
        try {
            cnpj = this.a.stringToValue(this.a.getText()).toString();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        if (!StringHelper.isBlankOrNull((Object)cnpj)) {
            this.a.setText(StringHelper.completaComZerosAEsquerda((String)cnpj, (int)14));
        }
    }

    public ControllerItf getController(ViewItf viewItf) throws DSGEViewException {
        return this.getController((ViewItf)this);
    }

    public void setBtnVoltarTitle(String title) {
        this.h.setText(title);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

