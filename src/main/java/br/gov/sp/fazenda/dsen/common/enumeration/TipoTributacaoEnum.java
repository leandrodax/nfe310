/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoTributacaoEnum {
    NORMAL("Tributa\u00e7\u00e3o Normal"),
    SIMPLES_NACIONAL("Simples Nacional");
    
    private String a;

    private TipoTributacaoEnum(String descricao) {
        this.a = descricao;
    }

    public String getDescricao() {
        return this.a;
    }

    public String toString() {
        return this.getDescricao();
    }
}

