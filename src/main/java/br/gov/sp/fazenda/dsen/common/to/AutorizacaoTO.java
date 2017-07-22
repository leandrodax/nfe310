/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class AutorizacaoTO
extends BaseTO {
    private static final long a = 6115384973687252061L;
    private String a;
    private String b;
    private String c;

    public String getCNPJ() {
        return this.a;
    }

    public void setCNPJ(String cNPJ) {
        this.a = cNPJ;
    }

    public String getCPF() {
        return this.b;
    }

    public void setCPF(String cPF) {
        this.b = cPF;
    }

    public String getDocumento() {
        if (this.a != null && this.a.length() > 0) {
            return this.a;
        }
        if (this.b != null && this.b.length() > 0) {
            return this.b;
        }
        return null;
    }

    public void setNItem(String nItem) {
        this.c = nItem;
    }

    public String getNItem() {
        return this.c;
    }
}

