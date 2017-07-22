/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsge.view;

import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Component;

public interface DSGEPanel
extends ViewItf {
    public boolean canClose();

    public boolean useScroll();

    public Component getComponent();
}

