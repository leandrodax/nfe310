/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.RefNFTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.NotaReferenciadaController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.RefNFTO;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;

public class NotaReferenciadaController
extends DSGEBaseController {
    private NotaReferenciadaGUI a;
    private DSENUtilHelper a;

    public NotaReferenciadaController(ViewItf view) throws DSGEUtilException {
        this.a = (NotaReferenciadaGUI)view;
        view.addActionListener((EventListener)this);
        this.a = DSENUtilHelper.getInstance();
        this.a();
        view.disableComponents("notaReferenciadaAll");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            view.enableComponents("notaReferenciadaInit");
        }
    }

    private void a() throws DSGEUtilException {
        List listaUF = this.a.getEstadoTO(true);
        this.a.setListaUF(listaUF);
    }

    public void actionPerformed(ActionEvent e) {
        RefNFTO refNFTO = this.a.getRefNFTO();
        switch (refNFTO.getTipoRefNF()) {
            case 0: {
                if (refNFTO.getChave() == null) {
                    this.a.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
                    break;
                }
                this.a.firePropertyChange(this.a.getOperacao(), refNFTO);
                this.a.getDigitarNfeGUI().refreshTableNotasRef();
                this.a.setVisible(false);
                this.a.dispose();
                break;
            }
            case 1: {
                if (refNFTO.getSerie() == null || refNFTO.getNNF() == null || refNFTO.getCUF() == null || refNFTO.getMMAA() == null || refNFTO.getCNPJ().trim().replaceAll("", "") == null) {
                    this.a.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
                    break;
                }
                this.a.firePropertyChange(this.a.getOperacao(), refNFTO);
                this.a.getDigitarNfeGUI().refreshTableNotasRef();
                this.a.setVisible(false);
                this.a.dispose();
                break;
            }
            case 2: {
                if (refNFTO.getChave() == null) {
                    this.a.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
                    break;
                }
                this.a.firePropertyChange(this.a.getOperacao(), refNFTO);
                this.a.getDigitarNfeGUI().refreshTableNotasRef();
                this.a.setVisible(false);
                this.a.dispose();
                break;
            }
            default: {
                this.a.firePropertyChange(this.a.getOperacao(), refNFTO);
                this.a.getDigitarNfeGUI().refreshTableNotasRef();
                this.a.setVisible(false);
                this.a.dispose();
            }
        }
    }
}

