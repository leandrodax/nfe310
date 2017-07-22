/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ArmaTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaArmamentoController
 *  br.gov.sp.fazenda.dsen.view.nfe.ArmamentoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.ArmaTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.view.nfe.ArmamentoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class ProdutoNotaArmamentoController
extends DSGEBaseController
implements CellEditorListener {
    private ProdutoNotaGUI a;
    private int a;

    public ProdutoNotaArmamentoController(ViewItf view, int aba) {
        this.a = (ProdutoNotaGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
    }

    private void a() {
        List lista = this.a.getAllArmaTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                ArmaTO armaTO = (ArmaTO)lista.get(i);
                armaTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void b() {
        ArmamentoGUI armaGUI = new ArmamentoGUI(this.a, null);
        armaGUI.setVisible(true);
        ArmaTO armaTO = armaGUI.getArmamentoTO();
        if (armaTO != null) {
            this.a.adicionarArmamentoTO(armaTO);
            this.a();
            this.a.verificarSelecionadosTabela(this.a.getSelectedArmaTOs(), DSENLabelConstants.ARMAMENTO);
        }
    }

    private void c() {
        this.a.removerArmamentoTO(this.a.getSelectedArmaTOs());
        this.a();
        this.a.verificarSelecionadosTabela(this.a.getSelectedArmaTOs(), DSENLabelConstants.ARMAMENTO);
    }

    private void d() {
        ArmaTO armaTO = this.a.getSelectedArmaTO();
        if (armaTO != null) {
            ArmamentoGUI armaGUI = new ArmamentoGUI(this.a, armaTO);
            armaGUI.setVisible(true);
            armaTO = armaGUI.getArmamentoTO();
            if (armaTO != null) {
                this.a.refreshTableArmamentos();
                this.a.verificarSelecionadosTabela(this.a.getSelectedArmaTOs(), DSENLabelConstants.ARMAMENTO);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("incluir")) {
            this.b();
        } else if (e.getActionCommand().equals("excluir")) {
            this.c();
        } else if (e.getActionCommand().equals("detalhar")) {
            this.d();
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a.verificarSelecionadosTabela(this.a.getSelectedArmaTOs(), DSENLabelConstants.ARMAMENTO);
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }
}

