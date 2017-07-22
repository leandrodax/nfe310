/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 */
package br.gov.sp.fazenda.dsge.model.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEDAOException
extends DSGEBaseException {
    private static final long a = -2259519568652458713L;

    public DSGEDAOException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEDAOException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

