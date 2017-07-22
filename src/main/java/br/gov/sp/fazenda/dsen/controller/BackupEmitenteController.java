/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.controller.BackupEmitenteController
 *  br.gov.sp.fazenda.dsen.controller.BackupEmitenteController$BackupEmitenteWorker
 *  br.gov.sp.fazenda.dsen.controller.BackupEmitenteController$RestoreEmitenteWorker
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsen.view.BackupEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.controller.BackupEmitenteController;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsen.view.BackupEmitenteGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import java.text.MessageFormat;
import java.util.EventListener;

public class BackupEmitenteController
extends DSGEBaseController {
    private BackupEmitenteGUI a;
    private static final String a = "EMITENTE.BKP";
    private SistemaFacade a;

    public BackupEmitenteController(ViewItf view) {
        this.a = (BackupEmitenteGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a = new SistemaFacade();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("procurar")) {
            this.a();
        } else if (e.getActionCommand().equals("executarBackup") && this.a.getOperacao() == 0) {
            this.b();
        } else if (e.getActionCommand().equals("executarBackup") && this.a.getOperacao() == 1) {
            this.c();
        } else if (e.getActionCommand().equals("voltar")) {
            this.d();
        }
    }

    private void a() {
        String path;
        if (0 == this.a.getOperacao()) {
            String path2 = FileChooserHelper.chooseDirectory((Component)this.a, (boolean)true, (boolean)true);
            if (!StringHelper.isBlankOrNull((Object)path2)) {
                this.a.setCaminho(path2 + File.separator + "EMITENTE.BKP");
            }
        } else if (1 == this.a.getOperacao() && !StringHelper.isBlankOrNull((Object)(path = FileChooserHelper.chooseDirectory((Component)this.a, (boolean)false, (boolean)true)))) {
            String fileName = path + File.separator + "EMITENTE.BKP";
            File f = new File(fileName);
            if (!f.exists()) {
                this.a.showMessage(MessageFormat.format(DSGEMessageConstants.ARQUIVO_X_NAO_EXISTE, fileName));
                this.a.setCaminho("");
            } else if (!f.canRead()) {
                this.a.showMessage(MessageFormat.format(DSGEMessageConstants.NAO_EXISTE_PERMISSAO_LEITURA_ARQUIVO_X, fileName));
                this.a.setCaminho("");
            } else {
                this.a.setCaminho(path + File.separator + "EMITENTE.BKP");
            }
        }
    }

    private void b() {
        new BackupEmitenteWorker(this).execute();
    }

    private void c() {
        new RestoreEmitenteWorker(this).execute();
    }

    private void d() {
        this.a.firePropertyChange("insertEmitente");
        WindowManager.getInstance().closePanel();
    }

    static /* synthetic */ BackupEmitenteGUI a(BackupEmitenteController x0) {
        return x0.a;
    }

    static /* synthetic */ SistemaFacade a(BackupEmitenteController x0) {
        return x0.a;
    }
}

