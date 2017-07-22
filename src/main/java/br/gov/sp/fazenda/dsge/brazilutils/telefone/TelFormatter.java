/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.TelFormatter
 */
package br.gov.sp.fazenda.dsge.brazilutils.telefone;

import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class TelFormatter {
    private static final char a = '*';
    private static JFormattedTextField a = null;
    private static MaskFormatter a = null;
    private static final char b = '#';
    private String a;
    private String b;
    private String c;
    private int a;

    public static String extractMask(String tel) {
        String result = tel.replaceAll("[0-9]", "#");
        result = result.replaceAll(" ", "*");
        return result;
    }

    public static String format(String value, String mask) {
        try {
            a = new MaskFormatter(mask);
            a = new JFormattedTextField(a);
        }
        catch (ParseException e) {
            e.printStackTrace();
            return value;
        }
        a.setText(value);
        return a.getText();
    }

    public TelFormatter(String mask) {
        this.setFormat(mask);
    }

    public int baseCount() {
        return this.digitCount(this.a);
    }

    public int dddCount() {
        return this.digitCount(this.b);
    }

    public int ddiCount() {
        return this.digitCount(this.c);
    }

    public int digitCount(String mask) {
        int result = 0;
        for (int i = 0; i < mask.length(); ++i) {
            if (mask.charAt(i) != '#' && mask.charAt(i) != '*') continue;
            ++result;
        }
        return result;
    }

    public String formatBase(String base) {
        return TelFormatter.format((String)base, (String)this.a);
    }

    public String formatDdd(String ddd) {
        return TelFormatter.format((String)ddd, (String)this.b);
    }

    public String formatDdi(String ddi) {
        return TelFormatter.format((String)ddi, (String)this.c);
    }

    public String getBaseMask() {
        return this.a;
    }

    public String getDddMask() {
        return this.b;
    }

    public String getDdiMask() {
        return this.c;
    }

    public String getMask() {
        return this.c + this.b + this.a;
    }

    public int getMemberCount() {
        return this.a;
    }

    public void setBaseMask(String baseMask) {
        this.a = baseMask;
    }

    public void setDddMask(String dddMask) {
        this.b = dddMask;
    }

    public void setDdiMask(String ddiMask) {
        this.c = ddiMask;
    }

    public void setFormat(String mask) {
        if ((mask = mask.replaceAll("[^#,*,\\+,\\(,\\),\\-, ]", "")) == null || mask.length() == 0) {
            this.c = "";
            this.b = "";
            this.a = "";
            this.a = 0;
        } else {
            Pattern p = Pattern.compile("\\(.+\\)");
            Matcher m = p.matcher(mask);
            if (m.find()) {
                this.c = mask.replaceAll("\\(.*", "");
                this.b = m.group();
                this.a = mask.replaceAll(".*\\)", "");
                this.a = this.c.length() > 0 ? 3 : 2;
            } else {
                this.c = "";
                this.b = "";
                this.a = mask;
                this.a = 1;
            }
        }
    }

    static {
    }
}

