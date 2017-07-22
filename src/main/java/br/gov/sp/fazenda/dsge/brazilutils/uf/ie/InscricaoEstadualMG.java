/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualMG
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualMG
extends InscricaoEstadual {
    public static final int IE_PRODUTOR_RURAL_DIGIT_COUNT = 10;

    public int defaultDigitCount() {
        return 13;
    }

    public int getDvCount() {
        return 2;
    }

    public String getMask() {
        if (this.getNumber().length() <= 10) {
            return "**########";
        }
        return "###.###.###/####";
    }

    public void defineCoeficients() {
        this.clearCoeficients();
        this.addCoeficient(3);
        this.addCoeficient(2);
        this.addCoeficient(11);
        this.addCoeficient(10);
        this.addCoeficient(9);
        this.addCoeficient(8);
        this.addCoeficient(7);
        this.addCoeficient(6);
        this.addCoeficient(5);
        this.addCoeficient(4);
        this.addCoeficient(3);
        this.addCoeficient(2);
    }

    public boolean isValid() {
        this.defineCoeficients();
        if (this.getNumber().substring(0, 2).equalsIgnoreCase("PR") && this.getNumber().length() <= 10 && this.getNumber().length() >= 3) {
            return true;
        }
        if (!this.isValidDigitCount()) {
            return false;
        }
        String s = this.getNumber().substring(0, 3) + "0" + this.getNumber().substring(3, 11);
        String alg = "";
        for (int i = 0; i < s.length(); ++i) {
            short x = Short.parseShort(String.valueOf(s.charAt(i)));
            alg = i % 2 == 0 ? alg + x : alg + x * 2;
        }
        int sum1 = 0;
        for (int j = 0; j < alg.length(); ++j) {
            sum1 += Integer.parseInt(String.valueOf(alg.charAt(j)));
        }
        int d = sum1;
        while (d % 10 > 0) {
            ++d;
        }
        int dv1 = d - sum1;
        int sum2 = this.getCalcSum(0, 11, this.getNumber());
        int mod2 = sum2 % 11;
        int dv2 = mod2 <= 1 ? 0 : 11 - mod2;
        return this.getDv1() == dv1 && this.getDv2() == dv2;
    }
}

