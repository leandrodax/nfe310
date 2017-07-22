/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController
 *  br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalNaoCadastradaController
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.ConsultarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.ConsultarNotaFiscalNaoCadastradaGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.controller.ConsultarNotaFiscalController;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.ConsultarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.ConsultarNotaFiscalNaoCadastradaGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class ConsultarNotaFiscalNaoCadastradaController
extends DSGEBaseController {
    private ConsultarNotaFiscalNaoCadastradaGUI a;

    public ConsultarNotaFiscalNaoCadastradaController(ViewItf view) {
        this.a = (ConsultarNotaFiscalNaoCadastradaGUI)view;
        this.a.addActionListener((EventListener)this);
    }

    public void actionPerformed(ActionEvent e) {
        if ("consultarNFe".equals(e.getActionCommand())) {
            this.a();
        } else if ("cancelar".equals(e.getActionCommand())) {
            this.a.setVisible(false);
            this.a.dispose();
        }
    }

    private void a() {
        block5 : {
            try {
                NotaFiscalFacade facade = new NotaFiscalFacade();
                NotaFiscalTO nfe = facade.validarDadosParaConsultarNFENaoCadastrada(this.a.getChave());
                if (!StringHelper.isBlankOrNull((Object)nfe.getErrorsString())) {
                    this.a.showMessage((BaseTO)nfe);
                    return;
                }
                CertificadoTO certificado = SelecionarCertificadoGUI.getCertificado((Component)this.a, (TipoCertificadoEnum)TipoCertificadoEnum.CONEXAO);
                if (certificado == null) break block5;
                ArrayList<NotaFiscalTO> lista = new ArrayList<NotaFiscalTO>();
                try {
                    ChaveAcessoTO chaveAcessoTO = ChaveAcessoUtil.obterChaveAcessoTO((String)this.a.getChave());
                    EmitenteTO emitenteTO = new EmitenteTO();
                    emitenteTO.setNrDocumento(chaveAcessoTO.getCnpjEmitente());
                    lista.add(ChaveAcessoUtil.gerarNotaFiscalTO((ChaveAcessoTO)chaveAcessoTO, (EmitenteTO)emitenteTO));
                }
                catch (DSENCommonException chaveAcessoTO) {
                    // empty catch block
                }
                ConsultarNotaFiscalController consultaController = new ConsultarNotaFiscalController(certificado, lista, true);
                consultaController.showNewGUI((Dialog)this.a).setVisible(true);
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }
}

