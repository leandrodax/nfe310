/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeTO
 *  br.gov.sp.fazenda.dsen.reportdata.ImpressaoDanfeItemRD
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 */
package br.gov.sp.fazenda.dsen.reportdata;

import br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeTO;
import br.gov.sp.fazenda.dsge.report.data.ReportData;
import br.gov.sp.fazenda.dsge.report.data.page.Page;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ImpressaoDanfeItemRD
implements ReportData {
    public Page getData(Map map, int i, int i0) throws DSGEReportException {
        return null;
    }

    public Collection getData(Map map) throws DSGEReportException {
        System.out.println("(ImpressaoDanfeItemRD.getData) Inicio");
        List col = new ArrayList();
        if (map.get("NFe") != null) {
            List impressaoList = (List)map.get("Impressao");
            for (int i = 0; i < impressaoList.size(); ++i) {
                ImpressaoDanfeTO impressao = (ImpressaoDanfeTO)impressaoList.get(i);
                if (!impressao.getNumeroNfe().equals(map.get("NFe"))) continue;
                col = impressao.getImpressaoDanfeItemTOList();
            }
        }
        System.out.println("(ImpressaoDanfeItemRD.getData) Total de itens para a NF " + map.get("NFe") + ": " + col.size());
        System.out.println("(ImpressaoDanfeItemRD.getData) Fim");
        return col;
    }
}

