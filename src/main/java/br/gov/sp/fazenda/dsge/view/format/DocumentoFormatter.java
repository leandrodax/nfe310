/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.view.format.DocumentoFormatter
 */
package br.gov.sp.fazenda.dsge.view.format;

import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class DocumentoFormatter
extends MaskFormatter {
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
        if (value != null) {
            if (value.toString().length() == 14) {
                valueString = StringHelper.cnpjFormat((String)value.toString());
            } else if (value.toString().length() == 11) {
                valueString = StringHelper.cpfFormat((String)value.toString());
            }
        } else {
            valueString = super.valueToString(value);
        }
        return valueString;
    }
}

