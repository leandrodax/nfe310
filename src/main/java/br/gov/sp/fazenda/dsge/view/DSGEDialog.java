/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
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
import java.awt.Dialog;
import java.awt.Image;
import java.awt.Window;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JDialog;

public abstract class DSGEDialog
extends JDialog
implements ViewItf {
    private ControllerItf a;

    public DSGEDialog() {
    }

    public DSGEDialog(Window owner, boolean modal) {
        super(owner, modal ? Dialog.ModalityType.APPLICATION_MODAL : Dialog.ModalityType.MODELESS);
        if (owner != null && owner.getIconImages() != null && owner.getIconImages().size() > 0) {
            this.setIconImage(owner.getIconImages().get(0));
        }
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
        DSGEMessageDialog.showErrors((Window)this, (DSGEBaseException)ex);
    }

    public void showErrors(Throwable ex) {
        DSGEMessageDialog.showErrors((Window)this, (DSGEBaseException)new DSGEBaseException(ex, ex.getMessage()));
    }

    public static Object showInputDialog(JComponent jComponent, Object object, String string, Object[] seleciotnValues, Object inicialSelection) {
        return DSGEMessageDialog.showInputQuestion((Component)jComponent, (Object)object, (String)string, (Object[])seleciotnValues, (Object)inicialSelection);
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

