/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.view.PnlDetalheEvento
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsge.view.DSGESimplePanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import javax.swing.GroupLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;

public class PnlDetalheEvento
extends DSGESimplePanel {
    private static final long a = 8724532355275813563L;
    private EventoTO a;
    private JLabel a;
    private JLabel b;

    public PnlDetalheEvento() {
        this.a();
    }

    private void a() {
        this.a = new JLabel();
        this.b = new JLabel();
        this.a.setText("Alerta! Implemente um painel espec\u00edfico para cada tipo de evento!");
        this.b.setText("Somente para visualiza\u00e7\u00e3o na Paleta.");
        GroupLayout layout = new GroupLayout((Container)this);
        this.setLayout((LayoutManager)layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(38, 38, 38).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.b).addComponent(this.a)).addContainerGap(100, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(118, 118, 118).addComponent(this.a).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.b).addContainerGap(148, 32767)));
    }

    public void desabilitarParaVisualizacao() {
    }

    public void setEventoTO(EventoTO eventoTO) {
        this.a = eventoTO;
    }

    public EventoTO getEventoTO() {
        return this.a;
    }

    public void setComponentsValues() {
    }

    public void updateComponentsValues() {
    }

    public List<String> validateComponentsValues() {
        return null;
    }

    public void addActionListener(EventListener listener) {
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
    }
}

