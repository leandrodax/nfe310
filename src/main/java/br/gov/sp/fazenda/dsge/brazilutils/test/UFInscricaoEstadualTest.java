/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.test.UFInscricaoEstadualTest
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.UF
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.ChainValidator
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualAC
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualRJ
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualTO
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.uf.UF;
import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.ChainValidator;
import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;
import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualAC;
import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualRJ;
import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualTO;
import junit.framework.TestCase;

/*
 * Exception performing whole class analysis ignored.
 */
public class UFInscricaoEstadualTest
extends TestCase {
    public UFInscricaoEstadualTest() {
    }

    public void testUfName() throws Exception {
        UF uf = null;
        uf = UF.valueOf((String)"AC");
        UFInscricaoEstadualTest.assertTrue((boolean)uf.getUfName().equals("Acre"));
        UFInscricaoEstadualTest.assertTrue((boolean)uf.toString().equals("AC"));
    }

    public void testUfInscricaoEstadual() throws Exception {
        UF uf = null;
        uf = UF.valueOf((String)"AC");
        uf.getInscricaoEstadual().setNumber("01.004.823/001-12");
        UFInscricaoEstadualTest.assertTrue((boolean)uf.getInscricaoEstadual().isValid());
        uf = UF.SP;
        InscricaoEstadual ie = uf.getInscricaoEstadual();
        ie.setNumber("110.042.490.114");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.MG.getInscricaoEstadual();
        ie.setNumber("062.307.904/0081");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.AC.getInscricaoEstadual();
        ie.setNumber("0100482300112");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.AL.getInscricaoEstadual();
        ie.setNumber("240534514");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.AP.getInscricaoEstadual();
        ie.setNumber("030123459");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("030170011");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("030282691");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("039999998");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("030025473");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.AM.getInscricaoEstadual();
        ie.setNumber("041171616");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.BA.getInscricaoEstadual();
        ie.setNumber("66417668");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("26277501");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("62961801");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("38900488");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("12345663");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100000072");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100000180");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100000298");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100000306");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100000414");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100000415");
        UFInscricaoEstadualTest.assertFalse((boolean)ie.isValid());
        ie.setNumber("1000415");
        UFInscricaoEstadualTest.assertFalse((boolean)ie.isValid());
        ie.setNumber("1000004150");
        UFInscricaoEstadualTest.assertFalse((boolean)ie.isValid());
        ie.setNumber("082881625");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.CE.getInscricaoEstadual();
        ie.setNumber("060000015");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.DF.getInscricaoEstadual();
        ie.setNumber("0730000100109");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.ES.getInscricaoEstadual();
        ie.setNumber("080049400");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.GO.getInscricaoEstadual();
        ie.setNumber("109876547");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("103218823");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.MA.getInscricaoEstadual();
        ie.setNumber("120000385");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("121507343");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("121741524");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.MT.getInscricaoEstadual();
        ie.setNumber("0130000019");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.MS.getInscricaoEstadual();
        ie.setNumber("283295570");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("283264128");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("282934073");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.MG.getInscricaoEstadual();
        ie.setNumber("0623079040081");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("06230791");
        UFInscricaoEstadualTest.assertFalse((boolean)ie.isValid());
        ie = UF.PA.getInscricaoEstadual();
        ie.setNumber("159999995");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("151801266");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.PB.getInscricaoEstadual();
        ie.setNumber("060000015");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("160020956");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.PR.getInscricaoEstadual();
        ie.setNumber("1234567850");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.PE.getInscricaoEstadual();
        ie.setNumber("18100100000049");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("032141840");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.PI.getInscricaoEstadual();
        ie.setNumber("012345679");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.RJ.getInscricaoEstadual();
        ie.setNumber("84628328");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("02927527");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.RN.getInscricaoEstadual();
        ie.setNumber("200400401");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("2000400400");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.RO.getInscricaoEstadual();
        ie.setNumber("101625213");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("00000000475203");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("00000000625213");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.RR.getInscricaoEstadual();
        ie.setNumber("240066281");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("24006153-6");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("24007356-2");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.RS.getInscricaoEstadual();
        ie.setNumber("2243658792");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.SE.getInscricaoEstadual();
        ie.setNumber("271234563");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.SP.getInscricaoEstadual();
        ie.setNumber("110042490114");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.SU.getInscricaoEstadual();
        ie.setNumber("20.0663.01-1");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("011233206");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("019312016");
        UFInscricaoEstadualTest.assertTrue((boolean)"01.9312.01-6".equals(ie.getValue()));
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("300126018");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("601269012");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100719104");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("101220200");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("101765304");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100600310");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("100339409");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("101662505");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.TO.getInscricaoEstadual();
        ie.setNumber("29010227836");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie.setNumber("290227836");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
        ie = UF.SC.getInscricaoEstadual();
        ie.setNumber("251040852");
        UFInscricaoEstadualTest.assertTrue((boolean)ie.isValid());
    }

    public void testChainValidator() {
        InscricaoEstadualAC ac = new InscricaoEstadualAC();
        InscricaoEstadualRJ rj = new InscricaoEstadualRJ();
        InscricaoEstadualTO to = new InscricaoEstadualTO();
        rj.addValidator((ChainValidator)to);
        to.addValidator((ChainValidator)ac);
        UFInscricaoEstadualTest.assertFalse((boolean)rj.validate("062.307.904/0081"));
        UFInscricaoEstadualTest.assertTrue((boolean)rj.validate("01.004.823/001-12"));
    }
}

