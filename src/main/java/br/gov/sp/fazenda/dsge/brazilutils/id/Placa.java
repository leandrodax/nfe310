/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.id.Placa
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.id;

import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Placa
implements Validable {
    public static final String MASK = "UUU-####";
    private String a = "";
    private String b = "";

    public Placa() {
    }

    public Placa(String placa) {
        this.setPlaca(placa);
    }

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public String getLetters() {
        return this.a;
    }

    public String getNumbers() {
        return this.b;
    }

    public String getPlaca() {
        return this.a + "-" + this.b;
    }

    public boolean isValid() {
        return this.a != null && this.a.length() == 3 && Character.isLetter(this.a.charAt(0)) && Character.isLetter(this.a.charAt(1)) && Character.isLetter(this.a.charAt(2)) && this.b != null && this.b.length() == 4 && Character.isDigit(this.b.charAt(0)) && Character.isDigit(this.b.charAt(1)) && Character.isDigit(this.b.charAt(2)) && Character.isDigit(this.b.charAt(3));
    }

    public void setLetters(String letters) {
        if (letters != null) {
            letters = letters.toUpperCase();
            Pattern p = Pattern.compile("[A-Z]{3}");
            Matcher m = p.matcher(letters);
            this.a = m.find() ? m.group() : "";
        } else {
            this.a = "";
        }
    }

    public void setNumbers(String numbers) {
        Pattern p;
        Matcher m;
        this.b = numbers != null ? ((m = (p = Pattern.compile("[0-9]{4}")).matcher(numbers)).find() ? m.group() : "") : "";
    }

    public void setPlaca(String placa) {
        this.setLetters(placa);
        this.setNumbers(placa);
    }

    public String toNoMask() {
        return this.a + this.b;
    }

    public String toString() {
        return this.getPlaca();
    }

    public void validate() throws ValidationException {
    }
}

