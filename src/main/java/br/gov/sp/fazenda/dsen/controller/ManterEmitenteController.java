/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ManterEmitenteController
 *  br.gov.sp.fazenda.dsen.model.facade.EmitenteFacade
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.ExportacaoGUI
 *  br.gov.sp.fazenda.dsen.view.ManterEmitenteGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.util.FileChooserHelper
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.facade.EmitenteFacade;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.ExportacaoGUI;
import br.gov.sp.fazenda.dsen.view.ManterEmitenteGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.MunicipioTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.util.FileChooserHelper;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ManterEmitenteController
extends DSGEBaseController
implements ItemListener {
    public static int MAX_IMAGE_SIZE = 512000;
    private EmitenteFacade a;
    private ManterEmitenteGUI a;
    private DSENUtilHelper a;
    public byte[] imagemBuffer;

    public ManterEmitenteController(ViewItf view) throws DSGEUtilException {
        this.a = (ManterEmitenteGUI)view;
        view.addActionListener((EventListener)this);
        this.a = new EmitenteFacade();
        this.a = DSENUtilHelper.getInstance();
        ArrayList<PaisTO> l = new ArrayList<PaisTO>();
        try {
            l.add(DSENUtilHelper.getInstance().getPaisTO(DSENConstants.BRASIL));
        }
        catch (DSGEUtilException ex) {
            ex.printStackTrace();
        }
        this.a.atualizaListaPaises(l);
        this.a.populaComboRegimeTributario(RegimeTributarioEnum.values());
        this.a(this.a.getOperacao());
    }

    private void a(String operacao) {
        try {
            this.a.setDesabilitaMenu(true);
            if ("ACTION_INCLUIR_EMITENTE".equals(operacao)) {
                this.a.ativaModoInclusao();
            } else if ("ACTION_DETALHAR_EMITENTE_LOGADO".equals(operacao)) {
                this.a.ativaModoDetalheEmitenteLogado();
                this.a.setEmitenteTO((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class));
                this.d();
            } else if ("ACTION_DETALHAR_EMITENTE".equals(operacao)) {
                this.a.ativaModoDetalhe();
                this.d();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    public void incluir() {
        EmitenteTO emitente = this.a.populaEmitenteTO();
        try {
            emitente = this.a.incluirEmitente(emitente);
            this.a.showMessage((BaseTO)emitente);
            if (emitente.getErrors() == null || emitente.getErrors().size() == 0) {
                this.a.firePropertyChange("insertEmitente");
                WindowManager.getInstance().closePanel();
            }
        }
        catch (DSGEBaseException exc) {
            this.a.showErrors(exc);
        }
    }

    public void alterar() {
        EmitenteTO emitente = this.a.populaEmitenteTO();
        if (this.a.showQuestion(DSENMessageConstants.MSG_ALTERAR_EMITENTE) == 0) {
            try {
                emitente = this.a.alterarEmitente(emitente);
                this.a.setEmitenteTO(emitente);
                this.a.showMessage((BaseTO)emitente);
                if (emitente.getErrors() == null || emitente.getErrors().size() == 0) {
                    this.d();
                    EmitenteTO emitenteSelecionado = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
                    if (emitenteSelecionado == null) {
                        this.a.ativaModoDetalhe();
                    } else {
                        this.a.ativaModoDetalheEmitenteLogado();
                    }
                    this.a.firePropertyChange("UPDATE_EMITENTE");
                }
            }
            catch (DSGEBaseException exc) {
                this.a.showErrors(exc);
            }
        }
    }

    public void editar() {
        EmitenteTO emitenteSelecionado = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
        if (emitenteSelecionado == null) {
            this.a.ativaModoEdicao();
        } else {
            this.a.ativaModoEdicaoEmitenteSelecionado();
        }
    }

    public void excluir() {
        if (this.a.showQuestion(DSENMessageConstants.MSG_EXCLUIR_EMITENTE) == 0) {
            EmitenteTO emitente = this.a.getEmitenteTO();
            try {
                emitente.clearErrors();
                emitente.clearMessages();
                emitente = this.a.excluirEmitente(emitente);
                this.a.showMessage((BaseTO)emitente);
                this.a.firePropertyChange("DELETE_EMITENTE");
                WindowManager.getInstance().closePanel();
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void a() {
        ArrayList<EmitenteTO> lst = new ArrayList<EmitenteTO>();
        lst.add(this.a.getEmitenteTO());
        try {
            ExportacaoGUI exportacaoGUI = new ExportacaoGUI(lst, TipoDocumentoArquivoEnum.Emitente, (Window)DSENDesktop.getInstance(), true);
            exportacaoGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
            ex.printStackTrace();
        }
    }

    private void b() {
        String path = FileChooserHelper.chooseFile((Component)this.a, (boolean)false, (boolean)true, (FileNameExtensionFilter)new FileNameExtensionFilter("Imagem JPG ou GIF", "jpg", "gif", "jpeg"));
        if (path != null) {
            File f = new File(path);
            if (f.length() > (long)MAX_IMAGE_SIZE) {
                this.a.showMessage(DSENMessageConstants.IMAGEM_MUITO_GRANDE);
                return;
            }
            byte[] buffer = new byte[(int)f.length()];
            try {
                FileInputStream bInput = new FileInputStream(f);
                bInput.read(buffer);
                this.a.setLogotipo(buffer);
            }
            catch (FileNotFoundException e) {
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.NAO_FOI_POSSIVEL_ABRIR_ARQUIVO, f.getAbsolutePath()));
            }
            catch (IOException e) {
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.NAO_FOI_POSSIVEL_ABRIR_ARQUIVO, f.getAbsolutePath()));
            }
        }
    }

    private void c() {
        WindowManager.getInstance().closePanel();
        this.a.firePropertyChange("voltar");
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("incluir")) {
            this.incluir();
        } else if (event.getActionCommand().equals("exportar")) {
            this.a();
        } else if (event.getActionCommand().equals("editar")) {
            this.editar();
        } else if (event.getActionCommand().equals("alterar")) {
            this.alterar();
        } else if (event.getActionCommand().equals("excluir")) {
            this.excluir();
        } else if (event.getActionCommand().equals("voltar")) {
            this.c();
        } else if (event.getActionCommand().equals("buscarLogotipo")) {
            this.b();
        } else if (event.getActionCommand().equals("ACTION_LIMPAR_LOGO")) {
            this.e();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        try {
            JComboBox source = (JComboBox)e.getSource();
            List pais = this.a.getPaisTO();
            if (source.getActionCommand().equals("pais")) {
                this.a.atualizaListaEstados(this.a.getEstadoTO((PaisTO)e.getItem()));
            } else if (source.getActionCommand().equals("estado")) {
                EstadoTO estadoTO = (EstadoTO)e.getItem();
                if (!StringHelper.isBlankOrNull((Object)estadoTO.getCodigo())) {
                    this.a.atualizaListaMunicipios(this.a.getMunicipioTO(estadoTO));
                } else {
                    this.a.atualizaListaMunicipios(null);
                }
            }
        }
        catch (DSGEBaseException ee) {
            this.a.showErrors(ee);
        }
    }

    private void d() throws DSGEBaseException {
        EmitenteTO emitente = this.a.getEmitenteTO();
        if (emitente != null) {
            List listaEstado = null;
            List listaMunicipio = null;
            PaisTO paisEmitente = this.a.getPaisTO(emitente.getCPais());
            EstadoTO estadoEmitente = null;
            MunicipioTO municipioEmitente = null;
            if (paisEmitente != null) {
                listaEstado = this.a.getEstadoTO(paisEmitente);
                estadoEmitente = this.a.getSiglaEstadoTO(emitente.getUf());
                if (estadoEmitente != null) {
                    listaMunicipio = this.a.getMunicipioTO(estadoEmitente);
                    municipioEmitente = this.a.getMunicipioTO(emitente.getCMun());
                }
            }
            this.a.atualizaListaEstados(listaEstado);
            this.a.atualizaListaMunicipios((List)((ArrayList)listaMunicipio));
            this.a.selecionaPais(paisEmitente);
            this.a.selecionaEstado(estadoEmitente);
            this.a.selecionaMunicipio(municipioEmitente);
            this.a.carregaCamposEmitente();
        }
    }

    private void e() {
        this.a.setLogotipo(null);
    }
}

