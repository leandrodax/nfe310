/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.FornecimentoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.math.BigDecimal;

public class FornecimentoTO
extends BaseTO
implements Comparable<FornecimentoTO> {
    private static final long a = 909874494996847851L;
    private String a;
    private BigDecimal a;
    private String b;

    public String getDia() {
        return this.a;
    }

    public void setDia(String dia) {
        this.a = dia;
    }

    public BigDecimal getQtde() {
        return this.a;
    }

    public void setQtde(BigDecimal qtde) {
        this.a = qtde;
    }

    public String getNItem() {
        return this.b;
    }

    public void setNItem(String item) {
        this.b = item;
    }

    @Override
    public int compareTo(FornecimentoTO object) {
        if (StringHelper.isBlankOrNull((Object)this.a) && StringHelper.isBlankOrNull((Object)object.getDia())) {
            return 0;
        }
        if (!StringHelper.isBlankOrNull((Object)this.a) && StringHelper.isBlankOrNull((Object)object.getDia())) {
            return 1;
        }
        if (StringHelper.isBlankOrNull((Object)this.a) && !StringHelper.isBlankOrNull((Object)object.getDia())) {
            return -1;
        }
        return Integer.parseInt(this.a) - Integer.parseInt(object.getDia());
    }
}

