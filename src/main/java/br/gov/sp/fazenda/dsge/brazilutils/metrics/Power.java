/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Power
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

public class Power {
    public double hpToWatt(double energy) {
        return energy * 745.7;
    }

    public double wattToHp(double energy) {
        return energy / 745.7;
    }
}

