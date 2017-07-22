/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep
 *  br.gov.sp.fazenda.dsge.brazilutils.test.CepUfTest
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.UF
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep;
import br.gov.sp.fazenda.dsge.brazilutils.uf.UF;
import junit.framework.TestCase;

public class CepUfTest
extends TestCase {
    public void testUfValidaCep() throws Exception {
        Cep cepSP1 = new Cep("01.234.567");
        Cep cepSP2 = new Cep("11.234-567");
        Cep cepRJ = new Cep("21.021-380");
        Cep cepRS = new Cep("91.021-380");
        UF rj = UF.RJ;
        UF sp = UF.SP;
        UF rs = UF.RS;
    }

    public void testAmDfGoRange() throws Exception {
        Cep cepAM1 = new Cep("69.295-625");
        Cep cepAM2 = new Cep("69.355-625");
        Cep cepAM3 = new Cep("69.455-625");
        Cep cepAM4 = new Cep("69.955-625");
        Cep cepDF1 = new Cep("70.321.375");
        Cep cepDF2 = new Cep("73.621.375");
        Cep cepGO1 = new Cep("72.821.375");
        Cep cepGO2 = new Cep("73.721.375");
    }
}

