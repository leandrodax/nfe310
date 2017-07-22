/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import javax.swing.JComponent;

public interface ViewItf {
    public void addActionListener(EventListener var1);

    public void disableComponents(String var1);

    public void enableComponents(String var1);

    public void showMessage(String var1);

    public void showMessage(BaseTO var1);

    public void showMessage(List<? extends BaseTO> var1);

    public void showErrors(DSGEBaseException var1);

    public int showQuestion(String var1);

    public int showQuestion(BaseTO var1);

    public Map<String, JComponent[]> getMapComponents();

    public void bindController(ViewItf var1) throws DSGEViewException;

    public void setController(ControllerItf var1);

    public ControllerItf getController();
}

