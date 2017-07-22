/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException
 *  br.gov.sp.fazenda.dsge.certif.exception.DSGECnpjInvalidoException
 */
package br.gov.sp.fazenda.dsge.certif.exception;

import br.gov.sp.fazenda.dsge.certif.exception.DSGECertificadoException;

public class DSGECnpjInvalidoException
extends DSGECertificadoException {
    private static final long a = 4199784344286435467L;

    public DSGECnpjInvalidoException(Exception ex) {
        super(ex);
    }

    public DSGECnpjInvalidoException(String message) {
        super(message);
    }
}

