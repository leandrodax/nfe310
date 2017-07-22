/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cnpj
 *  br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cpf
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.util.CpfCnpjHelper
 *  br.gov.sp.fazenda.dsge.common.util.CpfCnpjHelper$1
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cnpj;
import br.gov.sp.fazenda.dsge.brazilutils.cpfcnpj.Cpf;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.util.CpfCnpjHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class CpfCnpjHelper {
    private Cnpj a;
    private Cpf a;
    private TipoDocumentoEnum a;

    public CpfCnpjHelper(String numero, TipoDocumentoEnum tipoDocumentoEnum) throws DSGEValidationException {
        switch (1.a[tipoDocumentoEnum.ordinal()]) {
            case 1: {
                try {
                    this.a = new Cnpj(numero);
                    this.a = TipoDocumentoEnum.CNPJ;
                    break;
                }
                catch (ValidationException e) {
                    throw new DSGEValidationException((Throwable)e, e.getMessage());
                }
            }
            case 2: {
                try {
                    this.a = new Cpf(numero);
                    this.a = TipoDocumentoEnum.CPF;
                    break;
                }
                catch (ValidationException e) {
                    throw new DSGEValidationException((Throwable)e, e.getMessage());
                }
            }
        }
    }

    public String a() {
        String strNumero = null;
        if (this.a.equals((Object)TipoDocumentoEnum.CNPJ)) {
            strNumero = this.a.getCpfCnpj();
        } else if (this.a.equals((Object)TipoDocumentoEnum.CPF)) {
            strNumero = this.a.getCpfCnpj();
        }
        return strNumero;
    }

    public String b() {
        String strNumero = null;
        if (this.a.equals((Object)TipoDocumentoEnum.CNPJ)) {
            strNumero = this.a.getNumber();
        } else if (this.a.equals((Object)TipoDocumentoEnum.CPF)) {
            strNumero = this.a.getNumber();
        }
        return strNumero;
    }

    public void a() throws DSGEValidationException {
        try {
            if (this.a.equals((Object)TipoDocumentoEnum.CNPJ)) {
                this.a.validate();
                if (StringHelper.isRepeated((String)this.a.getNumber())) {
                    throw new DSGEValidationException(null, "");
                }
            } else if (this.a.equals((Object)TipoDocumentoEnum.CPF)) {
                this.a.validate();
                if (StringHelper.isRepeated((String)this.a.getNumber())) {
                    throw new DSGEValidationException(null, "");
                }
            }
        }
        catch (ValidationException e) {
            throw new DSGEValidationException((Throwable)e, e.getMessage());
        }
    }

    public String c() {
        String strDocumento = null;
        if (this.a.equals((Object)TipoDocumentoEnum.CNPJ)) {
            strDocumento = StringHelper.cnpjFormat((String)this.a.getNumber());
        } else if (this.a.equals((Object)TipoDocumentoEnum.CPF)) {
            strDocumento = StringHelper.cpfFormat((String)this.a.getNumber());
        }
        return strDocumento;
    }
}

