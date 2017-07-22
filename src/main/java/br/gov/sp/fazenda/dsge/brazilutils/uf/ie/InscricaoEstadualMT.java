/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualMT
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualMT
extends InscricaoEstadual {
    public void setNumber(String number) {
        if (number != null) {
            if (number.length() == 9) {
                number = "00" + number;
            } else if (number.length() == 10) {
                number = "0" + number;
            }
        }
        super.setNumber(number);
    }

    public int defaultDigitCount() {
        return 11;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        return "##########-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("3298765432");
    }
}

