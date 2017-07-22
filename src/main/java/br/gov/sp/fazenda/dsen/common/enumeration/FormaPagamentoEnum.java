/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum FormaPagamentoEnum {
    A_VISTA("0", "Pagamento \u00e0 vista"),
    A_PRAZO("1", "Pagamento a prazo"),
    OUTROS("2", "Outros");
    
    private String a;
    private String b;

    private FormaPagamentoEnum(String codigo, String descricao) {
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

    public static FormaPagamentoEnum getEnumPeloCodigo(String string) {
        for (FormaPagamentoEnum e : FormaPagamentoEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

