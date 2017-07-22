/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.Report
 *  br.gov.sp.fazenda.dsge.report.data.datasource.EmptyDataSource
 *  br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMapping
 *  br.gov.sp.fazenda.dsge.report.util.ReportLoader
 *  net.sf.jasperreports.engine.JRDataSource
 *  net.sf.jasperreports.engine.JRParameter
 *  net.sf.jasperreports.engine.JasperExportManager
 *  net.sf.jasperreports.engine.JasperFillManager
 *  net.sf.jasperreports.engine.JasperPrint
 *  net.sf.jasperreports.engine.JasperReport
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsge.report;

import br.gov.sp.fazenda.dsge.report.data.datasource.EmptyDataSource;
import br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import br.gov.sp.fazenda.dsge.report.mapping.ReportMapping;
import br.gov.sp.fazenda.dsge.report.util.ReportLoader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public abstract class Report {
    private String a;
    private HashMap a;
    private ReportDataSource a;
    private JasperReport a;
    private Map a;
    private ReportMapping a;
    protected String datasourceParamSuffix = "";
    protected String subReportParamSuffix = "";
    protected String reportLocation;
    protected Map reportParameters;
    private Log a = LogFactory.getLog(Report.class);

    public Report(ReportMapping reportMapping) {
        this.setReportMapping(reportMapping);
    }

    protected ReportDataSource getMainReportDataSource() {
        return this.a;
    }

    protected void setDataSource(ReportDataSource reportDataSource) {
        this.a = reportDataSource;
    }

    protected void addSubReportDataSource(String subReportName, ReportDataSource subReportDataSource) {
        if (subReportDataSource != null && !subReportDataSource.isEmpty()) {
            this.a.put(subReportName + this.getDatasourceParamSuffix(), subReportDataSource);
        } else {
            this.a.put(subReportName + this.getDatasourceParamSuffix(), new EmptyDataSource());
        }
    }

    protected abstract void prepare(Map var1) throws DSGEReportException;

    protected abstract String getMainReportName();

    public JasperPrint generateJasperPrint(Map requestParameters) throws DSGEReportException {
        this.a = requestParameters;
        try {
            this.b();
            this.prepare(requestParameters);
            this.a();
            JasperPrint jasperPrint = this.a == null ? JasperFillManager.fillReport((JasperReport)this.a, (Map)this.a, (JRDataSource)new EmptyDataSource()) : JasperFillManager.fillReport((JasperReport)this.a, (Map)this.a, (JRDataSource)this.a);
            return jasperPrint;
        }
        catch (Exception e) {
            this.a.error((Object)("Error in " + this.getClass().getName() + ".generateJasperPrint(Map)."), (Throwable)e);
            throw new DSGEReportException((Throwable)e, "Error in " + this.getClass().getName() + ".generateJasperPrint(Map).");
        }
    }

    public void generate(Map requestParameters, OutputStream outputStream) throws DSGEReportException {
        this.a = requestParameters;
        try {
            JasperPrint jasperPrint = this.generateJasperPrint(requestParameters);
            JasperExportManager.exportReportToPdfStream((JasperPrint)jasperPrint, (OutputStream)outputStream);
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in " + this.getClass().getName() + ".generate(Map, OutputStream).");
        }
    }

    public byte[] generate(Map requestParameters) throws DSGEReportException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        this.generate(requestParameters, (OutputStream)baos);
        return baos.toByteArray();
    }

    private void a() {
        JRParameter[] parameterList = this.a.getParameters();
        String parameterName = null;
        for (int i = 0; i < parameterList.length; ++i) {
            parameterName = parameterList[i].getName();
            if (parameterName.indexOf(this.getSubReportParamSuffix()) > -1 || parameterName.indexOf(this.getDatasourceParamSuffix()) > -1 || !parameterList[i].isForPrompting() || !this.a.containsKey(parameterName)) continue;
            this.a.put(parameterName, this.a.get(parameterName));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b() throws DSGEReportException {
        InputStream is;
        is = null;
        try {
            is = this.getClass().getResourceAsStream(this.getReportLocation() + this.getMainReportName() + ".jasper");
            this.a = ReportLoader.loadReport((InputStream)is);
        }
        finally {
            if (is != null) {
                try {
                    is.close();
                }
                catch (IOException iOException) {}
            }
        }
        JRParameter[] parameterList = this.a.getParameters();
        for (int i = 0; i < parameterList.length; ++i) {
            String parameterName = parameterList[i].getName();
            int index = parameterName.indexOf(this.getSubReportParamSuffix());
            if (index >= 0) {
                JasperReport subReport;
                String subReportName = parameterName.substring(0, index);
                subReport = null;
                try {
                    is = this.getClass().getResourceAsStream(this.getReportLocation() + subReportName + ".jasper");
                    subReport = ReportLoader.loadReport((InputStream)is);
                }
                finally {
                    if (is != null) {
                        try {
                            is.close();
                        }
                        catch (IOException iOException) {}
                    }
                }
                this.a.put(parameterName, subReport);
                continue;
            }
            if (!this.getReportParameters().containsKey(parameterName)) continue;
            this.a.put(parameterName, this.getReportParameters().get(parameterName));
        }
    }

    protected void setParameter(String parameterName, Object value) {
        this.a.put(parameterName, value);
    }

    protected void setParametersList(Collection parametersList) throws DSGEReportException {
        Iterator<E> iterator = parametersList.iterator();
        try {
            while (iterator.hasNext()) {
                E object = iterator.next();
                Class<?> objectClass = object.getClass();
                Method[] methodsList = objectClass.getMethods();
                for (int i = 0; i < methodsList.length; ++i) {
                    Method method = methodsList[i];
                    String methodName = method.getName();
                    int index = methodName.indexOf("get");
                    if (index < 0) continue;
                    Object returnedValue = method.invoke(object, null);
                    String variableName = methodName.substring(3, methodName.length());
                    variableName = variableName.substring(0, 1).toLowerCase() + variableName.substring(1);
                    this.a.put(variableName, returnedValue);
                }
            }
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in " + this.getClass().getName() + ".setParametersList().");
        }
    }

    public String getName() {
        return this.a;
    }

    public void setName(String name) {
        this.a = name;
    }

    public ReportMapping getReportMapping() {
        return this.a;
    }

    public void setReportMapping(ReportMapping reportMapping) {
        this.a = reportMapping;
    }

    public String getDatasourceParamSuffix() {
        return this.datasourceParamSuffix;
    }

    public String getSubReportParamSuffix() {
        return this.subReportParamSuffix;
    }

    public void setDatasourceParamSuffix(String datasourceParamSuffix) {
        this.datasourceParamSuffix = datasourceParamSuffix;
    }

    public void setSubReportParamSuffix(String subReportParamSuffix) {
        this.subReportParamSuffix = subReportParamSuffix;
    }

    public String getReportLocation() {
        if (!this.reportLocation.endsWith("/")) {
            this.reportLocation = this.reportLocation + "/";
        }
        return this.reportLocation;
    }

    public void setReportLocation(String reportLocation) {
        this.reportLocation = reportLocation;
    }

    public Map getReportParameters() {
        return this.reportParameters;
    }

    public void setReportParameters(Map map) {
        this.reportParameters = map;
    }
}

