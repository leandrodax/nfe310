/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 */
package br.gov.sp.fazenda.dsge.view.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEViewException
extends DSGEBaseException {
    public DSGEViewException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEViewException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

