/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.cean.Cean
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.util.CeanHelper
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.brazilutils.cean.Cean;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;

public class CeanHelper {
    Cean a = new Cean();

    public boolean validaDigitoCean(String cean) throws DSGEValidationException {
        try {
            return this.a.validaDigitoCean(cean);
        }
        catch (ValidationException e) {
            throw new DSGEValidationException((Throwable)e, e.getMessage());
        }
    }
}

