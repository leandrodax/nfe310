/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.StatusBarTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class StatusBarTO
extends BaseTO {
    private static final long a = 7477181542635399560L;
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private int e = 0;
    private String a;

    public StatusBarTO() {
        this.setMessage("");
    }

    public int getType() {
        return this.e;
    }

    public void setType(int type) {
        this.e = type;
    }

    public String getMessage() {
        return this.a;
    }

    public void setMessage(String message) {
        if (message == null) {
            message = "";
        }
        this.a = message;
    }
}

