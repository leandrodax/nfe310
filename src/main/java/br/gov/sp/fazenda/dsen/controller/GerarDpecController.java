/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.GerarDpecController
 *  br.gov.sp.fazenda.dsen.controller.GerarDpecController$1
 *  br.gov.sp.fazenda.dsen.controller.GerarDpecController$2
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.GerarDpecGUI
 *  br.gov.sp.fazenda.dsen.view.VisualizarDPECsGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.app.Observer
 *  br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.GerarDpecController;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.GerarDpecGUI;
import br.gov.sp.fazenda.dsen.view.VisualizarDPECsGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.app.Observer;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.YesNoAllCancelEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.exportacao.YesNoAllCancelMessageGUI;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;

public class GerarDpecController
extends DSGEBaseController
implements Observer,
WindowListener {
    GerarDpecGUI a;
    NotaFiscalFacade a = new NotaFiscalFacade();

    public GerarDpecGUI getGUI() throws DSGEViewException {
        this.a = new GerarDpecGUI((Frame)DSENDesktop.getInstance(), true);
        this.a.addWindowListener((WindowListener)this);
        this.a.addActionListener((EventListener)this);
        return this.a;
    }

    public void actionPerformed(ActionEvent e) {
        if ("fechar".equals(e.getActionCommand())) {
            this.a.setVisible(false);
            this.a.dispose();
        } else if ("visualizar".equals(e.getActionCommand())) {
            try {
                WindowManager.getInstance().showPanel((DSGEPanel)new VisualizarDPECsGUI(), true);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
            this.a.setVisible(false);
            this.a.dispose();
        }
    }

    public void gerarDPEC(List<NotaFiscalTO> listaNotaFiscal, CertificadoTO certificadoTO) {
        ParametroTO parametroDpecGeradoDir = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_GERADO_DIR, ParametroTO.class);
        String path = parametroDpecGeradoDir.getValor();
        if (StringHelper.isBlankOrNull((Object)path)) {
            this.a.showMessage(DSENMessageConstants.MSG_DIRETORIO_DPEC_GERADO_INEXISTENTE);
            return;
        }
         exportWorker = new /* Unavailable Anonymous Inner Class!! */;
        exportWorker.execute();
    }

    public void inicializar() {
        Notificador.getInstance().register((Observer)this, new EnumItf[]{GrupoNotificacaoEnum.SOBRESCREVER_ARQUIVO_EXISTENTE, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.DPEC_RESULTADO, br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.DPEC_TOTAIS});
        this.a.setTermino(false);
    }

    public void finalizar() {
        this.a.setTermino(true);
        Notificador.getInstance().remove((Observer)this);
        AppContext.getInstance().removeContextParameter((EnumItf)br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE);
    }

    public void update(Object o, EnumItf source) {
        if (source instanceof GrupoNotificacaoEnum) {
            this.a(o);
        } else {
            switch (2.a[((br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum)source).ordinal()]) {
                case 1: {
                    this.notificarResultado((String)o);
                    break;
                }
                case 2: {
                    int[] totais = (int[])o;
                    this.a.setTotalRegistros(totais[0]);
                    this.a.setQtdeRegistrosExportados(totais[1]);
                    this.a.setQtdeArquivosGerados(totais[2]);
                    this.a.updateProgress();
                }
            }
        }
    }

    public void notificarResultado(String mensagemResultado) {
        this.a.appendDetail(mensagemResultado);
    }

    private void a(Object obj) {
        String nomeArquivo = (String)obj;
        String question = MessageFormat.format(DSGEMessageConstants.ARQUIVO_JA_EXISTE_SOBRESCREVER, nomeArquivo);
        YesNoAllCancelEnum acaoArquivoExistente = YesNoAllCancelMessageGUI.showQuestion((String)question, (ViewItf)this.a);
        if (acaoArquivoExistente == YesNoAllCancelEnum.CANCELAR) {
            AppContext.getInstance().removeContextParameter((EnumItf)br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE);
            this.a.setVisible(false);
            this.a.dispose();
        }
        AppContext.getInstance().setContextParameter((EnumItf)br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE, (Object)acaoArquivoExistente);
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        AppContext.getInstance().removeContextParameter((EnumItf)br.gov.sp.fazenda.dsge.common.enumeration.AppContextEnum.ACAO_SOBRESCREVER_ARQUIVO_EXISTENTE);
        Notificador.getInstance().remove((Observer)this);
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }
}

