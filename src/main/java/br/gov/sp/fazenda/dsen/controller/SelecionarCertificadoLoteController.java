/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.controller.SelecionarCertificadoLoteController
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI
 *  br.gov.sp.fazenda.dsen.view.SelecionarCertificadoLoteGUI
 *  br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoGUI;
import br.gov.sp.fazenda.dsen.view.SelecionarCertificadoLoteGUI;
import br.gov.sp.fazenda.dsge.certif.TipoCertificadoEnum;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.EventListener;

public class SelecionarCertificadoLoteController
extends DSGEBaseController {
    private SelecionarCertificadoLoteGUI a;

    public SelecionarCertificadoLoteController(ViewItf view) {
        this.a = (SelecionarCertificadoLoteGUI)view;
        this.a.addActionListener((EventListener)this);
        this.a.disableComponents("buscaSefazCertificadoTodos");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("cancelar")) {
            this.b();
        } else if (e.getActionCommand().equals("continuar")) {
            this.c();
        } else if (e.getActionCommand().equals("selecionar")) {
            this.a();
        }
    }

    private void a() {
        CertificadoTO certificadoTO;
        CertificadoLoteTO certificadoLoteTO = this.a.getSelectedCertificadoLoteTO();
        if (certificadoLoteTO != null && (certificadoTO = SelecionarCertificadoGUI.getCertificado((Component)this.a, (TipoCertificadoEnum)TipoCertificadoEnum.CONEXAO)) != null) {
            certificadoLoteTO.setX509Certificate(certificadoTO.getX509Certificate());
            certificadoLoteTO.setPrivateKey(certificadoTO.getPrivateKey());
            certificadoLoteTO.setMarcado(Boolean.valueOf(true));
            certificadoLoteTO.setTpCertificado(certificadoTO.getTipoCertificado());
            this.a.refreshTable();
            this.a.enableComponents("buscaSefazCertificadoTodos");
        }
    }

    private void b() {
        this.a.setCancelled(true);
        this.a.dispose();
    }

    private void c() {
        this.a.setCancelled(false);
        this.a.dispose();
    }
}

