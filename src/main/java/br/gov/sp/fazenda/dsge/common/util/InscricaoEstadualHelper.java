/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.util.InscricaoEstadualHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
class InscricaoEstadualHelper {
    private static final String a = "br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual";
    private InscricaoEstadual a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public InscricaoEstadualHelper(String inscricaoEstadual, String uf) throws DSGEValidationException {
        if (inscricaoEstadual == null) {
            throw new DSGEValidationException(null, "Inscri\u00e7\u00e3o Estadual nula");
        }
        if (StringHelper.isBlankOrNull((Object)uf)) {
            throw new DSGEValidationException(null, "UF vazia ou nula");
        }
        this.a = InscricaoEstadualHelper.a((String)uf);
        while (uf.equalsIgnoreCase("AM") && inscricaoEstadual.length() < 9) {
            inscricaoEstadual = "0" + inscricaoEstadual;
        }
        while (uf.equalsIgnoreCase("BA") && inscricaoEstadual.length() < 8) {
            inscricaoEstadual = "0" + inscricaoEstadual;
        }
        if (inscricaoEstadual.length() >= 2 && inscricaoEstadual.substring(0, 2).equalsIgnoreCase("PR")) {
            if (!uf.equalsIgnoreCase("MG")) throw new DSGEValidationException(null, "");
            this.a.setNumberEspecial(inscricaoEstadual);
            return;
        } else {
            this.a.setNumber(inscricaoEstadual);
        }
    }

    public String a() {
        return this.a.getValue();
    }

    public void a() throws DSGEValidationException {
        try {
            this.a.validate();
        }
        catch (ValidationException e) {
            throw new DSGEValidationException((Throwable)e, e.getMessage());
        }
    }

    public String b() {
        return this.a.getNumber();
    }

    public static InscricaoEstadual a(String uf) throws DSGEValidationException {
        InscricaoEstadual ie = null;
        try {
            ie = (InscricaoEstadual)Class.forName("br.gov.sp.fazenda.dsge.brazilutils.uf.ie.InscricaoEstadual" + uf.toUpperCase()).newInstance();
        }
        catch (InstantiationException e) {
            throw new DSGEValidationException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSGEValidationException((Throwable)e, e.getMessage());
        }
        catch (ClassNotFoundException e) {
            throw new DSGEValidationException((Throwable)e, e.getMessage());
        }
        return ie;
    }
}

