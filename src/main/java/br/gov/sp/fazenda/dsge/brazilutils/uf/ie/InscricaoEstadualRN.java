/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualRN
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualRN
extends InscricaoEstadual {
    public static final int OLD_DIGIT_COUNT = 9;
    public static final int DIGIT_COUNT = 10;
    public static final String OLD_MASK = "##.###.###-#";
    public static final String MASK = "##.#.###.###-#";

    public int defaultDigitCount() {
        if (this.getNumber() != null && this.getNumber().length() == 9) {
            return 9;
        }
        return 10;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        if (this.getNumber() != null && this.getNumber().length() == 9) {
            return "##.###.###-#";
        }
        return "##.#.###.###-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("98765432");
    }

    public boolean isValid() {
        if (!this.isFixDigitCorrect(0, '2') && !this.isFixDigitCorrect(1, '0')) {
            return false;
        }
        this.defineCoeficients();
        if (this.getNumber().length() == 10) {
            this.addCoeficientLeft(10);
        }
        if (!this.isValidDigitCount()) {
            return false;
        }
        int sum = this.getCalcSum() * 10;
        int mod = sum - sum / 11 * 11;
        int dv1 = mod == 10 ? 0 : mod;
        return dv1 == this.getDv1();
    }
}

