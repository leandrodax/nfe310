/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IdentLocalDestinoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum IdentLocalDestinoEnum {
    INTERNA("1", "Operacao Interna"),
    INTERESTADUAL("2", "Operacao Interestadual"),
    EXTERIOR("3", "Operacao com Exterior");
    
    private String a;
    private String b;

    private IdentLocalDestinoEnum(String codigo, String descricao) {
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

