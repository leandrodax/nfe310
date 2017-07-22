/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.IpiTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;

public class IpiTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = -8871752800248396807L;
    private Integer a;
    private String a;
    private String b;
    private String c;
    private ProdutoTO a;
    private String d;

    public String getCEnq() {
        return this.c;
    }

    public String getClEnq() {
        return this.a;
    }

    public String getCnpjProd() {
        return this.b;
    }

    public Integer getIdIpi() {
        return this.a;
    }

    public ProdutoTO getProduto() {
        return this.a;
    }

    public void setCEnq(String cEnq) {
        this.c = cEnq;
    }

    public void setClEnq(String clEnq) {
        this.a = clEnq;
    }

    public void setCnpjProd(String cnpjProd) {
        this.b = cnpjProd;
    }

    public void setIdIpi(Integer idIpi) {
        this.a = idIpi;
    }

    public void setProduto(ProdutoTO produto) {
        this.a = produto;
    }

    public String getNomeRegistro() {
        return "O";
    }

    public String getVersao() {
        return this.d;
    }

    public void setVersao(String versao) {
        this.d = versao;
    }
}

