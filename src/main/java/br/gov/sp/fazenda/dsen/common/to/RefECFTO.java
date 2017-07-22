/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RefECFTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;

public class RefECFTO
extends BaseTO {
    private static final long a = -4183141422389931110L;
    private String a;
    private String b;
    private String c;
    private String d;

    public String getFormattedNECF() {
        String fSerie = null;
        if (this.b != null) {
            fSerie = StringHelper.completaComZerosAEsquerda((String)this.b, (int)3);
        }
        return fSerie;
    }

    public String getFormattedNCOO() {
        String fNNf = null;
        if (this.c != null) {
            fNNf = StringHelper.completaComZerosAEsquerda((String)this.c, (int)6);
        }
        return fNNf;
    }

    public String getMod() {
        return this.a;
    }

    public void setMod(String mod) {
        this.a = mod;
    }

    public String getNCOO() {
        return this.c;
    }

    public void setNCOO(String ncoo) {
        this.c = ncoo;
    }

    public String getNECF() {
        return this.b;
    }

    public void setNECF(String necf) {
        this.b = necf;
    }

    public String getNItem() {
        return this.d;
    }

    public void setNItem(String item) {
        this.d = item;
    }
}

