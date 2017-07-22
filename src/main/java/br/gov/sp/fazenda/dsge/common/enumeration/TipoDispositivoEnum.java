/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDispositivoEnum
 */
package br.gov.sp.fazenda.dsge.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoDispositivoEnum {
    A1("A1"),
    A3("A3");
    
    private String a;

    private TipoDispositivoEnum(String tipo) {
        this.a = tipo;
    }

    public String getTipo() {
        return this.a;
    }
}

