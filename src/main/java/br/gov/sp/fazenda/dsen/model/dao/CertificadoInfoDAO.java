/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.CertificadoInfoDAO
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificadoInfoDAO
extends DSENBaseDAO {
    private static Log a = LogFactory.getLog(CertificadoInfoDAO.class);

    public List<CertificadoInfoEntity> pesquisarCertificados(EmitenteEntity emitenteEntity) throws DSENDAOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("idEmitente", emitenteEntity.getIdEmitente());
        try {
            return this.selectResultList("CertificadoInfo.findByIdEmitente", map);
        }
        catch (DSGEDAOException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENDAOException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    public int excluirCertificadoPorEmitente(Integer idEmitente) throws DSENDAOException {
        int qtdExcluidos = 0;
        try {
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            map.put("idEmitente", idEmitente);
            qtdExcluidos = super.updateByQuery("CertificadoInfo.deleteByIdEmitente", map);
            a.info((Object)("Quantidade de certificados exclu\u00eddos: " + qtdExcluidos));
            return qtdExcluidos;
        }
        catch (DSGEDAOException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENDAOException((DSGEBaseException)ex, ex.getMessage());
        }
    }
}

