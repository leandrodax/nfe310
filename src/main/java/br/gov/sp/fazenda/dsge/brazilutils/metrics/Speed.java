/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Speed
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

public class Speed {
    public double machToKilometersPerHour(double speed) {
        return speed * 1226.0;
    }

    public double kilometerToMachPerHour(double speed) {
        return speed / 1226.0;
    }

    public double milesToKilometerPerHour(int miles) {
        return (double)miles * 1.609;
    }

    public double kilometerToMilesPerHour(int kilometers) {
        return (double)kilometers / 1.609;
    }
}

