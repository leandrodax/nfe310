/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CartaCorrecaoTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;

public class CartaCorrecaoTO
extends EventoTO {
    public String xCorrecao;

    public String getxCorrecao() {
        return this.xCorrecao;
    }

    public void setxCorrecao(String xCorrecao) {
        this.xCorrecao = xCorrecao;
    }

    public String getResultadoEnvio() {
        Boolean sucesso = this.sucessoOperacao();
        if (sucesso == null) {
            return DSENMessageConstants.CARTA_CORRECAO_NAO_FOI_ENVIADA;
        }
        if (!sucesso.booleanValue()) {
            return this.getErrorsString();
        }
        return this.getMessagesString();
    }
}

