/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO
 *  br.gov.sp.fazenda.dsen.controller.nfe.AutorizacaoController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.AutorizacaoGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.AutorizacaoTO;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.AutorizacaoGUI;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.EventListener;

public class AutorizacaoController
extends DSGEBaseController
implements ItemListener {
    private AutorizacaoGUI a;
    private DSENUtilHelper a;

    public AutorizacaoController(ViewItf view) throws DSGEUtilException {
        this.a = (AutorizacaoGUI)view;
        view.addActionListener((EventListener)this);
        this.a = DSENUtilHelper.getInstance();
        this.a.disableComponents("autorizacaoTodos");
        if (this.a.getOperacaoNota().equals("manterNotaOperacaoEdicao")) {
            this.a.enableComponents("autorizacaoTodos");
        }
    }

    private void a() {
        AutorizacaoTO autorizacaoTO = this.a.getAutorizacaoTO();
        if (!StringHelper.isBlankOrNull((Object)autorizacaoTO.getCNPJ()) || !StringHelper.isBlankOrNull((Object)autorizacaoTO.getCPF())) {
            if (this.a.getAcao().equals("manterNotaAutorizacaoIncluir")) {
                this.a.firePropertyChange("AUTORIZACAO_NOTA_INSERTED", autorizacaoTO);
            } else if (this.a.getAcao().equals("manterNotaAutorizacaoDetalhar")) {
                this.a.firePropertyChange("AUTORIZACAO_NOTA_UPDATED", autorizacaoTO);
            }
            this.a.fechar();
        } else {
            this.a.showMessage("Campo(s) obrigat\u00f3rio(s) n\u00e3o informado(s)");
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ok")) {
            this.a();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }
}

