/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFInutilizadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;

public class RelatorioNFInutilizadaTO
extends RelatorioNotaFiscalTO {
    private static final long a = -56416189967064497L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getMotivoInutilizacao() {
        return this.a;
    }

    public void setMotivoInutilizacao(String motivoInutilizacao) {
        this.a = motivoInutilizacao;
    }

    public String getFaixaInicial() {
        return this.b;
    }

    public void setFaixaInicial(String faixaInicial) {
        this.b = faixaInicial;
    }

    public String getFaixaFinal() {
        return this.c;
    }

    public void setFaixaFinal(String faixaFinal) {
        this.c = faixaFinal;
    }

    public String getDataInutilizacao() {
        return this.d;
    }

    public void setDataInutilizacao(String dataInutilizacao) {
        this.d = dataInutilizacao;
    }

    public String getProtocoloInutilizacao() {
        return this.e;
    }

    public void setProtocoloInutilizacao(String protocoloInutilizacao) {
        this.e = protocoloInutilizacao;
    }
}

