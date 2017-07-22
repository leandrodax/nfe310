/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DuplicataTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Calendar;

public class DuplicataTO
extends BaseTO {
    private static final long a = 1497048173790379403L;
    private String a;
    private Calendar a;
    private String b;
    private String c;

    public Calendar getDVenc() {
        return this.a;
    }

    public String getNDup() {
        return this.a;
    }

    public String getVDup() {
        return this.b;
    }

    public void setDVenc(Calendar dVenc) {
        this.a = dVenc;
    }

    public void setNDup(String nDup) {
        this.a = nDup;
    }

    public void setVDup(String vDup) {
        this.b = vDup;
    }

    public String getNItem() {
        return this.c;
    }

    public void setNItem(String nItem) {
        this.c = nItem;
    }
}

