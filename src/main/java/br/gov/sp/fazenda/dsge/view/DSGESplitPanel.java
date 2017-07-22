/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.DSGESplitPanel
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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JViewport;

public abstract class DSGESplitPanel
extends JSplitPane
implements DSGEPanel {
    private ControllerItf a;
    private boolean a;
    public final int DEFAULT_DIVIDER_SIZE = 8;

    public DSGESplitPanel() {
        this.setDividerSize(8);
        this.setBottomComponent(null);
        this.setTopComponent(null);
        this.setOneTouchExpandable(true);
    }

    public boolean useScroll() {
        return false;
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

    public void setBottomPanelVisible(boolean visible) {
        if (this.getBottomComponent() != null) {
            this.getBottomComponent().setVisible(visible);
        }
        if (visible) {
            this.setDividerSize(8);
        } else {
            this.setDividerSize(0);
        }
    }

    public void setTopPanelVisible(boolean visible) {
        if (this.getTopComponent() != null) {
            this.getTopComponent().setVisible(visible);
        }
        if (visible) {
            this.setDividerSize(8);
        } else {
            this.setDividerSize(0);
        }
    }

    public void setTopPanel(DSGEPanel sp) {
        Component c;
        if (sp.useScroll()) {
            JScrollPane scroller = new JScrollPane(sp.getComponent());
            scroller.getVerticalScrollBar().setUnitIncrement(20);
            c = scroller;
        } else {
            c = sp.getComponent();
        }
        super.setTopComponent(c);
    }

    public void setBottomPanel(DSGEPanel sp) {
        Component c;
        if (sp.useScroll()) {
            JScrollPane scroller = new JScrollPane(sp.getComponent());
            scroller.getVerticalScrollBar().setUnitIncrement(20);
            c = scroller;
        } else {
            c = sp.getComponent();
        }
        super.setBottomComponent(c);
    }

    public DSGEPanel getTopPanel() {
        return this.a(this.getTopComponent());
    }

    public DSGEPanel getBottomPanel() {
        return this.a(this.getBottomComponent());
    }

    private DSGEPanel a(Component c) {
        if (c instanceof JScrollPane) {
            return (DSGEPanel)((JViewport)((JScrollPane)c).getComponent(0)).getView();
        }
        return (DSGEPanel)c;
    }

    public final boolean canClose() {
        boolean canClose = true;
        if (this.getController() != null && !this.getController().canCloseGUI()) {
            return false;
        }
        DSGEPanel top = this.getTopPanel();
        if (top != null && top.getController() != null && !top.getController().canCloseGUI()) {
            return false;
        }
        DSGEPanel bottom = this.getBottomPanel();
        if (bottom != null && bottom.getController() != null && !bottom.getController().canCloseGUI()) {
            return false;
        }
        return canClose;
    }

    public Component getComponent() {
        return this;
    }
}

