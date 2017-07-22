/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.TelFormatter
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.TelMask
 *  br.gov.sp.fazenda.dsge.brazilutils.telefone.Telefone
 *  br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposed
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.telefone;

import br.gov.sp.fazenda.dsge.brazilutils.telefone.TelFormatter;
import br.gov.sp.fazenda.dsge.brazilutils.telefone.TelMask;
import br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposed;
import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Exception performing whole class analysis ignored.
 */
public class Telefone
implements NumberComposed,
Validable {
    public static final String DDD_TAGS = "\\(.*\\)";
    private String a;
    private boolean a;
    private String b;
    private String c = null;
    private TelFormatter a = new TelFormatter("");
    private boolean b = false;

    public static String extractValidTelChar(String tel) {
        return tel.replaceAll("[^0-9,\\+,\\(,\\),\\-, ]", "");
    }

    public Telefone() {
    }

    public Telefone(String tel) {
        this.setTel(tel);
    }

    public Telefone(String tel, String mask) {
        this.setTel(tel);
        this.a.setFormat(mask);
        this.a = false;
    }

    public Telefone(TelFormatter formatter) {
        this.a = formatter;
        this.a = false;
    }

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public String getBase() {
        if (this.b) {
            return this.a.formatBase(this.a);
        }
        return this.a;
    }

    public String getBaseNumber() {
        return this.a;
    }

    public String getDdd() {
        if (this.b) {
            return this.a.formatDdd(this.b);
        }
        return this.b;
    }

    public String getDddNumber() {
        return this.b;
    }

    public String getDdi() {
        if (this.b) {
            return this.a.formatDdi(this.c);
        }
        return this.c;
    }

    public String getDdiNumber() {
        return this.c;
    }

    public String getMask() {
        return this.a.getMask();
    }

    public String getNumber() {
        String result = this.a;
        if (this.a.getMemberCount() > 1) {
            result = this.b + result;
        }
        if (this.a.getMemberCount() > 2) {
            result = this.c + result;
        }
        return result;
    }

    public boolean getUseMask() {
        return this.b;
    }

    public String getValue() {
        String result = this.getBase();
        if (this.a.getMemberCount() > 1) {
            result = this.getDdd() + result;
        }
        if (this.a.getMemberCount() > 2) {
            result = this.getDdi() + result;
        }
        return result;
    }

    public boolean isValid() {
        boolean result;
        boolean bl = result = this.a != null && this.a.length() > 0;
        if (this.a.getMemberCount() > 1) {
            boolean bl2 = result = this.b != null && this.b.length() > 0 && result;
        }
        if (this.a.getMemberCount() > 2) {
            result = this.c != null && this.c.length() > 0 && result;
        }
        return result;
    }

    private void a(String tel) {
        tel = tel.replaceAll("[^0-9]*", "");
        int count = 0;
        int baseCount = this.a.baseCount();
        int dddCount = this.a.dddCount();
        String[] pt = new String[]{"", "", ""};
        for (int i = tel.length() - 1; i >= 0; --i) {
            if (++count <= baseCount) {
                pt[2] = "" + tel.charAt(i) + pt[2];
                continue;
            }
            if (count <= baseCount + dddCount) {
                pt[1] = "" + tel.charAt(i) + pt[1];
                continue;
            }
            pt[0] = "" + tel.charAt(i) + pt[0];
        }
        this.setBase(pt[2]);
        this.setDdd(pt[1]);
        this.setDdi(pt[0]);
    }

    private void b(String tel) {
        Pattern p = Pattern.compile("\\(.+\\)");
        Matcher m = p.matcher(tel);
        if (m.find()) {
            this.setDdi(tel.replaceAll("\\(.*", ""));
            this.setDdd(m.group());
            this.setBase(tel.replaceAll(".*\\)", ""));
        } else {
            this.setDdd("");
            this.setDdi("");
            this.setBase(this.a);
        }
    }

    public void setBase(String base) {
        this.a = base != null ? base.replaceAll("[^0-9, ]", "") : "";
    }

    public void setDdd(String ddd) {
        this.b = ddd != null ? ddd.replaceAll("[^0-9, ]", "") : "";
    }

    public void setDdi(String ddi) {
        this.c = ddi != null ? ddi.replaceAll("[^0-9, ]", "") : "";
    }

    public void setMask(String mask) {
        this.a.setFormat(mask);
    }

    public void setMask(TelMask mask) {
        this.a.setFormat(mask.toString());
    }

    public void setTel(String tel) {
        tel = Telefone.extractValidTelChar((String)tel);
        if (this.a.getMemberCount() == 0) {
            this.a.setFormat(TelFormatter.extractMask((String)tel));
        }
        this.b = this.a.getMemberCount() > 0;
        Pattern p = Pattern.compile("\\(.*\\)");
        Matcher m = p.matcher(tel);
        if (m.find()) {
            this.b(tel);
        } else {
            this.a(tel);
        }
    }

    public void setTel(String ddi, String ddd, String base) {
        this.setBase(base);
        this.setDdd(ddd);
        this.setDdi(ddi);
    }

    public void setUseMask(boolean useMask) {
        this.b = useMask;
    }

    public String to8Digits() {
        if (this.a != null && this.a.length() == 7) {
            if (this.getNumber().charAt(0) == '3') {
                return "" + '3' + this.getNumber();
            }
            if (this.getNumber().charAt(0) == '8') {
                return "" + '8' + this.getNumber();
            }
            if (this.getNumber().charAt(0) == '9') {
                return "" + '9' + this.getNumber();
            }
            return "" + '2' + this.getNumber();
        }
        return this.getNumber();
    }

    public long toLong() {
        return Long.parseLong(this.getNumber());
    }

    public String toString() {
        return this.getValue();
    }

    public void validate() throws ValidationException {
        if (!this.isValid()) {
            throw new ValidationException();
        }
    }
}

