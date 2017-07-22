/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroNotaFiscalConverter
 *  br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA
 *  br.gov.sp.fazenda.dsen.model.business.importacao.Util
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 */
package br.gov.sp.fazenda.dsen.model.business.expimp;

import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA;
import br.gov.sp.fazenda.dsen.model.business.importacao.Util;
import br.gov.sp.fazenda.dsge.common.to.Campo;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter;
import br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class DSENRegistroNotaFiscalConverter
extends DSGERegistroConverter {
    private static Map<String, String> a = new HashMap();

    protected Registro createBaseRegistro() {
        Registro base = new Registro();
        base.setTagXml("NFe");
        Campo c = new Campo();
        c.setNome("xmlns");
        c.setValue("http://www.portalfiscal.inf.br/nfe");
        c.setXmlType("attrib");
        c.setXmlOnly(true);
        base.addCampo(c);
        Campo c2 = new Campo();
        c2.setNome("qtde");
        c2.setValueExp("#A");
        base.addCampo(c2);
        base.setTipoRegistro("NOTAFISCAL");
        return base;
    }

    protected InputStream getArquivoLayout(String version) {
        return this.getClass().getResourceAsStream(MessageFormat.format(DSENConstants.XML_NOTA_FISCAL_LAYOUT, StringHelper.getDigits((String)version)));
    }

    protected String getSeparator() {
        return DSENConstants.SEPARADOR_ARQ_TXT;
    }

    protected String getTipoRegistroVersao() {
        return "A";
    }

    protected Properties loadMessageProperties() throws DSGEConverterException {
        Properties properties = new Properties();
        try {
            properties.load(Util.class.getResourceAsStream("importacaoMensagem.properties"));
        }
        catch (IOException e) {
            throw new DSGEConverterException((Throwable)e, e.getMessage());
        }
        return properties;
    }

    protected Map<String, String> getRegistroTOMap() {
        return a;
    }

    public static void main(String[] args) {
        try {
            DSENRegistroNotaFiscalConverter converter = new DSENRegistroNotaFiscalConverter();
            Scanner scanner = new Scanner(converter.getClass().getResourceAsStream("NotaProducao.txt"));
            Registro baseC = converter.getRegistroFromTXT(scanner);
            ArrayList errors = new ArrayList();
            baseC.getAllErrors(errors);
            for (String s : errors) {
                System.out.println(s);
            }
            System.out.println("------------------------INICIO-------------------111111111-------------------------------------------------");
            String txt = baseC.toString();
            System.out.println(txt);
            System.out.println("-------------------------------------------111111111-------------------------------------------------");
            String xml = baseC.toXML();
            System.out.println(xml);
            System.out.println("-------------------------FIM------------------111111111-------------------------------------------------");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xml.getBytes());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        a.put("E", ClienteTO.class.getCanonicalName());
        a.put("A", RegistroA.class.getCanonicalName());
    }
}

