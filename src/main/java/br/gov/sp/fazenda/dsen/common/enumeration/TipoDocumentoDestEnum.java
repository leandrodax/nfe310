/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoDestEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum TipoDocumentoDestEnum {
    CNPJ("CNPJ"),
    CPF("CPF"),
    ESTRANGEIRO("Estrangeiro");
    
    private String a;

    private TipoDocumentoDestEnum(String description) {
        this.a = description;
    }

    public String getDescription() {
        return this.a;
    }

    public static TipoDocumentoDestEnum getTipoDocumentoEnumByDescription(String des) {
        for (int i = 0; i < TipoDocumentoDestEnum.values().length; ++i) {
            if (!TipoDocumentoDestEnum.values()[i].getDescription().equals(des)) continue;
            return TipoDocumentoDestEnum.values()[i];
        }
        return null;
    }

    static {
    }
}

