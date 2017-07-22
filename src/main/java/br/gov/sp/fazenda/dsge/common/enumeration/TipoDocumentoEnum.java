/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 */
package br.gov.sp.fazenda.dsge.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum TipoDocumentoEnum {
    CNPJ("CNPJ"),
    CPF("CPF");
    
    private String a;

    private TipoDocumentoEnum(String description) {
        this.a = description;
    }

    public String getDescription() {
        return this.a;
    }

    public static TipoDocumentoEnum getTipoDocumentoEnumByDescription(String des) {
        for (int i = 0; i < TipoDocumentoEnum.values().length; ++i) {
            if (!TipoDocumentoEnum.values()[i].getDescription().equals(des)) continue;
            return TipoDocumentoEnum.values()[i];
        }
        return null;
    }

    static {
    }
}

