/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.test.TestRomanNumbers
 *  br.gov.sp.fazenda.dsge.brazilutils.utilities.conversion.RomanNumbers
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.utilities.conversion.RomanNumbers;
import java.io.PrintStream;
import junit.framework.TestCase;

/*
 * Exception performing whole class analysis ignored.
 */
public class TestRomanNumbers
extends TestCase {
    public TestRomanNumbers() {
    }

    public void testIntToRoman() {
        RomanNumbers numbers = RomanNumbers.getInstance();
        String converted = numbers.IntToRoman(250);
        TestRomanNumbers.assertEquals((String)converted, (String)"CCL");
        converted = numbers.IntToRoman(353);
        TestRomanNumbers.assertEquals((String)converted, (String)"CCCLIII");
        converted = numbers.IntToRoman(421);
        TestRomanNumbers.assertEquals((String)converted, (String)"CDXXI");
        converted = numbers.IntToRoman(2925);
        TestRomanNumbers.assertEquals((String)converted, (String)"MMCMXXV");
        converted = numbers.IntToRoman(3999);
        TestRomanNumbers.assertEquals((String)converted, (String)"MMMCMXCIX");
    }

    public void testValidate() {
        RomanNumbers numbers = RomanNumbers.getInstance();
        TestRomanNumbers.assertTrue((boolean)numbers.validate("CCL"));
        TestRomanNumbers.assertTrue((boolean)numbers.validate("MMMCMXCIX"));
        TestRomanNumbers.assertFalse((boolean)numbers.validate("ccl"));
        TestRomanNumbers.assertFalse((boolean)numbers.validate("XMM"));
        TestRomanNumbers.assertFalse((boolean)numbers.validate("ACC"));
    }

    public void testRomanToInt() {
        RomanNumbers numbers = RomanNumbers.getInstance();
        TestRomanNumbers.assertEquals((int)numbers.RomanToInt("MMMCMXCIX"), (int)3999);
        TestRomanNumbers.assertEquals((int)numbers.RomanToInt("MMCMXXV"), (int)2925);
        TestRomanNumbers.assertEquals((int)numbers.RomanToInt("CDXXI"), (int)421);
        TestRomanNumbers.assertEquals((int)numbers.RomanToInt("XCIX"), (int)99);
    }

    public void testBothWay() {
        RomanNumbers numbers = RomanNumbers.getInstance();
        for (int i = 0; i < 4000; ++i) {
            TestRomanNumbers.assertEquals((int)numbers.RomanToInt(numbers.IntToRoman(i)), (int)i);
            System.out.println("" + i + " - " + numbers.IntToRoman(i));
        }
    }
}

