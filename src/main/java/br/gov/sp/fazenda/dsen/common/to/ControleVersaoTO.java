/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ControleVersaoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Date;

public class ControleVersaoTO
extends BaseTO {
    private static final long a = -8008579711480627010L;
    private Integer a;
    private Integer b;
    private Date a;

    public Date getDataVersao() {
        return this.a;
    }

    public void setDataVersao(Date dataVersao) {
        this.a = dataVersao;
    }

    public Integer getIdControleVersao() {
        return this.a;
    }

    public void setIdControleVersao(Integer idControleVersao) {
        this.a = idControleVersao;
    }

    public Integer getNumVersaoEnum() {
        return this.b;
    }

    public void setNumVersaoEnum(Integer numVersaoEnum) {
        this.b = numVersaoEnum;
    }
}

