/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.DSENSystemController
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsen.model.database.util.NetworkServerManager
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.ParametroFacade
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueSender
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.DSENStatusBAR
 *  br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.IOHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGESystemController
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper
 *  br.gov.sp.fazenda.dsge.model.database.util.DSGENetworkServerManager
 *  br.gov.sp.fazenda.dsge.model.queue.QueueListener
 *  br.gov.sp.fazenda.dsge.model.queue.QueueManager
 *  br.gov.sp.fazenda.dsge.model.queue.QueueSender
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper;
import br.gov.sp.fazenda.dsen.model.database.util.NetworkServerManager;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.ParametroFacade;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueSender;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.DSENStatusBAR;
import br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.IOHelper;
import br.gov.sp.fazenda.dsge.controller.DSGESystemController;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper;
import br.gov.sp.fazenda.dsge.model.database.util.DSGENetworkServerManager;
import br.gov.sp.fazenda.dsge.model.queue.QueueListener;
import br.gov.sp.fazenda.dsge.model.queue.QueueManager;
import br.gov.sp.fazenda.dsge.model.queue.QueueSender;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DSENSystemController
extends DSGESystemController<DSENSystemController> {
    private static Log a = LogFactory.getLog(DSENSystemController.class);

    public String getFileLockMessage() {
        return DSENMessageConstants.MSG_JA_EXISTE_INSTANCIA;
    }

    public String getFileLockName() {
        return "nfe310.lock";
    }

    public void execAfterStartApp() throws Exception {
        this.b();
        this.c();
        this.e();
        this.a();
        a.info((Object)("Aplicativo iniciado em " + (System.currentTimeMillis() - DSENDesktop.INICIO_APLICATIVO) + "ms!"));
    }

    private void a() {
        QueueManager manager = QueueManager.getInstance(BuscaRetornoQueueItem.class);
        manager.setSender((QueueSender)new BuscaRetornoQueueSender());
        manager.addListener((QueueListener)DSENDesktop.getInstance().getStatusBar());
    }

    private void b() throws DSENBusinessException {
        SistemaFacade sistemaFacade = new SistemaFacade();
        sistemaFacade.verificarVersao();
    }

    private void c() {
        try {
            ParametroFacade f = new ParametroFacade();
            f.carregaParametrosAppContext();
        }
        catch (DSENBusinessException e) {
            DSGEMessageDialog.showErrors((DSGEBaseException)e);
        }
    }

    private void d() {
        ParametroTO parametroTO = null;
        parametroTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_GERADO_DIR, ParametroTO.class);
        IOHelper.verifyFile((String)parametroTO.getValor(), (boolean)true);
        parametroTO = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_AUTORIZADO_DIR, ParametroTO.class);
        IOHelper.verifyFile((String)parametroTO.getValor(), (boolean)true);
    }

    private void e() throws DSGEViewException {
        PesquisarEmitenteGUI gui = new PesquisarEmitenteGUI("SELECIONAR_NOVO_EMITENTE");
        gui.setDesabilitaMenu(true);
        WindowManager.getInstance().showPanel((DSGEPanel)gui, false);
    }

    public DSGEDAOHelper getDAOHelper() {
        return new DSENDAOHelper();
    }

    public DSGENetworkServerManager getNetworkServerManager() throws Exception {
        return NetworkServerManager.getInstance();
    }
}

