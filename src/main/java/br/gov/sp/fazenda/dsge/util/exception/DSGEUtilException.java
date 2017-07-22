/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsge.util.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEUtilException
extends DSGEBaseException {
    private static final long a = -7961421996089636329L;

    public DSGEUtilException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEUtilException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

