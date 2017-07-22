/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.LacreTO
 *  br.gov.sp.fazenda.dsen.common.to.VolumeTO
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$Vol
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Transp$Vol$Lacres
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.LacreTO;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.ArrayList;
import java.util.Collection;

public class VolumeTO
extends BaseTO {
    private static final long a = 3406951347552145174L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Collection<LacreTO> a;
    private String g;

    public String getEsp() {
        return this.b;
    }

    public Collection<LacreTO> getListaLacre() {
        return this.a;
    }

    public String getMarca() {
        return this.c;
    }

    public String getNVol() {
        return this.d;
    }

    public String getPesoB() {
        return this.f;
    }

    public String getPesoL() {
        return this.e;
    }

    public String getQVol() {
        return this.a;
    }

    public void setEsp(String esp) {
        this.b = esp;
    }

    public void setListaLacre(Collection<LacreTO> listaLacre) {
        this.a = listaLacre;
    }

    public void setMarca(String marca) {
        this.c = marca;
    }

    public void setNVol(String nVol) {
        this.d = nVol;
    }

    public void setPesoB(String pesoB) {
        this.f = pesoB;
    }

    public void setPesoL(String pesoL) {
        this.e = pesoL;
    }

    public void setQVol(String qVol) {
        this.a = qVol;
    }

    public String getNItem() {
        return this.g;
    }

    public void setNItem(String nItem) {
        this.g = nItem;
    }

    public void setValues(TNFe.InfNFe.Transp.Vol volume) {
        this.setQVol(volume.getQVol());
        this.setEsp(volume.getEsp());
        this.setMarca(volume.getMarca());
        this.setNVol(volume.getNVol());
        this.setPesoL(volume.getPesoL());
        this.setPesoB(volume.getPesoB());
        if (volume.getLacresArray() != null) {
            ArrayList<LacreTO> listaLacre = new ArrayList<LacreTO>();
            for (int i = 0; i < volume.getLacresArray().length; ++i) {
                LacreTO lacreTO = new LacreTO();
                lacreTO.setNLacre(volume.getLacresArray()[i].getNLacre());
                lacreTO.setNItem(String.valueOf(i));
                listaLacre.add(lacreTO);
            }
            this.setListaLacre(listaLacre);
        }
    }
}

