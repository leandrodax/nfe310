/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.controller.DetalharDpecController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.DetalharDpecGUI
 *  br.gov.sp.fazenda.dsen.view.EmitirDanfeGUI
 *  br.gov.sp.fazenda.dsen.view.ProblemaDpecDanfeGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.DetalharDpecGUI;
import br.gov.sp.fazenda.dsen.view.EmitirDanfeGUI;
import br.gov.sp.fazenda.dsen.view.ProblemaDpecDanfeGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DetalharDpecController
extends DSGEBaseController
implements CellEditorListener {
    DetalharDpecGUI a;
    NotaFiscalFacade a;

    public DetalharDpecController(ViewItf view) {
        this.a = (DetalharDpecGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a = new NotaFiscalFacade();
    }

    public void actionPerformed(ActionEvent e) {
        if ("fechar".equals(e.getActionCommand())) {
            this.b();
        } else if ("salvar".equals(e.getActionCommand())) {
            this.a();
        } else if ("ACTION_IMPRIMIR_DANFE".equals(e.getActionCommand())) {
            this.c();
        }
    }

    private void a() {
        DpecTO dpecTO = this.a.getDpecTO();
        String path = FileChooserHelper.chooseFile((Component)this.a, (String)dpecTO.getNomeArquivo(), (FileNameExtensionFilter)new FileNameExtensionFilter("Arquivos de DPEC(*.xml)", "xml"));
        if (!StringHelper.isBlankOrNull((Object)path)) {
            NotaFiscalFacade facade = new NotaFiscalFacade();
            dpecTO.setPathArquivo(path);
            try {
                facade.gravarDpec(dpecTO);
            }
            catch (DSENBusinessException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        }
    }

    private void b() {
        WindowManager.getInstance().closePanel();
    }

    private void c() {
        try {
            List listaDpecNotaFiscalTO = this.a.getSelectedDpecNotaFiscalTO();
            ArrayList problemas = new ArrayList();
            List listaNotaFiscalTO = this.a.pesquisarNotaFiscalDPECNotaFiscal(listaDpecNotaFiscalTO, problemas);
            for (NotaFiscalTO nota : listaNotaFiscalTO) {
                nota.setNumeroRegistroDPEC(this.a.getDpecTO().getNumeroRegistro());
                nota.setDataRegistroDPEC(this.a.getDpecTO().getDataRegistro());
            }
            if (problemas.isEmpty()) {
                EmitirDanfeGUI emitirDanfeGUI = new EmitirDanfeGUI((Frame)DSENDesktop.getInstance(), false);
                emitirDanfeGUI.setSelectedNotas(listaNotaFiscalTO);
                emitirDanfeGUI.setVisible(true);
            } else {
                ProblemaDpecDanfeGUI.mostrarProblemas((Frame)DSENDesktop.getInstance(), problemas);
            }
        }
        catch (DSGEBaseException e) {
            this.a.showErrors(e);
        }
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        if (this.a.getSelectedDpecNotaFiscalTO() == null || this.a.getSelectedDpecNotaFiscalTO().isEmpty()) {
            this.a.disableComponents("DPEC_NOTAFISCAL_SELECIONADO");
        } else {
            this.a.enableComponents("DPEC_NOTAFISCAL_SELECIONADO");
        }
    }
}

