/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$TipoConsultaEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController
 *  br.gov.sp.fazenda.dsen.controller.ManterTransportadoraController
 *  br.gov.sp.fazenda.dsen.model.facade.TransportadoraFacade
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController;
import br.gov.sp.fazenda.dsen.model.facade.TransportadoraFacade;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ManterTransportadoraGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
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

public class ManterTransportadoraController
extends DSGEBaseController
implements ItemListener {
    private TransportadoraFacade a;
    private ManterTransportadoraGUI a;
    private DSENUtilHelper a = new TransportadoraFacade();

    public ManterTransportadoraController(ViewItf view) throws DSGEUtilException {
        this.a = (ManterTransportadoraGUI)view;
        view.addActionListener((EventListener)this);
        this.a = DSENUtilHelper.getInstance();
        this.f();
        this.a.disableComponents(this.a.getOperacao());
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
            this.a("detailTransportadora");
        } else if (event.getActionCommand().equals("exportar")) {
            this.g();
        } else if (event.getActionCommand().equals("consultarNFe")) {
            this.a();
        }
    }

    private void a() {
        ConsultaCadastroTO consultaCadastroTO = new ConsultaCadastroTO();
        TransportadoraTO transp = this.a.getTransportadoraTO();
        consultaCadastroTO.setTipoConsultaEnum(ConsultaCadastroTO.TipoConsultaEnum.TRANSPORTADORA);
        consultaCadastroTO.setUf(transp.getUf());
        consultaCadastroTO.setCNPJ(transp.getNrDocumento());
        consultaCadastroTO.setIE(transp.getIe());
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
            if (source.getActionCommand().equals("estado")) {
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

    private void b() {
        TransportadoraTO transportadora = this.a.getTransportadoraTO();
        transportadora.setEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
        try {
            transportadora = this.a.incluirTransportadora(transportadora);
            if (transportadora.getErrors() != null && transportadora.getErrors().size() > 0) {
                this.a.showMessage((BaseTO)transportadora);
            } else {
                this.a.showMessage((BaseTO)transportadora);
                this.a("insertTransportadora");
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void c() {
        TransportadoraTO transportadora = this.a.getTransportadoraTO();
        try {
            transportadora.setEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
            transportadora = this.a.alterarTransportadora(transportadora);
            this.a.setTransportadoraTO(transportadora);
            this.a.showMessage((BaseTO)transportadora);
            if (transportadora.getErrors() == null || transportadora.getErrors().size() == 0) {
                this.a.setActionEditar();
                this.a.firePropertyChange("TRANSPORTADORA_ATUALIZAR");
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void d() {
        this.a.setActionAlterar();
    }

    private void e() {
        if (this.a.showQuestion(DSENMessageConstants.MSG_EXCLUIR_TRANSPORTADORA) == 0) {
            TransportadoraTO transportadora = this.a.getTransportadoraTO();
            try {
                transportadora = this.a.excluirTransportadora(transportadora);
                this.a.showMessage((BaseTO)transportadora);
                this.a("TRANSPORTADORA_APAGAR");
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

    private void f() {
        TipoDocumentoEnum[] enumTpDocumento = TipoDocumentoEnum.values();
        ArrayList<TipoDocumentoEnum> lista = new ArrayList<TipoDocumentoEnum>();
        lista.add(null);
        for (int i = 0; i < enumTpDocumento.length; ++i) {
            lista.add(enumTpDocumento[i]);
        }
        this.a.setTipoDocumento(lista);
    }

    private void g() {
        ArrayList<TransportadoraTO> lst = new ArrayList<TransportadoraTO>();
        lst.add(this.a.getTransportadoraTO());
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
}

