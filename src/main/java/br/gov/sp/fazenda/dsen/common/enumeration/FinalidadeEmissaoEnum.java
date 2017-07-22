/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum FinalidadeEmissaoEnum {
    NFE_NORMAL("1", "NF-e normal"),
    NFE_COMPLEMENTAR("2", "NF-e complementar"),
    NFE_AJUSTE("3", "NF-e de ajuste"),
    NFE_DEVOLUCAO_RETORNO("4", "Devolu\u00e7\u00e3o/Retorno");
    
    private String a;
    private String b;

    private FinalidadeEmissaoEnum(String codigo, String descricao) {
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

