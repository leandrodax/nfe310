/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.BackupController
 *  br.gov.sp.fazenda.dsen.controller.BackupController$1
 *  br.gov.sp.fazenda.dsen.controller.BackupController$2
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsen.view.BackupGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.BackupController;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsen.view.BackupGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.EventListener;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class BackupController
extends DSGEBaseController {
    private SistemaFacade a;
    private BackupGUI a;
    private File a = null;

    public BackupController(ViewItf view) {
        this.a = (BackupGUI)view;
        view.addActionListener((EventListener)this);
        this.a = new SistemaFacade();
    }

    private void a() {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void b() {
        String path = FileChooserHelper.chooseDirectory((Component)DSENDesktop.getInstance(), (boolean)true, (boolean)true);
        if (path == null) {
            return;
        }
        this.a = new File(path);
        this.a.setTxtLocal(this.a.getAbsolutePath());
    }

    private void c() {
        if (this.a == null) {
            this.a.showMessage(DSENMessageConstants.SELECIONE_UM_DIRETORIO);
            return;
        }
        int resposta = this.a.showQuestion(DSENMessageConstants.CONFIRMA_BACKUP_QUESTION);
        if (resposta == 0 && FileChooserHelper.validateDirectoryChoosed((File)this.a, (Component)this.a, (boolean)true, (boolean)true)) {
            this.a.setBackupRunning(true);
            this.a.getProgressBar().setIndeterminate(true);
             s = new /* Unavailable Anonymous Inner Class!! */;
            s.execute();
        }
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("selecionarBackup")) {
            this.b();
        } else if (event.getActionCommand().equals("executarBackup")) {
            this.c();
        } else if (event.getActionCommand().equals("voltar")) {
            this.a();
        }
    }

    static /* synthetic */ File a(BackupController x0) {
        return x0.a;
    }

    static /* synthetic */ SistemaFacade a(BackupController x0) {
        return x0.a;
    }

    static /* synthetic */ BackupGUI a(BackupController x0) {
        return x0.a;
    }
}

