/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.controller.CancelarNotaFiscaNaoCadastradalEventoController
 *  br.gov.sp.fazenda.dsen.controller.EnviarEventoController
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaEventoGUI
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.EnviarEventoGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoEventoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.controller.EnviarEventoController;
import br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade;
import br.gov.sp.fazenda.dsen.view.CancelarNotaFiscalNaoCadastradaEventoGUI;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.EnviarEventoGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.EventListener;
import java.util.List;

public class CancelarNotaFiscaNaoCadastradalEventoController
extends DSGEBaseController {
    private CancelarNotaFiscalNaoCadastradaEventoGUI a;

    public CancelarNotaFiscaNaoCadastradalEventoController(ViewItf view) {
        this.a = (CancelarNotaFiscalNaoCadastradaEventoGUI)view;
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
        block9 : {
            try {
                NotaFiscalFacade facade = new NotaFiscalFacade();
                EmitenteTO emitenteTO = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
                String txDhEvento = this.a.getTxDhEvento();
                Date dhEvento = null;
                if (!StringHelper.isBlankOrNull((Object)txDhEvento)) {
                    dhEvento = DateHelper.getDateTime((String)txDhEvento, (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT);
                    if (dhEvento == null || !DateHelper.formataDataHora((Date)dhEvento, (SimpleDateFormat)DateHelper.DATE_TIME_XML_FORMAT).matches("(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\\d):[0-5]\\d:[0-5]\\d")) {
                        this.a.showMessage(DSENMessageConstants.DATE_TIME_INVALID_MSG);
                        return;
                    }
                } else {
                    this.a.showMessage(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, "Data e Hora do Evento"));
                    return;
                }
                BaseTO cancelamento = facade.validarCamposParaCancelarNFeNaoCadastrada(this.a.getChaveAcesso(), this.a.getProtocolo(), this.a.getJustificativaCancelamento(), emitenteTO);
                if (!StringHelper.isBlankOrNull((Object)cancelamento.getErrorsString())) {
                    this.a.showMessage(cancelamento);
                    return;
                }
                CertificadoTO certificado = SelecionarCertificadoGUI.getCertificado((Component)this.a, (TipoCertificadoEnum)TipoCertificadoEnum.ASSINATURA);
                NotaFiscalTO nfe = ChaveAcessoUtil.gerarNotaFiscalTO((ChaveAcessoTO)ChaveAcessoUtil.obterChaveAcessoTO((String)this.a.getChaveAcesso()), (EmitenteTO)emitenteTO);
                if (certificado == null) break block9;
                try {
                    CancelamentoEventoTO cancelamentoEventoTO = new CancelamentoEventoTO();
                    cancelamentoEventoTO.setNotaFiscalTO(nfe);
                    cancelamentoEventoTO.setTpEvento(TipoEventoEnum.e110111);
                    cancelamentoEventoTO.setnSeqEvento(Integer.valueOf(DocumentoUtil.recuperarProximoNSeqEvento((EventoTO)cancelamentoEventoTO)));
                    cancelamentoEventoTO.setDataEvento(dhEvento);
                    cancelamentoEventoTO.setNumProtocolo(this.a.getProtocolo());
                    cancelamentoEventoTO.setxJustificatica(this.a.getJustificativaCancelamento());
                    if (cancelamentoEventoTO != null) {
                        this.a((EventoTO)cancelamentoEventoTO, DSENMessageConstants.CANCELANDO_NFE, certificado);
                    }
                }
                catch (Throwable t) {
                    this.a.showErrors(t);
                }
                this.a.dispose();
            }
            catch (DSGEBaseException ex) {
                this.a.showErrors(ex);
            }
        }
    }

    private void a(EventoTO eventoTO, String tituloPersonalizado, CertificadoTO certificado) throws Exception {
        ArrayList<EventoTO> listaEventos = new ArrayList<EventoTO>();
        listaEventos.add(eventoTO);
        if (certificado != null) {
            EnviarEventoController enviarEventoController = new EnviarEventoController(listaEventos, certificado);
            EnviarEventoGUI enviarEventoGUI = enviarEventoController.showNewGUI((Window)DSENDesktop.getInstance(), tituloPersonalizado);
            enviarEventoGUI.setVisible(true);
        }
    }
}

