/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
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

public class ClienteTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = -7795633217624363374L;
    private String a;
    private String b;
    private String c;
    private String d;
    private Integer a;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private TipoDocumentoEnum a;
    private EmitenteTO a;
    private String p;
    private String q;

    public String getCep() {
        return this.a;
    }

    public String getCMun() {
        return this.b;
    }

    public String getCPais() {
        return this.c;
    }

    public String getFone() {
        return this.d;
    }

    public Integer getIdCliente() {
        return this.a;
    }

    public String getIe() {
        return this.e;
    }

    public String getIeFormatada() {
        return DSGEDocumentoHelper.formatarIE((String)this.getIe(), (String)this.getUf());
    }

    public String getIesuf() {
        return this.f;
    }

    public String getIsuf() {
        return this.f;
    }

    public String getNrDocumento() {
        return this.g;
    }

    public String getNro() {
        return this.h;
    }

    public String getUf() {
        return this.i;
    }

    public String getXBairro() {
        return this.j;
    }

    public String getXCpl() {
        return this.k;
    }

    public String getXLgr() {
        return this.l;
    }

    public String getXMun() {
        return this.m;
    }

    public String getXNome() {
        return this.n;
    }

    public String getXPais() {
        return this.o;
    }

    public void setCep(String newVal) {
        this.a = newVal;
    }

    public void setCMun(String newVal) {
        this.b = newVal;
    }

    public void setCPais(String newVal) {
        this.c = newVal;
    }

    public void setFone(String newVal) {
        this.d = newVal;
    }

    public void setIdCliente(Integer newVal) {
        this.a = newVal;
    }

    public void setIe(String newVal) {
        this.e = newVal;
    }

    public void setIesuf(String newVal) {
        this.f = newVal;
    }

    public void setIsuf(String newVal) {
        this.f = newVal;
    }

    public void setNrDocumento(String newVal) {
        this.g = newVal;
    }

    public void setNro(String newVal) {
        this.h = newVal;
    }

    public void setUf(String newVal) {
        this.i = newVal;
    }

    public void setXBairro(String newVal) {
        this.j = newVal;
    }

    public void setXCpl(String newVal) {
        this.k = newVal;
    }

    public void setXLgr(String newVal) {
        this.l = newVal;
    }

    public void setXMun(String newVal) {
        this.m = newVal;
    }

    public void setXNome(String newVal) {
        this.n = newVal;
    }

    public void setXPais(String newVal) {
        this.o = newVal;
    }

    public EmitenteTO getEmitente() {
        return this.a;
    }

    public void setEmitente(EmitenteTO emitente) {
        this.a = emitente;
    }

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

    public String getVersao() {
        return this.p;
    }

    public void setVersao(String versao) {
        this.p = versao;
    }

    public String getNomeRegistro() {
        return "E";
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if (obj != null && obj instanceof ClienteTO) {
            ClienteTO clienteTO = (ClienteTO)obj;
            if (this.getIdCliente() != null && this.getIdCliente().equals(clienteTO.getIdCliente())) {
                equals = true;
            }
        }
        return equals;
    }

    public String getEmail() {
        return this.q;
    }

    public void setEmail(String email) {
        this.q = email;
    }
}

