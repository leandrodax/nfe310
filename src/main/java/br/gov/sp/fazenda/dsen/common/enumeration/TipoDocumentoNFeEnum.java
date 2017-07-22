/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum TipoDocumentoNFeEnum {
    ENTRADA("0", "Entrada"),
    SAIDA("1", "Sa\u00edda");
    
    private String a;
    private String b;

    private TipoDocumentoNFeEnum(String codigo, String descricao) {
        this.a = codigo;
        this.b = descricao;
    }

    public String getCodigo() {
        return this.a;
    }

    public String getDescricao() {
        return this.b;
    }

    public String toString() {
        return this.getCodigo() + " - " + this.getDescricao();
    }

    public static TipoDocumentoNFeEnum getEnumPeloCodigo(String string) {
        for (TipoDocumentoNFeEnum e : TipoDocumentoNFeEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

