/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ProblemaDpecDanfeTO
 *  br.gov.sp.fazenda.dsen.view.ProblemaDpecDanfeGUI
 *  br.gov.sp.fazenda.dsen.view.ProblemaDpecDanfeGUI$1
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.ProblemaDpecDanfeTO;
import br.gov.sp.fazenda.dsen.view.ProblemaDpecDanfeGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public class ProblemaDpecDanfeGUI
extends JDialog {
    private JButton a;
    private JLabel a;
    private JPanel a;
    JDSGEPageableTable<ProblemaDpecDanfeTO> a;

    protected ProblemaDpecDanfeGUI(Frame parent, boolean modal) {
        super(parent, modal);
        this.b();
        this.a();
        this.setDefaultCloseOperation(2);
    }

    private void a(List<ProblemaDpecDanfeTO> problemas) {
        this.a.addTO(problemas);
    }

    public static void mostrarProblemas(Frame parent, List<ProblemaDpecDanfeTO> problemas) {
        ProblemaDpecDanfeGUI gui = new ProblemaDpecDanfeGUI(parent, true);
        gui.a(problemas);
        WindowManager.getInstance().centralizarDialogo((JDialog)gui);
        gui.setVisible(true);
    }

    private void a() {
        this.a = new JDSGEPageableTable();
        this.a.setSelectAllAvailable(false);
        this.a.setColumnSelecao(-1);
        this.a.setPageable(false);
        this.a.setSortable(false);
        this.a.addColumn(0, "chaveAcesso", "Chave de Acesso", false, "chaveAcesso");
        this.a.addColumn(1, "erro", "Erro", false, "erro");
        this.a.setAutoFitTableColumns(true);
        this.a.setPanel(this.a);
    }

    private void b() {
        this.a = new JPanel();
        this.a = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(2);
        GroupLayout pnlProblemasLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlProblemasLayout);
        pnlProblemasLayout.setHorizontalGroup(pnlProblemasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 590, 32767));
        pnlProblemasLayout.setVerticalGroup(pnlProblemasLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 216, 32767));
        this.a.setText("Fechar");
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.setFont(new Font("Dialog", 1, 14));
        this.a.setForeground(Color.blue);
        this.a.setHorizontalAlignment(0);
        this.a.setText("Problemas ao Gerar o DANFE");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(265, 32767).addComponent(this.a).addContainerGap(275, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.a, GroupLayout.Alignment.LEADING, -1, 590, 32767)).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.a, -1, -1, 32767).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
        this.pack();
    }

    private void a(ActionEvent evt) {
        this.setVisible(false);
        this.dispose();
    }

    static /* synthetic */ void a(ProblemaDpecDanfeGUI x0, ActionEvent x1) {
        x0.a(x1);
    }
}

