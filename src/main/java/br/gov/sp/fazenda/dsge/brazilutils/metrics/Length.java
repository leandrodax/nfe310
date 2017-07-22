/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Length
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

public class Length {
    public double milesToKilometer(double distance) {
        return distance * 1.609;
    }

    public double kilometerToMiles(double distance) {
        return distance / 1.609;
    }

    public double centimeterToInch(double extension) {
        return extension / 2.54;
    }

    public double inchToCentimeter(double extension) {
        return extension * 2.54;
    }

    public double inchToMeter(double extension) {
        return extension / 39.37;
    }

    public double meterToInch(double extension) {
        return extension * 39.37;
    }

    public double feetToInch(double extension) {
        return extension * 12.0;
    }

    public double inchToFeet(double extension) {
        return extension / 12.0;
    }

    public double feetToMeter(double extension) {
        return extension * 3.28;
    }

    public double meterToFeet(double extension) {
        return extension / 3.28;
    }
}

