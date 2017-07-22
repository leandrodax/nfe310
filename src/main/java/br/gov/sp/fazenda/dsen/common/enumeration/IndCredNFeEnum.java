/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndCredNFeEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum IndCredNFeEnum {
    NAO_CREDENCIADO("0", "N\u00e3o credenciado para emiss\u00e3o da NF-e"),
    CREDENCIADO("1", "Credenciado"),
    CREDENCIADO_COM_OBRIG_TODAS_OPER("2", "Credenciado com obrigatoriedade para todas opera\u00e7\u00f5es"),
    CREDENCIADO_COM_OBRIG_PARCIAL("3", "Credenciado com obrigatoriedade parcial"),
    SEFAZ_NAO_INFORMA("4", "a SEFAZ n\u00e3o fornece a informa\u00e7\u00e3o");
    
    private String a;
    private String b;

    private IndCredNFeEnum(String codigo, String descricao) {
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

    public static IndCredNFeEnum getEnumPeloCodigo(String string) {
        for (IndCredNFeEnum e : IndCredNFeEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

