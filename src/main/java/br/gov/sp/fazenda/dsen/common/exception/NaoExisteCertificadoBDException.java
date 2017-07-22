/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.exception.NaoExisteCertificadoBDException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.common.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class NaoExisteCertificadoBDException
extends DSGEBaseException {
    private static final long a = 8005044477217640543L;

    public NaoExisteCertificadoBDException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public NaoExisteCertificadoBDException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

