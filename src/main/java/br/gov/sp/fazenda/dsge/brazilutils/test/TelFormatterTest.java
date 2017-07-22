/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.TelFormatter
 *  br.gov.sp.fazenda.dsge.brazilutils.test.TelFormatterTest
 *  junit.framework.TestCase
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.telefone.TelFormatter;
import junit.framework.TestCase;

public class TelFormatterTest
extends TestCase {
    public void testTelFormatter() throws Exception {
        TelFormatter t = new TelFormatter("+###(#)####-####");
    }
}

