/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO$DpecStatus
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;

public class DpecTO
extends BaseTO {
    private static final long a = 5741986417022760690L;
    private String a;
    private String b;
    private int a;
    private Date a;
    private String c;
    private String d;
    private String e;
    private List<DpecNotaFiscalTO> a;
    private String f;
    private Date b;
    private String g;
    private String h;
    private String i;
    private DpecStatus a;
    private Icon a;
    private String j;
    private String k;

    public String getCnpjEmitente() {
        return this.c;
    }

    public void setCnpjEmitente(String cnpjEmitente) {
        this.c = cnpjEmitente;
    }

    public String getConteudoArquivo() {
        return this.i;
    }

    public void setConteudoArquivo(String conteudoArquivo) {
        this.i = conteudoArquivo;
    }

    public Date getDataGeracao() {
        return this.a;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.a = dataGeracao;
    }

    public String getIeEmitente() {
        return this.d;
    }

    public void setIeEmitente(String ieEmitente) {
        this.d = ieEmitente;
    }

    public List<DpecNotaFiscalTO> getListaDpecNotaFiscal() {
        return this.a;
    }

    public void setListaDpecNotaFiscal(List<DpecNotaFiscalTO> listaDpecNotaFiscal) {
        this.a = listaDpecNotaFiscal;
    }

    public String getNomeArquivo() {
        return this.b;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.b = nomeArquivo;
    }

    public String getPathArquivo() {
        return this.a;
    }

    public void setPathArquivo(String pathArquivo) {
        this.a = pathArquivo;
    }

    public int getQuantidadeNotas() {
        return this.a;
    }

    public void setQuantidadeNotas(int quantidadeNotas) {
        this.a = quantidadeNotas;
    }

    public String getUfEmitente() {
        return this.e;
    }

    public void setUfEmitente(String ufEmitente) {
        this.e = ufEmitente;
    }

    public String getCodigoStatus() {
        return this.g;
    }

    public void setCodigoStatus(String codigoStatus) {
        this.g = codigoStatus;
    }

    public Date getDataRegistro() {
        return this.b;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.b = dataRegistro;
    }

    public String getMotivo() {
        return this.h;
    }

    public void setMotivo(String motivo) {
        this.h = motivo;
    }

    public String getNumeroRegistro() {
        return this.f;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.f = numeroRegistro;
    }

    public DpecStatus getDpecStatus() {
        return this.a;
    }

    public void setDpecStatus(DpecStatus dpecStatus) {
        this.a = dpecStatus;
    }

    public String toString() {
        return "nome[" + this.b + "]path[" + this.a + "]dataGeracao[" + this.a + "]quantidadeNotas[" + this.a + "]";
    }

    public Icon getIcon() {
        return this.a;
    }

    public void setIcon(Icon icon) {
        this.a = icon;
    }

    public String getDataHoraGeracaoFormatada() {
        if (this.getDataGeracao() != null) {
            return DateHelper.formataDataHora((Date)this.getDataGeracao(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT);
        }
        return "";
    }

    public String getDataHoraRegistroFormatada() {
        if (this.getDataRegistro() != null) {
            return DateHelper.formataDataHora((Date)this.getDataRegistro(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT);
        }
        return "";
    }

    public String getCodigoStatusProcessamento() {
        return this.j;
    }

    public void setCodigoStatusProcessamento(String codigoStatusProcessamento) {
        this.j = codigoStatusProcessamento;
    }

    public String getMotivoProcessamento() {
        return this.k;
    }

    public void setMotivoProcessamento(String motivoProcessamento) {
        this.k = motivoProcessamento;
    }
}

