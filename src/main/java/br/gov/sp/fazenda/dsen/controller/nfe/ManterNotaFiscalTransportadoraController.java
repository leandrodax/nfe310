/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ModalidadeFreteEnum
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.ReboqueTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.to.VolumeTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalTransportadoraController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.PesquisarTransportadoraGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ReboqueGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.VolumeGUI
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.ModalidadeFreteEnum;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.ReboqueTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.to.VolumeTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.PesquisarTransportadoraGUI;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ReboqueGUI;
import br.gov.sp.fazenda.dsen.view.nfe.VolumeGUI;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JDialog;

public class ManterNotaFiscalTransportadoraController
extends DSGEBaseController
implements CarregarTOCadastroInterface<TransportadoraTO>,
FocusListener,
ItemListener,
PropertyChangeListener {
    private DigitarNotaFiscalGUI a;
    private static final int a = 5000;
    private int b;
    private DSENUtilHelper a;
    private NotaFiscalFacade a;
    private JDialog a;

    public ManterNotaFiscalTransportadoraController(ViewItf view, int aba) throws DSGEUtilException {
        this.a = (DigitarNotaFiscalGUI)view;
        this.b = aba;
        this.a.addActionListener((EventListener)this, this.b);
        this.a = DSENUtilHelper.getInstance();
        this.a = new NotaFiscalFacade();
        this.a();
    }

    private void a() throws DSGEUtilException {
        this.a.setListaTransTipoDocumento(TipoDocumentoEnum.values());
        this.a.setListaModalidadeFrete(ModalidadeFreteEnum.values());
        List listaUF = this.a.getEstadoTO(true);
        this.a.setListaTransRetencaoUF(listaUF);
        this.a.setListaTransUF(listaUF);
        this.a.setListaTransVeicUF(listaUF);
    }

    private void b() {
        List lista = this.a.getAllReboqueTOs();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                ReboqueTO reboqueTO = (ReboqueTO)lista.get(i);
                reboqueTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void c() {
        List lista = this.a.getAllVolumeTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                VolumeTO volumeTO = (VolumeTO)lista.get(i);
                volumeTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void d() {
        List lista = this.a.getAllReboqueTOs();
        if (lista != null && lista.size() == DSENConstants.MAX_REBOQUES_NFE) {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.INFNFE_TRANSP_QTDE_REBOQUE, DSENConstants.MAX_REBOQUES_NFE));
        } else {
            ReboqueGUI reboqueGUI = new ReboqueGUI(this.a, null);
            reboqueGUI.setVisible(true);
            ReboqueTO reboqueTO = reboqueGUI.getReboqueTO();
            if (reboqueTO != null) {
                this.a.adicionarReboqueTO(reboqueTO);
                this.b();
                this.a.verificarSelecionadosTabela(this.a.getSelectedReboqueTOs(), DSENLabelConstants.REBOQUE);
            }
        }
    }

    private void e() throws DSGEUtilException {
        ReboqueTO reboqueTO = this.a.getSelectedReboqueTO();
        if (reboqueTO != null) {
            ReboqueGUI reboqueGUI = new ReboqueGUI(this.a, reboqueTO);
            reboqueGUI.setVisible(true);
            reboqueTO = reboqueGUI.getReboqueTO();
            if (reboqueTO != null) {
                this.a.refreshTableReboques();
                this.a.verificarSelecionadosTabela(this.a.getSelectedReboqueTOs(), DSENLabelConstants.REBOQUE);
            }
        }
    }

    private void f() {
        List lista = this.a.getSelectedReboqueTOs();
        if (lista != null) {
            this.a.excluirReboqueTO(lista);
            this.b();
            this.a.verificarSelecionadosTabela(this.a.getSelectedReboqueTOs(), DSENLabelConstants.REBOQUE);
        }
    }

    private void g() {
        if (this.a.getAllVolumeTO().size() > 5000) {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.MSG_MAX_TRANSPORTADORA_VOLUME, 5000));
        } else {
            VolumeTO volumeTO = new VolumeTO();
            try {
                VolumeGUI volumeGUI = new VolumeGUI(this.a.getOperacao(), (Window)DSENDesktop.getInstance(), true);
                volumeGUI.setVolumeTO(volumeTO);
                volumeGUI.addPropertyChangeListener("volumeCarregado", (PropertyChangeListener)this);
                volumeGUI.setVisible(true);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void h() {
        VolumeTO volumeTO = this.a.getSelectedVolumeTO();
        if (volumeTO != null) {
            try {
                VolumeGUI volumeGUI = new VolumeGUI(this.a.getOperacao(), (Window)DSENDesktop.getInstance(), false);
                volumeGUI.setVolumeTO(volumeTO);
                volumeGUI.addPropertyChangeListener("VOLUME_ALTERADO", (PropertyChangeListener)this);
                volumeGUI.setVisible(true);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void a(VolumeTO volumeTO) {
        if (volumeTO.getQVol() != null || volumeTO.getEsp() != null || volumeTO.getMarca() != null || volumeTO.getNVol() != null || volumeTO.getPesoL() != null || volumeTO.getPesoB() != null) {
            this.a.adicionarVolumeTO(volumeTO);
            this.c();
        }
    }

    private void i() {
        List lista = this.a.getSelectedVolumeTOs();
        if (lista != null) {
            this.a.excluirVolumeTO(lista);
            this.c();
            this.a.verificarSelecionadosTabela(this.a.getSelectedVolumeTOs(), DSENLabelConstants.VOLUME);
        }
    }

    private void j() {
        NotaFiscalTO notaFiscalTO = this.a.getUpdatedNotaFiscalTO();
        if (notaFiscalTO != null) {
            try {
                this.a.calcularValorICMSTransporte(notaFiscalTO);
                this.a.updateValorICMSTransporte(notaFiscalTO);
            }
            catch (DSENBusinessException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void k() {
        ConsultaCadastroTO consultaCadastroTO = this.a.getTranspConsultaCadastroTO();
        try {
            if (ConsultaCadastroConfirmacaoController.validarTO((ViewItf)this.a, (ConsultaCadastroTO)consultaCadastroTO)) {
                ConsultaCadastroConfirmacaoGUI confirmGUI = new ConsultaCadastroConfirmacaoGUI(consultaCadastroTO, (Frame)DSENDesktop.getInstance(), true);
                confirmGUI.setVisible(true);
            }
        }
        catch (DSGEViewException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("incluirVolume")) {
                this.g();
            } else if (e.getActionCommand().equals("detalharVolume")) {
                this.h();
            } else if (e.getActionCommand().equals("incluirReboque")) {
                this.d();
            } else if (e.getActionCommand().equals("detalharReboque")) {
                this.e();
            } else if (e.getActionCommand().equals("excluirReboque")) {
                this.f();
            } else if (e.getActionCommand().equals("excluirVolume")) {
                this.i();
            } else if (e.getActionCommand().equals("pesquisar")) {
                this.l();
            } else if (e.getActionCommand().equals("MANTER_NOTA_TRANSP_CONSULTAR_CADASTRO")) {
                this.k();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        try {
            JComboBox source = (JComboBox)e.getSource();
            EstadoTO estadoTO = (EstadoTO)e.getItem();
            if (source.getActionCommand().equals("estadoTransp")) {
                if (!StringHelper.isBlankOrNull((Object)estadoTO.getCodigo())) {
                    this.a.setListaTransMunicipio(this.a.getMunicipioTO(estadoTO));
                } else {
                    this.a.setListaTransMunicipio(null);
                }
            } else if (source.getActionCommand().equals("estadoRetICMS")) {
                if (!StringHelper.isBlankOrNull((Object)estadoTO.getCodigo())) {
                    this.a.setListaTransRetencaoMunicipio(this.a.getMunicipioTO(estadoTO));
                } else {
                    this.a.setListaTransRetencaoMunicipio(null);
                }
            }
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("volumeCarregado")) {
            this.a((VolumeTO)evt.getNewValue());
        } else if (evt.getPropertyName().equals("VOLUME_ALTERADO")) {
            this.a.refreshTableVolume();
        } else if (evt.getPropertyName().equals("transportadoraChanged")) {
            this.a.setTransportadoraTO((TransportadoraTO)evt.getNewValue());
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
        this.j();
    }

    private void l() {
        this.a = new JDialog((Frame)DSENDesktop.getInstance());
        try {
            PesquisarTransportadoraGUI pesquisarGUI = new PesquisarTransportadoraGUI((CarregarTOCadastroInterface)this);
            this.a.setTitle(DSENLabelConstants.CADASTRO_TRANSPORTADORAS);
            this.a.getContentPane().add((Component)pesquisarGUI);
            this.a.pack();
            this.a.setSize(800, 600);
            this.a.setLocationRelativeTo(null);
            this.a.setIconImage(DSENDesktop.getInstance().getIconImage());
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
        this.a.setModal(true);
        this.a.setVisible(true);
    }

    public void carregar(TransportadoraTO to) {
        this.a.setTransportadoraTO(to);
    }

    public JDialog getDialogGUI() {
        return this.a;
    }
}

