/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DocumentoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.LoteTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Date;

public class DocumentoTO
extends BaseTO {
    private static final long a = -7144693361260851868L;
    private Long a;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Date a;
    private String f;
    private String g;
    private Date b;
    private String h;
    private EmitenteTO a;
    private LoteTO a;

    public String getAno() {
        return this.a;
    }

    public void setAno(String ano) {
        this.a = ano;
    }

    public Date getDataProtocolo() {
        return this.b;
    }

    public void setDataProtocolo(Date dataProtocolo) {
        this.b = dataProtocolo;
    }

    public Date getDataSistema() {
        return this.a;
    }

    public void setDataSistema(Date dataSistema) {
        this.a = dataSistema;
    }

    public String getDocXmlString() {
        return this.b;
    }

    public void setDocXmlString(String docXmlString) {
        this.b = docXmlString;
    }

    public EmitenteTO getEmitenteTO() {
        return this.a;
    }

    public void setEmitenteTO(EmitenteTO emitenteTO) {
        this.a = emitenteTO;
    }

    public Long getIdDocumento() {
        return this.a;
    }

    public void setIdDocumento(Long idDocumento) {
        this.a = idDocumento;
    }

    public String getModelo() {
        return this.e;
    }

    public void setModelo(String modelo) {
        this.e = modelo;
    }

    public String getNumeroProtocolo() {
        return this.f;
    }

    public void setNumeroProtocolo(String protocolo) {
        this.f = protocolo;
    }

    public String getProtocoloString() {
        return this.d;
    }

    public void setProtocoloString(String protocoloString) {
        this.d = protocoloString;
    }

    public String getSerie() {
        return this.c;
    }

    public void setSerie(String serie) {
        this.c = serie;
    }

    public String getVersao() {
        return this.g;
    }

    public void setVersao(String versao) {
        this.g = versao;
    }

    public String getCodigoUfEmitente() {
        return this.h;
    }

    public void setCodigoUfEmitente(String cUf) {
        this.h = cUf;
    }

    public LoteTO getLoteTO() {
        return this.a;
    }

    public void setLoteTO(LoteTO loteTO) {
        this.a = loteTO;
    }
}

