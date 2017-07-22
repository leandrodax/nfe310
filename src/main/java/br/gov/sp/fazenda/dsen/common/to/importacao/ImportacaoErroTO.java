/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 */
package br.gov.sp.fazenda.dsen.common.to.importacao;

import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;

public class ImportacaoErroTO {
    private String a;
    private String b;
    private Status a;

    public ImportacaoErroTO(String campo, String mensagem, Status status) {
        this.setCampo(campo);
        this.setMensagem(mensagem);
        this.setStatus(status);
    }

    public String getCampo() {
        return this.a;
    }

    public void setCampo(String campo) {
        this.a = campo;
    }

    public String getMensagem() {
        return this.b;
    }

    public void setMensagem(String mensagem) {
        this.b = mensagem;
    }

    public void setStatus(Status status) {
        this.a = status;
    }

    public Status getStatus() {
        return this.a;
    }

    public String toString() {
        return "campo[" + this.a + "] mensagem[" + this.b + "] status[" + (Object)this.a + "]";
    }
}

