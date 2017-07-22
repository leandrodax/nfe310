/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class ParametroTO
extends BaseTO {
    private static final long a = 5495556899490633893L;
    private ParametroEnum a;
    private String a;

    public ParametroTO() {
    }

    public ParametroTO(ParametroEnum parametrosEnum, String valor) {
        this.setParametrosEnum(parametrosEnum);
        this.setValor(valor);
    }

    public ParametroEnum getParametrosEnum() {
        return this.a;
    }

    public void setParametrosEnum(ParametroEnum parametrosEnum) {
        this.a = parametrosEnum;
    }

    public String getValor() {
        return this.a;
    }

    public void setValor(String valor) {
        this.a = valor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.a == ((ParametroTO)obj).a;
    }
}

