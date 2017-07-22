/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DeducaoTO
 *  br.gov.sp.fazenda.dsen.common.to.FornecimentoTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.controller.nfe.ManterNotaFiscalCanaController
 *  br.gov.sp.fazenda.dsen.view.nfe.DeducaoCanaGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI
 *  br.gov.sp.fazenda.dsen.view.nfe.FornecimentoDiarioGUI
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.to.DeducaoTO;
import br.gov.sp.fazenda.dsen.common.to.FornecimentoTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.view.nfe.DeducaoCanaGUI;
import br.gov.sp.fazenda.dsen.view.nfe.DigitarNotaFiscalGUI;
import br.gov.sp.fazenda.dsen.view.nfe.FornecimentoDiarioGUI;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.text.MessageFormat;
import java.util.EventListener;
import java.util.List;

public class ManterNotaFiscalCanaController
extends DSGEBaseController {
    private DigitarNotaFiscalGUI a;
    private int a;

    public ManterNotaFiscalCanaController(ViewItf view, int aba) {
        this.a = (DigitarNotaFiscalGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, this.a);
    }

    private void a() {
        List lista = this.a.getAllFornecimentoTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                FornecimentoTO fornecimentoTO = (FornecimentoTO)lista.get(i);
                fornecimentoTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void b() {
        List lista = this.a.getAllDeducaoTO();
        if (lista != null) {
            for (int i = 0; i < lista.size(); ++i) {
                DeducaoTO deducaoTO = (DeducaoTO)lista.get(i);
                deducaoTO.setNItem(String.valueOf(i + 1));
            }
        }
    }

    private void c() {
        if (!StringHelper.isBlankOrNull((Object)this.a.getMesAnoRefCana().replaceAll("\\D", ""))) {
            FornecimentoDiarioGUI fornecimentoGUI = new FornecimentoDiarioGUI(this.a, null, this.a.getMesAnoRefCana());
            fornecimentoGUI.setVisible(true);
            FornecimentoTO fornecimentoTO = fornecimentoGUI.getFornecimentoTO();
            if (fornecimentoTO != null) {
                this.a.adicionarFornecimentoTO(fornecimentoTO);
                this.a();
                this.a.verificarSelecionadosTabela(this.a.getSelectedFornecimentoTOs(), DSENLabelConstants.FORNECIMENTOS_DIARIOS);
            }
        } else {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.MSG_CANA_PREENCHA_MES_ANO, DSENLabelConstants.FORNECIMENTOS_DIARIOS, DSENLabelConstants.MES_ANO_REFERENCIA));
        }
    }

    private void d() {
        DeducaoCanaGUI deducaoGUI = new DeducaoCanaGUI(this.a, null);
        deducaoGUI.setVisible(true);
        DeducaoTO deducaoTO = deducaoGUI.getDeducaoTO();
        if (deducaoTO != null) {
            this.a.adicionarDeducaoTO(deducaoTO);
            this.b();
            this.a.verificarSelecionadosTabela(this.a.getSelectedDeducaoTOs(), DSENLabelConstants.DEDUCOES);
        }
    }

    private void e() {
        List lista = this.a.getSelectedFornecimentoTOs();
        if (lista != null) {
            this.a.excluirFornecimentoTO(lista);
            this.a();
            this.a.verificarSelecionadosTabela(this.a.getSelectedFornecimentoTOs(), DSENLabelConstants.FORNECIMENTOS_DIARIOS);
        }
    }

    private void f() {
        List lista = this.a.getSelectedDeducaoTOs();
        if (lista != null) {
            this.a.excluirDeducaoTO(lista);
            this.b();
            this.a.verificarSelecionadosTabela(this.a.getSelectedDeducaoTOs(), DSENLabelConstants.DEDUCOES);
        }
    }

    private void g() {
        if (!StringHelper.isBlankOrNull((Object)this.a.getMesAnoRefCana().replaceAll("\\D", "")) || this.a.getOperacao().equals("manterNotaOperacaoDetalhe")) {
            FornecimentoTO fornecimentoTO = this.a.getSelectedFornecimentoTO();
            if (fornecimentoTO != null) {
                FornecimentoDiarioGUI fornecimentoGUI = new FornecimentoDiarioGUI(this.a, fornecimentoTO, this.a.getMesAnoRefCana());
                fornecimentoGUI.setVisible(true);
                fornecimentoTO = fornecimentoGUI.getFornecimentoTO();
                if (fornecimentoTO != null) {
                    this.a.refreshTableFornecimentos();
                    this.a.verificarSelecionadosTabela(this.a.getSelectedFornecimentoTOs(), DSENLabelConstants.FORNECIMENTOS_DIARIOS);
                }
            }
        } else {
            this.a.showMessage(MessageFormat.format(DSENMessageConstants.MSG_CANA_PREENCHA_MES_ANO, DSENLabelConstants.FORNECIMENTOS_DIARIOS, DSENLabelConstants.MES_ANO_REFERENCIA));
        }
    }

    private void h() {
        DeducaoTO deducaoTO = this.a.getSelectedDeducaoTO();
        if (deducaoTO != null) {
            DeducaoCanaGUI deducaoGUI = new DeducaoCanaGUI(this.a, deducaoTO);
            deducaoGUI.setVisible(true);
            deducaoTO = deducaoGUI.getDeducaoTO();
            if (deducaoTO != null) {
                this.a.refreshTableDeducoes();
                this.a.verificarSelecionadosTabela(this.a.getSelectedDeducaoTOs(), DSENLabelConstants.DEDUCOES);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ACTION_DETALHAR_DEDUCAO")) {
            this.h();
            this.a.atualizaTotaisDeducoes();
            this.a.reordenaDeducoes();
        } else if (e.getActionCommand().equals("ACTION_EXCLUIR_DEDUCAO")) {
            this.f();
            this.a.atualizaTotaisDeducoes();
            this.a.reordenaDeducoes();
        } else if (e.getActionCommand().equals("ACTION_INCLUIR_DEDUCAO")) {
            this.d();
            this.a.atualizaTotaisDeducoes();
            this.a.reordenaDeducoes();
        } else if (e.getActionCommand().equals("ACTION_DETALHAR_FORNECIMENTO")) {
            this.g();
            this.a.atualizaTotaisFornecimentos();
            this.a.reordenaFornecimentos();
        } else if (e.getActionCommand().equals("ACTION_EXCLUIR_FORNECIMENTO")) {
            this.e();
            this.a.atualizaTotaisFornecimentos();
            this.a.reordenaFornecimentos();
        } else if (e.getActionCommand().equals("ACTION_INCLUIR_FORNECIMENTO")) {
            this.c();
            this.a.atualizaTotaisFornecimentos();
            this.a.reordenaFornecimentos();
        }
    }
}

