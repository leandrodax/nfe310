/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.IpiTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.IpiTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import java.util.HashSet;
import java.util.Set;

public class ProdutoTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = 427172199418578244L;
    private String a;
    private Integer a;
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
    private EmitenteTO a;
    private Set<IcmsTO> a;
    private Set<IpiTO> b;
    private String m;

    public Set<IpiTO> getIpiTOSet() {
        return this.b;
    }

    public void setIpiTOSet(Set<IpiTO> ipiTOCollection) {
        this.b = ipiTOCollection;
    }

    public Set<IcmsTO> getIcmsTOSet() {
        return this.a;
    }

    public void setIcmsTOSet(Set<IcmsTO> icmsTOCollection) {
        this.a = icmsTOCollection;
    }

    public EmitenteTO getEmitente() {
        return this.a;
    }

    public void setEmitente(EmitenteTO emitente) {
        this.a = emitente;
    }

    public String getUTrib() {
        return this.k;
    }

    public void setUTrib(String uTrib) {
        this.k = uTrib;
    }

    public String getCEanTrib() {
        return this.j;
    }

    public void setCEanTrib(String cEanTrib) {
        this.j = cEanTrib;
    }

    public String getUCom() {
        return this.g;
    }

    public void setUCom(String uCom) {
        this.g = uCom;
    }

    public String getGenero() {
        return this.f;
    }

    public void setGenero(String genero) {
        this.f = genero;
    }

    public String getExTipi() {
        return this.e;
    }

    public void setExTipi(String exTipi) {
        this.e = exTipi;
    }

    public String getNcm() {
        return this.d;
    }

    public void setNcm(String ncm) {
        this.d = ncm;
    }

    public String getCEan() {
        return this.c;
    }

    public void setCEan(String cEan) {
        this.c = cEan;
    }

    public String getXProd() {
        return this.b;
    }

    public void setXProd(String xProd) {
        this.b = xProd;
    }

    public Integer getIdProduto() {
        return this.a;
    }

    public void setIdProduto(Integer idProduto) {
        this.a = idProduto;
    }

    public String getCProd() {
        return this.a;
    }

    public void setCProd(String cProd) {
        this.a = cProd;
    }

    public String getVUnCom() {
        return this.h;
    }

    public void setVUnCom(String unCom) {
        this.h = unCom;
    }

    public String getVUnTrib() {
        return this.i;
    }

    public void setVUnTrib(String unTrib) {
        this.i = unTrib;
    }

    public String getQTrib() {
        return this.l;
    }

    public void setQTrib(String trib) {
        this.l = trib;
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if (obj != null && obj instanceof ProdutoTO) {
            ProdutoTO produtoTO = (ProdutoTO)obj;
            if (this.getIdProduto() != null && this.getIdProduto().equals(produtoTO.getIdProduto())) {
                equals = true;
            }
        }
        return equals;
    }

    public Object clone() throws CloneNotSupportedException {
        ProdutoTO clone = (ProdutoTO)super.clone();
        if (this.b != null) {
            HashSet<IpiTO> ipiListClone = new HashSet<IpiTO>();
            for (IpiTO ipi : this.b) {
                ipiListClone.add((IpiTO)ipi.clone());
            }
            clone.setIpiTOSet(ipiListClone);
        }
        if (this.a != null) {
            HashSet<IcmsTO> icmsListClone = new HashSet<IcmsTO>();
            for (IcmsTO icms : this.a) {
                icmsListClone.add((IcmsTO)icms.clone());
            }
            clone.setIcmsTOSet(icmsListClone);
        }
        return clone;
    }

    public String getNomeRegistro() {
        return "I";
    }

    public String getVersao() {
        return this.m;
    }

    public void setVersao(String versao) {
        this.m = versao;
    }
}

