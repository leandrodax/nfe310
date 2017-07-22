/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

import java.math.BigDecimal;

public class Unit {
    private String a;
    private BigDecimal a;

    public Unit(String name, BigDecimal valueOnBaseUnit) {
        this.a = name;
        this.a = valueOnBaseUnit;
    }

    public String getName() {
        return this.a;
    }

    public void setName(String name) {
        this.a = name;
    }

    public BigDecimal getValueOnBaseUnit() {
        return this.a;
    }

    public void setValueOnBaseUnit(BigDecimal valueOnBaseUnit) {
        this.a = valueOnBaseUnit;
    }

    public String toString() {
        return this.getValueOnBaseUnit().toString();
    }
}

