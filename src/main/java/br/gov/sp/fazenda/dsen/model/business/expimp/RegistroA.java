/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.model.business.expimp;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;

public class RegistroA
extends BaseTO
implements ExpImpInterface {
    private static final long a = 3644974238690401188L;
    private String a;

    public String getNomeRegistro() {
        return "A";
    }

    public String getVersao() {
        return this.a;
    }

    public void setVersao(String versao) {
        this.a = versao;
    }
}

