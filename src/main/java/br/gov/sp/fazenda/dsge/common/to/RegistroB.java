/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.RegistroB
 *  br.gov.sp.fazenda.dsge.common.to.RegistroNfe
 */
package br.gov.sp.fazenda.dsge.common.to;

import br.gov.sp.fazenda.dsge.common.to.RegistroNfe;

public class RegistroB
implements RegistroNfe {
    public String valor;
    public String tpAmbiente;

    public String getTpAmbiente() {
        return this.tpAmbiente;
    }

    public void setTpAmbiente(String tpAmbiente) {
        this.tpAmbiente = tpAmbiente;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return "B";
    }
}

