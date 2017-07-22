/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ManterProdutoController
 *  br.gov.sp.fazenda.dsen.model.facade.ProdutoFacade
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.IcmsGUI
 *  br.gov.sp.fazenda.dsen.view.ManterProdutoGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.facade.ProdutoFacade;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.IcmsGUI;
import br.gov.sp.fazenda.dsen.view.ManterProdutoGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class ManterProdutoController
extends DSGEBaseController
implements PropertyChangeListener,
CellEditorListener {
    private ManterProdutoGUI a;
    private ProdutoFacade a;
    private JDialog a;

    public ManterProdutoController(ViewItf view) {
        this.a = (ManterProdutoGUI)view;
        view.addActionListener((EventListener)this);
        this.a.disableComponents(this.a.getOperacao());
        this.a = new ProdutoFacade();
    }

    private void a() {
        ProdutoTO produtoTO = this.a.getProdutoTO();
        try {
            produtoTO.setEmitente((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
            produtoTO = this.a.incluirProduto(produtoTO);
            this.a.showMessage((BaseTO)produtoTO);
            if (produtoTO.getErrors() == null || produtoTO.getErrors().size() <= 0) {
                this.a("insertProduto");
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void b() {
        this.a.enableComponents("updateProdutoEnabled");
        this.a.disableComponents("updateProdutoDisabled");
        this.a.setActionAlterar();
    }

    private void c() {
        ProdutoTO produtoTO = this.a.getProdutoTO();
        try {
            produtoTO = this.a.alterarProduto(this.a(produtoTO));
            this.a.setProdutoTO(produtoTO);
            this.a.showMessage((BaseTO)produtoTO);
            if (produtoTO.getErrors() == null || produtoTO.getErrors().size() == 0) {
                this.a.setActionEditar();
                this.a.enableComponents("insertProduto");
                this.a.disableComponents("detailProduto");
                this.a.firePropertyChange("UPDATE_PRODUTO");
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private ProdutoTO a(ProdutoTO produtoTO) {
        List listaOriginalIcms = this.a.getICMSListTO();
        HashSet<IcmsTO> listaIcms = new HashSet<IcmsTO>();
        for (IcmsTO icmsTO : produtoTO.getIcmsTOSet()) {
            if (icmsTO.getIdIcms() == null && !listaOriginalIcms.contains((Object)icmsTO)) {
                for (IcmsTO icmsOriginalTO : listaOriginalIcms) {
                    if (!icmsOriginalTO.getCst().equals(icmsTO.getCst())) continue;
                    icmsTO.setIdIcms(icmsOriginalTO.getIdIcms());
                }
            }
            listaIcms.add(icmsTO);
        }
        produtoTO.setIcmsTOSet(listaIcms);
        return produtoTO;
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

    private void d() {
        if (this.a.showQuestion(DSENMessageConstants.MSG_EXCLUIR_PRODUTO) == 0) {
            ProdutoTO produtoTO = this.a.getProdutoTO();
            try {
                produtoTO = this.a.excluirProduto(produtoTO);
                this.a.showMessage((BaseTO)produtoTO);
                this.a("DELETE_PRODUTO");
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void a(IcmsGUI icmsGUI) {
        icmsGUI.setBtnVoltarTitle(DSENLabelConstants.FECHAR);
        this.a = new JDialog((Dialog)SwingUtilities.getRoot((Component)this.a));
        this.a.setTitle(DSENLabelConstants.CADASTRO_ICMS);
        this.a.getContentPane().add((Component)icmsGUI);
        this.a.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.a.setSize(screenSize.width - 40, screenSize.height - 230);
        this.a.setLocationRelativeTo(null);
        this.a.setIconImage(DSENDesktop.getInstance().getIconImage());
        this.a.setModal(true);
        this.a.setVisible(true);
    }

    private void e() {
        ProdutoTO produtoTO = this.a.getProdutoTO();
        try {
            IcmsGUI icmsGUI = new IcmsGUI("insertICMS", produtoTO);
            icmsGUI.setDesabilitaMenu(true);
            icmsGUI.addPropertyChangeListener("insertICMS", (PropertyChangeListener)this);
            if (SwingUtilities.getRoot((Component)this.a) instanceof Dialog) {
                this.a(icmsGUI);
            } else {
                WindowManager.getInstance().showPanel((DSGEPanel)icmsGUI, false);
            }
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void f() {
        IcmsTO icmsTO = this.a.getSelectedICMSTO();
        ProdutoTO produtoTO = this.a.getProdutoTO();
        if (icmsTO != null) {
            try {
                IcmsGUI icmsGUI = new IcmsGUI("updateICMS", produtoTO);
                icmsGUI.setDesabilitaMenu(true);
                icmsGUI.addPropertyChangeListener("updateICMS", (PropertyChangeListener)this);
                icmsGUI.setIcmsTO(icmsTO);
                if (SwingUtilities.getRoot((Component)this.a) instanceof Dialog) {
                    this.a(icmsGUI);
                } else {
                    WindowManager.getInstance().showPanel((DSGEPanel)icmsGUI, false);
                }
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void g() {
        List listaICMS = this.a.getSelectedICMSTOs();
        if (listaICMS != null) {
            ProdutoTO produtoTO = this.a.getProdutoTO();
            produtoTO.getIcmsTOSet().removeAll(listaICMS);
            this.a.setICMSListTO(new ArrayList(produtoTO.getIcmsTOSet()));
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("incluir")) {
            this.a();
        } else if (e.getActionCommand().equals("editar")) {
            this.b();
        } else if (e.getActionCommand().equals("alterar")) {
            this.c();
        } else if (e.getActionCommand().equals("excluir")) {
            this.d();
        } else if (e.getActionCommand().equals("incluirICMS")) {
            this.e();
        } else if (e.getActionCommand().equals("alterarICMS")) {
            this.f();
        } else if (e.getActionCommand().equals("excluirICMS")) {
            this.g();
        } else if (e.getActionCommand().equals("exportar")) {
            this.h();
        } else if (e.getActionCommand().equals("voltar")) {
            this.a("detailProduto");
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("insertICMS") || evt.getPropertyName().equals("updateICMS")) {
            List lista = (List)evt.getNewValue();
            this.a.setICMSListTO(lista);
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a.disableComponents("ICMSOneSelected");
        if (this.a.getSelectedICMSTOs() != null && this.a.getSelectedICMSTOs().size() == 1) {
            this.a.enableComponents("ICMSOneSelected");
        } else if (this.a.getSelectedICMSTOs() != null && this.a.getSelectedICMSTOs().size() > 0) {
            this.a.enableComponents("ICMSManySelected");
        }
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    private void h() {
        ArrayList<ProdutoTO> lst = new ArrayList<ProdutoTO>();
        lst.add(this.a.getProdutoTO());
        try {
            Component root = SwingUtilities.getRoot((Component)this.a);
            Window parentWindow = root instanceof Window ? (Window)root : DSENDesktop.getInstance();
            ExportacaoGUI exportacaoGUI = new ExportacaoGUI(lst, TipoDocumentoArquivoEnum.Produto, parentWindow, true);
            exportacaoGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
            ex.printStackTrace();
        }
    }
}

