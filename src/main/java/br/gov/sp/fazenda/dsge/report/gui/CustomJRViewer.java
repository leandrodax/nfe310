/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.report.gui.CustomJRViewer
 *  net.sf.jasperreports.engine.JasperPrint
 *  net.sf.jasperreports.view.JRViewer
 */
package br.gov.sp.fazenda.dsge.report.gui;

import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

public class CustomJRViewer
extends JRViewer {
    private static final long a = 8699637211325558625L;

    public CustomJRViewer(JasperPrint jrPrint, Locale locale) {
        super(jrPrint, locale, null);
    }

    public void addPrintListener(ActionListener actionListener) {
        this.btnPrint.addActionListener(actionListener);
    }

    public void addSaveListener(ActionListener actionListener) {
        this.btnSave.addActionListener(actionListener);
    }

    public void setBtnReloadVisible(boolean visible) {
        this.btnReload.setVisible(visible);
    }

    public void setBtnPrintVisible(boolean visible) {
        this.btnPrint.setVisible(visible);
    }

    public void setBtnSaveVisible(boolean visible) {
        this.btnSave.setVisible(visible);
    }
}

