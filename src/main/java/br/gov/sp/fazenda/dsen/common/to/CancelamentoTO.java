/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import java.util.Date;

public class CancelamentoTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = -7514212057855790272L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f = null;
    private String g;
    private Long a;
    private Date a;

    public String getNumeroProtocolo() {
        return this.a;
    }

    public void setNumeroProtocolo(String theNumeroProtocolo) {
        this.a = theNumeroProtocolo;
    }

    public String getJustificativa() {
        return this.d;
    }

    public void setJustificativa(String theJustificativa) {
        this.d = theJustificativa;
    }

    public String getProtocoloString() {
        return this.f;
    }

    public void setProtocoloString(String theProtocolo) {
        this.f = theProtocolo;
    }

    public void setDocXmlString(String docXmlString) {
        this.e = docXmlString;
    }

    public String getDocXmlString() {
        return this.e;
    }

    public void setVersao(String versao) {
        this.g = versao;
    }

    public String getVersao() {
        return this.g;
    }

    public Date getDataProtocolo() {
        return this.a;
    }

    public void setDataProtocolo(Date theDataProtocolo) {
        this.a = theDataProtocolo;
    }

    public void setCodigoErro(String codigoErro) {
        this.b = codigoErro;
    }

    public String getCodigoErro() {
        return this.b;
    }

    public void setMensagemErro(String mensagemErro) {
        this.c = mensagemErro;
    }

    public String getMensagemErro() {
        return this.c;
    }

    public Long getIdNotaFiscal() {
        return this.a;
    }

    public void setIdNotaFiscal(Long id) {
        this.a = id;
    }

    public String getNomeRegistro() {
        return null;
    }
}

