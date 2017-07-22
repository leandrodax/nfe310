/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.validator.DSENValidator
 */
package br.gov.sp.fazenda.dsge.common.validator;

import java.util.Map;

public interface DSENValidator<T> {
    public boolean isValid(Object var1, Map<String, String> var2);
}

