/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoPapelImpressaoEnum {
    A4("0", "A4 (210x297mm)"),
    OFICIO2("1", "Of\u00edcio 2 (230x330mm)");
    
    private String a;
    private String b;

    private TipoPapelImpressaoEnum(String codigo, String descricao) {
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
        return this.getDescricao();
    }
}

