/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 */
package br.gov.sp.fazenda.dsen.common.enumeration;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public enum TipoEventoEnum {
    e110100("110100", "Autoriza\u00e7\u00e3o de Uso"),
    e110101("110101", "Denega\u00e7\u00e3o de Uso"),
    e110111("110111", "Cancelamento"),
    e110110("110110", "Carta de Corre\u00e7\u00e3o"),
    e110120("110120", "Registros de Sa\u00edda"),
    e210200("210200", "Confirma\u00e7\u00e3o da Opera\u00e7\u00e3o"),
    e210210("210210", "Ci\u00eancia da Emiss\u00e3o"),
    e210220("210220", "Desconhecimento da Opera\u00e7\u00e3o"),
    e210240("210240", "Opera\u00e7\u00e3o n\u00e3o Realizada"),
    e220200("220200", "Confirma\u00e7\u00e3o de Recebimento - Portal SEFAZ"),
    e220220("220220", "Desconhecimento da Opera\u00e7\u00e3o - Portal SEFAZ"),
    e220240("220240", "Devolu\u00e7\u00e3o de Mercadoria - Portal SEFAZ"),
    e310220("310220", "Desconhecimento da Opera\u00e7\u00e3o pela Transportadora"),
    e430111("430111", "Cancelamento pelo Fisco"),
    e431111("431111", "Revers\u00e3o do Cancelamento"),
    e430112("430112", "Autorizado Cancelamento Extempor\u00e2neo da NF-e"),
    e431100("431100", "Opera\u00e7\u00e3o n\u00e3o Realizada"),
    e430400("430400", "Recupera\u00e7\u00e3o do ICMS"),
    e430420("430420", "Restitui\u00e7\u00e3o ICMS Combust\u00edvel"),
    e430430("430430", "NF-e em An\u00e1lise"),
    e430440("430440", "NF-e visada pelo Fisco"),
    e430450("430450", "Corre\u00e7\u00e3o pelo Fisco"),
    e590500("590500", "IE Destinat\u00e1rio Inexistente"),
    e590510("590510", "IE Destinat\u00e1rio Situa\u00e7\u00e3o Irregular no Fisco"),
    e590520("590520", "IE Destinat\u00e1rio diverge do CNPJ"),
    e610600("610600", "CT-e Autorizado"),
    e610601("610601", "CT-e Cancelado"),
    e630600("630600", "Registro de Passagem via SEFAZ"),
    e610620("610620", "Ocorr\u00eancia Tr\u00e2nsito via SCIMT"),
    e630620("630620", "Ocorr\u00eancia Fiscaliza\u00e7\u00e3o Tr\u00e2nsito"),
    e690630("690630", "Rastreamento RFID"),
    e630640("630640", "Roubo de Carga"),
    e630660("630660", "NF-e referenciada pelo Fisco"),
    e630680("630680", "Corre\u00e7\u00e3o pelo Fisco"),
    e630690("630690", "Vistoria SUFRAMA"),
    e790700("790700", "Sa\u00edda para Exporta\u00e7\u00e3o"),
    e790720("790720", "Internaliza\u00e7\u00e3o Mercadoria (Desembara\u00e7o Aduaneiro)"),
    e790730("790730", "CNPJ destinat\u00e1rio inexistente no cadastro nacional de PJ"),
    e790740("790740", "CNPJ destinat\u00e1rio n\u00e3o pertence a UF informada"),
    e980800("980800", "Gerado CT-e para a NF-e"),
    e980810("980810", "Gerado MC-e para a NF-e"),
    e990900("990900", "Vistoria SUFRAMA"),
    e990910("990910", "Internaliza\u00e7\u00e3o na SUFRAMA"),
    e990920("990920", "Registro de Ve\u00edculo (Primeiro Emplacamento)");
    
    private String a;
    private String b;

    private TipoEventoEnum(String codigo, String descricao) {
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

    public static TipoEventoEnum getEnumPeloCodigo(String string) {
        for (TipoEventoEnum e : TipoEventoEnum.values()) {
            if (!e.getCodigo().equals(string)) continue;
            return e;
        }
        return null;
    }

    static {
    }
}

