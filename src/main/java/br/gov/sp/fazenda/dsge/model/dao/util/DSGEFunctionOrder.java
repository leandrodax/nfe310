/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEFunctionOrder
 *  org.hibernate.Criteria
 *  org.hibernate.HibernateException
 *  org.hibernate.criterion.CriteriaQuery
 *  org.hibernate.criterion.Order
 *  org.hibernate.dialect.Dialect
 *  org.hibernate.engine.Mapping
 *  org.hibernate.engine.SessionFactoryImplementor
 *  org.hibernate.type.Type
 */
package br.gov.sp.fazenda.dsge.model.dao.util;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Order;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.Mapping;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.type.Type;

public class DSGEFunctionOrder
extends Order {
    private static final long a = -539732655053568740L;
    private boolean a;
    private boolean b;
    private String a;
    private String b;

    public DSGEFunctionOrder(String functionName, String propertyName, boolean ascending, boolean ignoreCase) {
        super(null, true);
        this.b = functionName;
        this.a = ascending;
        this.b = ignoreCase;
        this.a = propertyName;
    }

    public String toSqlString(Criteria criteria, CriteriaQuery criteriaQuery) throws HibernateException {
        String[] columns = criteriaQuery.getColumnsUsingProjection(criteria, this.a);
        Type type = criteriaQuery.getTypeUsingProjection(criteria, this.a);
        StringBuffer fragment = new StringBuffer();
        for (int i = 0; i < columns.length; ++i) {
            boolean lower;
            SessionFactoryImplementor factory = criteriaQuery.getFactory();
            boolean bl = lower = this.b && type.sqlTypes((Mapping)factory)[i] == 12;
            if (lower) {
                fragment.append(factory.getDialect().getLowercaseFunction()).append('(');
            }
            fragment.append(this.b + "(" + columns[i] + ")");
            if (lower) {
                fragment.append(')');
            }
            fragment.append(this.a ? " asc" : " desc");
            if (i >= columns.length - 1) continue;
            fragment.append(", ");
        }
        return fragment.toString();
    }
}

