/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  org.apache.xmlbeans.XmlCalendar
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.xmlbeans.XmlCalendar;

/*
 * Exception performing whole class analysis ignored.
 */
public class XMLUtil {
    private static final String a = "#NOME_TAG#";
    private static final String b = "<!\\[CDATA\\[(.*)\\]\\]";
    private static final String c = "(<\\s*[/]{0,1}\\s*#NOME_TAG#(\\s+[^<]*|\\s*)>|<\\s*#NOME_TAG#(\\s+[^<]*|\\s*)/{0,1}\\s*>)";
    private static final String d = "<[^><]*/\\s*>";

    public XMLUtil() {
    }

    public static List<String> getTagConteudo(String xml, String nomeTag, boolean incluirTag, boolean decodeSpecialChars) {
        if (xml == null || nomeTag == null) {
            return null;
        }
        ArrayList<String> tags = new ArrayList<String>();
        String regex = "(<\\s*[/]{0,1}\\s*#NOME_TAG#(\\s+[^<]*|\\s*)>|<\\s*#NOME_TAG#(\\s+[^<]*|\\s*)/{0,1}\\s*>)".replace("#NOME_TAG#", nomeTag);
        Matcher matcher = Pattern.compile(regex).matcher(xml);
        int start = 0;
        int end = 0;
        int diff = incluirTag ? 1 : 0;
        String group = null;
        while (matcher.find(start)) {
            start = incluirTag ? matcher.start() : matcher.end();
            group = matcher.group();
            if (Pattern.matches("<[^><]*/\\s*>", group)) {
                if (!incluirTag) continue;
                tags.add(XMLUtil.a((String)group, (boolean)decodeSpecialChars));
                start += diff;
                continue;
            }
            matcher.find(start + diff);
            end = incluirTag ? matcher.end() : matcher.start();
            tags.add(XMLUtil.a((String)xml.substring(start, end), (boolean)decodeSpecialChars));
            start = matcher.end();
        }
        return tags.isEmpty() ? null : tags;
    }

    private static String a(String str, boolean decodeSpecialChars) {
        if (str == null) {
            return null;
        }
        Matcher cDataMatcher = Pattern.compile("<!\\[CDATA\\[(.*)\\]\\]").matcher(str);
        if (cDataMatcher.find()) {
            String conteudoCDATA = cDataMatcher.group(1);
            if (!decodeSpecialChars) {
                return StringHelper.encodeSpecialXMLChars((String)conteudoCDATA);
            }
            return conteudoCDATA;
        }
        return decodeSpecialChars ? StringHelper.decodeSpecialXMLChars((String)str) : str;
    }

    public static List<String> getTagConteudo(String xml, String nomeTag, boolean incluirTag) {
        return XMLUtil.getTagConteudo((String)xml, (String)nomeTag, (boolean)incluirTag, (boolean)false);
    }

    public static String getFirstTagConteudo(String xml, String nomeTag, boolean incluirTag, boolean decodeSpecialChars) {
        List list = XMLUtil.getTagConteudo((String)xml, (String)nomeTag, (boolean)incluirTag, (boolean)decodeSpecialChars);
        if (list != null && !list.isEmpty()) {
            return (String)list.get(0);
        }
        return null;
    }

    public static String alterarTagConteudo(String xml, String tagName, String newValue) {
        Matcher matcher = Pattern.compile("(<\\s*" + tagName + "(?:\\s[^<]*)?)(?:/\\s*)>").matcher(xml);
        if (matcher.find()) {
            return xml.substring(0, matcher.start()) + matcher.group(1) + ">" + newValue + "</" + tagName + ">" + xml.substring(matcher.end(), xml.length());
        }
        matcher = Pattern.compile("(<\\s*" + tagName + "(?:\\s[^<]*)?>)(?:.*)(?:</" + tagName + "\\s*>)").matcher(xml);
        if (matcher.find()) {
            return xml.substring(0, matcher.start()) + matcher.group(1) + newValue + "</" + tagName + ">" + xml.substring(matcher.end(), xml.length());
        }
        return xml;
    }

    public static String alterarAtributoTag(String xml, String tagName, String attribName, String newValue) {
        Matcher matcher = Pattern.compile("<\\s*" + tagName + "(?:[^<]*)?(\\s" + attribName + "\\s*=\\s*\"[^<]*\")(?:\\s[^<]*)?(?:/?\\s*)>").matcher(xml);
        if (matcher.find()) {
            int beginAttrib = matcher.group(0).indexOf(matcher.group(1));
            int endAttrib = matcher.group(0).lastIndexOf("\"");
            String newAttrib = matcher.group(0).substring(0, beginAttrib) + " " + attribName + "=\"" + newValue + "\"" + matcher.group(0).substring(endAttrib + 1, matcher.group(0).length());
            return xml.substring(0, matcher.start()) + newAttrib + xml.substring(matcher.end(), xml.length());
        }
        return xml;
    }

    public static String getAtributoTag(String xml, String tagName, String attribName) {
        Matcher matcher = Pattern.compile("<\\s*" + tagName + "(?:[^<]*)?(\\s" + attribName + "\\s*=\\s*\"[^<]*\")(?:\\s[^<]*)?(?:/?\\s*)>").matcher(xml);
        if (matcher.find()) {
            int beginAttrib = matcher.group(0).indexOf("\"") + 1;
            int endAttrib = matcher.group(0).lastIndexOf("\"");
            String teste = xml.substring(beginAttrib, endAttrib);
            return xml.substring(beginAttrib, endAttrib);
        }
        return xml;
    }

    public static Date getXmlDate(String xmlDate) {
        return new XmlCalendar(xmlDate).getTime();
    }

    public static Calendar getXmlCalendar(String xmlDate) {
        return new XmlCalendar(xmlDate);
    }

    public static void main(String[] args) {
        System.out.println(XMLUtil.a((String)"<![CDATA[<<<<<<<< >>>>>>>>>>>> <,<<<\"!@#$%\u00a8&*()_]]>      ", (boolean)false));
        System.out.println(XMLUtil.a((String)"    <![CDATA[<<<<<<<< >>>>>>>>>>>> <,<<<\"!@#$%\u00a8&*()_]]>", (boolean)false));
        System.out.println(XMLUtil.a((String)"<![CDATA[]]>", (boolean)false));
        System.out.println(XMLUtil.a((String)"<![CDATA[<<<<<<<< >>>>>>>>>>>> <,<<<\"!@#$%\u00a8&*()_]]>", (boolean)false));
        System.out.println(XMLUtil.a((String)"<![CDATA[<<<<<<<< >>>>>>>>>>>> <,<<<\"!@#$%\u00a8&*()_]]>", (boolean)true));
        System.out.println(XMLUtil.a((String)"dfasf32452345", (boolean)false));
    }
}

