/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 */
package br.gov.sp.fazenda.dsge.report.exception;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSGEReportException
extends DSGEBaseException {
    public DSGEReportException(Throwable source, String mensagem) {
        super(source, mensagem);
    }

    public DSGEReportException(DSGEBaseException base, String mensagem) {
        super((Throwable)base, mensagem);
    }
}

