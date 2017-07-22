/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.ProdutoDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGEFunctionOrder
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.hibernate.Criteria
 *  org.hibernate.criterion.Criterion
 *  org.hibernate.criterion.Example
 *  org.hibernate.criterion.Order
 *  org.hibernate.criterion.Projection
 *  org.hibernate.criterion.Projections
 *  org.hibernate.criterion.Restrictions
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGEFunctionOrder;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ProdutoDAO
extends DSENBaseDAO {
    public List<ProdutoEntity> selectProduto(ProdutoEntity produtoEntity, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENDAOException {
        this.a(produtoEntity);
        Criteria criteria = this.criteria(ProdutoEntity.class);
        Example example = this.createExample((Serializable)produtoEntity);
        criteria.add((Criterion)example);
        criteria.add((Criterion)Restrictions.eq((String)"idEmitente", (Object)produtoEntity.getIdEmitente()));
        this.addSortFields(criteria, sortColumns);
        this.setFirstMaxResults(criteria, start, maxResults);
        List produtoList = criteria.list();
        if (produtoList != null && produtoList.isEmpty()) {
            return null;
        }
        return produtoList;
    }

    protected void addSortFields(Criteria criteria, LinkedHashMap<String, Boolean> sortFieldsMap) {
        if (sortFieldsMap != null) {
            for (String field : sortFieldsMap.keySet()) {
                Boolean asc = sortFieldsMap.get(field);
                if (asc.booleanValue()) {
                    if (field.equals("vProd")) {
                        criteria.addOrder((Order)new DSGEFunctionOrder("double", field, true, false));
                        continue;
                    }
                    criteria.addOrder(Order.asc((String)field).ignoreCase());
                    continue;
                }
                if (field.equals("vProd")) {
                    criteria.addOrder((Order)new DSGEFunctionOrder("double", field, false, false));
                    continue;
                }
                criteria.addOrder(Order.desc((String)field).ignoreCase());
            }
        }
    }

    public ProdutoEntity selectByProduto(ProdutoEntity produtoEntity) throws DSENDAOException {
        try {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("cProd", produtoEntity.getCProd());
            map.put("idEmitente", (String)produtoEntity.getIdEmitente());
            return (ProdutoEntity)this.selectSingleResult("ProdutoEntity.findByCProd", map);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public Integer getCountProduto(ProdutoEntity produtoEntity) throws DSENDAOException {
        this.a(produtoEntity);
        Criteria criteria = this.criteria(ProdutoEntity.class);
        Example example = this.createExample((Serializable)produtoEntity);
        criteria.add((Criterion)example);
        criteria.add((Criterion)Restrictions.eq((String)"idEmitente", (Object)produtoEntity.getIdEmitente()));
        List resultado = criteria.add((Criterion)example).setProjection(Projections.rowCount()).list();
        return (Integer)resultado.get(0);
    }

    private void a(ProdutoEntity produtoEntity) {
        String cProd = produtoEntity.getCProd();
        String xNome = produtoEntity.getXProd();
        produtoEntity.setCProd(cProd != null ? cProd + "%" : null);
        produtoEntity.setXProd(xNome != null ? "%" + xNome + "%" : null);
    }
}

