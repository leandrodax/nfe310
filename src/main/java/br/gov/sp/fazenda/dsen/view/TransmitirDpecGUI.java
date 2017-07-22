/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI
 *  br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI$1
 *  br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI$2
 *  br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI$3
 *  br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI$4
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

import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI;
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
import java.net.URL;
import java.util.EventListener;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableCellRenderer;

public class TransmitirDpecGUI
extends DSGEDialog {
    private JButton a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JProgressBar a;
    private JScrollPane a;
    private JDSGETable<DpecTO> a;

    public TransmitirDpecGUI(Frame parent) {
        super((Window)parent, true);
        this.a();
        this.c();
        WindowManager.getInstance().centralizarDialogo((JDialog)this);
        this.setDefaultCloseOperation(0);
        this.b();
    }

    private void a() {
        this.e = new JLabel();
        this.a = new JProgressBar();
        this.a = new JScrollPane();
        this.a = new JLabel();
        this.a = new JButton();
        this.b = new JLabel();
        this.c = new JLabel();
        this.d = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Enviando DPEC(s) para a Receita Federal");
        this.e.setText("<html><p>Enviando DPEC(s).</p><p>Por favor, aguarde</p></html>");
        this.a.setIndeterminate(true);
        this.a.setStringPainted(true);
        this.a.setText("Resumo das Opera\u00e7\u00f5es:");
        this.a.setText("Fechar");
        this.a.setEnabled(false);
        this.b.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/check.gif")));
        this.b.setText("Autorizado");
        this.c.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/warning.gif")));
        this.c.setText("N\u00e3o Enviado");
        this.d.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/error.gif")));
        this.d.setText("Erro/Rejeitado");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 648, 32767).addComponent(this.a, -1, 648, 32767).addComponent(this.e, -1, 648, 32767).addComponent(this.a).addGroup(layout.createSequentialGroup().addComponent(this.b).addGap(19, 19, 19).addComponent(this.c).addGap(18, 18, 18).addComponent(this.d))).addContainerGap()).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 289, 32767).addComponent(this.a).addContainerGap(297, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.e, -2, 54, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addGap(16, 16, 16).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 180, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.c).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
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
        this.a.addColumn(1, "nomeArquivo", "Nome do Arquivo", false);
        this.a.addColumn(2, "codigoStatus", "Status", false);
        this.a.addColumn(3, "motivo", "Mensagem", false);
        this.a.setAutoFitTableColumns(true);
        this.a.setScrollPane(this.a);
        this.a.fitTableColumns();
    }

    public void addDpecTO(DpecTO nTO) {
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
        this.a.setValue(i);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public void setMessage(String finishMessage) {
        this.e.setText(finishMessage);
    }

    public void fitTableColumns() {
        this.a.fitTableColumns();
    }
}

