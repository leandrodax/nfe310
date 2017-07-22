/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationItf
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 */
package br.gov.sp.fazenda.dsen.model.business.validation;

import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;

public interface NotaFiscalValidationItf {
    public NotaFiscalTO validarDocumentoNotaFiscalXML(NotaFiscalTO var1, NFeDocument var2) throws DSENBusinessException;

    public NotaFiscalTO executarValidacaoXMLBeans(NotaFiscalTO var1, NFeDocument var2) throws DSENBusinessException;

    public NotaFiscalTO validarNotaFiscal(NotaFiscalTO var1, NFeDocument var2) throws DSENBusinessException;

    public boolean validarMaximoBytes(String var1);
}

