/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.ClienteDAO
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.entity.ClienteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
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
import br.gov.sp.fazenda.dsen.model.entity.ClienteEntity;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
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

public class ClienteDAO
extends DSENBaseDAO {
    public ClienteEntity selectByNrDocumento(ClienteEntity clienteEntity) throws DSENDAOException {
        try {
            if (StringHelper.isBlankOrNull((Object)clienteEntity.getNrDocumento())) {
                return null;
            }
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("nrDocumento", clienteEntity.getNrDocumento());
            map.put("idEmitente", (String)clienteEntity.getIdEmitente());
            return (ClienteEntity)this.selectSingleResult("ClienteEntity.findByNrDocumento", map);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public ClienteEntity selectByNrDocumentoIE(ClienteEntity clienteEntity) throws DSENDAOException {
        try {
            boolean ieNull = false;
            if (StringHelper.isBlankOrNull((Object)clienteEntity.getNrDocumento())) {
                return null;
            }
            HashMap<String, String> map = new HashMap<String, String>();
            if (StringHelper.isBlankOrNull((Object)clienteEntity.getIe())) {
                ieNull = true;
            } else {
                map.put("ie", clienteEntity.getIe());
            }
            map.put("nrDocumento", clienteEntity.getNrDocumento());
            map.put("idEmitente", (String)clienteEntity.getIdEmitente());
            if (ieNull) {
                return (ClienteEntity)this.selectResultList("ClienteEntity.findByNrDocumentoIENull", map).get(0);
            }
            return (ClienteEntity)this.selectSingleResult("ClienteEntity.findByNrDocumentoIE", map);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public List<ClienteEntity> selectCliente(ClienteEntity clienteEntity, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENDAOException {
        this.a(clienteEntity);
        Criteria criteria = this.criteria(ClienteEntity.class);
        Example example = this.createExample((Serializable)clienteEntity);
        criteria.add((Criterion)example);
        criteria.add((Criterion)Restrictions.eq((String)"idEmitente", (Object)clienteEntity.getIdEmitente()));
        this.addSortFields(criteria, sortColumns);
        this.setFirstMaxResults(criteria, start, maxResults);
        List clienteList = criteria.list();
        if (clienteList != null && clienteList.isEmpty()) {
            return null;
        }
        return clienteList;
    }

    public Integer getCountCliente(ClienteEntity clienteEntity) throws DSENDAOException {
        this.a(clienteEntity);
        Criteria criteria = this.criteria(ClienteEntity.class);
        Example example = this.createExample((Serializable)clienteEntity);
        criteria.add((Criterion)example);
        criteria.add((Criterion)Restrictions.eq((String)"idEmitente", (Object)clienteEntity.getIdEmitente()));
        List resultado = criteria.add((Criterion)example).setProjection(Projections.rowCount()).list();
        return (Integer)resultado.get(0);
    }

    private void a(ClienteEntity clienteEntity) {
        String nrDocumento = clienteEntity.getNrDocumento();
        String ie = clienteEntity.getIe();
        String xNome = clienteEntity.getXNome();
        clienteEntity.setNrDocumento(nrDocumento != null ? nrDocumento + "%" : null);
        clienteEntity.setIe(ie != null ? ie + "%" : null);
        clienteEntity.setXNome(xNome != null ? "%" + xNome + "%" : null);
    }
}

