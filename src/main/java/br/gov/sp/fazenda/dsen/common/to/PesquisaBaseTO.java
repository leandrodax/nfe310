/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Map;

public abstract class PesquisaBaseTO
extends BaseTO {
    private EmitenteTO a;
    private TelaPesquisaEnum a;
    private Map a;

    public abstract Map getPesquisaEnumerationMap();

    public EmitenteTO getIdEmitente() {
        return this.a;
    }

    public void setIdEmitente(EmitenteTO idEmitente) {
        this.a = idEmitente;
    }

    public Map getIdPesquisa() {
        return this.a;
    }

    public void setIdPesquisa(Map idPesquisa) {
        this.a = idPesquisa;
    }

    public TelaPesquisaEnum getTelaPesquisaEnum() {
        return this.a;
    }

    public void setTelaPesquisaEnum(TelaPesquisaEnum telaPesquisaEnum) {
        this.a = telaPesquisaEnum;
    }
}

