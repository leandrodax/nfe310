/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.WeightMetrics
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

import br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit;
import java.math.BigDecimal;

public interface WeightMetrics {
    public static final Unit GRAM = new Unit("g", new BigDecimal(String.valueOf(1)));
    public static final Unit DECIGRAM = new Unit("dg", new BigDecimal(String.valueOf(10)));
    public static final Unit CENTIGRAM = new Unit("cg", new BigDecimal(String.valueOf(100)));
    public static final Unit DEKAGRAM = new Unit("dg", new BigDecimal(String.valueOf(0.1)));
    public static final Unit HECTOGRAM = new Unit("hg", new BigDecimal(String.valueOf(0.01)));
    public static final Unit KILOGRAM = new Unit("kg", new BigDecimal(String.valueOf(0.001)));
    public static final Unit MEGAGRAM = new Unit("Mg", new BigDecimal(String.valueOf(1.0E-6)));
    public static final Unit MICROGRAM = new Unit("ug", new BigDecimal(String.valueOf(1000000)));
    public static final Unit MILIGRAM = new Unit("mg", new BigDecimal(String.valueOf(1000)));
    public static final Unit NANOGRAM = new Unit("ng", new BigDecimal(String.valueOf(1.0E-9)));
    public static final Unit PICOGRAM = new Unit("pg", new BigDecimal(String.valueOf(1.0E-12)));
    public static final Unit TONNE = new Unit("t", new BigDecimal(String.valueOf(1.0E-6)));
    public static final Unit METRIC_TON = new Unit("mt", new BigDecimal(String.valueOf(1.0E-6)));
    public static final Unit SHORT_TON = new Unit("st", new BigDecimal(String.valueOf(1.102E-6)));
    public static final Unit OUNCE = new Unit("oz", new BigDecimal(String.valueOf(0.035273962)));
    public static final Unit BASE = GRAM;
}

