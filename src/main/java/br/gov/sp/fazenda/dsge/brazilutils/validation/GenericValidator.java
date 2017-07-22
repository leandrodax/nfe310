/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.GenericValidator
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.validation;

import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

public abstract class GenericValidator
implements Validable {
    public void validate() throws ValidationException {
        if (!this.isValid()) {
            throw new ValidationException();
        }
    }

    public abstract void setValidateObject(Object var1);
}

