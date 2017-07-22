/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.CSOSNEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.OrigemMercadoriaEnum;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;

public class IcmsTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = 6890237752149399386L;
    private Integer a;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private ProdutoTO a;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;

    public void setPRedBcst(String pRedBcst) {
        this.i = pRedBcst;
    }

    public void setPMvast(String pMvast) {
        this.h = pMvast;
    }

    public void setModBcst(String modBcst) {
        this.g = modBcst;
    }

    public void setPIcms(String pIcms) {
        this.e = pIcms;
    }

    public void setPRedBc(String pRedBc) {
        this.d = pRedBc;
    }

    public void setModBc(String modBc) {
        this.c = modBc;
    }

    public void setCst(String cst) {
        this.b = cst;
    }

    public void setOrig(String orig) {
        this.a = orig;
    }

    public void setIdIcms(Integer idIcms) {
        this.a = idIcms;
    }

    public String getCst() {
        return this.b;
    }

    public Integer getIdIcms() {
        return this.a;
    }

    public String getModBc() {
        return this.c;
    }

    public String getModBcst() {
        return this.g;
    }

    public String getOrig() {
        return this.a;
    }

    public String getPIcms() {
        return this.e;
    }

    public String getPMvast() {
        return this.h;
    }

    public String getPRedBc() {
        return this.d;
    }

    public String getPRedBcst() {
        return this.i;
    }

    public ProdutoTO getProduto() {
        return this.a;
    }

    public void setProduto(ProdutoTO produto) {
        this.a = produto;
    }

    public String getPIcmsst() {
        return this.f;
    }

    public void setPIcmsst(String pIcmsst) {
        this.f = pIcmsst;
    }

    public String getDescricaoSituacaoTributaria() {
        if (!StringHelper.isBlankOrNull((Object)this.getCst())) {
            CSTEnum cstEnum = CSTEnum.getEnumPeloCodigo((String)this.getCst());
            if (cstEnum != null) {
                return cstEnum.getDescricao();
            }
            CSOSNEnum csosnEnum = CSOSNEnum.getEnumPeloCodigo((String)this.getCst());
            if (csosnEnum != null) {
                return csosnEnum.getDescricao();
            }
            return "";
        }
        return "";
    }

    public String getDescricaoOrigem() {
        if (StringHelper.isBlankOrNull((Object)this.getOrig())) {
            return "";
        }
        return OrigemMercadoriaEnum.getEnumPeloCodigo((String)this.getOrig()).getDescricao();
    }

    public String getNomeRegistro() {
        return "N";
    }

    public String getVersao() {
        return this.j;
    }

    public void setVersao(String versao) {
        this.j = versao;
    }

    public String getMotDesICMS() {
        return this.k;
    }

    public void setMotDesICMS(String motDesICMS) {
        this.k = motDesICMS;
    }

    public String getPBCOp() {
        return this.l;
    }

    public void setPBCOp(String op) {
        this.l = op;
    }

    public String getPCredSN() {
        return this.n;
    }

    public void setPCredSN(String credSN) {
        this.n = credSN;
    }

    public String getUFST() {
        return this.m;
    }

    public void setUFST(String ufst) {
        this.m = ufst;
    }
}

