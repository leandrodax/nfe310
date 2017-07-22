/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO$Status
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator
 *  br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator$DSENLSResourceResolver
 *  br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator$DSENSchema
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.util;

import br.gov.sp.fazenda.dsen.common.enumeration.DSENSchemaTypeEnum;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENSchemaValidator;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.ValidatorHandler;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ContentHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DSENSchemaValidator
extends DefaultHandler {
    private static DSENSchemaValidator a = new DSENSchemaValidator();
    private SchemaFactory a;
    private XMLReader a;
    private Map<String, DSENSchema> a;
    private List<ImportacaoErroTO> a;

    private DSENSchemaValidator() {
        try {
            this.a = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            this.a.setResourceResolver((LSResourceResolver)new DSENLSResourceResolver(this));
            this.a = XMLReaderFactory.createXMLReader();
            this.a = new HashMap();
            this.a = new ArrayList();
        }
        catch (SAXException e) {
            e.printStackTrace();
        }
    }

    public static synchronized DSENSchemaValidator getInstance() {
        return a;
    }

    public List<ImportacaoErroTO> validate(DSENSchemaTypeEnum schemaType, String versao, String xmlContent) {
        try {
            this.a.clear();
            DSENSchema schema = this.a(schemaType, versao);
            this.a.setContentHandler(schema.a());
            this.a.parse(new InputSource(new StringReader(xmlContent)));
        }
        catch (MissingResourceException e) {
            ImportacaoErroTO erro = new ImportacaoErroTO("Vers\u00e3o", MessageFormat.format(DSENMessageConstants.MSG_NOTA_FISCAL_VERSAO_INVALIDA, versao), ImportacaoErroTO.Status.ERROR);
            this.a.add(erro);
        }
        catch (SAXException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return this.a.isEmpty() ? null : this.a;
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        try {
            String errorMessage = e.getMessage();
            if (errorMessage.indexOf(58) > 0) {
                String errorMessageKey = errorMessage.substring(0, errorMessage.indexOf(58));
                Object[] arguments = this.a(errorMessage, errorMessageKey);
                String dsenMessagePattern = ResourceBundle.getBundle("schema_mensagens").getString(errorMessageKey);
                String dsenMessage = MessageFormat.format(dsenMessagePattern, arguments);
                this.a.add(new ImportacaoErroTO(e.getPublicId(), "Linha " + e.getLineNumber() + ": " + dsenMessage, ImportacaoErroTO.Status.ERROR));
            } else {
                this.a.add(new ImportacaoErroTO(e.getPublicId(), "Linha " + e.getLineNumber() + ": " + errorMessage, ImportacaoErroTO.Status.ERROR));
            }
        }
        catch (ParseException e1) {
            e1.printStackTrace();
        }
    }

    private Object[] a(String errorMessage, String errorMessageKey) throws ParseException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.sun.org.apache.xerces.internal.impl.msg.XMLSchemaMessages");
        if (!StringHelper.isBlankOrNull((Object)errorMessageKey) && resourceBundle.containsKey(errorMessageKey)) {
            String errorMessagePattern = resourceBundle.getString(errorMessageKey);
            MessageFormat messageFormat = new MessageFormat(errorMessagePattern);
            Object[] arguments = messageFormat.parse(errorMessage);
            return arguments;
        }
        return new Object[0];
    }

    private DSENSchema a(DSENSchemaTypeEnum schemaType, String versao) throws SAXException, MissingResourceException {
        if (!this.a.containsKey(schemaType.name() + versao)) {
            String schemaPath = ResourceBundle.getBundle("schema_versoes").getString(schemaType.name() + '.' + versao);
            InputStream in = this.getClass().getClassLoader().getResourceAsStream(schemaPath);
            Schema schema = this.a.newSchema(new StreamSource(in));
            ValidatorHandler validatorHandler = schema.newValidatorHandler();
            validatorHandler.setContentHandler((ContentHandler)this);
            validatorHandler.setErrorHandler((ErrorHandler)this);
            this.a.put(schemaType.name() + versao, new DSENSchema(this, schema, validatorHandler));
        }
        return (DSENSchema)this.a.get(schemaType.name() + versao);
    }
}

