/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.view.FaixaInutilizadaAvisoGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class FaixaInutilizadaAvisoGUI
extends DSGEDialog {
    private static final long a = -8836587602706204150L;
    private JButton a;
    private JScrollPane a;
    private JPanel a;
    private JTextArea a;

    public FaixaInutilizadaAvisoGUI(Frame parent, boolean modal) {
        super((Window)parent, modal);
        this.a();
        this.a.setBorder(new EmptyBorder(0, 0, 0, 0));
        this.a.setActionCommand("cancelar");
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JButton();
        this.a = new JScrollPane();
        this.a = new JTextArea();
        this.setDefaultCloseOperation(2);
        this.setTitle("Mensagem do Sistema");
        this.setResizable(false);
        this.a.setBorder(BorderFactory.createTitledBorder(""));
        this.a.setText("Cancelar");
        this.a.setColumns(20);
        this.a.setEditable(false);
        this.a.setFont(new Font("Tahoma", 1, 12));
        this.a.setLineWrap(true);
        this.a.setRows(2);
        this.a.setText(DSENMessageConstants.MSG_INUTILIZAR_FAIXA_RETORNO_SEFAZ_EM_EXECUCAO);
        this.a.setWrapStyleWord(true);
        this.a.setFocusable(false);
        this.a.setOpaque(false);
        this.a.setViewportView(this.a);
        GroupLayout pnlPrincipalLayout = new GroupLayout(this.a);
        this.a.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, 377, 32767)).addGroup(pnlPrincipalLayout.createSequentialGroup().addGap(150, 150, 150).addComponent(this.a))).addContainerGap()));
        pnlPrincipalLayout.setVerticalGroup(pnlPrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(pnlPrincipalLayout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, 56, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.a).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -1, -1, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.a, -2, -1, -2).addContainerGap(-1, 32767)));
        this.pack();
    }

    public void addActionListener(EventListener listener) {
        this.a.addActionListener((ActionListener)listener);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

