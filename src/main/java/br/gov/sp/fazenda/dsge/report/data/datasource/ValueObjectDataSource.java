/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.report.data.ReportData
 *  br.gov.sp.fazenda.dsge.report.data.datasource.BaseReportDataSource
 *  br.gov.sp.fazenda.dsge.report.data.datasource.ValueObjectDataSource
 *  br.gov.sp.fazenda.dsge.report.data.page.PageProvider
 *  br.gov.sp.fazenda.dsge.report.exception.DSGEReportException
 *  net.sf.jasperreports.engine.JRException
 *  net.sf.jasperreports.engine.JRField
 */
package br.gov.sp.fazenda.dsge.report.data.datasource;

import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.report.data.ReportData;
import br.gov.sp.fazenda.dsge.report.data.datasource.BaseReportDataSource;
import br.gov.sp.fazenda.dsge.report.data.page.PageProvider;
import br.gov.sp.fazenda.dsge.report.exception.DSGEReportException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class ValueObjectDataSource
extends BaseReportDataSource {
    public ValueObjectDataSource(ReportData reportData, Map parameters) throws DSGEReportException {
        this(reportData, parameters, true);
    }

    public ValueObjectDataSource(ReportData reportData, Map parameters, boolean initialize) throws DSGEReportException {
        this.setReportData(reportData);
        this.setRequestParameters(parameters);
        if (initialize) {
            this.a();
            this.setInitialized(true);
        }
    }

    public ValueObjectDataSource(PageProvider pageProvider) throws DSGEReportException {
        this(pageProvider, true);
    }

    public ValueObjectDataSource(PageProvider pageProvider, boolean initialize) throws DSGEReportException {
        this.setPageProvider(pageProvider);
        if (initialize) {
            this.b();
            this.setInitialized(true);
        }
    }

    public boolean next() throws JRException {
        boolean result = false;
        try {
            if (!this.isInitialized()) {
                this.c();
            }
            result = this.getIterator().hasNext() || this.isPageMode() && this.hasNextPage();
        }
        catch (DSGEReportException e) {
            throw new JRException("Error: " + this.getClass().getName() + ".next() ", (Throwable)e);
        }
        if (result) {
            this.setCurrentBean(this.getIterator().next());
        }
        return result;
    }

    public Object getFieldValue(JRField jrField) throws JRException {
        String fieldName = jrField.getName();
        Object result = jrField.getName().equalsIgnoreCase("object") ? this.getCurrentBean() : this.a(jrField);
        return result;
    }

    private Object a(JRField jrField) throws JRException {
        Object value;
        Class beanClass = this.getCurrentBean().getClass();
        String fieldName = jrField.getName();
        fieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        String methodName = "get" + fieldName;
        Method method = null;
        try {
            method = beanClass.getMethod(methodName, null);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        if (method == null && jrField.getValueClass() == Boolean.class) {
            try {
                methodName = "is" + fieldName;
                method = beanClass.getMethod(methodName, null);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                // empty catch block
            }
        }
        if (method == null) {
            throw new JRException("Property getter method not found in bean for the field : " + fieldName);
        }
        try {
            value = method.invoke(this.getCurrentBean(), null);
        }
        catch (Exception e) {
            throw new JRException("Error retrieving field value from bean : " + methodName, (Throwable)e);
        }
        return value;
    }

    private void a() throws DSGEReportException {
        Collection list = this.getReportData().getData(this.getRequestParameters());
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.setEmpty(list.isEmpty());
        this.setIterator(list.iterator());
    }

    private void a(Collection list) throws DSGEReportException {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.setEmpty(list.isEmpty());
        this.setIterator(list.iterator());
        this.setInitialized(true);
    }

    private void b() throws DSGEReportException {
        this.setEmpty(!this.hasNextPage());
    }

    private void c() throws DSGEReportException {
        try {
            if (this.isPageMode()) {
                this.b();
            } else {
                this.a();
            }
            this.setInitialized(true);
        }
        catch (DSGEReportException e) {
            throw new DSGEReportException((DSGEBaseException)e, "Error in ValueObjectDataSource.processDataSource(): ");
        }
    }

    public ValueObjectDataSource addParameter(String name, Object value) {
        if (this.isPageMode()) {
            this.getPageProvider().addParameter(name, value);
        } else {
            this.getRequestParameters().put(name, value);
        }
        this.setInitialized(false);
        return this;
    }
}

