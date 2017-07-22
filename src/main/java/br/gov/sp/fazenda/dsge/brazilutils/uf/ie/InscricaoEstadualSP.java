/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualSP
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public class InscricaoEstadualSP
extends InscricaoEstadual {
    public static final int TYPE1 = 1;
    public static final int TYPE2 = 2;
    public static final int TYPE2_CHAR_LENGTH = 13;
    public static final char LITERAL_CHAR = 'P';
    public static final String TYPE1_MASK = "###.###.###.###";
    public static final String TYPE2_MASK = "P-########.#/###";
    private transient char a = 32;

    public int defaultDigitCount() {
        return 12;
    }

    public int getDvCount() {
        return 2;
    }

    public String getMask() {
        if (this.isType2()) {
            return "P-########.#/###";
        }
        return "###.###.###.###";
    }

    public void defineCoeficients() {
        this.setCoeficientsDv1();
    }

    public boolean isValid() {
        int sum1 = 0;
        int mod1 = 0;
        int dv1 = 0;
        int sum2 = 0;
        int mod2 = 0;
        int dv2 = 0;
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        if (this.isType2()) {
            String digits = this.getNumber().substring(0, 8);
            sum1 = this.getCalcSum(0, 7, digits);
            mod1 = sum1 % 11;
            dv1 = mod1 % 10;
        } else {
            String digits = this.getNumber().substring(0, 8);
            sum1 = this.getCalcSum(0, 7, digits);
            mod1 = sum1 % 11;
            dv1 = mod1 % 10;
            this.setCoeficientsDv2();
            sum2 = this.getCalcSum(0, 10, this.getNumber());
            mod2 = sum2 % 11;
            dv2 = mod2 % 10;
        }
        return this.getDv1() == dv1 && this.getDv2() == dv2;
    }

    public int getDv1Position() {
        return 8;
    }

    protected void setCoeficientsDv1() {
        this.clearCoeficients();
        if (!this.isType2()) {
            this.addCoeficient(1);
            this.addCoeficient(3);
            this.addCoeficient(4);
            this.addCoeficient(5);
            this.addCoeficient(6);
            this.addCoeficient(7);
            this.addCoeficient(8);
            this.addCoeficient(10);
        }
    }

    protected void setCoeficientsDv2() {
        this.clearCoeficients();
        this.addCoeficient(3);
        this.addCoeficient(2);
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

    public boolean isType2() {
        return this.a == 'P';
    }

    public void setNumber(String number) {
        number.toUpperCase();
        if (number != null && number.charAt(0) == 'P' && number.length() == 13) {
            this.a = 80;
        }
        super.setNumber(number);
    }
}

