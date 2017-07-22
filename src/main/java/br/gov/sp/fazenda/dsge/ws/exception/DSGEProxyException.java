/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException
 */
package br.gov.sp.fazenda.dsge.ws.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEProxyException
extends DSGEBaseException {
    private static final long a = -5810174151269905385L;

    public DSGEProxyException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEProxyException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

