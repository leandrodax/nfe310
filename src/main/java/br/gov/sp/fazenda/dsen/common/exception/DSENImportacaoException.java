/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.exception.DSENImportacaoException
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 */
package br.gov.sp.fazenda.dsen.common.exception;

import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;

public class DSENImportacaoException
extends DSGEBaseException {
    private static final long a = -7398565508108437711L;
    private ImportacaoResultadoTO a;

    public DSENImportacaoException(ImportacaoResultadoTO importacaoResultadoTO) {
        super(null, null);
        this.a = importacaoResultadoTO;
    }

    public ImportacaoResultadoTO getImportacaoResultadoTO() {
        return this.a;
    }
}

