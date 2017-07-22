/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Volume
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

public class Volume {
    public double cubicMeterToLitre(int volume) {
        return volume * 1000;
    }

    public double litreToCubicMeter(double litres) {
        return litres / 1000.0;
    }

    public double litreToUSgallon(double litres) {
        return litres / 3.785;
    }

    public double usGallonToLitre(double gallon) {
        return gallon * 3.785;
    }
}

