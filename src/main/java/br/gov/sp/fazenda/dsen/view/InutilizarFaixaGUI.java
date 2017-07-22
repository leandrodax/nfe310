/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI
 *  br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI$1
 *  br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI$2
 *  br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI$3
 *  br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI$4
 *  br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI$5
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.view.InutilizarFaixaGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class InutilizarFaixaGUI
extends DSGEDialog {
    private static final long a = 3063695760749193051L;
    private JButton a;
    private JLabel a;
    private JPanel a;
    private JScrollPane a;
    private JProgressBar a;
    private JDSGETable<InutilizacaoTO> a;

    public InutilizarFaixaGUI(Frame parent, boolean modal) {
        super((Window)parent, modal);
        this.c();
        this.b();
        this.a();
        this.a.fitTableColumns();
        this.setLocationRelativeTo(null);
    }

    private void a() {
        this.a.setEnabled(false);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
         redRenderer = new /* Unavailable Anonymous Inner Class!! */;
         greenRenderer = new /* Unavailable Anonymous Inner Class!! */;
         orangeRenderer = new /* Unavailable Anonymous Inner Class!! */;
        this.a = new /* Unavailable Anonymous Inner Class!! */;
        int column = 1;
        this.a.addColumn(0, "icon", "", false);
        this.a.addColumn(column, "serie", "S\u00e9rie", false);
        this.a.addColumn(column + 1, "numeroInicial", "In\u00edcio", false);
        this.a.addColumn(column + 2, "numeroFinal", "Fim", false);
        this.a.addColumn(column + 3, "resultado", "Resultado", false);
        this.a.getColumnModel().getColumn(0).setMaxWidth(20);
        this.a.getColumnModel().getColumn(1).setMaxWidth(30);
        this.a.getColumnModel().getColumn(2).setMaxWidth(100);
        this.a.getColumnModel().getColumn(column).setMaxWidth(100);
        this.a.getColumnModel().getColumn(column + 1).setMaxWidth(100);
        this.a.getColumnModel().getColumn(column + 2).setMaxWidth(100);
        this.a.setAutoFitTableColumns(true);
        this.a.setScrollPane(this.a);
    }

    private void c() {
        this.a = new JPanel();
        this.a = new JProgressBar();
        this.a = new JLabel();
        this.a = new JButton();
        this.a = new JScrollPane();
        this.setDefaultCloseOperation(0);
        this.setTitle("Inutilizando Faixas");
        this.a.setBorder(BorderFactory.createTitledBorder("Status do Processamento"));
        this.a.setIndeterminate(true);
        this.a.setStringPainted(true);
        this.a.setFont(new Font("Tahoma", 0, 11));
        this.a.setText("Resumo das Opera\u00e7\u00f5es:");
        this.a.setText("Fechar");
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 635, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 635, 32767)).addContainerGap()).addGroup(pnlPrincipalLayout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 290, 32767).addComponent(this.a).addContainerGap(283, 32767)))));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 183, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        this.pack();
    }

    public void setProgressBarIndeterminated(boolean b) {
        this.a.setIndeterminate(b);
    }

    public boolean isProgressBarIndeterminated() {
        return this.a.isIndeterminate();
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void updateGUI(InutilizacaoTO inutilizacaoTO) {
        this.a.addTO((BaseTO)inutilizacaoTO);
    }

    public void setFecharEnabled(boolean enabled) {
        this.a.setEnabled(enabled);
    }

    public void done() {
        this.setFecharEnabled(true);
        this.setProgressBarIndeterminated(false);
        this.a.setValue(100);
        this.setDefaultCloseOperation(2);
    }

    public void setPercentCompleted(int percent) {
        this.a.setValue(percent);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

