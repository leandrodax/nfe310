/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum OrigemMercadoriaEnum {
    NACIONAL("0", "0 - Nacional, exceto as indicadas nos c\u00f3digos 3,4,5 E 8"),
    ESTRANGEIRA_IMP_DIRETA("1", "1 - Estrangeira - Importa\u00e7\u00e3o Direta, exceto a indicada no c\u00f3digo 6"),
    ESTRANGEIRA_ADQ_MERC_INTERNO("2", "2 - Estrangeira - Adquirida no Mercado Interno, exceto a indicada no c\u00f3digo 7"),
    NACIONAL_SUP_40("3", "3 - Nacional, mercadoria ou bem com conte\u00fado de Importa\u00e7\u00e3o superior a 40% e inferior ou igual a 70%"),
    NACIONAL_BASICO("4", "4 - Nacional, cuja produ\u00e7\u00e3o tenha sido feita em conformidade com os processos produtivos b\u00e1sicos de que tratam as legisla\u00e7\u00f5es citadas nos Ajustes"),
    NACIONAL_INF_40("5", "5 - Nacional, mercadoria ou bem com conte\u00fado de Importa\u00e7\u00e3o inferior ou igual a 40%"),
    ESTRANGEIRA_IMP_DIRETA_COM_SIMILAR("6", "6 - Estrangeira - Importa\u00e7\u00e3o direta, sem similar nacional, constante em lista da CAMEX e g\u00e1s natural"),
    ESTRANGEIRA_MERC_INTERNO_SEM_SIMILAR("7", "7 - Estrangeira - Adquirida no mercado interno, sem similar nacional, constante em lista da CAMEX e g\u00e1s natural"),
    NACIONAL_SUP_70("8", "8 - Nacional, mercadoria ou bem com conte\u00fado de Importa\u00e7\u00e3o superior a 70%");
    
    private String a;
    private String b;

    private OrigemMercadoriaEnum(String codigo, String descricao) {
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

    public static OrigemMercadoriaEnum getEnumPeloCodigo(String string) {
        for (OrigemMercadoriaEnum e : OrigemMercadoriaEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

