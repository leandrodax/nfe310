/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.PesquisarClienteController
 *  br.gov.sp.fazenda.dsen.model.facade.ClienteFacade
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarClienteGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
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
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.facade.ClienteFacade;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ManterClienteGUI;
import br.gov.sp.fazenda.dsen.view.PesquisarClienteGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
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

public class PesquisarClienteController
extends DSGEBaseController
implements PageableSortableTableActionListener,
PropertyChangeListener,
CellEditorListener {
    private PesquisarClienteGUI a;
    private ClienteFacade a;
    private DSENUtilHelper a;
    private ClienteTO a;
    private JDialog a;

    public PesquisarClienteController(ViewItf view) throws DSGEUtilException {
        this.a = (PesquisarClienteGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a.disableComponents("selectClienteInit");
        this.a = new ClienteFacade();
        this.a = DSENUtilHelper.getInstance();
        this.i();
        this.a(this.a.getClienteTO());
    }

    private List<ClienteTO> a(ClienteTO clienteTO) {
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        this.a = clienteTO;
        if (this.a != null) {
            this.a.setEmitente(emitenteTO);
            try {
                LinkedHashMap<String, Boolean> sortColumns = new LinkedHashMap<String, Boolean>();
                sortColumns.put(this.a.getTable().getSortColumnDbFieldName(), this.a.getTable().isSortColumnASC());
                List listaCliente = this.a.pesquisarCliente(this.a, sortColumns, this.a.getTable().getStartPageIndex(), this.a.getTable().getPageSize());
                this.verificarItensSelecionados(this.a.getSelectedClientes(), listaCliente);
                this.a.setClienteTOList(listaCliente);
                this.a.disableComponents("incluir");
                return listaCliente;
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
        return null;
    }

    private void a() throws DSGEViewException {
        try {
            List listaPais = this.a.getPaisTO();
            ManterClienteGUI clienteGUI = new ManterClienteGUI();
            clienteGUI.setDesabilitaMenu(false);
            clienteGUI.setPais(listaPais);
            clienteGUI.selectPais(DSENUtilHelper.getInstance().getPaisTO(DSENConstants.BRASIL));
            clienteGUI.addPropertyChangeListener("insertCliente", (PropertyChangeListener)this);
            clienteGUI.disableComponents("insertCliente");
            if (SwingUtilities.getRoot((Component)this.a) instanceof Dialog) {
                this.a(clienteGUI);
            } else {
                WindowManager.getInstance().showPanel((DSGEPanel)clienteGUI, false);
            }
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void a(ManterClienteGUI clienteGUI) {
        clienteGUI.setBtnVoltarTitle(DSENLabelConstants.FECHAR);
        this.a = new JDialog((Dialog)SwingUtilities.getRoot((Component)this.a));
        this.a.setTitle(DSENLabelConstants.CADASTRO_CLIENTE);
        this.a.getContentPane().add((Component)clienteGUI);
        this.a.pack();
        this.a.setSize(780, 400);
        this.a.setLocationRelativeTo(null);
        this.a.setIconImage(DSENDesktop.getInstance().getIconImage());
        this.a.setModal(true);
        this.a.setVisible(true);
    }

    private void b() throws DSGEViewException {
        try {
            ClienteTO cliente = this.a.getSelectedClienteTO();
            if (cliente != null) {
                cliente = (ClienteTO)cliente.clone();
                List listaPais = this.a.getPaisTO();
                List listaEstado = null;
                List listaMunicipio = null;
                PaisTO paisCliente = null;
                EstadoTO estadoCliente = null;
                MunicipioTO municipioCliente = null;
                if (cliente.getCPais() != null) {
                    paisCliente = this.a.getPaisTO(cliente.getCPais());
                }
                if (paisCliente != null) {
                    listaEstado = this.a.getEstadoTO(paisCliente);
                    if (!StringHelper.isBlankOrNull((Object)cliente.getUf())) {
                        estadoCliente = this.a.getSiglaEstadoTO(cliente.getUf());
                    }
                    if (estadoCliente != null) {
                        listaMunicipio = this.a.getMunicipioTO(estadoCliente);
                        if (cliente.getCMun() != null) {
                            municipioCliente = this.a.getMunicipioTO(cliente.getCMun());
                        }
                    }
                }
                ManterClienteGUI clienteGUI = new ManterClienteGUI();
                clienteGUI.setDesabilitaMenu(false);
                clienteGUI.setPais(listaPais);
                clienteGUI.setEstado(listaEstado);
                clienteGUI.setMunicipio(listaMunicipio);
                clienteGUI.selectPais(paisCliente);
                clienteGUI.selectEstado(estadoCliente);
                clienteGUI.selectMunicipio(municipioCliente);
                clienteGUI.setClienteTO(cliente);
                clienteGUI.addPropertyChangeListener((PropertyChangeListener)this);
                clienteGUI.disableComponents("detailCliente");
                if (SwingUtilities.getRoot((Component)this.a) instanceof Dialog) {
                    this.a(clienteGUI);
                } else {
                    WindowManager.getInstance().showPanel((DSGEPanel)clienteGUI, false);
                }
            }
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
        catch (CloneNotSupportedException e) {
            this.a.showErrors((DSGEBaseException)new DSGEViewException((Throwable)e, e.getMessage()));
        }
    }

    private void c() {
        List lista;
        if (this.a.showQuestion(DSENMessageConstants.MSG_EXCLUIR_CLIENTES_SELECIONADOS) == 0 && (lista = this.a.getSelectedClientes()) != null) {
            try {
                lista = this.a.excluirCliente(lista);
                this.a.showMessage(lista);
                this.a.disableComponents("selectClienteInit");
                this.a(this.a);
                this.a(this.a);
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void d() {
        this.a.getCarregarItf().carregar((BaseTO)this.a.getSelectedClienteTO());
        this.e();
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("pesquisar")) {
            this.i();
            List listaCliente = this.a(this.a.getClienteTO());
            if (listaCliente == null || listaCliente.size() == 0) {
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
            this.g();
        } else if (actionEvent.getActionCommand().equals("carregar")) {
            this.d();
        } else if (actionEvent.getActionCommand().equals("importar")) {
            this.h();
        } else if (actionEvent.getActionCommand().equals("fechar")) {
            this.e();
        } else if (actionEvent.getActionCommand().equals("ACTION_SAIR")) {
            this.f();
        }
    }

    private void e() {
        if (this.a.getCarregarItf() != null) {
            this.a.getCarregarItf().getDialogGUI().setVisible(false);
            this.a.getCarregarItf().getDialogGUI().dispose();
        }
    }

    private void f() {
        WindowManager.getInstance().closePanel();
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if (event.getPropertyName().equals("UPDATE_CLIENTE") || event.getPropertyName().equals("insertCliente") || event.getPropertyName().equals("DELETE_CLIENTE")) {
            this.a.limparFiltro();
            this.a = new ClienteTO();
            this.a(this.a);
            this.a(this.a);
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a.disableComponents("selectClienteInit");
        if (this.a.getSelectedClientes() != null && this.a.getSelectedClientes().size() == 1) {
            this.a.enableComponents("selectClienteOneSelected");
        } else if (this.a.getSelectedClientes() != null && this.a.getSelectedClientes().size() > 0) {
            this.a.enableComponents("selectClienteManyeSelected");
        }
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    private void g() {
        ArrayList lst = new ArrayList();
        lst.addAll(this.a.getSelectedClientes());
        try {
            Component root = SwingUtilities.getRoot((Component)this.a);
            Window parentWindow = root instanceof Window ? (Window)root : DSENDesktop.getInstance();
            ExportacaoGUI exportacaoGUI = new ExportacaoGUI(lst, TipoDocumentoArquivoEnum.Cliente, parentWindow, true);
            exportacaoGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
            ex.printStackTrace();
        }
    }

    private void h() {
        try {
            ImportacaoGUI importacaoGUI = new ImportacaoGUI();
            importacaoGUI.addPropertyChangeListener((PropertyChangeListener)this);
            WindowManager.getInstance().showPanel((DSGEPanel)importacaoGUI, false);
        }
        catch (DSGEBaseException e) {
            this.a.showErrors(e);
        }
    }

    public void sortColumnChanged(JDSGEPageableTable source) {
        this.a(this.a);
    }

    public void pageChanged(JDSGEPageableTable source) {
        this.a(this.a);
    }

    private void a(ClienteTO clienteTO) {
        try {
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            clienteTO.setEmitente(emitenteTO);
            int count = this.a.getCountCliente(clienteTO);
            this.a.getTable().setNumberOfLines(count);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void i() {
        this.a.getTable().reset();
        this.a(this.a.getClienteTO());
    }
}

