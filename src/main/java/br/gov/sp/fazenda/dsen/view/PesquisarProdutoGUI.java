/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsen.view.PesquisarProdutoGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarProdutoGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface;
import br.gov.sp.fazenda.dsen.view.PesquisarProdutoGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
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
import javax.swing.text.DefaultFormatter;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class PesquisarProdutoGUI
extends DSGESimplePanel {
    private static final long a = -6133889899859839959L;
    private CarregarTOCadastroInterface<ProdutoTO> a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JButton g;
    private JButton h;
    private JButton i;
    private JLabel a;
    private JLabel b;
    private JPanel a;
    private JScrollPane a;
    private JTextField a;
    private JTextField b;
    private JDSGEPageableTable<ProdutoTO> a;
    private Map<String, JComponent[]> a = null;

    public PesquisarProdutoGUI(CarregarTOCadastroInterface<ProdutoTO> carregarItf) throws DSGEViewException {
        this();
        this.setCarregarItf(carregarItf);
        this.a.setVisible(true);
        this.e.setVisible(true);
        this.b.setVisible(true);
        this.c.setVisible(true);
        this.d.setVisible(true);
        this.f.setVisible(true);
        this.i.setVisible(false);
    }

    public PesquisarProdutoGUI() throws DSGEViewException {
        this.e();
        this.a();
        this.b();
        this.c();
        this.d();
        this.a.setVisible(false);
        this.e.setVisible(false);
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.b.setActionCommand("detalhar");
        this.c.setActionCommand("excluir");
        this.d.setActionCommand("exportar");
        this.f.setActionCommand("incluir");
        this.h.setActionCommand("pesquisar");
        this.a.setActionCommand("carregar");
        this.i.setActionCommand("ACTION_SAIR");
        this.e.setActionCommand("fechar");
    }

    public void limparFiltro() {
        this.a.setText(null);
        this.b.setText(null);
        this.a.requestFocus();
    }

    private void b() {
        this.g.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c() {
        this.a = new JDSGEPageableTable();
        ParametroTO numRegPagTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_NUM_REG_POR_PAG_CONSULTA, ParametroTO.class);
        this.a.setPageSize(Integer.parseInt(numRegPagTO.getValor()));
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "CProd", "C\u00f3digo", false, "cProd");
        this.a.addColumn(2, "XProd", "Descri\u00e7\u00e3o", false, "xProd");
        this.a.addColumn(3, "VUnCom", "Valor Un. Com.", (DefaultFormatter)NumberFormatterHelper.getFormatter1204(), false, "vUnCom");
        this.a.addColumn(4, "VUnTrib", "Valor Un. Trib.", (DefaultFormatter)NumberFormatterHelper.getFormatter1204(), false, "vUnTrib");
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setPreferredWidth(200);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(300);
        this.a.getWrappedTable().getColumnModel().getColumn(3).setPreferredWidth(160);
        this.a.getWrappedTable().getColumnModel().getColumn(3).setMaxWidth(200);
        this.a.getWrappedTable().getColumnModel().getColumn(4).setPreferredWidth(160);
        this.a.getWrappedTable().getColumnModel().getColumn(4).setMaxWidth(200);
        this.a.setSortColumnDbFieldName("xProd");
        this.a.setSortColumnASC(true);
        this.a.setInitialSortColumn(2, true);
        this.a.setViewportView((Component)this.a);
    }

    private void d() {
        this.a = new HashMap();
        this.a.put("selectProdutoInit", new JComponent[]{this.b, this.d, this.c, this.a});
        this.a.put("selectProdutoManySelected", new JComponent[]{this.c, this.d});
        this.a.put("selectProdutoOneSelected", new JComponent[]{this.b, this.c, this.d, this.a});
    }

    private void e() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(60));
        this.b = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(120));
        this.h = new JButton();
        this.g = new JButton();
        this.a = new JScrollPane();
        this.f = new JButton();
        this.b = new JButton();
        this.c = new JButton();
        this.d = new JButton();
        this.i = new JButton();
        this.a = new JButton();
        this.e = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Cadastro de Produtos", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.setPreferredSize(new Dimension(743, 426));
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Filtro de Pesquisa", 1, 2));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("C\u00f3digo");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Nome");
        this.h.setText("Pesquisar");
        this.g.setText("Nova Pesquisa");
        GroupLayout pnlFiltroLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addContainerGap().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g)).addGroup(pnlFiltroLayout.createSequentialGroup().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.a, -1, 465, 32767).addGap(164, 164, 164)).addComponent(this.b, -1, 629, 32767)))).addContainerGap()));
        pnlFiltroLayout.setVerticalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.g)).addContainerGap(-1, 32767)));
        this.f.setText("Incluir");
        this.b.setText("Detalhar");
        this.c.setText("Excluir");
        this.d.setText("Exportar");
        this.i.setText("Sair");
        this.a.setText("Carregar");
        this.e.setText("Fechar");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767).addComponent(this.a, -1, 707, 32767).addGroup(layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, -1, 87, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, 87, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, 87, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addGap(6, 6, 6).addComponent(this.i, -2, 71, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 71, -2))).addContainerGap()));
        layout.linkSize(0, this.a, this.b, this.c, this.d, this.f, this.i);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 218, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a).addComponent(this.f).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.c).addComponent(this.d).addComponent(this.i).addComponent(this.e))).addContainerGap()));
        layout.linkSize(1, this.b, this.c, this.d, this.f, this.i);
    }

    public void addActionListener(EventListener listener) {
        this.f.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.h.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.i.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
        this.a.setActionListener((ActionListener)listener);
        this.a.addPageableSortableListener((PageableSortableTableActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public ProdutoTO getProdutoTO() {
        ProdutoTO produtoTO = new ProdutoTO();
        if (this.a.getText() != null && !this.a.getText().trim().equals("")) {
            produtoTO.setCProd(this.a.getText());
        }
        if (this.b.getText() != null && !this.b.getText().trim().equals("")) {
            produtoTO.setXProd(this.b.getText());
        }
        return produtoTO;
    }

    public PesquisaProdutoTO getHistoricoPesquisaTO() {
        PesquisaProdutoTO pesqTO = new PesquisaProdutoTO();
        pesqTO.setCodigo(StringHelper.isBlankOrNull((Object)this.a.getText()) ? null : this.a.getText());
        pesqTO.setNome(StringHelper.isBlankOrNull((Object)this.b.getText()) ? null : this.b.getText());
        pesqTO.setIdEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
        pesqTO.setTelaPesquisaEnum(TelaPesquisaEnum.PRODUTO);
        return pesqTO;
    }

    public void populaFiltro(PesquisaProdutoTO pesquisaTO) {
        if (pesquisaTO != null) {
            this.a.setText(pesquisaTO.getCodigo());
            this.b.setText(pesquisaTO.getNome());
        }
    }

    public void setProdutoTOList(List<ProdutoTO> listaProdutoTO) {
        this.a.removeAllTO();
        if (listaProdutoTO != null) {
            this.a.addTO(listaProdutoTO);
        }
    }

    public List<ProdutoTO> getSelectedProdutos() {
        return this.a.getSelectedItens(0);
    }

    public ProdutoTO getSelectedProdutoTO() {
        List lista = this.getSelectedProdutos();
        ProdutoTO produto = null;
        if (lista != null && lista.size() > 0) {
            produto = (ProdutoTO)lista.get(0);
        }
        return produto;
    }

    public JDSGEPageableTable<ProdutoTO> getTable() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public void setCarregarVisible(boolean visible) {
        this.a.setVisible(visible);
    }

    public void firePropertyChange(String propertyName, ProdutoTO produtoTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)produtoTO);
    }

    public CarregarTOCadastroInterface<ProdutoTO> getCarregarItf() {
        return this.a;
    }

    public void setCarregarItf(CarregarTOCadastroInterface<ProdutoTO> carregarItf) {
        this.a = carregarItf;
    }

    static /* synthetic */ JDSGEPageableTable a(PesquisarProdutoGUI x0) {
        return x0.a;
    }
}

