/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration.importacao;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum SituacaoRegistroEnum {
    INSERIDO("Inserido"),
    ALTERADO("Alterado"),
    REJEITADO("Rejeitado");
    
    private String a;

    private SituacaoRegistroEnum(String descricao) {
        this.a = descricao;
    }

    public String getDescricao() {
        return this.a;
    }

    public String toString() {
        return this.getDescricao();
    }
}

