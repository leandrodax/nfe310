/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualPE
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualPE
extends InscricaoEstadual {
    public static final int DIGIT_COUNT = 9;
    public static final int OLD_DIGIT_COUNT = 14;
    public static final String MASK = "###.####-##";
    public static final String OLD_MASK = "##.#.###.#######-#";

    public int defaultDigitCount() {
        if (this.getNumber() != null && this.getNumber().length() > 9) {
            return 14;
        }
        return 9;
    }

    public int getDvCount() {
        if (this.getNumber() != null && this.getNumber().length() > 9) {
            return 1;
        }
        return 2;
    }

    public String getMask() {
        if (this.getNumber() != null && this.getNumber().length() > 9) {
            return "##.#.###.#######-#";
        }
        return "###.####-##";
    }

    public void defineCoeficients() {
        this.setCoeficientList("5432198765432");
    }

    public boolean isValid() {
        if (this.getNumber() != null && this.getNumber().length() > 9) {
            return this.a();
        }
        return this.b();
    }

    private boolean a() {
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        int sum = this.getCalcSum();
        int mod = sum % 11;
        int dv1 = 11 - mod > 9 ? 11 - mod - 10 : 11 - mod;
        return dv1 == this.getDv1();
    }

    private boolean b() {
        int[] foundDv = new int[]{0, 0};
        String ie = this.getNumber();
        int dv1 = Integer.parseInt(String.valueOf(ie.charAt(ie.length() - 2)));
        int dv2 = Integer.parseInt(String.valueOf(ie.charAt(ie.length() - 1)));
        if (!this.isValidDigitCount()) {
            return false;
        }
        for (int j = 0; j < 2; ++j) {
            int sum = 0;
            int coeficient = 2;
            for (int i = ie.length() - 3 + j; i >= 0; --i) {
                int digit = Integer.parseInt(String.valueOf(ie.charAt(i)));
                sum += digit * coeficient;
                if (++coeficient <= 9) continue;
                coeficient = 2;
            }
            foundDv[j] = 11 - sum % 11;
            if (foundDv[j] < 10) continue;
            foundDv[j] = 0;
        }
        return dv1 == foundDv[0] && dv2 == foundDv[1];
    }
}

