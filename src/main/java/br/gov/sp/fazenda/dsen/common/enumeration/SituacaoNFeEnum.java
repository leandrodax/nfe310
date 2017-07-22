/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum SituacaoNFeEnum {
    ASSINADA("Assinada"),
    AUTORIZADA("Autorizada"),
    CANCELADA("Cancelada"),
    CANCELADA_EVENTO("Cancelada "),
    DENEGADA("Denegada"),
    EM_DIGITACAO("Em Digita\u00e7\u00e3o"),
    EM_PROCESSAMENTO_SEFAZ("Em Processamento na SEFAZ"),
    REJEITADA("Rejeitada"),
    TRANSMITIDA_COM_PENDENCIA("Transmitida com Pend\u00eancia"),
    VALIDADA("Validada");
    
    private String a;

    private SituacaoNFeEnum(String description) {
        this.a = description;
    }

    public String getDescricao() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }
}

