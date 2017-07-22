/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndAtendementoPresencialEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum IndAtendementoPresencialEnum {
    NAO_SE_APLICA("0", "N\u00e3o se aplica"),
    PRESENCIAL("1", "Opera\u00e7\u00e3o Presencial"),
    INTERNET("2", "Opera\u00e7\u00e3o N\u00c3O Presencial, pela INTERNET"),
    TELEATENDIMENTO("3", "Opera\u00e7\u00e3o N\u00c3O Presencial, pela TELEATENDIMENTO"),
    OUTROS("9", "Opera\u00e7\u00e3o N\u00c3O Presencial, OUTROS");
    
    private String a;
    private String b;

    private IndAtendementoPresencialEnum(String codigo, String descricao) {
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
        return this.getCodigo() + " - " + this.getDescricao();
    }
}

