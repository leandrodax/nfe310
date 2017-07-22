/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.ParametroDAO
 *  br.gov.sp.fazenda.dsen.model.entity.ParametrosEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.ParametrosEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.util.List;
import java.util.Map;

public class ParametroDAO
extends DSENBaseDAO {
    public List<ParametrosEntity> selectParametros() throws DSENDAOException {
        try {
            return this.selectResultList("ParametrosEntity.findAll", null);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }
}

