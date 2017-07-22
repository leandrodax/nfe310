/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndIncentivoFiscalEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum IndIncentivoFiscalEnum {
    SIM("1", "SIM"),
    NAO("2", "N\u00c3O");
    
    private String a;
    private String b;

    private IndIncentivoFiscalEnum(String codigo, String descricao) {
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

