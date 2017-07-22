/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormatoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.controller.EmitirDanfeController
 *  br.gov.sp.fazenda.dsen.controller.EmitirDanfeController$1
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.report.DSENReportManager
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.EmitirDanfeGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
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
import br.gov.sp.fazenda.dsen.common.enumeration.FormatoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.controller.EmitirDanfeController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.report.DSENReportManager;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.EmitirDanfeGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.EventListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import org.apache.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EmitirDanfeController
extends DSGEBaseController
implements ItemListener,
WindowListener {
    private Logger a;
    private NotaFiscalFacade a;
    private EmitirDanfeGUI a;
    private SelecaoDanfeTO a = Logger.getLogger((String)"");

    public EmitirDanfeController(ViewItf view) {
        this.a.debug((Object)"(EmitirDanfeController.construtor) Inicio");
        this.a = new NotaFiscalFacade();
        this.a = (EmitirDanfeGUI)view;
        WindowManager.getInstance().centralizarDialogo((JDialog)this.a);
        view.addActionListener((EventListener)this);
        this.c();
        this.a.debug((Object)"(EmitirDanfeController.construtor) Fim");
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("visualizar")) {
            this.a();
        } else if (event.getActionCommand().equals("voltar")) {
            this.b();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        this.a.debug((Object)"(EmitirDanfeController.visualizar) Inicio");
        this.a.setFormatoImpressaoEnum(this.a.getFormatoImpressao());
        this.a.setPreImpresso(Boolean.valueOf(this.a.getPreImpresso()));
        this.a.setTelaPesquisaEnum(TelaPesquisaEnum.IMPRESSAO_DANFE);
        this.a.setIdEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
        this.a.setTipoPapelEnum(this.a.getTipoPapel());
        if (this.a()) {
            List notaFiscalTOList = this.a.getSelectedNotas();
            HashMap<String, Object> param = new HashMap<String, Object>();
            boolean readOnly = this.a.isReadOnly();
            List impressaoDanfeTOList = null;
            try {
                boolean canSaveAndPrint = this.a.canSaveAndPrint(notaFiscalTOList);
                if (!canSaveAndPrint && !readOnly) {
                    this.a.error((Object)"(EmitirDanfeController.visualizar) !canSaveAndPrint && !readOnly ");
                    readOnly = true;
                }
                param.put("readOnlyReport", readOnly);
                if (!readOnly) {
                    this.a(notaFiscalTOList);
                }
                impressaoDanfeTOList = this.a.getImpressaoDanfeTOList(notaFiscalTOList, this.a.getTipoPapel());
                this.a.salvarSelecaoImpressaoDanfe(this.a);
            }
            catch (DSENBusinessException exception) {
                this.a.error((Object)("(EmitirDanfeController.construtor) DSENBusinessException: " + exception.getMessage()));
                this.a.showErrors((DSGEBaseException)exception);
                return;
            }
            param.put("PreImpresso", this.a.getPreImpresso());
            param.put("msgVersaoTeste", DSENProperties.getInstance().getAplicativoRelatorioMsg());
            param.put("Impressao", impressaoDanfeTOList);
            if (this.a.isReadOnly()) {
                param.put("msgPrevisualizacao", DSENMessageConstants.MARCA_DAGUA_PREVISUALIZACAO_DANFE);
            }
            if (this.a.getFormatoImpressao() == FormatoImpressaoEnum.FRENTE) {
                param.put("Frente", "1");
            } else {
                param.put("Frente", "0");
            }
            this.a.debug((Object)("(EmitirDanfeController.construtor) Orienta\u00e7\u00e3o da impress\u00e3o: " + ((ImpressaoDanfeTO)impressaoDanfeTOList.get(0)).getOrientacaoLayoutDanfe()));
            String formularioImpressao = ((ImpressaoDanfeTO)impressaoDanfeTOList.get(0)).getOrientacaoLayoutDanfe() == Integer.parseInt(TipoImpressaoEnum.RETRATO.getCodigo()) ? "ImpressaoDanfeRetrato" + this.a.getTipoPapel().name() + "Report" : "ImpressaoDanfePaisagem" + this.a.getTipoPapel().name() + "Report";
            boolean nfAtualizada = false;
            try {
                JDialog previewGui = DSENReportManager.getInstance().makeReportWithPreview(formularioImpressao, this.a.isReadOnly() ? DSENMessageConstants.TITLE_PRE_VISUALIZACAO_DANFE : DSENMessageConstants.TITLE_IMPRESSAO_DANFE, (Object)this.a, true, DSENDesktop.getInstance().getIcon(), param);
                previewGui.setVisible(true);
                this.a.debug((Object)"(EmitirDanfeController.visualizar) Atualizar a(s) nota(s)...");
                if (!readOnly) {
                    for (NotaFiscalTO nf : notaFiscalTOList) {
                        if (nf.getDanfeImpresso() != null && nf.getDanfeImpresso().booleanValue()) continue;
                        this.a.alterarImpressaoDanfe(nf);
                        nfAtualizada = true;
                    }
                }
            }
            catch (Exception exception) {
                this.a.error((Object)("(EmitirDanfeController.construtor) DSENBusinessException: " + exception.getMessage()));
                exception.printStackTrace();
            }
            finally {
                if (!readOnly && nfAtualizada) {
                    this.a.firePropertyChange("NOTA_FISCAL_CHANGED", (Object)null, (Object)null);
                }
            }
        }
        this.a.debug((Object)"(EmitirDanfeController.visualizar) Fim");
    }

    private void a(List<NotaFiscalTO> notaFiscalTOList) {
        NotaFiscalTO nota = notaFiscalTOList.get(0);
        if (nota.getTipoEmissao().equals((Object)TipoEmissaoEnum.CONTINGENCIA)) {
            this.a.debug((Object)"(EmitirDanfeController.carregarSelecaoDanfeTO) A lista de NFs selecionada \u00e9 de contingencia");
            this.a.showMessage(DSENMessageConstants.MSG_DANFE_FORMULARIO_SEGURANCA);
        } else if (nota.getTipoEmissao().equals((Object)TipoEmissaoEnum.CONTINGENCIA_FS_DA)) {
            this.a.debug((Object)"(EmitirDanfeController.carregarSelecaoDanfeTO) A lista de NFs selecionada \u00e9 de contingencia FS-DA");
            this.a.showMessage(DSENMessageConstants.MSG_DANFE_FORMULARIO_SEGURANCA_FS_DA);
        }
    }

    private void b() {
        SwingUtilities.invokeLater((Runnable)new /* Unavailable Anonymous Inner Class!! */);
    }

    private void c() {
        this.a.debug((Object)"(EmitirDanfeController.carregarSelecaoDanfe) Inicio");
        try {
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            this.a = this.a.carregarSelecaoImpressaoDanfe(emitenteTO);
            if (this.a != null) {
                if (this.a.getErrors() != null && this.a.getErrors().size() > 0) {
                    this.a.showMessage((BaseTO)this.a);
                } else {
                    if (this.a.getFormatoImpressaoEnum() != null) {
                        this.a.setFormatoImpressaoSelected(this.a.getFormatoImpressaoEnum());
                    }
                    if (this.a.getTipoPapelEnum() != null) {
                        this.a.setTipoPapel(this.a.getTipoPapelEnum());
                    }
                    if (this.a.getPreImpresso() != null) {
                        this.a.setPreImpressaoSelected(this.a.getPreImpresso().booleanValue());
                    }
                    if (this.a.getMessages() != null && this.a.getMessages().size() > 0) {
                        this.a.showMessage((BaseTO)this.a);
                    }
                }
            } else {
                this.a = new SelecaoDanfeTO();
            }
        }
        catch (DSENBusinessException exception) {
            this.a.error((Object)("(EmitirDanfeController.construtor) DSENBusinessException: " + exception.getMessage()));
            this.a.showErrors((DSGEBaseException)exception);
        }
        this.a.debug((Object)"(EmitirDanfeController.carregarSelecaoDanfe) Fim");
    }

    private boolean a() {
        try {
            boolean valida = this.a.isSelecaoValida(this.a.getSelectedNotas());
            if (!valida) {
                this.a.disableComponents("danfeAllComponents");
                this.a.showMessage(DSENMessageConstants.MSG_DANFE_LAYOUT_SITUACAO_DIFERENTE);
                return false;
            }
        }
        catch (DSENBusinessException exception) {
            this.a.disableComponents("danfeAllComponents");
            this.a.showErrors((DSGEBaseException)exception);
            return false;
        }
        this.a.enableComponents("danfeAllComponents");
        return true;
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        this.a.firePropertyChange("danfeImpressoPropertyChange");
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

    static /* synthetic */ EmitirDanfeGUI a(EmitirDanfeController x0) {
        return x0.a;
    }
}

