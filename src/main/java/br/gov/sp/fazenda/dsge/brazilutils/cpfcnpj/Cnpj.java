/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cnpj
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.CpfCnpj
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj;

import br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.CpfCnpj;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

public class Cnpj
extends CpfCnpj {
    public static boolean isValid(String cnpj) {
        String s = cnpj.replaceAll("[^0-9]*", "");
        if (s.length() == 14) {
            return CpfCnpj.isValid((String)cnpj);
        }
        return false;
    }

    public Cnpj(String cnpj) throws ValidationException {
        super(cnpj);
        String s = cnpj.replaceAll("[^0-9]*", "");
        if (s.length() != 14) {
            throw new ValidationException("O CNPJ deve ter 14 d\u00edgitos");
        }
    }

    public boolean isCnpj() {
        return true;
    }

    public boolean isCpf() {
        return false;
    }
}

