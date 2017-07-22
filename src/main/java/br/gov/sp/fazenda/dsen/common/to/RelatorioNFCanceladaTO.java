/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFCanceladaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;

public class RelatorioNFCanceladaTO
extends RelatorioNotaFiscalTO {
    private static final long a = 6963145965039720223L;
    private String a;
    private String b;
    private String c;

    public String getMotivoCancelamento() {
        return this.a;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.a = motivoCancelamento;
    }

    public String getDataCancelamento() {
        return this.b;
    }

    public void setDataCancelamento(String dataCancelamento) {
        this.b = dataCancelamento;
    }

    public String getProtocoloCancelamento() {
        return this.c;
    }

    public void setProtocoloCancelamento(String protocoloCancelamento) {
        this.c = protocoloCancelamento;
    }
}

