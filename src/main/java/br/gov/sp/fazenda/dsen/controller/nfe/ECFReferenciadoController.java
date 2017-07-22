/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModeloECFEnum
 *  br.gov.sp.fazenda.dsen.common.to.RefECFTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.ECFReferenciadoController
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ECFReferenciadoGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.ModeloECFEnum;
import br.gov.sp.fazenda.dsen.common.to.RefECFTO;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ECFReferenciadoGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class ECFReferenciadoController
extends DSGEBaseController {
    private ECFReferenciadoGUI a;

    public ECFReferenciadoController(ViewItf view) throws DSGEUtilException {
        this.a = (ECFReferenciadoGUI)view;
        view.addActionListener((EventListener)this);
        this.a();
        view.disableComponents("notaECFReferenciadoAll");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            view.enableComponents("notaECFReferenciadoInit");
        }
    }

    private void a() throws DSGEUtilException {
        this.a.setListaModeloECF(ModeloECFEnum.values());
    }

    public void actionPerformed(ActionEvent e) {
        RefECFTO refECFTO = this.a.getRefECFTO();
        if (refECFTO.getNECF() == null || refECFTO.getNCOO() == null || refECFTO.getMod() == null) {
            this.a.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
        } else {
            this.a.firePropertyChange(this.a.getOperacao(), refECFTO);
            this.a.getDigitarNotaGUI().refreshTableECFRef();
            this.a.setVisible(false);
            this.a.dispose();
        }
    }
}

