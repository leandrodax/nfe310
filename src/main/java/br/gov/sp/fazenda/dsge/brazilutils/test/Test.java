/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.test.Test
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;
import java.io.PrintStream;
import junit.framework.TestCase;

public class Test
extends TestCase {
    public void test() throws Exception {
        Logradouro l = new Logradouro();
        l.setLogradouro("Av. Teste 123");
        System.out.println(l.getNome());
        System.out.println(l.isTipoValid());
    }
}

