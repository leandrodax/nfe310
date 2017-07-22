/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$TipoConsultaEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController
 *  br.gov.sp.fazenda.dsen.controller.ManterClienteController
 *  br.gov.sp.fazenda.dsen.model.facade.ClienteFacade
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ManterClienteGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController;
import br.gov.sp.fazenda.dsen.model.facade.ClienteFacade;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ManterClienteGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

public class ManterClienteController
extends DSGEBaseController
implements ItemListener {
    private ClienteFacade a;
    private ManterClienteGUI a;
    private DSENUtilHelper a;

    public ManterClienteController(ViewItf view) throws DSGEUtilException {
        this.a = (ManterClienteGUI)view;
        view.addActionListener((EventListener)this);
        this.a = new ClienteFacade();
        this.a = DSENUtilHelper.getInstance();
        this.a();
    }

    private void a() {
        TipoDocumentoEnum[] enumTpDocumento = TipoDocumentoEnum.values();
        ArrayList<TipoDocumentoEnum> lista = new ArrayList<TipoDocumentoEnum>();
        lista.add(null);
        for (int i = 0; i < enumTpDocumento.length; ++i) {
            lista.add(enumTpDocumento[i]);
        }
        this.a.setTipoDocumento(lista);
    }

    private void b() {
        ClienteTO clienteTO = this.a.getClienteTO();
        this.a(clienteTO);
        try {
            clienteTO = this.a.incluirCliente(clienteTO);
            if (clienteTO.getErrors() != null && clienteTO.getErrors().size() > 0) {
                this.a.showMessage((BaseTO)clienteTO);
            } else {
                this.a.showMessage((BaseTO)clienteTO);
                this.a("insertCliente");
            }
        }
        catch (DSGEBaseException exc) {
            this.a.showErrors(exc);
        }
    }

    private void c() {
        if (this.a.showQuestion(DSENMessageConstants.MSG_ALTERAR_CLIENTE) == 0) {
            ClienteTO cliente = this.a.getClienteTO();
            try {
                cliente = this.a.alterarCliente(cliente);
                this.a.setClienteTO(cliente);
                this.a.showMessage((BaseTO)cliente);
                if (cliente.getErrors() == null || cliente.getErrors().size() == 0) {
                    this.a.setActionEditar();
                    this.a.disableComponents("detailCliente");
                    this.a.enableComponents("updateClienteDisable");
                    this.a.firePropertyChange("UPDATE_CLIENTE");
                }
            }
            catch (DSGEBaseException exc) {
                this.a.showErrors(exc);
            }
        }
    }

    private void d() {
        this.a.enableComponents("updateClienteEnable");
        this.a.disableComponents("updateClienteDisable");
        this.a.setActionAlterar();
    }

    private void e() {
        if (this.a.showQuestion(DSENMessageConstants.MSG_EXCLUIR_CLIENTE) == 0) {
            ClienteTO cliente = this.a.getClienteTO();
            try {
                cliente = this.a.excluirCliente(cliente);
                this.a.showMessage((BaseTO)cliente);
                this.a("DELETE_CLIENTE");
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void a(String propertyChanged) {
        this.a.firePropertyChange(propertyChanged);
        Component root = SwingUtilities.getRoot((Component)this.a);
        if (root instanceof Dialog) {
            ((Dialog)root).setVisible(false);
            ((Dialog)root).dispose();
        } else {
            WindowManager.getInstance().closePanel();
        }
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("incluir")) {
            this.b();
        } else if (event.getActionCommand().equals("editar")) {
            this.d();
        } else if (event.getActionCommand().equals("alterar")) {
            this.c();
        } else if (event.getActionCommand().equals("excluir")) {
            this.e();
        } else if (event.getActionCommand().equals("voltar")) {
            this.a("detailCliente");
        } else if (event.getActionCommand().equals("exportar")) {
            this.g();
        } else if (event.getActionCommand().equals("consultarNFe")) {
            this.f();
        }
    }

    private void f() {
        ConsultaCadastroTO consultaCadastroTO = new ConsultaCadastroTO();
        ClienteTO cliente = this.a.getClienteTO();
        consultaCadastroTO.setTipoConsultaEnum(ConsultaCadastroTO.TipoConsultaEnum.CLIENTE);
        consultaCadastroTO.setUf(cliente.getUf());
        consultaCadastroTO.setIE(cliente.getIe());
        consultaCadastroTO.setCNPJ(cliente.getNrDocumento());
        consultaCadastroTO.setIeSuframa(cliente.getIesuf());
        try {
            if (ConsultaCadastroConfirmacaoController.validarTO((ViewItf)this.a, (ConsultaCadastroTO)consultaCadastroTO)) {
                ConsultaCadastroConfirmacaoGUI confirmGUI = new ConsultaCadastroConfirmacaoGUI(consultaCadastroTO, (Frame)DSENDesktop.getInstance(), true);
                confirmGUI.setVisible(true);
            }
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        try {
            JComboBox source = (JComboBox)e.getSource();
            if (source.getActionCommand().equals("pais")) {
                PaisTO paisTO = (PaisTO)e.getItem();
                if (!StringHelper.isBlankOrNull((Object)paisTO.getCodigo())) {
                    this.a.setEstado(this.a.getEstadoTO(paisTO));
                } else {
                    this.a.setEstado(null);
                    this.a.setMunicipio(null);
                }
            } else if (source.getActionCommand().equals("estado")) {
                EstadoTO estadoTO = (EstadoTO)e.getItem();
                if (!StringHelper.isBlankOrNull((Object)estadoTO.getCodigo())) {
                    this.a.setMunicipio(this.a.getMunicipioTO(estadoTO));
                } else {
                    this.a.setMunicipio(null);
                }
            }
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void a(ClienteTO clienteTO) {
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        clienteTO.setEmitente(emitenteTO);
    }

    private void g() {
        ArrayList<ClienteTO> lst = new ArrayList<ClienteTO>();
        lst.add(this.a.getClienteTO());
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
}

