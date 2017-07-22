/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ReboqueTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class ReboqueTO
extends BaseTO {
    private static final long a = 4724019733001087426L;
    private String a;
    private String b;
    private String c;
    private String d;

    public String getPlaca() {
        return this.a;
    }

    public String getRNTC() {
        return this.c;
    }

    public String getUF() {
        return this.b;
    }

    public void setPlaca(String placa) {
        this.a = placa;
    }

    public void setRNTC(String RNTC) {
        this.c = RNTC;
    }

    public void setUF(String UF2) {
        this.b = UF2;
    }

    public String getNItem() {
        return this.d;
    }

    public void setNItem(String nItem) {
        this.d = nItem;
    }
}

