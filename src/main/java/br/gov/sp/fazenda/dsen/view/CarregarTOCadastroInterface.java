/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.CarregarTOCadastroInterface
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.view;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import javax.swing.JDialog;

public interface CarregarTOCadastroInterface<T extends BaseTO> {
    public JDialog getDialogGUI();

    public void carregar(T var1);
}

