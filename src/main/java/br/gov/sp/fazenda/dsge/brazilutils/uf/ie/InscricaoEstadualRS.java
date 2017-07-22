/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualRS
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualRS
extends InscricaoEstadual {
    public int defaultDigitCount() {
        return 10;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        return "###/#######";
    }

    public void defineCoeficients() {
        this.setCoeficientList("298765432");
    }
}

