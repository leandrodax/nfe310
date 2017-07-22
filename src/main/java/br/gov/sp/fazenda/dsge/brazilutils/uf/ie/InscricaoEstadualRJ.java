/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualRJ
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualRJ
extends InscricaoEstadual {
    public int defaultDigitCount() {
        return 8;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        return "##.###.##-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("2765432");
    }
}

