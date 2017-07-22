/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsge.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/*
 * Exception performing whole class analysis ignored.
 */
public class StringHelper {
    private static final int a = 14;
    private static final int b = 8;
    private static final int c = 11;
    private static final int d = 12;
    private static final int e = 9;
    private static final int f = 9;

    public StringHelper() {
    }

    public static Integer getInteger(String strInt) {
        try {
            strInt = strInt.trim();
            return new Integer(strInt);
        }
        catch (Exception e) {
            return null;
        }
    }

    public static String getNullIfEmpty(String s) {
        if (StringHelper.isBlankOrNull((Object)s)) {
            return null;
        }
        return s.trim();
    }

    public static String formataCEP(String cep) {
        String retorno = "";
        if (cep != null) {
            int len = cep.length();
            retorno = "";
            if (len >= 5) {
                retorno = retorno + cep.substring(0, 5) + "-";
                retorno = len > 5 ? retorno + cep.substring(5) : retorno + "000";
            } else {
                retorno = cep;
            }
        }
        return retorno;
    }

    public static String removeChar(String s, char c) {
        String r = "";
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c) continue;
            r = r + s.charAt(i);
        }
        return r;
    }

    public static String cnpjFormat(String cnpj) {
        StringBuffer cnpjFormatado = new StringBuffer();
        if (!StringHelper.isBlankOrNull((Object)cnpj)) {
            String cnpjCompleto = StringHelper.completaComZerosAEsquerda((String)cnpj, (int)14);
            cnpjFormatado.append(cnpjCompleto.substring(0, 2));
            cnpjFormatado.append(".");
            cnpjFormatado.append(cnpjCompleto.substring(2, 5));
            cnpjFormatado.append(".");
            cnpjFormatado.append(cnpjCompleto.substring(5, 8));
            cnpjFormatado.append("/");
            cnpjFormatado.append(cnpjCompleto.substring(8, 12));
            cnpjFormatado.append("-");
            cnpjFormatado.append(cnpjCompleto.substring(12, 14));
        }
        return cnpjFormatado.toString();
    }

    public static String cpfFormat(String cpf) {
        StringBuffer cpfFormatado = new StringBuffer();
        if (!StringHelper.isBlankOrNull((Object)cpf)) {
            String cpfCompleto = StringHelper.completaComZerosAEsquerda((String)cpf, (int)11);
            cpfFormatado.append(cpfCompleto.substring(0, 3));
            cpfFormatado.append(".");
            cpfFormatado.append(cpfCompleto.substring(3, 6));
            cpfFormatado.append(".");
            cpfFormatado.append(cpfCompleto.substring(6, 9));
            cpfFormatado.append("-");
            cpfFormatado.append(cpfCompleto.substring(9, 11));
        }
        return cpfFormatado.toString();
    }

    public static String documentoFormat(String nrDocumento) {
        String retorno = nrDocumento;
        if (!StringHelper.isBlankOrNull((Object)nrDocumento)) {
            if (nrDocumento.length() == 11) {
                retorno = StringHelper.cpfFormat((String)nrDocumento);
            } else if (nrDocumento.length() == 14) {
                retorno = StringHelper.cnpjFormat((String)nrDocumento);
            }
        }
        return retorno;
    }

    public static String cnpjBaseFormat(String cnpjBase) {
        StringBuffer retorno = new StringBuffer();
        if (!StringHelper.isBlankOrNull((Object)cnpjBase)) {
            String cnpjCompleto = StringHelper.completaComZerosAEsquerda((String)cnpjBase, (int)8);
            retorno.append(cnpjCompleto.substring(0, 2));
            retorno.append(".");
            retorno.append(cnpjCompleto.substring(2, 5));
            retorno.append(".");
            retorno.append(cnpjCompleto.substring(5, 8));
        }
        return retorno.toString();
    }

    public static String unformatDocument(String nrDocumento) {
        StringBuffer retorno = new StringBuffer(nrDocumento);
        if (!StringHelper.isBlankOrNull((Object)nrDocumento)) {
            for (int ci = 0; ci < retorno.length(); ++ci) {
                char carac = retorno.charAt(ci);
                if (carac != '.' && carac != '-' && carac != '/') continue;
                retorno.deleteCharAt(ci);
            }
        }
        return retorno.toString();
    }

    public static String completaComZerosAEsquerda(String str, int finalLength) {
        StringBuffer sb = new StringBuffer();
        if (!StringHelper.isBlankOrNull((Object)str)) {
            for (int ci = 0; ci < finalLength - str.length(); ++ci) {
                sb.append("0");
            }
            sb.append(str);
        } else {
            for (int ci = 0; ci < finalLength; ++ci) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    public static String removeZerosAEsquerda(String str) {
        return str.replaceFirst("^0+[^1-9]*", "");
    }

    public static String trim(String value) {
        String retorno = null;
        if (value != null) {
            retorno = value.trim();
        }
        return retorno;
    }

    public static String redimensionaString(String str, int length) {
        String retorno = null;
        if (str != null) {
            String strTrim = str.trim();
            retorno = strTrim.concat(StringHelper.stringVazia((int)(length - strTrim.length())));
        } else {
            retorno = StringHelper.stringVazia((int)length);
        }
        return retorno;
    }

    public static String stringVazia(int length) {
        if (length <= 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer(length);
        for (int ci = 0; ci < length; ++ci) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String formataValorXML(String valor) {
        return valor.replace(".", "").replace(",", ".");
    }

    public static String formataValor(double d, int minimumFractionDigits, int maximumFractionDigits) {
        DecimalFormat df = new DecimalFormat();
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("pt", "BR")));
        df.setMinimumFractionDigits(minimumFractionDigits);
        df.setMaximumFractionDigits(maximumFractionDigits);
        return df.format(d);
    }

    public static String formataValor(String s, int minimumFractionDigits, int maximumFractionDigits) {
        String valorFormatado = null;
        if (s == null || s.trim().length() == 0) {
            valorFormatado = "0";
            if (minimumFractionDigits > 0) {
                valorFormatado = valorFormatado + ",";
            }
            for (int i = 0; i < minimumFractionDigits; ++i) {
                valorFormatado = valorFormatado + "0";
            }
        } else {
            valorFormatado = StringHelper.formataValor((BigDecimal)new BigDecimal(s), (int)minimumFractionDigits, (int)maximumFractionDigits);
        }
        return valorFormatado;
    }

    public static String formataValor(BigDecimal b, int minimumFractionDigits, int maximumFractionDigits) {
        if (b == null) {
            return "";
        }
        DecimalFormat df = new DecimalFormat();
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("pt", "BR")));
        df.setMinimumFractionDigits(minimumFractionDigits);
        df.setMaximumFractionDigits(maximumFractionDigits);
        return df.format(b);
    }

    public static String formataNotaFiscal(String nota) {
        StringBuffer sb = new StringBuffer();
        if (!StringHelper.isBlankOrNull((Object)nota)) {
            String notaCompleto = StringHelper.completaComZerosAEsquerda((String)nota, (int)9);
            sb.append(notaCompleto.substring(0, 3)).append(".");
            sb.append(notaCompleto.substring(3, 6)).append(".");
            sb.append(notaCompleto.substring(6, 9));
        }
        return sb.toString();
    }

    public static String formataCodigoNumerico(String codNum) {
        StringBuffer sb = new StringBuffer();
        if (!StringHelper.isBlankOrNull((Object)codNum)) {
            String notaCompleto = StringHelper.completaComZerosAEsquerda((String)codNum, (int)9);
            sb.append(notaCompleto.substring(0, 3)).append(".");
            sb.append(notaCompleto.substring(3, 6)).append(".");
            sb.append(notaCompleto.substring(6, 9));
        }
        return sb.toString();
    }

    public static String formataNotaFiscalRef(String nota) {
        StringBuffer sb = new StringBuffer(nota);
        if (sb.length() != 44) {
            return null;
        }
        sb.insert(2, "-").insert(5, "/").insert(8, "-").insert(11, ".").insert(15, ".");
        sb.insert(19, "/").insert(24, "-").insert(27, "-").insert(30, "-").insert(34, "-");
        sb.insert(38, ".").insert(42, ".").insert(46, "-").insert(50, ".").insert(54, ".").insert(58, "-");
        return sb.toString();
    }

    public static String replace(String find, String replace, String source) {
        String result = "";
        while (source.indexOf(find) >= 0) {
            result = result + source.substring(0, source.indexOf(find)) + replace;
            source = source.substring(source.indexOf(find) + find.length());
        }
        result = result + source;
        return result;
    }

    public static boolean isBlankOrNull(Object value) {
        return value == null || value.toString().trim().equals("");
    }

    public static boolean isNumeric(String str) {
        if (StringHelper.isBlankOrNull((Object)str)) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    public static String getDigits(String string) {
        return string.replaceAll("\\D", "");
    }

    public static String getMoney(String string) {
        return string.replaceAll("[.]", "");
    }

    public static String leftPad(Object string, String pad, int tamanhoFinal) {
        String resultado = string.toString();
        while (resultado.length() < tamanhoFinal) {
            resultado = pad + resultado;
        }
        return resultado;
    }

    public static boolean isRepeated(String value) {
        boolean isRepeated = true;
        String character = value.substring(0, 1);
        for (int i = 1; i < value.length(); ++i) {
            String nextChar = value.substring(i, i + 1);
            if (nextChar.equals(character)) continue;
            isRepeated = false;
            break;
        }
        return isRepeated;
    }

    public static String encodeSpecialXMLChars(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot;").replaceAll("'", "&#39;");
    }

    public static String decodeSpecialXMLChars(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("&amp;", "&").replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("&quot;", "\"").replaceAll("&#39;", "'");
    }
}

