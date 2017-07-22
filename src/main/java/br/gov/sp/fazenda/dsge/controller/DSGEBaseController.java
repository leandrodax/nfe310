/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO
 *  br.gov.sp.fazenda.dsge.controller.ControllerItf
 *  br.gov.sp.fazenda.dsge.controller.DSGEBaseController
 *  br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable
 */
package br.gov.sp.fazenda.dsge.controller;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO;
import br.gov.sp.fazenda.dsge.controller.ControllerItf;
import br.gov.sp.fazenda.dsge.view.table.JDSGEPageableTable;
import java.util.List;

public abstract class DSGEBaseController
implements ControllerItf {
    public boolean canCloseGUI() {
        return true;
    }

    protected void verificarItensSelecionados(List listaItensMarcados, List listaItens) {
        if (listaItens != null && listaItensMarcados != null && !listaItensMarcados.isEmpty()) {
            block0 : for (BaseTO itemPesquisado : listaItens) {
                for (BaseTO itemMarcado : listaItensMarcados) {
                    if (!itemPesquisado.equals((Object)itemMarcado)) continue;
                    itemPesquisado.setMarcado(Boolean.valueOf(true));
                    continue block0;
                }
            }
        }
    }

    public OrdenacaoTO createOrdenacaoTO(JDSGEPageableTable table) {
        OrdenacaoTO ordenacaoTO = new OrdenacaoTO();
        ordenacaoTO.addSortColumn(table.getSortColumnDbFieldName(), Boolean.valueOf(table.isSortColumnASC()), table.getStartPageIndex(), table.getPageSize());
        return ordenacaoTO;
    }

    protected boolean hasErrors(List<? extends BaseTO> list) {
        if (list == null) {
            return false;
        }
        for (BaseTO to : list) {
            if (!to.hasErrors()) continue;
            return true;
        }
        return false;
    }

    protected boolean hasMessages(List<? extends BaseTO> list) {
        if (list == null) {
            return false;
        }
        for (BaseTO to : list) {
            if (!to.hasMessages()) continue;
            return true;
        }
        return false;
    }
}

