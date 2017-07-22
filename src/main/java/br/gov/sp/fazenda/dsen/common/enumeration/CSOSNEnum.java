/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum CSOSNEnum {
    _101("101", "101 - Tributada com permiss\u00e3o de cr\u00e9dito"),
    _102("102", "102 - Tributada sem permiss\u00e3o de cr\u00e9dito"),
    _103("103", "103 - Isen\u00e7\u00e3o do ICMS para faixa de receita bruta"),
    _201("201", "201 - Tributada com permiss\u00e3o de cr\u00e9dito e com cobran\u00e7a do ICMS por ST"),
    _202("202", "202 - Tributada sem permiss\u00e3o de cr\u00e9dito e com cobran\u00e7a do ICMS por ST"),
    _203("203", "203 - Isen\u00e7\u00e3o do ICMS para faixa de receita bruta e com cobran\u00e7a do ICMS por ST"),
    _300("300", "300 - Imune"),
    _400("400", "400 - N\u00e3o tributada"),
    _500("500", "500 - ICMS cobrado anteriormente por ST ou por antecipa\u00e7\u00e3o"),
    _900("900", "900 - Outros");
    
    private String a;
    private String b;

    private CSOSNEnum(String csosn, String descricao) {
        this.a = csosn;
        this.b = descricao;
    }

    public String getDescricao() {
        return this.b;
    }

    public String getCsosn() {
        return this.a;
    }

    public String toString() {
        return this.getDescricao();
    }

    public static CSOSNEnum getEnumPeloCodigo(String string) {
        for (CSOSNEnum e : CSOSNEnum.values()) {
            if (!e.getCsosn().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

