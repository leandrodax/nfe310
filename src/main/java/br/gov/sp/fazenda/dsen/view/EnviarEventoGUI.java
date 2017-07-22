/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.view.EnviarEventoGUI
 *  br.gov.sp.fazenda.dsen.view.EnviarEventoGUI$1
 *  br.gov.sp.fazenda.dsen.view.EnviarEventoGUI$2
 *  br.gov.sp.fazenda.dsen.view.EnviarEventoGUI$3
 *  br.gov.sp.fazenda.dsen.view.EnviarEventoGUI$4
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.view.EnviarEventoGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class EnviarEventoGUI
extends DSGEDialog {
    private static final long a = -978102055050462073L;
    private String a;
    private JButton a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JProgressBar a;
    private JScrollPane a;
    private JDSGETable<EventoTO> a;

    public EnviarEventoGUI(Window parent) {
        super(parent, true);
        this.a();
        this.c();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(0);
        this.b();
    }

    public void setTituloPersonalizado(String tituloPersonalizado) {
        this.a = tituloPersonalizado;
        this.setTitle(tituloPersonalizado);
        this.b.setText(tituloPersonalizado);
    }

    public String getTituloPersonalizado() {
        return this.a;
    }

    private void a() {
        this.b = new JLabel();
        this.a = new JLabel();
        this.a = new JProgressBar();
        this.a = new JScrollPane();
        this.c = new JLabel();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Enviando Evento(s)");
        this.b.setText("Enviando Evento(s)");
        this.a.setText("Por favor, aguarde.");
        this.a.setIndeterminate(true);
        this.a.setStringPainted(true);
        this.c.setText("Resumo das Opera\u00e7\u00f5es:");
        this.a.setText("Fechar");
        this.a.setEnabled(false);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 641, 32767).addComponent(this.a).addComponent(this.c).addComponent(this.a, -1, 641, 32767).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 292, 32767).addComponent(this.a).addGap(0, 284, 32767)).addComponent(this.b, -1, 641, 32767)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addGap(20, 20, 20).addComponent(this.a, -2, -1, -2).addGap(17, 17, 17).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 118, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
        this.pack();
    }

    private void b() {
        this.a.setActionCommand("cancelar");
    }

    public void setProgressBarIndeterminated(boolean b) {
        this.a.setIndeterminate(b);
    }

    public boolean isProgressBarIndeterminated() {
        return this.a.isIndeterminate();
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
        this.a.addColumn(1, "anoNfe", "Ano", false);
        this.a.addColumn(2, "serieNfe", "S\u00e9rie", false);
        this.a.addColumn(3, "numeroNfe", "N\u00famero", false);
        this.a.addColumn(4, "resultadoEnvio", "Resultado", false);
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

    public void addEventoTO(EventoTO eventoTO) {
        this.a.addTO((BaseTO)eventoTO);
    }

    public void setBtnFecharEnabled(boolean b) {
        this.a.setEnabled(b);
    }

    public void setPercentCompleted(int i) {
        this.a.setValue(i);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

