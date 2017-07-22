/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaArmamentoController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaBasicoController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaCombustivelController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaDIController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaExportacaoController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaMedicamentoController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaTributosController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaVeiculoController
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.PesquisarProdutoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum;
import br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaArmamentoController;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaBasicoController;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaCombustivelController;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaDIController;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaExportacaoController;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaMedicamentoController;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaTributosController;
import br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaVeiculoController;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.PesquisarProdutoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import javax.swing.JDialog;

public class ProdutoNotaController
extends DSGEBaseController
implements CarregarTOCadastroInterface<ProdutoTO>,
PropertyChangeListener {
    private ProdutoNotaGUI a;
    private JDialog a;

    public ProdutoNotaController(ViewItf view) throws DSGEUtilException {
        this.a = (ProdutoNotaGUI)view;
        view.addActionListener((EventListener)this);
        this.b();
        this.a();
        this.a.disableComponents("manterNotaTodos");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            this.a.enableComponents("manterNotaEdicao");
        }
    }

    private void a() throws DSGEUtilException {
        new ProdutoNotaBasicoController((ViewItf)this.a, 0);
        new ProdutoNotaDIController((ViewItf)this.a, 3);
        new ProdutoNotaVeiculoController((ViewItf)this.a, 5);
        new ProdutoNotaMedicamentoController((ViewItf)this.a, 6);
        new ProdutoNotaArmamentoController((ViewItf)this.a, 7);
        new ProdutoNotaTributosController((ViewItf)this.a, 1);
        new ProdutoNotaCombustivelController((ViewItf)this.a, 8);
        new ProdutoNotaExportacaoController((ViewItf)this.a, 4);
    }

    private void b() {
        this.a.disableComponents("produtoNotaInicioDesabilitado");
        this.a.setEnabledTab(7, false);
        this.a.setEnabledTab(5, false);
        this.a.setEnabledTab(6, false);
        this.a.setEnabledTab(8, false);
        this.a.setEnabledTab(9, false);
        this.a.setListaProdutoEspecifico(ProdutoEspecificoEnum.values());
    }

    private void c() {
        this.a = new JDialog((Frame)DSENDesktop.getInstance());
        try {
            PesquisarProdutoGUI produtoGUI = new PesquisarProdutoGUI((CarregarTOCadastroInterface)this);
            this.a.setTitle(DSENLabelConstants.CADASTRO_PRODUTOS);
            this.a.getContentPane().add((Component)produtoGUI);
            this.a.pack();
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            this.a.setSize(screenSize.width - 20, screenSize.height - 130);
            this.a.setLocationRelativeTo(null);
            this.a.setIconImage(DSENDesktop.getInstance().getIconImage());
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
        this.a.setModal(true);
        this.a.setVisible(true);
    }

    private void a(ProdutoTO produtoTO) {
        if (produtoTO != null) {
            ProdutoNotaTO produtoNotaTO = this.a.getProdutoNotaTO(false);
            String nItem = produtoNotaTO.getNItem();
            produtoNotaTO.setValues(produtoTO);
            produtoNotaTO.getDetalheProduto().setNItem(nItem);
            this.a.limparICMS();
            this.a.setProdutoNotaTO(produtoNotaTO);
        }
    }

    private void a(ProdutoNotaTO produtoNotaTO) {
        if (produtoNotaTO != null) {
            this.a.firePropertyChange("PRODUTO_NOTA_INSERTED", produtoNotaTO);
            this.a.fechar();
        }
    }

    private void b(ProdutoNotaTO produtoNotaTO) {
        if (produtoNotaTO != null) {
            this.a.firePropertyChange("PRODUTO_NOTA_UPDATED", produtoNotaTO);
            this.a.fechar();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("pesquisar")) {
            this.c();
        } else if (e.getActionCommand().equals("ok")) {
            ProdutoNotaTO produtoNotaTO = this.a.getProdutoNotaTO(true);
            this.c(produtoNotaTO);
            if (this.a.getOperacao().equals("manterNotaProdDetalhar")) {
                this.b(produtoNotaTO);
            } else if (this.a.getOperacao().equals("manterNotaProdIncluir")) {
                this.a(produtoNotaTO);
            }
        }
    }

    private void c(ProdutoNotaTO produtoNotaTO) {
        TNFe.InfNFe.Det det = produtoNotaTO.getDetalheProduto();
        if (det != null) {
            // empty if block
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("manterNotaProdImportar")) {
            this.a((ProdutoTO)evt.getNewValue());
        }
    }

    public void carregar(ProdutoTO to) {
        this.a(to);
    }

    public JDialog getDialogGUI() {
        return this.a;
    }
}

