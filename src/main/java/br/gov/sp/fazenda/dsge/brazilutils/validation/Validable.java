/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.validation;

import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

public interface Validable {
    public boolean isValid();

    public void validate() throws ValidationException;
}

