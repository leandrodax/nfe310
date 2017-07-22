/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndIEDestEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoDestEnum
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalDestController
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal$Factory
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.PesquisarClienteGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.EnderecoGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.PaisTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.IndIEDestEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoDestEnum;
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TLocal;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.PesquisarClienteGUI;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.EnderecoGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.PaisTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;

public class ManterNotaFiscalDestController
extends DSGEBaseController
implements CarregarTOCadastroInterface<ClienteTO>,
ItemListener,
PropertyChangeListener {
    private DigitarNotaFiscalGUI a;
    private int a;
    private DSENUtilHelper a;
    private JDialog a;

    public ManterNotaFiscalDestController(ViewItf view, int aba) throws DSGEUtilException {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
        this.a = DSENUtilHelper.getInstance();
        this.a();
    }

    private void a() {
        try {
            this.a.setListaDestPais(this.a.getPaisTO());
            this.a.setDestPais(this.a.getPaisTO(DSENConstants.BRASIL));
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
        this.a.setListaDestTipoDocumento(TipoDocumentoDestEnum.values());
        this.a.setListaDestTipoContribuinte(IndIEDestEnum.values());
    }

    private void a(PaisTO paisTO) throws DSGEUtilException {
        if (paisTO != null && !StringHelper.isBlankOrNull((Object)paisTO.getCodigo())) {
            List listaEstado = this.a.getEstadoTO(paisTO);
            this.a.setListaDestEstado(listaEstado);
            this.a.setListaDestMunicipio(null);
        } else {
            this.a.setListaDestEstado(null);
            this.a.setListaDestMunicipio(null);
        }
    }

    private void a(EstadoTO estadoTO) {
        if (estadoTO != null && !StringHelper.isBlankOrNull((Object)estadoTO.getCodigo())) {
            try {
                List listaMunicipio = this.a.getMunicipioTO(estadoTO);
                this.a.setListaDestMunicipio(listaMunicipio);
            }
            catch (DSGEUtilException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        } else {
            this.a.setListaDestMunicipio(null);
        }
    }

    private void b() {
        TLocal enderecoEntrega = this.a.getEnderecoEntrega();
        if (enderecoEntrega == null) {
            enderecoEntrega = TLocal.Factory.newInstance();
        }
        try {
            EnderecoGUI enderecoGUI = new EnderecoGUI("manterNotaDestEntrega", this.a.getOperacao(), DSENLabelConstants.LOCAL_ENTREGA);
            enderecoGUI.setEndereco(enderecoEntrega);
            enderecoGUI.addPropertyChangeListener("manterNotaDestEntrega", (PropertyChangeListener)this);
            enderecoGUI.setVisible(true);
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    private void c() throws DSGEUtilException {
        TLocal enderecoRetirada = this.a.getEnderecoRetirada();
        if (enderecoRetirada == null) {
            enderecoRetirada = TLocal.Factory.newInstance();
        }
        try {
            EnderecoGUI enderecoGUI = new EnderecoGUI("manterNotaDestRetirada", this.a.getOperacao(), DSENLabelConstants.LOCAL_RETIRADA);
            enderecoGUI.setEndereco(enderecoRetirada);
            enderecoGUI.addPropertyChangeListener("manterNotaDestRetirada", (PropertyChangeListener)this);
            enderecoGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void d() {
        this.a = new JDialog((Frame)DSENDesktop.getInstance());
        try {
            PesquisarClienteGUI clienteGUI = new PesquisarClienteGUI((CarregarTOCadastroInterface)this);
            this.a.setTitle(DSENLabelConstants.CADASTRO_CLIENTES);
            this.a.getContentPane().add((Component)clienteGUI);
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

    private void e() {
        ConsultaCadastroTO consultaCadastroTO = this.a.getDestConsultaCadastroTO();
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
        if (e.getActionCommand().equals("manterNotaDestEntrega")) {
            this.b();
        } else if (e.getActionCommand().equals("manterNotaDestRetirada")) {
            try {
                this.c();
            }
            catch (DSGEUtilException e1) {
                this.a.showErrors((DSGEBaseException)e1);
            }
        } else if (e.getActionCommand().equals("manterNotaDestImportar")) {
            this.d();
        } else if (e.getActionCommand().equals("MANTER_NOTA_DEST_CONSULTAR_CADASTRO")) {
            this.e();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == 1 && e.getSource() instanceof JComboBox) {
            JComboBox source = (JComboBox)e.getSource();
            if (source.getActionCommand().equals("pais")) {
                try {
                    this.a((PaisTO)e.getItem());
                }
                catch (DSGEUtilException e1) {
                    this.a.showErrors((DSGEBaseException)e1);
                }
            } else if (source.getActionCommand().equals("estado")) {
                this.a((EstadoTO)e.getItem());
            }
        }
        if (e.getSource() instanceof JCheckBox) {
            JCheckBox source = (JCheckBox)e.getSource();
            if (source.getActionCommand().equals("manterNotaDestEntrega")) {
                if (e.getStateChange() == 1) {
                    this.a.enableComponents("manterNotaDestEntrega");
                } else {
                    this.a.disableComponents("manterNotaDestEntrega");
                    this.a.setEnderecoEntrega(null);
                }
            } else if (source.getActionCommand().equals("manterNotaDestRetirada")) {
                if (e.getStateChange() == 1) {
                    this.a.enableComponents("manterNotaDestRetirada");
                } else {
                    this.a.disableComponents("manterNotaDestRetirada");
                    this.a.setEnderecoRetirada(null);
                }
            }
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("manterNotaDestEntrega")) {
            this.a.setEnderecoEntrega((TLocal)evt.getNewValue());
        } else if (evt.getPropertyName().equals("manterNotaDestRetirada")) {
            this.a.setEnderecoRetirada((TLocal)evt.getNewValue());
        } else if (evt.getPropertyName().equals("clienteImportado")) {
            this.carregar((ClienteTO)evt.getNewValue());
        }
    }

    public void carregar(ClienteTO clienteTO) {
        this.a.carregarCliente(clienteTO);
    }

    public JDialog getDialogGUI() {
        return this.a;
    }
}

