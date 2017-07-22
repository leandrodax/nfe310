/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.test.RealToWordsTest
 *  br.gov.sp.fazenda.dsge.brazilutils.text.RealToWords
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.text.RealToWords;
import java.math.BigDecimal;
import junit.framework.TestCase;

/*
 * Exception performing whole class analysis ignored.
 */
public class RealToWordsTest
extends TestCase {
    private final transient RealToWords a = new RealToWords();

    public RealToWordsTest() {
    }

    public void testConversionWithNegativeValue() {
        RealToWordsTest.assertEquals((String)"um real", (String)this.a.toWords(new BigDecimal(-1).setScale(2, 6)));
    }

    public void testConversionWithLowerValue() {
        RealToWordsTest.assertEquals((String)"trinta reais", (String)this.a.toWords(new BigDecimal(30).setScale(2, 6)));
    }

    public void testConversionWithHugeValue() {
        RealToWordsTest.assertEquals((String)"oitocentos e noventa e seis milh\u00c3\u00b5es quinhentos e cinq\u00c3\u00bcenta e oito mil quatrocentos e setenta e cinco reais", (String)this.a.toWords(new BigDecimal(896558475).setScale(2, 6)));
    }

    public void testConversionWithHugeValue2() {
        RealToWordsTest.assertEquals((String)"um bilh\u00c3\u00a3o um milh\u00c3\u00a3o de reais e novecentos e noventa e um mil\u00c3\u00a9simos de real", (String)this.a.toWords(new BigDecimal(1.001000000991E9).setScale(3, 6)));
    }

    public void testConversionWithDecimalValue() {
        RealToWordsTest.assertEquals((String)"um mil\u00c3\u00a9simo de real", (String)this.a.toWords(new BigDecimal(0.001).setScale(3, 6)));
    }

    public void testConversionWithDecimalValue2() {
        RealToWordsTest.assertEquals((String)"doze mil seiscentos e oitenta e sete reais e treze mil\u00c3\u00a9simos de real", (String)this.a.toWords(new BigDecimal(12687.013).setScale(3, 6)));
    }

    public void testConversionWithDecimalValue3() {
        RealToWordsTest.assertEquals((String)"um centavo", (String)this.a.toWords(new BigDecimal(0.01).setScale(2, 6)));
    }

    public void testConversionWithDecimalValue4() {
        RealToWordsTest.assertEquals((String)"cem reais e quatro centavos", (String)this.a.toWords(new BigDecimal(100.04).setScale(2, 6)));
    }

    public void testConversionWithDecimalValue5() {
        RealToWordsTest.assertEquals((String)"cento e vinte reais e quatro centavos", (String)this.a.toWords(new BigDecimal(120.04).setScale(2, 6)));
    }

    public void testConversionWithDecimalValue6() {
        RealToWordsTest.assertEquals((String)"um mil quarenta e oito reais e noventa e nove centavos", (String)this.a.toWords(new BigDecimal(1048.99).setScale(2, 6)));
    }

    public void testConversionWithDecimalValue7() {
        RealToWordsTest.assertEquals((String)"cem mil cento e um reais e oitenta e sete centavos", (String)this.a.toWords(new BigDecimal(100101.87).setScale(2, 6)));
    }

    public void testPositiveSuffix() {
        this.a.setPositiveSuffix(" positivo");
        RealToWordsTest.assertEquals((String)"cem milh\u00c3\u00b5es de reais positivo", (String)this.a.toWords(new BigDecimal(100000000).setScale(3, 6)));
    }

    public void testNegativePrefixAndSuffix() {
        this.a.setNegativePrefix("(");
        this.a.setNegativeSuffix(")");
        RealToWordsTest.assertEquals((String)"(dois bilh\u00c3\u00b5es de reais)", (String)this.a.toWords(new BigDecimal(-2000000000).setScale(2, 6)));
    }

    public void testIfObjectIsNull() {
        RealToWordsTest.assertNotNull((String)"O objeto est\u00c3\u00a1 com valor null!!!", (Object)this.a);
    }
}

