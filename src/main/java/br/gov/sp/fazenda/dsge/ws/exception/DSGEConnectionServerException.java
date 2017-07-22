/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException
 */
package br.gov.sp.fazenda.dsge.ws.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEConnectionServerException
extends DSGEBaseException {
    private static final long a = 2927860718296587513L;

    public DSGEConnectionServerException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEConnectionServerException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

