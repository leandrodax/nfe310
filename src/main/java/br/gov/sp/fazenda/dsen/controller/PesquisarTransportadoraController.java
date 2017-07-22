/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.PesquisarTransportadoraController
 *  br.gov.sp.fazenda.dsen.model.facade.TransportadoraFacade
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarTransportadoraGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.facade.TransportadoraFacade;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI;
import br.gov.sp.fazenda.dsen.view.PesquisarTransportadoraGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class PesquisarTransportadoraController
extends DSGEBaseController
implements PageableSortableTableActionListener,
PropertyChangeListener,
CellEditorListener {
    private PesquisarTransportadoraGUI a;
    private TransportadoraFacade a;
    private TransportadoraTO a;
    private JDialog a = new TransportadoraFacade();

    public PesquisarTransportadoraController(ViewItf view) {
        this.a = (PesquisarTransportadoraGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a.disableComponents("selectTransportadoraInit");
        this.h();
        this.a(this.a.getTransportadoraTO());
    }

    private List<TransportadoraTO> a(TransportadoraTO transportadoraTO) {
        this.a = transportadoraTO;
        if (this.a != null) {
            this.a.setEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
            try {
                LinkedHashMap<String, Boolean> sortColumns = new LinkedHashMap<String, Boolean>();
                sortColumns.put(this.a.getTable().getSortColumnDbFieldName(), this.a.getTable().isSortColumnASC());
                List transportadoraList = this.a.pesquisarTransportadora(transportadoraTO, sortColumns, this.a.getTable().getStartPageIndex(), this.a.getTable().getPageSize());
                this.verificarItensSelecionados(this.a.getSelectedTransportadoras(), transportadoraList);
                this.a.setTransportadoraTOList(transportadoraList);
                this.a.disableComponents("incluir");
                return transportadoraList;
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
        return null;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        try {
            if (actionEvent.getActionCommand().equals("pesquisar")) {
                this.h();
                List transportadoraList = this.a(this.a.getTransportadoraTO());
                if (transportadoraList == null || transportadoraList.size() == 0) {
                    this.a.showMessage(DSENMessageConstants.NENHUM_RESULTADO_ENCONTRADO);
                }
            } else if (actionEvent.getActionCommand().equals("incluir")) {
                this.c();
            } else if (actionEvent.getActionCommand().equals("detalhar")) {
                this.d();
            } else if (actionEvent.getActionCommand().equals("excluir")) {
                this.e();
            } else if (actionEvent.getActionCommand().equals("exportar")) {
                this.f();
            } else if (actionEvent.getActionCommand().equals("carregar")) {
                this.g();
            } else if (actionEvent.getActionCommand().equals("ACTION_SAIR")) {
                this.b();
            } else if (actionEvent.getActionCommand().equals("fechar")) {
                this.a();
            }
        }
        catch (DSGEUtilException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    private void a() {
        if (this.a.getCarregarItf() != null) {
            this.a.getCarregarItf().getDialogGUI().setVisible(false);
            this.a.getCarregarItf().getDialogGUI().dispose();
        }
    }

    private void b() {
        WindowManager.getInstance().closePanel();
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if (event.getPropertyName().equals("insertTransportadora") || event.getPropertyName().equals("TRANSPORTADORA_APAGAR") || event.getPropertyName().equals("TRANSPORTADORA_ATUALIZAR")) {
            this.a.limparFiltro();
            this.a = new TransportadoraTO();
            this.a(this.a);
            this.a(this.a);
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a.disableComponents("selectTransportadoraInit");
        if (this.a.getSelectedTransportadoras() != null && this.a.getSelectedTransportadoras().size() == 1) {
            this.a.enableComponents("transportadoraUmaSelecionada");
        } else if (this.a.getSelectedTransportadoras() != null && this.a.getSelectedTransportadoras().size() > 0) {
            this.a.enableComponents("transportadoraVariasSelecionadas");
        }
    }

    private void c() throws DSGEUtilException {
        try {
            ManterTransportadoraGUI manterTransportadoraGUI = new ManterTransportadoraGUI("insertTransportadora");
            manterTransportadoraGUI.setDesabilitaMenu(true);
            manterTransportadoraGUI.setEstado(DSENUtilHelper.getInstance().getEstadoTO(true));
            manterTransportadoraGUI.addPropertyChangeListener("insertTransportadora", (PropertyChangeListener)this);
            if (SwingUtilities.getRoot((Component)this.a) instanceof Dialog) {
                this.a(manterTransportadoraGUI);
            } else {
                WindowManager.getInstance().showPanel((DSGEPanel)manterTransportadoraGUI, false);
            }
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)new DSGEViewException((DSGEBaseException)e, e.getMessage()));
        }
    }

    private void a(ManterTransportadoraGUI manterTransportadoraGUI) {
        manterTransportadoraGUI.setBtnVoltarTitle(DSENLabelConstants.FECHAR);
        this.a = new JDialog((Dialog)SwingUtilities.getRoot((Component)this.a));
        this.a.setTitle(DSENLabelConstants.CADASTRO_TRANSPORTADORA);
        this.a.getContentPane().add((Component)manterTransportadoraGUI);
        this.a.pack();
        this.a.setSize(780, 400);
        this.a.setLocationRelativeTo(null);
        this.a.setIconImage(DSENDesktop.getInstance().getIconImage());
        this.a.setModal(true);
        this.a.setVisible(true);
    }

    private void d() throws DSGEUtilException {
        TransportadoraTO transportadora = this.a.getSelectedTransportadoraTO();
        if (transportadora != null) {
            try {
                transportadora = (TransportadoraTO)transportadora.clone();
                ManterTransportadoraGUI manterTransportadoraGUI = new ManterTransportadoraGUI("detailTransportadora");
                manterTransportadoraGUI.setEstado(DSENUtilHelper.getInstance().getEstadoTO(true));
                manterTransportadoraGUI.setTransportadoraTO(transportadora);
                manterTransportadoraGUI.setDesabilitaMenu(true);
                manterTransportadoraGUI.addPropertyChangeListener((PropertyChangeListener)this);
                manterTransportadoraGUI.setActionEditar();
                if (SwingUtilities.getRoot((Component)this.a) instanceof Dialog) {
                    this.a(manterTransportadoraGUI);
                } else {
                    WindowManager.getInstance().showPanel((DSGEPanel)manterTransportadoraGUI, false);
                }
            }
            catch (CloneNotSupportedException e) {
                this.a.showErrors((DSGEBaseException)new DSGEViewException((Throwable)e, e.getMessage()));
            }
            catch (DSGEViewException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        }
    }

    private void e() {
        List lista;
        if (this.a.showQuestion(DSENMessageConstants.MSG_EXCLUIR_TRANSPORTADORAS_SELECIONADAS) == 0 && (lista = this.a.getSelectedTransportadoras()) != null) {
            try {
                lista = this.a.excluirTransportadora(lista);
                this.a.showMessage(lista);
                this.a.disableComponents("selectTransportadoraInit");
                this.a(this.a);
                this.a(this.a);
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    private void f() {
        ArrayList lst = new ArrayList();
        lst.addAll(this.a.getSelectedTransportadoras());
        try {
            Component root = SwingUtilities.getRoot((Component)this.a);
            Window parentWindow = root instanceof Window ? (Window)root : DSENDesktop.getInstance();
            ExportacaoGUI exportacaoGUI = new ExportacaoGUI(lst, TipoDocumentoArquivoEnum.Transportadora, parentWindow, true);
            exportacaoGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
            ex.printStackTrace();
        }
    }

    private void g() {
        TransportadoraTO transportadoraTO = this.a.getSelectedTransportadoraTO();
        this.a.getCarregarItf().carregar((BaseTO)transportadoraTO);
        this.a();
    }

    public void sortColumnChanged(JDSGEPageableTable source) {
        this.a(this.a);
    }

    public void pageChanged(JDSGEPageableTable source) {
        this.a(this.a);
    }

    private void a(TransportadoraTO transportadoraTO) {
        try {
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            transportadoraTO.setEmitente(emitenteTO);
            int count = this.a.getCountTransportadora(transportadoraTO);
            this.a.getTable().setNumberOfLines(count);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void h() {
        this.a.getTable().reset();
        this.a(this.a.getTransportadoraTO());
    }
}

