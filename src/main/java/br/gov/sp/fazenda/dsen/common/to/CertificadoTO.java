/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.Date;

public class CertificadoTO
extends BaseTO {
    private static final long a = -5981173688149093641L;
    private X509Certificate a;
    private PrivateKey a;
    private Date a;
    private Date b;
    private String a;
    private String b;

    public PrivateKey getPrivateKey() {
        return this.a;
    }

    public X509Certificate getX509Certificate() {
        return this.a;
    }

    public void setPrivateKey(PrivateKey privateKey) {
        this.a = privateKey;
    }

    public void setX509Certificate(X509Certificate x509Certificate) {
        this.a = x509Certificate;
    }

    public String toString() {
        String name = "";
        if (this.a != null) {
            name = this.a.getSubjectDN().getName();
        }
        return name;
    }

    public String getAssunto() {
        return this.a;
    }

    public void setAssunto(String assunto) {
        this.a = assunto;
    }

    public Date getDataValidadeFim() {
        return this.b;
    }

    public void setDataValidadeFim(Date dataValidadeFim) {
        this.b = dataValidadeFim;
    }

    public Date getDataValidadeInicio() {
        return this.a;
    }

    public void setDataValidadeInicio(Date dataValidadeInicio) {
        this.a = dataValidadeInicio;
    }

    public String getTipoCertificado() {
        return this.b;
    }

    public void setTipoCertificado(String tpCertificado) {
        this.b = tpCertificado;
    }
}

