/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.view.VisualizarDPECsGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
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
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.event.CellEditorListener;

public class VisualizarDPECsGUI
extends DSGESimplePanel {
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
    private JPanel a;
    private JPanel b;
    private JLabel a;
    private JLabel b;
    private JPanel c;
    private JPanel d;
    private JTextField a;
    private JTextField b;
    private JDSGEPageableTable<DpecTO> a;
    private JDSGEPageableTable<DpecTO> b;
    private HashMap<String, JComponent[]> a;

    public VisualizarDPECsGUI() throws DSGEViewException {
        this.c();
        this.d();
        this.b();
        this.a();
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.a.setActionCommand("ACTION_ATUALIZAR_AUTORIZADOS");
        this.b.setActionCommand("ACTION_ATUALIZAR_GERADOS");
        this.c.setActionCommand("ACTION_DETALHAR_AUTORIZADOS");
        this.d.setActionCommand("ACTION_DETALHAR_GERADOS");
        this.e.setActionCommand("ACTION_EXCLUIR_ERADOS");
        this.g.setActionCommand("ACTION_IMPORTAR_AUTORIZADOS");
        this.h.setActionCommand("ACTION_LOCALIZAR_AUTORIZADOS");
        this.i.setActionCommand("ACTION_LOCALIZAR_GERADOS");
        this.j.setActionCommand("ACTION_TRANSMITIR_GERADOS");
        this.f.setActionCommand("fechar");
    }

    private void b() {
        this.a = new JDSGEPageableTable();
        this.a.setSelectAllAvailable(true);
        this.a.setPageable(false);
        this.a.setSortable(true);
        this.a.addColumn(0, "marcado", "", true, null);
        this.a.addColumn(1, "nomeArquivo", "Nome do Arquivo", false, "nomeArquivo");
        this.a.addColumn(2, "quantidadeNotas", "# Registros", false, "quantidadeNotas");
        this.a.addColumn(3, "dataHoraGeracaoFormatada", "Data de Cria\u00e7\u00e3o", false, "dataHoraGeracaoFormatada");
        this.a.setAutoFitTableColumns(true);
        this.a.setInitialSortColumn(3, false);
        this.a.setSortColumnDbFieldName("dataGeracao");
        this.a.setSortColumnASC(false);
        this.a.setPanel(this.d);
        this.b = new JDSGEPageableTable();
        this.b.setSelectAllAvailable(true);
        this.b.setPageable(false);
        this.b.setSortable(true);
        this.b.addColumn(0, "marcado", "", true, null);
        this.b.addColumn(1, "nomeArquivo", "Nome do Arquivo", false, "nomeArquivo");
        this.b.addColumn(2, "quantidadeNotas", "# Registros", false, "quantidadeNotas");
        this.b.addColumn(3, "dataHoraRegistroFormatada", "Data de Autoriza\u00e7\u00e3o", false, "dataHoraRegistroFormatada");
        this.b.setAutoFitTableColumns(true);
        this.b.setInitialSortColumn(3, false);
        this.b.setSortColumnDbFieldName("dataRegistro");
        this.b.setSortColumnASC(false);
        this.b.setPanel(this.c);
    }

    public List<DpecTO> getSelectedAutorizadosList() {
        return this.b.getSelectedTOs();
    }

    public List<DpecTO> getSelectedGeradosList() {
        return this.a.getSelectedTOs();
    }

    public void setAutorizadosDir(String path) {
        this.a.setText(path);
    }

    public void setGeradosDir(String path) {
        this.b.setText(path);
    }

    public void setAutorizadosList(List<DpecTO> autorizados) {
        this.b.removeAllTO();
        if (autorizados != null) {
            this.b.addTO(autorizados);
        }
    }

    public void setGeradosList(List<DpecTO> gerados) {
        this.a.removeAllTO();
        if (gerados != null) {
            this.a.addTO(gerados);
        }
    }

    private void c() {
        this.a = new JPanel();
        this.i = new JButton();
        this.a = new JLabel();
        this.b = new JTextField();
        this.b = new JButton();
        this.d = new JButton();
        this.j = new JButton();
        this.e = new JButton();
        this.d = new JPanel();
        this.b = new JPanel();
        this.b = new JLabel();
        this.a = new JTextField();
        this.h = new JButton();
        this.a = new JButton();
        this.c = new JButton();
        this.g = new JButton();
        this.c = new JPanel();
        this.f = new JButton();
        this.setBorder((Border)BorderFactory.createTitledBorder(null, "Visualizar DPECs", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        this.a.setBorder(BorderFactory.createTitledBorder(null, "DPECs Gerados", 0, 0, new Font("Dialog", 0, 11), Color.blue));
        this.i.setFont(new Font("Tahoma", 1, 11));
        this.i.setText("Localizar");
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Local do(s) arquivo(s):");
        this.b.setEnabled(false);
        this.b.setText("Atualizar Conte\u00fado");
        this.d.setText("Detalhar");
        this.d.setEnabled(false);
        this.j.setText("Transmitir");
        this.j.setEnabled(false);
        this.e.setText("Excluir");
        this.e.setEnabled(false);
        GroupLayout pnlGeradosLayout = new GroupLayout(this.d);
        this.d.setLayout(pnlGeradosLayout);
        pnlGeradosLayout.setHorizontalGroup(pnlGeradosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 715, 32767));
        pnlGeradosLayout.setVerticalGroup(pnlGeradosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 123, 32767));
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, 399, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.i).addGap(82, 82, 82)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.j).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.e).addContainerGap()).addComponent(this.d, -1, -1, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a, -2, 24, -2).addComponent(this.b, -2, -1, -2).addComponent(this.i)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.d).addComponent(this.j).addComponent(this.e))));
        this.b.setBorder(BorderFactory.createTitledBorder(null, "DPECs Autorizados", 0, 0, new Font("Dialog", 0, 11), Color.blue));
        this.b.setFont(new Font("Tahoma", 1, 11));
        this.b.setText("Local do(s) arquivo(s):");
        this.a.setEnabled(false);
        this.h.setFont(new Font("Tahoma", 1, 11));
        this.h.setText("Localizar");
        this.a.setText("Atualizar Conte\u00fado");
        this.c.setText("Detalhar");
        this.c.setEnabled(false);
        this.g.setText("Importar");
        GroupLayout pnlAutorizadosLayout = new GroupLayout(this.c);
        this.c.setLayout(pnlAutorizadosLayout);
        pnlAutorizadosLayout.setHorizontalGroup(pnlAutorizadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 715, 32767));
        pnlAutorizadosLayout.setVerticalGroup(pnlAutorizadosLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 121, 32767));
        GroupLayout jPanel2Layout = new GroupLayout(this.b);
        this.b.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 395, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.h)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.g))).addGap(86, 86, 86)).addComponent(this.c, -1, -1, 32767));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b, -2, 24, -2).addComponent(this.a, -2, -1, -2).addComponent(this.h)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.a).addComponent(this.c).addComponent(this.g))));
        this.f.setText("Fechar");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767).addComponent(this.b, -1, -1, 32767).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(323, 32767).addComponent(this.f).addContainerGap(328, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.f)));
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
        this.d.addActionListener((ActionListener)listener);
        this.e.addActionListener((ActionListener)listener);
        this.g.addActionListener((ActionListener)listener);
        this.h.addActionListener((ActionListener)listener);
        this.i.addActionListener((ActionListener)listener);
        this.j.addActionListener((ActionListener)listener);
        this.f.addActionListener((ActionListener)listener);
        this.a.addCellEditorListener(0, (CellEditorListener)listener);
        this.b.addCellEditorListener(0, (CellEditorListener)listener);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    private void d() {
        this.a = new HashMap();
        this.a.put("VISUALIZAR_DPECS_GERADOS_ONE_SELECTED", new JComponent[]{this.d});
        this.a.put("VISUALIZAR_DPECS_AUTORIZADOS_ONE_SELECTED", new JComponent[]{this.c});
        this.a.put("VISUALIZAR_DPECS_GERADOS_MANY_SELECTED", new JComponent[]{this.j, this.e});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public JDSGEPageableTable getTblAutorizados() {
        return this.b;
    }

    public JDSGEPageableTable getTblGerados() {
        return this.a;
    }
}

