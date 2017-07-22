/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException
 */
package br.gov.sp.fazenda.dsge.ws.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEWebServiceException
extends DSGEBaseException {
    private static final long a = 3533662858016130407L;

    public DSGEWebServiceException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEWebServiceException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

