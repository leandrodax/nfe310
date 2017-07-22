/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.AdicaoTO
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$Adi
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class AdicaoTO
extends BaseTO {
    private static final long a = 907887282897478795L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getCFabricante() {
        return this.c;
    }

    public String getNAdicao() {
        return this.a;
    }

    public String getNSeqAdic() {
        return this.b;
    }

    public String getVDescDI() {
        return this.d;
    }

    public void setCFabricante(String cFabricante) {
        this.c = cFabricante;
    }

    public void setNAdicao(String nAdicao) {
        this.a = nAdicao;
    }

    public void setNSeqAdic(String nSeqAdic) {
        this.b = nSeqAdic;
    }

    public void setVDescDI(String vDescDI) {
        this.d = vDescDI;
    }

    public void setValues(TNFe.InfNFe.Det.Prod.DI.Adi adi) {
        if (adi != null) {
            this.setNAdicao(adi.getNAdicao());
            this.setNSeqAdic(adi.getNSeqAdic());
            this.setCFabricante(adi.getCFabricante());
            this.setVDescDI(adi.getVDescDI());
            this.setNDraw(adi.getNDraw());
        }
    }

    public String getNDraw() {
        return this.e;
    }

    public void setNDraw(String nDraw) {
        this.e = nDraw;
    }
}

