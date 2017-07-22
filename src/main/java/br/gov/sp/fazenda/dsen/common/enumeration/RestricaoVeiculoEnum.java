/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RestricaoVeiculoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum RestricaoVeiculoEnum {
    NAO_HA("0", "N\u00e3o h\u00e1"),
    ALIENACAO_FIDUCIARIA("1", "Aliena\u00e7\u00e3o Fiduci\u00e1ria"),
    ARRENDAMENTO_MERCANTIL("2", "Arrendamento Mercantil"),
    RESERVA_DOMINIO("3", "Reserva de Dom\u00ednio"),
    PENHOR_VEICULOS("4", "Penhor de Ve\u00edculos"),
    OUTRAS("9", "outras");
    
    private String a;
    private String b;

    private RestricaoVeiculoEnum(String codigo, String descricao) {
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

    public static RestricaoVeiculoEnum getEnumPeloCodigo(String string) {
        for (RestricaoVeiculoEnum e : RestricaoVeiculoEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

