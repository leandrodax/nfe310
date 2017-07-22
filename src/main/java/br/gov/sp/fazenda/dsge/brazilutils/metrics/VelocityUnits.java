/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.VelocityUnits
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

import br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit;
import java.math.BigDecimal;

public interface VelocityUnits {
    public static final Unit KILOMETER_PER_HOUR = new Unit("km/h", new BigDecimal(String.valueOf(1)));
    public static final Unit METER_PER_SECOND = new Unit("m/s", new BigDecimal(String.valueOf(0.27777)));
    public static final Unit MILES_PER_HOUR = new Unit("mi/h", new BigDecimal(String.valueOf(1.609)));
    public static final Unit NAUTIC_MILES_PER_HOUR = new Unit("nmi/h", new BigDecimal(String.valueOf(1.852)));
    public static final Unit BASE = KILOMETER_PER_HOUR;
}

