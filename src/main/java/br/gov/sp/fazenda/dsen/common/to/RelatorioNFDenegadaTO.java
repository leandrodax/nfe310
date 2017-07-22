/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFDenegadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;

public class RelatorioNFDenegadaTO
extends RelatorioNotaFiscalTO {
    private static final long a = 2438574204585573010L;
    private String a;
    private String b;
    private String c;

    public String getMotivoDenegacao() {
        return this.a;
    }

    public void setMotivoDenegacao(String motivoDenegacao) {
        this.a = motivoDenegacao;
    }

    public String getDataDenegacao() {
        return this.b;
    }

    public void setDataDenegacao(String dataDenegacao) {
        this.b = dataDenegacao;
    }

    public String getProtocoloDenegacao() {
        return this.c;
    }

    public void setProtocoloDenegacao(String protocoloDenegacao) {
        this.c = protocoloDenegacao;
    }
}

