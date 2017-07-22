/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.test._RealToWordsTest
 *  br.gov.sp.fazenda.dsge.brazilutils.text.RealToWords
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.text.RealToWords;
import java.io.PrintStream;
import java.math.BigDecimal;

public class _RealToWordsTest {
    public static void main(String[] args) {
        RealToWords converter = new RealToWords();
        System.out.println(converter.toWords(new BigDecimal(-1).setScale(2, 6)));
        System.out.println(converter.toWords(new BigDecimal(896558475).setScale(2, 6)));
        System.out.println(converter.toWords(new BigDecimal(0.01).setScale(2, 6)));
        System.out.println(converter.toWords(new BigDecimal(30).setScale(2, 6)));
        System.out.println(converter.toWords(new BigDecimal(0.001).setScale(3, 6)));
        System.out.println(converter.toWords(new BigDecimal(-100.04).setScale(2, 6)));
        System.out.println(converter.toWords(new BigDecimal(120.04).setScale(2, 6)));
        System.out.println(converter.toWords(new BigDecimal(1048.99).setScale(2, 6)));
        System.out.println(converter.toWords("100101.87"));
        System.out.println(converter.toWords("-100101.87"));
        System.out.println(converter.toWords("1001000000.991"));
        System.out.println(converter.toWords(new BigDecimal(12687.013).setScale(3, 6)));
        converter.setNegativePrefix("(");
        converter.setNegativeSuffix(")");
        converter.setPositivePrefix("");
        converter.setPositiveSuffix(" positivo ");
        System.out.println(converter.toWords("100000000.00"));
        System.out.println(converter.toWords("-2000000000.00"));
    }
}

