/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.reportdata.RelatorioGerencialRD
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 */
package br.gov.sp.fazenda.dsen.reportdata;

import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;
import br.gov.sp.fazenda.dsge.report.data.ReportData;
import br.gov.sp.fazenda.dsge.report.data.page.Page;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class RelatorioGerencialRD
implements ReportData {
    public Page getData(Map map, int i, int i0) throws DSGEReportException {
        return null;
    }

    public Collection getData(Map map) throws DSGEReportException {
        System.out.println("(RelatorioGerencialRD.getData) Inicio");
        ArrayList<RelatorioNotaFiscalTO> col = new ArrayList<RelatorioNotaFiscalTO>();
        RelatorioNotaFiscalTO relatorio = (RelatorioNotaFiscalTO)map.get("Impressao");
        col.add(relatorio);
        System.out.println("(RelatorioGerencialRD.getData) Fim");
        return col;
    }
}

