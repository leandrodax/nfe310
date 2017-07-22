/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoArmaEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoArmaEnum {
    USO_PERMITIDO("0", "Uso Permitido"),
    USO_RESTRITO("1", "Uso Restrito");
    
    private String a;
    private String b;

    private TipoArmaEnum(String codigo, String descricao) {
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

