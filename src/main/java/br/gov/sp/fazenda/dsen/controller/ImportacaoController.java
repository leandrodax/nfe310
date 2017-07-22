/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ImportacaoController
 *  br.gov.sp.fazenda.dsen.controller.ImportacaoController$1
 *  br.gov.sp.fazenda.dsen.controller.InformacaoImportacaoController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsen.view.ImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 *  br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.ImportacaoController;
import br.gov.sp.fazenda.dsen.controller.InformacaoImportacaoController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsen.view.ImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.InformacaoImportacaoGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import br.gov.sp.fazenda.dsge.view.table.PageableSortableTableActionListener;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.EventListener;
import java.util.List;
import javax.swing.JCheckBox;

public class ImportacaoController
extends DSGEBaseController
implements PageableSortableTableActionListener,
ItemListener {
    private ImportacaoGUI a;
    private SistemaFacade a;

    public ImportacaoController(ViewItf view) {
        this.a = (ImportacaoGUI)view;
        this.a.addItemListener((ItemListener)this);
        this.a.addActionListener((EventListener)this);
        this.a = new SistemaFacade();
        this.a.getTblTXT().addPageableSortableListener((PageableSortableTableActionListener)this);
        this.a.getTblXML().addPageableSortableListener((PageableSortableTableActionListener)this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("importar")) {
            this.importarArquivo();
        } else if (e.getActionCommand().equals("fechar")) {
            this.a();
        } else if (e.getActionCommand().equals("buscarLogotipo")) {
            this.listarArquivoImportacao();
        }
    }

    private void a() {
        WindowManager.getInstance().closePanel();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void listarArquivoImportacao() {
        try {
            String path = FileChooserHelper.chooseDirectory((Component)this.a, (boolean)false, (boolean)true);
            if (path != null) {
                this.a.setImportacaoPath(path);
                List listaImportacaoTelaTO = this.a.listarArquivoImportacao(path);
                boolean emitenteLogado = AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class) != null;
                this.a.setListaImportacaoTelaTO(listaImportacaoTelaTO, emitenteLogado);
                Integer qtdeXMLNaoListado = (Integer)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_QTDE_ARQUIVOS_XML_MAIORES_LIMITE, Integer.class);
                Integer qtdeTXTNaoListado = (Integer)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.IMPORTACAO_QTDE_ARQUIVOS_TXT_MAIORES_LIMITE, Integer.class);
                String msg = "";
                if (qtdeXMLNaoListado != null && qtdeXMLNaoListado > 0) {
                    msg = msg + MessageFormat.format(qtdeXMLNaoListado.equals(new Integer(1)) ? DSENMessageConstants.MSG_ARQUIVO_MAIOR_LIMITE : DSENMessageConstants.MSG_ARQUIVOS_MAIORES_LIMITE, qtdeXMLNaoListado, "XML", 1);
                }
                if (qtdeTXTNaoListado != null && qtdeTXTNaoListado > 0) {
                    msg = msg + MessageFormat.format(qtdeTXTNaoListado.equals(new Integer(1)) ? DSENMessageConstants.MSG_ARQUIVO_MAIOR_LIMITE : DSENMessageConstants.MSG_ARQUIVOS_MAIORES_LIMITE, qtdeTXTNaoListado, "TXT", 2);
                }
                if (!StringHelper.isBlankOrNull((Object)msg)) {
                    this.a.showMessage(msg);
                }
            }
        }
        catch (DSENBusinessException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
        finally {
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_QTDE_ARQUIVOS_XML_MAIORES_LIMITE, (Object)null);
            AppContext.getInstance().setContextParameter((EnumItf)AppContextEnum.IMPORTACAO_QTDE_ARQUIVOS_TXT_MAIORES_LIMITE, (Object)null);
        }
    }

    public void importarArquivo() {
        if (this.a.getNumberOfTOs() == 0) {
            this.a.showMessage(DSENMessageConstants.SELECIONE_UM_DIRETORIO_COM_ARQUIVOS_TXT_XML);
            return;
        }
        List listImpTela = this.a.getSelectedListaImportacaoTelaTO();
        if (listImpTela.size() == 0) {
            this.a.showMessage(DSENMessageConstants.SELECIONE_ARQUIVOS_PARA_IMPORTAR);
            return;
        }
        InformacaoImportacaoController infContr = new InformacaoImportacaoController(listImpTela);
        InformacaoImportacaoGUI infGui = infContr.getGUI();
        infContr.importar();
        infGui.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox check = (JCheckBox)e.getSource();
        if ("ACTION_SELECT_NFE_TXT".equals(check.getActionCommand()) || "ACTION_SELECT_CLIENTE_TXT".equals(check.getActionCommand()) || "ACTION_SELECT_EMITENTE_TXT".equals(check.getActionCommand()) || "ACTION_SELECT_PRODUTO_TXT".equals(check.getActionCommand()) || "ACTION_SELECT_TRANSPORTADORA_TXT".equals(check.getActionCommand()) || "ACTION_SELECT_NFE_XML".equals(check.getActionCommand()) || "ACTION_SELECT_CLIENTE_XML".equals(check.getActionCommand()) || "ACTION_SELECT_PRODUTO_XML".equals(check.getActionCommand()) || "ACTION_SELECT_EMITENTE_XML".equals(check.getActionCommand()) || "ACTION_SELECT_PRODUTO_XML".equals(check.getActionCommand()) || "ACTION_SELECT_INUTILIZACAO_XML".equals(check.getActionCommand())) {
            // empty if block
        }
    }

    public void pageChanged(JDSGEPageableTable source) {
    }

    public void sortColumnChanged(JDSGEPageableTable source) {
        String fieldName = source.getSortColumnDbFieldName();
        boolean asc = source.isSortColumnASC();
        List tos = source.getAllTO();
        Collections.sort(tos, new /* Unavailable Anonymous Inner Class!! */);
        source.removeAllTO();
        source.addTO(tos);
    }
}

