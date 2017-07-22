/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExigibilidadeISSEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum ExigibilidadeISSEnum {
    EXIGIVEL("1", "Ex\u00edgivel"),
    NAO_INCIDENCIA("2", "N\u00e3o incid\u00eancia"),
    ISENCAO("3", "Isen\u00e7\u00e3o"),
    EXPORTACAO("4", "Exporta\u00e7\u00e3o"),
    IMUNIDADE("8", "Imunidade"),
    EXIGIBILIDADE_SUSP_DJ("6", "Exigibilidade suspensa por decis\u00e3o judicial"),
    EXIGIBILIDADE_SUSP_PA("7", "Exigibilidade suspensa por processo administrativo");
    
    private String a;
    private String b;

    private ExigibilidadeISSEnum(String codigo, String descricao) {
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

