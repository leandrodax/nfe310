/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException
 */
package br.gov.sp.fazenda.dsge.ws.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEConnectionClientException
extends DSGEBaseException {
    private static final long a = 8244350295958473859L;

    public DSGEConnectionClientException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEConnectionClientException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

