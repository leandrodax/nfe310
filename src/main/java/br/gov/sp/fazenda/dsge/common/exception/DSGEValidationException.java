/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 */
package br.gov.sp.fazenda.dsge.common.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEValidationException
extends DSGEBaseException {
    private static final long a = 1152376340557105109L;

    public DSGEValidationException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEValidationException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

