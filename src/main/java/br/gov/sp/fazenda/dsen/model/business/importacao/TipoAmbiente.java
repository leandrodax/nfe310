/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.business.importacao.TipoAmbiente
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoAmbiente {
    _1("Produ\u00e7\u00e3o"),
    _2("Homologa\u00e7\u00e3o");
    
    String a;

    private TipoAmbiente(String descricao) {
        this.a = descricao;
    }

    public String getDescricao() {
        return this.a;
    }
}

