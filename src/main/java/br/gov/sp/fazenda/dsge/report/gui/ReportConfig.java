/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.gui.ReportConfig
 */
package br.gov.sp.fazenda.dsge.report.gui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ReportConfig {
    private static Properties a;
    private static final String a = "/reports.properties";
    public static String CONFIG_PATH_DEFAULT_KEY;
    private static ReportConfig a;

    private ReportConfig() {
    }

    public static Properties getPropertiesFile() {
        if (a == null) {
            a = new Properties();
            try {
                a.load(ReportConfig.class.getResourceAsStream("/reports.properties"));
            }
            catch (FileNotFoundException e) {
                throw new RuntimeException("Arquivo de propriedades /reports.properties n\u00e3o encontrado");
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return a;
    }

    static {
        CONFIG_PATH_DEFAULT_KEY = "config.path.default";
    }
}

