/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Mass
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

public class Mass {
    public double kilogramToPound(double heigth) {
        return heigth * 2.2046;
    }

    public double poundToKilogram(double heigth) {
        return heigth / 2.2046;
    }

    public double gramToPound(double heigth) {
        return heigth / 453.6;
    }

    public double poundToGram(double heigth) {
        return heigth * 453.6;
    }

    public double kilogramToLug(double heigth) {
        return heigth * 0.06852;
    }

    public double lugToKilogram(double heigth) {
        return heigth / 0.06852;
    }

    public double poundToLug(double heigth) {
        return heigth * 0.03108;
    }

    public double lugToPound(double heigth) {
        return heigth / 0.03108;
    }
}

