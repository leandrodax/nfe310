/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualPR
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualPR
extends InscricaoEstadual {
    public int defaultDigitCount() {
        return 10;
    }

    public int getDvCount() {
        return 2;
    }

    public String getMask() {
        return "########-##";
    }

    public void defineCoeficients() {
        this.setCoeficientList("32765432");
    }

    public boolean isValid() {
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        int sum1 = this.getCalcSum(0, 7, this.getNumber());
        int mod1 = sum1 % 11;
        int dv1 = 11 - mod1 >= 10 ? 0 : 11 - mod1;
        this.setCoeficientList("432765432");
        int sum2 = this.getCalcSum(0, 8, this.getNumber());
        int mod2 = sum2 % 11;
        int dv2 = 11 - mod2 >= 10 ? 0 : 11 - mod2;
        return this.getDv1() == dv1 && this.getDv2() == dv2;
    }
}

