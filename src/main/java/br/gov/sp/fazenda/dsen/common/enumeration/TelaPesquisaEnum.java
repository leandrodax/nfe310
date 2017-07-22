/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TelaPesquisaEnum {
    GERENCIAR_NOTA_FISCAL("Tela de Gerenciar Nota Fiscal"),
    RELATORIO_GERENCIAL("Tela de Relat\u00f3rio Gerencial"),
    IMPRESSAO_DANFE("Tela de Impress\u00e3o do Danfe"),
    EMITENTE("Tela de Cadastro de Emitentes"),
    CLIENTE("Tela de Cadastro de Clientes"),
    PRODUTO("Tela de Cadastro de Produtos"),
    TRANSPORTADORA("Tela de Cadastro de Transportadoras");
    
    private String a;

    private TelaPesquisaEnum(String descricao) {
        this.a = descricao;
    }

    public String getDescricao() {
        return this.a;
    }
}

