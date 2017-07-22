/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.NumberHelper
 *  br.gov.sp.fazenda.dsge.common.util.NumberHelper$1
 *  br.gov.sp.fazenda.dsge.common.util.NumberHelper$PreDefinedNumberFormatEnum
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.util.NumberHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberHelper {
    NumberFormat a;

    public NumberHelper(Locale locale, boolean groupingUsed, boolean currencySymbol) {
        this.a = currencySymbol ? NumberFormat.getCurrencyInstance(locale) : NumberFormat.getInstance(locale);
        this.a.setGroupingUsed(groupingUsed);
    }

    public NumberHelper(PreDefinedNumberFormatEnum type) {
        switch (1.a[type.ordinal()]) {
            case 1: {
                this.a = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
                this.a.setGroupingUsed(true);
                break;
            }
            case 2: {
                this.a = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
                this.a.setGroupingUsed(false);
                break;
            }
            case 3: {
                this.a = NumberFormat.getInstance(new Locale("pt", "BR"));
                this.a.setGroupingUsed(true);
                break;
            }
            case 4: {
                this.a = NumberFormat.getInstance(new Locale("pt", "BR"));
                this.a.setGroupingUsed(false);
                break;
            }
            case 5: {
                this.a = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
                this.a.setGroupingUsed(true);
                break;
            }
            case 6: {
                this.a = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
                this.a.setGroupingUsed(false);
                break;
            }
            case 7: {
                this.a = NumberFormat.getInstance(new Locale("en", "US"));
                this.a.setGroupingUsed(true);
                break;
            }
            case 8: {
                this.a = NumberFormat.getInstance(new Locale("en", "US"));
                this.a.setGroupingUsed(false);
            }
        }
    }

    public /* varargs */ BigDecimal somar(BigDecimal base, String ... valorString) {
        if (StringHelper.isBlankOrNull((Object)valorString)) {
            return base;
        }
        for (int i = 0; i < valorString.length; ++i) {
            if (valorString[i] == null) continue;
            base = base.add(this.getBigDecimal(valorString[i]));
        }
        return base;
    }

    public /* varargs */ BigDecimal subtrair(BigDecimal base, String ... valorString) {
        if (StringHelper.isBlankOrNull((Object)valorString)) {
            return base;
        }
        for (int i = 0; i < valorString.length; ++i) {
            if (valorString[i] == null) continue;
            base = base.subtract(this.getBigDecimal(valorString[i]));
        }
        return base;
    }

    public String getPercentual(String str) {
        if (StringHelper.isBlankOrNull((Object)str)) {
            return null;
        }
        BigDecimal valor = new BigDecimal(str);
        BigDecimal resultado = valor.divide(new BigDecimal(100));
        return resultado.toString();
    }

    public String multiplicar(String baseStr, String multiplicandoStr) {
        return this.multiplicar(baseStr, multiplicandoStr, RoundingMode.DOWN);
    }

    public String multiplicar(String baseStr, String multiplicandoStr, RoundingMode roundingMode) {
        if (StringHelper.isBlankOrNull((Object)baseStr) || StringHelper.isBlankOrNull((Object)multiplicandoStr)) {
            return null;
        }
        BigDecimal base = this.getBigDecimal(baseStr);
        BigDecimal multiplicando = this.getBigDecimal(multiplicandoStr);
        BigDecimal resultado = base.multiply(multiplicando).setScale(2, roundingMode);
        return this.a.format(resultado.doubleValue());
    }

    public BigDecimal getBigDecimal(String valor) {
        if (StringHelper.isBlankOrNull((Object)valor)) {
            return null;
        }
        try {
            if (this.a instanceof DecimalFormat) {
                NumberFormat clone = (NumberFormat)this.a.clone();
                ((DecimalFormat)clone).setParseBigDecimal(true);
                return (BigDecimal)clone.parse(valor);
            }
            return new BigDecimal(this.a.parse(valor).toString());
        }
        catch (ParseException e) {
            return null;
        }
    }

    public String toString(Number valor, int minIntegerDigits, int maxIntDigits, int minDecDigits, int maxDecDigits, RoundingMode roundingMode) {
        if (valor == null) {
            return null;
        }
        NumberFormat clone = (NumberFormat)this.a.clone();
        clone.setRoundingMode(roundingMode);
        if (minDecDigits >= 0) {
            clone.setMinimumFractionDigits(minDecDigits);
        }
        if (maxDecDigits >= 0) {
            clone.setMaximumFractionDigits(maxDecDigits);
        }
        if (minIntegerDigits >= 0) {
            clone.setMinimumIntegerDigits(minIntegerDigits);
        }
        if (maxIntDigits >= 0) {
            clone.setMaximumIntegerDigits(maxIntDigits);
        }
        return clone.format(valor);
    }

    public static void main(String[] args) {
        NumberHelper helper = new NumberHelper(PreDefinedNumberFormatEnum.EN_US_GROUPING_CURRENCY_SYMBOL);
        BigDecimal big = helper.getBigDecimal("$133,333,333.33");
        NumberHelper helper2 = new NumberHelper(PreDefinedNumberFormatEnum.EN_US_GROUPING_CURRENCY_SYMBOL);
        String bigS = helper2.toString((Number)big, -1, -1, 8, 8, RoundingMode.DOWN);
        System.out.println("bigS=" + bigS);
        System.out.println(helper2.getBigDecimal(bigS));
    }
}

