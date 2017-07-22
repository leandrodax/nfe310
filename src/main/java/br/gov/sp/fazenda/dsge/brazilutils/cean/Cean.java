/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.cean.Cean
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.cean;

import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

public class Cean {
    private final int[] a = new int[]{3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3};

    public boolean validaDigitoCean(String cean) throws ValidationException {
        block8 : {
            if (cean == null) {
                throw new ValidationException("cEAN nulo");
            }
            int digitoCean = 0;
            int indiceInicial = 0;
            int digitoCalculo = 0;
            int digitoCalculado = 0;
            int tamCean = cean.length();
            String ceanSemDigito = "";
            try {
                if (tamCean == 8 || tamCean == 12 || tamCean == 13 || tamCean == 14 || tamCean == 18) {
                    digitoCean = Integer.parseInt(cean.substring(cean.length() - 1, cean.length()));
                    ceanSemDigito = cean.substring(0, cean.length() - 1);
                    indiceInicial = this.a.length - ceanSemDigito.length();
                    for (int i = 0; i < ceanSemDigito.length(); ++i) {
                        digitoCalculo += Integer.parseInt(ceanSemDigito.substring(i, i + 1)) * this.a[indiceInicial];
                        ++indiceInicial;
                    }
                    if (digitoCalculo % 10 == 0) {
                        digitoCalculado = 0;
                    } else {
                        int divTemp = (int)Math.ceil((double)digitoCalculo / 10.0) * 10;
                        digitoCalculado = divTemp - digitoCalculo;
                    }
                    if (digitoCalculado == digitoCean) {
                        return true;
                    }
                    break block8;
                }
                throw new ValidationException("Tamanho do cEAN inv\u00e1lido");
            }
            catch (Exception e) {
                throw new ValidationException("cEAN inv\u00e1lido");
            }
        }
        return false;
    }
}

