/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.validator.ValidValuesValidator
 */
package br.gov.sp.fazenda.dsge.common.validator;

import java.util.Map;

public class ValidValuesValidator {
    public static boolean isValid(Object value, Map<String, String> paraMap) {
        String[] values;
        if (value == null || value.equals("")) {
            return true;
        }
        for (String string : values = paraMap.get("values").split(",")) {
            if (!string.equals(value)) continue;
            return true;
        }
        return false;
    }
}

