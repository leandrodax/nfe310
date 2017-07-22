/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum
 *  br.gov.sp.fazenda.dsen.common.to.AdicaoTO
 *  br.gov.sp.fazenda.dsen.common.to.DITO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoDeclaracaoImportacaoController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.AdicaoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoImportacaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoViaTransporteEnum;
import br.gov.sp.fazenda.dsen.common.to.AdicaoTO;
import br.gov.sp.fazenda.dsen.common.to.DITO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.AdicaoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoDeclaracaoImportacaoGUI;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;
import java.util.Date;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class ProdutoDeclaracaoImportacaoController
extends DSGEBaseController
implements CellEditorListener {
    private ProdutoDeclaracaoImportacaoGUI a;
    private DSENUtilHelper a;

    public ProdutoDeclaracaoImportacaoController(ViewItf view) throws DSGEUtilException {
        this.a = (ProdutoDeclaracaoImportacaoGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a = DSENUtilHelper.getInstance();
        this.a.setListaDIUF(this.a.getEstadoTO(false));
        this.a.setListaDITpIntermedia(TipoImportacaoEnum.values());
        this.a.setListaDITpViaTransp(TipoViaTransporteEnum.values());
        this.a.disableComponents("DI_TODOS");
        if (!this.a.getOperacaoNota().equals("manterNotaOperacaoDetalhe")) {
            this.a.enableComponents("DI_TODOS");
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("incluirAdicao")) {
            this.b();
        } else if (e.getActionCommand().equals("excluirAdicao")) {
            this.c();
        } else if (e.getActionCommand().equals("ACTION_DETALHAR_ADICAO")) {
            this.d();
        } else if (e.getActionCommand().equals("fechar")) {
            this.e();
        } else if (e.getActionCommand().equals("ok")) {
            this.f();
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.a.verificarSelecionadosTabela();
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    private void a() {
        List lista = this.a.getAllAdicaoTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                AdicaoTO adicaoTO = (AdicaoTO)lista.get(i);
                adicaoTO.setNSeqAdic(String.valueOf(i + 1));
            }
        }
    }

    private void b() {
        List lista = this.a.getAllAdicaoTO();
        if (lista != null && lista.size() == DSENConstants.MAX_ADICOES_NFE) {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.INFNFE_PRODSERV_QTDE_ADICOES, DSENConstants.MAX_ADICOES_NFE));
        } else {
            AdicaoGUI adicaoGUI = new AdicaoGUI(this.a, new AdicaoTO());
            adicaoGUI.setVisible(true);
            AdicaoTO adicaoTO = adicaoGUI.getAdicaoTO();
            if (!StringHelper.isBlankOrNull((Object)adicaoTO)) {
                this.a.adicionarAdicaoTO(adicaoTO);
                this.a();
                this.a.verificarSelecionadosTabela();
            }
        }
    }

    private void c() {
        this.a.removerListaAdicaoTO(this.a.getSelectedAdicaoTOs());
        this.a();
        this.a.verificarSelecionadosTabela();
    }

    private void d() {
        AdicaoTO selectedTO = this.a.getSelectedAdicaoTO();
        if (selectedTO != null) {
            AdicaoGUI adicaoGUI = new AdicaoGUI(this.a, selectedTO);
            adicaoGUI.setVisible(true);
            AdicaoTO adicaoTO = adicaoGUI.getAdicaoTO();
            if (adicaoTO != null) {
                this.a.refreshTableAdicoes();
                this.a.verificarSelecionadosTabela();
            }
        }
    }

    private void e() {
        this.a.setVisible(false);
        this.a.dispose();
    }

    private void f() {
        DITO diTO = this.a.getDiTO();
        if (diTO.getNDI() == null || diTO.getDDI() == null || diTO.getCExportador() == null || diTO.getTpIntermedio() == null || diTO.getTpViaTransp() == null || diTO.getUFDesemb() == null || diTO.getXLocDesemb() == null || diTO.getDDesemb() == null) {
            this.a.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
        } else {
            this.a.firePropertyChange(this.a.getOperacao(), diTO);
            this.e();
        }
    }
}

