/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTOList
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.ParametroEnum;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.ArrayList;
import java.util.List;

public class ParametroTOList
extends ArrayList<ParametroTO> {
    private static final long a = -5961375400583784883L;

    public String getValue(ParametroEnum parametrosEnum) {
        String value = "";
        for (ParametroTO parametro : this) {
            if (parametro.getParametrosEnum() != parametrosEnum) continue;
            value = parametro.getValor();
            break;
        }
        return value;
    }

    public List<BaseTO> getErros() {
        ArrayList<BaseTO> listaErros = new ArrayList<BaseTO>();
        for (ParametroTO parametro : this) {
            if (parametro.getErrors() == null || parametro.getErrors().isEmpty()) continue;
            listaErros.add((BaseTO)parametro);
        }
        return listaErros;
    }
}

