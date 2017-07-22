/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum TipoConsultaDpecEnum {
    CHAVE_ACESSO("Chave de Acesso"),
    NUMERO_REGISTRO("N\u00famero do Registro");
    
    private String a;

    private TipoConsultaDpecEnum(String desc) {
        this.a = desc;
    }

    public String getDescription() {
        return this.a;
    }

    public String toString() {
        return this.getDescription();
    }
}

