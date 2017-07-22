/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.model.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSENConverterException
extends DSGEBaseException {
    private static final long a = -1293158356818215217L;

    public DSENConverterException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSENConverterException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

