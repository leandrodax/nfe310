/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum RegimeTributarioEnum {
    SN_1("1", "Simples Nacional"),
    SN_2("2", "Simples Nacional - excesso de sublimite de receita bruta"),
    RN_3("3", "Regime Normal");
    
    private String a;
    private String b;

    private RegimeTributarioEnum(String codigo, String descricao) {
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
        return this.getDescricao();
    }

    public static RegimeTributarioEnum getEnumPeloCodigo(String string) {
        for (RegimeTributarioEnum e : RegimeTributarioEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

