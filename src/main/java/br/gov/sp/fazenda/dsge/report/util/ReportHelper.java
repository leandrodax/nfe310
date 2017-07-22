/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMapping
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMappings
 *  br.gov.sp.fazenda.dsge.report.mapping.SubReportMapping
 *  br.gov.sp.fazenda.dsge.report.util.ReportHelper
 *  org.apache.commons.digester.Digester
 */
package br.gov.sp.fazenda.dsge.report.util;

import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import br.gov.sp.fazenda.dsge.report.mapping.ReportMapping;
import br.gov.sp.fazenda.dsge.report.mapping.ReportMappings;
import br.gov.sp.fazenda.dsge.report.mapping.SubReportMapping;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import org.apache.commons.digester.Digester;
import org.xml.sax.SAXException;

/*
 * Exception performing whole class analysis ignored.
 */
public class ReportHelper {
    private static final String[] a = new String[]{"-//Prodesp//DTD Reports 1.0//EN", "/br/gov/sp/fazenda/dsge/report/resources/reports_1_0.dtd"};

    private ReportHelper() {
    }

    public static Object createObject(String className) {
        return ReportHelper.createObject((String)className, (Class[])null, (Object[])null);
    }

    public static Object createObject(String className, Class[] argTypes, Object[] args) {
        Object instance = null;
        Class dynamicClass = null;
        try {
            dynamicClass = Class.forName(className);
            if (args == null || args.length == 0) {
                instance = dynamicClass.newInstance();
            } else {
                Constructor classConstructor5 = dynamicClass.getConstructor(argTypes);
                instance = classConstructor5.newInstance(args);
            }
        }
        catch (ClassNotFoundException classConstructor5) {
        }
        catch (InstantiationException classConstructor5) {
        }
        catch (IllegalAccessException classConstructor5) {
        }
        catch (NoSuchMethodException classConstructor5) {
        }
        catch (InvocationTargetException classConstructor5) {
            // empty catch block
        }
        return instance;
    }

    public static ReportMappings initReportsDigester(InputStream input, URL url) throws DSGEReportException {
        Digester digester = new Digester();
        digester.setValidating(false);
        digester.register(a[0], url.toString());
        digester.addObjectCreate("reports", ReportMappings.class);
        digester.addCallMethod("reports/report-location", "setReportsLocation", 0);
        digester.addCallMethod("reports/datasource-param-suffix", "setDataSourceParamSuffix", 0);
        digester.addCallMethod("reports/subreport-param-suffix", "setSubReportParamSuffix", 0);
        digester.addCallMethod("reports/report-parameter", "addReportParameter", 2);
        digester.addCallParam("reports/report-parameter/parameter-name", 0);
        digester.addCallParam("reports/report-parameter/parameter-value", 1);
        digester.addObjectCreate("reports/report", ReportMapping.class);
        digester.addSetProperties("reports/report", new String[]{"name", "paging"}, new String[]{"reportName", "reportPaging"});
        digester.addCallMethod("reports/report/report-class", "setReportClass", 0);
        digester.addCallMethod("reports/report/report-data", "setReportData", 0);
        digester.addCallMethod("reports/report/report-pageprovider", "setReportPageProvider", 0);
        digester.addCallMethod("reports/report/report-datasource", "setReportDataSource", 0);
        digester.addCallMethod("reports/report/request-attributes/attribute-name", "addAttributeName", 0);
        digester.addCallMethod("reports/report/saving-name", "setSaveName", 0);
        digester.addObjectCreate("reports/report/subreport", SubReportMapping.class);
        digester.addSetProperties("reports/report/subreport", new String[]{"name", "paging", "master"}, new String[]{"reportName", "reportPaging", "reportMaster"});
        digester.addCallMethod("reports/report/subreport/subreport-data", "setReportData", 0);
        digester.addCallMethod("reports/report/subreport/subreport-pageprovider", "setReportPageProvider", 0);
        digester.addCallMethod("reports/report/subreport/subreport-datasource", "setReportDataSource", 0);
        digester.addCallMethod("reports/report/subreport/master-attribute", "setMasterConfiguration", 2);
        digester.addCallParam("reports/report/subreport/master-attribute/name", 0);
        digester.addCallParam("reports/report/subreport/master-attribute/class", 1);
        digester.addSetNext("reports/report/subreport", "addSubReportMapping", SubReportMapping.class.getName());
        digester.addSetNext("reports/report", "addReport", ReportMapping.class.getName());
        try {
            return (ReportMappings)digester.parse(input);
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new DSGEReportException((Throwable)e, "File IO error");
        }
        catch (SAXException e) {
            e.printStackTrace();
            throw new DSGEReportException((Throwable)e, "Error in parse");
        }
    }

    static {
    }
}

