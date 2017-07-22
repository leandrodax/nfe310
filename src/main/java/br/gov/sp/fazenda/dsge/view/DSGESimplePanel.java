/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.DSGESimplePanel
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JPanel;

public abstract class DSGESimplePanel
extends JPanel
implements DSGEPanel {
    private ControllerItf a;
    private boolean a;

    public boolean useScroll() {
        return true;
    }

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

    public void enableVisibleComponents(String key) {
        JComponent[] components;
        Map map = this.getMapComponents();
        if (map != null && (components = (JComponent[])map.get(key)) != null) {
            for (int i = 0; i < components.length; ++i) {
                components[i].setVisible(true);
            }
        }
    }

    public void disableVisibleComponents(String key) {
        JComponent[] components;
        Map map = this.getMapComponents();
        if (map != null && (components = (JComponent[])map.get(key)) != null) {
            for (int i = 0; i < components.length; ++i) {
                components[i].setVisible(false);
            }
        }
    }

    private Window a() {
        Container parent = this.getTopLevelAncestor();
        if (parent instanceof Window) {
            return (Window)parent;
        }
        return null;
    }

    public void showMessage(String message) {
        DSGEMessageDialog.showMessage((Window)this.a(), (String)message);
    }

    public void showMessage(BaseTO baseTO) {
        DSGEMessageDialog.showMessage((Window)this.a(), (BaseTO)baseTO);
    }

    public void showMessage(List<? extends BaseTO> baseTOList) {
        DSGEMessageDialog.showMessage((Window)this.a(), baseTOList);
    }

    public int showQuestion(String question) {
        return DSGEMessageDialog.showQuestion((Component)this, (String)question);
    }

    public int showYesNoCancelQuestion(String question) {
        return DSGEMessageDialog.showYesNoCancelQuestion((Component)this, (String)question);
    }

    public void showErrors(DSGEBaseException ex) {
        DSGEMessageDialog.showErrors((DSGEBaseException)ex);
    }

    public void showErrors(Throwable t) {
        DSGEMessageDialog.showErrors((DSGEBaseException)new DSGEBaseException(t, t.getMessage()));
    }

    public int showQuestion(BaseTO baseTO) {
        return DSGEMessageDialog.showQuestion((Component)this, (BaseTO)baseTO);
    }

    public boolean isDesabilitaMenu() {
        return this.a;
    }

    public void setDesabilitaMenu(boolean desabilitaMenu) {
        this.a = desabilitaMenu;
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

    public final boolean canClose() {
        if (this.getController() != null) {
            return this.getController().canCloseGUI();
        }
        return true;
    }

    public Component getComponent() {
        return this;
    }
}

