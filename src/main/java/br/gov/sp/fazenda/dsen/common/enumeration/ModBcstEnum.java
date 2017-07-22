/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModBcstEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum ModBcstEnum {
    PRECO_TABELADO_MAX_SUGERIDO("0", "Pre\u00e7o Tabelado ou M\u00e1ximo Sugerido"),
    LISTA_NEGATIVA("1", "Lista Negativa (valor)"),
    LISTA_POSITIVA("2", "Lista Positiva (valor)"),
    LISTA_NEUTRA("3", "Lista Neutra (valor)"),
    MARGEM_VALOR_AGREGADO("4", "Margem Valor Agregado (%)"),
    PAUTA("5", "Pauta (valor)");
    
    private String a;
    private String b;

    private ModBcstEnum(String codigo, String descricao) {
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

    public static ModBcstEnum getEnumPeloCodigo(String string) {
        for (ModBcstEnum e : ModBcstEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

