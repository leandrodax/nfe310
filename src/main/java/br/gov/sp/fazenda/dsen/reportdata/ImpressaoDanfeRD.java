/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.reportdata.ImpressaoDanfeRD
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 */
package br.gov.sp.fazenda.dsen.reportdata;

import br.gov.sp.fazenda.dsge.report.data.ReportData;
import br.gov.sp.fazenda.dsge.report.data.page.Page;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ImpressaoDanfeRD
implements ReportData {
    public ImpressaoDanfeRD() {
        System.out.println("(ImpressaoDanfeRD.construtor) Inicio");
    }

    public Page getData(Map map, int i, int i0) throws DSGEReportException {
        return null;
    }

    public Collection getData(Map map) throws DSGEReportException {
        System.out.println("(ImpressaoDanfeRD.getData) Inicio");
        Collection col = new ArrayList();
        List impressaoList = (List)map.get("Impressao");
        col = impressaoList;
        System.out.println("(ImpressaoDanfeRD.getData) Total de DANFE: " + col.size());
        System.out.println("(ImpressaoDanfeRD.getData) Fim");
        return col;
    }
}

