/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoOperacaoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoOperacaoEnum {
    VENDA_CONCESSIONARIA("1", "Venda Concession\u00e1ria"),
    FATURAMENTO_DIRETO("2", "Faturamento Direto"),
    VENDA_DIRETA("3", "Venda Direta"),
    OUTROS("0", "Outros");
    
    private String a;
    private String b;

    private TipoOperacaoEnum(String codigo, String descricao) {
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

