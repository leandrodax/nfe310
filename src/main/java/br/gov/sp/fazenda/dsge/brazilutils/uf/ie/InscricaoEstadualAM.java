/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualAM
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualAM
extends InscricaoEstadual {
    public int defaultDigitCount() {
        return 9;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        return "##.###.##-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("98765432");
    }

    public boolean isValid() {
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        int sum = this.getCalcSum();
        int mod = sum % 11;
        int dv1 = sum < 11 ? 11 - sum : (mod <= 1 ? 0 : 11 - mod);
        return dv1 == this.getDv1();
    }
}

