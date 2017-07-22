/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.util.CeanHelper
 *  br.gov.sp.fazenda.dsge.common.util.CpfCnpjHelper
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.InscricaoEstadualHelper
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.util.CeanHelper;
import br.gov.sp.fazenda.dsge.common.util.CpfCnpjHelper;
import br.gov.sp.fazenda.dsge.common.util.InscricaoEstadualHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DSGEDocumentoHelper {
    private static InscricaoEstadualHelper a = null;
    private static CpfCnpjHelper a = null;
    private static CeanHelper a = null;

    private DSGEDocumentoHelper() {
    }

    public static void validarIE(String ie, String uf) throws DSGEValidationException {
        a = new InscricaoEstadualHelper(ie, uf);
        a.a();
    }

    public static boolean validarDigitoCean(String cean) throws DSGEValidationException {
        a = new CeanHelper();
        return a.validaDigitoCean(cean);
    }

    public static void validarDocumento(String doc, TipoDocumentoEnum tipoDocumentoEnum) throws DSGEValidationException {
        a = new CpfCnpjHelper(doc, tipoDocumentoEnum);
        a.a();
    }

    public static String formatarDocumento(String doc, TipoDocumentoEnum tipoDocumentoEnum) throws DSGEValidationException {
        a = new CpfCnpjHelper(doc, tipoDocumentoEnum);
        return a.c();
    }

    public static String formatarIE(String ie, String uf) {
        if (ie == null || uf == null) {
            return ie;
        }
        if (!ie.matches("[0-9]{1,}")) {
            return ie;
        }
        try {
            a = new InscricaoEstadualHelper(ie, uf);
            return a.a();
        }
        catch (Exception e) {
            return ie;
        }
    }
}

