/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.TemperatureUnits
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

import br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit;
import java.math.BigDecimal;

public interface TemperatureUnits {
    public static final Unit CELSIUS = new Unit("C", new BigDecimal(String.valueOf(0)));
    public static final Unit FAHRENHEIT = new Unit("F", new BigDecimal(String.valueOf(32)));
    public static final Unit RANKINE = new Unit("Ra", new BigDecimal(String.valueOf(491.67)));
    public static final Unit REAUMUR = new Unit("R\u00e9", new BigDecimal(String.valueOf(0)));
    public static final Unit KELVIN = new Unit("K", new BigDecimal(String.valueOf(273.15)));
    public static final Unit BASE = CELSIUS;
}

