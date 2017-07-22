/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualAP
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualAP
extends InscricaoEstadual {
    public int defaultDigitCount() {
        return 9;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        return "########-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("98765432");
    }

    public boolean isValid() {
        int p;
        int d;
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        if (!this.isFixDigitCorrect(0, '0')) {
            return false;
        }
        if (!this.isFixDigitCorrect(1, '3')) {
            return false;
        }
        long num = Long.parseLong(this.getBaseNumber());
        if (num >= 3000001 && num <= 3017000) {
            p = 5;
            d = 0;
        } else if (num >= 3017001 && num <= 3019022) {
            p = 9;
            d = 1;
        } else {
            p = 0;
            d = 0;
        }
        int sum = p + this.getCalcSum();
        int resto = sum % 11;
        int dv1 = 11 - resto;
        if (dv1 == 10) {
            dv1 = 0;
        } else if (dv1 == 11) {
            dv1 = d;
        }
        return dv1 == this.getDv1();
    }
}

