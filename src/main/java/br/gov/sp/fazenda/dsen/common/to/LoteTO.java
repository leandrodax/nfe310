/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Date;

public class LoteTO
extends BaseTO {
    private static final long a = 1412431853486156931L;
    private Long a;
    private String a;
    private Date a;
    private String b;
    private String c;
    private Date b;
    private String d;

    public String getCnpjTransmissao() {
        return this.a;
    }

    public void setCnpjTransmissao(String cnpjTransmissao) {
        this.a = cnpjTransmissao;
    }

    public String getCodigoRetorno() {
        return this.d;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.d = codigoRetorno;
    }

    public Date getDataProcessamento() {
        return this.b;
    }

    public void setDataProcessamento(Date dataProcessamento) {
        this.b = dataProcessamento;
    }

    public Date getDataTransmissao() {
        return this.a;
    }

    public void setDataTransmissao(Date dataTransmissao) {
        this.a = dataTransmissao;
    }

    public Long getIdLote() {
        return this.a;
    }

    public void setIdLote(Long idLote) {
        this.a = idLote;
    }

    public String getNumRecibo() {
        return this.b;
    }

    public void setNumRecibo(String numeroRecibo) {
        this.b = numeroRecibo;
    }

    public String getXmlRetornoString() {
        return this.c;
    }

    public void setXmlRetornoString(String xmlRetorno) {
        this.c = xmlRetorno;
    }
}

