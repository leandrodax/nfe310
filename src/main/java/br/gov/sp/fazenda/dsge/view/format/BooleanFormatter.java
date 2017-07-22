/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DSGELabelConstants
 *  br.gov.sp.fazenda.dsge.view.format.BooleanFormatter
 */
package br.gov.sp.fazenda.dsge.view.format;

import br.gov.sp.fazenda.dsge.common.util.DSGELabelConstants;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class BooleanFormatter
extends MaskFormatter {
    @Override
    public Object stringToValue(String value) throws ParseException {
        if (value == null) {
            return null;
        }
        if (DSGELabelConstants.SIM.equals(value)) {
            return Boolean.TRUE;
        }
        return Boolean.parseBoolean(value);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value == null) {
            return "";
        }
        if (Boolean.TRUE.toString().equals(value.toString())) {
            return DSGELabelConstants.SIM;
        }
        return DSGELabelConstants.NAO;
    }
}

