/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.TipoLogradouro
 */
package br.gov.sp.fazenda.dsge.brazilutils.endereco;

public final class TipoLogradouro {
    private String a;
    private String b;
    private String c = null;

    private TipoLogradouro(String name, String shortFormat, String regex) {
        this.a = name;
        this.b = shortFormat;
        this.c = regex;
    }
}

