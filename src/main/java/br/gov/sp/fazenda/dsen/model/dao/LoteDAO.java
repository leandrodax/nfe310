/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.LoteDAO
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.LoteEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  javax.persistence.Query
 *  org.hibernate.Query
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO;
import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.LoteEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;

public class LoteDAO
extends DSENBaseDAO {
    public List<LoteEntity> selectByCNPJEmitenteRetornoProcFalse(String cnpjTransmissao, EmitenteEntity emitenteEntity) throws DSENDAOException {
        try {
            HashMap<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("idEmitente", emitenteEntity.getIdEmitente());
            parametros.put("cnpjTransmissao", cnpjTransmissao);
            parametros.put("retornoProc", Boolean.FALSE);
            return super.selectResultList("LoteEntity.findByCNPJEmitenteRetornoProc", parametros);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public Integer selectCountByCNPJEmitenteRetornoProcFalse(List<String> cnpjTransmissaoLista, EmitenteEntity emitenteEntity) throws DSENDAOException {
        try {
            org.hibernate.Query query = super.createHibernateNamedQuery("LoteEntity.countByCNPJEmitenteRetornoProcFalse");
            query.setParameter("idEmitente", (Object)emitenteEntity);
            query.setParameter("retornoProc", (Object)false);
            query.setParameterList("cnpjTransmissaoLista", cnpjTransmissaoLista);
            List resultado = query.list();
            return (Integer)resultado.get(0);
        }
        catch (Exception e) {
            throw new DSENDAOException((Throwable)e, e.getMessage());
        }
    }

    public List<LoteEntity> selectLoteHistoricoBuscaRetorno(EmitenteEntity emitenteEntity) throws DSENDAOException {
        StringBuffer strQuery = new StringBuffer();
        strQuery.append("SELECT * FROM lote WHERE retorno_proc = '1' AND id_lote in (");
        strQuery.append("SELECT DISTINCT id_lote FROM documento WHERE id_emitente = :idEmitente)");
        Query query = DSENDAOHelper.currentSession().createNativeQuery(strQuery.toString(), LoteEntity.class);
        query.setParameter("idEmitente", (Object)emitenteEntity.getIdEmitente());
        return query.getResultList();
    }

    public List<CertificadoLoteTO> selectCertificadoLote(EmitenteEntity emitenteEntity) {
        StringBuffer strQuery = new StringBuffer();
        strQuery.append("SELECT lote.cnpj_transmissao, COUNT(documento.id_documento) qtd ");
        strQuery.append("FROM lote, documento ");
        strQuery.append("WHERE documento.id_lote = lote.id_lote ");
        strQuery.append("AND lote.retorno_proc = '0' ");
        strQuery.append("AND documento.id_emitente = :idEmitente ");
        strQuery.append("GROUP BY lote.cnpj_transmissao");
        Query query = DSENDAOHelper.currentSession().createNativeQuery(strQuery.toString());
        query.setParameter("idEmitente", (Object)emitenteEntity.getIdEmitente());
        List resultList = query.getResultList();
        ArrayList<CertificadoLoteTO> listaCertificadoLote = null;
        if (resultList != null && resultList.size() > 0) {
            listaCertificadoLote = new ArrayList<CertificadoLoteTO>();
            for (Object[] columns : resultList) {
                CertificadoLoteTO certificadoLoteTO = new CertificadoLoteTO();
                certificadoLoteTO.setCnpjTransmissao((String)columns[0]);
                certificadoLoteTO.setQuantidadeLote((Integer)columns[1]);
                listaCertificadoLote.add(certificadoLoteTO);
            }
        }
        return listaCertificadoLote;
    }
}

