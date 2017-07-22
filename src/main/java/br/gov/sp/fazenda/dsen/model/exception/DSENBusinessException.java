/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.model.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSENBusinessException
extends DSGEBaseException {
    private static final long a = -2803555197814537075L;

    public DSENBusinessException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSENBusinessException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

