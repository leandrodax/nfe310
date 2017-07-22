/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TributacaoISSQNEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum TributacaoISSQNEnum {
    N("N", "Normal"),
    R("R", "Retida"),
    S("S", "Substituta"),
    I("I", "Isenta");
    
    private String a;
    private String b;

    private TributacaoISSQNEnum(String cst, String descricao) {
        this.a = cst;
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

    public static TributacaoISSQNEnum getEnumPeloCodigo(String string) {
        for (TributacaoISSQNEnum e : TributacaoISSQNEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

