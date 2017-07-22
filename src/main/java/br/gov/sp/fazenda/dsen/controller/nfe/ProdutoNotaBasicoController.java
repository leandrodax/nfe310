/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum
 *  br.gov.sp.fazenda.dsen.common.to.NVETO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaBasicoController
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum;
import br.gov.sp.fazenda.dsen.common.to.NVETO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class ProdutoNotaBasicoController
extends DSGEBaseController
implements ItemListener,
PropertyChangeListener,
CellEditorListener {
    private ProdutoNotaGUI a;
    private int a;

    public ProdutoNotaBasicoController(ViewItf view, int aba) {
        this.a = (ProdutoNotaGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("incluirNVE")) {
                this.a();
            } else if (e.getActionCommand().equals("excluirNVE")) {
                this.b();
            } else if (e.getActionCommand().equals("editarNVE")) {
                this.c();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void a() {
        List lista = this.a.getAllNVETO();
        if (lista != null && lista.size() == DSENConstants.MAX_DI_NFE) {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_QTDE_DI, DSENConstants.MAX_DI_NFE));
        } else {
            NVETO nveTO = new NVETO();
            this.a.showNVEGUI(nveTO);
            if (!StringHelper.isBlankOrNull((Object)nveTO.getValorNVE())) {
                this.a.adicionarNVETO(nveTO);
            }
            this.a.verificarNVESelecionadosTabela();
        }
    }

    private void b() {
        this.a.removerListaNVETO(this.a.getSelectedNVETOs());
        this.a.verificarNVESelecionadosTabela();
    }

    private void c() throws DSGEUtilException {
        NVETO nveTO = this.a.getSelectedNVETO();
        if (nveTO != null) {
            this.a.showNVEGUI(nveTO);
            this.a.refreshTableNVE();
            this.a.verificarNVESelecionadosTabela();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        ProdutoEspecificoEnum item;
        this.a.setEnabledTab(7, false);
        this.a.setEnabledTab(5, false);
        this.a.setEnabledTab(6, false);
        this.a.setEnabledTab(8, false);
        this.a.setEnabledTab(9, false);
        if (e.getStateChange() == 1 && (item = (ProdutoEspecificoEnum)e.getItem()) != null) {
            if (item.equals((Object)ProdutoEspecificoEnum.ARMAMENTO)) {
                this.a.setEnabledTab(7, true);
            } else if (item.equals((Object)ProdutoEspecificoEnum.MEDICAMENTO)) {
                this.a.setEnabledTab(6, true);
            } else if (item.equals((Object)ProdutoEspecificoEnum.VEICULO)) {
                this.a.setEnabledTab(5, true);
            } else if (item.equals((Object)ProdutoEspecificoEnum.COMBUSTIVEL)) {
                this.a.setEnabledTab(8, true);
            } else if (item.equals((Object)ProdutoEspecificoEnum.PAPEL_IMUNE)) {
                this.a.setEnabledTab(9, true);
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.a();
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a.verificarNVESelecionadosTabela();
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }
}

