/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualBA
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualBA
extends InscricaoEstadual {
    int a = 8;
    int b = 9;

    public int defaultDigitCount() {
        if (this.getNumber().length() > this.a) {
            return this.b;
        }
        return this.a;
    }

    public int getDvCount() {
        return 2;
    }

    public String getMask() {
        if (this.number.length() > this.a) {
            return "#######-##";
        }
        return "######-##";
    }

    public void defineCoeficients() {
        this.setCoeficientList("765432");
    }

    public boolean isValid() {
        if (this.number.length() <= this.a) {
            return this.a();
        }
        this.setCoeficientList("8765432");
        if (!this.isValidDigitCount()) {
            return false;
        }
        int module = this.useModule10() ? 10 : 11;
        int sum2 = this.getCalcSum(0, 6, this.getNumber());
        int mod2 = sum2 % module;
        int dv2 = mod2 == 0 ? 0 : module - mod2;
        if (dv2 >= 10) {
            dv2 = 0;
        }
        this.setCoeficientList("98765432");
        int sum1 = this.getCalcSum(0, 7, this.getBaseNumber() + dv2);
        int mod1 = sum1 % module;
        int dv1 = module - mod1;
        if (dv1 >= 10) {
            dv1 = 0;
        }
        return this.getDv1() == dv1 && this.getDv2() == dv2;
    }

    private boolean a() {
        this.setCoeficientList("765432");
        if (!this.isValidDigitCount()) {
            return false;
        }
        int module = this.useModule10() ? 10 : 11;
        int sum2 = this.getCalcSum(0, 5, this.getNumber());
        int mod2 = sum2 % module;
        int dv2 = mod2 == 0 ? 0 : module - mod2;
        if (dv2 >= 10) {
            dv2 = 0;
        }
        this.setCoeficientList("8765432");
        int sum1 = this.getCalcSum(0, 6, this.getBaseNumber() + dv2);
        int mod1 = sum1 % module;
        int dv1 = module - mod1;
        if (dv1 >= 10) {
            dv1 = 0;
        }
        return this.getDv1() == dv1 && this.getDv2() == dv2;
    }

    public boolean useModule10() {
        short i = this.getNumber().length() > this.a ? this.getDigitValue(1) : this.getDigitValue(0);
        return i <= 5 || i == 8;
    }
}

