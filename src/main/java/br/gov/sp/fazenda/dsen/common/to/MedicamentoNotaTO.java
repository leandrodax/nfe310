/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.MedicamentoNotaTO
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$Med
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MedicamentoNotaTO
extends BaseTO {
    private static final long a = -6507393057741144074L;
    private String a;
    private String b;
    private Calendar a;
    private Calendar b;
    private String c;
    private String d;

    public Calendar getDFab() {
        return this.a;
    }

    public Calendar getDVal() {
        return this.b;
    }

    public String getNLote() {
        return this.a;
    }

    public String getQLote() {
        return this.b;
    }

    public String getVPMC() {
        return this.c;
    }

    public void setDFab(Calendar dFab) {
        this.a = dFab;
    }

    public void setDVal(Calendar dVal) {
        this.b = dVal;
    }

    public void setNLote(String nLote) {
        this.a = nLote;
    }

    public void setQLote(String qLote) {
        this.b = qLote;
    }

    public void setVPMC(String vPMC) {
        this.c = vPMC;
    }

    public void setNItem(String nItem) {
        this.d = nItem;
    }

    public String getNItem() {
        return this.d;
    }

    public void setValues(TNFe.InfNFe.Det.Prod.Med med) {
        if (med != null) {
            GregorianCalendar gcAux;
            if (med.getDFab() != null) {
                gcAux = new GregorianCalendar();
                gcAux.setTime(DateHelper.getDate((String)med.getDFab(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
                this.setDFab((Calendar)gcAux);
            } else {
                this.setDFab(null);
            }
            if (med.getDVal() != null) {
                gcAux = new GregorianCalendar();
                gcAux.setTime(DateHelper.getDate((String)med.getDVal(), (SimpleDateFormat)DateHelper.DATE_XML_FORMAT));
                this.setDVal((Calendar)gcAux);
            } else {
                this.setDVal(null);
            }
            this.setNLote(med.getNLote());
            this.setQLote(med.getQLote());
            this.setVPMC(med.getVPMC());
        }
    }
}

