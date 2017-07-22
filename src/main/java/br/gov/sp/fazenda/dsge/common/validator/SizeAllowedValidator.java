/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.validator.SizeAllowedValidator
 */
package br.gov.sp.fazenda.dsge.common.validator;

import java.util.List;
import java.util.Map;

public class SizeAllowedValidator {
    public static boolean isValid(Object value, Map<String, String> paraMap) {
        int _min;
        String maxObj = paraMap.get("max");
        String minObj = paraMap.get("min");
        int _max = maxObj != null ? Integer.parseInt(maxObj.toString()) : Integer.MAX_VALUE;
        int n = _min = minObj != null ? Integer.parseInt(minObj.toString()) : Integer.MIN_VALUE;
        if (value == null) {
            return false;
        }
        if (!(value instanceof List)) {
            return false;
        }
        int size = ((List)value).size();
        return size >= _min && size <= _max;
    }
}

