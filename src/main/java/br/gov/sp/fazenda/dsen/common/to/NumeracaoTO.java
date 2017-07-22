/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NumeracaoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class NumeracaoTO
extends BaseTO {
    private static final long a = 2205357733564124657L;
    private Integer a;
    private String a;
    private String b;

    public Integer getIdNumeracao() {
        return this.a;
    }

    public void setIdNumeracao(Integer theIdNumeracao) {
        this.a = theIdNumeracao;
    }

    public String getNumero() {
        return this.a;
    }

    public void setNumero(String theNumero) {
        this.a = theNumero;
    }

    public String getSerie() {
        return this.b;
    }

    public void setSerie(String theSerie) {
        this.b = theSerie;
    }
}

