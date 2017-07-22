/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEControllerException
 */
package br.gov.sp.fazenda.dsge.view.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEControllerException
extends DSGEBaseException {
    private static final long a = -3172328286283471607L;

    public DSGEControllerException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEControllerException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

