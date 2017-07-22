/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.DSGEReportManager
 *  br.gov.sp.fazenda.dsge.report.Report
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 *  br.gov.sp.fazenda.dsge.report.gui.CustomJRViewer
 *  br.gov.sp.fazenda.dsge.report.mapping.ReportMappings
 *  br.gov.sp.fazenda.dsge.report.util.ReportFactory
 *  br.gov.sp.fazenda.dsge.report.util.ReportHelper
 *  net.sf.jasperreports.engine.JasperPrint
 *  net.sf.jasperreports.engine.util.JRClassLoader
 *  net.sf.jasperreports.view.JRSaveContributor
 *  net.sf.jasperreports.view.JRViewer
 */
package br.gov.sp.fazenda.dsge.report;

import br.gov.sp.fazenda.dsge.report.Report;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import br.gov.sp.fazenda.dsge.report.gui.CustomJRViewer;
import br.gov.sp.fazenda.dsge.report.mapping.ReportMappings;
import br.gov.sp.fazenda.dsge.report.util.ReportFactory;
import br.gov.sp.fazenda.dsge.report.util.ReportHelper;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Locale;
import java.util.Map;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.util.JRClassLoader;
import net.sf.jasperreports.view.JRSaveContributor;
import net.sf.jasperreports.view.JRViewer;

public class DSGEReportManager {
    final String[] a = new String[]{"net.sf.jasperreports.view.save.JRPdfSaveContributor"};
    protected String reportConfigPath;
    protected static final String CONFIG_XML = "/reports.xml";
    protected static final String CONFIG_DTD = "/reports_1_0.dtd";
    protected ReportMappings reportMappings;

    protected DSGEReportManager() {
    }

    protected void initReportMappings(InputStream configXmlInputStream, URL configDtdURL) throws DSGEReportException {
        try {
            this.reportMappings = ReportHelper.initReportsDigester((InputStream)configXmlInputStream, (URL)configDtdURL);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new DSGEReportException((Throwable)ex, "Error in initReportMappings()");
        }
        finally {
            if (configXmlInputStream != null) {
                try {
                    configXmlInputStream.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    protected CustomJRViewer process(String reportName, Map reportParameters) throws Exception {
        try {
            Report reportInstance = ReportFactory.getReport((String)reportName, (ReportMappings)this.reportMappings);
            JasperPrint jasperPrint = reportInstance.generateJasperPrint(reportParameters);
            CustomJRViewer jrViewer = new CustomJRViewer(jasperPrint, new Locale("pt", "BR"));
            this.customSaveContributors((JRViewer)jrViewer);
            return jrViewer;
        }
        catch (Exception e) {
            throw new Exception("Error in ReportManager " + this.getClass().getName() + "method process()", e);
        }
    }

    public CustomJRViewer makeReport(String reportName, Map reportParameters) throws Exception {
        CustomJRViewer jrViewer = this.process(reportName, reportParameters);
        return jrViewer;
    }

    public JDialog makeReportWithPreview(String reportName, String title, Object parentGUi, boolean modal, Image icon, Map reportParameters) throws Exception {
        int width;
        JDialog dialog;
        boolean readOnly;
        CustomJRViewer jrViewer = this.process(reportName, reportParameters);
        jrViewer.setBtnReloadVisible(false);
        boolean bl = readOnly = reportParameters.get("readOnlyReport") != null && Boolean.valueOf(reportParameters.get("readOnlyReport").toString()) != false;
        if (readOnly) {
            jrViewer.setBtnPrintVisible(false);
            jrViewer.setBtnSaveVisible(false);
        }
        if (parentGUi instanceof Dialog) {
            dialog = new JDialog((Dialog)parentGUi, modal);
        } else if (parentGUi instanceof Frame) {
            dialog = new JDialog((Frame)parentGUi, modal);
        } else {
            dialog = new JDialog();
            dialog.setModal(modal);
        }
        dialog.setTitle(title);
        dialog.getContentPane().add((Component)jrViewer);
        if (icon != null) {
            dialog.setIconImage(icon);
        }
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenResolution = toolkit.getScreenResolution();
        float zoom = (float)screenResolution / 72.0f;
        int height = (int)(500.0f * zoom);
        if ((double)height > screenSize.getHeight()) {
            height = (int)screenSize.getHeight();
        }
        if ((double)(width = (int)(700.0f * zoom)) > screenSize.getWidth()) {
            width = (int)screenSize.getWidth();
        }
        Dimension dimension = new Dimension(width, height);
        dialog.setSize(dimension);
        dialog.setLocation((screenSize.width - width) / 2, (screenSize.height - height) / 2);
        dialog.setResizable(true);
        return dialog;
    }

    protected void customSaveContributors(JRViewer jrViewer) {
        int i;
        JRSaveContributor[] save = jrViewer.getSaveContributors();
        for (i = 0; i < save.length; ++i) {
            jrViewer.removeSaveContributor(save[i]);
        }
        for (i = 0; i < this.a.length; ++i) {
            try {
                Class saveContribClass = JRClassLoader.loadClassForName((String)this.a[i]);
                Method method = saveContribClass.getMethod("getInstance", null);
                JRSaveContributor saveContrib = (JRSaveContributor)method.invoke(null, null);
                jrViewer.addSaveContributor(saveContrib);
                continue;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

