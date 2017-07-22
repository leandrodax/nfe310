/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalAutorizacaoController
 *  br.gov.sp.fazenda.dsen.view.nfe.AutorizacaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO;
import br.gov.sp.fazenda.dsen.view.nfe.AutorizacaoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ManterNotaFiscalAutorizacaoController
extends DSGEBaseController
implements PropertyChangeListener,
CellEditorListener {
    private DigitarNotaFiscalGUI a;
    private int a;

    public ManterNotaFiscalAutorizacaoController(ViewItf view, int aba) {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
        this.a();
    }

    private void a() {
        this.a.disableComponents("manterNotaAutorizacaoInicioDesabilitado");
    }

    private void b() {
        List lista = this.a.getSelectedAutorizacaoTOs();
        this.a.disableComponents("manterNotaAutorizacaoInicioDesabilitado");
        if (lista != null && lista.size() == 1) {
            if (this.a.getOperacao().equals("manterNotaOperacaoEdicao")) {
                this.a.enableComponents("manterNotaAutorizacaoUmSelecionado");
            } else {
                this.a.enableComponents("manterNotaDetalheAutorizacaoUmSelecionado");
            }
        } else if (lista != null && lista.size() > 0) {
            if (this.a.getOperacao().equals("manterNotaOperacaoEdicao")) {
                this.a.enableComponents("manterNotaAutorizacaoVariosSelecionados");
            } else {
                this.a.enableComponents("manterNotaDetalheAutorizacaoVariosSelecionados");
            }
        }
    }

    private String a() {
        int nItem = 0;
        List lista = this.a.getAllAutorizacaoTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                AutorizacaoTO autorizacaoTO = (AutorizacaoTO)lista.get(i);
                int nItemProd = Integer.parseInt(autorizacaoTO.getNItem());
                if (nItemProd <= nItem) continue;
                nItem = nItemProd;
            }
        }
        return String.valueOf(nItem + 1);
    }

    private void c() {
        AutorizacaoTO autorizacaoTO = new AutorizacaoTO();
        try {
            AutorizacaoGUI autorizacaoGUI = new AutorizacaoGUI("manterNotaAutorizacaoIncluir", this.a.getOperacao());
            autorizacaoGUI.setAutorizacaoTO(autorizacaoTO);
            autorizacaoGUI.addPropertyChangeListener("AUTORIZACAO_NOTA_INSERTED", (PropertyChangeListener)this);
            autorizacaoGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void a(AutorizacaoTO autorizacaoTO) {
        if (autorizacaoTO != null) {
            autorizacaoTO.setNItem(this.a());
            this.a.adicionarAutorizacaoTO(autorizacaoTO);
        }
    }

    private void d() {
        AutorizacaoTO autorizacaoTO = this.a.getSelectedAutorizacaoTO();
        if (autorizacaoTO != null) {
            try {
                AutorizacaoGUI autorizacaoGUI = new AutorizacaoGUI("manterNotaAutorizacaoDetalhar", this.a.getOperacao());
                autorizacaoGUI.setAutorizacaoTO(autorizacaoTO);
                autorizacaoGUI.addPropertyChangeListener("AUTORIZACAO_NOTA_UPDATED", (PropertyChangeListener)this);
                autorizacaoGUI.setVisible(true);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
            catch (DSGEUtilException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void e() {
        List lista = this.a.getSelectedAutorizacaoTOs();
        if (lista != null) {
            this.a.excluirAutorizacaoTOs(lista);
            this.b();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ACTION_INCLUIR_AUTORIZACAO")) {
            this.c();
        } else if (e.getActionCommand().equals("ACTION_DETALHAR_AUTORIZACAO")) {
            this.d();
        } else if (e.getActionCommand().equals("ACTION_EXCLUIR_AUTORIZACAO")) {
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
        if (evt.getPropertyName().equals("AUTORIZACAO_NOTA_INSERTED")) {
            this.a((AutorizacaoTO)evt.getNewValue());
        } else if (evt.getPropertyName().equals("AUTORIZACAO_NOTA_UPDATED")) {
            this.a.refreshTableAutorizacao();
            this.a.getTableAutorizacao().fitTableColumns();
        }
    }
}

