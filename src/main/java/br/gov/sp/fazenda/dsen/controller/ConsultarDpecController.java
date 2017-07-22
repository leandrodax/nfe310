/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.ConsultarDpecController
 *  br.gov.sp.fazenda.dsen.controller.InformacaoConsultaDpecController
 *  br.gov.sp.fazenda.dsen.view.ConsultarDpecGUI
 *  br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.controller.InformacaoConsultaDpecController;
import br.gov.sp.fazenda.dsen.view.ConsultarDpecGUI;
import br.gov.sp.fazenda.dsen.view.InformacaoConsultaDpecGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;
import java.util.EventListener;

public class ConsultarDpecController
extends DSGEBaseController {
    ConsultarDpecGUI a;

    public ConsultarDpecController(ViewItf view) {
        this.a = (ConsultarDpecGUI)view;
        this.a.addActionListener((EventListener)this);
    }

    public void actionPerformed(ActionEvent e) {
        if ("consultarNFe".equals(e.getActionCommand())) {
            this.a();
        } else if ("fechar".equals(e.getActionCommand())) {
            WindowManager.getInstance().closePanel();
        }
    }

    private void a() {
        if (!StringHelper.isBlankOrNull((Object)this.a.getIdDpec())) {
            CertificadoTO certificadoTO;
            if (TipoConsultaDpecEnum.CHAVE_ACESSO.equals((Object)this.a.getTipoConsultaDpecEnum())) {
                if (this.a.getIdDpec().length() != 44) {
                    this.a.showMessage(DSENMessageConstants.CHAVE_ACESSO_DEVE_POSSUIR_44_DIGITOS);
                    return;
                }
                if (!ChaveAcessoUtil.verificarDigitoChaveAcesso((String)this.a.getIdDpec())) {
                    this.a.showMessage(DSENMessageConstants.CHAVE_ACESSO_INVALIDA_DIGITO_NAO_CONFERE);
                    return;
                }
            } else if (this.a.getIdDpec().length() != 15) {
                this.a.showMessage(DSENMessageConstants.NUMERO_REGISTRO_DPEC_DEVE_POSSUIR_15_DIGITOS);
                return;
            }
            if ((certificadoTO = SelecionarCertificadoGUI.getCertificado((TipoCertificadoEnum)TipoCertificadoEnum.CONEXAO)) == null) {
                return;
            }
            InformacaoConsultaDpecController controller = new InformacaoConsultaDpecController(this.a.getTipoConsultaDpecEnum(), this.a.getIdDpec(), certificadoTO);
            InformacaoConsultaDpecGUI infGUI = controller.getGUI();
            controller.consultar();
            infGUI.setVisible(true);
        } else {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, this.a.getTipoConsultaDpecEnum().toString()));
        }
    }
}

