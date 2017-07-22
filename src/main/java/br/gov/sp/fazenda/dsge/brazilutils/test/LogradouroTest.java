/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.test.LogradouroTest
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;
import junit.framework.TestCase;

/*
 * Exception performing whole class analysis ignored.
 */
public class LogradouroTest
extends TestCase {
    public LogradouroTest() {
    }

    public void test1() throws Exception {
        Logradouro l = new Logradouro();
        l.setLogradouro("Avenida Teste");
        LogradouroTest.assertTrue((boolean)l.isValid());
    }

    public void test2() throws Exception {
        Logradouro l = new Logradouro();
        l.setLogradouro("Nonono Teste");
        LogradouroTest.assertTrue((boolean)(!l.isValid()));
    }

    public void test3() throws Exception {
        Logradouro l = new Logradouro();
        l.setLogradouro("Rua");
        LogradouroTest.assertTrue((boolean)(!l.isValid()));
    }

    public void test4() throws Exception {
        Logradouro l = new Logradouro();
        l.setLogradouro("Avenida Teste");
    }

    public void test5() throws Exception {
        Logradouro l = new Logradouro();
        l.setLogradouro("Aven Teste");
        l.setTipoNormalized(true);
    }
}

