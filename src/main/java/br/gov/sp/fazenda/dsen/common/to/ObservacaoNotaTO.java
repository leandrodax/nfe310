/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ObservacaoNotaTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class ObservacaoNotaTO
extends BaseTO {
    private static final long a = 7005965826366610300L;
    private String a;
    private String b;
    private String c;

    public String getXCampo() {
        return this.a;
    }

    public String getXTexto() {
        return this.b;
    }

    public void setXCampo(String xCampo) {
        this.a = xCampo;
    }

    public void setXTexto(String xTexto) {
        this.b = xTexto;
    }

    public String getNItem() {
        return this.c;
    }

    public void setNItem(String nItem) {
        this.c = nItem;
    }
}

