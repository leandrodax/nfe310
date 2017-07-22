/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndIEDestEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum IndIEDestEnum {
    CONTRIB_ICMS("1", "Contribuinte ICMS"),
    CONTRIB_ISENTO("2", "Contribuinte ISENTO"),
    NAO_CONBRIB("9", "N\u00e3o Contribuinte");
    
    private String a;
    private String b;

    private IndIEDestEnum(String codigo, String descricao) {
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
}

