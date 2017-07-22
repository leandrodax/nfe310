/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.UFNumeracaoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum UFNumeracaoEnum {
    SP(Boolean.valueOf(false)),
    AC(Boolean.valueOf(false)),
    AL(Boolean.valueOf(false)),
    AM(Boolean.valueOf(false)),
    AP(Boolean.valueOf(false)),
    BA(Boolean.valueOf(false)),
    CE(Boolean.valueOf(false)),
    DF(Boolean.valueOf(false)),
    ES(Boolean.valueOf(false)),
    GO(Boolean.valueOf(false)),
    MA(Boolean.valueOf(false)),
    MG(Boolean.valueOf(false)),
    MS(Boolean.valueOf(false)),
    MT(Boolean.valueOf(false)),
    PA(Boolean.valueOf(false)),
    PB(Boolean.valueOf(false)),
    PE(Boolean.valueOf(false)),
    PI(Boolean.valueOf(false)),
    PR(Boolean.valueOf(false)),
    RJ(Boolean.valueOf(false)),
    RN(Boolean.valueOf(false)),
    RO(Boolean.valueOf(false)),
    RR(Boolean.valueOf(false)),
    RS(Boolean.valueOf(false)),
    SC(Boolean.valueOf(false)),
    SE(Boolean.valueOf(false)),
    TO(Boolean.valueOf(false)),
    EX(Boolean.valueOf(false));
    
    private Boolean a;

    private UFNumeracaoEnum(Boolean reinicioNumeracaoAtivo) {
        this.a = reinicioNumeracaoAtivo;
    }

    public Boolean isReinicioNumeracaoAtivo() {
        return this.a;
    }
}

