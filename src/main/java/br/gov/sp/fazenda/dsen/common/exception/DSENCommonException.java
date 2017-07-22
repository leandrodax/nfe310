/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.common.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSENCommonException
extends DSGEBaseException {
    private static final long a = 4846658032141393758L;

    public DSENCommonException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSENCommonException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

