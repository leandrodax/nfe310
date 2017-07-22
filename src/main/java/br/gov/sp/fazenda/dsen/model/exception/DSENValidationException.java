/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.exception.DSENValidationException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.model.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSENValidationException
extends DSGEBaseException {
    private static final long a = -8192341428505126831L;

    public DSENValidationException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSENValidationException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

