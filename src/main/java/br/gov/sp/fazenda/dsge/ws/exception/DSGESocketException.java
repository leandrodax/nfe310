/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException
 */
package br.gov.sp.fazenda.dsge.ws.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGESocketException
extends DSGEBaseException {
    private static final long a = -7590350809270955740L;

    public DSGESocketException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGESocketException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

