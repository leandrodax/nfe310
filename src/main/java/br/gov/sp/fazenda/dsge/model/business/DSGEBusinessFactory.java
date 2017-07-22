/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.business.DSGEBusinessFactory
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOInterceptorHelper
 *  net.sf.cglib.proxy.Callback
 *  net.sf.cglib.proxy.Enhancer
 */
package br.gov.sp.fazenda.dsge.model.business;

import br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOInterceptorHelper;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

public class DSGEBusinessFactory {
    protected DSGEBusinessFactory() {
    }

    public static Object create(String classe) throws Exception {
        DSGEDAOInterceptorHelper interceptorHelper;
        Object obj = Class.forName(classe).newInstance();
        DSGEDAOInterceptorHelper interceptor = interceptorHelper = new DSGEDAOInterceptorHelper();
        Object object = Enhancer.create(obj.getClass(), (Callback)interceptor);
        return object;
    }
}

