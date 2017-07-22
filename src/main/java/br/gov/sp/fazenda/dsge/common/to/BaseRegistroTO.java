/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.BaseRegistroTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsge.common.to;

import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public abstract class BaseRegistroTO
extends BaseTO {
    private static final String SEPARADOR_ARQ_TXT = "|";

    public abstract void fillFields(String[] var1);

    protected void fillFields(String[] registroArray, Map mapFieldsPosition) {
        try {
            for (String fieldName : mapFieldsPosition.keySet()) {
                Method method = this.getClass().getDeclaredMethod("set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1), String.class);
                if (method.getGenericReturnType() != Void.TYPE) continue;
                String fieldValue = null;
                if ((Integer)mapFieldsPosition.get(fieldName) < registroArray.length && (fieldValue = registroArray[(Integer)mapFieldsPosition.get(fieldName)]) != null && fieldValue.length() <= 0) continue;
                try {
                    method.setAccessible(true);
                    method.invoke((Object)this, fieldValue);
                }
                catch (InvocationTargetException x) {
                    Throwable cause = x.getCause();
                    System.err.format("invocation of %s failed: %s%n", method.getName(), cause.getMessage());
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected String toString(Map mapFieldsPosition) {
        StringBuffer retorno = new StringBuffer();
        int i = 0;
        try {
            for (String fieldName : mapFieldsPosition.keySet()) {
                Method method = this.getClass().getMethod("get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1), new Class[0]);
                Object o = method.invoke((Object)this, new Object[0]);
                if (o instanceof String) {
                    String str = o != null ? (String)o : "";
                    str = str.replaceAll("[|]", "!").replaceAll("[\r]", "").replaceAll("[\n]", " ");
                    retorno.append(str);
                }
                retorno.append(i < mapFieldsPosition.size() - 1 ? "|" : "");
                ++i;
            }
            retorno.append("\r\n");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return retorno.toString();
    }

    public String getTipoRegistro() {
        return null;
    }
}

