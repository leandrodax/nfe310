/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoCalculoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoCalculoEnum {
    PERCENTUAL("Percentual"),
    EM_VALOR("Em Valor");
    
    private String a;

    private TipoCalculoEnum(String descricao) {
        this.a = descricao;
    }

    public String getDescricao() {
        return this.a;
    }

    public String toString() {
        return this.getDescricao();
    }
}

