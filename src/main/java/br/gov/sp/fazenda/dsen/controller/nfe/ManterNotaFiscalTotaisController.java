/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeEspecialTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalTotaisController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.RegimeEspecialTributarioEnum;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class ManterNotaFiscalTotaisController
extends DSGEBaseController {
    private DigitarNotaFiscalGUI a;
    private int a;
    private NotaFiscalFacade a;

    public ManterNotaFiscalTotaisController(ViewItf view, int aba) {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
        this.a = new NotaFiscalFacade();
        this.a.setListaISSRegimeEspecial(RegimeEspecialTributarioEnum.values());
    }

    private void a() {
        NotaFiscalTO notaFiscalTO = this.a.getUpdatedNotaFiscalTO();
        if (notaFiscalTO != null) {
            try {
                this.a.calcularNotaFiscalTotais(notaFiscalTO);
                this.a.setNotaFiscalTO(notaFiscalTO);
            }
            catch (DSENBusinessException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("calcular")) {
            this.a();
        }
    }
}

