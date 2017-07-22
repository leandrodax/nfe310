/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualRO
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualRO
extends InscricaoEstadual {
    public static final int DIGIT_COUNT = 14;
    public static final int OLD_DIGIT_COUNT = 9;
    public static final String MASK = "########.#####-#";
    public static final String OLD_MASK = "###.#####-#";

    public void convertToNewFormat() {
        if (this.getNumber().length() == 9) {
            String result = this.getNumber().substring(3);
            for (int i = result.length(); i < 14; ++i) {
                result = "0" + result;
            }
            this.setNumber(result);
        }
    }

    public int defaultDigitCount() {
        if (this.getNumber() != null && this.getNumber().length() == 9) {
            return 9;
        }
        return 14;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        if (this.getNumber() != null && this.getNumber().length() == 9) {
            return "###.#####-#";
        }
        return "########.#####-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("6543298765432");
    }

    public boolean isValid() {
        this.convertToNewFormat();
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        int sum = this.getCalcSum();
        int mod = sum % 11;
        int dv1 = 11 - mod;
        if (dv1 >= 10) {
            dv1 -= 10;
        }
        return dv1 == this.getDv1();
    }
}

