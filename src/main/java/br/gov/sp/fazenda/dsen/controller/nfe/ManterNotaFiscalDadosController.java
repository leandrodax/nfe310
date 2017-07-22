/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IdentLocalDestinoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndAtendementoPresencialEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.IndOperacaoConsumidorFinalEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.RefECFTO
 *  br.gov.sp.fazenda.dsen.common.to.RefNFPTO
 *  br.gov.sp.fazenda.dsen.common.to.RefNFTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalDadosController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ECFReferenciadoGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaProdutorGUI
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
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

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FinalidadeEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FormaPagamentoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IdentLocalDestinoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndAtendementoPresencialEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.IndOperacaoConsumidorFinalEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.RefECFTO;
import br.gov.sp.fazenda.dsen.common.to.RefNFPTO;
import br.gov.sp.fazenda.dsen.common.to.RefNFTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ECFReferenciadoGUI;
import br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaGUI;
import br.gov.sp.fazenda.dsen.view.nfe.NotaReferenciadaProdutorGUI;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.List;

public class ManterNotaFiscalDadosController
extends DSGEBaseController
implements ItemListener,
PropertyChangeListener {
    private DigitarNotaFiscalGUI a;
    private int a;

    public ManterNotaFiscalDadosController(ViewItf view, int aba) throws DSGEUtilException {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
        this.a();
    }

    private void a() throws DSGEUtilException {
        this.a.setListaFinalidadeEmissao(FinalidadeEmissaoEnum.values());
        this.a.setListaFormaEmissao(TipoEmissaoEnum.values());
        this.a.setListaFormaPagamento(FormaPagamentoEnum.values());
        this.a.setListaTipoDocumentoNFe(TipoDocumentoNFeEnum.values());
        this.a.setListaTipoImpressao(TipoImpressaoEnum.values());
        this.a.setListaIdeEstado(DSENUtilHelper.getInstance().getEstadoTO(true));
        this.a.setListaTranspCFOP(DSENUtilHelper.getInstance().getCfopTranspTO());
        this.a.setListaRegimeTributario(RegimeTributarioEnum.values(), ((EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class)).getRegimeTributarioEnum());
        this.a.setListaTipoAtendimento(IndAtendementoPresencialEnum.values());
        this.a.setListaLocalDestino(IdentLocalDestinoEnum.values());
        this.a.setListaOperacaoConsumidor(IndOperacaoConsumidorFinalEnum.values());
    }

    private void b() {
        List lista = this.a.getAllRefNFTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                RefNFTO refNFTO = (RefNFTO)lista.get(i);
                refNFTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void c() throws DSGEUtilException {
        RefNFTO refNFTO = new RefNFTO();
        try {
            NotaReferenciadaGUI notaRefGUI = new NotaReferenciadaGUI("notaReferenciadaIncluir", this.a);
            notaRefGUI.addPropertyChangeListener("notaReferenciadaIncluir", (PropertyChangeListener)this);
            notaRefGUI.setRefNFTO(refNFTO);
            notaRefGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void d() throws DSGEUtilException {
        RefNFTO refNFTO = this.a.getSelectedNotaReferenciadaTO();
        if (refNFTO != null) {
            try {
                NotaReferenciadaGUI notaRefGUI = new NotaReferenciadaGUI("notaReferenciadaDetalhar", this.a);
                notaRefGUI.addPropertyChangeListener("notaReferenciadaDetalhar", (PropertyChangeListener)this);
                notaRefGUI.setRefNFTO(refNFTO);
                notaRefGUI.setVisible(true);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void a(RefNFTO refNFTO) {
        this.a.adicionarNotaFiscalReferenciadaTO(refNFTO);
        this.b();
    }

    private void e() {
        List lista = this.a.getSelectedNotaReferenciadaTOs();
        if (lista != null) {
            this.a.excluirNotaFiscalReferenciadaTO(lista);
            this.b();
        }
        this.a.verificarSelecionadosTabela(this.a.getSelectedNotaReferenciadaTOs(), DSENLabelConstants.NF_REFERENCIADA);
    }

    private void f() {
        List lista = this.a.getAllRefNFPTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                RefNFPTO refNFPTO = (RefNFPTO)lista.get(i);
                refNFPTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void g() throws DSGEUtilException {
        RefNFPTO refNFPTO = new RefNFPTO();
        try {
            NotaReferenciadaProdutorGUI notaRefGUI = new NotaReferenciadaProdutorGUI("notaReferenciadaProdutorIncluir", this.a);
            notaRefGUI.addPropertyChangeListener("notaReferenciadaProdutorIncluir", (PropertyChangeListener)this);
            notaRefGUI.setRefNFPTO(refNFPTO);
            notaRefGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void h() throws DSGEUtilException {
        RefNFPTO refNFPTO = this.a.getSelectedNotaReferenciadaProdutorTO();
        if (refNFPTO != null) {
            try {
                NotaReferenciadaProdutorGUI notaRefGUI = new NotaReferenciadaProdutorGUI("notaReferenciadaProdutorDetalhar", this.a);
                notaRefGUI.addPropertyChangeListener("notaReferenciadaProdutorDetalhar", (PropertyChangeListener)this);
                notaRefGUI.setRefNFPTO(refNFPTO);
                notaRefGUI.setVisible(true);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void a(RefNFPTO refNFPTO) {
        this.a.adicionarNotaFiscalReferenciadaProdutorTO(refNFPTO);
        this.f();
    }

    private void i() {
        List lista = this.a.getSelectedNotaReferenciadaProdutorTOs();
        if (lista != null) {
            this.a.excluirNotaFiscalReferenciadaProdutorTO(lista);
            this.f();
        }
        this.a.verificarSelecionadosTabela(this.a.getSelectedNotaReferenciadaProdutorTOs(), DSENLabelConstants.NFP_REFERENCIADA);
    }

    private void j() {
        List lista = this.a.getAllRefECFTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                RefECFTO refECFTO = (RefECFTO)lista.get(i);
                refECFTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void k() throws DSGEUtilException {
        RefECFTO refECFTO = new RefECFTO();
        try {
            ECFReferenciadoGUI ecfRefGUI = new ECFReferenciadoGUI("notaECFReferenciadoIncluir", this.a);
            ecfRefGUI.addPropertyChangeListener("notaECFReferenciadoIncluir", (PropertyChangeListener)this);
            ecfRefGUI.setRefECFTO(refECFTO);
            ecfRefGUI.setVisible(true);
        }
        catch (DSGEViewException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    private void l() throws DSGEUtilException {
        RefECFTO refECFTO = this.a.getSelectedECFReferenciadoTO();
        if (refECFTO != null) {
            try {
                ECFReferenciadoGUI ecfRefGUI = new ECFReferenciadoGUI("notaECFReferenciadoDetalhar", this.a);
                ecfRefGUI.addPropertyChangeListener("notaECFReferenciadoDetalhar", (PropertyChangeListener)this);
                ecfRefGUI.setRefECFTO(refECFTO);
                ecfRefGUI.setVisible(true);
            }
            catch (DSGEViewException ex) {
                this.a.showErrors((DSGEBaseException)ex);
            }
        }
    }

    private void a(RefECFTO refECFTO) {
        this.a.adicionarECFReferenciadoTO(refECFTO);
        this.j();
    }

    private void m() {
        List lista = this.a.getSelectedECFReferenciadoTOs();
        if (lista != null) {
            this.a.excluirECFReferenciadoTO(lista);
            this.j();
        }
        this.a.verificarSelecionadosTabela(this.a.getSelectedECFReferenciadoTOs(), DSENLabelConstants.CUPOM_FISCAL);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("notaReferenciadaIncluir")) {
                this.c();
            } else if (e.getActionCommand().equals("notaReferenciadaDetalhar")) {
                this.d();
            } else if (e.getActionCommand().equals("notaReferenciadaExcluir")) {
                this.e();
            } else if (e.getActionCommand().equals("notaReferenciadaProdutorIncluir")) {
                this.g();
            } else if (e.getActionCommand().equals("notaReferenciadaProdutorDetalhar")) {
                this.h();
            } else if (e.getActionCommand().equals("notaReferenciadaProdutorExcluir")) {
                this.i();
            } else if (e.getActionCommand().equals("notaECFReferenciadoIncluir")) {
                this.k();
            } else if (e.getActionCommand().equals("notaECFReferenciadoDetalhar")) {
                this.l();
            } else if (e.getActionCommand().equals("notaECFReferenciadoExcluir")) {
                this.m();
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("notaReferenciadaIncluir")) {
            this.a((RefNFTO)evt.getNewValue());
        } else if (evt.getPropertyName().equals("notaReferenciadaProdutorIncluir")) {
            this.a((RefNFPTO)evt.getNewValue());
        } else if (evt.getPropertyName().equals("notaECFReferenciadoIncluir")) {
            this.a((RefECFTO)evt.getNewValue());
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == 1) {
            EstadoTO estadoTO = (EstadoTO)e.getItem();
            if (estadoTO != null && !StringHelper.isBlankOrNull((Object)estadoTO.getCodigo())) {
                try {
                    List lista = DSENUtilHelper.getInstance().getMunicipioTO(estadoTO);
                    this.a.setListaIdeMunicipio(lista);
                }
                catch (DSGEUtilException ex) {
                    this.a.showErrors((DSGEBaseException)ex);
                }
            } else {
                this.a.setListaIdeMunicipio(null);
            }
        }
    }
}

