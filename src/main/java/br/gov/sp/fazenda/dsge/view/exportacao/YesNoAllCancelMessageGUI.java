/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI
 *  br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI$1
 *  br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI$2
 *  br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI$3
 *  br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI$4
 *  br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper
 */
package br.gov.sp.fazenda.dsge.view.exportacao;

import br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI;
import br.gov.sp.fazenda.dsge.view.util.DSGEWindowUtilHelper;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class YesNoAllCancelMessageGUI
extends JDialog {
    private static final long a = 8963467519294683716L;
    private YesNoAllCancelEnum a;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JPanel a;
    private JLabel a;
    private JPanel b;

    private YesNoAllCancelMessageGUI(Frame parent, boolean modal, String question) {
        super(parent, modal);
        this.a((Component)parent, question);
    }

    private YesNoAllCancelMessageGUI(Dialog parent, boolean modal, String question) {
        super(parent, modal);
        this.a((Component)parent, question);
    }

    public static YesNoAllCancelEnum showQuestion(String question, ViewItf parentGUI) {
        YesNoAllCancelMessageGUI gui = null;
        if (parentGUI instanceof Frame) {
            gui = new YesNoAllCancelMessageGUI((Frame)parentGUI, true, question);
        } else if (parentGUI instanceof Dialog) {
            gui = new YesNoAllCancelMessageGUI((Dialog)parentGUI, true, question);
        }
        gui.setVisible(true);
        return gui.a();
    }

    private YesNoAllCancelEnum a() {
        return this.a;
    }

    private void a(YesNoAllCancelEnum acao) {
        this.a = acao;
    }

    private void a(Component parent, String question) {
        this.b();
        this.a.setText("<html><p>" + question + "</p></html>");
        this.a();
        DSGEWindowUtilHelper.centralizarDialogo((Component)parent, (JDialog)this);
        this.a = YesNoAllCancelEnum.SOBRESCREVER;
    }

    private void a() {
        this.c.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.d.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.a.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
        this.b.addActionListener((ActionListener)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
        this.b = new JPanel();
        this.a = new JPanel();
        this.c = new JButton();
        this.d = new JButton();
        this.a = new JButton();
        this.b = new JButton();
        this.a = new JLabel();
        this.setDefaultCloseOperation(0);
        this.setTitle("Arquivo existente");
        this.setModal(true);
        this.setResizable(false);
        this.b.setBorder(BorderFactory.createTitledBorder(""));
        this.c.setText("Sim");
        this.d.setText("Todos");
        this.a.setText("Cancelar");
        this.b.setText("N\u00e3o");
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.c).addGap(6, 6, 6).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.d).addComponent(this.a).addComponent(this.b)));
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.b);
        this.b.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 534, 32767).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap(108, 32767).addComponent(this.a, -2, -1, -2).addContainerGap(109, 32767)));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, 66, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a, -2, -1, -2).addContainerGap(-1, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.b, -1, -1, 32767).addContainerGap()));
        this.pack();
    }

    static /* synthetic */ void a(YesNoAllCancelMessageGUI x0, YesNoAllCancelEnum x1) {
        x0.a(x1);
    }
}

