/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEChaveAcessoUtil
 */
package br.gov.sp.fazenda.dsge.common.to;

import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEChaveAcessoUtil;
import java.io.Serializable;

public class ChaveAcessoTO
extends BaseTO
implements Serializable {
    private static final long a = -5511659156497309444L;
    private String a;
    private TipoDocumentoEnum a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    public void setAno(String ano) {
        this.a = ano;
    }

    public void setCDv(String dv) {
        this.d = dv;
    }

    public void setCNf(String nf) {
        this.c = nf;
    }

    public void setNrDocumento(String nrDocumento) {
        this.b = nrDocumento;
    }

    public void setMes(String mes) {
        this.e = mes;
    }

    public void setModelo(String modelo) {
        this.f = modelo;
    }

    public void setNNf(String nf) {
        this.g = nf;
    }

    public void setSerie(String serie) {
        this.h = serie;
    }

    public void setUfEmit(String ufEmit) {
        this.i = ufEmit;
    }

    public String getAno() {
        return this.a;
    }

    public String getCDv() {
        return this.d;
    }

    public String getCNf() {
        return this.c;
    }

    public String getNrDocumento() {
        return this.b;
    }

    public String getMes() {
        return this.e;
    }

    public String getModelo() {
        return this.f;
    }

    public String getNNf() {
        return this.g;
    }

    public String getSerie() {
        return this.h;
    }

    public String getUfEmit() {
        return this.i;
    }

    public String getChaveAcessoNotaFiscal() {
        return DSGEChaveAcessoUtil.gerarChaveAcesso((ChaveAcessoTO)this);
    }

    public TipoDocumentoEnum getTpDocumentoEnum() {
        return this.a;
    }

    public void setTpDocumentoEnum(TipoDocumentoEnum tpDocumentoEnum) {
        this.a = tpDocumentoEnum;
    }
}

