/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$1
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$10
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$11
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$12
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$13
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$2
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$3
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$4
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$5
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$6
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$7
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$8
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI$9
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.util.CursorController
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.util.CursorController;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ImportacaoGUI
extends DSGESimplePanel {
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
    private JCheckBox l;
    private JCheckBox m;
    private JLabel a;
    private JLabel b;
    private JPanel a;
    private JPanel b;
    private JLabel c;
    private JScrollPane a;
    private JScrollPane b;
    private JTextField a;
    private JDSGEPageableTable<ImportacaoTelaTO> a;
    private JDSGEPageableTable<ImportacaoTelaTO> b;
    private List<ImportacaoTelaTO> a = new ArrayList();
    private List<ImportacaoTelaTO> b = new ArrayList();

    public ImportacaoGUI() throws DSGEViewException {
        this.d();
        this.configureActions();
        this.a();
        this.bindController((ViewItf)this);
        this.a(false, true);
        this.b(false, true);
    }

    private void a() {
        this.a = new JDSGEPageableTable();
        int index = 0;
        this.a.addColumn(index++, "marcado", "", true, null);
        this.a.addColumn(index++, "tipoArquivo", "Tipo de Arquivo", false, "tipoArquivo");
        this.a.addColumn(index++, "nomeArquivo", "Nome do Arquivo", false, "nomeArquivo");
        this.a.addColumn(index++, "qtdRegistro", "# Registros", false, "qtdRegistro");
        this.a.setPageable(false);
        this.a.setSortable(true);
        this.a.setAutoFitTableColumns(true);
        this.a.setSortColumnDbFieldName("nomeArquivo");
        this.a.setSortColumnASC(true);
        this.a.setInitialSortColumn(2, true);
        this.a.setScrollPane(this.a);
        this.a.setSelectAllAvailable(true);
        this.b = new JDSGEPageableTable();
        index = 0;
        this.b.addColumn(index++, "marcado", "", true, null);
        this.b.addColumn(index++, "tipoArquivo", "Tipo de Arquivo", false, "tipoArquivo");
        this.b.addColumn(index++, "identificacao", "Identifica\u00e7\u00e3o", false, "identificacao");
        this.b.addColumn(index++, "nomeArquivo", "Nome do Arquivo", false, "nomeArquivo");
        this.b.addColumn(index++, "situacao", "Situa\u00e7\u00e3o", false, "situacao");
        this.b.addColumn(index++, "arquivosVinculadosStr", "Arquivos Vinculados", false, "arquivosVinculadosStr");
        this.b.setPageable(false);
        this.b.setSortable(true);
        this.b.setAutoFitTableColumns(true);
        this.b.setSortColumnDbFieldName("identificacao");
        this.b.setSortColumnASC(true);
        this.b.setInitialSortColumn(2, true);
        this.b.setScrollPane(this.b);
        this.b.setSelectAllAvailable(true);
    }

    public void configureActions() {
        this.a.setActionCommand("fechar");
        this.b.setActionCommand("importar");
        this.c.setActionCommand("buscarLogotipo");
        this.g.setActionCommand("ACTION_SELECT_NFE_TXT");
        this.c.setActionCommand("ACTION_SELECT_EMITENTE_TXT");
        this.a.setActionCommand("ACTION_SELECT_CLIENTE_TXT");
        this.h.setActionCommand("ACTION_SELECT_PRODUTO_TXT");
        this.l.setActionCommand("ACTION_SELECT_TRANSPORTADORA_TXT");
        this.f.setActionCommand("ACTION_SELECT_NFE_XML");
        this.d.setActionCommand("ACTION_SELECT_EMITENTE_XML");
        this.b.setActionCommand("ACTION_SELECT_CLIENTE_XML");
        this.i.setActionCommand("ACTION_SELECT_PRODUTO_XML");
        this.m.setActionCommand("ACTION_SELECT_PRODUTO_XML");
        this.e.setActionCommand("ACTION_SELECT_INUTILIZACAO_XML");
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener(CursorController.createActionListener((Component)DSENDesktop.getInstance(), (ActionListener)((ActionListener)listener)));
    }

    public void addItemListener(ItemListener listener) {
        this.g.addItemListener(listener);
        this.c.addItemListener(listener);
        this.a.addItemListener(listener);
        this.h.addItemListener(listener);
        this.l.addItemListener(listener);
        this.f.addItemListener(listener);
        this.d.addItemListener(listener);
        this.b.addItemListener(listener);
        this.i.addItemListener(listener);
        this.m.addItemListener(listener);
        this.e.addItemListener(listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public String getPath() {
        return null;
    }

    public List<ImportacaoTelaTO> getSelectedListaImportacaoTelaTO() {
        ArrayList<ImportacaoTelaTO> list = new ArrayList<ImportacaoTelaTO>();
        list.addAll(this.a.getSelectedTOs());
        list.addAll(this.b.getSelectedTOs());
        return list;
    }

    public int getNumberOfTOs() {
        return this.a.getAllTO().size() + this.b.getAllTO().size();
    }

    public void setListaImportacaoTelaTO(List<ImportacaoTelaTO> listaImportacaoTelaTO, boolean emitenteLogado) {
        this.a.removeAllTO();
        this.b.removeAllTO();
        this.a.clear();
        this.b.clear();
        this.c(false, true);
        this.d(false, true);
        this.b(true, true);
        this.a(true, true);
        if (!emitenteLogado) {
            this.c.setSelected(true);
            this.d.setSelected(true);
            this.j.setSelected(false);
            this.k.setSelected(false);
            this.b(false, true);
            this.a(false, true);
        } else {
            this.c(true, true);
            this.d(true, true);
            this.c.setEnabled(false);
            this.d.setEnabled(false);
            this.c.setSelected(false);
            this.d.setSelected(false);
        }
        if (listaImportacaoTelaTO != null) {
            for (ImportacaoTelaTO itTO : listaImportacaoTelaTO) {
                if (ExtensaoArquivoEnum.TXT.equals((Object)itTO.getExtensaoArquivo())) {
                    if (!emitenteLogado) {
                        if (TipoDocumentoArquivoEnum.Emitente != itTO.getTipoArquivo()) continue;
                        this.a.add(itTO);
                        continue;
                    }
                    if (TipoDocumentoArquivoEnum.Emitente == itTO.getTipoArquivo()) continue;
                    this.a.add(itTO);
                    continue;
                }
                if (!ExtensaoArquivoEnum.XML.equals((Object)itTO.getExtensaoArquivo())) continue;
                if (!emitenteLogado) {
                    if (TipoDocumentoArquivoEnum.Emitente != itTO.getTipoArquivo()) continue;
                    this.b.add(itTO);
                    continue;
                }
                if (TipoDocumentoArquivoEnum.Emitente == itTO.getTipoArquivo()) continue;
                this.b.add(itTO);
            }
        }
        this.c();
        this.b();
    }

    public String getImportacaoPath() {
        return this.a.getText();
    }

    public void setImportacaoPath(String path) {
        this.a.setText(path);
    }

    private void b() {
        List tos = this.b;
        this.b.removeAllTO();
        for (ImportacaoTelaTO to : tos) {
            if (this.k.isSelected()) {
                this.b.addTO((BaseTO)to);
                continue;
            }
            if (this.f.isSelected() && TipoDocumentoArquivoEnum.NotaFiscal.equals((Object)to.getTipoArquivo())) {
                this.b.addTO((BaseTO)to);
            }
            if (this.i.isSelected() && TipoDocumentoArquivoEnum.Produto.equals((Object)to.getTipoArquivo())) {
                this.b.addTO((BaseTO)to);
            }
            if (this.b.isSelected() && TipoDocumentoArquivoEnum.Cliente.equals((Object)to.getTipoArquivo())) {
                this.b.addTO((BaseTO)to);
            }
            if (this.d.isSelected() && TipoDocumentoArquivoEnum.Emitente.equals((Object)to.getTipoArquivo())) {
                this.b.addTO((BaseTO)to);
            }
            if (this.m.isSelected() && TipoDocumentoArquivoEnum.Transportadora.equals((Object)to.getTipoArquivo())) {
                this.b.addTO((BaseTO)to);
            }
            if (!this.e.isSelected() || !TipoDocumentoArquivoEnum.Inutilizacao.equals((Object)to.getTipoArquivo())) continue;
            this.b.addTO((BaseTO)to);
        }
    }

    private void c() {
        List tos = this.a;
        this.a.removeAllTO();
        for (ImportacaoTelaTO to : tos) {
            if (this.j.isSelected()) {
                this.a.addTO((BaseTO)to);
                continue;
            }
            if (this.g.isSelected() && TipoDocumentoArquivoEnum.NotaFiscal.equals((Object)to.getTipoArquivo())) {
                this.a.addTO((BaseTO)to);
            }
            if (this.h.isSelected() && TipoDocumentoArquivoEnum.Produto.equals((Object)to.getTipoArquivo())) {
                this.a.addTO((BaseTO)to);
            }
            if (this.a.isSelected() && TipoDocumentoArquivoEnum.Cliente.equals((Object)to.getTipoArquivo())) {
                this.a.addTO((BaseTO)to);
            }
            if (this.c.isSelected() && TipoDocumentoArquivoEnum.Emitente.equals((Object)to.getTipoArquivo())) {
                this.a.addTO((BaseTO)to);
            }
            if (!this.l.isSelected() || !TipoDocumentoArquivoEnum.Transportadora.equals((Object)to.getTipoArquivo())) continue;
            this.a.addTO((BaseTO)to);
        }
    }

    private void d() {
        this.c = new JButton();
        this.a = new JTextField();
        this.c = new JLabel();
        this.a = new JPanel();
        this.a = new JScrollPane();
        this.g = new JCheckBox();
        this.c = new JCheckBox();
        this.a = new JCheckBox();
        this.h = new JCheckBox();
        this.l = new JCheckBox();
        this.j = new JCheckBox();
        this.a = new JLabel();
        this.b = new JPanel();
        this.b = new JScrollPane();
        this.f = new JCheckBox();
        this.d = new JCheckBox();
        this.b = new JCheckBox();
        this.i = new JCheckBox();
        this.m = new JCheckBox();
        this.k = new JCheckBox();
        this.b = new JLabel();
        this.e = new JCheckBox();
        this.b = new JButton();
        this.a = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Importa\u00e7\u00e3o de Arquivos", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Localizar");
        this.a.setEnabled(false);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("Local do(s) arquivo(s):");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Arquivos TXT", 0, 0, new Font("Tahoma", 0, 11), Color.blue));
        this.g.setText("NF-e");
        this.g.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.g.setMargin(new Insets(0, 0, 0, 0));
        this.g.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.c.setText("Emitente");
        this.c.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.c.setMargin(new Insets(0, 0, 0, 0));
        this.c.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setText("Cliente");
        this.a.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.a.setMargin(new Insets(0, 0, 0, 0));
        this.a.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.h.setText("Produto");
        this.h.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.h.setMargin(new Insets(0, 0, 0, 0));
        this.h.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.l.setText("Transportadora");
        this.l.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.l.setMargin(new Insets(0, 0, 0, 0));
        this.l.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.j.setText("Todos");
        this.j.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.j.setMargin(new Insets(0, 0, 0, 0));
        this.j.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setText("Filtrar por:");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j).addGap(20, 20, 20).addComponent(this.g).addGap(20, 20, 20).addComponent(this.c).addGap(20, 20, 20).addComponent(this.a).addGap(20, 20, 20).addComponent(this.h).addGap(19, 19, 19).addComponent(this.l).addGap(172, 172, 172)).addComponent(this.a, -1, 764, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a).addComponent(this.h).addComponent(this.l).addComponent(this.j).addComponent(this.g).addComponent(this.a)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 114, 32767)));
        this.b.setBorder(BorderFactory.createTitledBorder(null, "Arquivos XML", 0, 0, new Font("Tahoma", 0, 11), Color.blue));
        this.f.setText("NF-e");
        this.f.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.f.setMargin(new Insets(0, 0, 0, 0));
        this.f.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.d.setText("Emitente");
        this.d.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.d.setMargin(new Insets(0, 0, 0, 0));
        this.d.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setText("Cliente");
        this.b.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.b.setMargin(new Insets(0, 0, 0, 0));
        this.b.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.i.setText("Produto");
        this.i.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.i.setMargin(new Insets(0, 0, 0, 0));
        this.i.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.m.setText("Transportadora");
        this.m.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.m.setMargin(new Insets(0, 0, 0, 0));
        this.m.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.k.setText("Todos");
        this.k.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.k.setMargin(new Insets(0, 0, 0, 0));
        this.k.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.setText("Filtrar por:");
        this.e.setText("Inutiliza\u00e7\u00e3o");
        this.e.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.e.setMargin(new Insets(0, 0, 0, 0));
        this.e.addItemListener((ItemListener)new /* Unavailable Anonymous Inner Class!! */);
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.k).addGap(20, 20, 20).addComponent(this.f).addGap(20, 20, 20).addComponent(this.d).addGap(20, 20, 20).addComponent(this.b).addGap(20, 20, 20).addComponent(this.i).addGap(20, 20, 20).addComponent(this.m).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addContainerGap(186, 32767)).addComponent(this.b, -1, 764, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.d).addComponent(this.b).addComponent(this.i).addComponent(this.m).addComponent(this.k).addComponent(this.b).addComponent(this.e)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, 106, 32767)));
        this.b.setText("Importar");
        this.a.setText("Fechar");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 560, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c)).addComponent(this.a, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.b, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.a, -2, -1, -2).addComponent(this.c, -2, 24, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a))));
    }

    private void a(ItemEvent evt) {
        this.c();
    }

    private void b(ItemEvent evt) {
        this.c();
    }

    private void c(ItemEvent evt) {
        this.c();
    }

    private void d(ItemEvent evt) {
        this.c();
    }

    private void e(ItemEvent evt) {
        this.c();
    }

    private void f(ItemEvent evt) {
        this.c();
    }

    private void g(ItemEvent evt) {
        this.b();
    }

    private void h(ItemEvent evt) {
        this.b();
    }

    private void i(ItemEvent evt) {
        this.b();
    }

    private void j(ItemEvent evt) {
        this.b();
    }

    private void k(ItemEvent evt) {
        this.b();
    }

    private void l(ItemEvent evt) {
        this.b();
    }

    private void m(ItemEvent evt) {
        this.b();
    }

    private void a(boolean enabled, boolean includeSelecionarTodos) {
        this.d.setEnabled(enabled);
        this.b.setEnabled(enabled);
        this.m.setEnabled(enabled);
        this.f.setEnabled(enabled);
        this.i.setEnabled(enabled);
        this.e.setEnabled(enabled);
        if (includeSelecionarTodos) {
            this.k.setEnabled(enabled);
        }
    }

    private void b(boolean enabled, boolean includeSelecionarTodos) {
        this.c.setEnabled(enabled);
        this.a.setEnabled(enabled);
        this.l.setEnabled(enabled);
        this.g.setEnabled(enabled);
        this.h.setEnabled(enabled);
        if (includeSelecionarTodos) {
            this.j.setEnabled(enabled);
        }
    }

    private void c(boolean selected, boolean includeSelecionarTodos) {
        this.d.setSelected(selected);
        this.b.setSelected(selected);
        this.m.setSelected(selected);
        this.f.setSelected(selected);
        this.i.setSelected(selected);
        this.e.setSelected(selected);
        if (includeSelecionarTodos) {
            this.k.setSelected(selected);
        }
    }

    private void d(boolean selected, boolean includeSelecionarTodos) {
        this.c.setSelected(selected);
        this.a.setSelected(selected);
        this.l.setSelected(selected);
        this.g.setSelected(selected);
        this.h.setSelected(selected);
        if (includeSelecionarTodos) {
            this.j.setSelected(selected);
        }
    }

    public JDSGEPageableTable<ImportacaoTelaTO> getTblTXT() {
        return this.a;
    }

    public JDSGEPageableTable<ImportacaoTelaTO> getTblXML() {
        return this.b;
    }

    static /* synthetic */ void a(ImportacaoGUI x0, ItemEvent x1) {
        x0.e(x1);
    }

    static /* synthetic */ void b(ImportacaoGUI x0, ItemEvent x1) {
        x0.d(x1);
    }

    static /* synthetic */ void c(ImportacaoGUI x0, ItemEvent x1) {
        x0.c(x1);
    }

    static /* synthetic */ void d(ImportacaoGUI x0, ItemEvent x1) {
        x0.b(x1);
    }

    static /* synthetic */ void e(ImportacaoGUI x0, ItemEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ void f(ImportacaoGUI x0, ItemEvent x1) {
        x0.f(x1);
    }

    static /* synthetic */ void g(ImportacaoGUI x0, ItemEvent x1) {
        x0.k(x1);
    }

    static /* synthetic */ void h(ImportacaoGUI x0, ItemEvent x1) {
        x0.j(x1);
    }

    static /* synthetic */ void i(ImportacaoGUI x0, ItemEvent x1) {
        x0.i(x1);
    }

    static /* synthetic */ void j(ImportacaoGUI x0, ItemEvent x1) {
        x0.h(x1);
    }

    static /* synthetic */ void k(ImportacaoGUI x0, ItemEvent x1) {
        x0.g(x1);
    }

    static /* synthetic */ void l(ImportacaoGUI x0, ItemEvent x1) {
        x0.l(x1);
    }

    static /* synthetic */ void m(ImportacaoGUI x0, ItemEvent x1) {
        x0.m(x1);
    }
}

