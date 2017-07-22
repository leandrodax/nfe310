/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.business.util.DSGEBusinessInterceptor
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOInterceptorHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEBusinessException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  javax.persistence.EntityTransaction
 *  net.sf.cglib.proxy.MethodProxy
 */
package br.gov.sp.fazenda.dsge.model.dao.util;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.business.util.DSGEBusinessInterceptor;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEBusinessException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import javax.persistence.EntityTransaction;
import net.sf.cglib.proxy.MethodProxy;

public class DSGEDAOInterceptorHelper
extends DSGEBusinessInterceptor {
    static Boolean a = true;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result;
        block9 : {
            result = null;
            boolean isAnnotedtedTransaction = false;
            EntityTransaction interceptTransaction = null;
            try {
                isAnnotedtedTransaction = this.isTransactional(object, method);
            }
            catch (Exception e) {
                e.printStackTrace();
                throw new DSGEBusinessException((Throwable)e, e.getMessage());
            }
            if (isAnnotedtedTransaction) {
                try {
                    Boolean e = a;
                    synchronized (e) {
                        interceptTransaction = DSGEDAOHelper.beginTransaction();
                        result = methodProxy.invokeSuper(object, args);
                        DSGEDAOHelper.commitTransaction((EntityTransaction)interceptTransaction);
                        break block9;
                    }
                }
                catch (DSGEDAOException e) {
                    this.a(interceptTransaction, (Throwable)e, 8);
                    throw new DSGEBusinessException((DSGEBaseException)e, e.getMessage());
                }
                catch (Throwable t) {
                    this.a(interceptTransaction, t, 7);
                    throw new DSGEBusinessException(t, t.getMessage());
                }
            }
            result = methodProxy.invokeSuper(object, args);
        }
        return result;
    }

    public boolean isTransactional(Object object, Method method) throws Exception {
        DSGETransaction annotation = method.getAnnotation(DSGETransaction.class);
        return annotation != null;
    }

    private void a(EntityTransaction interceptTransaction, Throwable throwable, int step) throws DSGEBusinessException {
        throwable.printStackTrace();
        try {
            DSGEDAOHelper.rollbackTransaction((EntityTransaction)interceptTransaction);
        }
        catch (DSGEDAOException e) {
            e.printStackTrace();
            throw new DSGEBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }
}

