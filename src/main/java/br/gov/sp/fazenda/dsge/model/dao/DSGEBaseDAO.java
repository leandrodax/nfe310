/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.model.dao.DSGEBaseDAO
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  javax.persistence.EntityManager
 *  javax.persistence.NoResultException
 *  javax.persistence.Query
 *  org.hibernate.Criteria
 *  org.hibernate.Query
 *  org.hibernate.Session
 *  org.hibernate.criterion.Criterion
 *  org.hibernate.criterion.Example
 *  org.hibernate.criterion.Order
 *  org.hibernate.criterion.Projection
 *  org.hibernate.criterion.Projections
 *  org.hibernate.ejb.EntityManagerImpl
 */
package br.gov.sp.fazenda.dsge.model.dao;

import br.gov.sp.fazenda.dsge.model.dao.util.DSGEDAOHelper;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.ejb.EntityManagerImpl;

public abstract class DSGEBaseDAO {
    protected abstract EntityManager currentSession();

    public void insert(Serializable obj) throws DSGEDAOException {
        try {
            this.currentSession().persist((Object)obj);
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    public void delete(Serializable obj) throws DSGEDAOException {
        try {
            if (!this.currentSession().contains((Object)obj)) {
                Serializable ser = (Serializable)this.currentSession().merge((Object)obj);
                this.currentSession().refresh((Object)ser);
                this.currentSession().remove((Object)ser);
            } else {
                this.currentSession().refresh((Object)obj);
                this.currentSession().remove((Object)obj);
            }
            this.currentSession().flush();
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    public Serializable update(Serializable obj) throws DSGEDAOException {
        try {
            return (Serializable)this.currentSession().merge((Object)obj);
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    protected Serializable selectSingleResult(String namedQuery, Map<String, Object> map) throws DSGEDAOException {
        try {
            Query query = this.currentSession().createNamedQuery(namedQuery);
            if (map != null && !map.isEmpty()) {
                for (String param : map.keySet()) {
                    query.setParameter(param, map.get(param));
                }
            }
            return (Serializable)query.getSingleResult();
        }
        catch (NoResultException e) {
            return null;
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    protected List selectResultList(String namedQuery, Map<String, Object> map) throws DSGEDAOException {
        List list = null;
        try {
            Query query = this.currentSession().createNamedQuery(namedQuery);
            if (map != null) {
                for (String param : map.keySet()) {
                    query.setParameter(param, map.get(param));
                }
            }
            if ((list = query.getResultList()).size() == 0) {
                return null;
            }
            return list;
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    protected List selectByQuery(String queryStr, Map<String, Object> map, Class<?> entityClass) throws DSGEDAOException {
        List list = null;
        try {
            Query query = null;
            query = entityClass != null ? this.currentSession().createNativeQuery(queryStr, entityClass) : this.currentSession().createNativeQuery(queryStr);
            if (map != null) {
                Set<String> keySet = map.keySet();
                for (String key : keySet) {
                    query.setParameter(key, map.get(key));
                }
                list = query.getResultList();
                if (list.size() == 0) {
                    return null;
                }
            }
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
        return list;
    }

    protected int updateByQuery(String namedQuery, Map<String, Object> map) throws DSGEDAOException {
        try {
            Query query = this.currentSession().createNamedQuery(namedQuery);
            for (String key : map.keySet()) {
                query.setParameter(key, map.get(key));
            }
            return query.executeUpdate();
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    protected List<?> selectByCriteria(Serializable serializable) throws DSGEDAOException {
        return this.selectByCriteria(serializable, null, null, -1, -1);
    }

    protected List<?> selectByCriteria(Serializable serializable, List<String> ignoredFields) throws DSGEDAOException {
        return this.selectByCriteria(serializable, ignoredFields, null, -1, -1);
    }

    protected List selectByCriteria(Serializable serializable, List<String> ignoredFields, LinkedHashMap<String, Boolean> sortFieldsMap, int start, int maxResults) throws DSGEDAOException {
        List resultado = null;
        try {
            Criteria criteria = this.criteria(serializable.getClass());
            Example example = this.createExample(serializable);
            if (ignoredFields != null) {
                for (String propriedade : ignoredFields) {
                    example.excludeProperty(propriedade);
                }
            }
            this.addSortFields(criteria, sortFieldsMap);
            this.setFirstMaxResults(criteria, start, maxResults);
            resultado = criteria.add((Criterion)example).list();
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
        return resultado;
    }

    protected void addSortFields(Criteria criteria, LinkedHashMap<String, Boolean> sortFieldsMap) {
        if (sortFieldsMap != null) {
            for (String field : sortFieldsMap.keySet()) {
                Boolean asc = sortFieldsMap.get(field);
                if (asc.booleanValue()) {
                    criteria.addOrder(Order.asc((String)field).ignoreCase());
                    continue;
                }
                criteria.addOrder(Order.desc((String)field).ignoreCase());
            }
        }
    }

    protected void setFirstMaxResults(Criteria criteria, int firstResult, int maxResults) {
        if (firstResult > 0) {
            criteria.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            criteria.setMaxResults(maxResults);
        }
    }

    protected List<?> selectByCriteria(Serializable serializable, List<String> ignoredFields, LinkedHashMap<String, Boolean> sortFieldsMap) throws DSGEDAOException {
        return this.selectByCriteria(serializable, ignoredFields, sortFieldsMap, -1, -1);
    }

    protected Integer getCount(Serializable serializable, List<String> ignoredFields) throws DSGEDAOException {
        List resultado = null;
        try {
            Criteria criteria = this.criteria(serializable.getClass());
            Example example = this.createExample(serializable);
            if (ignoredFields != null) {
                for (String propriedade : ignoredFields) {
                    example.excludeProperty(propriedade);
                }
            }
            resultado = criteria.add((Criterion)example).setProjection(Projections.rowCount()).list();
            return (Integer)resultado.get(0);
        }
        catch (Throwable e) {
            throw new DSGEDAOException(e, e.getMessage());
        }
    }

    protected Criteria criteria(Class<?> serializableClass) {
        Session session = ((EntityManagerImpl)DSGEDAOHelper.currentSession()).getSession();
        return session.createCriteria(serializableClass);
    }

    protected Example createExample(Serializable serializable) {
        return Example.create((Object)serializable).excludeZeroes().ignoreCase().enableLike();
    }

    protected org.hibernate.Query createHibernateNamedQuery(String namedQuery) {
        Session session = ((EntityManagerImpl)this.currentSession()).getSession();
        return session.getNamedQuery(namedQuery);
    }
}

