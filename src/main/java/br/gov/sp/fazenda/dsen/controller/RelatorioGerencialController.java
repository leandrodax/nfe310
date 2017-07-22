/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.controller.RelatorioGerencialController
 *  br.gov.sp.fazenda.dsen.controller.RelatorioGerencialController$1
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.report.DSENReportManager
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.RelatorioGerencialGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  org.apache.log4j.Logger
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.controller.RelatorioGerencialController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.report.DSENReportManager;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.RelatorioGerencialGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import org.apache.log4j.Logger;

public class RelatorioGerencialController
extends DSGEBaseController
implements ItemListener {
    private Logger a;
    NotaFiscalFacade a;
    RelatorioGerencialGUI a;
    PesquisaRelatorioGerencialTO a;
    RelatorioNotaFiscalTO a = new NotaFiscalFacade();

    public RelatorioGerencialController(ViewItf view) {
        this.a = (RelatorioGerencialGUI)view;
        view.addActionListener((EventListener)this);
        this.a("RELATORIO_ABRIR");
        this.d();
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("ACTION_GERAR_RELATORIO")) {
            this.a();
        } else if (event.getActionCommand().equals("ACTION_IMPRIMIR_RELATORIO")) {
            this.b();
        } else if (event.getActionCommand().equals("voltar")) {
            this.c();
        } else if (event.getActionCommand().equals("ACTION_PESQUISAR_NF")) {
            this.e();
        } else if (event.getActionCommand().equals("ACTION_SELECIONAR_INUTILIZACAO")) {
            this.e();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    private void a(String key) {
        this.a.disableComponents("RELATORIO_COPONENTES");
        this.a.enableComponents(key);
        if (key.equals("RELATORIO_PRONTO") && !this.a.isPesquisaNotaFiscal()) {
            this.a.disableComponents("RELATORIO_NOTA_FISCAL");
        }
        if (key.equals("RELATORIO_ABRIR")) {
            this.a.setResultadoVisivel(false);
        } else if (key.equals("RELATORIO_GERAR")) {
            this.a.setResultadoVisivel(false);
        } else if (key.equals("RELATORIO_PRONTO")) {
            this.a.setResultadoVisivel(true);
        }
    }

    private void a() {
        this.a.debug((Object)"(RelatorioGerencialController.gerarRelatorio) Inicio");
        this.a = null;
        this.a("RELATORIO_GERAR");
        this.a.setResultadoVisivel(false);
        this.a.setTelaPesquisaEnum(TelaPesquisaEnum.RELATORIO_GERENCIAL);
        this.a.setIdEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
        this.a.setDataIni(this.a.getDataEmissaoInicio());
        this.a.setDataFim(this.a.getDataEmissaoFim());
        this.a.setIdTipoEmissaoNf(this.a.getTipoEmissaoNFeSelected());
        this.a.setIdSituacaoNf(this.a.getSituacaoNFeSelected());
        this.a.setChkNotaFiscal(Boolean.valueOf(this.a.isPesquisaNotaFiscal()));
        this.a.setChkNroInutilizacao(Boolean.valueOf(this.a.isPesquisaInutilizacao()));
        if (this.a.isPesquisaNotaFiscal()) {
            try {
                this.a = this.a.verificarFiltroNFRelatorioGerencial(this.a);
            }
            catch (DSENBusinessException exception) {
                this.a.error((Object)("(RelatorioGerencialController.gerarRelatorio) DSENBusinessException: " + exception.getMessage()));
                this.a.showErrors((DSGEBaseException)exception);
                this.a.getErrors().clear();
                this.e();
                return;
            }
            if (this.a.getErrors() != null && this.a.getErrors().size() > 0) {
                this.a.showMessage((BaseTO)this.a);
                this.a.getErrors().clear();
                this.e();
                return;
            }
        }
        if (this.a.isPesquisaInutilizacao()) {
            try {
                this.a = this.a.verificarFiltroNFRelatorioGerencial(this.a);
            }
            catch (DSENBusinessException exception) {
                this.a.error((Object)("(RelatorioGerencialController.gerarRelatorio) DSENBusinessException: " + exception.getMessage()));
                this.a.showErrors((DSGEBaseException)exception);
                this.a.getErrors().clear();
                this.e();
                return;
            }
            if (this.a.getErrors() != null && this.a.getErrors().size() > 0) {
                this.a.showMessage((BaseTO)this.a);
                this.a.getErrors().clear();
                this.e();
                return;
            }
        }
        if (this.a.isPesquisaNotaFiscal()) {
            try {
                this.a = this.a.gerarRelatorioGerencialNF(this.a);
                this.a.salvarPesquisaRelatorioGerencial(this.a);
            }
            catch (DSENBusinessException exception) {
                this.a.error((Object)("(RelatorioGerencialController.gerarRelatorio) DSENBusinessException: " + exception.getMessage()));
                this.a.showErrors((DSGEBaseException)exception);
                this.e();
                return;
            }
        }
        if (this.a.isPesquisaInutilizacao()) {
            try {
                if (this.a == null) {
                    this.a = this.a.gerarRelatorioGerencialInutilizacao(this.a);
                } else {
                    RelatorioNotaFiscalTO relInut = this.a.gerarRelatorioGerencialInutilizacao(this.a);
                    this.a.setInutilizacao(relInut.getInutilizacao());
                }
                this.a.salvarPesquisaRelatorioGerencial(this.a);
            }
            catch (DSENBusinessException exception) {
                this.a.error((Object)("(RelatorioGerencialController.gerarRelatorio) DSENBusinessException: " + exception.getMessage()));
                this.a.showErrors((DSGEBaseException)exception);
                this.e();
                return;
            }
        }
        this.a.setResultadoFiltro(this.a);
        this.a.setResultadoVisivel(true);
        this.a("RELATORIO_PRONTO");
        this.a.debug((Object)"(RelatorioGerencialController.gerarRelatorio) Fim");
    }

    private void b() {
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("msgVersaoTeste", DSENProperties.getInstance().getAplicativoRelatorioMsg());
        param.put("Impressao", (String)this.a);
        try {
            JDialog previewGui = DSENReportManager.getInstance().makeReportWithPreview("RelatorioGerencialRetratoReport", "Relat\u00f3rio Gerencial", (Object)this.a, true, DSENDesktop.getInstance().getIcon(), param);
            previewGui.setVisible(true);
        }
        catch (Exception exception) {
            this.a.error((Object)("(RelatorioGerencialController.construtor) DSENBusinessException: " + exception.getMessage()));
            exception.printStackTrace();
            this.a.showErrors(new DSGEBaseException((Throwable)exception, exception.getMessage()));
        }
    }

    private void c() {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void d() {
        this.a.debug((Object)"(RelatorioGerencialController.carregarPesquisa) Inicio");
        try {
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            this.a = this.a.carregarPesquisaRelatorioGerencial(emitenteTO);
            if (this.a != null) {
                if (this.a.getErrors() != null && this.a.getErrors().size() > 0) {
                    this.a.showMessage((BaseTO)this.a);
                } else {
                    this.a.setIntervaloDataEmissao(this.a.getDataIni(), this.a.getDataFim());
                    this.a.setChkPesquisarInutilizadas(this.a.getChkNroInutilizacao());
                    this.a.setChkPesquisarNF(this.a.getChkNotaFiscal());
                    this.a.setTipoEmissaoNFeSelected(this.a.getIdTipoEmissaoNf());
                    this.a.setSituacaoNFeSelected(this.a.getIdSituacaoNf());
                    if (this.a.isPesquisaInutilizacao()) {
                        this.a.setBtnGerarEnable(Boolean.TRUE.booleanValue());
                    }
                    if (this.a.isPesquisaNotaFiscal()) {
                        this.a.setCmbTipoEnable(Boolean.TRUE.booleanValue());
                        this.a.setLstSituacaoEnable(Boolean.TRUE.booleanValue());
                        this.a.setBtnGerarEnable(Boolean.TRUE.booleanValue());
                    }
                }
            } else {
                this.a = new PesquisaRelatorioGerencialTO();
            }
        }
        catch (DSENBusinessException exception) {
            this.a.error((Object)("(RelatorioGerencialController.carregarPesquisa) DSENBusinessException: " + exception.getMessage()));
            this.a.showErrors((DSGEBaseException)exception);
        }
        this.a.debug((Object)"(RelatorioGerencialController.carregarPesquisa) Fim");
    }

    private void e() {
        if (this.a.isPesquisaNotaFiscal()) {
            this.a("RELATORIO_FILTRO_NF");
        } else if (this.a.isPesquisaInutilizacao()) {
            this.a("RELATORIO_FILTRO_INUTILIZACAO");
        } else {
            this.a("RELATORIO_ABRIR");
        }
    }
}

