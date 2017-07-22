/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class CertificadoLoteTO
extends BaseTO {
    private static final long a = -6588486997482128617L;
    private X509Certificate a;
    private PrivateKey a;
    private String a;
    private Integer a = 0;
    private String b;

    public String getTpCertificado() {
        return this.b;
    }

    public void setTpCertificado(String tpCertificado) {
        this.b = tpCertificado;
    }

    public String getCnpjTransmissao() {
        return this.a;
    }

    public PrivateKey getPrivateKey() {
        return this.a;
    }

    public Integer getQuantidadeLote() {
        return this.a;
    }

    public X509Certificate getX509Certificate() {
        return this.a;
    }

    public void setCnpjTransmissao(String cnpjTransmissao) {
        this.a = cnpjTransmissao;
    }

    public void setPrivateKey(PrivateKey privateKey) {
        this.a = privateKey;
    }

    public void setQuantidadeLote(Integer quantidadeLote) {
        this.a = quantidadeLote;
    }

    public void setX509Certificate(X509Certificate x509Certificate) {
        this.a = x509Certificate;
    }
}

