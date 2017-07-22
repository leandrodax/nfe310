/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTOList
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ParametroController
 *  br.gov.sp.fazenda.dsen.controller.ParametroController$1
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.ParametroFacade
 *  br.gov.sp.fazenda.dsen.view.ManterParametroGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.to.ParametroTOList;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.ParametroController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.ParametroFacade;
import br.gov.sp.fazenda.dsen.view.ManterParametroGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;
import java.util.List;
import javax.swing.SwingUtilities;

public class ParametroController
extends DSGEBaseController
implements ItemListener {
    private ManterParametroGUI a;
    private ParametroFacade a = null;

    public ParametroController(ViewItf view) {
        this.a = (ManterParametroGUI)view;
        view.addActionListener((EventListener)this);
        this.a.disableComponents(this.a.getOperacao());
        this.a = new ParametroFacade();
    }

    private void a() {
        if (this.a.showQuestion(DSENMessageConstants.MSG_ALTERAR_PARAMETRO) == 0) {
            List listaParametros = this.a.getParametroTOList();
            this.a.disableComponents("updateParametro");
            try {
                listaParametros = this.a.updateParametros(listaParametros);
                this.a.enableComponents("updateParametro");
                List listaErros = ((ParametroTOList)listaParametros).getErros();
                if (!listaErros.isEmpty()) {
                    this.a.showMessage(listaErros);
                } else {
                    this.a.showMessage(listaParametros);
                    this.a.disableComponents("detailParametro");
                    this.a.setActionEditar();
                }
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void b() {
        ParametroTOList listaParametros = null;
        try {
            listaParametros = (ParametroTOList)this.a.selectParametros();
            this.a.setParametroTOList(listaParametros);
            this.a.disableComponents("detailParametro");
        }
        catch (DSENBusinessException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void c() {
        this.a.enableComponents("detailParametro");
        this.a.setActionAlterar();
    }

    private void d() {
        String path = FileChooserHelper.chooseDirectory((Component)this.a, (boolean)true, (boolean)true);
        if (path != null) {
            this.a.setDirLotesAutorizados(path);
        }
    }

    private void e() {
        String path = FileChooserHelper.chooseDirectory((Component)this.a, (boolean)true, (boolean)true);
        if (path != null) {
            this.a.setDirLotesGerados(path);
        }
    }

    private void f() {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("detalhar")) {
            this.b();
        } else if (event.getActionCommand().equals("editar")) {
            this.c();
        } else if (event.getActionCommand().equals("alterar")) {
            this.a();
        } else if (event.getActionCommand().equals("voltar")) {
            this.f();
        } else if (event.getActionCommand().equals("SELECIONAR_DIR_AUTORIZADOS")) {
            this.d();
        } else if (event.getActionCommand().equals("SELECIONAR_DIR_GERADOS")) {
            this.e();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }
}

