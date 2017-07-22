/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.view.PesquisarFaixasInutilizadasGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarFaixasInutilizadasGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.DateHourMinuteFormatter
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.view.PesquisarFaixasInutilizadasGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.DateHourMinuteFormatter;
import br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
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

public class PesquisarFaixasInutilizadasGUI
extends DSGESimplePanel
implements FocusListener {
    private static final long a = 1540204907830371042L;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton e;
    private JButton f;
    private JLabel a;
    private JPanel a;
    private JScrollPane a;
    private JTextField a;
    private JDSGEPageableTable<InutilizacaoTO> a;
    private Map<String, JComponent[]> a;

    public PesquisarFaixasInutilizadasGUI() throws DSGEViewException {
        this.setDesabilitaMenu(true);
        this.e();
        this.a();
        this.c();
        this.b();
        this.d();
        this.a.addFocusListener((FocusListener)this);
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.e.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
        this.f.setActionCommand("pesquisar");
        this.a.setActionCommand("detalhar");
        this.c.setActionCommand("fechar");
        this.b.setActionCommand("exportar");
        this.d.setActionCommand("importar");
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("inutilizarFaixaInicio", new JComponent[]{this.a, this.b});
        this.a.put("inutilizarFaixaUmaSelecionada", new JComponent[]{this.a, this.b, this.d});
        this.a.put("inutilizarFaixaVariasSelecionadas", new JComponent[]{this.b, this.d});
    }

    private void d() {
        this.a = new JDSGEPageableTable();
        ParametroTO numRegPagTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_NUM_REG_POR_PAG_CONSULTA, ParametroTO.class);
        this.a.setPageSize(Integer.parseInt(numRegPagTO.getValor()));
        this.a.setPageable(false);
        this.a.setSortable(false);
        int column = 0;
        this.a.addColumn(column++, "marcado", "", true, null);
        this.a.addColumn(column++, "serie", "S\u00e9rie", false, null);
        this.a.addColumn(column++, "numeroInicial", "N\u00famero Inicial", false, null);
        this.a.addColumn(column++, "numeroFinal", "N\u00famero Final", false, null);
        try {
            this.a.addColumn(column++, "dataInutilizacao", "Data da Inutiliza\u00e7\u00e3o", (DefaultFormatter)new DateHourMinuteFormatter(), false, null);
        }
        catch (ParseException e) {
            this.showErrors((Throwable)e);
        }
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.setViewportView((Component)this.a);
    }

    private void e() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.f = new JButton();
        this.e = new JButton();
        this.a = new JScrollPane();
        this.a = new JButton();
        this.c = new JButton();
        this.b = new JButton();
        this.d = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Faixas Inutilizadas", 2, 2, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.a.setBorder(BorderFactory.createTitledBorder("Filtro de Pesquisa"));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("S\u00e9rie");
        this.a.setHorizontalAlignment(4);
        this.f.setText("Pesquisar");
        this.e.setText("Nova Pesquisa");
        GroupLayout pnlFiltroLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addContainerGap().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 40, -2)).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e))).addContainerGap(325, 32767)));
        pnlFiltroLayout.linkSize(0, this.e, this.f);
        pnlFiltroLayout.setVerticalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.f).addComponent(this.e)).addContainerGap(-1, 32767)));
        this.a.setText("Detalhar");
        this.c.setText("Fechar");
        this.b.setText("Exportar");
        this.d.setLabel("Importar");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 563, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c))).addContainerGap()));
        layout.linkSize(0, this.a, this.c);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 195, 32767).addGap(9, 9, 9).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.b).addComponent(this.d).addComponent(this.c)).addContainerGap()));
    }

    public void addActionListener(EventListener listener) {
        this.f.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public InutilizacaoTO getInutilizacaoTO() {
        InutilizacaoTO inutilizacaoTO = new InutilizacaoTO();
        inutilizacaoTO.setSerie(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
        return inutilizacaoTO;
    }

    public List<InutilizacaoTO> getSelectedInutilizacaoTOs() {
        return this.a.getSelectedItens(0);
    }

    public InutilizacaoTO getSelectedInutilizacaoTO() {
        List lista = this.getSelectedInutilizacaoTOs();
        InutilizacaoTO inutilizacaoTO = null;
        if (lista != null && lista.size() > 0) {
            inutilizacaoTO = (InutilizacaoTO)lista.get(0);
        }
        return inutilizacaoTO;
    }

    public void setListaInutilizacaoTO(List<InutilizacaoTO> lista) {
        this.a.removeAllTO();
        this.a.addTO(lista);
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == this.a && !StringHelper.isBlankOrNull((Object)this.a.getText())) {
            String serie = StringHelper.completaComZerosAEsquerda((String)this.a.getText(), (int)3);
            this.a.setText(serie);
        }
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ JTextField a(PesquisarFaixasInutilizadasGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JDSGEPageableTable a(PesquisarFaixasInutilizadasGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JButton a(PesquisarFaixasInutilizadasGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JButton b(PesquisarFaixasInutilizadasGUI x0) {
        return x0.b;
    }
}

