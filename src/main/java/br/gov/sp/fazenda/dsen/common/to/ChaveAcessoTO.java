/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class ChaveAcessoTO
extends BaseTO {
    private static final long a = -7000250973512138769L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;

    public String getAno() {
        return this.a;
    }

    public void setAno(String theAno) {
        this.a = theAno;
    }

    public String getDigito() {
        return this.b;
    }

    public void setDigito(String theDigito) {
        this.b = theDigito;
    }

    public String getMes() {
        return this.c;
    }

    public void setMes(String theMes) {
        this.c = theMes;
    }

    public String getCnpjEmitente() {
        return this.d;
    }

    public void setCnpjEmitente(String theCnpjEmitente) {
        this.d = theCnpjEmitente;
    }

    public String getModelo() {
        return this.e;
    }

    public void setModelo(String theModelo) {
        this.e = theModelo;
    }

    public String getSerie() {
        return this.f;
    }

    public void setSerie(String theSerie) {
        this.f = theSerie;
    }

    public String getNumeroNFe() {
        return this.g;
    }

    public void setNumeroNFe(String theNumeroCte) {
        this.g = theNumeroCte;
    }

    public String getCodigoNumerico() {
        return this.h;
    }

    public void setCodigoNumerico(String theCodigoNumerico) {
        this.h = theCodigoNumerico;
    }

    public String getCodigoUfEmitente() {
        return this.i;
    }

    public void setCodigoUfEmitente(String theUfEmitente) {
        this.i = theUfEmitente;
    }

    public String getTipoEmissao() {
        return this.j;
    }

    public void setTipoEmissao(String tipoEmissao) {
        this.j = tipoEmissao;
    }

    public String getChaveAcesso() {
        return ChaveAcessoUtil.gerarChaveAcesso((ChaveAcessoTO)this);
    }
}

