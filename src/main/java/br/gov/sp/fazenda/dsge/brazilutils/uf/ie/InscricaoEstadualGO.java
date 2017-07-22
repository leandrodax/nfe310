/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualGO
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualGO
extends InscricaoEstadual {
    public int defaultDigitCount() {
        return 9;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        return "##.###.###-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("98765432");
    }

    public boolean isValid() {
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        if (!this.isFixDigitCorrect(0, '1')) {
            return false;
        }
        if (this.getDigitValue(1) != 0 && this.getDigitValue(1) != 1 && this.getDigitValue(1) != 5) {
            return false;
        }
        long number = this.toLong();
        int sum = this.getCalcSum();
        int mod = sum % 11;
        int dv1 = number >= 110944020 && number < 110944030 ? 0 : (mod == 0 ? 0 : (mod == 1 ? (number >= 101031050 && number <= 101199979 ? 1 : 0) : 11 - mod));
        return dv1 == this.getDv1();
    }
}

