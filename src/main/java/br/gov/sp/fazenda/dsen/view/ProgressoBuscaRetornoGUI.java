/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI
 *  br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI$1
 *  br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI$2
 *  br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI$3
 *  br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI$4
 *  br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI$RefreshThread
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsen.view.ProgressoBuscaRetornoGUI;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

public class ProgressoBuscaRetornoGUI
extends JDialog {
    private JDSGEPageableTable<BuscaRetornoQueueItem> a;
    private int a;
    private static final long a = -3017428953749505645L;
    RefreshThread a;
    private JButton a;
    private JPanel a;
    private JLabel a;
    private JPanel b;
    private JProgressBar a = null;

    public ProgressoBuscaRetornoGUI(Frame parent, boolean modal) {
        super(parent, modal);
        this.d();
        this.b();
        this.setLocationRelativeTo(null);
        this.a();
        this.setDefaultCloseOperation(0);
        this.a = new RefreshThread(this);
        this.a.start();
    }

    private void a() {
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.addWindowListener((WindowListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addPageableSortableListener((PageableSortableTableActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
        this.a = new JDSGEPageableTable();
        int index = 0;
        this.a.getWrappedTable().addColumn(index++, "chaveAcessoFormatada", "Chave de Acesso", false);
        this.a.getWrappedTable().addColumn(index++, "serie", "S\u00e9rie", false);
        this.a.getWrappedTable().addColumn(index++, "numero", "N\u00famero", false);
        this.a.getWrappedTable().addColumn(index++, "progresso", "Progresso", false);
        this.a.setSelectAllAvailable(false);
        this.a.setPageable(false);
        this.a.setSortable(true);
        this.a.setAutoFitTableColumns(true);
        this.a.setPanel(this.b);
    }

    public void addItem(BuscaRetornoQueueItem item) {
        ++this.a;
        this.a.addTO((BaseTO)item);
    }

    public void removeAllItens() {
        this.a = 0;
        this.a.removeAllTO();
    }

    public void removeItem(BuscaRetornoQueueItem item) {
        this.a.removeTO((BaseTO)item);
        --this.a;
    }

    public void removeExecutados() {
        List list = this.a.getAllTO();
        for (BuscaRetornoQueueItem item : list) {
            if (item.getProgresso() != DSENLabelConstants.EXECUTADO) continue;
            this.a.removeTO((BaseTO)item);
            --this.a;
        }
    }

    private void c() {
        this.setVisible(false);
    }

    private void d() {
        this.a = new JPanel();
        this.a = new JProgressBar();
        this.b = new JPanel();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Progresso da Busca por Retornos");
        this.a.setBorder(BorderFactory.createTitledBorder(null, "Progresso da Busca por Retornos", 2, 0, new Font("Dialog", 1, 14), Color.blue));
        GroupLayout pnlProgressoLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlProgressoLayout);
        pnlProgressoLayout.setHorizontalGroup(pnlProgressoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 687, 32767));
        pnlProgressoLayout.setVerticalGroup(pnlProgressoLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 220, 32767));
        this.a.setText("Esconder");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setText(" ");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b, -1, -1, 32767).addComponent(this.a, -1, 687, 32767).addComponent(this.a, -1, 687, 32767)).addContainerGap()).addGroup(jPanel1Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 300, 32767).addComponent(this.a).addContainerGap(309, 32767)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.b, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.c();
    }

    public void startBuscaRetorno() {
        this.a.setIndeterminate(true);
        this.a.setValue(0);
    }

    public void setDone() {
        if (this.a != null) {
            this.a.a(true);
        }
    }

    public void setProgressBarIndeterminated(boolean b) {
        this.a.setIndeterminate(b);
    }

    public void setProgressBarValue(int value) {
        this.a.setValue(value);
    }

    public void setInfoLabel(String text) {
        this.a.setText(text);
    }

    static /* synthetic */ void a(ProgressoBuscaRetornoGUI x0) {
        x0.c();
    }

    static /* synthetic */ void a(ProgressoBuscaRetornoGUI x0, ActionEvent x1) {
        x0.a(x1);
    }

    static /* synthetic */ int a(ProgressoBuscaRetornoGUI x0) {
        return x0.a;
    }

    static /* synthetic */ JDSGEPageableTable a(ProgressoBuscaRetornoGUI x0) {
        return x0.a;
    }
}

