/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeEspecialTributarioEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum RegimeEspecialTributarioEnum {
    MEM("1", "Microempresa Municipal"),
    E("2", "Estimativa"),
    SP("3", "Sociedade de Profissionais"),
    CO("4", "Cooperativa"),
    MEI("5", "Microempres\u00e1rio Individual(MEI)"),
    ME("6", "Microempres\u00e1rio(ME) e Empresa de Pequeno Porte(EPP)");
    
    private String a;
    private String b;

    private RegimeEspecialTributarioEnum(String codigo, String descricao) {
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

    public static RegimeEspecialTributarioEnum getEnumPeloCodigo(String string) {
        for (RegimeEspecialTributarioEnum e : RegimeEspecialTributarioEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

