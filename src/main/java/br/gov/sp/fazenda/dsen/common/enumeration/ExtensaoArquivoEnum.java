/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum ExtensaoArquivoEnum {
    XML(".xml"),
    TXT(".txt");
    
    private String a;

    private ExtensaoArquivoEnum(String extensao) {
        this.a = extensao;
    }

    public String getExtensao() {
        return this.a;
    }
}

