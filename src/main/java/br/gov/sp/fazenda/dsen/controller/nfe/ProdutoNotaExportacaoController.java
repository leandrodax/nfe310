/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaExportacaoController
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.ProdutoExportacaoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class ProdutoNotaExportacaoController
extends DSGEBaseController
implements PropertyChangeListener,
CellEditorListener {
    private ProdutoNotaGUI a;
    private int a;

    public ProdutoNotaExportacaoController(ViewItf view, int aba) {
        this.a = (ProdutoNotaGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
    }

    private void a() {
        List lista = this.a.getAllExportTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                ProdutoExportacaoTO exportTO = (ProdutoExportacaoTO)lista.get(i);
                exportTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void b() {
        try {
            List lista = this.a.getAllExportTO();
            if (lista != null && lista.size() == DSENConstants.MAX_EXPORT_NFE) {
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_QTDE_EXPORT, DSENConstants.MAX_EXPORT_NFE));
            } else {
                ProdutoExportacaoGUI prodExportGUI = new ProdutoExportacaoGUI("incluirEXPORT", this.a.getOperacaoNota(), this.a);
                prodExportGUI.addPropertyChangeListener("incluirEXPORT", (PropertyChangeListener)this);
                prodExportGUI.setVisible(true);
            }
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    private void c() {
        this.a.removerListaExportacaoTO(this.a.getSelectedExportacaoTOs());
        this.a();
    }

    private void d() throws DSGEUtilException {
        ProdutoExportacaoTO prodExportTO = this.a.getSelectedExportacaoTO();
        if (prodExportTO != null) {
            try {
                ProdutoExportacaoGUI prodExportGUI = new ProdutoExportacaoGUI("editarEXPORT", this.a.getOperacaoNota(), this.a);
                prodExportGUI.addPropertyChangeListener("editarEXPORT", (PropertyChangeListener)this);
                prodExportGUI.setProdutoExportacaoTO(prodExportTO);
                prodExportGUI.setVisible(true);
            }
            catch (DSGEViewException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("incluirEXPORT")) {
                this.b();
            } else if (e.getActionCommand().equals("excluirEXPORT")) {
                this.c();
            } else if (e.getActionCommand().equals("editarEXPORT")) {
                this.d();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("incluirEXPORT")) {
            ProdutoExportacaoTO exportTO = (ProdutoExportacaoTO)evt.getNewValue();
            this.a.adicionarExporacaoTO(exportTO);
            this.a();
        } else if (evt.getPropertyName().equals("editarEXPORT")) {
            this.a.refreshTableProdutoExportacao();
        }
    }

    private void e() {
        List lista = this.a.getSelectedExportacaoTOs();
        this.a.disableComponents("produtoNotaUmaExportSelecionada");
        if (lista != null && lista.size() == 1) {
            if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                this.a.enableComponents("produtoNotaUmaExportSelecionada");
            } else {
                this.a.enableComponents("produtoNotaDetalheUmaExportSelecionada");
            }
        } else if (lista != null && lista.size() > 0 && this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            this.a.enableComponents("produtoNotaVariasExportSelecionadas");
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.e();
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }
}

