/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cpf
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.CpfCnpj
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj;

import br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.CpfCnpj;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

public class Cpf
extends CpfCnpj {
    public static boolean isValid(String cpf) {
        String s = cpf.replaceAll("[^0-9]*", "");
        if (s.length() == 11) {
            return CpfCnpj.isValid((String)cpf);
        }
        return false;
    }

    public Cpf(String cpf) throws ValidationException {
        super(cpf);
        if (cpf == null) {
            throw new ValidationException("CPF nulo");
        }
        String s = cpf.replaceAll("[^0-9]*", "");
        if (s.length() != 11) {
            throw new ValidationException("O CPF deve ter 11 d\u00ef\u00bf\u00bdgitos");
        }
    }

    public boolean isCnpj() {
        return false;
    }

    public boolean isCpf() {
        return true;
    }
}

