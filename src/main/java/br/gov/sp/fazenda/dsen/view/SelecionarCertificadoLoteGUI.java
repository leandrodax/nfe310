/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoLoteGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 *  br.gov.sp.fazenda.dsge.view.table.JButtonRendererEditor
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.format.CNPJFormatter;
import br.gov.sp.fazenda.dsge.view.table.JButtonRendererEditor;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.DefaultFormatter;

public class SelecionarCertificadoLoteGUI
extends DSGEDialog {
    private static final long a = 2125105733014787030L;
    private JButton a;
    private JButton b;
    private JLabel a;
    private JScrollPane a;
    private JPanel a;
    private JDSGETable<CertificadoLoteTO> a;
    private boolean a;
    private Map<String, JComponent[]> a;

    public SelecionarCertificadoLoteGUI(Frame parent, boolean modal, Map<String, CertificadoLoteTO> mapCertificado) throws DSGEViewException {
        super((Window)parent, modal);
        this.a();
        this.b();
        this.d();
        this.c();
        this.setListaCertificadoLote(new ArrayList<CertificadoLoteTO>(mapCertificado.values()));
        WindowManager.getInstance().centralizarDialogo((JDialog)this);
        this.bindController((ViewItf)this);
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.a = new JScrollPane();
        this.b = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(0);
        this.setTitle(DSENLabelConstants.SELECIONAR_CERTIFICADO_LOTE);
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(""));
        this.a.setFont(new Font("Tahoma", 1, 11));
        this.a.setText("Selecione o certificado de transmiss\u00e3o para cada CNPJ");
        this.b.setText("Continuar");
        this.a.setText("Cancelar");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 463, 32767).addComponent(this.a))).addGroup(pnlPrincipalLayout.createSequentialGroup().addGap(150, 150, 150).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a))).addContainerGap()));
        pnlPrincipalLayout.linkSize(0, this.a, this.b);
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 194, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.a)).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.b.addActionListener((ActionListener)listener);
        this.a.addActionListener((ActionListener)listener);
        ((JButtonRendererEditor)this.a.getColumnModel().getColumn(3).getCellEditor()).setActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void setListaCertificadoLote(List<CertificadoLoteTO> lista) {
        this.a.removeAllTO();
        if (lista != null) {
            this.a.addTO(lista);
        }
    }

    public CertificadoLoteTO getSelectedCertificadoLoteTO() {
        return (CertificadoLoteTO)this.a.getTO(this.a.getSelectedRow());
    }

    public Map<String, CertificadoLoteTO> getMapCertificadoLoteTO() {
        List list = this.a.getAllTO();
        HashMap<String, CertificadoLoteTO> map = new HashMap<String, CertificadoLoteTO>();
        for (CertificadoLoteTO cert : list) {
            map.put(cert.getCnpjTransmissao(), cert);
        }
        return map;
    }

    public boolean isCancelled() {
        return this.a;
    }

    public void setCancelled(boolean cancelled) {
        this.a = cancelled;
    }

    public void refreshTable() {
        ((AbstractTableModel)this.a.getModel()).fireTableDataChanged();
    }

    private void b() {
        this.a = new JDSGETable();
        CNPJFormatter cnpjFormatter = null;
        try {
            cnpjFormatter = new CNPJFormatter();
        }
        catch (ParseException parseException) {
            // empty catch block
        }
        JButton button = new JButton("...");
        button.setActionCommand("selecionar");
        this.a.addColumn(0, "cnpjTransmissao", "CNPJ", (DefaultFormatter)cnpjFormatter, false);
        this.a.addColumn(1, "quantidadeLote", "Qtd. NF-e's", false);
        this.a.addColumn(2, "marcado", "", false);
        this.a.addColumnComponent(3, "", (JComponent)button, true, null);
        this.a.getColumnModel().getColumn(1).setMaxWidth(70);
        this.a.getColumnModel().getColumn(2).setMaxWidth(30);
        this.a.getColumnModel().getColumn(3).setMaxWidth(30);
        JButtonRendererEditor editor = new JButtonRendererEditor();
        this.a.getColumnModel().getColumn(3).setCellEditor((TableCellEditor)editor);
        this.a.getColumnModel().getColumn(3).setCellRenderer((TableCellRenderer)editor);
        this.a.setViewportView((Component)this.a);
    }

    private void c() {
        this.b.setActionCommand("continuar");
        this.a.setActionCommand("cancelar");
    }

    private void d() {
        this.a = new HashMap();
        this.a.put("buscaSefazCertificadoTodos", new JComponent[]{this.b});
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

