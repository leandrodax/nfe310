/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoExportacaoController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoExportacaoGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoExportacaoGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class ProdutoExportacaoController
extends DSGEBaseController {
    private ProdutoExportacaoGUI a;
    private DSENUtilHelper a;

    public ProdutoExportacaoController(ViewItf view) throws DSGEUtilException {
        this.a = (ProdutoExportacaoGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a = DSENUtilHelper.getInstance();
        this.a.disableComponents("EXPORT_TODOS");
        if (!this.a.getOperacaoNota().equals("manterNotaOperacaoDetalhe")) {
            this.a.enableComponents("EXPORT_TODOS");
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("fechar")) {
            this.a();
        } else if (e.getActionCommand().equals("ok")) {
            this.b();
        }
    }

    private void a() {
        this.a.setVisible(false);
        this.a.dispose();
    }

    private void b() {
        ProdutoExportacaoTO exportTO = this.a.getProdutoExportacaoTO();
        if (exportTO.getChNFe() == null || exportTO.getNRE() == null || exportTO.getQExport() == null) {
            this.a.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
        } else {
            this.a.firePropertyChange(this.a.getOperacao(), exportTO);
            this.a();
        }
    }
}

