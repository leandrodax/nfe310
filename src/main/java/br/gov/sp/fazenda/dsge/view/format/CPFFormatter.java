/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.format.CPFFormatter
 */
package br.gov.sp.fazenda.dsge.view.format;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CPFFormatter
extends MaskFormatter {
    public CPFFormatter() throws ParseException {
        super("###.###.###-##");
    }

    @Override
    public Object stringToValue(String value) throws ParseException {
        String newValue = null;
        if (value != null) {
            newValue = value.replaceAll("[_-[.][ ]]", "");
        }
        return newValue;
    }
}

