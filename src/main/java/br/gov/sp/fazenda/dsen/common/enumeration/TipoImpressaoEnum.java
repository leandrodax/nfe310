/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoImpressaoEnum {
    RETRATO("1", "Retrato"),
    PAISAGEM("2", "Paisagem");
    
    private String a;
    private String b;

    private TipoImpressaoEnum(String codigo, String descricao) {
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

