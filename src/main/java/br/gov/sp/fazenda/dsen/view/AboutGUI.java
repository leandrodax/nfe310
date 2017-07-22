/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.view.AboutGUI
 *  br.gov.sp.fazenda.dsen.view.AboutGUI$1
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.view.AboutGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.Window;
import java.net.URL;
import java.util.EventListener;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public class AboutGUI
extends DSGEDialog {
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;
    private JLabel e;
    private JLabel f;
    private JPanel a;

    public AboutGUI(Frame parent, boolean modal) {
        super((Window)parent, modal);
        this.a();
        this.c.setText("Vers\u00e3o " + DSENProperties.getInstance().getAplicativoVersao() + " (" + DSENProperties.getInstance().getAplicativoData() + ")");
    }

    private void a() {
        this.a = new JPanel();
        this.a = new JLabel();
        this.b = new JLabel();
        this.c = new JLabel();
        this.d = new JLabel();
        this.e = new JLabel();
        this.f = new JLabel();
        this.setDefaultCloseOperation(2);
        this.setTitle("Sobre o NF-e");
        this.setBackground(Color.white);
        this.setResizable(false);
        this.a.setBackground(Color.white);
        this.a.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/nfe.png")));
        this.b.setFont(new Font("Dialog", 1, 14));
        this.b.setForeground(Color.blue);
        this.b.setHorizontalAlignment(0);
        this.b.setText("Emissor gratuito de Nota Fiscal Eletr\u00f4nica (NF-e)");
        this.b.setText(DSENProperties.getInstance().getAplicativoWindowTitle());
        this.c.setFont(new Font("Dialog", 1, 14));
        this.c.setForeground(Color.red);
        this.c.setHorizontalAlignment(0);
        this.c.setText("Vers\u00e3o 1.0.0");
        this.d.setFont(new Font("Dialog", 1, 10));
        this.d.setHorizontalAlignment(0);
        this.d.setText("<HTML><P>&nbsp;&nbsp;&nbsp;&nbsp;Este software est\u00e1 protegido pela legisla\u00e7\u00e3o de direitos autorais e de prote\u00e7\u00e3o \u00e0 propriedade intelectual. Sua altera\u00e7\u00e3o n\u00e3o autorizada ou utiliza\u00e7\u00e3o indevida s\u00e3o vedadas e podem resultar em responsabilidade civil e criminal.</P></HTML>");
        this.e.setHorizontalAlignment(0);
        this.e.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/logo-sefaz.PNG")));
        this.f.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/logo_prodesp.gif")));
        GroupLayout jPanel1Layout = new GroupLayout(this.a);
        this.a.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 47, 32767).addComponent(this.f, -2, 125, -2).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.d, -1, 632, 32767).addContainerGap()).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(128, 32767).addComponent(this.a).addContainerGap(128, 32767)).addComponent(this.b, -1, 656, 32767).addComponent(this.c, GroupLayout.Alignment.TRAILING, -1, 656, 32767));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c, -2, 17, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.e).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)).addComponent(this.f, -1, 68, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addGap(37, 37, 37)));
        jPanel1Layout.linkSize(1, this.e, this.f);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.a, -1, 544, 32767));
        this.pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }
}

