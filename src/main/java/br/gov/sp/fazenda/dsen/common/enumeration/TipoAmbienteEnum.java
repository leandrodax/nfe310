/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoAmbienteEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum TipoAmbienteEnum {
    PRODUCAO("1", "Produ\u00e7\u00e3o"),
    HOMOLOGACAO("2", "Homologa\u00e7\u00e3o");
    
    String a;
    String b;

    private TipoAmbienteEnum(String codigo, String descricao) {
        this.a = descricao;
        this.b = codigo;
    }

    public String getDescricao() {
        return this.a;
    }

    public String getCodigo() {
        return this.b;
    }

    public static TipoAmbienteEnum getEnumPeloCodigo(String string) {
        for (TipoAmbienteEnum e : TipoAmbienteEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

