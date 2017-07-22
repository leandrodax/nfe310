/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI$1
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI$2
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI$3
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI$4
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
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
import java.util.HashMap;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableCellRenderer;

public class InformacaoConsultaDpecGUI
extends DSGEDialog {
    private JButton a;
    private JButton b;
    private JButton c;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JPanel a;
    private JLabel e;
    private JProgressBar a;
    private JScrollPane a;
    private JDSGETable<DpecTO> a;
    private HashMap<String, JComponent[]> a;

    public InformacaoConsultaDpecGUI(Frame parent) {
        super((Window)parent, true);
        this.a();
        this.d();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(0);
        this.b();
        this.c();
    }

    private void a() {
        this.e = new JLabel();
        this.a = new JProgressBar();
        this.a = new JScrollPane();
        this.a = new JLabel();
        this.b = new JLabel();
        this.c = new JLabel();
        this.d = new JLabel();
        this.a = new JPanel();
        this.c = new JButton();
        this.b = new JButton();
        this.a = new JButton();
        this.setDefaultCloseOperation(2);
        this.setTitle("Consultando DPEC(s) na Receita Federal");
        this.e.setText("<html><p>Consultando DPEC.</p><p>Por favor, aguarde</p></html>");
        this.a.setIndeterminate(true);
        this.a.setStringPainted(true);
        this.a.setText("Resumo das Opera\u00e7\u00f5es:");
        this.b.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/check.gif")));
        this.b.setText("Autorizado");
        this.c.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/warning.gif")));
        this.c.setText("N\u00e3o Consultado");
        this.d.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/error.gif")));
        this.d.setText("Erro/Rejeitado");
        this.c.setText("Visualizar");
        this.c.setEnabled(false);
        this.b.setText("Salvar");
        this.b.setEnabled(false);
        this.a.setText("Fechar");
        this.a.setEnabled(false);
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.b).addComponent(this.a)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.e, -1, 594, 32767).addComponent(this.a).addGroup(layout.createSequentialGroup().addComponent(this.b).addGap(19, 19, 19).addComponent(this.c).addGap(18, 18, 18).addComponent(this.d)).addComponent(this.a, -1, 594, 32767).addComponent(this.a, -1, 594, 32767).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 318, 32767).addComponent(this.a, -2, -1, -2))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.e, -2, 54, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addGap(16, 16, 16).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 162, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.c).addComponent(this.d)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addContainerGap()));
        this.pack();
    }

    private void b() {
        this.a.setActionCommand("fechar");
        this.b.setActionCommand("salvar");
        this.c.setActionCommand("visualizar");
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
        this.b.addActionListener((ActionListener)listener);
        this.c.addActionListener((ActionListener)listener);
    }

    private void c() {
        this.a = new HashMap();
        this.a.put("VISUALIZAR_DPEC_CONSULTADO", new JComponent[]{this.c, this.b});
    }

    public Map<String, JComponent[]> getMapComponents() {
        return this.a;
    }

    public void firePropertyChange(String propertyName, Object b, Object c) {
        super.firePropertyChange(propertyName, b, c);
    }

    private void d() {
         redRenderer = new /* Unavailable Anonymous Inner Class!! */;
         greenRenderer = new /* Unavailable Anonymous Inner Class!! */;
         orangeRenderer = new /* Unavailable Anonymous Inner Class!! */;
        this.a = new /* Unavailable Anonymous Inner Class!! */;
        this.a.addColumn(0, "icon", "", false);
        this.a.addColumn(1, "numeroRegistro", "Identificador", false);
        this.a.addColumn(2, "codigoStatusProcessamento", "Status", false);
        this.a.addColumn(3, "motivoProcessamento", "Mensagem", false);
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
    }

    public void setMessage(String finishMessage) {
        this.e.setText(finishMessage);
    }

    public boolean isBtnSalvarVisible() {
        return this.b.isVisible();
    }

    public void fitTableColumns() {
        this.a.fitTableColumns();
    }
}

