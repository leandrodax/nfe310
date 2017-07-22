/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 */
package br.gov.sp.fazenda.dsge.model.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEConverterException
extends DSGEBaseException {
    private static final long a = 3374882827698283091L;

    public DSGEConverterException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEConverterException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

