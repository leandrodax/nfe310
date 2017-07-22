/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.view.format.PhoneFormatter
 */
package br.gov.sp.fazenda.dsge.view.format;

import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class PhoneFormatter
extends MaskFormatter {
    public PhoneFormatter() throws ParseException {
        super("(##)#########");
    }

    @Override
    public char getPlaceholderCharacter() {
        return '_';
    }

    @Override
    public Object stringToValue(String value) throws ParseException {
        String newValue = null;
        if (value != null) {
            newValue = value.replaceAll("[)(_]", "");
        }
        return newValue;
    }
}

