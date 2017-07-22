/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlTableResultadoGUI
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlTableResultadoGUI$1
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroPnlTableResultadoGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.DefaultFormatter;

public class ConsultaCadastroPnlTableResultadoGUI
extends JPanel {
    private JButton a;
    private JPanel a;
    private JDSGEPageableTable<EstabelecimentoTO> a;

    public ConsultaCadastroPnlTableResultadoGUI() {
        this.d();
        this.b();
        this.a();
    }

    private void a() {
        this.a.setActionCommand("detalhar");
    }

    public void addActionListener(ActionListener aL) {
        this.a.addActionListener(aL);
    }

    private void b() {
        this.a = new JDSGEPageableTable();
        ParametroTO numRegPagTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_NUM_REG_POR_PAG_CONSULTA, ParametroTO.class);
        this.a.setPageSize(Integer.parseInt(numRegPagTO.getValor()));
        int index = 0;
        this.a.addColumn(index++, "marcado", "", true, null);
        this.a.addColumn(index++, "nrDocumento", "CNPJ/CPF", (DefaultFormatter)new DocumentoFormatter(), false, null);
        this.a.addColumn(index++, "IEFormatada", "Inscri\u00e7\u00e3o Estadual", false, null);
        this.a.addColumn(index++, "UF", "UF", false, null);
        this.a.addColumn(index++, "XNome", "Nome/Raz\u00e3o Social", false, null);
        this.a.addColumn(index++, "situacao", "Situa\u00e7\u00e3o", false, null);
        this.a.setSortable(false);
        this.a.setPageable(false);
        this.a.setSelectAllAvailable(false);
        this.a.getWrappedTable().getColumnModel().getColumn(0).setMaxWidth(30);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setPreferredWidth(160);
        this.a.getWrappedTable().getColumnModel().getColumn(1).setMaxWidth(170);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setPreferredWidth(160);
        this.a.getWrappedTable().getColumnModel().getColumn(2).setMaxWidth(170);
        this.a.getWrappedTable().getColumnModel().getColumn(3).setMaxWidth(70);
        this.a.setPanel(this.a);
        this.a.addCellEditorListener(0, (CellEditorListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c() {
        List list = this.a.getSelectedTOs();
        if (list == null || list.size() != 1) {
            this.a.setEnabled(false);
        } else {
            this.a.setEnabled(true);
        }
    }

    private void d() {
        this.a = new JPanel();
        this.a = new JButton();
        this.a.setBorder(BorderFactory.createTitledBorder("Lista de Estabelecimentos"));
        GroupLayout pnlTableLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(pnlTableLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 519, 32767));
        pnlTableLayout.setVerticalGroup(pnlTableLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 224, 32767));
        this.a.setText("Detalhar");
        this.a.setEnabled(false);
        this.a.setMargin(new Insets(1, 7, 1, 7));
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.a).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.a, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a)));
    }

    public void addTO(List<EstabelecimentoTO> list) {
        this.a.addTO(list);
        this.c();
    }

    public EstabelecimentoTO getSelectedTO() {
        return (EstabelecimentoTO)this.a.getSelectedTOs().get(0);
    }

    static /* synthetic */ void a(ConsultaCadastroPnlTableResultadoGUI x0) {
        x0.c();
    }
}

