/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.help.exception.DSENHelpException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.help.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSENHelpException
extends DSGEBaseException {
    private static final long a = 4817940497090123770L;

    public DSENHelpException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSENHelpException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

