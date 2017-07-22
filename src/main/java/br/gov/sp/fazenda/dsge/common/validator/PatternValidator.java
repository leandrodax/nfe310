/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.validator.PatternValidator
 */
package br.gov.sp.fazenda.dsge.common.validator;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternValidator {
    private static Pattern a;

    public static boolean isValid(Object value, Map<String, String> paraMap) {
        a = Pattern.compile(paraMap.get("regex"));
        if (value == null || value.equals("")) {
            return true;
        }
        if (!(value instanceof String)) {
            return false;
        }
        String string = (String)value;
        Matcher m = a.matcher(string);
        return m.matches();
    }
}

