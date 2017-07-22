/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RefNFTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RefNFTO
extends BaseTO {
    private static final long a = -4183141422389931110L;
    public static int TIPO_NFE = 0;
    public static int TIPO_NFPAPEL = 1;
    public static int TIPO_CTE = 2;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private int a;
    private String i;

    public String getMMAA() {
        return this.d;
    }

    public String getCNPJ() {
        return this.e;
    }

    public String getCUF() {
        return this.c;
    }

    public String getMod() {
        return this.f;
    }

    public String getNNF() {
        return this.h;
    }

    public String getSerie() {
        return this.g;
    }

    public void setMMAA(String MMAA) {
        this.d = MMAA;
    }

    public void setCNPJ(String CNPJ) {
        this.e = CNPJ;
    }

    public void setCUF(String cUF) {
        this.c = cUF;
    }

    public void setMod(String mod) {
        this.f = mod;
    }

    public void setNNF(String nNF) {
        this.h = nNF;
    }

    public void setSerie(String serie) {
        this.g = serie;
    }

    public String getChave() {
        return this.a;
    }

    public void setChave(String chave) {
        this.a = chave;
    }

    public int getTipoRefNF() {
        return this.a;
    }

    public void setTipoRefNF(int tipoRefNF) {
        this.a = tipoRefNF;
    }

    public String getNItem() {
        return this.i;
    }

    public void setNItem(String nItem) {
        this.i = nItem;
    }

    public String getFormattedSerie() {
        String fSerie = null;
        if (this.g != null) {
            fSerie = StringHelper.completaComZerosAEsquerda((String)this.g, (int)3);
        }
        return fSerie;
    }

    public String getFormattedNNf() {
        String fNNf = null;
        if (this.h != null) {
            fNNf = StringHelper.completaComZerosAEsquerda((String)this.h, (int)9);
        }
        return fNNf;
    }

    public String getChaveCTe() {
        return this.b;
    }

    public void setChaveCTe(String chaveCTe) {
        this.b = chaveCTe;
    }

    public String getDescricaoTipo() {
        if (this.a == TIPO_NFE) {
            return DSENMessageConstants.NFE_TITLE;
        }
        if (this.a == TIPO_CTE) {
            return DSENMessageConstants.CTE_TITLE;
        }
        return DSENMessageConstants.NOTA_FISCAL;
    }
}

