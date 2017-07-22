/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$DocumentoConsultaEnum
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$TipoConsultaEnum
 *  br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.EstabelecimentoTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.util.Date;
import java.util.List;

public class ConsultaCadastroTO
extends BaseTO {
    private static final long a = -7970961592702981806L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Date a;
    private String g;
    private String h;
    private String i;
    private DocumentoConsultaEnum a;
    private TipoConsultaEnum a;
    private List<EstabelecimentoTO> a;

    public DocumentoConsultaEnum getDocumentoConsulta() {
        return this.a;
    }

    public void setDocumentoConsulta(DocumentoConsultaEnum documentoConsulta) {
        this.a = documentoConsulta;
    }

    public TipoConsultaEnum getTipoConsultaEnum() {
        return this.a;
    }

    public void setTipoConsultaEnum(TipoConsultaEnum tp) {
        this.a = tp;
    }

    public String getCNPJ() {
        return this.d;
    }

    public void setCNPJ(String cnpj) {
        this.d = cnpj;
    }

    public String getCPF() {
        return this.e;
    }

    public void setCPF(String cpf) {
        this.e = cpf;
    }

    public String getNrDocumento() {
        if (!StringHelper.isBlankOrNull((Object)this.getCNPJ())) {
            return this.getCNPJ();
        }
        return this.getCPF();
    }

    public String getCStat() {
        return this.a;
    }

    public void setCStat(String stat) {
        this.a = stat;
    }

    public String getCUF() {
        return this.g;
    }

    public void setCUF(String cuf) {
        this.g = cuf;
    }

    public Date getDhCons() {
        return this.a;
    }

    public void setDhCons(Date dhCons) {
        this.a = dhCons;
    }

    public String getIE() {
        return this.f;
    }

    public String getIEFormatada() {
        String s = DSGEDocumentoHelper.formatarIE((String)this.getIE(), (String)this.getUf());
        if (s != null) {
            return s;
        }
        return "";
    }

    public void setIE(String ie) {
        this.f = ie;
    }

    public List<EstabelecimentoTO> getListaEstabelecimentoTO() {
        return this.a;
    }

    public void setListaEstabelecimentoTO(List<EstabelecimentoTO> listaEstabelecimentoTO) {
        this.a = listaEstabelecimentoTO;
    }

    public String getVerAplic() {
        return this.c;
    }

    public void setVerAplic(String verAplic) {
        this.c = verAplic;
    }

    public String getXMotivo() {
        return this.b;
    }

    public void setXMotivo(String motivo) {
        this.b = motivo;
    }

    public String getIeSuframa() {
        return this.h;
    }

    public String getIeSuframaFormatada() {
        String s = DSGEDocumentoHelper.formatarIE((String)this.getIeSuframa(), (String)"SU");
        if (s != null) {
            return s;
        }
        return "";
    }

    public void setIeSuframa(String ieSuframa) {
        this.h = ieSuframa;
    }

    public String getUf() {
        return this.i;
    }

    public void setUf(String uf) {
        this.i = uf;
    }
}

