/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ObservacaoNotaTO
 *  br.gov.sp.fazenda.dsen.common.to.ProcessoReferenciadoNotaTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalInfoController
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ObservacaoFiscoContribGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.ProcessoReferenciadoGUI
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.ObservacaoNotaTO;
import br.gov.sp.fazenda.dsen.common.to.ProcessoReferenciadoNotaTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ObservacaoFiscoContribGUI;
import br.gov.sp.fazenda.dsen.view.nfe.ProcessoReferenciadoGUI;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;

public class ManterNotaFiscalInfoController
extends DSGEBaseController {
    private DigitarNotaFiscalGUI a;
    private static final int a = 100;
    private int b;

    public ManterNotaFiscalInfoController(ViewItf view, int aba) {
        this.a = (DigitarNotaFiscalGUI)view;
        this.b = aba;
        this.a.addActionListener((EventListener)this, this.b);
    }

    private void a() {
        List lista = this.a.getAllObservacaoContribuinteTOs();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                ObservacaoNotaTO obsTO = (ObservacaoNotaTO)lista.get(i);
                obsTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void b() {
        List lista = this.a.getAllObservacaoFiscoTOs();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                ObservacaoNotaTO obsTO = (ObservacaoNotaTO)lista.get(i);
                obsTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void c() {
        List lista = this.a.getAllProcessoReferenciadoTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                ProcessoReferenciadoNotaTO procTO = (ProcessoReferenciadoNotaTO)lista.get(i);
                procTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void d() {
        ObservacaoFiscoContribGUI obsGUI = new ObservacaoFiscoContribGUI(this.a, null, false);
        obsGUI.setVisible(true);
        ObservacaoNotaTO obsTO = obsGUI.getObsTO();
        if (obsTO != null) {
            this.a.adicionarObservacaoContribuinteTO(obsTO);
            this.a();
            this.a.verificarSelecionadosTabela(this.a.getSelectedObservacaoContribuinteTOs(), DSENLabelConstants.OBSERVACAO_CONTRIBUINTE);
        }
    }

    private void e() {
        ObservacaoNotaTO obsTO = this.a.getSelectedObservaoContribuinteTO();
        if (obsTO != null) {
            ObservacaoFiscoContribGUI obsGUI = new ObservacaoFiscoContribGUI(this.a, obsTO, false);
            obsGUI.setVisible(true);
            obsTO = obsGUI.getObsTO();
            if (obsTO != null) {
                this.a.refreshTableObsContrib();
                this.a.verificarSelecionadosTabela(this.a.getSelectedObservacaoContribuinteTOs(), DSENLabelConstants.OBSERVACAO_CONTRIBUINTE);
            }
        }
    }

    private void f() {
        List lista = this.a.getSelectedObservacaoContribuinteTOs();
        if (lista != null) {
            this.a.excluirObservacaoContribuinteTO(lista);
            this.a();
            this.a.verificarSelecionadosTabela(this.a.getSelectedObservacaoContribuinteTOs(), DSENLabelConstants.OBSERVACAO_CONTRIBUINTE);
        }
    }

    private void g() {
        ObservacaoFiscoContribGUI obsGUI = new ObservacaoFiscoContribGUI(this.a, null, true);
        obsGUI.setVisible(true);
        ObservacaoNotaTO obsTO = obsGUI.getObsTO();
        if (obsTO != null) {
            this.a.adicionarObservacaoFiscoTO(obsTO);
            this.b();
            this.a.verificarSelecionadosTabela(this.a.getSelectedObservacaoFiscoTOs(), DSENLabelConstants.OBSERVACAO_FISCO);
        }
    }

    private void h() {
        ObservacaoNotaTO obsTO = this.a.getSelectedObservaoFiscoTO();
        if (obsTO != null) {
            ObservacaoFiscoContribGUI obsGUI = new ObservacaoFiscoContribGUI(this.a, obsTO, true);
            obsGUI.setVisible(true);
            obsTO = obsGUI.getObsTO();
            if (obsTO != null) {
                this.a.refreshTableObsFisco();
                this.a.verificarSelecionadosTabela(this.a.getSelectedObservacaoFiscoTOs(), DSENLabelConstants.OBSERVACAO_FISCO);
            }
        }
    }

    private void i() {
        List lista = this.a.getSelectedObservacaoFiscoTOs();
        if (lista != null) {
            this.a.excluirObservacaoFiscoTO(lista);
            this.b();
            this.a.verificarSelecionadosTabela(this.a.getSelectedObservacaoFiscoTOs(), DSENLabelConstants.OBSERVACAO_FISCO);
        }
    }

    private void j() {
        if (this.a.getAllProcessoReferenciadoTO().size() > 100) {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.MSG_MAX_INFO_PROCESSO, 100));
        } else {
            ProcessoReferenciadoGUI procGUI = new ProcessoReferenciadoGUI(this.a, null);
            procGUI.setVisible(true);
            ProcessoReferenciadoNotaTO procTO = procGUI.getProcTO();
            if (procTO != null) {
                this.a.adicionarProcessoReferenciadoNotaTO(procTO);
                this.c();
                this.a.verificarSelecionadosTabela(this.a.getSelectedProcessoReferenciadoTOs(), DSENLabelConstants.PROCESSO_REFERENCIADO);
            }
        }
    }

    private void k() {
        ProcessoReferenciadoNotaTO refTO = this.a.getSelectedProcessoReferenciadoTO();
        if (refTO != null) {
            ProcessoReferenciadoGUI refGUI = new ProcessoReferenciadoGUI(this.a, refTO);
            refGUI.setVisible(true);
            refTO = refGUI.getProcTO();
            if (refTO != null) {
                this.a.refreshTableProcessoReferenciado();
                this.a.verificarSelecionadosTabela(this.a.getSelectedProcessoReferenciadoTOs(), DSENLabelConstants.PROCESSO_REFERENCIADO);
            }
        }
    }

    private void l() {
        List lista = this.a.getSelectedProcessoReferenciadoTOs();
        if (lista != null) {
            this.a.excluirProcessoReferenciadoTO(lista);
            this.c();
            this.a.verificarSelecionadosTabela(this.a.getSelectedProcessoReferenciadoTOs(), DSENLabelConstants.PROCESSO_REFERENCIADO);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ACTION_INCLUIR_OBS_CONT")) {
            this.d();
        } else if (e.getActionCommand().equals("ACTION_DETALHAR_OBS_CONT")) {
            this.e();
        } else if (e.getActionCommand().equals("ACTION_EXCLUIR_OBS_CONT")) {
            this.f();
        } else if (e.getActionCommand().equals("ACTION_INCLUIR_OBS_FISCO")) {
            this.g();
        } else if (e.getActionCommand().equals("ACTION_DETALHAR_OBS_FISCO")) {
            this.h();
        } else if (e.getActionCommand().equals("ACTION_EXCLUIR_OBS_FISCO")) {
            this.i();
        } else if (e.getActionCommand().equals("ACTION_INCLUIR_PROCESSO")) {
            this.j();
        } else if (e.getActionCommand().equals("ACTION_DETALHAR_PROCESSO")) {
            this.k();
        } else if (e.getActionCommand().equals("ACTION_EXCLUIR_PROCESSO")) {
            this.l();
        }
    }
}

