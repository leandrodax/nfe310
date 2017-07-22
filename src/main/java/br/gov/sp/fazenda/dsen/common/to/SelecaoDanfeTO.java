/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormatoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ImpressaoDanfeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.FormatoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ImpressaoDanfeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Map;
import java.util.TreeMap;

public class SelecaoDanfeTO
extends BaseTO {
    private static final long a = 9020002211617852198L;
    private TelaPesquisaEnum a;
    private FormatoImpressaoEnum a;
    private TipoPapelImpressaoEnum a;
    private Boolean a;
    private EmitenteTO a;
    private Map<Integer, Integer> a;

    public Map<ImpressaoDanfeEnum, String> getSelecaoEnumerationMap() {
        TreeMap<ImpressaoDanfeEnum, String> map = new TreeMap<ImpressaoDanfeEnum, String>();
        map.put(ImpressaoDanfeEnum.CHK_FORMATO_IMPRESSAO, (this.getFormatoImpressaoEnum() == null ? null : "" + this.getFormatoImpressaoEnum().ordinal() + ""));
        map.put(ImpressaoDanfeEnum.CHK_FORMULARIO_PRE_IMPRESSO, (this.getPreImpresso() == null ? null : this.getPreImpresso().toString()));
        map.put(ImpressaoDanfeEnum.CHK_TIPO_PAPEL, (this.getTipoPapelEnum() == null ? null : this.getTipoPapelEnum().getCodigo()));
        return map;
    }

    public FormatoImpressaoEnum getFormatoImpressaoEnum() {
        return this.a;
    }

    public void setFormatoImpressaoEnum(FormatoImpressaoEnum formatoImpressaoEnum) {
        this.a = formatoImpressaoEnum;
    }

    public Boolean getPreImpresso() {
        return this.a;
    }

    public void setPreImpresso(Boolean formularioPreImpresso) {
        this.a = formularioPreImpresso;
    }

    public EmitenteTO getIdEmitente() {
        return this.a;
    }

    public void setIdEmitente(EmitenteTO idEmitente) {
        this.a = idEmitente;
    }

    public Map<Integer, Integer> getIdSelecaoDanfe() {
        return this.a;
    }

    public void setIdSelecaoDanfe(Map<Integer, Integer> idSelecaoDanfe) {
        this.a = idSelecaoDanfe;
    }

    public TelaPesquisaEnum getTelaPesquisaEnum() {
        return this.a;
    }

    public void setTelaPesquisaEnum(TelaPesquisaEnum telaPesquisaEnum) {
        this.a = telaPesquisaEnum;
    }

    public void setTipoPapelEnum(TipoPapelImpressaoEnum tipoPapelEnum) {
        this.a = tipoPapelEnum;
    }

    public TipoPapelImpressaoEnum getTipoPapelEnum() {
        return this.a;
    }
}

