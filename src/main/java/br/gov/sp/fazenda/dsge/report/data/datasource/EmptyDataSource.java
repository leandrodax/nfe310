/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.data.datasource.EmptyDataSource
 *  br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource
 *  net.sf.jasperreports.engine.JREmptyDataSource
 */
package br.gov.sp.fazenda.dsge.report.data.datasource;

import br.gov.sp.fazenda.dsge.report.data.datasource.ReportDataSource;
import java.util.Collection;
import net.sf.jasperreports.engine.JREmptyDataSource;

public class EmptyDataSource
extends JREmptyDataSource
implements ReportDataSource {
    public boolean isEmpty() {
        return true;
    }

    public Collection getReportCollectionData() {
        return null;
    }
}

