/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.ChainValidator
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposed
 *  br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposedMasker
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.ChainValidator;
import br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposed;
import br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposedMasker;
import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;
import java.util.ArrayList;
import java.util.List;

public abstract class InscricaoEstadual
implements ChainValidator,
NumberComposed,
Validable {
    public static final String INVALID_DIGIT_COUNT = "Invalid Digit Count";
    protected transient ChainValidator nextValidator;
    protected final transient List coeficients = new ArrayList();
    protected String invalidCause = null;
    protected String number = null;

    public InscricaoEstadual() {
        this.defineCoeficients();
    }

    public abstract int defaultDigitCount();

    public abstract int getDvCount();

    public abstract void defineCoeficients();

    public abstract String getMask();

    public void addValidator(ChainValidator nextValidator) {
        this.nextValidator = nextValidator;
    }

    public boolean validate(String inscricaoEstadual) {
        this.setNumber(inscricaoEstadual);
        if (this.isValid()) {
            return true;
        }
        if (this.nextValidator == null) {
            return false;
        }
        return this.nextValidator.validate(inscricaoEstadual);
    }

    public boolean isValid() {
        this.defineCoeficients();
        if (!this.isValidDigitCount()) {
            return false;
        }
        int sum = this.getCalcSum();
        int mod = sum % 11;
        int dv1 = mod <= 1 ? 0 : 11 - mod;
        return dv1 == this.getDv1();
    }

    public void validate() throws ValidationException {
        if (!this.isValid()) {
            throw new ValidationException();
        }
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number.replaceAll("[^0-9]*", "");
    }

    public void setNumberEspecial(String number) {
        this.number = number;
    }

    public String getBaseNumber() {
        String s = this.number;
        String result = "";
        for (int i = 0; i < s.length(); ++i) {
            if (this.getDvCount() == 1) {
                if (i == this.getDv1Position()) continue;
                result = result + s.charAt(i);
                continue;
            }
            if (i == this.getDv1Position() || i == this.getDv2Position()) continue;
            result = result + s.charAt(i);
        }
        return result;
    }

    public String getValue() {
        return NumberComposedMasker.applyMask((String)this.number, (String)this.getMask());
    }

    public boolean isFixDigitCorrect(int position, char specialDigit) {
        boolean result;
        boolean bl = result = this.getNumber().charAt(position) == specialDigit;
        if (!result) {
            this.invalidCause = "The digit on position[" + position + "] must be '" + specialDigit + "'";
        }
        return result;
    }

    public boolean isValidDigitCount() {
        boolean result;
        boolean bl = result = this.defaultDigitCount() == this.getNumber().length();
        if (!result) {
            this.invalidCause = "Incorrect Format";
        }
        return result;
    }

    public String getInvalidCause() {
        return this.invalidCause;
    }

    public long toLong() {
        return Long.parseLong(this.number);
    }

    public String toString() {
        return this.getValue();
    }

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    protected int getCalcSum() {
        return this.getCalcSum(0, this.coeficients.size() - 1, this.getNumber());
    }

    protected int getCalcSum(int digitBegin, int digitEnd, String digits) {
        int result = 0;
        String dStr = digits == null || digits.length() < 1 ? this.getNumber() : digits;
        for (int i = digitBegin; i <= digitEnd; ++i) {
            Integer c = (Integer)this.coeficients.get(i);
            Integer d = Integer.valueOf("" + dStr.charAt(i));
            result += d * c;
        }
        return result;
    }

    protected void setCoeficientList(String coeficients) {
        this.coeficients.clear();
        String s = "";
        for (int i = 0; i < coeficients.length(); ++i) {
            s = String.valueOf(coeficients.charAt(i));
            this.coeficients.add(Integer.parseInt(s));
        }
    }

    protected void addCoeficient(int coeficient) {
        this.coeficients.add(coeficient);
    }

    protected void addCoeficientLeft(int coeficient) {
        this.coeficients.add(0, coeficient);
    }

    protected void clearCoeficients() {
        this.coeficients.clear();
    }

    protected String getCoeficientList() {
        int i;
        for (i = 0; i < this.coeficients.size(); ++i) {
            if (this.coeficients.get(i).toString().length() <= 1) continue;
            return null;
        }
        String result = "";
        for (i = 0; i < this.coeficients.size(); ++i) {
            result = result + this.coeficients.get(i).toString();
        }
        return result;
    }

    protected short getDv1() {
        return this.getDigitValue(this.getDv1Position());
    }

    protected int getDv1Position() {
        if (this.getDvCount() == 1) {
            return this.defaultDigitCount() - 1;
        }
        return this.defaultDigitCount() - 2;
    }

    protected short getDv2() {
        return this.getDigitValue(this.getDv2Position());
    }

    protected int getDv2Position() {
        return this.defaultDigitCount() - 1;
    }

    private char a(int digitPosition) {
        return this.getNumber().charAt(digitPosition);
    }

    protected void setInvalidCause(String invalidCause) {
        this.invalidCause = invalidCause;
    }

    protected short getDigitValue(int digitPosition) {
        String s = "" + this.a(digitPosition);
        return Short.parseShort(s);
    }
}

