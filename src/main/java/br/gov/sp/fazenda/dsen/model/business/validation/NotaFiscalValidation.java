/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidation
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationBusinessV2_0
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationDocumentV3_0
 *  br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationItf
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 */
package br.gov.sp.fazenda.dsen.model.business.validation;

import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationBusinessV2_0;
import br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationDocumentV3_0;
import br.gov.sp.fazenda.dsen.model.business.validation.NotaFiscalValidationItf;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;

public class NotaFiscalValidation
implements NotaFiscalValidationItf {
    NotaFiscalValidationDocumentV3_0 a;
    NotaFiscalValidationBusinessV2_0 a = new NotaFiscalValidationBusinessV2_0();

    public static NotaFiscalValidationItf getInstance() throws DSENBusinessException {
        return new NotaFiscalValidation();
    }

    private NotaFiscalValidation() throws DSENBusinessException {
    }

    public NotaFiscalTO validarDocumentoNotaFiscalXML(NotaFiscalTO notaFiscalTO, NFeDocument nfeDoc) throws DSENBusinessException {
        return this.a.validarDocumentoNotaFiscalXML(notaFiscalTO, nfeDoc);
    }

    public NotaFiscalTO executarValidacaoXMLBeans(NotaFiscalTO notaFiscalTO, NFeDocument nfeDoc) throws DSENBusinessException {
        return this.a.executarValidacaoXMLBeans(notaFiscalTO, nfeDoc);
    }

    public NotaFiscalTO validarNotaFiscal(NotaFiscalTO notaFiscalTO, NFeDocument nfeDoc) throws DSENBusinessException {
        return this.a.a(notaFiscalTO, nfeDoc);
    }

    public boolean validarMaximoBytes(String docXmlString) {
        return this.a.a(docXmlString);
    }
}

