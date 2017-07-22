/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.format.MesAnoFormatter
 *  br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants
 *  br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier
 */
package br.gov.sp.fazenda.dsen.view.format;

import br.gov.sp.fazenda.dsge.common.util.DSGEMessageConstants;
import br.gov.sp.fazenda.dsge.view.format.FormattedTextFieldInputVerifier;
import java.text.ParseException;
import javax.swing.InputVerifier;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class MesAnoFormatter
extends MaskFormatter {
    private static final long a = 1;

    public MesAnoFormatter() throws ParseException {
        super("##/####");
    }

    @Override
    public void install(JFormattedTextField ftf) {
        super.install(ftf);
        ftf.setInputVerifier((InputVerifier)new FormattedTextFieldInputVerifier((JFormattedTextField.AbstractFormatter)this));
    }

    @Override
    public Object stringToValue(String value) throws ParseException {
        if (value != null && !value.replace("/", "").trim().equals("") && !value.matches("(0[1-9]|1[0-2])([/][0-9][0-9][0-9][0-9])")) {
            throw new ParseException(DSGEMessageConstants.DATE_MONTH_YEAR_INVALID_MSG, 0);
        }
        return value;
    }
}

