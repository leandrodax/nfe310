/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsen.view.format.UFFormatter
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsen.view.format;

import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.text.ParseException;
import javax.swing.text.DefaultFormatter;

public class UFFormatter
extends DefaultFormatter {
    @Override
    public String valueToString(Object value) throws ParseException {
        String uf = null;
        if (value != null) {
            EstadoTO estadoTO = null;
            try {
                estadoTO = DSENUtilHelper.getInstance().getEstadoTO(value.toString());
            }
            catch (DSGEUtilException e) {
                return null;
            }
            if (estadoTO != null) {
                uf = estadoTO.getSigla();
            }
        }
        return uf;
    }
}

