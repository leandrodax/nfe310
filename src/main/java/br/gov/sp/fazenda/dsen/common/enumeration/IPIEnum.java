/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IPIEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum IPIEnum {
    IPI_00("00", "IPI 00 - Entrada com recupera\u00e7\u00e3o de cr\u00e9dito"),
    IPI_01("01", "IPI 01 - Entrada tributada com al\u00edquota zero"),
    IPI_02("02", "IPI 02 - Entrada isenta"),
    IPI_03("03", "IPI 03 - Entrada n\u00e3o-tributada"),
    IPI_04("04", "IPI 04 - Entrada imune"),
    IPI_05("05", "IPI 05 - Entrada com suspens\u00e3o"),
    IPI_49("49", "IPI 49 - Outras entradas"),
    IPI_50("50", "IPI 50 - Sa\u00edda tributada"),
    IPI_51("51", "IPI 51 - Sa\u00edda tributada com al\u00edquota zero"),
    IPI_52("52", "IPI 52  - Sa\u00edda isenta"),
    IPI_53("53", "IPI 53 - Sa\u00edda n\u00e3o-tributada"),
    IPI_54("54", "IPI 54 - Sa\u00edda imune"),
    IPI_55("55", "IPI 55 - Sa\u00edda com suspens\u00e3o"),
    IPI_99("99", "IPI 99 - Outras sa\u00eddas");
    
    private String a;
    private String b;

    private IPIEnum(String cst, String descricao) {
        this.a = cst;
        this.b = descricao;
    }

    public String getDescricao() {
        return this.b;
    }

    public String getCst() {
        return this.a;
    }

    public String toString() {
        return this.getDescricao();
    }
}

