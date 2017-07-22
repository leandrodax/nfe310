/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.SubReportMapping
 */
package br.gov.sp.fazenda.dsge.report.mapping;

import br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping;

public class SubReportMapping
extends GenericReportMapping {
    private String a;
    private String b;
    private String c;

    public void setReportMaster(String reportMaster) {
        this.a = reportMaster;
    }

    public String getReportMaster() {
        return this.a;
    }

    public String getAttributeClass() {
        return this.b;
    }

    public String getAttributeName() {
        return this.c;
    }

    public void setMasterConfiguration(String attributeName, String attributeClass) {
        this.c = attributeName;
        this.b = attributeClass;
    }

    public boolean isMaster() {
        return "true".equalsIgnoreCase(this.getReportMaster()) || "verdadeiro".equalsIgnoreCase(this.getReportMaster());
    }
}

