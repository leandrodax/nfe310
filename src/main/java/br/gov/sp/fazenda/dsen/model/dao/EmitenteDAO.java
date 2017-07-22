/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.EmitenteDAO
 *  br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.LoteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 *  org.hibernate.Criteria
 *  org.hibernate.criterion.Criterion
 *  org.hibernate.criterion.Restrictions
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.LoteEntity;
import br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity;
import br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class EmitenteDAO
extends DSENBaseDAO {
    private static Log a = LogFactory.getLog(EmitenteDAO.class);

    public EmitenteEntity selectByNrDocumento(EmitenteEntity emitenteEntity) throws DSENDAOException {
        try {
            HashMap<String, String> param = new HashMap<String, String>();
            param.put("nrDocumento", emitenteEntity.getNrDocumento());
            return (EmitenteEntity)this.selectSingleResult("EmitenteEntity.findByNrDocumento", param);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public EmitenteEntity selectFullByNrDocumento(EmitenteEntity emitenteToFind) throws DSENDAOException {
        try {
            Criteria criteria = this.criteria(emitenteToFind.getClass());
            criteria.add((Criterion)Restrictions.eq((String)"nrDocumento", (Object)emitenteToFind.getNrDocumento()));
            EmitenteEntity emitente = (EmitenteEntity)criteria.uniqueResult();
            if (emitente != null) {
                Set nfesSet;
                Set produtosSet;
                if (emitente.getPesquisaEntitySet() != null) {
                    emitente.getPesquisaEntitySet().size();
                    a.debug((Object)("<> getPesquisaEntitySet().size: " + emitente.getPesquisaEntitySet().size()));
                }
                if (emitente.getClienteEntitySet() != null) {
                    emitente.getClienteEntitySet().size();
                    a.debug((Object)("<> getClienteEntitySet().size: " + emitente.getClienteEntitySet().size()));
                }
                if (emitente.getPropriedadeEntitySet() != null) {
                    emitente.getPropriedadeEntitySet().size();
                    a.debug((Object)("<> getPropriedadeEntitySet().size: " + emitente.getPropriedadeEntitySet().size()));
                }
                if (emitente.getCertificadoInfoEntitySet() != null) {
                    emitente.getCertificadoInfoEntitySet().size();
                    a.debug((Object)("<> getCertificadoInfoEntitySet().size: " + emitente.getCertificadoInfoEntitySet().size()));
                }
                if (emitente.getTransportadoraEntitySet() != null) {
                    emitente.getTransportadoraEntitySet().size();
                    a.debug((Object)("<> getTransportadoraEntitySet().size: " + emitente.getTransportadoraEntitySet().size()));
                }
                if ((produtosSet = emitente.getProdutoEntitySet()) != null) {
                    a.debug((Object)("<> getProdutoEntitySet().size: " + emitente.getProdutoEntitySet().size()));
                    for (ProdutoEntity prod : produtosSet) {
                        if (prod.getIcmsEntitySet() != null) {
                            prod.getIcmsEntitySet().size();
                            a.debug((Object)("<> getIcmsEntitySet().size: " + prod.getIcmsEntitySet().size()));
                        }
                        if (prod.getIpiEntitySet() == null) continue;
                        prod.getIpiEntitySet().size();
                        a.debug((Object)("<> getIpiEntitySet().size: " + prod.getIpiEntitySet().size()));
                    }
                }
                if ((nfesSet = emitente.getNotaFiscalEntitySet()) != null) {
                    a.debug((Object)("<> getNotaFiscalEntitySet().size: " + emitente.getNotaFiscalEntitySet().size()));
                    for (NotaFiscalEntity nfe : nfesSet) {
                        if (nfe.getCancelamentoEntity() != null) {
                            nfe.getCancelamentoEntity().getIdNotaFiscal();
                        }
                        if (nfe.getLoteEntity() != null) {
                            nfe.getLoteEntity().getIdLote();
                        }
                        if (nfe.getEventoEntitySet() == null) continue;
                        nfe.getEventoEntitySet().size();
                        a.debug((Object)("<> getEventoEntitySet().size: " + nfe.getEventoEntitySet().size()));
                    }
                }
                if (emitente.getNumeracaoEntitySet() != null) {
                    emitente.getNumeracaoEntitySet().size();
                    a.debug((Object)("<> getNumeracaoEntitySet().size: " + emitente.getNumeracaoEntitySet().size()));
                }
                if (emitente.getInutilizacaoEntitySet() != null) {
                    emitente.getInutilizacaoEntitySet().size();
                    a.debug((Object)("<> getInutilizacaoEntitySet().size: " + emitente.getInutilizacaoEntitySet().size()));
                }
            }
            return emitente;
        }
        catch (Throwable e) {
            throw new DSENDAOException(e, e.getMessage());
        }
    }

    public List<EmitenteEntity> selectEmitente(EmitenteEntity emitenteEntity, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENDAOException {
        try {
            this.a(emitenteEntity);
            ArrayList<String> listaPropriedades = new ArrayList<String>();
            listaPropriedades.add("logotipo");
            return this.selectByCriteria((Serializable)emitenteEntity, listaPropriedades, sortColumns, start, maxResults);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    private void a(EmitenteEntity emitenteEntity) {
        String xNome = emitenteEntity.getXNome() != null ? emitenteEntity.getXNome() : null;
        String nrDocumento = emitenteEntity.getNrDocumento() != null ? emitenteEntity.getNrDocumento().toString() : null;
        String iE = emitenteEntity.getIe() != null ? emitenteEntity.getIe().toString() : null;
        emitenteEntity.setXNome(xNome != null ? "%" + xNome + "%" : null);
        emitenteEntity.setNrDocumento(nrDocumento != null ? nrDocumento + "%" : null);
        emitenteEntity.setIe(iE != null ? iE + "%" : null);
    }

    public Integer getCountEmitente(EmitenteEntity emitenteEntity) throws DSENDAOException {
        try {
            this.a(emitenteEntity);
            ArrayList<String> listaPropriedades = new ArrayList<String>();
            listaPropriedades.add("logotipo");
            return this.getCount((Serializable)emitenteEntity, listaPropriedades);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }
}

