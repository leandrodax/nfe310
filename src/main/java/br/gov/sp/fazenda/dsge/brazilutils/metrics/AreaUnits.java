/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.AreaUnits
 *  br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit
 */
package br.gov.sp.fazenda.dsge.brazilutils.metrics;

import br.gov.sp.fazenda.dsge.brazilutils.metrics.Unit;
import java.math.BigDecimal;

public interface AreaUnits {
    public static final Unit M2 = new Unit("m\u00b2", new BigDecimal(String.valueOf(1)));
    public static final Unit ACRE = new Unit("ac", new BigDecimal(String.valueOf(2.47105E-4)));
    public static final Unit ARE = new Unit("a", new BigDecimal(String.valueOf(0.01)));
    public static final Unit ALQUEIRES_MINEIRO = new Unit("Alqueire Mineiro", new BigDecimal(String.valueOf(2.0661157E-4)));
    public static final Unit ALQUEIRES_DO_NORTE = new Unit("Alqueire_do_Norte", new BigDecimal(String.valueOf(3.67309458E-4)));
    public static final Unit ALQUEIRES_PAULISTA = new Unit("Alqueire Paulista", new BigDecimal(String.valueOf(4.1322314E-4)));
    public static final Unit SQUARE_BRACAS = new Unit("br\u00b2", new BigDecimal(String.valueOf(3.27653997E-4)));
    public static final Unit BRACAS_DE_SESMARIA = new Unit("br_de_sesmaria", new BigDecimal(String.valueOf(6.88705234E-4)));
    public static final Unit HECTARE = new Unit("ha", new BigDecimal(String.valueOf(1.0E-4)));
    public static final Unit SQUARE_YARD = new Unit("yd\u00b2", new BigDecimal(String.valueOf(1.195990046)));
    public static final Unit SQUARE_MILE = new Unit("mi\u00b2", new BigDecimal(String.valueOf(3.861021585E-6)));
    public static final Unit SQUARE_FOOT = new Unit("ft2", new BigDecimal(String.valueOf(10.763910417)));
    public static final Unit SQUARE_QUADRAS = new Unit("qq\u00b2", new BigDecimal(String.valueOf(5.73921028E-4)));
    public static final Unit SQUARE_KILOMETER = new Unit("km\u00b2", new BigDecimal(String.valueOf(1.0E-6)));
    public static final Unit BASE = M2;
}

