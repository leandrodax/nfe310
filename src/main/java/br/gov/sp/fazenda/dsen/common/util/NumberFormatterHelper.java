/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.NumberFormatterHelper
 *  br.gov.sp.fazenda.dsen.common.util.NumberFormatterHelper$1
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.util;

import br.gov.sp.fazenda.dsen.common.util.NumberFormatterHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javax.swing.text.NumberFormatter;

/*
 * Exception performing whole class analysis ignored.
 */
public class NumberFormatterHelper {
    public NumberFormatterHelper() {
    }

    public static NumberFormatter getFormatter(int maxFractionDigits, int minFractionDigits, int maxIntegerDigits) {
        NumberFormat numberFormat = NumberFormatterHelper.getNumberFormat((int)maxFractionDigits, (int)minFractionDigits, (int)maxIntegerDigits);
         formatter = new /* Unavailable Anonymous Inner Class!! */;
        formatter.setAllowsInvalid(false);
        formatter.setOverwriteMode(false);
        formatter.setValueClass(BigDecimal.class);
        return formatter;
    }

    public static NumberFormatter getFormatter1302() {
        return NumberFormatterHelper.getFormatter((int)2, (int)2, (int)13);
    }

    public static NumberFormatter getFormatter1204() {
        return NumberFormatterHelper.getFormatter((int)4, (int)4, (int)12);
    }

    public static NumberFormatter getFormatter0804() {
        return NumberFormatterHelper.getFormatter((int)4, (int)4, (int)8);
    }

    public static NumberFormatter getFormatter0302() {
        return NumberFormatterHelper.getFormatter((int)2, (int)2, (int)3);
    }

    public static NumberFormatter getFormatter1104() {
        return NumberFormatterHelper.getFormatter((int)4, (int)4, (int)11);
    }

    public static NumberFormatter getFormatter0803() {
        return NumberFormatterHelper.getFormatter((int)3, (int)3, (int)8);
    }

    public static NumberFormatter getFormatter1203() {
        return NumberFormatterHelper.getFormatter((int)3, (int)3, (int)12);
    }

    public static NumberFormat getNumberFormat(int maxFractionDigits, int minFractionDigits, int maxIntegerDigits) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(maxFractionDigits);
        numberFormat.setMinimumFractionDigits(minFractionDigits);
        numberFormat.setMaximumIntegerDigits(maxIntegerDigits);
        numberFormat.setRoundingMode(RoundingMode.FLOOR);
        return numberFormat;
    }

    public static String formatStringAsNumber(String numberStr, int maxIntegerDigits, int maxFractionDigits) {
        if (StringHelper.isBlankOrNull((Object)numberStr)) {
            return null;
        }
        return NumberFormatterHelper.getNumberFormat((int)maxFractionDigits, (int)maxFractionDigits, (int)maxIntegerDigits).format(new BigDecimal(numberStr));
    }
}

