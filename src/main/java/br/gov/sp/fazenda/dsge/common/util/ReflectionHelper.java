/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.util.ReflectionHelper
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/*
 * Exception performing whole class analysis ignored.
 */
public class ReflectionHelper {
    public ReflectionHelper() {
    }

    public static void setFieldValueByReflection(Object to, String fieldName, String fieldValue) throws DSGECommonException {
        try {
            Method method = null;
            Method[] methods = to.getClass().getMethods();
            for (int i = 0; i < methods.length; ++i) {
                Method m = methods[i];
                if (m.getName().equalsIgnoreCase("set" + fieldName)) {
                    method = m;
                    continue;
                }
                if (!m.getName().equalsIgnoreCase("get" + fieldName + "array")) continue;
                method = m;
            }
            if (method == null) {
                throw new DSGECommonException((Throwable)new Exception(), "M\u00e9todo set para campo=" + fieldName + " n\u00e3o encontrado!");
            }
            method = to.getClass().getMethod(method.getName(), String.class);
            if (method == null) {
                throw new DSGECommonException((Throwable)new Exception(), "M\u00e9todo set" + fieldName + "(String) n\u00e3o encontrado!");
            }
            method.setAccessible(true);
            method.invoke(to, fieldValue);
        }
        catch (Throwable t) {
            throw new DSGECommonException(t, t.getMessage());
        }
    }

    public static String getFieldValueByReflection(Object to, String fieldName) throws DSGECommonException {
        Object obj = ReflectionHelper.getFieldByReflection((Object)to, (String)fieldName);
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    public static Object getFieldByReflection(Object to, String fieldName) throws DSGECommonException {
        try {
            Method method = null;
            Method[] methods = to.getClass().getMethods();
            for (int i = 0; i < methods.length; ++i) {
                Method m = methods[i];
                if (m.getParameterTypes().length > 0) continue;
                if (m.getName().equalsIgnoreCase("get" + fieldName)) {
                    method = m;
                    continue;
                }
                if (m.getName().equalsIgnoreCase("is" + fieldName)) {
                    method = m;
                    continue;
                }
                if (!m.getName().equalsIgnoreCase("get" + fieldName + "array")) continue;
                method = m;
            }
            if (method == null) {
                throw new DSGECommonException((Throwable)new Exception(), "M\u00e9todo get" + fieldName + " n\u00e3o encontrado!");
            }
            if (method.getGenericReturnType() == Void.TYPE) {
                return "";
            }
            method.setAccessible(true);
            return method.invoke(to, new Object[0]);
        }
        catch (Throwable t) {
            throw new DSGECommonException(t, t.getMessage());
        }
    }
}

