/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO
 *  br.gov.sp.fazenda.dsen.common.util.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DetExport
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod$DetExport$ExportInd
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.util.NumberFormatterHelper;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.math.BigDecimal;
import java.text.ParseException;

public class ProdutoExportacaoTO
extends BaseTO {
    private static final long a = 1215914655664257921L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public String getNDraw() {
        return this.a;
    }

    public void setNDraw(String nDraw) {
        this.a = nDraw;
    }

    public String getNRE() {
        return this.b;
    }

    public void setNRE(String nRE) {
        this.b = nRE;
    }

    public String getChNFe() {
        return this.c;
    }

    public void setChNFe(String chNFe) {
        this.c = chNFe;
    }

    public String getQExport() {
        return this.d;
    }

    public void setQExport(String qExport) {
        this.d = qExport;
    }

    public void setNItem(String nItem) {
        this.e = nItem;
    }

    public String getNItem() {
        return this.e;
    }

    public void setValues(TNFe.InfNFe.Det.Prod.DetExport export) {
        if (export != null) {
            if (export.getNDraw() != null) {
                this.setNDraw(export.getNDraw());
            }
            if (export.getExportInd() != null) {
                if (export.getExportInd().getNRE() != null) {
                    this.setNRE(export.getExportInd().getNRE());
                }
                if (export.getExportInd().getChNFe() != null) {
                    this.setChNFe(export.getExportInd().getChNFe());
                }
                if (!StringHelper.isBlankOrNull((Object)export.getExportInd().getQExport())) {
                    try {
                        this.setQExport(NumberFormatterHelper.getFormatter1104().valueToString(new BigDecimal(export.getExportInd().getQExport())));
                    }
                    catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

