/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observable
 */
package br.gov.sp.fazenda.dsge.common.app;

import br.gov.sp.fazenda.dsge.common.app.Observable;

public final class Notificador
extends Observable {
    private static Notificador a = null;

    private Notificador() {
    }

    public static synchronized Notificador getInstance() {
        if (a == null) {
            a = new Notificador();
        }
        return a;
    }
}

