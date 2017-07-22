/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DITO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaDIController
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.DITO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI;
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

public class ProdutoNotaDIController
extends DSGEBaseController
implements PropertyChangeListener,
CellEditorListener {
    private ProdutoNotaGUI a;
    private int a;

    public ProdutoNotaDIController(ViewItf view, int aba) {
        this.a = (ProdutoNotaGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
    }

    private void a() {
        List lista = this.a.getAllDITO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                DITO diTO = (DITO)lista.get(i);
                diTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void b() {
        try {
            List lista = this.a.getAllDITO();
            if (lista != null && lista.size() == DSENConstants.MAX_DI_NFE) {
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_QTDE_DI, DSENConstants.MAX_DI_NFE));
            } else {
                ProdutoDeclaracaoImportacaoGUI diGUI = new ProdutoDeclaracaoImportacaoGUI("incluirDI", this.a.getOperacaoNota(), this.a);
                diGUI.addPropertyChangeListener("incluirDI", (PropertyChangeListener)this);
                diGUI.setVisible(true);
            }
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    private void c() {
        this.a.removerListaDITO(this.a.getSelectedDITOs());
        this.a();
        this.e();
    }

    private void d() throws DSGEUtilException {
        DITO diTO = this.a.getSelectedDITO();
        if (diTO != null) {
            try {
                ProdutoDeclaracaoImportacaoGUI diGUI = new ProdutoDeclaracaoImportacaoGUI("editarDI", this.a.getOperacaoNota(), this.a);
                diGUI.addPropertyChangeListener("editarDI", (PropertyChangeListener)this);
                diGUI.setDiTO(diTO);
                diGUI.setVisible(true);
            }
            catch (DSGEViewException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        }
    }

    private void e() {
        List listaDI = this.a.getSelectedDITOs();
        this.a.disableComponents("produtoNotaUmaDISelecionada");
        if (listaDI != null && listaDI.size() == 1) {
            if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
                this.a.enableComponents("produtoNotaUmaDISelecionada");
            } else {
                this.a.enableComponents("produtoNotaDetalheUmaDISelecionada");
            }
        } else if (listaDI != null && listaDI.size() > 0 && this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            this.a.enableComponents("produtoNotaVariasDISelecionadas");
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("incluirDI")) {
                this.b();
            } else if (e.getActionCommand().equals("excluirDI")) {
                this.c();
            } else if (e.getActionCommand().equals("editarDI")) {
                this.d();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.e();
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("incluirDI")) {
            DITO diTO = (DITO)evt.getNewValue();
            if (diTO != null) {
                this.a.adicionarDITO(diTO);
                this.a();
            }
        } else if (evt.getPropertyName().equals("editarDI")) {
            this.a.refreshTableDIProduto();
        }
    }
}

