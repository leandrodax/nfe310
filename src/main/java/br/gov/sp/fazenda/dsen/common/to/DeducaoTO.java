/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.DeducaoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.math.BigDecimal;

public class DeducaoTO
extends BaseTO
implements Comparable<DeducaoTO> {
    private static final long a = 909874494996847851L;
    private String a;
    private BigDecimal a;
    private String b;

    public BigDecimal getVDed() {
        return this.a;
    }

    public void setVDed(BigDecimal ded) {
        this.a = ded;
    }

    public String getXDed() {
        return this.a;
    }

    public void setXDed(String ded) {
        this.a = ded;
    }

    public String getNItem() {
        return this.b;
    }

    public void setNItem(String item) {
        this.b = item;
    }

    @Override
    public int compareTo(DeducaoTO object) {
        if (this.a == null && object.getVDed() == null) {
            if (this.a == null && object.getXDed() == null) {
                return 0;
            }
            if (object.getXDed() == null) {
                return 1;
            }
            if (this.a == null) {
                return -1;
            }
            return this.a.compareTo(object.getXDed());
        }
        if (object.getVDed() == null) {
            return 1;
        }
        if (this.a == null) {
            return -1;
        }
        return this.a.compareTo(object.getVDed());
    }
}

