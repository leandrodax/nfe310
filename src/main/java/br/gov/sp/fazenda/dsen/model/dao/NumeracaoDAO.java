/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.NumeracaoTO
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.NumeracaoDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.common.to.NumeracaoTO;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class NumeracaoDAO
extends DSENBaseDAO {
    public NumeracaoTO pesquisarUltimoNumero(EmitenteEntity emitenteEntity) throws DSENDAOException {
        try {
            HashMap<String, EmitenteEntity> parametros = new HashMap<String, EmitenteEntity>();
            parametros.put("idEmitente", emitenteEntity);
            NumeracaoEntity numeracaoEntity = (NumeracaoEntity)this.selectSingleResult("NumeracaoEntity.findLastByEmitente", parametros);
            return DSENBusinessConverter.getNumeracaoTO((NumeracaoEntity)numeracaoEntity);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public NumeracaoEntity pesquisarUltimoNumero(EmitenteEntity emitenteEntity, String serie) throws DSENDAOException {
        try {
            HashMap<String, String> parametros = new HashMap<String, String>();
            parametros.put("serie", serie);
            parametros.put("idEmitente", (String)emitenteEntity);
            return (NumeracaoEntity)this.selectSingleResult("NumeracaoEntity.findLastBySerieEmitente", parametros);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }
}

