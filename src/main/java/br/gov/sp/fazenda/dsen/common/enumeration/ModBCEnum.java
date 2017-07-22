/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModBCEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum ModBCEnum {
    MARGEM_VALOR_AGREGADO("0", "Margem Valor Agregado"),
    PAUTA("1", "Pauta (valor)"),
    PRECO_TABELADO_MAX("2", "Pre\u00e7o Tabelado M\u00e1x. (valor)"),
    VALOR_OPERACAO("3", "Valor da Opera\u00e7\u00e3o");
    
    private String a;
    private String b;

    private ModBCEnum(String codigo, String descricao) {
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

    public static ModBCEnum getEnumPeloCodigo(String string) {
        for (ModBCEnum e : ModBCEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

