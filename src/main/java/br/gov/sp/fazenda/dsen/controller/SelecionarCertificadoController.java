/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RepositorioCertificadoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.SelecionarCertificadoController
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.SistemaFacade
 *  br.gov.sp.fazenda.dsen.view.DSENDesktop
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsge.certif.Certificado
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
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
import br.gov.sp.fazenda.dsen.common.enumeration.RepositorioCertificadoEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.facade.SistemaFacade;
import br.gov.sp.fazenda.dsen.view.DSENDesktop;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsge.certif.Certificado;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.Date;
import java.util.EventListener;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SelecionarCertificadoController
extends DSGEBaseController {
    private SelecionarCertificadoGUI a;
    private boolean a;
    private SistemaFacade a = false;

    public SelecionarCertificadoController(ViewItf view) {
        this.a = (SelecionarCertificadoGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a = new SistemaFacade();
        this.a();
    }

    private void a() {
        RepositorioCertificadoEnum tipoRepositorio = null;
        try {
            tipoRepositorio = this.a.obterTipoRepositorio(this.a());
        }
        catch (DSENBusinessException e) {
            DSENDesktop.getInstance().showErrors((DSGEBaseException)e);
        }
        if (tipoRepositorio != null) {
            if (RepositorioCertificadoEnum.REPOSITORIO_WINDOWS.equals((Object)tipoRepositorio)) {
                this.b();
                this.a = true;
            } else {
                this.c();
            }
        } else {
            this.c();
        }
        this.a.setIE(this.a);
    }

    private void b() {
        try {
            this.a.setListaCertificado(this.a.pesquisarCertificadosIE(this.a()));
        }
        catch (DSGEBaseException ex) {
            Throwable t = ex.getSourceException();
            if (t instanceof DSGECertificadoException) {
                DSENDesktop.getInstance().showMessage(t.getMessage());
            }
            DSENDesktop.getInstance().showErrors(ex);
        }
    }

    private void c() {
        try {
            this.a.setListaCertificado(this.a.pesquisarCertificados(this.a()));
        }
        catch (DSGEBaseException ex) {
            Throwable t = ex.getSourceException();
            if (t instanceof DSGECertificadoException) {
                DSENDesktop.getInstance().showMessage(t.getMessage());
            }
            DSENDesktop.getInstance().showErrors(ex);
        }
    }

    private void d() {
        CertificadoInfoTO infoTO = this.a.getSelectedCertificadoInfoTO();
        String pwd = this.a.getSenhaArquivo();
        Map certificadoMap = null;
        try {
            certificadoMap = this.a ? this.a.recuperarCertificadoIE(infoTO) : this.a.recuperarCertificado(pwd, infoTO);
            if (certificadoMap != null && certificadoMap.size() > 0) {
                X509Certificate x509Certificate2 = null;
                PrivateKey privateKey = null;
                for (X509Certificate x509Certificate2 : certificadoMap.keySet()) {
                    privateKey = (PrivateKey)certificadoMap.get(x509Certificate2);
                }
                if (x509Certificate2 != null && privateKey != null) {
                    String validacao = this.a.validarCertificado(this.a.getTipoCertificado(), x509Certificate2, this.a().getNrDocumento());
                    if (!StringHelper.isBlankOrNull((Object)validacao)) {
                        this.a.showMessage(validacao);
                        return;
                    }
                    CertificadoTO certificadoTO = new CertificadoTO();
                    certificadoTO.setX509Certificate(x509Certificate2);
                    certificadoTO.setPrivateKey(privateKey);
                    certificadoTO.setTipoCertificado(infoTO.getTipoCertificado());
                    this.a.setSelectedCertificadoTO(certificadoTO);
                    if (!this.a) {
                        this.a(infoTO);
                    }
                    this.a.dispose();
                } else if (Certificado.A3.equals(infoTO.getTipoCertificado())) {
                    this.a.showMessage(MessageFormat.format(DSENMessageConstants.CERTIFICADO_FALHA_ACESSO_DISPOSITIVO, infoTO.getAlias()));
                } else if (Certificado.A1.equals(infoTO.getTipoCertificado())) {
                    this.a.showMessage(MessageFormat.format(DSENMessageConstants.CERTIFICADO_FALHA_ACESSO_ARQUIVO, infoTO.getAlias(), infoTO.getCaminho()));
                }
            } else if (Certificado.A3.equals(infoTO.getTipoCertificado())) {
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.CERTIFICADO_FALHA_ACESSO_DISPOSITIVO, infoTO.getAlias()));
            } else if (Certificado.A1.equals(infoTO.getTipoCertificado())) {
                this.a.showMessage(MessageFormat.format(DSENMessageConstants.CERTIFICADO_FALHA_ACESSO_ARQUIVO, infoTO.getAlias(), infoTO.getCaminho()));
            }
        }
        catch (DSGEBaseException ex) {
            Throwable t = ex.getSourceException();
            if (t instanceof DSGECertificadoException) {
                this.a.showMessage(t.getMessage());
            }
            this.a.showErrors(ex);
        }
    }

    private void a(CertificadoInfoTO to) {
        to.setDataUtilizacao(new Date());
        try {
            this.a.atualizarCertificado(to);
        }
        catch (DSENBusinessException e) {
            this.a.showErrors((DSGEBaseException)e);
        }
    }

    private void e() {
        this.a.setVisible(false);
        this.a.dispose();
    }

    private EmitenteTO a() {
        return (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ACTION_SELECIONAR_CERTIFICADO")) {
            this.d();
        } else if (e.getActionCommand().equals("cancelar")) {
            this.e();
        }
    }
}

