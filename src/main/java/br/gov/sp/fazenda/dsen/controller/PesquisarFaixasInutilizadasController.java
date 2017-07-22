/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.PesquisarFaixasInutilizadasController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.DetalheFaixaInutilizadaGUI
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.PesquisarFaixasInutilizadasGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.DSGEPanel
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.DetalheFaixaInutilizadaGUI;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.PesquisarFaixasInutilizadasGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.DSGEPanel;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventListener;
import java.util.List;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class PesquisarFaixasInutilizadasController
extends DSGEBaseController
implements PropertyChangeListener,
CellEditorListener {
    private PesquisarFaixasInutilizadasGUI a;
    private NotaFiscalFacade a;
    private InutilizacaoTO a = null;

    public PesquisarFaixasInutilizadasController(ViewItf view) throws DSGEUtilException {
        this.a = (PesquisarFaixasInutilizadasGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a.disableComponents("inutilizarFaixaInicio");
        this.a = new NotaFiscalFacade();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("pesquisar")) {
                List lista = this.a(this.a.getInutilizacaoTO());
                if (lista == null || lista.size() == 0) {
                    this.a.showMessage(DSENMessageConstants.NENHUM_RESULTADO_ENCONTRADO);
                }
            } else if (e.getActionCommand().equals("detalhar")) {
                this.a();
            } else if (e.getActionCommand().equals("fechar")) {
                this.b();
            } else if (e.getActionCommand().equals("exportar")) {
                this.c();
            } else if (e.getActionCommand().equals("importar")) {
                this.e();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    @Override
    public void editingStopped(ChangeEvent e) {
        this.d();
    }

    @Override
    public void editingCanceled(ChangeEvent e) {
    }

    private List<InutilizacaoTO> a(InutilizacaoTO inutilizacaoTO) throws DSGEUtilException {
        if (inutilizacaoTO != null) {
            this.a = inutilizacaoTO;
            inutilizacaoTO.setEmitenteTO((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
            try {
                List list = this.a.obterFaixasInutilizadas(inutilizacaoTO);
                this.a.disableComponents("inutilizarFaixaInicio");
                this.a.setListaInutilizacaoTO(list);
                return list;
            }
            catch (DSENBusinessException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
        return null;
    }

    private void a() {
        InutilizacaoTO inutTO = this.a.getSelectedInutilizacaoTO();
        DetalheFaixaInutilizadaGUI detalheGUI = new DetalheFaixaInutilizadaGUI(inutTO.getProtocoloXmlString());
        WindowManager.getInstance().showPanel((DSGEPanel)detalheGUI, false);
    }

    private void b() {
        WindowManager.getInstance().closePanel();
    }

    private void c() {
        ArrayList lst = new ArrayList();
        lst.addAll(this.a.getSelectedInutilizacaoTOs());
        try {
            ExportacaoGUI exportacaoGUI = new ExportacaoGUI(lst, TipoDocumentoArquivoEnum.Inutilizacao, (Window)DSENDesktop.getInstance(), true);
            exportacaoGUI.setBtnTxtEnabled(false);
            exportacaoGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
            ex.printStackTrace();
        }
    }

    private void d() {
        List lista = this.a.getSelectedInutilizacaoTOs();
        this.a.disableComponents("inutilizarFaixaInicio");
        if (lista != null && lista.size() == 1) {
            this.a.enableComponents("inutilizarFaixaUmaSelecionada");
        } else if (lista != null && lista.size() > 0) {
            this.a.enableComponents("inutilizarFaixaVariasSelecionadas");
        }
    }

    private void e() {
        try {
            ImportacaoGUI importacaoGUI = new ImportacaoGUI();
            importacaoGUI.addPropertyChangeListener("INUTILIZACAO_CHANGED", (PropertyChangeListener)this);
            WindowManager.getInstance().showPanel((DSGEPanel)importacaoGUI, false);
        }
        catch (DSGEBaseException e) {
            this.a.showErrors(e);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getSource() != null && evt.getSource().getClass().equals(ImportacaoGUI.class) && "INUTILIZACAO_CHANGED".equals(evt.getPropertyName())) {
            try {
                if (this.a != null) {
                    this.a(this.a);
                }
            }
            catch (DSGEUtilException e) {
                this.a.showErrors((DSGEBaseException)e);
            }
        }
    }
}

