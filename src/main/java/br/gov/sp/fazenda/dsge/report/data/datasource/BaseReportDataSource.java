/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.datasource.BaseReportDataSource
 *  br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource
 *  br.gov.sp.fazenda.dsge.report.data.page.Page
 *  br.gov.sp.fazenda.dsge.report.data.page.PageProvider
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 *  net.sf.jasperreports.engine.JRException
 *  net.sf.jasperreports.engine.JRField
 */
package br.gov.sp.fazenda.dsge.report.data.datasource;

import br.gov.sp.fazenda.dsge.report.data.ReportData;
import br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource;
import br.gov.sp.fazenda.dsge.report.data.page.Page;
import br.gov.sp.fazenda.dsge.report.data.page.PageProvider;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public abstract class BaseReportDataSource
implements ReportDataSource {
    private Iterator a;
    private Object a;
    private boolean a;
    private boolean b = false;
    private PageProvider a;
    private ReportData a;
    private Map a;
    private Collection a;

    public boolean isEmpty() {
        return this.a;
    }

    protected void setEmpty(boolean empty) {
        this.a = empty;
    }

    public abstract boolean next() throws JRException;

    public abstract Object getFieldValue(JRField var1) throws JRException;

    protected boolean isInitialized() {
        return this.b;
    }

    protected void setInitialized(boolean initialized) {
        this.b = initialized;
    }

    protected void setIterator(Iterator iterator) {
        this.a = iterator;
    }

    protected Iterator getIterator() {
        return this.a;
    }

    protected void setCurrentBean(Object currentBean) {
        this.a = currentBean;
    }

    protected Object getCurrentBean() {
        return this.a;
    }

    protected void setPageProvider(PageProvider pageProvider) {
        this.a = pageProvider;
    }

    protected PageProvider getPageProvider() {
        return this.a;
    }

    protected void setReportData(ReportData reportData) {
        this.a = reportData;
    }

    protected ReportData getReportData() {
        return this.a;
    }

    protected void setRequestParameters(Map requestParameters) {
        this.a = requestParameters;
    }

    protected Map getRequestParameters() {
        return this.a;
    }

    public Collection getReportCollectionData() {
        return this.a;
    }

    protected void setReportCollectionData(Collection list) {
        this.a = list;
    }

    protected boolean isPageMode() {
        return this.getPageProvider() != null;
    }

    protected boolean hasNextPage() throws DSGEReportException {
        Page page = this.getPageProvider().nextPage();
        this.a = page.getList().iterator();
        return this.a.hasNext();
    }
}

