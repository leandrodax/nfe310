/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.CondicaoVeiculoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum CondicaoVeiculoEnum {
    ACABADO("1", "Acabado"),
    INACABADO("2", "Inacabado"),
    SEMI_ACABADO("3", "Semi-acabado");
    
    private String a;
    private String b;

    private CondicaoVeiculoEnum(String codigo, String descricao) {
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
}

