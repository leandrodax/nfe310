/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.id.TituloEleitoral
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.id;

import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

/*
 * Exception performing whole class analysis ignored.
 */
public class TituloEleitoral
implements Validable {
    public static int DIGIT_COUNT = 13;
    private String a = null;
    private String b = null;
    private String c = null;

    public TituloEleitoral() {
    }

    public static boolean isValid(String tituloEleitoral) {
        if (tituloEleitoral == null) {
            return false;
        }
        String n = tituloEleitoral.replaceAll("[^0-9]*", "");
        for (int k = n.length(); k < DIGIT_COUNT; ++k) {
            n = "" + '0' + n;
        }
        if (n.length() != DIGIT_COUNT) {
            return false;
        }
        int[] coeficients = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 4, 3};
        int foundDv = 0;
        int aux = Integer.parseInt("" + n.charAt(9) + n.charAt(10));
        int dv = Integer.parseInt("" + n.charAt(11) + n.charAt(12));
        int sum = 0;
        for (int i = 0; i <= 10; ++i) {
            int digit = Integer.parseInt(String.valueOf(n.charAt(i)));
            sum += digit * coeficients[i];
            if (i != 8 && i != 10) continue;
            sum = (sum %= 11) > 1 ? 11 - sum : (aux <= 2 ? 1 - sum : 0);
            foundDv = i == 8 ? sum * 10 : (foundDv += sum);
            sum *= 2;
        }
        return dv == foundDv;
    }

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public String getSecao() {
        return this.b;
    }

    public String getZona() {
        return this.c;
    }

    public boolean isValid() {
        return TituloEleitoral.isValid((String)this.a);
    }

    public void setSecao(String secao) {
        this.b = secao;
    }

    public void setTituloEleitoral(String tituloEleitoral) {
        this.a = tituloEleitoral != null ? tituloEleitoral : null;
    }

    public void setZona(String zona) {
        this.c = zona;
    }

    public void validate() throws ValidationException {
        if (!this.isValid()) {
            throw new ValidationException();
        }
    }

    static {
    }
}

