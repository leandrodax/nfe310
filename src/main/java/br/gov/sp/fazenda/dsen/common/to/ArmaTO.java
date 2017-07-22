/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ArmaTO
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Arma
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Arma$TpArma
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Arma$TpArma$Enum
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class ArmaTO
extends BaseTO {
    private static final long a = 1491398372698334173L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getDescr() {
        return this.d;
    }

    public String getNCano() {
        return this.c;
    }

    public String getNSerie() {
        return this.b;
    }

    public String getTpArma() {
        return this.a;
    }

    public void setDescr(String descr) {
        this.d = descr;
    }

    public void setNCano(String nCano) {
        this.c = nCano;
    }

    public void setNSerie(String nSerie) {
        this.b = nSerie;
    }

    public void setTpArma(String tpArma) {
        this.a = tpArma;
    }

    public void setNItem(String nItem) {
        this.e = nItem;
    }

    public String getNItem() {
        return this.e;
    }

    public void setValues(TNFe.InfNFe.Det.Prod.Arma arma) {
        if (arma != null) {
            this.setDescr(arma.getDescr());
            this.setNCano(arma.getNCano());
            this.setNSerie(arma.getNSerie());
            this.setTpArma(arma.getTpArma() != null ? arma.getTpArma().toString() : null);
        }
    }
}

