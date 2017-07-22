/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.id.Placa
 *  br.gov.sp.fazenda.dsge.brazilutils.test.TestPlaca
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.id.Placa;
import junit.framework.TestCase;

/*
 * Exception performing whole class analysis ignored.
 */
public class TestPlaca
extends TestCase {
    public TestPlaca() {
    }

    public void testPlaca() throws Exception {
        Placa placa = new Placa("ABC-1234");
        TestPlaca.assertTrue((boolean)placa.toString().equals("ABC-1234"));
        placa.setPlaca("LLL4321");
        TestPlaca.assertTrue((boolean)placa.toString().equals("LLL-4321"));
        placa.setLetters("mmm");
        placa.setNumbers("5555");
        TestPlaca.assertTrue((boolean)placa.toString().equals("MMM-5555"));
    }

    public void testPlacaUf() throws Exception {
        Placa placa = new Placa("ABC-1234");
        placa.setPlaca("LLL-2143");
        placa.setPlaca("ZZZ-2211");
        placa.setPlaca("BEZ-1234");
        placa.setPlaca("BFA-1234");
    }
}

