/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Date;

public class CertificadoInfoTO
extends BaseTO {
    private static final long a = -4608746688052351787L;
    private Integer a;
    private String a;
    private String b;
    private EmitenteTO a;
    private String c;
    private Date a;
    private String d;
    private String e;
    private String f;
    private Date b;

    public Integer getIdCertificadoInfo() {
        return this.a;
    }

    public void setIdCertificadoInfo(Integer theIdCertificadoInfo) {
        this.a = theIdCertificadoInfo;
    }

    public String getAutoridadeCertificadora() {
        return this.a;
    }

    public void setAutoridadeCertificadora(String theAutoridadeCertificadora) {
        this.a = theAutoridadeCertificadora;
    }

    public String getCnpj() {
        return this.b;
    }

    public void setCnpj(String theCnpj) {
        this.b = theCnpj;
    }

    public EmitenteTO getEmitenteTO() {
        return this.a;
    }

    public void setEmitenteTO(EmitenteTO theEmitenteTO) {
        this.a = theEmitenteTO;
    }

    public String getTipoCertificado() {
        return this.c;
    }

    public void setTipoCertificado(String theTipoCertificado) {
        this.c = theTipoCertificado;
    }

    public Date getDataUtilizacao() {
        return this.a;
    }

    public void setDataUtilizacao(Date theDataUtilizacao) {
        this.a = theDataUtilizacao;
    }

    public String getCaminho() {
        return this.d;
    }

    public void setCaminho(String theCaminho) {
        this.d = theCaminho;
    }

    public String getAlias() {
        return this.e;
    }

    public void setAlias(String theAlias) {
        this.e = theAlias;
    }

    public String getNome() {
        return this.f;
    }

    public void setNome(String nome) {
        this.f = nome;
    }

    public Date getDataValidade() {
        return this.b;
    }

    public void setDataValidade(Date theDataValidade) {
        this.b = theDataValidade;
    }

    public String toString() {
        return this.e;
    }
}

