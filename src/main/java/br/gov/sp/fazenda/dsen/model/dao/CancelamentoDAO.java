/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.CancelamentoDAO
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CancelamentoDAO
extends DSENBaseDAO {
    public CancelamentoEntity pesquisarCancelamentoPorId(Long idCTe) throws DSENDAOException {
        try {
            HashMap<String, Long> parametros = new HashMap<String, Long>();
            parametros.put("findByIdNotaFiscal", idCTe);
            return (CancelamentoEntity)super.selectSingleResult("CancelamentoEntity.findByIdNotaFiscal", parametros);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }
}

