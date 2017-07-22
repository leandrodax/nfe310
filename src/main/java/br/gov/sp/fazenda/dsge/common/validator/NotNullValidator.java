/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.validator.NotNullValidator
 */
package br.gov.sp.fazenda.dsge.common.validator;

import java.util.Map;

public class NotNullValidator {
    public static boolean isValid(Object value, Map<String, String> parametersMap) {
        if (value instanceof String) {
            return value != null && !value.equals("");
        }
        return value != null;
    }
}

