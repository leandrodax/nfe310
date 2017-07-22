/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.IcmsController
 *  br.gov.sp.fazenda.dsen.view.IcmsGUI
 *  br.gov.sp.fazenda.dsen.view.WindowManager
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller;

import br.gov.sp.fazenda.dsen.common.enumeration.CSTEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoTributacaoEnum;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.IcmsGUI;
import br.gov.sp.fazenda.dsen.view.WindowManager;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.SwingUtilities;

public class IcmsController
extends DSGEBaseController
implements ItemListener {
    private IcmsGUI a;

    public IcmsController(ViewItf view) {
        this.a = (IcmsGUI)view;
        this.a.addActionListener((EventListener)this);
        if (this.a.getOperacao().equals("insertICMS")) {
            this.b();
        } else if (this.a.getOperacao().equals("updateICMS")) {
            this.a();
        }
    }

    private void a() {
        this.a.setBtnSalvarTitle(DSENLabelConstants.ALTERAR);
        this.a.disableComponents("AllICMSFields");
        this.a.disableComponents("updateICMS");
        CSTEnum icmsEnum = this.a.getICMSEnumCst();
        if (icmsEnum != null) {
            this.a.enableComponents(icmsEnum.getDescricao());
        }
    }

    private void b() {
        this.a.setBtnSalvarTitle(DSENLabelConstants.INCLUIR);
        this.a.disableComponents("AllICMSFields");
        this.a.enableComponents(this.a.getOperacao());
    }

    private void c() {
        ProdutoTO produtoTO = this.a.getProdutoTO();
        HashSet<IcmsTO> listaICMS = null;
        if (produtoTO.getIcmsTOSet() == null) {
            listaICMS = new HashSet<IcmsTO>();
            produtoTO.setIcmsTOSet(listaICMS);
        } else {
            listaICMS = produtoTO.getIcmsTOSet();
        }
        IcmsTO icmsNewTO = this.a.getIcmsTO();
        boolean isValid = true;
        if (this.a.getTipoTributacaoEnum() == null) {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.REGIME));
            isValid = false;
        } else if (StringHelper.isBlankOrNull((Object)icmsNewTO.getCst())) {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.SITUACAO_TRIBUTARIA));
            isValid = false;
        }
        for (IcmsTO icmsTO : listaICMS) {
            if (!icmsTO.getCst().equals(icmsNewTO.getCst())) continue;
            this.a.showMessage(DSENMessageConstants.MSG_ICMS_DUPLICATED);
            isValid = false;
            break;
        }
        if (isValid) {
            listaICMS.add(icmsNewTO);
            this.a.limparCamposCSOSN();
            this.a.limparCamposCST();
            this.a.disableComponents("AllICMSFields");
            this.a.enableComponents(this.a.getOperacao());
            this.a.setIcmsTO(null);
            this.a.showMessage(DSENMessageConstants.MSG_ICMS_INSERTED_SUCCESSFULL);
            this.d();
        }
    }

    private void d() {
        this.a.firePropertyChange(this.a.getOperacao());
        Component root = SwingUtilities.getRoot((Component)this.a);
        if (root instanceof Dialog) {
            ((Dialog)root).setVisible(false);
            ((Dialog)root).dispose();
        } else {
            WindowManager.getInstance().closePanel();
        }
    }

    private void e() {
        this.a.getIcmsTO();
        this.a.showMessage(DSENMessageConstants.MSG_ICMS_UPDATED_SUCCESSFULL);
        this.d();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("voltar")) {
            this.d();
        } else if (e.getActionCommand().equals("insertICMS")) {
            this.c();
        } else if (e.getActionCommand().equals("updateICMS")) {
            this.e();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }
}

