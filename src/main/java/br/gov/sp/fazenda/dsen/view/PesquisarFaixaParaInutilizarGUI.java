/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.view.PesquisarFaixaParaInutilizarGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarFaixaParaInutilizarGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.NumberDocumentFilter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.view.PesquisarFaixaParaInutilizarGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
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
import java.util.Collection;
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
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class PesquisarFaixaParaInutilizarGUI
extends DSGESimplePanel
implements FocusListener {
    private static final long a = -8896792574635834000L;
    private String a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JPanel a;
    private JScrollPane a;
    private JTextField a;
    private JTextField b;
    private JTextField c;
    private JDSGEPageableTable<InutilizacaoTO> a;
    private Map<String, JComponent[]> a;

    public PesquisarFaixaParaInutilizarGUI(String op) throws DSGEViewException {
        this.setOperacao(op);
        this.setDesabilitaMenu(true);
        this.e();
        this.a();
        this.c();
        this.b();
        this.d();
        this.c.addFocusListener((FocusListener)this);
        this.b.addFocusListener((FocusListener)this);
        this.a.addFocusListener((FocusListener)this);
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.c.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
        this.d.setActionCommand("pesquisar");
        this.b.setActionCommand("inutilizar");
        this.a.setActionCommand("fechar");
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("inutilizarFaixaInicio", new JComponent[]{this.b});
        this.a.put("inutilizarFaixaNumeracao", new JComponent[0]);
        this.a.put("inutilizarFaixaUmaSelecionada", new JComponent[]{this.b});
        this.a.put("inutilizarFaixaVariasSelecionadas", new JComponent[]{this.b});
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
        this.a.addColumn(column++, "numeroInicial", "In\u00edcio", false, null);
        this.a.addColumn(column++, "numeroFinal", "Fim", false, null);
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.setViewportView((Component)this.a);
    }

    private void e() {
        this.a = new JPanel();
        this.d = new JLabel();
        this.c = new JTextField();
        ((AbstractDocument)this.c.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(3));
        this.c = new JLabel();
        this.b = new JTextField();
        ((AbstractDocument)this.b.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.b = new JLabel();
        this.a = new JTextField();
        ((AbstractDocument)this.a.getDocument()).setDocumentFilter((DocumentFilter)new NumberDocumentFilter(9));
        this.d = new JButton();
        this.c = new JButton();
        this.a = new JLabel();
        this.a = new JScrollPane();
        this.b = new JButton();
        this.a = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Inutiliza\u00e7\u00e3o de Faixas", 2, 2, new Font("Dialog", 1, 14), new Color(0, 0, 255)));
        this.a.setBorder(BorderFactory.createTitledBorder("Filtro de Pesquisa"));
        this.d.setFont(new Font("Tahoma", 1, 11));
        this.d.setText("S\u00e9rie");
        this.c.setHorizontalAlignment(4);
        this.c.setFont(new Font("Tahoma", 1, 11));
        this.c.setText("N\u00famero Inicial");
        this.b.setHorizontalAlignment(4);
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("N\u00famero Final");
        this.a.setHorizontalAlignment(4);
        this.d.setText("Pesquisar");
        this.c.setText("Nova Pesquisa");
        this.a.setFont(new Font("Dialog", 2, 12));
        this.a.setText("<html><p>Informe acima a s\u00e9rie e os n\u00fameros inicial e final da faixa a ser inutilizada. Cuidado: caso estes dados n\u00e3o sejam informados ou seja informada uma faixa muito grande de numera\u00e7\u00e3o, a pesquisa poder\u00e1 trazer como resultado NF-e's j\u00e1 exclu\u00eddas deste microcomputador.</p></html>");
        GroupLayout pnlFiltroLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlFiltroLayout);
        pnlFiltroLayout.setHorizontalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addContainerGap().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 601, 32767).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 40, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -2, 153, -2).addGap(18, 18, 18).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2)).addGroup(pnlFiltroLayout.createSequentialGroup().addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c))).addContainerGap()));
        pnlFiltroLayout.linkSize(0, this.a, this.b);
        pnlFiltroLayout.linkSize(0, this.c, this.d);
        pnlFiltroLayout.setVerticalGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlFiltroLayout.createSequentialGroup().addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.c, -2, -1, -2).addComponent(this.c).addComponent(this.b, -2, -1, -2).addComponent(this.b).addComponent(this.a, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 60, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlFiltroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.c))));
        this.b.setText("Inutilizar");
        this.a.setText("Fechar");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 635, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a))).addContainerGap()));
        layout.linkSize(0, this.a, this.b);
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 147, 32767).addGap(9, 9, 9).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap()));
    }

    public void addActionListener(EventListener listener) {
        this.d.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public InutilizacaoTO getInutilizacaoTO() {
        InutilizacaoTO inutilizacaoTO = new InutilizacaoTO();
        inutilizacaoTO.setSerie(!StringHelper.isBlankOrNull((Object)this.c.getText()) ? this.c.getText() : null);
        inutilizacaoTO.setNumeroInicial(!StringHelper.isBlankOrNull((Object)this.b.getText()) ? this.b.getText() : null);
        inutilizacaoTO.setNumeroFinal(!StringHelper.isBlankOrNull((Object)this.a.getText()) ? this.a.getText() : null);
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

    public void setListaInutilizacaoTO(HashMap<String, List<InutilizacaoTO>> map) {
        this.a.removeAllTO();
        for (List<InutilizacaoTO> lista : map.values()) {
            if (lista.isEmpty()) continue;
            this.a.addTO(lista);
        }
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
            if (!StringHelper.isBlankOrNull((Object)this.c.getText())) {
                String serie = StringHelper.completaComZerosAEsquerda((String)this.c.getText(), (int)3);
                this.c.setText(serie);
            }
        } else if (e.getSource() == this.b) {
            if (!StringHelper.isBlankOrNull((Object)this.b.getText())) {
                String inicio = StringHelper.completaComZerosAEsquerda((String)this.b.getText(), (int)9);
                this.b.setText(inicio);
            }
        } else if (e.getSource() == this.a && !StringHelper.isBlankOrNull((Object)this.a.getText())) {
            String fim = StringHelper.completaComZerosAEsquerda((String)this.a.getText(), (int)9);
            this.a.setText(fim);
        }
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    static /* synthetic */ JTextField a(PesquisarFaixaParaInutilizarGUI x0) {
        return x0.c;
    }

    static /* synthetic */ JTextField b(PesquisarFaixaParaInutilizarGUI x0) {
        return x0.b;
    }

    static /* synthetic */ JTextField c(PesquisarFaixaParaInutilizarGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JDSGEPageableTable a(PesquisarFaixaParaInutilizarGUI x0) {
        return x0.a;
    }
}

