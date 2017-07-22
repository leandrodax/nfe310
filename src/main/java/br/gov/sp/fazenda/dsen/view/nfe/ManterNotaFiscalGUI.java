/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ErrosNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ManterNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.DSGESplitPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.view.nfe;

import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ErrosNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.DSGESplitPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.Map;
import javax.swing.JComponent;

public class ManterNotaFiscalGUI
extends DSGESplitPanel {
    private static final long a = -7065033866383448748L;
    DigitarNotaFiscalGUI a;
    ErrosNotaFiscalGUI a;

    public ManterNotaFiscalGUI(String operacao, NotaFiscalTO notaFiscalTO) throws DSGEViewException {
        this.a = new DigitarNotaFiscalGUI(operacao, notaFiscalTO);
        this.a = new ErrosNotaFiscalGUI();
        this.setOrientation(0);
        this.setTopPanel((DSGEPanel)this.a);
        this.setBottomPanel((DSGEPanel)this.a);
        this.setBottomPanelVisible(false);
        this.bindController((ViewItf)this);
    }

    public void setBottomPanelVisible(boolean visible) {
        super.setBottomPanelVisible(visible);
        if (visible) {
            this.fixDividerLocation();
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        if (listener instanceof DSGEBaseController) {
            if (this.a != null) {
                this.a.addPropertyChangeListener(listener);
            }
            if (this.a != null) {
                this.a.addPropertyChangeListener(listener);
            }
        } else {
            super.addPropertyChangeListener(listener);
        }
    }

    public void addActionListener(EventListener listener) {
        if (this.a != null) {
            this.a.addActionListener(listener);
        }
        if (this.a != null) {
            this.a.addActionListener(listener);
        }
    }

    public void bindController(ViewItf viewItf) throws DSGEViewException {
        DSENViewControllerHelper.getInstance().getControllerFromView((ViewItf)this);
    }

    public void fixDividerLocation() {
        if (this.getParent() == null) {
            return;
        }
        int loc = this.getParent().getSize().height - this.getBottomPanel().getComponent().getPreferredSize().height - 55;
        this.setDividerLocation(loc);
    }

    public Map<String, JComponent[]> getMapComponents() {
        return null;
    }

    public DigitarNotaFiscalGUI getNotaGUI() {
        return this.a;
    }

    public ErrosNotaFiscalGUI getErrosGUI() {
        return this.a;
    }
}

