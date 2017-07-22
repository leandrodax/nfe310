/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.LacreTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class LacreTO
extends BaseTO {
    private static final long a = 7884730414642658043L;
    private String a;
    private String b;

    public String getNLacre() {
        return this.a;
    }

    public void setNLacre(String nLacre) {
        this.a = nLacre;
    }

    public String getNItem() {
        return this.b;
    }

    public void setNItem(String nItem) {
        this.b = nItem;
    }
}

