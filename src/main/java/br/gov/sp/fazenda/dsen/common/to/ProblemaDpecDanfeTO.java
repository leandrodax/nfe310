/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ProblemaDpecDanfeTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class ProblemaDpecDanfeTO
extends BaseTO {
    String a;
    String b;

    public String getChaveAcesso() {
        return this.a;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.a = chaveAcesso;
    }

    public String getErro() {
        return this.b;
    }

    public void setErro(String erro) {
        this.b = erro;
    }
}

