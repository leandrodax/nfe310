/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 *  br.gov.sp.fazenda.dsge.report.util.ReportLoader
 *  net.sf.jasperreports.engine.JasperReport
 *  net.sf.jasperreports.engine.util.JRLoader
 */
package br.gov.sp.fazenda.dsge.report.util;

import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.io.InputStream;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class ReportLoader {
    public static JasperReport loadReport(String reportPath) throws DSGEReportException {
        JasperReport result;
        try {
            result = (JasperReport)JRLoader.loadObject((String)(reportPath + ".jasper"));
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getMainReportName().");
        }
        return result;
    }

    public static JasperReport loadReport(InputStream is) throws DSGEReportException {
        JasperReport result;
        try {
            result = (JasperReport)JRLoader.loadObject((InputStream)is);
        }
        catch (Exception e) {
            throw new DSGEReportException((Throwable)e, "Error in getMainReportName().");
        }
        return result;
    }
}

