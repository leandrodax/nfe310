/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.controller.ConsultaCadastroConfirmacaoController
 *  br.gov.sp.fazenda.dsen.controller.InformacaoConsultaCadastroController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.ClienteFacade
 *  br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaCadastroGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.controller.InformacaoConsultaCadastroController;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.ClienteFacade;
import br.gov.sp.fazenda.dsen.view.ConsultaCadastroConfirmacaoGUI;
import br.gov.sp.fazenda.dsen.view.InformacaoConsultaCadastroGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;

public class ConsultaCadastroConfirmacaoController
extends DSGEBaseController {
    ConsultaCadastroConfirmacaoGUI a;

    public ConsultaCadastroConfirmacaoController(ViewItf view) {
        this.a = (ConsultaCadastroConfirmacaoGUI)view;
        this.a.addActionListener((EventListener)this);
    }

    public void actionPerformed(ActionEvent e) {
        if ("ok".equals(e.getActionCommand())) {
            this.b();
        } else if ("cancelar".equals(e.getActionCommand())) {
            this.a();
        }
    }

    private void a() {
        this.a.setVisible(false);
        this.a.dispose();
    }

    public static boolean validarTO(ViewItf gui, ConsultaCadastroTO consultaCadastroTO) {
        try {
            ClienteFacade facade = new ClienteFacade();
            facade.validarDadosParaConsultaCadastro(consultaCadastroTO);
            if (consultaCadastroTO.getErrors() != null && consultaCadastroTO.getErrors().size() > 0) {
                gui.showMessage(consultaCadastroTO.getErrorsString());
                return false;
            }
        }
        catch (DSENBusinessException e) {
            gui.showErrors((DSGEBaseException)e);
            return false;
        }
        return true;
    }

    private void b() {
        ConsultaCadastroTO consultaCadastroTO = this.a.getConsultaCadastroTO();
        CertificadoTO certificadoTO = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.CONEXAO);
        this.a();
        if (certificadoTO != null) {
            InformacaoConsultaCadastroController infController = new InformacaoConsultaCadastroController(consultaCadastroTO, certificadoTO);
            InformacaoConsultaCadastroGUI infGUI = infController.getGUI();
            infController.consultar();
            infGUI.setVisible(true);
        }
    }
}

