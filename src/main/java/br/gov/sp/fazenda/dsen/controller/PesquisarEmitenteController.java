/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.PesquisarEmitenteController
 *  br.gov.sp.fazenda.dsen.model.facade.EmitenteFacade
 *  br.gov.sp.fazenda.dsen.util.DSENViewConstants
 *  br.gov.sp.fazenda.dsen.view.AvisoGUI
 *  br.gov.sp.fazenda.dsen.view.BackupEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ManterEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.facade.EmitenteFacade;
import br.gov.sp.fazenda.dsen.util.DSENViewConstants;
import br.gov.sp.fazenda.dsen.view.AvisoGUI;
import br.gov.sp.fazenda.dsen.view.BackupEmitenteGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ManterEmitenteGUI;
import br.gov.sp.fazenda.dsen.view.PesquisarEmitenteGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.message.DSGEMessageDialog;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class PesquisarEmitenteController
extends DSGEBaseController
implements PageableSortableTableActionListener,
PropertyChangeListener,
CellEditorListener {
    private PesquisarEmitenteGUI a;
    private EmitenteFacade a;
    private EmitenteTO a;
    private ImportacaoGUI a;

    public PesquisarEmitenteController(ViewItf view) {
        this.a = (PesquisarEmitenteGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a.disableComponents("EmitenteInit");
        this.a.enableComponents("selectEmitenteInit");
        this.a = new EmitenteFacade();
        this.a(this.a.getOperacao());
    }

    private void a(String operacao) {
        this.f();
        List list = this.pesquisar(this.a.getEmitenteTO());
        if ("SELECIONAR_NOVO_EMITENTE".equals(operacao)) {
            AppContext.getInstance().setTO((EnumItf)AppContextEnum.EMITENTE, null);
            this.a.setDesabilitaMenu(true);
            if (list == null || list.size() == 0) {
                DSGEMessageDialog.showMessage((Window)null, (String)DSENMessageConstants.MSG_NAO_EXISTE_EMITENTE);
            }
        }
    }

    public List<EmitenteTO> pesquisar(EmitenteTO emitenteTO) {
        this.a = emitenteTO;
        List listaEmitente = null;
        if (this.a != null) {
            try {
                LinkedHashMap<String, Boolean> sortColumns = new LinkedHashMap<String, Boolean>();
                sortColumns.put(this.a.getTable().getSortColumnDbFieldName(), this.a.getTable().isSortColumnASC());
                listaEmitente = this.a.pesquisarEmitente(emitenteTO, sortColumns, this.a.getTable().getStartPageIndex(), this.a.getTable().getPageSize());
                this.verificarItensSelecionados(this.a.getSelectedEmitentes(), listaEmitente);
                this.a.setEmitenteTOList(listaEmitente);
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
        return listaEmitente;
    }

    private void a() throws DSGEViewException {
        ManterEmitenteGUI emitenteGUI = new ManterEmitenteGUI("ACTION_INCLUIR_EMITENTE", new EmitenteTO());
        emitenteGUI.addPropertyChangeListener("insertEmitente", (PropertyChangeListener)this);
        WindowManager.getInstance().showPanel((DSGEPanel)emitenteGUI, false);
    }

    private void b() throws DSGEViewException {
        EmitenteTO emitente = this.a.getSelectedEmitenteTO();
        try {
            emitente = (EmitenteTO)emitente.clone();
            ManterEmitenteGUI emitenteGUI = new ManterEmitenteGUI("ACTION_DETALHAR_EMITENTE", emitente);
            emitenteGUI.addPropertyChangeListener((PropertyChangeListener)this);
            WindowManager.getInstance().showPanel((DSGEPanel)emitenteGUI, false);
        }
        catch (CloneNotSupportedException e) {
            this.a.showErrors((DSGEBaseException)new DSGEViewException((Throwable)e, e.getMessage()));
        }
    }

    private void c() {
        String questionStr;
        List lista = this.a.getSelectedEmitentes();
        String string = questionStr = lista.size() > 1 ? DSENMessageConstants.MSG_EXCLUIR_EMITENTES_SELECIONADOS : DSENMessageConstants.MSG_EXCLUIR_EMITENTE_SELECIONADO;
        if (this.a.showQuestion(questionStr) == 0 && lista != null) {
            try {
                lista = this.a.excluirEmitente(lista);
                this.a.showMessage(lista);
                this.b(this.a);
                this.pesquisar(this.a);
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void d() {
        ArrayList lst = new ArrayList();
        lst.addAll(this.a.getSelectedEmitentes());
        try {
            ExportacaoGUI exportacaoGUI = new ExportacaoGUI(lst, TipoDocumentoArquivoEnum.Emitente, (Window)DSENDesktop.getInstance(), true);
            exportacaoGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
            ex.printStackTrace();
        }
    }

    private void e() {
        try {
            this.a = new ImportacaoGUI();
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
        this.a.addPropertyChangeListener("IMPORT_EMITENTE", (PropertyChangeListener)this);
        WindowManager.getInstance().showPanel((DSGEPanel)this.a, false);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("emitenteLoggedOn")) {
            this.a(this.a.getSelectedEmitenteTO());
            this.a.setDesabilitaMenu(false);
            this.a.enableComponents("emitente_nao_selecionado");
        } else if (actionEvent.getActionCommand().equals("pesquisar")) {
            this.f();
            EmitenteTO emitenteTO = this.a.getEmitenteTO();
            List listaEmitente = this.pesquisar(emitenteTO);
            if (listaEmitente == null || listaEmitente.size() == 0) {
                this.a.showMessage(DSENMessageConstants.NENHUM_RESULTADO_ENCONTRADO);
            }
        } else if (actionEvent.getActionCommand().equals("incluir")) {
            try {
                this.a();
            }
            catch (DSGEViewException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        } else if (actionEvent.getActionCommand().equals("detalhar")) {
            try {
                this.b();
            }
            catch (DSGEViewException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        } else if (actionEvent.getActionCommand().equals("excluir")) {
            this.c();
        } else if (actionEvent.getActionCommand().equals("exportar")) {
            this.d();
        } else if (actionEvent.getActionCommand().equals("acionarImportar")) {
            this.e();
        } else if (!actionEvent.getActionCommand().equals(DSENViewConstants.ACTION_LIMPAR_PESQUISA)) {
            if (actionEvent.getActionCommand().equals("executarBackup")) {
                this.g();
            } else if (actionEvent.getActionCommand().equals("executarRestore")) {
                this.h();
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if (event.getPropertyName().equals("insertEmitente") || event.getPropertyName().equals("DELETE_EMITENTE") || event.getPropertyName().equals("UPDATE_EMITENTE")) {
            this.a.limparFiltro();
            this.a = new EmitenteTO();
            this.b(this.a);
            this.pesquisar(this.a);
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a.disableComponents("EmitenteInit");
        List l = this.a.getSelectedEmitentes();
        if (l == null || l.size() == 0) {
            this.a.enableComponents("selectEmitenteInit");
        } else if (l.size() == 1) {
            this.a.enableComponents("selectEmitenteOneSelected");
        } else {
            this.a.enableComponents("selectClienteManyeSelected");
        }
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    private void a(EmitenteTO emitenteTO) {
        AppContext.getInstance().setTO((EnumItf)AppContextEnum.EMITENTE, (BaseTO)emitenteTO);
        WindowManager.getInstance().closePanel();
        try {
            new AvisoGUI("VISUALIZAR_AVISOS_INICIALIZACAO");
        }
        catch (DSGEViewException ex) {
            DSGEMessageDialog.showErrors((DSGEBaseException)ex);
        }
    }

    public void sortColumnChanged(JDSGEPageableTable source) {
        this.pesquisar(this.a);
    }

    public void pageChanged(JDSGEPageableTable source) {
        this.pesquisar(this.a);
    }

    private void b(EmitenteTO emitenteTO) {
        try {
            int count = this.a.getCountEmitente(emitenteTO);
            this.a.getTable().setNumberOfLines(count);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void f() {
        this.a.getTable().reset();
        this.b(this.a.getEmitenteTO());
    }

    private void g() {
        EmitenteTO emitenteTO = this.a.getSelectedEmitenteTO();
        if (emitenteTO != null) {
            try {
                BackupEmitenteGUI backupGUI = new BackupEmitenteGUI(0);
                backupGUI.setEmitenteTO(emitenteTO);
                WindowManager.getInstance().showPanel((DSGEPanel)backupGUI, false);
            }
            catch (DSGEViewException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        }
    }

    private void h() {
        try {
            BackupEmitenteGUI backupGUI = new BackupEmitenteGUI(1);
            backupGUI.addPropertyChangeListener("insertEmitente", (PropertyChangeListener)this);
            WindowManager.getInstance().showPanel((DSGEPanel)backupGUI, false);
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }
}

