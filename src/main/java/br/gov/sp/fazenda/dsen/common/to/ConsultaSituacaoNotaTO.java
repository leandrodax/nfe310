/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaSituacaoNotaTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Calendar;

public class ConsultaSituacaoNotaTO
extends BaseTO {
    private String a;
    private String b;
    private String c;
    private String d;
    private Calendar a;
    private String e;
    private String f;
    private String g;

    public String getCStat() {
        return this.a;
    }

    public String getCUF() {
        return this.c;
    }

    public String getChNFe() {
        return this.d;
    }

    public Calendar getDhRecbto() {
        return this.a;
    }

    public String getDigVal() {
        return this.f;
    }

    public String getNProt() {
        return this.e;
    }

    public String getXMotivo() {
        return this.b;
    }

    public void setCStat(String cStat) {
        this.a = cStat;
    }

    public void setCUF(String cUF) {
        this.c = cUF;
    }

    public void setChNFe(String chNFe) {
        this.d = chNFe;
    }

    public void setDhRecbto(Calendar dhRecbto) {
        this.a = dhRecbto;
    }

    public void setDigVal(String digVal) {
        this.f = digVal;
    }

    public void setNProt(String nProt) {
        this.e = nProt;
    }

    public String getXmlProt() {
        return this.g;
    }

    public void setXmlProt(String xmlProt) {
        this.g = xmlProt;
    }

    public void setXMotivo(String xMotivo) {
        this.b = xMotivo;
    }
}

