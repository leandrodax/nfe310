/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.report.Report
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource
 *  br.gov.sp.fazenda.dsge.report.data.page.PageProvider
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 *  br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMappings
 *  br.gov.sp.fazenda.dsge.report.util.ReportFactory
 *  br.gov.sp.fazenda.dsge.report.util.ReportHelper
 */
package br.gov.sp.fazenda.dsge.report.util;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.report.Report;
import br.gov.sp.fazenda.dsge.report.data.ReportData;
import br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource;
import br.gov.sp.fazenda.dsge.report.data.page.PageProvider;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import br.gov.sp.fazenda.dsge.report.mapping.GenericReportMapping;
import br.gov.sp.fazenda.dsge.report.mapping.ReportMapping;
import br.gov.sp.fazenda.dsge.report.mapping.ReportMappings;
import br.gov.sp.fazenda.dsge.report.util.ReportHelper;
import java.util.Collection;
import java.util.Map;

/*
 * Exception performing whole class analysis ignored.
 */
public class ReportFactory {
    private ReportFactory() {
    }

    public static Report getReport(String reportName, ReportMappings reportMappings) throws DSGEReportException {
        Report result;
        ReportMapping mapping = reportMappings.findReportMapping(reportName);
        if (mapping == null) {
            throw new DSGEReportException(null, "Error in getReport. ReportMapping not found");
        }
        try {
            result = (Report)ReportHelper.createObject((String)mapping.getReportClass(), (Class[])new Class[]{ReportMapping.class}, (Object[])new Object[]{mapping});
            result.setReportLocation(reportMappings.getReportsLocation());
            result.setDatasourceParamSuffix(reportMappings.getDataSourceParamSuffix());
            result.setSubReportParamSuffix(reportMappings.getSubReportParamSuffix());
            result.setReportParameters(reportMappings.getReportParameters());
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReport");
        }
        return result;
    }

    public static ReportData getReportData(String className) throws DSGEReportException {
        ReportData result;
        try {
            result = (ReportData)ReportHelper.createObject((String)className);
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReportData");
        }
        return result;
    }

    public static PageProvider getPageProvider(String className, ReportData reportData, Map parameters) throws DSGEReportException {
        PageProvider result;
        try {
            result = (PageProvider)ReportHelper.createObject((String)className, (Class[])new Class[]{ReportData.class, Map.class}, (Object[])new Object[]{reportData, parameters});
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getPageProvider");
        }
        return result;
    }

    public static PageProvider getPageProvider(GenericReportMapping reportMapping, Map parameters) throws DSGEReportException {
        PageProvider result;
        try {
            ReportData reportData = ReportFactory.getReportData((String)reportMapping.getReportData());
            result = ReportFactory.getPageProvider((String)reportMapping.getReportPageProvider(), (ReportData)reportData, (Map)parameters);
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getPageProvider");
        }
        return result;
    }

    public static ReportDataSource getReportDataSource(String className, PageProvider pageProvider) throws DSGEReportException {
        ReportDataSource result;
        try {
            result = (ReportDataSource)ReportHelper.createObject((String)className, (Class[])new Class[]{PageProvider.class}, (Object[])new Object[]{pageProvider});
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReportDataSource");
        }
        return result;
    }

    public static ReportDataSource getReportDataSource(String className, PageProvider pageProvider, boolean initialize) throws DSGEReportException {
        ReportDataSource result;
        try {
            result = (ReportDataSource)ReportHelper.createObject((String)className, (Class[])new Class[]{PageProvider.class, Boolean.TYPE}, (Object[])new Object[]{pageProvider, new Boolean(initialize)});
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReportDataSource");
        }
        return result;
    }

    public static ReportDataSource getReportDataSource(String className, ReportData reportData, Map parameters) throws DSGEReportException {
        ReportDataSource result;
        try {
            result = (ReportDataSource)ReportHelper.createObject((String)className, (Class[])new Class[]{ReportData.class, Map.class}, (Object[])new Object[]{reportData, parameters});
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReportDataSource");
        }
        return result;
    }

    public static ReportDataSource getReportDataSource(String className, ReportData reportData, Map parameters, boolean initialize) throws DSGEReportException {
        ReportDataSource result;
        try {
            result = (ReportDataSource)ReportHelper.createObject((String)className, (Class[])new Class[]{ReportData.class, Map.class, Boolean.TYPE}, (Object[])new Object[]{reportData, parameters, new Boolean(initialize)});
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReportDataSource");
        }
        return result;
    }

    public static ReportDataSource getReportDataSource(GenericReportMapping reportMapping, Map parameters) throws DSGEReportException {
        ReportDataSource result;
        PageProvider pageProvider = null;
        ReportData reportData = null;
        try {
            if (reportMapping.isPaging()) {
                pageProvider = ReportFactory.getPageProvider((GenericReportMapping)reportMapping, (Map)parameters);
                result = ReportFactory.getReportDataSource((String)reportMapping.getReportDataSource(), (PageProvider)pageProvider);
            } else {
                reportData = ReportFactory.getReportData((String)reportMapping.getReportData());
                result = ReportFactory.getReportDataSource((String)reportMapping.getReportDataSource(), (ReportData)reportData, (Map)parameters);
            }
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReportDataSource");
        }
        return result;
    }

    public static ReportDataSource getReportDataSource(GenericReportMapping reportMapping, Map parameters, boolean initialize) throws DSGEReportException {
        ReportDataSource result;
        PageProvider pageProvider = null;
        ReportData reportData = null;
        try {
            if (reportMapping.isPaging()) {
                pageProvider = ReportFactory.getPageProvider((GenericReportMapping)reportMapping, (Map)parameters);
                result = ReportFactory.getReportDataSource((String)reportMapping.getReportDataSource(), (PageProvider)pageProvider);
            } else {
                reportData = ReportFactory.getReportData((String)reportMapping.getReportData());
                result = ReportFactory.getReportDataSource((String)reportMapping.getReportDataSource(), (ReportData)reportData, (Map)parameters, (boolean)initialize);
            }
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReportDataSource");
        }
        return result;
    }

    public static ReportDataSource getReportDataSource(String className, Collection collection, Map parameters) throws DSGEReportException {
        ReportDataSource result;
        try {
            result = (ReportDataSource)ReportHelper.createObject((String)className, (Class[])new Class[]{Collection.class, Map.class}, (Object[])new Object[]{collection, parameters});
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Erro in getReportDataSourece");
        }
        return result;
    }

    public static ReportDataSource getSubReportDataSource(GenericReportMapping reportMapping, Map parameters) throws DSGEReportException {
        ReportDataSource result;
        PageProvider pageProvider = null;
        ReportData reportData = null;
        try {
            if (reportMapping.isPaging()) {
                pageProvider = ReportFactory.getPageProvider((GenericReportMapping)reportMapping, (Map)parameters);
                result = ReportFactory.getReportDataSource((String)reportMapping.getReportDataSource(), (PageProvider)pageProvider, (boolean)false);
            } else {
                reportData = ReportFactory.getReportData((String)reportMapping.getReportData());
                result = ReportFactory.getReportDataSource((String)reportMapping.getReportDataSource(), (ReportData)reportData, (Map)parameters, (boolean)false);
            }
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getReportDataSource");
        }
        return result;
    }
}

