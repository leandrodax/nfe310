/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.TelMask
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.Telefone
 *  br.gov.sp.fazenda.dsge.brazilutils.test.TelefoneTest
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.telefone.TelMask;
import br.gov.sp.fazenda.dsge.brazilutils.telefone.Telefone;
import junit.framework.TestCase;

/*
 * Exception performing whole class analysis ignored.
 */
public class TelefoneTest
extends TestCase {
    public static final String outTel = "+55(21)2270-5855";

    public TelefoneTest() {
    }

    public void testSimpleTel() throws Exception {
        Telefone t = new Telefone();
        t.setTel("+55(21)2270-5855");
        TelefoneTest.assertTrue((boolean)t.getBase().equals("2270-5855"));
        TelefoneTest.assertTrue((boolean)t.getDdd().equals("(21)"));
        TelefoneTest.assertTrue((boolean)t.getDdi().equals("+55"));
        TelefoneTest.assertTrue((boolean)t.getBaseNumber().equals("22705855"));
        TelefoneTest.assertTrue((boolean)t.getDddNumber().equals("21"));
        TelefoneTest.assertTrue((boolean)t.getDdiNumber().equals("55"));
        TelefoneTest.assertTrue((boolean)t.toString().equals("+55(21)2270-5855"));
        TelefoneTest.assertTrue((boolean)t.getNumber().equals("552122705855"));
        t.setDdi("+32");
        t.setDdd("(14)");
        t.setBase("3838-4343");
        TelefoneTest.assertTrue((boolean)t.getBase().equals("3838-4343"));
        TelefoneTest.assertTrue((boolean)t.getDdd().equals("(14)"));
        TelefoneTest.assertTrue((boolean)t.getDdi().equals("+32"));
        TelefoneTest.assertTrue((boolean)t.toString().equals("+32(14)3838-4343"));
        Telefone t2 = new Telefone();
        t2.setTel("55(21)22705855");
        TelefoneTest.assertTrue((boolean)t2.getBase().equals("22705855"));
        TelefoneTest.assertTrue((boolean)t2.getDdd().equals("(21)"));
        TelefoneTest.assertTrue((boolean)t2.getDdi().equals("55"));
        Telefone t3 = new Telefone();
        t3.setTel("22705855");
        TelefoneTest.assertTrue((boolean)t3.getBase().equals("22705855"));
        TelefoneTest.assertTrue((boolean)t3.getDdd().equals(""));
        TelefoneTest.assertTrue((boolean)t3.getDdi().equals(""));
    }

    public void testExplicitMask() throws Exception {
        Telefone t = new Telefone();
        t.setTel("(21)2270-5855");
        t.setMask("####-####");
        TelefoneTest.assertTrue((boolean)t.equals((Object)"2270-5855"));
        t.setMask(TelMask.BrazilianDDD);
        TelefoneTest.assertTrue((boolean)t.equals((Object)"(21)2270-5855"));
        Telefone t2 = new Telefone();
        t2.setMask("+##(##)####-####");
        t2.setTel("552122705855");
        TelefoneTest.assertTrue((boolean)t2.getBase().equals("2270-5855"));
        TelefoneTest.assertTrue((boolean)t2.getDdd().equals("(21)"));
        TelefoneTest.assertTrue((boolean)t2.getDdi().equals("+55"));
        TelefoneTest.assertTrue((boolean)t2.toString().equals("+55(21)2270-5855"));
    }

    public void testDynamicMask() throws Exception {
        String input = "+55(21)2270-5855";
        Telefone t = new Telefone();
        t.setTel(input);
        String output = t.toString();
        TelefoneTest.assertTrue((boolean)input.equals(output));
        TelefoneTest.assertTrue((boolean)t.getMask().equals("+##(##)####-####"));
        t.setTel("2270-5855");
        TelefoneTest.assertTrue((boolean)t.getMask().equals("+##(##)####-####"));
        TelefoneTest.assertTrue((boolean)t.toString().equals("+  (  )2270-5855"));
    }

    public void testDynamicMaskSpecialChar() throws Exception {
        String input = "+ 55( 21) 270-5855";
        Telefone t = new Telefone();
        t.setTel(input);
        String output = t.toString();
        TelefoneTest.assertTrue((boolean)input.equals(output));
        TelefoneTest.assertTrue((boolean)t.getMask().equals("+*##(*##)*###-####"));
        t.setBase("2270-5855");
        TelefoneTest.assertTrue((boolean)t.getBase().toString().equals("2270-5855"));
    }
}

