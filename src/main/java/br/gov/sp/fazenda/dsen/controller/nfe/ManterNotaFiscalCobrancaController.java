/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DuplicataTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalCobrancaController
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DuplicataGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.DuplicataTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.DuplicataGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;

public class ManterNotaFiscalCobrancaController
extends DSGEBaseController {
    private DigitarNotaFiscalGUI a;
    private int a;

    public ManterNotaFiscalCobrancaController(ViewItf view, int aba) {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
    }

    private void a() {
        List lista = this.a.getAllDuplicataTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                DuplicataTO dupTO = (DuplicataTO)lista.get(i);
                dupTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void b() {
        List lista = this.a.getAllDuplicataTO();
        if (lista != null && lista.size() == DSENConstants.MAX_DUPLICATA_NFE) {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_QTDE_DUPLICATAS, DSENConstants.MAX_DUPLICATA_NFE));
        } else {
            DuplicataGUI duplicataGUI = new DuplicataGUI(this.a, null);
            duplicataGUI.setVisible(true);
            DuplicataTO duplicataTO = duplicataGUI.getDuplicataTO();
            if (duplicataTO != null) {
                this.a.adicionarDuplicataTO(duplicataTO);
                this.a();
                this.a.verificarSelecionadosTabela(this.a.getSelectedDuplicataTOs(), DSENLabelConstants.DUPLICATA);
            }
        }
    }

    private void c() {
        DuplicataTO duplicataTO = this.a.getSelectedDuplicataTO();
        if (duplicataTO != null) {
            DuplicataGUI duplicataGUI = new DuplicataGUI(this.a, duplicataTO);
            duplicataGUI.setVisible(true);
            duplicataTO = duplicataGUI.getDuplicataTO();
            if (duplicataTO != null) {
                this.a.refreshTableDuplicatas();
                this.a.verificarSelecionadosTabela(this.a.getSelectedDuplicataTOs(), DSENLabelConstants.DUPLICATA);
            }
        }
    }

    private void d() {
        List lista = this.a.getSelectedDuplicataTOs();
        if (lista != null) {
            this.a.excluirDuplicataTO(lista);
            this.a();
            this.a.verificarSelecionadosTabela(this.a.getSelectedDuplicataTOs(), DSENLabelConstants.DUPLICATA);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("detalhar")) {
            this.c();
        } else if (e.getActionCommand().equals("excluir")) {
            this.d();
        } else if (e.getActionCommand().equals("incluir")) {
            this.b();
        }
    }
}

