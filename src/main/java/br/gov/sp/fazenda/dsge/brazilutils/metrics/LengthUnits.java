/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.LengthUnits
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

import br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit;
import java.math.BigDecimal;

public interface LengthUnits {
    public static final Unit METER = new Unit("m", new BigDecimal(String.valueOf(1)));
    public static final Unit BRACES = new Unit("br", new BigDecimal(String.valueOf(0.546806649)));
    public static final Unit CADEIAS = new Unit("ca", new BigDecimal(String.valueOf(0.0497096954)));
    public static final Unit YARD = new Unit("y", new BigDecimal(String.valueOf(1.093613298)));
    public static final Unit MILES = new Unit("mi", new BigDecimal(String.valueOf(6.21371E-4)));
    public static final Unit NAUTIC_MILES = new Unit("nmi", new BigDecimal(String.valueOf(5.39956803E-4)));
    public static final Unit FEET = new Unit("f", new BigDecimal(String.valueOf(3.280839895)));
    public static final Unit INCH = new Unit("in", new BigDecimal(String.valueOf(39.37007874)));
    public static final Unit KILOMETER = new Unit("km", new BigDecimal(String.valueOf(0.001)));
}

