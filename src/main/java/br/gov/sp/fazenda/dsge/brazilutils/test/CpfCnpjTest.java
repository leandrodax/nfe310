/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cnpj
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cpf
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.CpfCnpj
 *  br.gov.sp.fazenda.dsge.brazilutils.test.CpfCnpjTest
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cnpj;
import br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cpf;
import br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.CpfCnpj;
import junit.framework.TestCase;

/*
 * Exception performing whole class analysis ignored.
 */
public class CpfCnpjTest
extends TestCase {
    public CpfCnpjTest() {
    }

    public void test() throws Exception {
        CpfCnpj c = new CpfCnpj();
        c.setCpfCnpj("29520590000165");
        CpfCnpjTest.assertTrue((boolean)c.isValid());
        CpfCnpjTest.assertTrue((boolean)c.isCnpj());
        CpfCnpjTest.assertFalse((boolean)c.isCpf());
        c.setCpfCnpj("12345678911");
        CpfCnpjTest.assertFalse((boolean)c.isValid());
        CpfCnpjTest.assertFalse((boolean)c.isCnpj());
        CpfCnpjTest.assertTrue((boolean)c.isCpf());
        CpfCnpjTest.assertTrue((boolean)c.toString().equals("123.456.789-11"));
        c.setCpfCnpj("123456789");
        CpfCnpjTest.assertFalse((boolean)c.isValid());
        CpfCnpjTest.assertFalse((boolean)c.isCnpj());
        CpfCnpjTest.assertFalse((boolean)c.isCpf());
    }

    public void testCpf() throws Exception {
        Cpf cpf = new Cpf("217.505.168-45");
        CpfCnpjTest.assertTrue((boolean)cpf.isValid());
        CpfCnpjTest.assertTrue((boolean)Cpf.isValid((String)"217.505.168-45"));
    }

    public void testCnpj() throws Exception {
        Cnpj cnpj = new Cnpj("29.520.590/0001-65");
        CpfCnpjTest.assertTrue((boolean)cnpj.isValid());
        CpfCnpjTest.assertTrue((boolean)Cnpj.isValid((String)"29520590000165"));
    }
}

