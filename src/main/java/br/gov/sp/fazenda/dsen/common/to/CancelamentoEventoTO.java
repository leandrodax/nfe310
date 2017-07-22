/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;

public class CancelamentoEventoTO
extends EventoTO {
    public String xJustificatica;

    public String getxJustificativa() {
        return this.xJustificatica;
    }

    public void setxJustificatica(String xJustificatica) {
        this.xJustificatica = xJustificatica;
    }

    public String getResultadoEnvio() {
        Boolean sucesso = this.sucessoOperacao();
        if (sucesso == null) {
            return DSENMessageConstants.CANCELAMENTO_NAO_FOI_ENVIADA;
        }
        if (!sucesso.booleanValue()) {
            return this.getErrorsString();
        }
        return this.getMessagesString();
    }
}

