/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class PropriedadeTO
extends BaseTO {
    private static final long a = 8698490461822184697L;
    private Integer a;
    private PropriedadeEnum a;
    private String a;
    private EmitenteTO a;

    public EmitenteTO getEmitenteTO() {
        return this.a;
    }

    public void setEmitenteTO(EmitenteTO emitenteTO) {
        this.a = emitenteTO;
    }

    public Integer getIdPropriedade() {
        return this.a;
    }

    public void setIdPropriedade(Integer idPropriedade) {
        this.a = idPropriedade;
    }

    public PropriedadeEnum getPropriedadeEnum() {
        return this.a;
    }

    public void setPropriedadeEnum(PropriedadeEnum propriedadeEnum) {
        this.a = propriedadeEnum;
    }

    public String getValor() {
        return this.a;
    }

    public void setValor(String valor) {
        this.a = valor;
    }
}

