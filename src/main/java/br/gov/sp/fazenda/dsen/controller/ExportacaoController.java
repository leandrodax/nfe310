/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ExportacaoController
 *  br.gov.sp.fazenda.dsen.controller.ExportacaoController$1
 *  br.gov.sp.fazenda.dsen.model.facade.ClienteFacade
 *  br.gov.sp.fazenda.dsen.model.facade.EmitenteFacade
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.model.facade.ProdutoFacade
 *  br.gov.sp.fazenda.dsen.model.facade.TransportadoraFacade
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.controller.exportacao.InformacaoExportacaoController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exportacao.InformacaoExportacaoGUI
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.ExportacaoController;
import br.gov.sp.fazenda.dsen.model.facade.ClienteFacade;
import br.gov.sp.fazenda.dsen.model.facade.EmitenteFacade;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.model.facade.ProdutoFacade;
import br.gov.sp.fazenda.dsen.model.facade.TransportadoraFacade;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.controller.exportacao.InformacaoExportacaoController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exportacao.InformacaoExportacaoGUI;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ExportacaoController
extends DSGEBaseController {
    private ExportacaoGUI a;
    private InformacaoExportacaoController a;
    private EmitenteFacade a;
    private TransportadoraFacade a;
    private ClienteFacade a;
    private ProdutoFacade a;
    private NotaFiscalFacade a;

    public ExportacaoController(ViewItf view) {
        this.a = (ExportacaoGUI)view;
        this.a = new EmitenteFacade();
        this.a = new TransportadoraFacade();
        this.a = new ClienteFacade();
        this.a = new ProdutoFacade();
        this.a = new NotaFiscalFacade();
        this.a.addActionListener((EventListener)this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("exportar")) {
            this.exportar();
        } else if (e.getActionCommand().equals("cancelar")) {
            this.a();
        } else if (e.getActionCommand().equals("buscarLogotipo")) {
            this.b();
        }
    }

    public void exportar() {
        List toList = this.a.getListaBaseTO();
        TipoDocumentoArquivoEnum tpDocEnum = this.a.getTpDocEnum();
        ExtensaoArquivoEnum extensaoArquivoEnum = this.a.getExtensaoArquivoEnum();
        String path = this.a.getExportacaoPath();
        if (StringHelper.isBlankOrNull((Object)path)) {
            this.a.showMessage(DSENMessageConstants.ESCOLHA_LOCAL);
            return;
        }
        this.a = new InformacaoExportacaoController((Dialog)this.a);
        this.a.inicializar();
         exportWorker = new /* Unavailable Anonymous Inner Class!! */;
        exportWorker.execute();
        this.a.getGUI().setVisible(true);
    }

    private void a() {
        this.a.setVisible(false);
    }

    private void b() {
        String path = this.a.isBtnTxtSelected() ? FileChooserHelper.chooseFile((Component)this.a, (String)(this.a.getTpDocEnum().name().toUpperCase() + ".txt"), (FileNameExtensionFilter)new FileNameExtensionFilter("Arquivos de texto (*.txt)", "txt")) : FileChooserHelper.chooseDirectory((Component)this.a, (boolean)true, (boolean)true);
        if (path != null) {
            this.a.setExportacaoPath(path);
        }
    }

    static /* synthetic */ ClienteFacade a(ExportacaoController x0) {
        return x0.a;
    }

    static /* synthetic */ EmitenteFacade a(ExportacaoController x0) {
        return x0.a;
    }

    static /* synthetic */ NotaFiscalFacade a(ExportacaoController x0) {
        return x0.a;
    }

    static /* synthetic */ ProdutoFacade a(ExportacaoController x0) {
        return x0.a;
    }

    static /* synthetic */ TransportadoraFacade a(ExportacaoController x0) {
        return x0.a;
    }

    static /* synthetic */ InformacaoExportacaoController a(ExportacaoController x0) {
        return x0.a;
    }
}

