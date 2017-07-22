/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum CSTEnum {
    _00("00", "00 - Tributada integralmente"),
    _10("10", "10 - Tributada com cobran\u00e7a do ICMS por ST"),
    _10_Part("10_Part", "10 - Tributada com cobran\u00e7a do ICMS por ST (com partilha do ICMS entre a UF de origem e a UF de destino ou a UF definida na legisla\u00e7\u00e3o)"),
    _20("20", "20 - Com redu\u00e7\u00e3o da base de c\u00e1lculo"),
    _30("30", "30 - Isenta ou n\u00e3o tributada e com cobran\u00e7a do ICMS por ST"),
    _40("40", "40 - Isenta"),
    _41("41", "41 - N\u00e3o tributada"),
    _41_ST("41_ST", "41 - N\u00e3o tributada (ICMSST devido para a UF de destino, nas opera\u00e7\u00f5es interestaduais de produtos que tiveram reten\u00e7\u00e3o antecipada de ICMS por ST na UF do rementente)"),
    _50("50", "50 - Suspens\u00e3o"),
    _51("51", "51 - Diferimento"),
    _60("60", "60 - Cobrado anteriormente por ST"),
    _70("70", "70 - Com redu\u00e7\u00e3o da base de c\u00e1lculo e cobran\u00e7a do ICMS por ST"),
    _90_Part("90_Part", "90 - Outras (com partilha do ICMS entre a UF de origem e a UF de destino ou a UF definida na legisla\u00e7\u00e3o)"),
    _90("90", "90 - Outras");
    
    private String a;
    private String b;

    private CSTEnum(String cst, String descricao) {
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

    public static CSTEnum getEnumPeloCodigo(String string) {
        for (CSTEnum e : CSTEnum.values()) {
            if (!e.getCst().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

