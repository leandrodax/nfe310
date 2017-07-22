/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.MedicamentoNotaTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaMedicamentoController
 *  br.gov.sp.fazenda.dsen.view.nfe.MedicamentoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.MedicamentoNotaTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.nfe.MedicamentoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class ProdutoNotaMedicamentoController
extends DSGEBaseController
implements CellEditorListener {
    private ProdutoNotaGUI a;
    private int a;

    public ProdutoNotaMedicamentoController(ViewItf view, int aba) {
        this.a = (ProdutoNotaGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
    }

    private void a() {
        List lista = this.a.getAllMedicamentoNotaTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                MedicamentoNotaTO medTO = (MedicamentoNotaTO)lista.get(i);
                medTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void b() {
        MedicamentoGUI medGUI = new MedicamentoGUI(this.a, null);
        medGUI.setVisible(true);
        MedicamentoNotaTO medicamentoTO = medGUI.getMedicamentoTO();
        if (medicamentoTO != null) {
            this.a.adicionarMedicamentoTO(medicamentoTO);
            this.a();
            this.a.verificarSelecionadosTabela(this.a.getSelectedMedicamentoTOs(), DSENLabelConstants.MEDICAMENTO);
        }
    }

    private void c() {
        this.a.removerMedicamentoTO(this.a.getSelectedMedicamentoTOs());
        this.a();
        this.a.verificarSelecionadosTabela(this.a.getSelectedMedicamentoTOs(), DSENLabelConstants.MEDICAMENTO);
    }

    private void d() {
        MedicamentoNotaTO medicamentoTO = this.a.getSelectedMedicamentoTO();
        if (medicamentoTO != null) {
            MedicamentoGUI medGUI = new MedicamentoGUI(this.a, medicamentoTO);
            medGUI.setVisible(true);
            medicamentoTO = medGUI.getMedicamentoTO();
            if (medicamentoTO != null) {
                this.a.refreshTableMedicamentos();
                this.a.verificarSelecionadosTabela(this.a.getSelectedMedicamentoTOs(), DSENLabelConstants.MEDICAMENTO);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("excluir")) {
            this.c();
        } else if (e.getActionCommand().equals("incluir")) {
            this.b();
        } else if (e.getActionCommand().equals("detalhar")) {
            this.d();
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a.verificarSelecionadosTabela(this.a.getSelectedMedicamentoTOs(), DSENLabelConstants.MEDICAMENTO);
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }
}

