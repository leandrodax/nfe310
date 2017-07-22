/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.GenericReport
 *  br.gov.sp.fazenda.dsge.report.Report
 *  br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 *  br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.SubReportMapping
 *  br.gov.sp.fazenda.dsge.report.util.ReportFactory
 */
package br.gov.sp.fazenda.dsge.report;

import br.gov.sp.fazenda.dsge.report.Report;
import br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping;
import br.gov.sp.fazenda.dsge.report.mapping.ReportMapping;
import br.gov.sp.fazenda.dsge.report.mapping.SubReportMapping;
import br.gov.sp.fazenda.dsge.report.util.ReportFactory;
import java.util.List;
import java.util.Map;

public class GenericReport
extends Report {
    public GenericReport(ReportMapping reportMapping) {
        super(reportMapping);
    }

    protected void prepare(Map requestParameters) throws DSGEReportException {
        this.setDataSource(this.getMainReportDataSource(requestParameters));
        List subReports = this.getReportMapping().getSubReports();
        if (subReports.isEmpty()) {
            return;
        }
        for (SubReportMapping subReport : subReports) {
            this.addSubReportDataSource(subReport.getReportName(), this.getSubReportDataSource(subReport, requestParameters));
        }
    }

    protected String getMainReportName() {
        return this.getReportMapping().getReportName();
    }

    protected ReportDataSource getMainReportDataSource(Map parameters) throws DSGEReportException {
        ReportDataSource reportDataSource = ReportFactory.getReportDataSource((GenericReportMapping)this.getReportMapping(), (Map)parameters);
        return reportDataSource;
    }

    protected ReportDataSource getSubReportDataSource(SubReportMapping subReportMapping, Map parameters) throws DSGEReportException {
        ReportDataSource reportDataSource = ReportFactory.getSubReportDataSource((GenericReportMapping)subReportMapping, (Map)parameters);
        return reportDataSource;
    }
}

