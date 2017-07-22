/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoViaTransporteEnum {
    MARITIMA("1", "Mar\u00edtima"),
    FLUVIAL("2", "Fluvial"),
    LACUSTRE("3", "Lacustre"),
    AEREA("4", "A\u00e9rea"),
    POSTAL("5", "Postal"),
    FERROVIARIA("6", "Ferrovi\u00e1ria"),
    RODOVIARIA("7", "Rodovi\u00e1ria"),
    CONDUTO("8", "Conduto / Rede Transmiss\u00e3o"),
    MEIOS_PROPRIOS("9", "Meios Pr\u00f3prios"),
    ES_FICTA("10", "Entrada/Sa\u00edda ficta");
    
    private String a;
    private String b;

    private TipoViaTransporteEnum(String codigo, String descricao) {
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

