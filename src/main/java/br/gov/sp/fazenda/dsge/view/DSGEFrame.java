/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEFrame
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import java.awt.Component;
import java.awt.Window;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JFrame;

public abstract class DSGEFrame
extends JFrame
implements ViewItf {
    private ControllerItf a;

    public void disableComponents(String key) {
        JComponent[] components;
        Map map = this.getMapComponents();
        if (map != null && (components = (JComponent[])map.get(key)) != null) {
            for (int i = 0; i < components.length; ++i) {
                components[i].setEnabled(false);
            }
        }
    }

    public void enableComponents(String key) {
        JComponent[] components;
        Map map = this.getMapComponents();
        if (map != null && (components = (JComponent[])map.get(key)) != null) {
            for (int i = 0; i < components.length; ++i) {
                components[i].setEnabled(true);
            }
        }
    }

    public void showMessage(String message) {
        DSGEMessageDialog.showMessage((Window)this, (String)message);
    }

    public void showMessage(BaseTO baseTO) {
        DSGEMessageDialog.showMessage((Window)this, (BaseTO)baseTO);
    }

    public void showMessage(List<? extends BaseTO> baseTOList) {
        DSGEMessageDialog.showMessage((Window)this, baseTOList);
    }

    public int showQuestion(String question) {
        return DSGEMessageDialog.showQuestion((Component)this, (String)question);
    }

    public void showErrors(DSGEBaseException ex) {
        DSGEMessageDialog.showErrors((DSGEBaseException)ex);
    }

    public int showQuestion(BaseTO baseTO) {
        return DSGEMessageDialog.showQuestion((Component)this, (BaseTO)baseTO);
    }

    public void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue);
    }

    public ControllerItf getController() {
        return this.a;
    }

    public void setController(ControllerItf controller) {
        this.a = controller;
    }
}

