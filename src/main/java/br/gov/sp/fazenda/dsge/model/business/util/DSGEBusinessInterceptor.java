/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGEBusinessInterceptor
 *  net.sf.cglib.proxy.MethodInterceptor
 *  net.sf.cglib.proxy.MethodProxy
 */
package br.gov.sp.fazenda.dsge.model.business.util;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public abstract class DSGEBusinessInterceptor
implements MethodInterceptor {
    public abstract Object intercept(Object var1, Method var2, Object[] var3, MethodProxy var4) throws Throwable;
}

