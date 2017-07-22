/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.validator.ContentValidator
 */
package br.gov.sp.fazenda.dsge.common.validator;

import java.util.Map;
import java.util.regex.Pattern;

public class ContentValidator {
    private static Pattern a = Pattern.compile("[!-z]{1}[ -z]{0,}[!-z]{1}");

    public static boolean isValid(Object value, Map<String, String> paraMap) {
        if (value == null) {
            return true;
        }
        return false;
    }
}

