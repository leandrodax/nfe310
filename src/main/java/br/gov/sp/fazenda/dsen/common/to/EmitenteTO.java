/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;

public class EmitenteTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = -4969250415518053933L;
    private Integer a;
    private TipoDocumentoEnum a;
    private String a;
    private String b;
    private String c;
    private String d;
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
    private String p;
    private String q;
    private String r;
    private byte[] a;
    private RegimeTributarioEnum a;
    private String s;
    private Boolean a;

    public String getCep() {
        return this.k;
    }

    public void setCep(String cep) {
        this.k = cep;
    }

    public String getCMun() {
        return this.h;
    }

    public void setCMun(String mun) {
        this.h = mun;
    }

    public String getCnae() {
        return this.r;
    }

    public void setCnae(String cnae) {
        this.r = cnae;
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

    public String getNrDocumento() {
        return this.a;
    }

    public void setNrDocumento(String nrDocumento) {
        this.a = nrDocumento;
    }

    public String getCPais() {
        return this.l;
    }

    public void setCPais(String pais) {
        this.l = pais;
    }

    public String getFone() {
        return this.n;
    }

    public void setFone(String fone) {
        this.n = fone;
    }

    public Integer getIdEmitente() {
        return this.a;
    }

    public void setIdEmitente(Integer idEmitente) {
        this.a = idEmitente;
    }

    public String getIe() {
        return this.o;
    }

    public void setIe(String ie) {
        this.o = ie;
    }

    public String getIeFormatada() {
        return DSGEDocumentoHelper.formatarIE((String)this.getIe(), (String)this.getUf());
    }

    public String getIest() {
        return this.p;
    }

    public void setIest(String iest) {
        this.p = iest;
    }

    public String getIm() {
        return this.q;
    }

    public void setIm(String im) {
        this.q = im;
    }

    public byte[] getLogotipo() {
        return this.a;
    }

    public void setLogotipo(byte[] logotipo) {
        this.a = logotipo;
    }

    public String getNro() {
        return this.e;
    }

    public void setNro(String nro) {
        this.e = nro;
    }

    public String getUf() {
        return this.j;
    }

    public void setUf(String uf) {
        this.j = uf;
    }

    public String getXBairro() {
        return this.g;
    }

    public void setXBairro(String bairro) {
        this.g = bairro;
    }

    public String getXCpl() {
        return this.f;
    }

    public void setXCpl(String cpl) {
        this.f = cpl;
    }

    public String getXFant() {
        return this.c;
    }

    public void setXFant(String fant) {
        this.c = fant;
    }

    public String getXLgr() {
        return this.d;
    }

    public void setXLgr(String lgr) {
        this.d = lgr;
    }

    public String getXMun() {
        return this.i;
    }

    public void setXMun(String mun) {
        this.i = mun;
    }

    public String getXNome() {
        return this.b;
    }

    public void setXNome(String nome) {
        this.b = nome;
    }

    public String getXPais() {
        return this.m;
    }

    public void setXPais(String pais) {
        this.m = pais;
    }

    public Boolean getSobrescrever() {
        return this.a;
    }

    public void setSobrescrever(Boolean sobrescrever) {
        this.a = sobrescrever;
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if (obj != null && obj instanceof EmitenteTO) {
            EmitenteTO emitenteTO = (EmitenteTO)obj;
            if (this.getIdEmitente() != null && this.getIdEmitente().equals(emitenteTO.getIdEmitente())) {
                equals = true;
            }
        }
        return equals;
    }

    public String getNomeRegistro() {
        return "C";
    }

    public String getVersao() {
        return this.s;
    }

    public void setVersao(String versao) {
        this.s = versao;
    }

    public RegimeTributarioEnum getRegimeTributarioEnum() {
        return this.a;
    }

    public void setRegimeTributarioEnum(RegimeTributarioEnum regimeTributarioEnum) {
        this.a = regimeTributarioEnum;
    }

    public void setCRT(String crt) {
        this.a = RegimeTributarioEnum.getEnumPeloCodigo((String)crt);
    }

    public String getCRT() {
        return this.a == null ? null : this.a.getCodigo();
    }
}

