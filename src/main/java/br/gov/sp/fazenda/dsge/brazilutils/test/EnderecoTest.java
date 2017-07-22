/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.DefaultNormalizer
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Endereco
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.test.EnderecoTest
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.UF
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.DefaultNormalizer;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.Endereco;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;
import br.gov.sp.fazenda.dsge.brazilutils.uf.UF;
import junit.framework.TestCase;

/*
 * Exception performing whole class analysis ignored.
 */
public class EnderecoTest
extends TestCase {
    public EnderecoTest() {
    }

    public void test1() throws Exception {
        Endereco e = new Endereco();
        e.setLogradouro("Avenida Rio Branco");
        e.setNumero("156");
        e.setComplemento("sala 1010");
        e.setBairro("Centro");
        e.setCidade("Rio de Janeiro");
        e.setUf("RJ");
        e.setCep("21.021-380");
        EnderecoTest.assertTrue((boolean)e.isValid());
        e.setComplemento(null);
        EnderecoTest.assertTrue((boolean)e.isValid());
        e.setLogradouro("");
        EnderecoTest.assertFalse((boolean)e.isValid());
        e.setLogradouro("Aven Rio Branco");
        EnderecoTest.assertFalse((boolean)e.isValid());
        EnderecoTest.assertTrue((boolean)e.isValid());
    }

    public void test2() throws Exception {
        Endereco e = new Endereco();
        e.setLogradouro("Aven Rio Branco");
        e.setNumero("156");
        e.setComplemento("sala 1010");
        e.setBairro("Centro");
        e.setCidade("Rio de Janeiro");
        e.setUf("RJ");
        e.setCep("21.021-380");
        EnderecoTest.assertTrue((boolean)e.getTipoLogradouro().equals("Aven"));
        e.setNormalizer((EnderecoNormalizer)new DefaultNormalizer());
        EnderecoTest.assertTrue((boolean)e.getTipoLogradouro().equals("AVENIDA"));
        EnderecoTest.assertTrue((boolean)e.getLogradouro().equals((Object)"AVENIDA RIO BRANCO"));
        EnderecoTest.assertTrue((boolean)e.getNumero().equals("156"));
        EnderecoTest.assertTrue((boolean)e.getComplemento().equals("SALA 1010"));
        EnderecoTest.assertTrue((boolean)e.getBairro().equals("CENTRO"));
        EnderecoTest.assertTrue((boolean)e.getCidade().equals("RIO DE JANEIRO"));
        EnderecoTest.assertTrue((boolean)e.getUf().equals((Object)UF.RJ));
        EnderecoTest.assertTrue((boolean)e.getCep().equals((Object)"21.021-380"));
    }
}

