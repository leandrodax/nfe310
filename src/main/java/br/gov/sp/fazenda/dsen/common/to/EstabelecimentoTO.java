/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndCredCTeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndCredNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.IndCredCTeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndCredNFeEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.util.Date;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EstabelecimentoTO
extends BaseTO {
    private static final long a = 8445049982945501845L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private Date a;
    private Date b;
    private Date c;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private IndCredCTeEnum a;
    private IndCredNFeEnum a;
    public static String SITUACAO_NAO_HABILITADO = "N\u00e3o Habilitado";
    public static String SITUACAO_HABILITADO = "Habilitado";

    public String getCEP() {
        return this.r;
    }

    public void setCEP(String cep) {
        this.r = cep;
    }

    public String getCMun() {
        return this.p;
    }

    public void setCMun(String mun) {
        this.p = mun;
    }

    public String getCNAE() {
        return this.i;
    }

    public void setCNAE(String cnae) {
        this.i = cnae;
    }

    public String getCNPJ() {
        return this.b;
    }

    public void setCNPJ(String cnpj) {
        this.b = cnpj;
    }

    public String getCPF() {
        return this.c;
    }

    public void setCPF(String cpf) {
        this.c = cpf;
    }

    public String getNrDocumento() {
        if (!StringHelper.isBlankOrNull((Object)this.getCNPJ())) {
            return this.getCNPJ();
        }
        return this.getCPF();
    }

    public String getCSit() {
        return this.e;
    }

    public String getSituacao() {
        if ("1".equals(this.getCSit())) {
            return SITUACAO_HABILITADO;
        }
        if ("0".equals(this.getCSit())) {
            return SITUACAO_NAO_HABILITADO;
        }
        return null;
    }

    public void setCSit(String sit) {
        this.e = sit;
    }

    public Date getDataIniAtiv() {
        return this.a;
    }

    public void setDataIniAtiv(Date dataIniAtiv) {
        this.a = dataIniAtiv;
    }

    public Date getDBaixa() {
        return this.c;
    }

    public void setDBaixa(Date baixa) {
        this.c = baixa;
    }

    public Date getDUltSit() {
        return this.b;
    }

    public void setDUltSit(Date ultSit) {
        this.b = ultSit;
    }

    public String getIE() {
        return this.a;
    }

    public void setIE(String ie) {
        this.a = ie;
    }

    public String getIEFormatada() {
        return DSGEDocumentoHelper.formatarIE((String)this.getIE(), (String)this.getUF());
    }

    public String getIEAtual() {
        return this.k;
    }

    public String getIEAtualFormatada() {
        return DSGEDocumentoHelper.formatarIE((String)this.getIEAtual(), (String)this.getUF());
    }

    public void setIEAtual(String atual) {
        this.k = atual;
    }

    public String getIEUnica() {
        return this.j;
    }

    public String getIEUnicaFormatada() {
        return DSGEDocumentoHelper.formatarIE((String)this.getIEUnica(), (String)this.getUF());
    }

    public void setIEUnica(String unica) {
        this.j = unica;
    }

    public String getNro() {
        return this.m;
    }

    public void setNro(String nro) {
        this.m = nro;
    }

    public String getUF() {
        return this.d;
    }

    public void setUF(String uf) {
        this.d = uf;
    }

    public String getXBairro() {
        return this.o;
    }

    public void setXBairro(String bairro) {
        this.o = bairro;
    }

    public String getXCpl() {
        return this.n;
    }

    public void setXCpl(String cpl) {
        this.n = cpl;
    }

    public String getXFant() {
        return this.g;
    }

    public void setXFant(String fant) {
        this.g = fant;
    }

    public String getXLgr() {
        return this.l;
    }

    public void setXLgr(String lgr) {
        this.l = lgr;
    }

    public String getXMun() {
        return this.q;
    }

    public void setXMun(String mun) {
        this.q = mun;
    }

    public String getXNome() {
        return this.f;
    }

    public void setXNome(String nome) {
        this.f = nome;
    }

    public String getXRegApur() {
        return this.h;
    }

    public void setXRegApur(String regApur) {
        this.h = regApur;
    }

    public IndCredCTeEnum getIndCredCTe() {
        return this.a;
    }

    public void setIndCredCTe(IndCredCTeEnum indCredCTe) {
        this.a = indCredCTe;
    }

    public IndCredNFeEnum getIndCredNFe() {
        return this.a;
    }

    public void setIndCredNFe(IndCredNFeEnum indCredNFe) {
        this.a = indCredNFe;
    }
}

