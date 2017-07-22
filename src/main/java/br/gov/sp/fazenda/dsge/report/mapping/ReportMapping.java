/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.SubReportMapping
 */
package br.gov.sp.fazenda.dsge.report.mapping;

import br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping;
import br.gov.sp.fazenda.dsge.report.mapping.SubReportMapping;
import java.util.ArrayList;
import java.util.List;

public class ReportMapping
extends GenericReportMapping {
    private List a;
    protected String reportClass = "br.gov.sp.fazenda.dsge.report.GenericReport";
    private String a;
    private boolean a = new ArrayList();

    public String getReportClass() {
        return this.reportClass;
    }

    public void setReportClass(String reportClass) {
        this.reportClass = reportClass;
    }

    public void addSubReportMapping(SubReportMapping subReportMapping) {
        this.a.add(subReportMapping);
    }

    public List getSubReports() {
        return this.a;
    }

    public void setSaveName(String saveName) {
        this.a = saveName;
        this.a = true;
    }

    public String getSaveName() {
        return this.a;
    }

    public boolean isAttachment() {
        return this.a;
    }
}

