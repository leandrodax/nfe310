/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public enum DSENSchemaTypeEnum {
    nfe("nfe", "nfe_v3.10.xsd"),
    procNFe("procNfe", "procNFe_v3.10.xsd"),
    cancNFe("cancNfe", "cancNFe_v2.00.xsd"),
    retCancNFe("retCancNfe", "retCancNFe_v2.00.xsd"),
    procCancNFe("procCancNfe", "procCancNFe_v2.00.xsd"),
    sistema("", ""),
    envDPEC("", "envDPEC_v1.01.xsd"),
    retDPEC("", "retDPEC_v1.01.xsd"),
    retConsDPEC("", "retConsDPEC_v1.01.xsd"),
    ProcInutNFe("procInutNfe", "procInutNFe_v3.10.xsd"),
    procEventoNFe("procEventoNfe", "procEventoNFe_v1.00.xsd");
    
    private String a;
    private String b;

    private DSENSchemaTypeEnum(String sufixoNomeExportacao, String nomeXSD) {
        this.a = sufixoNomeExportacao;
        this.b = nomeXSD;
    }

    public String getSufixoNomeExportacao() {
        return this.a;
    }

    public String getNomeXSD() {
        return this.b;
    }
}

