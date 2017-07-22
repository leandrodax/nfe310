/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.RestoreController
 *  br.gov.sp.fazenda.dsen.controller.RestoreController$1
 *  br.gov.sp.fazenda.dsen.controller.RestoreController$2
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsen.view.RestoreGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.DSGEDialog
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 *  org.apache.log4j.Logger
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.RestoreController;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsen.view.RestoreGUI;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.DSGEDialog;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.log4j.Logger;

public class RestoreController
extends DSGEBaseController {
    private SistemaFacade a;
    private RestoreGUI a;
    private Logger a;

    public RestoreController(ViewItf view) {
        this.a = Logger.getLogger(this.getClass());
        this.a = (RestoreGUI)view;
        view.addActionListener((EventListener)this);
        this.a = new SistemaFacade();
    }

    public RestoreController(DSGEDialog view) {
        this.a = Logger.getLogger(this.getClass());
        view.addActionListener((EventListener)this);
        this.a = new SistemaFacade();
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("selecionarRestore")) {
            this.b();
        } else if (event.getActionCommand().equals("executarRestore")) {
            this.c();
        } else if (event.getActionCommand().equals("voltar")) {
            this.a();
        }
    }

    private void a() {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
        String path = FileChooserHelper.chooseFile((Component)this.a, (boolean)false, (boolean)true, (FileNameExtensionFilter)new FileNameExtensionFilter(DSENMessageConstants.BACKUP_FILE_DESC, DSENMessageConstants.BACKUP_FILE_EXTENSION));
        if (path != null) {
            this.a.getTxtLocal().setText(path);
        }
    }

    private void c() {
        String path = this.a.getTxtLocal().getText();
        if (StringHelper.isBlankOrNull((Object)path)) {
            this.a.showMessage(DSENMessageConstants.SELECIONE_ARQUIVO_DE_BACKUP);
            return;
        }
        int resposta = this.a.showQuestion(DSENMessageConstants.MENSAGEM_CONFIRMACAO_RESTORE);
        if (resposta == 0) {
            this.a.debug((Object)"(RestoreController.executarRestore) Inicio");
            this.a.setBackupRunning(true);
            this.a.getProgressBar().setIndeterminate(true);
             s = new /* Unavailable Anonymous Inner Class!! */;
            s.execute();
        }
    }

    static /* synthetic */ SistemaFacade a(RestoreController x0) {
        return x0.a;
    }

    static /* synthetic */ RestoreGUI a(RestoreController x0) {
        return x0.a;
    }

    static /* synthetic */ Logger a(RestoreController x0) {
        return x0.a;
    }
}

