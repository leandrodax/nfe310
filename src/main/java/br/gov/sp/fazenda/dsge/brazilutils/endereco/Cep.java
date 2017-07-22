/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep
 *  br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposed
 *  br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposedMasker
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.endereco;

import br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposed;
import br.gov.sp.fazenda.dsge.brazilutils.utilities.NumberComposedMasker;
import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

public class Cep
implements NumberComposed,
Validable {
    public static final int DIGIT_COUNT = 8;
    public static final String MASK = "##.###-###";
    private String a = null;

    public Cep() {
    }

    public Cep(String cep) {
        this.setCep(cep);
    }

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public String getMask() {
        return "##.###-###";
    }

    public String getNumber() {
        return this.a;
    }

    public String getValue() {
        return NumberComposedMasker.applyMask((String)this.a, (String)"##.###-###");
    }

    public boolean isValid() {
        return this.a != null && this.a.length() == 8;
    }

    public void setCep(String cep) {
        this.a = cep.replaceAll("[^0-9]*", "");
    }

    public long toLong() {
        return Long.parseLong(this.a);
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

