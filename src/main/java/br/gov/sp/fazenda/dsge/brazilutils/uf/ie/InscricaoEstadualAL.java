/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualAL
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualAL
extends InscricaoEstadual {
    public int defaultDigitCount() {
        return 9;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        return "24.###.###-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("98765432");
    }

    public boolean isValid() {
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        if (!this.isFixDigitCorrect(0, '2')) {
            return false;
        }
        if (!this.isFixDigitCorrect(1, '4')) {
            return false;
        }
        int sum = this.getCalcSum() * 10;
        int mod = sum - sum / 11 * 11;
        int dv1 = mod == 10 ? 0 : mod;
        return dv1 == this.getDv1();
    }
}

