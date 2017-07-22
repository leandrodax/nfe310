/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException
 */
package br.gov.sp.fazenda.dsge.ws.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGETimeoutException
extends DSGEBaseException {
    private static final long a = 7596495464203254593L;

    public DSGETimeoutException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGETimeoutException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

