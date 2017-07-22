/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource
 *  net.sf.jasperreports.engine.JRDataSource
 */
package br.gov.sp.fazenda.dsge.report.data.datasource;

import java.util.Collection;
import net.sf.jasperreports.engine.JRDataSource;

public interface ReportDataSource
extends JRDataSource {
    public boolean isEmpty();

    public Collection getReportCollectionData();
}

