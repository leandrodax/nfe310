/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum
 *  br.gov.sp.fazenda.dsen.common.to.AdicaoTO
 *  br.gov.sp.fazenda.dsen.common.to.DITO
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$Adi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$TpIntermedio
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$TpIntermedio$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$TpViaTransp
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DI$TpViaTransp$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi$Enum
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum;
import br.gov.sp.fazenda.dsen.common.to.AdicaoTO;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TUfEmi;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class DITO
extends BaseTO {
    private static final long a = 931448965799085032L;
    private String a;
    private Date a;
    private String b;
    private String c;
    private Date b;
    private String d;
    private Collection<AdicaoTO> a;
    private String e;
    private String f;
    private String g;
    private TipoViaTransporteEnum a;
    private String h;
    private TipoImportacaoEnum a;

    public String getUFAE() {
        return this.f;
    }

    public void setUFAE(String uFAE) {
        this.f = uFAE;
    }

    public String getCNPJAE() {
        return this.g;
    }

    public void setCNPJAE(String cNPJAE) {
        this.g = cNPJAE;
    }

    public TipoViaTransporteEnum getTpViaTransp() {
        return this.a;
    }

    public void setTpViaTransp(TipoViaTransporteEnum tpViaTransp) {
        this.a = tpViaTransp;
    }

    public String getvAFRMM() {
        return this.h;
    }

    public void setvAFRMM(String vAFRMM) {
        this.h = vAFRMM;
    }

    public TipoImportacaoEnum getTpIntermedio() {
        return this.a;
    }

    public void setTpIntermedio(TipoImportacaoEnum tpIntermedio) {
        this.a = tpIntermedio;
    }

    public String getCExportador() {
        return this.d;
    }

    public Date getDDI() {
        return this.a;
    }

    public Date getDDesemb() {
        return this.b;
    }

    public Collection<AdicaoTO> getListaAdicao() {
        return this.a;
    }

    public String getNDI() {
        return this.a;
    }

    public String getUFDesemb() {
        return this.c;
    }

    public String getXLocDesemb() {
        return this.b;
    }

    public void setCExportador(String cExportador) {
        this.d = cExportador;
    }

    public void setDDI(Date dDI) {
        this.a = dDI;
    }

    public void setDDesemb(Date dDesemb) {
        this.b = dDesemb;
    }

    public void setListaAdicao(Collection<AdicaoTO> listaAdicao) {
        this.a = listaAdicao;
    }

    public void setNDI(String nDI) {
        this.a = nDI;
    }

    public void setUFDesemb(String UFDesemb) {
        this.c = UFDesemb;
    }

    public void setXLocDesemb(String xLocDesemb) {
        this.b = xLocDesemb;
    }

    public void setNItem(String nItem) {
        this.e = nItem;
    }

    public String getNItem() {
        return this.e;
    }

    public void setValues(TNFe.InfNFe.Det.Prod.DI di) {
        if (di != null) {
            this.setNDI(di.getNDI());
            if (di.getDDI() != null) {
                this.setDDI(DateHelper.getDate((String)di.getDDI(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
            } else {
                this.setDDI(null);
            }
            this.setXLocDesemb(di.getXLocDesemb() != null ? di.getXLocDesemb().toString() : null);
            if (di.getUFDesemb() != null) {
                this.setUFDesemb(di.getUFDesemb().toString());
            }
            if (di.getDDesemb() != null) {
                this.setDDesemb(DateHelper.getDate((String)di.getDDesemb(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
            } else {
                this.setDDesemb(null);
            }
            this.setCExportador(di.getCExportador());
            if (di.getAdiArray() != null) {
                ArrayList<AdicaoTO> listaAdicao = new ArrayList<AdicaoTO>();
                for (int i = 0; i < di.getAdiArray().length; ++i) {
                    AdicaoTO adicaoTO = new AdicaoTO();
                    adicaoTO.setValues(di.getAdiArray()[i]);
                    listaAdicao.add(adicaoTO);
                }
                this.setListaAdicao(listaAdicao);
            }
            if (di.getUFTerceiro() != null) {
                this.setUFAE(di.getUFTerceiro().toString());
            }
            if (di.getCNPJ() != null) {
                this.setCNPJAE(di.getCNPJ());
            }
            if (di.getTpViaTransp() != null) {
                for (TipoViaTransporteEnum item : TipoViaTransporteEnum.values()) {
                    if (!item.getCodigo().equals(di.getTpViaTransp().toString())) continue;
                    this.setTpViaTransp(item);
                    break;
                }
            }
            if (di.getVAFRMM() != null) {
                this.setvAFRMM(di.getVAFRMM());
            }
            if (di.getTpIntermedio() != null) {
                for (TipoViaTransporteEnum item : TipoImportacaoEnum.values()) {
                    if (!item.getCodigo().equals(di.getTpIntermedio().toString())) continue;
                    this.setTpIntermedio((TipoImportacaoEnum)item);
                    break;
                }
            }
        }
    }
}

