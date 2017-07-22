/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalProdController
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Factory
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Imposto
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Det$Prod
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  org.apache.xmlbeans.XmlException
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoNotaTO;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TFinNFe;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import org.apache.xmlbeans.XmlException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ManterNotaFiscalProdController
extends DSGEBaseController
implements PropertyChangeListener,
CellEditorListener {
    private DigitarNotaFiscalGUI a;
    private int a;

    public ManterNotaFiscalProdController(ViewItf view, int aba) {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
        this.a();
    }

    private void a() {
        this.a.disableComponents("manterNotaProdInicioDesabilitado");
    }

    private void b() {
        List lista = this.a.getSelectedProdutoNotaTOs();
        this.a.disableComponents("manterNotaProdInicioDesabilitado");
        if (lista != null && lista.size() == 1) {
            if (this.a.getOperacao().equals("manterNotaOperacaoEdicao")) {
                this.a.enableComponents("manterNotaProdUmSelecionado");
            } else {
                this.a.enableComponents("manterNotaDetalheProdUmSelecionado");
            }
        } else if (lista != null && lista.size() > 0) {
            if (this.a.getOperacao().equals("manterNotaOperacaoEdicao")) {
                this.a.enableComponents("manterNotaProdVariosSelecionados");
            } else {
                this.a.enableComponents("manterNotaDetalheProdVariosSelecionados");
            }
        }
    }

    private String a() {
        int nItem = 0;
        List lista = this.a.getAllProdutoNotaTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                ProdutoNotaTO produtoNotaTO = (ProdutoNotaTO)lista.get(i);
                int nItemProd = Integer.parseInt(produtoNotaTO.getNItem());
                if (nItemProd <= nItem) continue;
                nItem = nItemProd;
            }
        }
        return String.valueOf(nItem + 1);
    }

    private void c() {
        ProdutoNotaTO produtoNotaTO = new ProdutoNotaTO();
        produtoNotaTO.setDetalheProduto(TNFe.InfNFe.Det.Factory.newInstance());
        produtoNotaTO.getDetalheProduto().addNewProd();
        produtoNotaTO.getDetalheProduto().addNewImposto();
        try {
            ProdutoNotaGUI produtoNotaGUI = new ProdutoNotaGUI("manterNotaProdIncluir", this.a.getOperacao(), this.a.getRegimeTributario());
            produtoNotaGUI.setProdutoNotaTO(produtoNotaTO);
            produtoNotaGUI.setNotaFiscalTO(this.a.getUpdatedNotaFiscalTO());
            produtoNotaGUI.addPropertyChangeListener("PRODUTO_NOTA_INSERTED", (PropertyChangeListener)this);
            produtoNotaGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void a(ProdutoNotaTO produtoNotaTO) {
        if (produtoNotaTO != null) {
            produtoNotaTO.getDetalheProduto().setNItem(this.a());
            this.a.adicionarProdutoNotaTO(produtoNotaTO);
        }
    }

    private void d() {
        ProdutoNotaTO produtoNotaTO = this.a.getSelectedProdutoNotaTO();
        if (produtoNotaTO != null) {
            try {
                ProdutoNotaGUI produtoNotaGUI = new ProdutoNotaGUI("manterNotaProdDetalhar", this.a.getOperacao(), this.a.getRegimeTributario());
                produtoNotaGUI.setProdutoNotaTO(produtoNotaTO);
                produtoNotaGUI.setNotaFiscalTO(this.a.getUpdatedNotaFiscalTO());
                produtoNotaGUI.addPropertyChangeListener("PRODUTO_NOTA_UPDATED", (PropertyChangeListener)this);
                try {
                    NFeDocument nfe = DocumentoUtil.getNFeDocument((String)this.a.getNotaFiscalTO().getDocXmlString());
                    if (nfe.getNFe().getInfNFe().getIde().getFinNFe().equals((Object)TFinNFe.X_4)) {
                        produtoNotaGUI.disableAbaIPIDevol(false);
                    } else {
                        produtoNotaGUI.disableAbaIPIDevol(true);
                    }
                }
                catch (XmlException e) {
                    e.printStackTrace();
                }
                produtoNotaGUI.setVisible(true);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void e() {
        List lista = this.a.getSelectedProdutoNotaTOs();
        if (lista != null) {
            this.a.excluirProdutoNotaTOs(lista);
            this.b();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("incluir")) {
            this.c();
        } else if (e.getActionCommand().equals("detalhar")) {
            this.d();
        } else if (e.getActionCommand().equals("excluir")) {
            this.e();
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.b();
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("PRODUTO_NOTA_INSERTED")) {
            this.a((ProdutoNotaTO)evt.getNewValue());
        } else if (evt.getPropertyName().equals("PRODUTO_NOTA_UPDATED")) {
            this.a.refreshTableProdutos();
            this.a.getTableProdutos().fitTableColumns();
        }
    }
}

