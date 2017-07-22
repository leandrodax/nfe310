/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RefNFPTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;

public class RefNFPTO
extends BaseTO {
    private static final long a = -4183141422389931110L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public String getMMAA() {
        return this.a;
    }

    public void setMMAA(String mmaa) {
        this.a = mmaa;
    }

    public String getCUF() {
        return this.b;
    }

    public void setCUF(String cuf) {
        this.b = cuf;
    }

    public String getMod() {
        return this.f;
    }

    public void setMod(String mod) {
        this.f = mod;
    }

    public String getNNF() {
        return this.e;
    }

    public void setNNF(String nnf) {
        this.e = nnf;
    }

    public String getSerie() {
        return this.d;
    }

    public void setSerie(String serie) {
        this.d = serie;
    }

    public String getNItem() {
        return this.i;
    }

    public void setNItem(String nItem) {
        this.i = nItem;
    }

    public String getFormattedSerie() {
        String fSerie = null;
        if (this.d != null) {
            fSerie = StringHelper.completaComZerosAEsquerda((String)this.d, (int)3);
        }
        return fSerie;
    }

    public String getFormattedNNf() {
        String fNNf = null;
        if (this.e != null) {
            fNNf = StringHelper.completaComZerosAEsquerda((String)this.e, (int)9);
        }
        return fNNf;
    }

    public String getCNPJ() {
        return this.g;
    }

    public void setCNPJ(String cnpj) {
        this.g = cnpj;
    }

    public String getCPF() {
        return this.h;
    }

    public void setCPF(String cpf) {
        this.h = cpf;
    }

    public String getIE() {
        return this.c;
    }

    public void setIE(String ie) {
        this.c = ie;
    }

    public String getDocumento() {
        if (!StringHelper.isBlankOrNull((Object)this.h)) {
            return this.h;
        }
        if (!StringHelper.isBlankOrNull((Object)this.g)) {
            return this.g;
        }
        return null;
    }
}

