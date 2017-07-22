/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.br.BrazilianMetrics
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics.br;

public class BrazilianMetrics {
    public double hectaresToAcres(double hectares) {
        double result = hectares * 2.47;
        return result;
    }

    public double cattleArrobaToPounds(double cattleArroba) {
        double result = cattleArroba * 66.0;
        return result;
    }
}

