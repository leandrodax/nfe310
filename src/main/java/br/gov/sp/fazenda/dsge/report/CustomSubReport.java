/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.CustomSubReport
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
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CustomSubReport
extends Report {
    public CustomSubReport(ReportMapping reportMapping) {
        super(reportMapping);
    }

    protected void prepare(Map requestParameters) throws DSGEReportException {
        this.setDataSource(this.a(requestParameters));
        List subReports = this.getReportMapping().getSubReports();
        if (subReports.isEmpty()) {
            return;
        }
        for (SubReportMapping subReport : subReports) {
            this.addSubReportDataSource(subReport.getReportName(), this.a(subReport, requestParameters, subReport.isMaster()));
        }
    }

    protected String getMainReportName() {
        return this.getReportMapping().getReportName();
    }

    private ReportDataSource a(Map parameters) throws DSGEReportException {
        ReportDataSource reportDataSource = ReportFactory.getReportDataSource((GenericReportMapping)this.getReportMapping(), (Map)parameters);
        return reportDataSource;
    }

    private ReportDataSource a(SubReportMapping subReportMapping, Map parameters, boolean isMaster) throws DSGEReportException {
        ReportDataSource reportDataSource = null;
        reportDataSource = isMaster ? this.a(subReportMapping, parameters, super.getMainReportDataSource()) : ReportFactory.getSubReportDataSource((GenericReportMapping)subReportMapping, (Map)parameters);
        return reportDataSource;
    }

    private ReportDataSource a(SubReportMapping subReport, Map requestParameters, ReportDataSource masterDataSource) throws DSGEReportException {
        if (!masterDataSource.isEmpty()) {
            Object bean2 = null;
            for (Object bean2 : masterDataSource.getReportCollectionData()) {
                Class dataClass = bean2.getClass();
                Field[] fields = dataClass.getDeclaredFields();
                for (int i = 0; i < fields.length; ++i) {
                    if (!this.a(fields[i], subReport)) continue;
                    return this.a(requestParameters, fields[i].getName(), dataClass, bean2);
                }
            }
        }
        return null;
    }

    private ReportDataSource a(Map requestParameters, String fieldName, Class dataClass, Object bean) throws DSGEReportException {
        Method method = null;
        Collection collection = null;
        ReportDataSource reportDataSource = null;
        try {
            method = dataClass.getMethod(this.a(fieldName), null);
            if (method != null) {
                collection = (Collection)method.invoke(bean, null);
                reportDataSource = ReportFactory.getReportDataSource((String)this.getReportMapping().getReportDataSource(), (Collection)collection, (Map)requestParameters);
            }
        }
        catch (NoSuchMethodException nsme) {
            throw new DSGEReportException((Throwable)nsme, "inicializeDataSourcereportDataSource - n\u00e3o existe o m\u00e9todo chamado - " + this.a(fieldName));
        }
        catch (InvocationTargetException ite) {
            throw new DSGEReportException((Throwable)ite, "inicializeDataSourcereportDataSource - erro ao invocar m\u00e9todo - " + this.a(fieldName));
        }
        catch (IllegalAccessException iae) {
            throw new DSGEReportException((Throwable)iae, "inicializeDataSourcereportDataSource - erro de acesso ao m\u00e9todo - " + this.a(fieldName));
        }
        return reportDataSource;
    }

    private boolean a(Field field, SubReportMapping subReport) throws DSGEReportException {
        Class masterType = null;
        try {
            masterType = Class.forName(subReport.getAttributeClass());
        }
        catch (ClassNotFoundException e) {
            throw new DSGEReportException((Throwable)e, "Erro na obtencao da classe master de relatorio");
        }
        if (masterType != null) {
            return field.getName().equals(subReport.getAttributeName()) && field.getType().equals(masterType);
        }
        return false;
    }

    private String a(String fieldName) {
        return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}

