/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.report.DSENReportManager
 *  br.gov.sp.fazenda.dsge.report.DSGEReportManager
 */
package br.gov.sp.fazenda.dsen.report;

import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsge.report.DSGEReportManager;
import java.io.InputStream;
import java.net.URL;

public class DSENReportManager
extends DSGEReportManager {
    private static DSENReportManager a;

    public static DSENReportManager getInstance() {
        if (a == null) {
            a = new DSENReportManager();
        }
        try {
            String configPath = DSENProperties.getInstance().getReportConfigPath();
            InputStream configXmlInputStream = a.getClass().getResourceAsStream(configPath + "/reports.xml");
            URL configDtdURL = a.getClass().getResource(configPath + "/reports_1_0.dtd");
            a.initReportMappings(configXmlInputStream, configDtdURL);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }
}

