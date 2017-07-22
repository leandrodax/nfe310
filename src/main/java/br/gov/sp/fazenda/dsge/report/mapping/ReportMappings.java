/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMappings
 */
package br.gov.sp.fazenda.dsge.report.mapping;

import br.gov.sp.fazenda.dsge.report.mapping.ReportMapping;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReportMappings
implements Serializable {
    private Map a;
    private Map b;
    private String a = new HashMap();
    private String b = new HashMap();
    private String c = "_subreport";

    public void addReport(ReportMapping reportMapping) {
        this.a.put(reportMapping.getReportName(), reportMapping);
    }

    public void addReportParameter(String name, String value) {
        this.b.put(name, value);
    }

    public void removeReport(String reportName) {
        this.a.remove(reportName);
    }

    public ReportMapping findReportMapping(String reportName) {
        return (ReportMapping)this.a.get(reportName);
    }

    public String[] findReportMappings() {
        return this.a.keySet().toArray(new String[this.a.size()]);
    }

    public String getDataSourceParamSuffix() {
        return this.b;
    }

    public String getReportsLocation() {
        return this.a;
    }

    public String getSubReportParamSuffix() {
        return this.c;
    }

    public void setDataSourceParamSuffix(String dataSourceParamSuffix) {
        this.b = dataSourceParamSuffix;
    }

    public void setReportsLocation(String reportsLocation) {
        this.a = reportsLocation;
    }

    public void setSubReportParamSuffix(String subReportParamSuffix) {
        this.c = subReportParamSuffix;
    }

    public Map getReportParameters() {
        return this.b;
    }
}

