/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.exception.NaoExisteCertificadoWindowsException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.common.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class NaoExisteCertificadoWindowsException
extends DSGEBaseException {
    private static final long a = -3176711354599246351L;

    public NaoExisteCertificadoWindowsException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public NaoExisteCertificadoWindowsException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

