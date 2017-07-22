/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadualPA
 */
package br.gov.sp.fazenda.dsge.brazilutils.uf.ie;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;

public final class InscricaoEstadualPA
extends InscricaoEstadual {
    public int defaultDigitCount() {
        return 9;
    }

    public int getDvCount() {
        return 1;
    }

    public String getMask() {
        return "##.###.###-#";
    }

    public void defineCoeficients() {
        this.setCoeficientList("98765432");
    }

    public boolean isValid() {
        if (!this.isFixDigitCorrect(0, '1')) {
            return false;
        }
        if (!this.isFixDigitCorrect(1, '5')) {
            return false;
        }
        return super.isValid();
    }
}

