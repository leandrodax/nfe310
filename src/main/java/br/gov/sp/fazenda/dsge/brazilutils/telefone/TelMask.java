/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.TelMask
 */
package br.gov.sp.fazenda.dsge.brazilutils.telefone;

public final class TelMask {
    public static final TelMask BrazilianDDD = new TelMask("(##)####-####");
    public static final TelMask DefaultFormat = new TelMask("+**#(*##)*###-####");
    public static final TelMask LocalFormat = new TelMask("*###-####");
    public static final TelMask NullFormat = new TelMask("");
    private String a;

    private TelMask(String mask) {
        this.a = mask;
    }

    public String getMask() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}

