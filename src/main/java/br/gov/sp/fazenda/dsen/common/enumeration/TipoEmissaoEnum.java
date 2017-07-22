/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum TipoEmissaoEnum {
    NORMAL("1", "Normal", "Normal"),
    CONTINGENCIA("2", "Conting\u00eancia FS", "Cont. FS"),
    CONTINGENCIA_SCAN("3", "Conting\u00eancia com SCAN", "Cont. SCAN"),
    CONTINGENCIA_DPEC("4", "Conting\u00eancia via DPEC", "Cont. DPEC"),
    CONTINGENCIA_FS_DA("5", "Conting\u00eancia FS-DA", "Cont. FS-DA"),
    CONTINGENCIA_SVC_AN("6", "Conting\u00eancia SVC-AN", "Cont. SVC-AN"),
    CONTINGENCIA_SVC_RS("7", "Conting\u00eancia SVC-RS", "Cont. SVC-RS");
    
    private String a;
    private String b;
    private String c;

    private TipoEmissaoEnum(String codigo, String descricao, String descricaoRelatorio) {
        this.a = codigo;
        this.b = descricao;
        this.c = descricaoRelatorio;
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

    public String getDescricaoRelatorio() {
        return this.c;
    }

    public static TipoEmissaoEnum getEnumPeloCodigo(String string) {
        for (TipoEmissaoEnum e : TipoEmissaoEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

