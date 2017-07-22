/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  org.apache.commons.beanutils.PropertyUtils
 */
package br.gov.sp.fazenda.dsge.common.to;

import br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.beanutils.PropertyUtils;

public abstract class BaseTO
implements Serializable,
Cloneable {
    private List<String> errors;
    private List<String> messages;
    private Boolean marcado = Boolean.FALSE;
    private QuestionEnum questionEnum;
    private String nomeArquivoXml;
    public static String FIELD_MARCADO = "marcado";

    public void setMarcado(Boolean marcado) {
        this.marcado = marcado;
    }

    public Boolean getMarcado() {
        return this.marcado;
    }

    public void addError(String error) {
        if (this.errors == null) {
            this.errors = new ArrayList();
        }
        this.messages = null;
        this.errors.add(error);
    }

    public void addMessage(String message) {
        if (this.messages == null) {
            this.messages = new ArrayList();
        }
        this.errors = null;
        this.messages.add(message);
    }

    public List<String> getErrors() {
        return this.errors;
    }

    public List<String> getMessages() {
        return this.messages;
    }

    public boolean hasErrors() {
        return this.errors != null && this.errors.size() > 0;
    }

    public boolean hasMessages() {
        return this.messages != null && this.messages.size() > 0;
    }

    public String getMessagesString() {
        if (!this.hasMessages()) {
            return "";
        }
        StringBuilder s = new StringBuilder("");
        for (String m : this.messages) {
            s.append(m);
            s.append(',');
        }
        return s.substring(0, s.length() - 1);
    }

    public String getErrorsString() {
        if (!this.hasErrors()) {
            return "";
        }
        StringBuilder s = new StringBuilder("");
        for (String e : this.errors) {
            s.append(e);
            s.append(',');
        }
        return s.substring(0, s.length() - 1);
    }

    public void setValueAt(String field, Object value) {
        try {
            PropertyUtils.setProperty((Object)this, (String)field, (Object)value);
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            // empty catch block
        }
    }

    public Object getValueAt(String field) {
        Object value = null;
        Method method = null;
        field = field.substring(0, 1).toUpperCase() + field.substring(1);
        try {
            method = this.getClass().getMethod("get" + field, new Class[0]);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        if (method == null) {
            try {
                method = this.getClass().getMethod("is" + field, new Class[0]);
            }
            catch (Throwable e) {
                e.printStackTrace();
            }
        }
        try {
            value = method.invoke((Object)this, new Object[0]);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        return value;
    }

    public Class getFieldType(String field) {
        Method method = null;
        field = field.substring(0, 1).toUpperCase() + field.substring(1);
        try {
            method = this.getClass().getMethod("get" + field, new Class[0]);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (method == null) {
            try {
                method = this.getClass().getMethod("is" + field, new Class[0]);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        try {
            return method.getReturnType();
        }
        catch (Throwable throwable) {
            return Object.class;
        }
    }

    public void clearMessages() {
        this.messages = null;
    }

    public void clearErrors() {
        this.errors = null;
    }

    public QuestionEnum getQuestionEnum() {
        return this.questionEnum;
    }

    public void setQuestionEnum(QuestionEnum questionEnum) {
        this.questionEnum = questionEnum;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getNomeArquivoXml() {
        return this.nomeArquivoXml;
    }

    public void setNomeArquivoXml(String nomeArquivoXml) {
        this.nomeArquivoXml = nomeArquivoXml;
    }
}

