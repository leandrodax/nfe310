/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.format.EstrangeiroFormatter
 */
package br.gov.sp.fazenda.dsge.view.format;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class EstrangeiroFormatter
extends MaskFormatter {
    private static final long a = 3917567630001731403L;

    public EstrangeiroFormatter() throws ParseException {
        super("A");
    }

    @Override
    public Object stringToValue(String value) throws ParseException {
        String newValue = null;
        if (value != null) {
            newValue = value.replaceAll("[_/-[ ][.]]", "");
        }
        return newValue;
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        String valueString = null;
        valueString = value != null ? value.toString() : super.valueToString(value);
        return valueString;
    }
}

