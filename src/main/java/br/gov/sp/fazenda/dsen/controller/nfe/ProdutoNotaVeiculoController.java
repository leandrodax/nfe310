/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.CondicaoVeiculoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RestricaoVeiculoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoOperacaoEnum
 *  br.gov.sp.fazenda.dsen.controller.nfe.ProdutoNotaVeiculoController
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.view.ViewItf
 */
package br.gov.sp.fazenda.dsen.controller.nfe;

import br.gov.sp.fazenda.dsen.common.enumeration.CondicaoVeiculoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RestricaoVeiculoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoOperacaoEnum;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsen.view.nfe.ProdutoNotaGUI;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.controller.DSGEBaseController;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.view.ViewItf;
import java.awt.event.ActionEvent;
import java.util.EventListener;
import java.util.List;

public class ProdutoNotaVeiculoController
extends DSGEBaseController {
    private ProdutoNotaGUI a;
    private int a;
    private DSENUtilHelper a;

    public ProdutoNotaVeiculoController(ViewItf view, int aba) throws DSGEUtilException {
        this.a = (ProdutoNotaGUI)view;
        this.a = aba;
        this.a.addActionListener((EventListener)this, aba);
        this.a = DSENUtilHelper.getInstance();
        this.a();
    }

    private void a() {
        this.a.setListaTipoOperacao(TipoOperacaoEnum.values());
        this.a.setListaCondicaoVeiculo(CondicaoVeiculoEnum.values());
        this.a.setListaRestricao(RestricaoVeiculoEnum.values());
        try {
            this.a.setListaTipoCombustivel(this.a.getTipoCombustivelTO());
            this.a.setListaTipoVeiculo(this.a.getTipoVeiculoTO());
            this.a.setListaEspecieVeiculo(this.a.getEspecieVeiculoTO());
            this.a.setListaCorDenatran(this.a.getCorDenatranTO());
        }
        catch (DSGEUtilException ex) {
            this.a.showErrors((DSGEBaseException)ex);
        }
    }

    public void actionPerformed(ActionEvent e) {
    }
}

