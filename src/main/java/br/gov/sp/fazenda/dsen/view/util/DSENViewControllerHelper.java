/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.view.util.DSENViewControllerHelper
 *  br.gov.sp.fazenda.dsge.view.exception.DSGEViewException
 *  br.gov.sp.fazenda.dsge.view.util.DSGEViewControllerHelper
 */
package br.gov.sp.fazenda.dsen.view.util;

import br.gov.sp.fazenda.dsge.view.exception.DSGEViewException;
import br.gov.sp.fazenda.dsge.view.util.DSGEViewControllerHelper;
import java.io.InputStream;

public class DSENViewControllerHelper
extends DSGEViewControllerHelper {
    private static DSENViewControllerHelper a = null;

    public static synchronized DSGEViewControllerHelper getInstance() throws DSGEViewException {
        if (a == null) {
            a = new DSENViewControllerHelper();
        }
        return a;
    }

    protected InputStream getViewControllerXMLMapStream() {
        return DSENViewControllerHelper.class.getResourceAsStream(FILE);
    }
}

