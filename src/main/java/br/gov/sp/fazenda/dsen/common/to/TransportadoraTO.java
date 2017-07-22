/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;

public class TransportadoraTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = 5186605329010039727L;
    private Integer a;
    private TipoDocumentoEnum a;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private EmitenteTO a;
    private String g;

    public TipoDocumentoEnum getTpDocumentoEnum() {
        return this.a;
    }

    public void setTpDocumentoEnum(TipoDocumentoEnum tpDocumentoEnum) {
        this.a = tpDocumentoEnum;
    }

    public void setTpDoc(String tpDoc) {
        this.a = TipoDocumentoEnum.getTipoDocumentoEnumByDescription((String)tpDoc);
    }

    public String getTpDoc() {
        return this.a == null ? null : this.a.toString();
    }

    public EmitenteTO getEmitente() {
        return this.a;
    }

    public void setEmitente(EmitenteTO emitente) {
        this.a = emitente;
    }

    public Integer getIdTransportadora() {
        return this.a;
    }

    public void setIdTransportadora(Integer idTransportadora) {
        this.a = idTransportadora;
    }

    public String getIe() {
        return this.c;
    }

    public void setIe(String ie) {
        this.c = ie;
    }

    public String getNrDocumento() {
        return this.a;
    }

    public void setNrDocumento(String nrDocumento) {
        this.a = nrDocumento;
    }

    public String getUf() {
        return this.e;
    }

    public void setUf(String uf) {
        this.e = uf;
    }

    public String getXMun() {
        return this.f;
    }

    public void setXMun(String mun) {
        this.f = mun;
    }

    public String getXEnder() {
        return this.d;
    }

    public void setXEnder(String ender) {
        this.d = ender;
    }

    public String getXNome() {
        return this.b;
    }

    public void setXNome(String nome) {
        this.b = nome;
    }

    public String getVersao() {
        return this.g;
    }

    public void setVersao(String versao) {
        this.g = versao;
    }

    public String getNomeRegistro() {
        return "X";
    }

    public String getIeFormatada() {
        return DSGEDocumentoHelper.formatarIE((String)this.getIe(), (String)this.getUf());
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if (obj != null && obj instanceof TransportadoraTO) {
            TransportadoraTO transportadoraTO = (TransportadoraTO)obj;
            if (this.getIdTransportadora() != null && this.getIdTransportadora().equals(transportadoraTO.getIdTransportadora())) {
                equals = true;
            }
        }
        return equals;
    }
}

