/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualTO
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public class InscricaoEstadualTO
extends InscricaoEstadual {
    public static final int PRODUTOR_RURAL = 1;
    public static final int INDUSTRIA_COMERCIO = 2;
    public static final int EMPRESAS_RUDIMENTARES = 3;
    public static final int CADASTRO_ANTIGO = 99;
    public static final String INVALID_SUB_NUMBER = "The sub number (2..3) must be 01, 02, 03 or 99";
    public static final int DIGIT_COUNT = 9;
    public static final int OLD_DIGIT_COUNT = 11;
    public static final String MASK = "##.######-#";
    public static final String OLD_MASK = "##.##.######-#";

    public int defaultDigitCount() {
        if (this.getNumber() != null && this.getNumber().length() == 11) {
            return 11;
        }
        return 9;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        if (this.getNumber() != null && this.getNumber().length() == 11) {
            return "##.##.######-#";
        }
        return "##.######-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("98765432");
    }

    public boolean isValid() {
        return this.a() || this.isValidOld();
    }

    private boolean a() {
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        int sum = this.getCalcSum();
        int mod = sum % 11;
        int dv1 = mod <= 1 ? 0 : 11 - mod;
        return dv1 == this.getDv1();
    }

    public boolean isValidOld() {
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        if (this.getType() == 0) {
            this.setInvalidCause("The two firsts digits must be 01, 02, 03 or 99");
            return false;
        }
        String digits = this.getNumber().substring(0, 2) + this.getNumber().substring(4);
        int sum = this.getCalcSum(0, 7, digits);
        int mod = sum % 11;
        int dv1 = mod <= 1 ? 0 : 11 - mod;
        return dv1 == this.getDv1();
    }

    public int getType() {
        String special = this.getSpecialDigits();
        if ("01".equals(special)) {
            return 1;
        }
        if ("02".equals(special)) {
            return 2;
        }
        if ("03".equals(special)) {
            return 3;
        }
        if ("99".equals(special)) {
            return 99;
        }
        return 0;
    }

    public String getSpecialDigits() {
        return this.getNumber().substring(2, 4);
    }
}

