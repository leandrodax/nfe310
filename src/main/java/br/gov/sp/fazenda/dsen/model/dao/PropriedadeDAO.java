/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.PropriedadeDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum;
import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class PropriedadeDAO
extends DSENBaseDAO {
    public PropriedadeEntity selectByEmitenteAndPropriedadeEnum(PropriedadeEntity propriedadeEntity) throws DSENDAOException {
        try {
            HashMap<String, Integer> parametros = new HashMap<String, Integer>();
            parametros.put("idEmitente", propriedadeEntity.getIdEmitente().getIdEmitente());
            parametros.put("propriedadeEnum", (Integer)propriedadeEntity.getPropriedadeEnum());
            return (PropriedadeEntity)super.selectSingleResult("PropriedadeEntity.findByEmitenteAndPropriedadeEnum", parametros);
        }
        catch (Exception e) {
            throw new DSENDAOException((Throwable)e, e.getMessage());
        }
    }
}

