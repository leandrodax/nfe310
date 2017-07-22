/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemProcessoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum OrigemProcessoEnum {
    SEFAZ("0", "SEFAZ"),
    JUSTICA_FEDERAL("1", "Justi\u00e7a Federal"),
    JUSTICA_ESTADUAL("2", "Justi\u00e7a Estadual"),
    SECEX_RFB("3", "Secex/RFB"),
    OUTROS("9", "Outros");
    
    private String a;
    private String b;

    private OrigemProcessoEnum(String codigo, String descricao) {
        this.a = codigo;
        this.b = descricao;
    }

    public String getDescricao() {
        return this.b;
    }

    public String getCodigo() {
        return this.a;
    }

    public String toString() {
        return this.getDescricao();
    }

    public static OrigemProcessoEnum getEnumPeloCodigo(String string) {
        for (OrigemProcessoEnum e : OrigemProcessoEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

