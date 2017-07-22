/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.util.DSENViewConstants
 *  br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI$1
 *  br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI$2
 *  br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI$3
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.util.DSENViewConstants;
import br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.format.LengthDocumentFilter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
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

public class PesquisarEmitenteGUI
extends DSGESimplePanel {
    private String a;
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
    private JButton k;
    private JLabel a;
    private JLabel b;
    private JPanel a;
    private JScrollPane a;
    private JTextField a;
    private JTextField b;
    private JDSGEPageableTable<EmitenteTO> a;
    private HashMap<String, JComponent[]> a;

    public PesquisarEmitenteGUI(String operacao) throws DSGEViewException {
        this.a = operacao;
        this.f();
        this.a();
        this.c();
        this.b();
        this.d();
        this.e();
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.k.setActionCommand("emitenteLoggedOn");
        this.h.setActionCommand("pesquisar");
        this.f.setActionCommand("incluir");
        this.b.setActionCommand("detalhar");
        this.c.setActionCommand("excluir");
        this.d.setActionCommand("exportar");
        this.e.setActionCommand("acionarImportar");
        this.g.setActionCommand(DSENViewConstants.ACTION_LIMPAR_PESQUISA);
        this.a.setActionCommand("executarBackup");
        this.i.setActionCommand("executarRestore");
    }

    private void b() {
        this.a = new JDSGEPageableTable();
        ParametroTO numRegPagTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_NUM_REG_POR_PAG_CONSULTA, ParametroTO.class);
        this.a.setPageSize(Integer.parseInt(numRegPagTO.getValor()));
        CNPJFormatter cnpjF = null;
        try {
            cnpjF = new CNPJFormatter();
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "nrDocumento", "CNPJ", (DefaultFormatter)cnpjF, false, "nrDocumento");
        this.a.addColumn(2, "ieFormatada", "Inscri\u00e7\u00e3o Estadual", false, "ie");
        this.a.addColumn(3, "XNome", "Raz\u00e3o Social", false, "xNome");
        this.a.setSortColumnDbFieldName("xNome");
        this.a.setSortColumnASC(true);
        this.a.setInitialSortColumn(3, true);
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setPreferredWidth(160);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(170);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(160);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(170);
        this.a.setViewportView((Component)this.a);
    }

    private void c() {
        this.j.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void limparFiltro() {
        this.b.setText(null);
        this.a.setText(null);
        this.a.requestFocus();
    }

    private void d() {
        this.g.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void e() {
        this.a = new HashMap();
        this.a.put("EmitenteInit", new JComponent[]{this.b, this.c, this.d, this.f, this.e, this.k, this.a});
        this.a.put("selectEmitenteInit", new JComponent[]{this.f, this.e, this.i});
        this.a.put("selectClienteManyeSelected", new JComponent[]{this.c, this.d, this.e, this.f, this.i});
        this.a.put("selectEmitenteOneSelected", new JComponent[]{this.k, this.c, this.b, this.d, this.e, this.f, this.a, this.i});
        this.a.put("emitente_nao_selecionado", new JComponent[]{this.j});
    }

    private void f() {
        this.b = new JButton();
        this.f = new JButton();
        this.j = new JButton();
        this.d = new JButton();
        this.c = new JButton();
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(14));
        this.b = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new LengthDocumentFilter(60));
        this.h = new JButton();
        this.g = new JButton();
        this.e = new JButton();
        this.k = new JButton();
        this.a = new JScrollPane();
        this.a = new JButton();
        this.i = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Cadastro de Emitentes", 2, 0, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.b.setText("Detalhar");
        this.f.setText("Incluir");
        this.j.setText("Sair");
        this.d.setText("Exportar");
        this.c.setText("Excluir");
        this.a.setBorder(BorderFactory.createTitledBorder(BorderFactory.createTitledBorder(null, "Filtro de Pesquisa", 1, 2)));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("CNPJ");
        this.a.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Nome/Raz\u00e3o Social");
        this.h.setText("Pesquisar");
        this.g.setText("Nova Pesquisa");
        GroupLayout pnlFiltroLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addContainerGap().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.h).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g)).addGroup(pnlFiltroLayout.createSequentialGroup().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.a, -2, 45, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -2, 469, -2).addComponent(this.a, -2, 211, -2)))).addContainerGap(123, 32767)));
        pnlFiltroLayout.setVerticalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.b, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.h).addComponent(this.g))));
        this.e.setText("Importar");
        this.k.setText("Iniciar");
        this.a.setText("Backup");
        this.i.setText("Restore");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 735, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.k).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f, -2, 76, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 77, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -2, 77, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 69, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.i).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j, -2, 75, -2))).addContainerGap()));
        layout.linkSize(0, this.f, this.k);
        layout.linkSize(0, this.a, this.d, this.i);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 253, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.b).addComponent(this.c).addComponent(this.e).addComponent(this.d).addComponent(this.k).addComponent(this.a).addComponent(this.i).addComponent(this.j)).addContainerGap()));
    }

    public void addActionListener(EventListener listener) {
        this.k.addActionListener((ActionListener)listener);
        this.h.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
        this.g.addActionListener((ActionListener)listener);
        this.a.setActionListener((ActionListener)listener);
        this.a.addPageableSortableListener((PageableSortableTableActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.i.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public EmitenteTO getEmitenteTO() {
        EmitenteTO emitente = new EmitenteTO();
        if (this.a.getText() != null && !this.a.getText().trim().equals("")) {
            emitente.setNrDocumento(this.a.getText().trim());
        }
        if (this.b.getText() != null && !this.b.getText().trim().equals("")) {
            emitente.setXNome(this.b.getText().trim());
        }
        return emitente;
    }

    public EmitenteTO getSelectedEmitenteTO() {
        List lista = this.a.getSelectedItens(0);
        EmitenteTO emitente = null;
        if (lista != null && lista.size() > 0) {
            emitente = (EmitenteTO)lista.get(0);
        }
        return emitente;
    }

    public List<EmitenteTO> getSelectedEmitentes() {
        return this.a.getSelectedItens(0);
    }

    public void setEmitenteTOList(List<EmitenteTO> lista) {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    public String getOperacao() {
        return this.a;
    }

    public void setOperacao(String operacao) {
        this.a = operacao;
    }

    public JDSGEPageableTable<EmitenteTO> getTable() {
        return this.a;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ JDSGEPageableTable a(PesquisarEmitenteGUI x0) {
        return x0.a;
    }
}

