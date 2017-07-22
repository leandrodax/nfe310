/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.PesquisarProdutoController
 *  br.gov.sp.fazenda.dsen.model.facade.ProdutoFacade
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ManterProdutoGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarProdutoGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
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
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.facade.ProdutoFacade;
import br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ManterProdutoGUI;
import br.gov.sp.fazenda.dsen.view.PesquisarProdutoGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
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
import java.util.LinkedHashMap;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class PesquisarProdutoController
extends DSGEBaseController
implements PageableSortableTableActionListener,
PropertyChangeListener,
CellEditorListener {
    private ProdutoFacade a;
    private PesquisarProdutoGUI a;
    private ProdutoTO a;
    private JDialog a;

    public PesquisarProdutoController(ViewItf view) {
        this.a = (PesquisarProdutoGUI)view;
        view.addActionListener((EventListener)this);
        view.disableComponents("selectProdutoInit");
        this.a = new ProdutoFacade();
        this.h();
        this.a(this.a.getProdutoTO());
    }

    private List<ProdutoTO> a(ProdutoTO produtoTO) {
        EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        this.a = produtoTO;
        if (this.a != null) {
            this.a.setEmitente(emitenteTO);
            LinkedHashMap<String, Boolean> sortColumns = new LinkedHashMap<String, Boolean>();
            sortColumns.put(this.a.getTable().getSortColumnDbFieldName(), this.a.getTable().isSortColumnASC());
            try {
                List lista = this.a.pesquisarProduto(this.a, sortColumns, this.a.getTable().getStartPageIndex(), this.a.getTable().getPageSize());
                this.verificarItensSelecionados(this.a.getSelectedProdutos(), lista);
                this.a.setProdutoTOList(lista);
                this.atualizarEstadoBotoes();
                return lista;
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
        return null;
    }

    private void a() {
        ManterProdutoGUI produtoGUI = new ManterProdutoGUI("insertProduto");
        produtoGUI.setDesabilitaMenu(true);
        produtoGUI.addPropertyChangeListener("insertProduto", (PropertyChangeListener)this);
        if (SwingUtilities.getRoot((Component)this.a) instanceof Dialog) {
            this.a(produtoGUI);
        } else {
            WindowManager.getInstance().showPanel((DSGEPanel)produtoGUI, false);
        }
    }

    private void a(ManterProdutoGUI produtoGUI) {
        produtoGUI.setBtnVoltarTitle(DSENLabelConstants.FECHAR);
        this.a = new JDialog((Dialog)SwingUtilities.getRoot((Component)this.a));
        this.a.setTitle(DSENLabelConstants.CADASTRO_PRODUTO);
        this.a.getContentPane().add((Component)produtoGUI);
        this.a.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.a.setSize(screenSize.width - 30, screenSize.height - 180);
        this.a.setLocationRelativeTo(null);
        this.a.setIconImage(DSENDesktop.getInstance().getIconImage());
        this.a.setModal(true);
        this.a.setVisible(true);
    }

    private void b() {
        ProdutoTO produtoTO = this.a.getSelectedProdutoTO();
        try {
            produtoTO = (ProdutoTO)produtoTO.clone();
            ManterProdutoGUI produtoGUI = new ManterProdutoGUI("detailProduto");
            produtoGUI.setDesabilitaMenu(true);
            produtoGUI.addPropertyChangeListener((PropertyChangeListener)this);
            produtoGUI.setProdutoTO(produtoTO);
            if (SwingUtilities.getRoot((Component)this.a) instanceof Dialog) {
                this.a(produtoGUI);
            } else {
                WindowManager.getInstance().showPanel((DSGEPanel)produtoGUI, false);
            }
        }
        catch (CloneNotSupportedException e) {
            this.a.showErrors((DSGEBaseException)new DSGEViewException((Throwable)e, e.getMessage()));
        }
    }

    private void c() {
        List lista;
        if (this.a.showQuestion(DSENMessageConstants.MSG_EXCLUIR_PRODUTOS_SELECIONADOS) == 0 && (lista = this.a.getSelectedProdutos()) != null) {
            try {
                lista = this.a.excluirProduto(lista);
                this.a.showMessage(lista);
                this.a.disableComponents("selectProdutoInit");
                this.a(this.a);
                this.a(this.a);
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void d() {
        this.a.getCarregarItf().carregar((BaseTO)this.a.getSelectedProdutoTO());
        this.e();
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

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("pesquisar")) {
            this.h();
            List lista = this.a(this.a.getProdutoTO());
            if (lista == null || lista.size() == 0) {
                this.a.showMessage(DSENMessageConstants.NENHUM_RESULTADO_ENCONTRADO);
            }
        } else if (e.getActionCommand().equals("incluir")) {
            this.a();
        } else if (e.getActionCommand().equals("detalhar")) {
            this.b();
        } else if (e.getActionCommand().equals("excluir")) {
            this.c();
        } else if (e.getActionCommand().equals("exportar")) {
            this.g();
        } else if (e.getActionCommand().equals("carregar")) {
            this.d();
        } else if (e.getActionCommand().equals("ACTION_SAIR")) {
            this.f();
        } else if (e.getActionCommand().equals("fechar")) {
            this.e();
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        if (event.getPropertyName().equals("insertProduto") || event.getPropertyName().equals("DELETE_PRODUTO") || event.getPropertyName().equals("UPDATE_PRODUTO")) {
            this.a.limparFiltro();
            this.a = new ProdutoTO();
            this.a(this.a);
            this.a(this.a);
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.atualizarEstadoBotoes();
    }

    public void atualizarEstadoBotoes() {
        this.a.disableComponents("selectProdutoInit");
        if (this.a.getSelectedProdutos() != null && this.a.getSelectedProdutos().size() == 1) {
            this.a.enableComponents("selectProdutoOneSelected");
        } else if (this.a.getSelectedProdutos() != null && this.a.getSelectedProdutos().size() > 0) {
            this.a.enableComponents("selectProdutoManySelected");
        }
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    private void g() {
        ArrayList lst = new ArrayList();
        lst.addAll(this.a.getSelectedProdutos());
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

    public void sortColumnChanged(JDSGEPageableTable source) {
        this.a(this.a);
    }

    public void pageChanged(JDSGEPageableTable source) {
        this.a(this.a);
    }

    private void a(ProdutoTO produtoTO) {
        try {
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            produtoTO.setEmitente(emitenteTO);
            int count = this.a.getCountProduto(produtoTO);
            this.a.getTable().setNumberOfLines(count);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void h() {
        this.a.getTable().reset();
        this.a(this.a.getProdutoTO());
    }
}

