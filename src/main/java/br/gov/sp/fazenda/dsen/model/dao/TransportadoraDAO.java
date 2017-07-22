/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.TransportadoraDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.hibernate.Criteria
 *  org.hibernate.criterion.Criterion
 *  org.hibernate.criterion.Example
 *  org.hibernate.criterion.Projection
 *  org.hibernate.criterion.Projections
 *  org.hibernate.criterion.Restrictions
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TransportadoraDAO
extends DSENBaseDAO {
    public TransportadoraEntity selectByNrDocumento(TransportadoraEntity transportadoraEntity) throws DSENDAOException {
        try {
            if (StringHelper.isBlankOrNull((Object)transportadoraEntity.getNrDocumento())) {
                return null;
            }
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("nrDocumento", transportadoraEntity.getNrDocumento());
            map.put("idEmitente", (String)transportadoraEntity.getIdEmitente());
            return (TransportadoraEntity)this.selectSingleResult("TransportadoraEntity.findByNrDocumento", map);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public List<TransportadoraEntity> selectTransportadora(TransportadoraEntity transportadoraEntity, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENDAOException {
        this.a(transportadoraEntity);
        Criteria criteria = this.criteria(TransportadoraEntity.class);
        Example example = this.createExample((Serializable)transportadoraEntity);
        criteria.add((Criterion)example);
        criteria.add((Criterion)Restrictions.eq((String)"idEmitente", (Object)transportadoraEntity.getIdEmitente()));
        this.addSortFields(criteria, sortColumns);
        this.setFirstMaxResults(criteria, start, maxResults);
        List transportadoraList = criteria.list();
        if (transportadoraList != null && transportadoraList.isEmpty()) {
            return null;
        }
        return transportadoraList;
    }

    public Integer getCountTransportadora(TransportadoraEntity transportadoraEntity) throws DSENDAOException {
        this.a(transportadoraEntity);
        Criteria criteria = this.criteria(TransportadoraEntity.class);
        Example example = this.createExample((Serializable)transportadoraEntity);
        criteria.add((Criterion)example);
        criteria.add((Criterion)Restrictions.eq((String)"idEmitente", (Object)transportadoraEntity.getIdEmitente()));
        List resultado = criteria.add((Criterion)example).setProjection(Projections.rowCount()).list();
        return (Integer)resultado.get(0);
    }

    private void a(TransportadoraEntity transportadoraEntity) {
        String nrDocumento = transportadoraEntity.getNrDocumento();
        String ie = transportadoraEntity.getIe();
        String xNome = transportadoraEntity.getXNome();
        transportadoraEntity.setNrDocumento(nrDocumento != null ? nrDocumento + "%" : null);
        transportadoraEntity.setIe(ie != null ? ie + "%" : null);
        transportadoraEntity.setXNome(xNome != null ? "%" + xNome + "%" : null);
    }
}

