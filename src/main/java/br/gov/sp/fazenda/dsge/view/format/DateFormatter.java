/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.view.format.DateFormatter
 *  br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier
 */
package br.gov.sp.fazenda.dsge.view.format;

import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class DateFormatter
extends MaskFormatter {
    public DateFormatter() throws ParseException {
        super("##/##/####");
    }

    @Override
    public void install(JFormattedTextField ftf) {
        super.install(ftf);
        ftf.setInputVerifier((InputVerifier)new FormattedTextFieldInputVerifier((JFormattedTextField.AbstractFormatter)this));
    }

    @Override
    public Object stringToValue(String value) throws ParseException {
        if (value == null || value.replaceAll("/", "").trim().length() == 0) {
            return null;
        }
        Date d = DateHelper.getDate((String)value);
        if (d == null) {
            throw new ParseException(DSGEMessageConstants.DATE_INVALID_MSG, 0);
        }
        return d;
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        String valueString = null;
        if (value != null) {
            if (value instanceof Calendar) {
                valueString = DateHelper.formataData((Date)((Calendar)value).getTime());
            } else if (value instanceof Date) {
                valueString = DateHelper.formataData((Date)((Date)value));
            }
        } else {
            valueString = super.valueToString(value);
        }
        return valueString;
    }
}

