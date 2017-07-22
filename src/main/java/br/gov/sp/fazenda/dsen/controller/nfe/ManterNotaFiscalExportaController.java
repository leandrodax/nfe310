/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalExportaController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;

public class ManterNotaFiscalExportaController
extends DSGEBaseController {
    private DigitarNotaFiscalGUI a;
    private int a;
    private DSENUtilHelper a;

    public ManterNotaFiscalExportaController(ViewItf view, int aba) throws DSGEUtilException {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
        this.a = DSENUtilHelper.getInstance();
        this.a();
    }

    private void a() throws DSGEUtilException {
        this.a.setListaInfoUF(this.a.getEstadoTO(true));
    }

    public void actionPerformed(ActionEvent e) {
    }
}

