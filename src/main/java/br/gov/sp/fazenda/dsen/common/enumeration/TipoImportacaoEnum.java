/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoImportacaoEnum {
    CONTA_PROPRIA("1", "Por conta pr\u00f3pria"),
    CONTA_ORDEM("2", "Por conta e ordem"),
    ENCOMENDA("3", "Encomenda");
    
    private String a;
    private String b;

    private TipoImportacaoEnum(String codigo, String descricao) {
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

