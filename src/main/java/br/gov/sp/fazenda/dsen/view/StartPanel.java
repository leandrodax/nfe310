/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.view.StartPanel
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.LayoutManager;
import java.net.URL;
import java.util.EventListener;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;

public class StartPanel
extends DSGESimplePanel {
    private JLabel a;
    private JLabel b;
    private JLabel c;
    private JLabel d;

    public StartPanel() {
        this.a();
    }

    private void a() {
        this.a = new JLabel();
        this.b = new JLabel();
        this.c = new JLabel();
        this.d = new JLabel();
        this.setBackground(new Color(245, 244, 244));
        this.a.setHorizontalAlignment(0);
        this.a.setIcon(new ImageIcon(this.getClass().getResource("/br/gov/sp/fazenda/dsen/view/resources/nfe.png")));
        this.a.setToolTipText("NF-e");
        this.b.setFont(new Font("Dialog", 1, 16));
        this.b.setForeground(Color.red);
        this.b.setHorizontalAlignment(0);
        this.b.setText("VERS\u00c3O DE TESTE");
        this.b.setText(DSENProperties.getInstance().getAplicativoLabelVersaoTeste().toUpperCase());
        this.c.setFont(new Font("Arial", 1, 12));
        this.c.setForeground(Color.red);
        this.c.setHorizontalAlignment(0);
        this.c.setText("Os documentos eletr\u00f4nicos gerados por esse aplicativo n\u00e3o t\u00eam validade jur\u00eddica");
        this.c.setText(DSENProperties.getInstance().getAplicativoLabelAviso());
        this.d.setFont(new Font("Arial", 1, 12));
        this.d.setForeground(Color.black);
        this.d.setHorizontalAlignment(0);
        this.d.setText("Emissor gratuito de Nota Fiscal Eletr\u00f4nica (NF-e)");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(62, 32767).addComponent(this.a).addContainerGap(74, 32767)).addComponent(this.b, -1, 536, 32767).addComponent(this.c, -1, 536, 32767).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.d, -1, 512, 32767).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(33, 33, 33).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.c).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.d).addContainerGap(-1, 32767)));
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

