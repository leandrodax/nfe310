/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.business.expimp.produto.RegistroM
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.model.business.expimp.produto;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;

public class RegistroM
extends BaseTO
implements ExpImpInterface {
    private static final long a = 8324658811139264632L;
    private String a = new String("0");
    private String b = new String("0");
    private String c;

    public String getMIPI() {
        return this.b;
    }

    public void setMIPI(String mipi) {
        this.b = mipi;
    }

    public String getQtdeN() {
        return this.a;
    }

    public void setQtdeN(String qtdeN) {
        this.a = qtdeN;
    }

    public String getNomeRegistro() {
        return "M";
    }

    public String getVersao() {
        return this.c;
    }

    public void setVersao(String versao) {
        this.c = versao;
    }
}

