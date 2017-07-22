/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class DpecNotaFiscalTO
extends BaseTO {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public String getChaveAcesso() {
        return this.a;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.a = chaveAcesso;
    }

    public String getDocumentoDestinatario() {
        return this.b;
    }

    public void setDocumentoDestinatario(String documentoDestinatario) {
        this.b = documentoDestinatario;
    }

    public String getUfDestinatario() {
        return this.c;
    }

    public void setUfDestinatario(String ufDestinatario) {
        this.c = ufDestinatario;
    }

    public String getValorICMS() {
        return this.e;
    }

    public void setValorICMS(String valorICMS) {
        this.e = valorICMS;
    }

    public String getValorICMSST() {
        return this.f;
    }

    public void setValorICMSST(String valorICMSST) {
        this.f = valorICMSST;
    }

    public String getValorTotal() {
        return this.d;
    }

    public void setValorTotal(String valorTotal) {
        this.d = valorTotal;
    }
}

