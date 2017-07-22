/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroEmitenteConverter
 *  br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA
 *  br.gov.sp.fazenda.dsen.model.business.importacao.Util
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGERegistroConverter
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 */
package br.gov.sp.fazenda.dsen.model.business.expimp;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class DSENRegistroEmitenteConverter
extends DSGERegistroConverter {
    private static Map<String, String> a = new HashMap();

    protected Registro createBaseRegistro() {
        Registro base = new Registro();
        base.setTagXml("infEmitente");
        Campo c = new Campo();
        c.setNome("qtde");
        c.setValueExp("#A");
        base.addCampo(c);
        base.setTipoRegistro("EMITENTE");
        return base;
    }

    protected InputStream getArquivoLayout(String version) {
        return this.getClass().getResourceAsStream(MessageFormat.format(DSENConstants.XML_EMITENTE_LAYOUT, StringHelper.getDigits((String)version)));
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
            DSENRegistroEmitenteConverter converter = new DSENRegistroEmitenteConverter();
            Scanner scanner = new Scanner(converter.getClass().getResourceAsStream("EMITENTE.txt"));
            Registro baseC = converter.getRegistroFromTXT(scanner);
            System.out.println("--------------------------------------------getRegistro(Scanner)------------------------------------------------");
            System.out.println((Object)baseC);
            System.out.println(baseC.getChild(0).toXML());
            System.out.println(baseC.getChild(1).toXML());
            HashMap<String, String> registroTOMap = new HashMap<String, String>();
            registroTOMap.put("C", EmitenteTO.class.getCanonicalName());
            registroTOMap.put("A", RegistroA.class.getCanonicalName());
            List toList = converter.getTOFromRegistro(baseC);
            System.out.println("\n------------------------------getTOFromRegistro(baseC,registroTOMap) -> getRegistro(List<BaseTO>)------------------------------------------------");
            baseC = converter.getRegistroFromTOs(toList);
            System.out.println((Object)baseC);
            System.out.println(baseC.getChild(0).toXML());
            System.out.println(baseC.getChild(1).toXML());
            ByteArrayInputStream is = new ByteArrayInputStream(baseC.toXML().getBytes());
            baseC = converter.getRegistroFromXML((InputStream)is, "sistema");
            System.out.println("\n------------------------------getRegistroFromXML------------------------------------------------");
            System.out.println((Object)baseC);
            System.out.println(baseC.getChild(0).toXML());
            System.out.println(baseC.getChild(1).toXML());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static {
        a.put("C", EmitenteTO.class.getCanonicalName());
        a.put("A", RegistroA.class.getCanonicalName());
    }
}

