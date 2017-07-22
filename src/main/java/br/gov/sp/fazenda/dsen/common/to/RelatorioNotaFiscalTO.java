/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.List;

public class RelatorioNotaFiscalTO
extends BaseTO {
    private static final long a = 495690063715489688L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private SituacaoNFeEnum a;
    private List<RelatorioNotaFiscalTO> a;
    private List<RelatorioNotaFiscalTO> b;
    private List<RelatorioNotaFiscalTO> c;
    private List<RelatorioNotaFiscalTO> d;
    private List<RelatorioNotaFiscalTO> e;
    private List<RelatorioNotaFiscalTO> f;
    private List<RelatorioNotaFiscalTO> g;
    private List<RelatorioNotaFiscalTO> h;
    private List<RelatorioNotaFiscalTO> i;
    private List<RelatorioNotaFiscalTO> j;

    public static long getSerialVersionUID() {
        return 495690063715489688L;
    }

    public String getNumero() {
        return this.a;
    }

    public void setNumero(String numero) {
        this.a = numero;
    }

    public String getSerie() {
        return this.b;
    }

    public void setSerie(String serie) {
        this.b = serie;
    }

    public String getAno() {
        return this.c;
    }

    public void setAno(String ano) {
        this.c = ano;
    }

    public String getMes() {
        return this.d;
    }

    public void setMes(String mes) {
        this.d = mes;
    }

    public String getDataEmissao() {
        return this.e;
    }

    public void setDataEmissao(String dataEmissao) {
        this.e = dataEmissao;
    }

    public String getEntradaSaida() {
        return this.f;
    }

    public void setEntradaSaida(String entradaSaida) {
        this.f = entradaSaida;
    }

    public String getTipoNfe() {
        return this.g;
    }

    public void setTipoNfe(String tipoNfe) {
        this.g = tipoNfe;
    }

    public List<RelatorioNotaFiscalTO> getAutorizadas() {
        return this.a;
    }

    public void setAutorizadas(List<RelatorioNotaFiscalTO> autorizadas) {
        this.a = autorizadas;
    }

    public List<RelatorioNotaFiscalTO> getCanceladas() {
        return this.b;
    }

    public void setCanceladas(List<RelatorioNotaFiscalTO> canceladas) {
        this.b = canceladas;
    }

    public List<RelatorioNotaFiscalTO> getDenegadas() {
        return this.c;
    }

    public void setDenegadas(List<RelatorioNotaFiscalTO> denegadas) {
        this.c = denegadas;
    }

    public List<RelatorioNotaFiscalTO> getRejeitadas() {
        return this.d;
    }

    public void setRejeitadas(List<RelatorioNotaFiscalTO> rejeitadas) {
        this.d = rejeitadas;
    }

    public List<RelatorioNotaFiscalTO> getEmProcessamentoSefaz() {
        return this.e;
    }

    public void setEmProcessamentoSefaz(List<RelatorioNotaFiscalTO> emProcessamentoSefaz) {
        this.e = emProcessamentoSefaz;
    }

    public List<RelatorioNotaFiscalTO> getTransmitidaPendencia() {
        return this.f;
    }

    public void setTransmitidaPendencia(List<RelatorioNotaFiscalTO> transmitidaPendencia) {
        this.f = transmitidaPendencia;
    }

    public List<RelatorioNotaFiscalTO> getValidada() {
        return this.g;
    }

    public void setValidada(List<RelatorioNotaFiscalTO> validada) {
        this.g = validada;
    }

    public List<RelatorioNotaFiscalTO> getAssinada() {
        return this.h;
    }

    public void setAssinada(List<RelatorioNotaFiscalTO> assinada) {
        this.h = assinada;
    }

    public List<RelatorioNotaFiscalTO> getEmDigitacao() {
        return this.i;
    }

    public void setEmDigitacao(List<RelatorioNotaFiscalTO> emDigitacao) {
        this.i = emDigitacao;
    }

    public List<RelatorioNotaFiscalTO> getInutilizacao() {
        return this.j;
    }

    public void setInutilizacao(List<RelatorioNotaFiscalTO> inutilizacao) {
        this.j = inutilizacao;
    }

    public SituacaoNFeEnum getSituacaoNfe() {
        return this.a;
    }

    public void setSituacaoNfe(SituacaoNFeEnum situacaoNfe) {
        this.a = situacaoNfe;
    }
}

