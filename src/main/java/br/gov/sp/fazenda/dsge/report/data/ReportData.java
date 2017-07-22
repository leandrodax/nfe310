/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 */
package br.gov.sp.fazenda.dsge.report.data;

import br.gov.sp.fazenda.dsge.report.data.page.Page;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.util.Collection;
import java.util.Map;

public interface ReportData {
    public Page getData(Map var1, int var2, int var3) throws DSGEReportException;

    public Collection getData(Map var1) throws DSGEReportException;
}

