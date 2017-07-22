/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.text.RealToWords
 */
package br.gov.sp.fazenda.dsge.brazilutils.text;

import java.math.BigDecimal;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RealToWords {
    private String a;
    private String b = "";
    private String c = "";
    private String d = "";
    private transient boolean a = true;
    private transient String e = "";
    private static final String f = "real";
    private static final String g = "reais";
    private static final String h = "centavo";
    private static final String i = "centavos";
    private static final String j = "mil\u00c3\u00a9simo de real";
    private static final String k = "mil\u00c3\u00a9simos de real";
    private static final String[] a = new String[]{"", "mil ", "milh\u00c3\u00a3o ", "bilh\u00c3\u00a3o ", "trilh\u00c3\u00a3o ", "quatrilh\u00c3\u00a3o "};
    private static final String[] b = new String[]{"", "mil ", "milh\u00c3\u00b5es ", "bilh\u00c3\u00b5es ", "trilh\u00c3\u00b5es ", "quatrilh\u00c3\u00b5es "};
    private static final String[] c = new String[]{"", "cento e ", "duzentos ", "trezentos ", "quatrocentos ", "quinhentos ", "seiscentos ", "setecentos ", "oitocentos ", "novecentos "};
    private static final String[] d = new String[]{"", "dez ", "vinte ", "trinta ", "quarenta ", "cinq\u00c3\u00bcenta ", "sessenta ", "setenta ", "oitenta ", "noventa "};
    private static final String[] e = new String[]{"", "um ", "dois ", "tr\u00c3\u00aas ", "quatro ", "cinco ", "seis ", "sete ", "oito ", "nove ", "dez ", "onze ", "doze ", "treze ", "quatorze ", "quinze ", "dezesseis ", "dezessete ", "dezoito ", "dezenove "};

    public String getPositivePrefix() {
        return this.a;
    }

    public void setPositivePrefix(String prefix) {
        this.a = prefix;
    }

    public String getPositiveSuffix() {
        return this.b;
    }

    public void setPositiveSuffix(String suffix) {
        this.b = suffix;
    }

    public String getNegativePrefix() {
        return this.c;
    }

    public void setNegativePrefix(String negativePrefix) {
        this.c = negativePrefix;
    }

    public String getNegativeSuffix() {
        return this.d;
    }

    public void setNegativeSuffix(String negativeSuffix) {
        this.d = negativeSuffix;
    }

    public String toWords(String currency) {
        return this.toWords(new BigDecimal(currency));
    }

    public String toWords(BigDecimal currency) {
        int scale = currency.scale();
        if (scale != 2 && scale != 3) {
            throw new ArithmeticException("a escala deve ser igual a dois ou tr\u00c3\u00aas.");
        }
        StringBuffer valueToWords = new StringBuffer();
        BigDecimal[] result = this.a(currency);
        BigDecimal parteInteira = result[0];
        BigDecimal parteDecimal = result[1];
        this.a(result[1], scale);
        StringBuffer inteiroToWords = this.a(parteInteira.intValue());
        StringBuffer decimalToWords = this.b(parteDecimal.intValue());
        if (inteiroToWords.length() == 0 || decimalToWords.length() == 0) {
            valueToWords.append(inteiroToWords).append(decimalToWords);
        } else {
            valueToWords.append(inteiroToWords).append(" e ").append(decimalToWords);
        }
        if (this.a) {
            return valueToWords.insert(0, this.a).append(this.b).toString();
        }
        return valueToWords.insert(0, this.c).append(this.d).toString();
    }

    private BigDecimal[] a(BigDecimal currency) {
        BigDecimal[] result;
        result = new BigDecimal[]{currency.setScale(0, 1), currency.subtract(result[0]).movePointRight(currency.scale())};
        return result;
    }

    private StringBuffer a(int number) {
        String moeda = null;
        if (number == 0) {
            return new StringBuffer("");
        }
        if (number < 0) {
            number = - number;
            this.a = false;
        } else {
            this.a = true;
        }
        moeda = number == 1 ? "real" : (number == 0 ? "" : "reais");
        StringBuffer intToWords = this.c(number);
        if (this.a(intToWords)) {
            moeda = "de " + moeda;
        }
        return intToWords.append(moeda);
    }

    private StringBuffer b(int decimal) {
        if (decimal == 0) {
            return new StringBuffer("");
        }
        if (decimal < 0) {
            decimal = - decimal;
        }
        StringBuffer centsToWords = this.c(decimal);
        return centsToWords.append(this.e);
    }

    private StringBuffer c(int number) {
        StringBuffer numToWords = new StringBuffer("");
        if (number < 0) {
            throw new IllegalArgumentException("numero deve ser maior ou igual a zero.");
        }
        int casa_milhar = 0;
        do {
            int n;
            if ((n = number % 1000) != 0) {
                StringBuffer s = this.d(n);
                numToWords = this.a(n) ? s.append(a[casa_milhar]).append(numToWords) : s.append(b[casa_milhar]).append(numToWords);
            }
            ++casa_milhar;
        } while ((number /= 1000) > 0);
        return numToWords;
    }

    private StringBuffer d(int number) {
        StringBuffer numToWords = new StringBuffer("");
        if (number < 0) {
            throw new IllegalArgumentException("numero deve ser maior ou igual a zero.");
        }
        if (number == 0) {
            return numToWords;
        }
        if (number == 100) {
            return numToWords.append("cem ");
        }
        if (number % 100 < 20) {
            numToWords.append(e[number % 100]);
            number /= 100;
        } else {
            numToWords.append(e[number % 10]);
            if (number % 10 != 0) {
                numToWords.insert(0, "e ");
            }
            numToWords.insert(0, d[(number /= 10) % 10]);
            number /= 10;
        }
        if (number > 0 && number != 1) {
            numToWords.insert(0, "e ");
        }
        return numToWords.insert(0, c[number]);
    }

    private void a(BigDecimal decimal, int scale) {
        if (scale == 3) {
            this.e = decimal.intValue() == 1 ? "mil\u00c3\u00a9simo de real" : (decimal.intValue() == 0 ? "" : "mil\u00c3\u00a9simos de real");
            return;
        }
        this.e = decimal.intValue() == 1 ? "centavo" : (decimal.intValue() == 0 ? "" : "centavos");
    }

    private boolean a(int number) {
        String num = String.valueOf(number);
        if (number / 1000 > 0) {
            return num.endsWith("001");
        }
        if (number < 11) {
            return num.endsWith("1");
        }
        return false;
    }

    private boolean a(StringBuffer numberToWords) {
        String numToWords = numberToWords.toString();
        for (int a = 1; a < RealToWords.a.length; ++a) {
            if (!numToWords.endsWith(RealToWords.a[a])) continue;
            return true;
        }
        for (int b = 1; b < a.length; ++b) {
            if (!numToWords.endsWith(RealToWords.b[b])) continue;
            return true;
        }
        return false;
    }
}

