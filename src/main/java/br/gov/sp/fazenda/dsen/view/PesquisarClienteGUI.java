/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsen.view.PesquisarClienteGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarClienteGUI$1
 *  br.gov.sp.fazenda.dsen.view.PesquisarClienteGUI$2
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter
 *  br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO;
import br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface;
import br.gov.sp.fazenda.dsen.view.PesquisarClienteGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter;
import br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.RegexDocumentFilter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
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
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class PesquisarClienteGUI
extends DSGESimplePanel {
    private static final long a = 1413432778560058993L;
    private CarregarTOCadastroInterface<ClienteTO> a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JButton g;
    private JButton h;
    private JButton i;
    private JButton j;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JPanel a;
    private JScrollPane a;
    private JFormattedTextField a;
    private JTextField a;
    private JTextField b;
    private JDSGEPageableTable<ClienteTO> a;
    private Map<String, JComponent[]> a = null;

    public PesquisarClienteGUI(CarregarTOCadastroInterface<ClienteTO> carregarItf) throws DSGEViewException {
        this();
        this.setCarregarItf(carregarItf);
        this.a.setVisible(true);
        this.e.setVisible(true);
        this.b.setVisible(true);
        this.c.setVisible(true);
        this.d.setVisible(true);
        this.f.setVisible(false);
        this.g.setVisible(true);
        this.j.setVisible(false);
    }

    public PesquisarClienteGUI() throws DSGEViewException {
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
        this.i.setActionCommand("pesquisar");
        this.b.setActionCommand("detalhar");
        this.g.setActionCommand("incluir");
        this.c.setActionCommand("excluir");
        this.f.setActionCommand("importar");
        this.d.setActionCommand("exportar");
        this.a.setActionCommand("carregar");
        this.j.setActionCommand("ACTION_SAIR");
        this.e.setActionCommand("fechar");
    }

    private void b() {
        this.a = new JDSGEPageableTable();
        ParametroTO numRegPagTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_NUM_REG_POR_PAG_CONSULTA, ParametroTO.class);
        this.a.setPageSize(Integer.parseInt(numRegPagTO.getValor()));
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "nrDocumento", "CNPJ/CPF", (DefaultFormatter)new DocumentoFormatter(), false, "nrDocumento");
        this.a.addColumn(2, "ieFormatada", "Inscri\u00e7\u00e3o Estadual", false, "ie");
        this.a.addColumn(3, "XNome", "Nome/Raz\u00e3o Social", false, "xNome");
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setPreferredWidth(180);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(220);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(180);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(220);
        this.a.setSortColumnDbFieldName("xNome");
        this.a.setSortColumnASC(true);
        this.a.setInitialSortColumn(3, true);
        this.a.setViewportView((Component)this.a);
    }

    public void limparFiltro() {
        this.a.setText(null);
        this.a.setText(null);
        this.b.setText(null);
        this.a.requestFocus();
    }

    private void c() {
        this.h.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void d() {
        this.a = new HashMap();
        this.a.put("selectClienteInit", new JComponent[]{this.b, this.d, this.c, this.a});
        this.a.put("selectClienteManyeSelected", new JComponent[]{this.c, this.d});
        this.a.put("selectClienteOneSelected", new JComponent[]{this.b, this.c, this.d, this.a});
    }

    public void addActionListener(EventListener listener) {
        this.i.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.g.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.j.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
        this.a.setActionListener((ActionListener)listener);
        this.a.addPageableSortableListener((PageableSortableTableActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public ClienteTO getClienteTO() {
        ClienteTO cliente = new ClienteTO();
        if (this.b.getText() != null && !this.b.getText().trim().equals("")) {
            cliente.setNrDocumento(this.b.getText().trim());
        }
        if (this.a.getText() != null && !this.a.getText().trim().equals("")) {
            cliente.setIe(this.a.getText().trim());
        }
        if (this.a.getText() != null && !this.a.getText().trim().equals("")) {
            cliente.setXNome(this.a.getText().trim());
        }
        return cliente;
    }

    public ClienteTO getSelectedClienteTO() {
        List lista = this.a.getSelectedItens(0);
        ClienteTO cliente = null;
        if (lista != null && lista.size() > 0) {
            cliente = (ClienteTO)lista.get(0);
        }
        return cliente;
    }

    public List<ClienteTO> getSelectedClientes() {
        return this.a.getSelectedItens(0);
    }

    public void setClienteTOList(List<ClienteTO> lista) {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    public PesquisaClienteTO getHistoricoPesquisaTO() {
        PesquisaClienteTO pesqTO = new PesquisaClienteTO();
        pesqTO.setCnpjCpf(StringHelper.isBlankOrNull((Object)this.b.getText()) ? null : this.b.getText());
        pesqTO.setRazaoSocial(StringHelper.isBlankOrNull((Object)this.a.getText()) ? null : this.a.getText());
        pesqTO.setIe(StringHelper.isBlankOrNull((Object)this.a.getText()) ? null : this.a.getText());
        pesqTO.setIdEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
        pesqTO.setTelaPesquisaEnum(TelaPesquisaEnum.CLIENTE);
        return pesqTO;
    }

    public void populaFiltro(PesquisaClienteTO pesquisaTO) {
        if (pesquisaTO != null) {
            this.b.setText(pesquisaTO.getCnpjCpf());
            this.a.setText(pesquisaTO.getRazaoSocial());
            this.a.setText(pesquisaTO.getIe());
        }
    }

    private void e() {
        this.a = new JPanel();
        this.c = new JLabel();
        this.b = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(60));
        this.i = new JButton();
        this.h = new JButton();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(14));
        this.a = new JLabel();
        this.a = new JFormattedTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new RegexDocumentFilter("[0-9]{0,14}|[pP]{1}[rR]{1}[0-9]{1,8}", 14));
        this.a = new JScrollPane();
        this.g = new JButton();
        this.b = new JButton();
        this.c = new JButton();
        this.j = new JButton();
        this.a = new JButton();
        this.f = new JButton();
        this.d = new JButton();
        this.e = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Cadastro de Clientes", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.a.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(null, "Filtro de Pesquisa", 1, 2)));
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("CNPJ/CPF");
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Nome/Raz\u00e3o Social");
        this.i.setText("Pesquisar");
        this.h.setText("Nova Pesquisa");
        this.b.setHorizontalAlignment(4);
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Inscri\u00e7\u00e3o Estadual");
        this.a.setHorizontalAlignment(4);
        GroupLayout pnlFiltroLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addContainerGap().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.c).addComponent(this.b)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 512, 32767).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.b, -1, 202, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 199, 32767)))).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.h))).addContainerGap()));
        pnlFiltroLayout.setVerticalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b, -2, -1, -2).addComponent(this.a).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.i).addComponent(this.h))));
        this.g.setText("Incluir");
        this.b.setText("Detalhar");
        this.c.setText("Excluir");
        this.j.setText("Sair");
        this.a.setText("Carregar");
        this.f.setText("Importar");
        this.d.setText("Exportar");
        this.e.setText("Fechar");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 669, 32767).addComponent(this.a, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g, -2, 76, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 77, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addGap(8, 8, 8).addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j, -2, 75, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e, -2, 75, -2))).addContainerGap()));
        layout.linkSize(0, this.a, this.b, this.c, this.d, this.g, this.j);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 225, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.g).addComponent(this.b).addComponent(this.c).addComponent(this.j).addComponent(this.f).addComponent(this.d).addComponent(this.e))));
    }

    public JDSGEPageableTable<ClienteTO> getTable() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public void setCarregarVisible(boolean visible) {
        this.a.setVisible(visible);
    }

    public void firePropertyChange(String propertyName, ClienteTO clienteTO) {
        this.firePropertyChange(propertyName, (Object)null, (Object)clienteTO);
    }

    public void setCarregarItf(CarregarTOCadastroInterface<ClienteTO> carregarItf) {
        this.a = carregarItf;
    }

    public CarregarTOCadastroInterface<ClienteTO> getCarregarItf() {
        return this.a;
    }

    static /* synthetic */ JDSGEPageableTable a(PesquisarClienteGUI x0) {
        return x0.a;
    }
}

