/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModeloNotaProdutorEnum
 *  br.gov.sp.fazenda.dsen.common.to.RefNFPTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.NotaReferenciadaProdutorController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaProdutorGUI
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.ModeloNotaProdutorEnum;
import br.gov.sp.fazenda.dsen.common.to.RefNFPTO;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaProdutorGUI;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;

public class NotaReferenciadaProdutorController
extends DSGEBaseController {
    private NotaReferenciadaProdutorGUI a;
    private DSENUtilHelper a;

    public NotaReferenciadaProdutorController(ViewItf view) throws DSGEUtilException {
        this.a = (NotaReferenciadaProdutorGUI)view;
        view.addActionListener((EventListener)this);
        this.a = DSENUtilHelper.getInstance();
        this.a();
        view.disableComponents("notaReferenciaProdutorAll");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            view.enableComponents("notaReferenciadaProdutorInit");
        }
    }

    private void a() throws DSGEUtilException {
        this.a.setListaTipoDocumento(TipoDocumentoEnum.values());
        this.a.setListaModeloNotaProdutor(ModeloNotaProdutorEnum.values());
        List listaUF = this.a.getEstadoTO(false);
        this.a.setListaUF(listaUF);
    }

    public void actionPerformed(ActionEvent e) {
        RefNFPTO refNFPTO = this.a.getRefNFPTO();
        if (refNFPTO.getSerie() == null || refNFPTO.getNNF() == null || refNFPTO.getMMAA() == null || refNFPTO.getMod() == null || refNFPTO.getDocumento() == null || refNFPTO.getCUF() == null && (refNFPTO.getCNPJ() == null || refNFPTO.getCPF() == null)) {
            this.a.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
        } else {
            this.a.firePropertyChange(this.a.getOperacao(), refNFPTO);
            this.a.getDigitarNotaGUI().refreshTableNFProdutorRef();
            this.a.setVisible(false);
            this.a.dispose();
        }
    }
}

