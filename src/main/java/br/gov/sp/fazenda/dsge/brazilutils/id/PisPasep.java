/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.id.PisPasep
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.id;

import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

/*
 * Exception performing whole class analysis ignored.
 */
public class PisPasep
implements Validable {
    public static final int DIGIT_COUNT = 11;
    public static final String MASK = "###.#####.##-#";
    private String a = null;

    public static boolean isValid(String pisOrPasep) {
        if (pisOrPasep == null) {
            return false;
        }
        String n = pisOrPasep.replaceAll("[^0-9]*", "");
        if (n.length() != 11) {
            return false;
        }
        int dv = Integer.parseInt(String.valueOf(n.charAt(n.length() - 1)));
        int sum = 0;
        int coeficient = 2;
        for (int i = n.length() - 2; i >= 0; --i) {
            int digit = Integer.parseInt(String.valueOf(n.charAt(i)));
            sum += digit * coeficient;
            if (++coeficient <= 9) continue;
            coeficient = 2;
        }
        int foundDv = 11 - sum % 11;
        if (foundDv >= 10) {
            foundDv = 0;
        }
        return dv == foundDv;
    }

    public PisPasep() {
    }

    public PisPasep(String pisPasep) {
        this.setPisPasep(pisPasep);
    }

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public String getPisPasep() {
        if (this.a != null) {
            return this.a.replaceAll("([0-9]{3})([0-9]{5})([0-9]{2})([0-9])", "$1\\.$2\\.$3\\-$4");
        }
        return null;
    }

    public boolean isValid() {
        return PisPasep.isValid((String)this.a);
    }

    public void setPisPasep(String pisPasep) {
        this.a = pisPasep != null ? pisPasep.replaceAll("[^0-9]*", "") : null;
    }

    public String toString() {
        return null;
    }

    public void validate() throws ValidationException {
        if (!this.isValid()) {
            throw new ValidationException();
        }
    }
}

