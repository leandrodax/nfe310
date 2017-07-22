/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.MotivoDesoneracaoICMSEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum MotivoDesoneracaoICMSEnum {
    TAXI("1", "T\u00e1xi"),
    PRODUTOR_AGROPECUARIO("3", "Produtor Agropecu\u00e1rio"),
    FROTISTA_LOCADORA("4", "Frotista/Locadora"),
    DIPLOMATICO_CONSULAR("5", "Diplom\u00e1tico/Consular"),
    UTILIT_MOTOC_AMAZONIA_OCID_ALC("6", "Utilit. e Motoc. da Amaz\u00f4nia Ocid. e \u00c1reas de Livre Com\u00e9rcio"),
    SUFRAMA("7", "SUFRAMA"),
    VENDA_ORGAOS("8", "Venda a \u00d3rg\u00e3os P\u00fablicos"),
    OUTROS("9", "Outros"),
    DEF_CONDUDOR("10", "Deficiente Condutor"),
    DEF_N_CONDUDOR("11", "Deficiente N\u00e3o Condutor"),
    ORGAO_FOMEN_DESEN_AGROPECUARIO("12", "\u00d3rg\u00e3o de fomento e desenvolvimento agropecu\u00e1rio");
    
    private String a;
    private String b;

    private MotivoDesoneracaoICMSEnum(String cst, String descricao) {
        this.a = cst;
        this.b = descricao;
    }

    public String getDescricao() {
        return this.b;
    }

    public String getCodigo() {
        return this.a;
    }

    public String toString() {
        return this.getDescricao();
    }

    public static MotivoDesoneracaoICMSEnum getEnumPeloCodigo(String string) {
        for (MotivoDesoneracaoICMSEnum e : MotivoDesoneracaoICMSEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

