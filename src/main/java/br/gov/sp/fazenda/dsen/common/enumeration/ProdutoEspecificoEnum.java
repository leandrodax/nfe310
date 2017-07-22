/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum ProdutoEspecificoEnum {
    VEICULO("Ve\u00edculo"),
    MEDICAMENTO("Medicamento"),
    ARMAMENTO("Armamento"),
    COMBUSTIVEL("Combust\u00edvel"),
    PAPEL_IMUNE("Papel Imune");
    
    private String a;

    private ProdutoEspecificoEnum(String descricao) {
        this.a = descricao;
    }

    public String toString() {
        return this.a;
    }
}

