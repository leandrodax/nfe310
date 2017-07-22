/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.view.format.ChaveAcessoFormatter
 */
package br.gov.sp.fazenda.dsen.view.format;

import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import java.text.ParseException;
import javax.swing.text.DefaultFormatter;

public class ChaveAcessoFormatter
extends DefaultFormatter {
    private static final long a = -4638872021730293963L;

    @Override
    public String valueToString(Object value) throws ParseException {
        return ChaveAcessoUtil.formatarChaveAcesso4x4((String)value.toString());
    }
}

