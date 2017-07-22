/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI$1
 *  br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI$2
 *  br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI$3
 *  br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI$4
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.view.EnviarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class EnviarNotaFiscalGUI
extends DSGEDialog {
    private static final long a = -8142339695208636507L;
    private JButton a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JProgressBar a;
    private JScrollPane a;
    private JDSGETable<NotaFiscalTO> a;

    public EnviarNotaFiscalGUI(Frame parent) {
        super((Window)parent, true);
        this.a();
        this.c();
        WindowManager.getInstance().centralizarDialogo((JDialog)this);
        this.setDefaultCloseOperation(0);
        this.b();
    }

    private void a() {
        this.a = new JLabel();
        this.b = new JLabel();
        this.a = new JProgressBar();
        this.a = new JScrollPane();
        this.c = new JLabel();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Enviando Nota(s) Fiscal(is) Eletr\u00f4nica(s).");
        this.a.setText("Enviando Nota(s) Fiscal(is) Eletr\u00f4nica(s).");
        this.b.setText("Por favor, aguarde.");
        this.a.setIndeterminate(true);
        this.a.setStringPainted(true);
        this.c.setText("Resumo das Opera\u00e7\u00f5es:");
        this.a.setText("Fechar");
        this.a.setEnabled(false);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 642, 32767).addComponent(this.b).addComponent(this.c).addComponent(this.a, -1, 642, 32767).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 289, 32767).addComponent(this.a).addGap(0, 279, 32767)).addComponent(this.a, -2, 426, -2)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addGap(20, 20, 20).addComponent(this.a, -2, -1, -2).addGap(17, 17, 17).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 118, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
        this.pack();
    }

    private void b() {
        this.a.setActionCommand("cancelar");
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void firePropertyChange(String propertyName, Object b, Object c) {
        super.firePropertyChange(propertyName, b, c);
    }

    private void c() {
         redRenderer = new /* Unavailable Anonymous Inner Class!! */;
         greenRenderer = new /* Unavailable Anonymous Inner Class!! */;
         orangeRenderer = new /* Unavailable Anonymous Inner Class!! */;
        this.a = new /* Unavailable Anonymous Inner Class!! */;
        this.a.addColumn(0, "icon", "", false);
        this.a.addColumn(1, "ano", "Ano", false);
        this.a.addColumn(2, "serie", "S\u00e9rie", false);
        this.a.addColumn(3, "numero", "N\u00famero", false);
        this.a.addColumn(4, "resultadoEnvio", "Resultado do Envio", false);
        this.a.getColumnModel().getColumn(0).setMinWidth(20);
        this.a.getColumnModel().getColumn(0).setMaxWidth(20);
        this.a.getColumnModel().getColumn(1).setMinWidth(40);
        this.a.getColumnModel().getColumn(1).setMaxWidth(40);
        this.a.getColumnModel().getColumn(2).setMinWidth(35);
        this.a.getColumnModel().getColumn(2).setMaxWidth(35);
        this.a.getColumnModel().getColumn(3).setMinWidth(90);
        this.a.getColumnModel().getColumn(3).setMaxWidth(90);
        this.a.getColumnModel().getColumn(4).setMinWidth(454);
        this.a.setAutoFitTableColumns(true);
        this.a.setScrollPane(this.a);
    }

    public void addNotaFiscalTO(NotaFiscalTO nTO) {
        this.a.addTO((BaseTO)nTO);
    }

    public void setProgressBarIndeterminated(boolean b) {
        this.a.setIndeterminate(b);
    }

    public boolean isProgressBarIndeterminated() {
        return this.a.isIndeterminate();
    }

    public void setBtnFecharEnabled(boolean b) {
        this.a.setEnabled(b);
    }

    public void setPercentCompleted(int i) {
        if (this.isProgressBarIndeterminated()) {
            this.setProgressBarIndeterminated(false);
        }
        this.a.setValue(i);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

