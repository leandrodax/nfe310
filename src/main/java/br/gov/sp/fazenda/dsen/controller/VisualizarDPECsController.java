/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.InformacaoImportacaoController
 *  br.gov.sp.fazenda.dsen.controller.TransmitirDpecController
 *  br.gov.sp.fazenda.dsen.controller.VisualizarDPECsController
 *  br.gov.sp.fazenda.dsen.controller.VisualizarDPECsController$DpecTOComparator
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.model.facade.ParametroFacade
 *  br.gov.sp.fazenda.dsen.view.DetalharDpecGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI
 *  br.gov.sp.fazenda.dsen.view.VisualizarDPECsGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.InformacaoImportacaoController;
import br.gov.sp.fazenda.dsen.controller.TransmitirDpecController;
import br.gov.sp.fazenda.dsen.controller.VisualizarDPECsController;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.model.facade.ParametroFacade;
import br.gov.sp.fazenda.dsen.view.DetalharDpecGUI;
import br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsen.view.TransmitirDpecGUI;
import br.gov.sp.fazenda.dsen.view.VisualizarDPECsGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VisualizarDPECsController
extends DSGEBaseController
implements PageableSortableTableActionListener,
CellEditorListener {
    VisualizarDPECsGUI a;
    NotaFiscalFacade a = new NotaFiscalFacade();

    public VisualizarDPECsController(ViewItf view) {
        this.a = (VisualizarDPECsGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a(true, true);
        this.a.getTblAutorizados().addPageableSortableListener((PageableSortableTableActionListener)this);
        this.a.getTblGerados().addPageableSortableListener((PageableSortableTableActionListener)this);
    }

    private void a(boolean autorizados, boolean gerados) {
        try {
            String path;
            if (autorizados) {
                ParametroTO parametroDpecAutorizadoDir = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_AUTORIZADO_DIR, ParametroTO.class);
                path = parametroDpecAutorizadoDir.getValor();
                this.a.setAutorizadosDir(path);
                List autorizadosList = this.a.pesquisarDPEC(path, true);
                if (autorizadosList != null) {
                    Collections.sort(autorizadosList, new DpecTOComparator(this, this.a.getTblAutorizados().getSortColumnDbFieldName(), this.a.getTblAutorizados().isSortColumnASC()));
                    this.a.setAutorizadosList(autorizadosList);
                }
            }
            if (gerados) {
                ParametroTO parametroDpecGeradoDir = (ParametroTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.PARAMETRO_DPEC_GERADO_DIR, ParametroTO.class);
                path = parametroDpecGeradoDir.getValor();
                this.a.setGeradosDir(path);
                List geradosList = this.a.pesquisarDPEC(path, false);
                if (geradosList != null) {
                    Collections.sort(geradosList, new DpecTOComparator(this, this.a.getTblGerados().getSortColumnDbFieldName(), this.a.getTblGerados().isSortColumnASC()));
                    this.a.setGeradosList(geradosList);
                }
            }
            this.atualizarEstadoBotoes();
        }
        catch (DSGEBaseException e) {
            this.a.showErrors(e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("ACTION_ATUALIZAR_AUTORIZADOS")) {
                this.a();
            } else if (e.getActionCommand().equals("ACTION_ATUALIZAR_GERADOS")) {
                this.b();
            } else if (e.getActionCommand().equals("ACTION_DETALHAR_AUTORIZADOS")) {
                this.c();
            } else if (e.getActionCommand().equals("ACTION_DETALHAR_GERADOS")) {
                this.d();
            } else if (e.getActionCommand().equals("ACTION_EXCLUIR_ERADOS")) {
                this.e();
            } else if (e.getActionCommand().equals("ACTION_IMPORTAR_AUTORIZADOS")) {
                this.f();
            } else if (e.getActionCommand().equals("ACTION_LOCALIZAR_AUTORIZADOS")) {
                this.g();
            } else if (e.getActionCommand().equals("ACTION_LOCALIZAR_GERADOS")) {
                this.h();
            } else if (e.getActionCommand().equals("ACTION_TRANSMITIR_GERADOS")) {
                this.i();
            } else if (e.getActionCommand().equals("fechar")) {
                this.j();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void a() {
        this.a(true, false);
    }

    private void b() {
        this.a(false, true);
    }

    private void c() {
        try {
            List list = this.a.getSelectedAutorizadosList();
            if (list != null && !list.isEmpty()) {
                DpecTO to = (DpecTO)list.get(0);
                to.clearErrors();
                to.clearMessages();
                this.a.detalharDPEC(to, true);
                if (to.getErrors() != null && to.getErrors().size() > 0) {
                    this.a.showMessage(to.getErrorsString());
                    return;
                }
                DetalharDpecGUI gui = new DetalharDpecGUI(to);
                WindowManager.getInstance().showPanel((DSGEPanel)gui, false);
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void d() {
        try {
            List list = this.a.getSelectedGeradosList();
            if (list != null && !list.isEmpty()) {
                DpecTO to = (DpecTO)list.get(0);
                to.clearErrors();
                to.clearMessages();
                this.a.detalharDPEC(to, false);
                if (to.getErrors() != null && to.getErrors().size() > 0) {
                    this.a.showMessage(to.getErrorsString());
                    return;
                }
                DetalharDpecGUI gui = new DetalharDpecGUI(to);
                WindowManager.getInstance().showPanel((DSGEPanel)gui, false);
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void e() {
        try {
            List dpecs = this.a.getSelectedGeradosList();
            if (dpecs != null && !dpecs.isEmpty()) {
                String question;
                String string = question = dpecs.size() > 1 ? DSENMessageConstants.MSG_EXCLUIR_DPECS : DSENMessageConstants.MSG_EXCLUIR_DPEC;
                if (this.a.showQuestion(question) != 0) {
                    return;
                }
                for (DpecTO dpec : dpecs) {
                    dpec.clearErrors();
                    dpec.clearMessages();
                }
            }
            int excluidos = this.a.excluirDPEC(dpecs);
            StringBuffer message = new StringBuffer(MessageFormat.format(DSENMessageConstants.X_ARQUIVOS_EXCLUIDOS_COM_SUCESSO, excluidos));
            for (DpecTO dpec : dpecs) {
                String erro = dpec.getErrorsString();
                if (StringHelper.isBlankOrNull((Object)erro)) continue;
                message.append("\n" + erro);
            }
            if (excluidos > 0) {
                this.b();
            }
            this.a.showMessage(message.toString());
        }
        catch (DSENBusinessException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    private void f() {
        String path = FileChooserHelper.chooseFile((Component)this.a, (boolean)false, (boolean)true, (FileNameExtensionFilter)new FileNameExtensionFilter("Arquivos de DPECs Autorizados (*.xml)", "xml"));
        if (!StringHelper.isBlankOrNull((Object)path)) {
            ArrayList<ImportacaoTelaTO> listImpTela = new ArrayList<ImportacaoTelaTO>();
            ImportacaoTelaTO impTela = new ImportacaoTelaTO();
            impTela.setCaminhoArquivo(path);
            impTela.setNomeArquivo(new File(path).getName());
            impTela.setCharset("UTF-8");
            impTela.setTipoArquivo(TipoDocumentoArquivoEnum.Dpec);
            listImpTela.add(impTela);
            InformacaoImportacaoController infContr = new InformacaoImportacaoController(listImpTela);
            InformacaoImportacaoGUI infGui = infContr.getGUI();
            infContr.importar();
            infGui.setVisible(true);
            this.a();
        }
    }

    private void g() {
        String path = FileChooserHelper.chooseDirectory((Component)this.a, (boolean)true, (boolean)true, (int)255, (int)255);
        if (path == null) {
            return;
        }
        try {
            List dpecTOList = this.a.pesquisarDPEC(path, true);
            if (dpecTOList != null) {
                Collections.sort(dpecTOList, new DpecTOComparator(this, this.a.getTblAutorizados().getSortColumnDbFieldName(), this.a.getTblAutorizados().isSortColumnASC()));
            }
            this.a.setAutorizadosList(dpecTOList);
            this.a.setAutorizadosDir(path);
            ParametroFacade parametroFacade = new ParametroFacade();
            ArrayList<ParametroTO> parametroList = new ArrayList<ParametroTO>();
            ParametroTO localAutorizadosParam = new ParametroTO();
            localAutorizadosParam.setParametrosEnum(ParametroEnum.DPEC_AUTORIZADO_DIR);
            localAutorizadosParam.setValor(path);
            parametroList.add(localAutorizadosParam);
            parametroFacade.updateParametros(parametroList);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void h() {
        String path = FileChooserHelper.chooseDirectory((Component)this.a, (boolean)true, (boolean)true, (int)255, (int)255);
        if (path == null) {
            return;
        }
        try {
            List dpecTOList = this.a.pesquisarDPEC(path, false);
            if (dpecTOList != null) {
                Collections.sort(dpecTOList, new DpecTOComparator(this, this.a.getTblGerados().getSortColumnDbFieldName(), this.a.getTblGerados().isSortColumnASC()));
            }
            this.a.setGeradosList(dpecTOList);
            this.a.setGeradosDir(path);
            ParametroFacade parametroFacade = new ParametroFacade();
            ArrayList<ParametroTO> parametroList = new ArrayList<ParametroTO>();
            ParametroTO localGeradosParam = new ParametroTO();
            localGeradosParam.setParametrosEnum(ParametroEnum.DPEC_GERADO_DIR);
            localGeradosParam.setValor(path);
            parametroList.add(localGeradosParam);
            parametroFacade.updateParametros(parametroList);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void i() throws DSGEUtilException {
        List dpecs = this.a.getSelectedGeradosList();
        if (dpecs == null || dpecs.isEmpty()) {
            return;
        }
        String errorMessage = DSENMessageConstants.DPEC_DETALHAMENTO_ERRO_TRANSMISSAO;
        boolean containsErrors = false;
        for (DpecTO dpec : dpecs) {
            try {
                dpec.clearErrors();
                dpec.clearMessages();
                this.a.detalharDPEC(dpec, false);
                if (dpec.getErrors() == null || dpec.getErrors().isEmpty()) continue;
                errorMessage = errorMessage + dpec.getNomeArquivo() + "\n";
                containsErrors = true;
            }
            catch (DSENBusinessException e) {
                this.a.showErrors((DSGEBaseException)e);
                return;
            }
        }
        if (!containsErrors) {
            CertificadoTO certificadoTO = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA);
            if (certificadoTO == null) {
                return;
            }
            TransmitirDpecController controller = new TransmitirDpecController(certificadoTO, dpecs);
            TransmitirDpecGUI transmitirGUI = controller.getGUI();
            controller.transmitir();
            transmitirGUI.setVisible(true);
        } else {
            this.a.showMessage(errorMessage);
        }
        this.a(true, true);
    }

    private void j() {
        WindowManager.getInstance().closePanel();
    }

    public void pageChanged(JDSGEPageableTable source) {
    }

    public void sortColumnChanged(JDSGEPageableTable source) {
        String fieldName = source.getSortColumnDbFieldName();
        boolean asc = source.isSortColumnASC();
        List tos = source.getAllTO();
        Collections.sort(tos, new DpecTOComparator(this, fieldName, asc));
        source.removeAllTO();
        source.addTO(tos);
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    public void atualizarEstadoBotoes() {
        int selectedAutorizados = this.a.getSelectedAutorizadosList().size();
        if (selectedAutorizados == 1) {
            this.a.enableComponents("VISUALIZAR_DPECS_AUTORIZADOS_ONE_SELECTED");
        } else {
            this.a.disableComponents("VISUALIZAR_DPECS_AUTORIZADOS_ONE_SELECTED");
        }
        int selectedGerados = this.a.getSelectedGeradosList().size();
        if (selectedGerados == 1) {
            this.a.enableComponents("VISUALIZAR_DPECS_GERADOS_ONE_SELECTED");
        } else {
            this.a.disableComponents("VISUALIZAR_DPECS_GERADOS_ONE_SELECTED");
        }
        if (selectedGerados > 0) {
            this.a.enableComponents("VISUALIZAR_DPECS_GERADOS_MANY_SELECTED");
        } else {
            this.a.disableComponents("VISUALIZAR_DPECS_GERADOS_MANY_SELECTED");
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.atualizarEstadoBotoes();
    }
}

