/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.page.GenericPageProvider
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 *  br.gov.sp.fazenda.dsge.report.data.page.PageProvider
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 */
package br.gov.sp.fazenda.dsge.report.data.page;

import br.gov.sp.fazenda.dsge.report.data.ReportData;
import br.gov.sp.fazenda.dsge.report.data.page.Page;
import br.gov.sp.fazenda.dsge.report.data.page.PageProvider;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.util.HashMap;
import java.util.Map;

public class GenericPageProvider
implements PageProvider {
    private Page a;
    private int a;
    private Map a;
    private ReportData a = 10000;

    public GenericPageProvider(ReportData reportData) {
        this.a = reportData;
    }

    public GenericPageProvider(ReportData reportData, Map parameters) {
        this(reportData);
        this.setParameters(parameters);
    }

    public void setItemsByPage(int itemsByPage) {
        this.a = itemsByPage;
    }

    public int getItemsByPage() {
        return this.a;
    }

    public Page nextPage() throws DSGEReportException {
        int start = 0;
        if (this.a() != null) {
            start = this.a().getStartOfNextPage();
        }
        if (this.hasNextPage()) {
            this.a(this.processNextPage(start, this.getItemsByPage()));
        } else {
            this.a(null);
        }
        return this.a();
    }

    public boolean hasNextPage() {
        if (this.a == null) {
            return true;
        }
        return this.a.isNextPageAvailable();
    }

    private void a(Page page) {
        this.a = page == null ? Page.EMPTY_PAGE : page;
    }

    private Page a() {
        return this.a;
    }

    protected Page processNextPage(int start, int count) throws DSGEReportException {
        return this.a.getData(this.getParameters(), start, count);
    }

    public Map getParameters() {
        if (this.a == null) {
            this.a = new HashMap();
        }
        return this.a;
    }

    public void setParameters(Map parameters) {
        this.a = parameters;
    }

    public void addParameter(String name, Object value) {
        this.getParameters().put(name, value);
    }
}

