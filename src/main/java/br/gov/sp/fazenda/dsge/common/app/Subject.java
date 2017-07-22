/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.app.Subject
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 */
package br.gov.sp.fazenda.dsge.common.app;

import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;

public interface Subject {
    public /* varargs */ void register(Observer var1, EnumItf ... var2);

    public void remove(Observer var1);

    public /* varargs */ void notificar(Object var1, EnumItf ... var2);
}

