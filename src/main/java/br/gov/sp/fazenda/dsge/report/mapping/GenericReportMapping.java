/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping
 */
package br.gov.sp.fazenda.dsge.report.mapping;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericReportMapping
implements Serializable {
    private String a;
    private String b;
    protected String reportDataSource = "br.gov.sp.fazenda.dsge.report.data.datasource.ValueObjectDataSource";
    protected String reportPageProvider = "br.gov.sp.fazenda.dsge.report.data.page.GenericPageProvider";
    protected String reportPaging = "false";
    protected List requestAttributes = new ArrayList();

    public String getReportDataSource() {
        return this.reportDataSource;
    }

    public String getReportName() {
        return this.a;
    }

    public String getReportPageProvider() {
        return this.reportPageProvider;
    }

    public void setReportDataSource(String reportDataSource) {
        this.reportDataSource = reportDataSource;
    }

    public void setReportName(String reportName) {
        this.a = reportName;
    }

    public void setReportPageProvider(String reportPageProvider) {
        this.reportPageProvider = reportPageProvider;
    }

    public String getReportData() {
        return this.b;
    }

    public void setReportData(String reportData) {
        this.b = reportData;
    }

    public String getReportPaging() {
        return this.reportPaging;
    }

    public void setReportPaging(String string) {
        this.reportPaging = string;
    }

    public boolean isPaging() {
        return "true".equalsIgnoreCase(this.getReportPaging()) || "yes".equalsIgnoreCase(this.getReportPaging());
    }

    public void addAttributeName(String value) {
        this.requestAttributes.add(value);
    }

    public List getRequestAttributes() {
        return this.requestAttributes;
    }
}

