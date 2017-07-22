/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.AvisoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.controller.AvisoController
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsen.view.AvisoGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarFaixaParaInutilizarGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.AvisoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsen.view.AvisoGUI;
import br.gov.sp.fazenda.dsen.view.PesquisarFaixaParaInutilizarGUI;
import br.gov.sp.fazenda.dsen.view.PesquisarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AvisoController
extends DSGEBaseController {
    private static Log a = LogFactory.getLog(AvisoController.class);
    private SistemaFacade a;
    private AvisoGUI a;

    public AvisoController(ViewItf view) {
        this.a = (AvisoGUI)view;
        view.addActionListener((EventListener)this);
        this.a = new SistemaFacade();
        this.g();
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("ACTION_INICIAR_BUSCA_SEFAZ")) {
            this.b();
        } else if (event.getActionCommand().equals("ACTION_VISUALIZAR_NFE_CONTING_N_TRANS")) {
            this.c();
        } else if (event.getActionCommand().equals("ACTION_VISUALIZAR_NFE_CONTING_DPEC_N_TRANS")) {
            this.d();
        } else if (event.getActionCommand().equals("ACTION_VISUALIZAR_NFE_CONTING_FSDA_N_TRANS")) {
            this.e();
        } else if (event.getActionCommand().equals("ACTION_VISUALIZAR_FAIXAS_INUT")) {
            this.f();
        } else if (event.getActionCommand().equals("ACTION_VISUALIZAR_AUTORIZADA_NAO_EXPORTADA_XML")) {
            this.a();
        } else if (event.getActionCommand().equals("voltar")) {
            WindowManager.getInstance().closePanel();
        }
    }

    private void a() {
        try {
            PesquisarNotaFiscalGUI gui = new PesquisarNotaFiscalGUI("ACTION_VISUALIZAR_AUTORIZADA_NAO_EXPORTADA_XML");
            WindowManager.getInstance().showPanel((DSGEPanel)gui, true);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void b() {
        try {
            PesquisarNotaFiscalGUI gui = new PesquisarNotaFiscalGUI("ACTION_VISUALIZAR_NFE_EM_PROCESSAMENTO_SEFAZ");
            WindowManager.getInstance().showPanel((DSGEPanel)gui, true);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void c() {
        try {
            PesquisarNotaFiscalGUI gui = new PesquisarNotaFiscalGUI("ACTION_VISUALIZAR_NFE_CONTING_N_TRANS");
            WindowManager.getInstance().showPanel((DSGEPanel)gui, true);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void d() {
        try {
            PesquisarNotaFiscalGUI gui = new PesquisarNotaFiscalGUI("ACTION_VISUALIZAR_NFE_CONTING_DPEC_N_TRANS");
            WindowManager.getInstance().showPanel((DSGEPanel)gui, true);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void e() {
        try {
            PesquisarNotaFiscalGUI gui = new PesquisarNotaFiscalGUI("ACTION_VISUALIZAR_NFE_CONTING_FSDA_N_TRANS");
            WindowManager.getInstance().showPanel((DSGEPanel)gui, true);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void f() {
        try {
            PesquisarFaixaParaInutilizarGUI gui = new PesquisarFaixaParaInutilizarGUI("PESQUISAR_FAIXAS_INUTILIZACAO");
            WindowManager.getInstance().showPanel((DSGEPanel)gui, true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void g() {
        try {
            a.debug((Object)"Pesquisando avisos...");
            AvisoTO aviso = this.a.verificarAvisos((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
            this.a.showAviso(aviso);
            boolean buscaRunning = AppContext.getInstance().isBuscaRetornoSEFAZRunning();
            this.a.setBuscaSefazEnabled(!buscaRunning);
            if ("VISUALIZAR_AVISOS".equals(this.a.getOperacao()) || "VISUALIZAR_AVISOS_INICIALIZACAO".equals(this.a.getOperacao())) {
                WindowManager.getInstance().showPanel((DSGEPanel)this.a, true);
            }
            this.a.mostrarFaixasNumeracao(true);
            a.debug((Object)"Avisos exibidos...");
        }
        catch (DSGEBaseException e) {
            this.a.showErrors(e);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

