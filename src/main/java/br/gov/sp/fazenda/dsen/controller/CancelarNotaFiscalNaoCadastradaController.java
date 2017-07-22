/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.controller.CancelarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.CancelarNotaFiscalNaoCadastradaController
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.controller.CancelarNotaFiscalController;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.util.EventListener;

public class CancelarNotaFiscalNaoCadastradaController
extends DSGEBaseController {
    private CancelarNotaFiscalNaoCadastradaGUI a;

    public CancelarNotaFiscalNaoCadastradaController(ViewItf view) {
        this.a = (CancelarNotaFiscalNaoCadastradaGUI)view;
        this.a.addActionListener((EventListener)this);
    }

    public void actionPerformed(ActionEvent e) {
        if ("ACTION_CANCELAR_NFE".equals(e.getActionCommand())) {
            this.a();
        } else if ("cancelar".equals(e.getActionCommand())) {
            this.a.setVisible(false);
            this.a.dispose();
        }
    }

    private void a() {
        try {
            NotaFiscalFacade facade = new NotaFiscalFacade();
            EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
            BaseTO cancelamento = facade.validarCamposParaCancelarNFeNaoCadastrada(this.a.getChave(), this.a.getNrProtocolo(), this.a.getJustificativa(), emitenteTO);
            if (!StringHelper.isBlankOrNull((Object)cancelamento.getErrorsString())) {
                this.a.showMessage(cancelamento);
                return;
            }
            CertificadoTO certificado = SelecionarCertificadoGUI.getCertificado((Component)this.a, (TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA);
            if (certificado != null) {
                CancelarNotaFiscalController cancelamentoController = new CancelarNotaFiscalController(certificado, this.a.getJustificativa(), this.a.getChave(), this.a.getNrProtocolo());
                cancelamentoController.showNewGUI((Dialog)this.a).setVisible(true);
            }
        }
        catch (DSGEBaseException ex) {
            this.a.showErrors(ex);
        }
    }
}

