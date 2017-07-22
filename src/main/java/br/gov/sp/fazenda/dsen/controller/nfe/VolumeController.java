/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.LacreTO
 *  br.gov.sp.fazenda.dsen.common.to.VolumeTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.VolumeController
 *  br.gov.sp.fazenda.dsen.view.nfe.VolumeGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.LacreTO;
import br.gov.sp.fazenda.dsen.common.to.VolumeTO;
import br.gov.sp.fazenda.dsen.view.nfe.VolumeGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class VolumeController
extends DSGEBaseController
implements CellEditorListener {
    private VolumeGUI a;

    public VolumeController(ViewItf view) {
        this.a = (VolumeGUI)view;
        view.addActionListener((EventListener)this);
        view.disableComponents("volumeTodos");
        view.disableComponents("volumeInicioDesabilitado");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            view.enableComponents("volumeTodos");
        }
    }

    private void a() {
        List lista = this.a.getSelectedLacreTOs();
        this.a.disableComponents("volumeInicioDesabilitado");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            if (lista != null && lista.size() == 1) {
                this.a.enableComponents("volumeUmLacreSelecionado");
            } else if (lista != null && lista.size() > 0) {
                this.a.enableComponents("volumeVariosLacresSelecionados");
            }
        }
    }

    private void b() {
        List lista = this.a.getAllLacreTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                LacreTO lacreTO = (LacreTO)lista.get(i);
                lacreTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void c() {
        this.a.adicionarLacreTO();
        this.b();
    }

    private void d() {
        LacreTO lacreTO = this.a.getSelectedLacreTO();
        if (lacreTO != null) {
            this.a.editarLacreTO(lacreTO);
            this.a();
        }
    }

    private void e() {
        LacreTO lacreTO = this.a.getSelectedLacreTO();
        if (lacreTO != null) {
            this.a.alterarLacreTO(lacreTO);
            this.a();
        }
    }

    private void f() {
        this.a.cancelarEdicaoLacreTO();
        this.a();
    }

    private void g() {
        List lista = this.a.getSelectedLacreTOs();
        if (lista != null) {
            this.a.excluirLacreTO(lista);
            this.b();
            this.a();
        }
    }

    private void h() {
        VolumeTO volumeTO = this.a.getVolumeTO();
        if (volumeTO != null) {
            if (this.a.isInclusao()) {
                this.a.firePropertyChange("volumeCarregado", volumeTO);
            } else {
                this.a.firePropertyChange("VOLUME_ALTERADO", volumeTO);
            }
            this.a.fechar();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("incluir")) {
            this.c();
        } else if (e.getActionCommand().equals("editar")) {
            this.d();
        } else if (e.getActionCommand().equals("excluir")) {
            this.g();
        } else if (e.getActionCommand().equals("ok")) {
            this.h();
        } else if (e.getActionCommand().equals("alterar")) {
            this.e();
        } else if (e.getActionCommand().equals("cancelar")) {
            this.f();
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a();
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }
}

