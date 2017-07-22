/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.view.format.DateHourMinuteFormatter
 *  br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier
 */
package br.gov.sp.fazenda.dsge.view.format;

import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class DateHourMinuteFormatter
extends MaskFormatter {
    private static final long a = 4744189696664630472L;

    public DateHourMinuteFormatter() throws ParseException {
        super("##/##/#### ##:##");
    }

    @Override
    public void install(JFormattedTextField ftf) {
        super.install(ftf);
        ftf.setInputVerifier((InputVerifier)new FormattedTextFieldInputVerifier((JFormattedTextField.AbstractFormatter)this));
    }

    @Override
    public Object stringToValue(String value) throws ParseException {
        if (value == null || value.replaceAll("/", "").replaceAll(":", "").trim().length() == 0) {
            return null;
        }
        Date d = DateHelper.getDateTime((String)value, (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT);
        if (d == null) {
            throw new ParseException(DSGEMessageConstants.DATE_HOUR_MINUTE_INVALID_MSG, 0);
        }
        return d;
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        String valueString = null;
        if (value != null) {
            if (value instanceof Calendar) {
                valueString = DateHelper.formataDataHora((Date)((Calendar)value).getTime(), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT);
            } else if (value instanceof Date) {
                valueString = DateHelper.formataDataHora((Date)((Date)value), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT);
            }
        } else {
            valueString = super.valueToString(value);
        }
        return valueString;
    }
}

