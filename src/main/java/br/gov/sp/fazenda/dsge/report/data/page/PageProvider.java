/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 *  br.gov.sp.fazenda.dsge.report.data.page.PageProvider
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 */
package br.gov.sp.fazenda.dsge.report.data.page;

import br.gov.sp.fazenda.dsge.report.data.page.Page;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;

public interface PageProvider {
    public static final int DEFAULT_ITEMS_BY_PAGE = 10000;

    public Page nextPage() throws DSGEReportException;

    public boolean hasNextPage();

    public void addParameter(String var1, Object var2);
}

