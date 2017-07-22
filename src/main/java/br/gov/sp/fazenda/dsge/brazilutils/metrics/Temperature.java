/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Temperature
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

public class Temperature {
    public static final double ABSOLUTE_ZERO = -273.15;
    public static final double OXYGEN_BOILING = -182.954;
    public static final double WATER_TRIPLE_POINT = 0.01;
    public static final double STANNUM_SOLIDIFICATION = 231.928;
    public static final double ZINC_SOLIDIFICATION = 419.527;
    public static final double ARGENTUM_SOLIDIFICATION = 961.78;
    public static final double AURUM_SOLIDIFICATION = 1064.18;

    public double CelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double KelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double CelsiusToFarenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public double KelvinToFarenheit(double kelvin) {
        return this.CelsiusToFarenheit(this.KelvinToCelsius(kelvin));
    }

    public double FarenheitToCelsius(double farenheit) {
        return (farenheit - 32.0) * 5.0 / 9.0;
    }

    public double FarenheitToKelvin(double farenheit) {
        return this.CelsiusToKelvin(this.FarenheitToCelsius(farenheit));
    }

    public double RankineToFarenheit(double rankine) {
        return rankine - 459.67;
    }

    public double FarenheitToRankine(double farenheit) {
        return farenheit + 459.67;
    }

    public double ReamurToCelsius(double reamur) {
        return reamur * 5.0 / 4.0;
    }

    public double CelsiusToReamur(double celsius) {
        return celsius * 4.0 / 5.0;
    }
}

