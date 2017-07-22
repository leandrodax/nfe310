/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.validator.LengthValidator
 */
package br.gov.sp.fazenda.dsge.common.validator;

import java.util.Map;

public class LengthValidator {
    public static boolean isValid(Object value, Map<String, String> parametersMap) {
        int _min;
        String maxObj = parametersMap.get("max");
        String minObj = parametersMap.get("min");
        int _max = maxObj != null ? Integer.parseInt(maxObj.toString()) : Integer.MAX_VALUE;
        int n = _min = minObj != null ? Integer.parseInt(minObj.toString()) : Integer.MIN_VALUE;
        if (value == null || value.equals("")) {
            return true;
        }
        if (!(value instanceof String)) {
            return false;
        }
        String string = (String)value;
        int length = string.length();
        return length >= _min && length <= _max;
    }
}

