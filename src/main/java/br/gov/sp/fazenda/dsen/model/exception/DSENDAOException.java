/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.model.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSENDAOException
extends DSGEBaseException {
    private static final long a = -2259519568652458713L;

    public DSENDAOException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSENDAOException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

