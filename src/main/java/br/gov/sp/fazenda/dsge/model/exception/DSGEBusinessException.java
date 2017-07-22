/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEBusinessException
 */
package br.gov.sp.fazenda.dsge.model.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEBusinessException
extends DSGEBaseException {
    private static final long a = -2803555197814537075L;

    public DSGEBusinessException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEBusinessException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

