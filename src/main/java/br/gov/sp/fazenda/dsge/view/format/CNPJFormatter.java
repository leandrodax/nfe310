/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.format.CNPJFormatter
 */
package br.gov.sp.fazenda.dsge.view.format;

import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class CNPJFormatter
extends MaskFormatter {
    public CNPJFormatter() throws ParseException {
        super("##.###.###/####-##");
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
        valueString = value != null ? StringHelper.cnpjFormat((String)value.toString()) : super.valueToString(value);
        return valueString;
    }
}

