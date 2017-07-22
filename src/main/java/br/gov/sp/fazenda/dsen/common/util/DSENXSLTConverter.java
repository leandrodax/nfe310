/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.exception.DSENCommonException
 *  br.gov.sp.fazenda.dsen.common.util.DSENXSLTConverter
 */
package br.gov.sp.fazenda.dsen.common.util;

import br.gov.sp.fazenda.dsen.common.exception.DSENCommonException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class DSENXSLTConverter
implements ErrorListener {
    public synchronized String transformXmlFile(Reader xmlContent, InputStream xsltContent) throws DSENCommonException {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            StreamSource xmlSource = new StreamSource(xmlContent);
            StreamSource xslSource = new StreamSource(xsltContent);
            StreamResult result = new StreamResult(out);
            Transformer transformer = TransformerFactory.newInstance().newTransformer(xslSource);
            transformer.setErrorListener((ErrorListener)this);
            transformer.transform(xmlSource, result);
            transformer.getErrorListener();
            return out.toString("UTF-8");
        }
        catch (TransformerConfigurationException e) {
            e.printStackTrace();
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        catch (TransformerException e) {
            e.printStackTrace();
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new DSENCommonException((Throwable)e, e.getMessage());
        }
        catch (Throwable e) {
            e.printStackTrace();
            throw new DSENCommonException(e, e.getMessage());
        }
    }

    @Override
    public void error(TransformerException exception) throws TransformerException {
        System.out.println(exception);
    }

    @Override
    public void fatalError(TransformerException exception) throws TransformerException {
        System.out.println(exception);
    }

    @Override
    public void warning(TransformerException exception) throws TransformerException {
        System.out.println(exception);
    }
}

