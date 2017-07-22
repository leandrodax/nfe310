/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoGuiTO
 *  br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI$1
 *  br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI$2
 *  br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI$3
 *  br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI$4
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.AutofitTableColumns
 *  br.gov.sp.fazenda.dsge.view.table.JDSGETable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoGuiTO;
import br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.AutofitTableColumns;
import br.gov.sp.fazenda.dsge.view.table.JDSGETable;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.EventListener;
import java.util.List;
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
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableCellRenderer;

public class InformacaoImportacaoGUI
extends DSGEDialog {
    private JButton a;
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JProgressBar a;
    private JScrollPane a;
    private JDSGETable<ImportacaoResultadoGuiTO> a;

    public InformacaoImportacaoGUI(Frame parent) {
        super((Window)parent, true);
        this.a();
        this.c();
        WindowManager.getInstance().centralizarDialogo((JDialog)this);
        this.setDefaultCloseOperation(0);
        this.b();
        this.fitTableColumns();
    }

    private void a() {
        this.a = new JLabel();
        this.b = new JLabel();
        this.a = new JProgressBar();
        this.a = new JScrollPane();
        this.c = new JLabel();
        this.a = new JButton();
        this.d = new JLabel();
        this.e = new JLabel();
        this.f = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Importa\u00e7\u00e3o de Arquivos");
        this.a.setText("Importando arquivos...");
        this.b.setText("Por favor, aguarde.");
        this.a.setIndeterminate(true);
        this.a.setStringPainted(true);
        this.c.setText("Resumo das Opera\u00e7\u00f5es:");
        this.a.setText("Fechar");
        this.a.setEnabled(false);
        this.d.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/check.gif")));
        this.d.setText("Sucesso");
        this.e.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/warning.gif")));
        this.e.setText("Alerta");
        this.f.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/error.gif")));
        this.f.setText("Erro");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 680, 32767).addComponent(this.b).addComponent(this.c).addComponent(this.a, -1, 680, 32767).addGroup(layout.createSequentialGroup().addComponent(this.d).addGap(19, 19, 19).addComponent(this.e).addGap(18, 18, 18).addComponent(this.f)).addComponent(this.a, -2, 270, -2)).addContainerGap()).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 309, 32767).addComponent(this.a).addContainerGap(309, 32767)))));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addGap(20, 20, 20).addComponent(this.a, -2, -1, -2).addGap(17, 17, 17).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -1, 215, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.e).addComponent(this.f)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, 25, -2).addContainerGap()));
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
        int index = 0;
        this.a.addColumn(index++, "icon", "", false);
        this.a.addColumn(index++, "nomeArquivo", "Nome do Arquivo", false);
        this.a.addColumn(index++, "idRegistro", "Identif. Reg.", false);
        this.a.addColumn(index++, "situacaoRegistro", "Situa\u00e7\u00e3o do Reg.", false);
        this.a.addColumn(index++, "campo", "Campo", false);
        this.a.addColumn(index++, "mensagem", "Erro/Alerta", false);
        this.a.setAutoFitTableColumns(true);
        this.a.setScrollPane(this.a);
    }

    public void setImportacaoResultadoGuiList(List<ImportacaoResultadoGuiTO> list) {
        this.a.addTO(list);
    }

    public void setProgressBarIndeterminated(boolean b) {
        this.a.setIndeterminate(b);
    }

    public boolean isProgressBarIndeterminated() {
        return this.a.isIndeterminate();
    }

    public void fitTableColumns() {
        AutofitTableColumns.autoResizeTable((JTable)this.a, (boolean)true);
    }

    public void setBtnFecharEnabled(boolean b) {
        this.a.setEnabled(b);
    }

    public void setPercentCompleted(int i) {
        this.a.setValue(i);
    }

    public void setLabel1(String label) {
        this.a.setText(label);
    }

    public void setLabel2(String label) {
        this.b.setText(label);
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

