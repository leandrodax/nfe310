/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaNotaFiscalEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.NotaFiscalDAO
 *  br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  javax.persistence.Query
 *  org.hibernate.Criteria
 *  org.hibernate.criterion.Criterion
 *  org.hibernate.criterion.Example
 *  org.hibernate.criterion.MatchMode
 *  org.hibernate.criterion.Order
 *  org.hibernate.criterion.Projection
 *  org.hibernate.criterion.Projections
 *  org.hibernate.criterion.Restrictions
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaNotaFiscalEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.dao.util.DSENDAOHelper;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity;
import br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class NotaFiscalDAO
extends DSENBaseDAO {
    public List<NotaFiscalEntity> pesquisar(List<PesquisaEntity> filtro, OrdenacaoTO ordenacaoTO) throws DSENDAOException {
        try {
            Criteria criteria = this.a(filtro);
            if (ordenacaoTO.getSortColumns() != null && !ordenacaoTO.getSortColumns().isEmpty()) {
                this.addSortFields(criteria, ordenacaoTO.getSortColumns());
            } else {
                criteria.addOrder(Order.asc((String)"serie")).addOrder(Order.asc((String)"numero"));
            }
            this.setFirstMaxResults(criteria, ordenacaoTO.getStart(), ordenacaoTO.getMaxResults());
            return criteria.list();
        }
        catch (Exception e) {
            throw new DSENDAOException((Throwable)e, e.getMessage());
        }
    }

    public int getCountNotaFiscal(List<PesquisaEntity> filtro) throws DSENDAOException {
        try {
            Criteria criteria = this.a(filtro);
            List resultado = criteria.setProjection(Projections.rowCount()).list();
            return (Integer)resultado.get(0);
        }
        catch (Throwable e) {
            throw new DSENDAOException(e, e.getMessage());
        }
    }

    private Criteria a(List<PesquisaEntity> filtro) throws DSENDAOException {
        Criteria criteria = this.criteria(NotaFiscalEntity.class);
        boolean emitenteSetado = false;
        String docDest = null;
        for (PesquisaEntity element : filtro) {
            if (!emitenteSetado) {
                criteria.add((Criterion)Restrictions.eq((String)"emitenteEntity", (Object)element.getIdEmitente()));
                emitenteSetado = true;
            }
            if (element.getValor() == null) continue;
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.DATA_INI.ordinal()) {
                criteria.add((Criterion)Restrictions.ge((String)"dataEmissao", (Object)DateHelper.getDateTime((String)element.getValor(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT)));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.DATA_FIM.ordinal()) {
                criteria.add((Criterion)Restrictions.le((String)"dataEmissao", (Object)DateHelper.getDateTime((String)element.getValor(), (SimpleDateFormat)DateHelper.DATE_TIME_FORMAT)));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.ID_SITUACAO_NF.ordinal()) {
                if (Integer.parseInt(element.getValor()) == 2) {
                    criteria.add((Criterion)Restrictions.or((Criterion)Restrictions.eq((String)"situacao", (Object)SituacaoNFeEnum.class.getEnumConstants()[Integer.parseInt(element.getValor())]), (Criterion)Restrictions.eq((String)"situacao", (Object)SituacaoNFeEnum.class.getEnumConstants()[3])));
                } else {
                    criteria.add((Criterion)Restrictions.eq((String)"situacao", (Object)SituacaoNFeEnum.class.getEnumConstants()[Integer.parseInt(element.getValor())]));
                }
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.ID_TIPO_EMISSSAO_NF.ordinal()) {
                criteria.add((Criterion)Restrictions.eq((String)"tipoEmissao", (Object)TipoEmissaoEnum.class.getEnumConstants()[Integer.parseInt(element.getValor())]));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.SERIE.ordinal()) {
                criteria.add((Criterion)Restrictions.eq((String)"serie", (Object)element.getValor()));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.NUM_INI.ordinal()) {
                criteria.add((Criterion)Restrictions.ge((String)"numero", (Object)element.getValor()));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.NUM_FIM.ordinal()) {
                criteria.add((Criterion)Restrictions.le((String)"numero", (Object)element.getValor()));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.UF_DEST.ordinal()) {
                criteria.add((Criterion)Restrictions.eq((String)"ufDest", (Object)element.getValor()));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.DANFE_IMPRESSO.ordinal() && !StringHelper.isBlankOrNull((Object)element.getValor()) && Boolean.valueOf(element.getValor()).booleanValue()) {
                criteria.add((Criterion)Restrictions.eq((String)"danfeImpresso", (Object)Boolean.valueOf(element.getValor())));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.AUTORIZADA_EXPORTADA.ordinal() && !StringHelper.isBlankOrNull((Object)element.getValor())) {
                criteria.add((Criterion)Restrictions.eq((String)"autorizacaoExportadaXml", (Object)Boolean.valueOf(element.getValor())));
            }
            if (element.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.DOCUMENTO_DEST.ordinal() && !StringHelper.isBlankOrNull((Object)(docDest = element.getValor()))) {
                criteria.add((Criterion)Restrictions.like((String)"documentoDest", (String)docDest, (MatchMode)MatchMode.START));
            }
            if (element.getCampoEnum().intValue() != FiltroPesquisaNotaFiscalEnum.CHAVE_ACESSO.ordinal()) continue;
            criteria.add((Criterion)Restrictions.eq((String)"ano", (Object)element.getValor().substring(2, 4)));
            criteria.add((Criterion)Restrictions.eq((String)"mes", (Object)element.getValor().substring(4, 6)));
            criteria.add((Criterion)Restrictions.eq((String)"modelo", (Object)element.getValor().substring(20, 22)));
            criteria.add((Criterion)Restrictions.eq((String)"serie", (Object)element.getValor().substring(22, 25)));
            criteria.add((Criterion)Restrictions.eq((String)"numero", (Object)element.getValor().substring(25, 34)));
            criteria.add((Criterion)Restrictions.eq((String)"codigoNumericoChaveAcesso", (Object)element.getValor().substring(35, 43)));
            criteria.add((Criterion)Restrictions.eq((String)"digitoChaveAcesso", (Object)element.getValor().substring(43, 44)));
        }
        return criteria;
    }

    public NotaFiscalEntity pesquisarPorChaveAcesso(NotaFiscalEntity notaFiscalEntity) throws DSENDAOException {
        Criteria criteria = this.criteria(NotaFiscalEntity.class);
        criteria.add((Criterion)Restrictions.eq((String)"emitenteEntity", (Object)notaFiscalEntity.getEmitenteEntity()));
        criteria.add((Criterion)Restrictions.eq((String)"ano", (Object)notaFiscalEntity.getAno()));
        criteria.add((Criterion)Restrictions.eq((String)"mes", (Object)notaFiscalEntity.getMes()));
        criteria.add((Criterion)Restrictions.eq((String)"modelo", (Object)notaFiscalEntity.getModelo()));
        criteria.add((Criterion)Restrictions.eq((String)"serie", (Object)notaFiscalEntity.getSerie()));
        criteria.add((Criterion)Restrictions.eq((String)"numero", (Object)notaFiscalEntity.getNumero()));
        if (!StringHelper.isBlankOrNull((Object)notaFiscalEntity.getCodigoNumericoChaveAcesso())) {
            criteria.add((Criterion)Restrictions.eq((String)"codigoNumericoChaveAcesso", (Object)notaFiscalEntity.getCodigoNumericoChaveAcesso()));
        }
        if (!StringHelper.isBlankOrNull((Object)notaFiscalEntity.getDigitoChaveAcesso())) {
            criteria.add((Criterion)Restrictions.eq((String)"digitoChaveAcesso", (Object)notaFiscalEntity.getDigitoChaveAcesso()));
        }
        return (NotaFiscalEntity)criteria.uniqueResult();
    }

    public NotaFiscalEntity pesquisarPorChaveAcesso(ChaveAcessoTO chaveAcessoTO) throws DSENDAOException {
        Criteria criteria = this.criteria(NotaFiscalEntity.class);
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getCodigoUfEmitente())) {
            criteria.add((Criterion)Restrictions.eq((String)"codigoUfEmitente", (Object)chaveAcessoTO.getCodigoUfEmitente()));
        }
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getCnpjEmitente())) {
            criteria.createCriteria("emitenteEntity").add((Criterion)Restrictions.eq((String)"nrDocumento", (Object)chaveAcessoTO.getCnpjEmitente()));
        }
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getAno())) {
            criteria.add((Criterion)Restrictions.eq((String)"ano", (Object)chaveAcessoTO.getAno()));
        }
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getMes())) {
            criteria.add((Criterion)Restrictions.eq((String)"mes", (Object)chaveAcessoTO.getMes()));
        }
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getModelo())) {
            criteria.add((Criterion)Restrictions.eq((String)"modelo", (Object)chaveAcessoTO.getModelo()));
        }
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getSerie())) {
            criteria.add((Criterion)Restrictions.eq((String)"serie", (Object)chaveAcessoTO.getSerie()));
        }
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getNumeroNFe())) {
            criteria.add((Criterion)Restrictions.eq((String)"numero", (Object)chaveAcessoTO.getNumeroNFe()));
        }
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getCodigoNumerico())) {
            criteria.add((Criterion)Restrictions.eq((String)"codigoNumericoChaveAcesso", (Object)chaveAcessoTO.getCodigoNumerico()));
        }
        if (!StringHelper.isBlankOrNull((Object)chaveAcessoTO.getDigito())) {
            criteria.add((Criterion)Restrictions.eq((String)"digitoChaveAcesso", (Object)chaveAcessoTO.getDigito()));
        }
        return (NotaFiscalEntity)criteria.uniqueResult();
    }

    public List getSerieNumeroAnoPorSituacoes(Integer idEmitente, String serie, String numeroInicial, String numeroFinal, List<SituacaoNFeEnum> situacoes) {
        HashMap<String, Object> restrictionsValues = new HashMap<String, Object>();
        restrictionsValues.put("idEmitente", idEmitente);
        String sql = "select serie,numero,ano from nota_fiscal where id_emitente=:idEmitente ";
        if (!StringHelper.isBlankOrNull((Object)serie)) {
            sql = sql + "and serie=:serie ";
            restrictionsValues.put("serie", serie);
        }
        if (!StringHelper.isBlankOrNull((Object)numeroInicial)) {
            sql = sql + "and integer(numero)>=integer(:numeroInicial) ";
            restrictionsValues.put("numeroInicial", numeroInicial);
        }
        if (!StringHelper.isBlankOrNull((Object)numeroFinal)) {
            sql = sql + "and integer(numero)<=integer(:numeroFinal) ";
            restrictionsValues.put("numeroFinal", numeroFinal);
        }
        String situacoesString = "";
        if (situacoes != null) {
            for (int i = 0; i < situacoes.size(); ++i) {
                situacoesString = situacoesString + "'" + situacoes.get(i).name() + "'";
                if (i >= situacoes.size() - 1) continue;
                situacoesString = situacoesString + ",";
            }
        }
        if (!StringHelper.isBlankOrNull((Object)situacoesString)) {
            sql = sql + " and situacao in (" + situacoesString + ") ";
        }
        sql = sql + "order by serie,numero";
        Query query = DSENDAOHelper.currentSession().createNativeQuery(sql);
        for (String key : restrictionsValues.keySet()) {
            query.setParameter(key, restrictionsValues.get(key));
        }
        return query.getResultList();
    }

    public NotaFiscalEntity pesquisarPorSerieNumeroEmitente(NotaFiscalEntity notaFiscalEntity) throws DSENDAOException {
        try {
            HashMap<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("numero", notaFiscalEntity.getNumero());
            parametros.put("serie", notaFiscalEntity.getSerie());
            parametros.put("idEmitente", notaFiscalEntity.getEmitenteEntity().getIdEmitente());
            return (NotaFiscalEntity)super.selectSingleResult("NotaFiscalEntity.findBySerieNumeroEmitente", parametros);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public NotaFiscalEntity pesquisarPorId(Long id) throws DSENDAOException {
        try {
            HashMap<String, Long> parametros = new HashMap<String, Long>();
            parametros.put("idNotaFiscal", id);
            return (NotaFiscalEntity)super.selectSingleResult("NotaFiscalEntity.findByIdNotaFiscal", parametros);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public void excluirNotasFiscaisInutilizadas(InutilizacaoEntity inutilizacaoEntity) throws DSENDAOException {
        try {
            HashMap<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("idEmitente", inutilizacaoEntity.getEmitenteEntity().getIdEmitente());
            parametros.put("serie", inutilizacaoEntity.getSerie());
            parametros.put("numeroInicial", inutilizacaoEntity.getNumeroInicial());
            parametros.put("numeroFinal", inutilizacaoEntity.getNumeroFinal());
            super.updateByQuery("NotaFiscalEntity.deleteInutilizadas", parametros);
        }
        catch (Throwable e) {
            throw new DSENDAOException(e, e.getMessage());
        }
    }

    public int getNumeroNotaFiscalContingenciaDANFE(NotaFiscalEntity notaFiscalEntity, TipoEmissaoEnum tipoEmissaoEnum) throws DSENDAOException {
        try {
            notaFiscalEntity.setTipoEmissao(tipoEmissaoEnum);
            notaFiscalEntity.setDanfeImpresso(Boolean.TRUE);
            Criteria criteria = this.criteria(NotaFiscalEntity.class);
            Example example = this.createExample((Serializable)notaFiscalEntity);
            Object[] situacaoNFeArray = new Object[]{SituacaoNFeEnum.ASSINADA, SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ, SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA};
            criteria.add((Criterion)example);
            criteria.add(Restrictions.in((String)"situacao", (Object[])situacaoNFeArray));
            criteria.add((Criterion)Restrictions.eq((String)"emitenteEntity", (Object)notaFiscalEntity.getEmitenteEntity()));
            criteria.setProjection(Projections.rowCount());
            List resultado = criteria.list();
            return resultado == null ? 0 : (Integer)resultado.get(0);
        }
        catch (Throwable t) {
            throw new DSENDAOException(t, t.getMessage());
        }
    }

    public String pesquisarMaximoNumeroPorEmitenteSerie(NotaFiscalEntity notaFiscalEntity) throws DSENDAOException {
        try {
            HashMap<String, Object> parametros = new HashMap<String, Object>();
            parametros.put("idEmitente", notaFiscalEntity.getEmitenteEntity().getIdEmitente());
            parametros.put("serie", notaFiscalEntity.getSerie());
            Integer max = (Integer)super.selectSingleResult("NumeracaoEntity.findMaxNumeroByEmitenteSerie", parametros);
            return max == null ? null : String.valueOf(max);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public Integer selectQuantityByEmitenteSituacaoNf(NotaFiscalEntity notaFiscalEntity) throws DSENDAOException {
        try {
            HashMap<String, Integer> parametros = new HashMap<String, Integer>();
            parametros.put("idEmitente", notaFiscalEntity.getEmitenteEntity().getIdEmitente());
            parametros.put("situacao", (Integer)notaFiscalEntity.getSituacao());
            return (Integer)super.selectSingleResult("NotaFiscalEntity.findQtityByEmitenteSituacaoNfEnum", parametros);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }

    public Integer selectQuantityByEmitenteNfeAutorNaoExport(NotaFiscalEntity notaFiscalEntity) throws DSENDAOException {
        try {
            HashMap<String, Comparable> parametros = new HashMap<String, Comparable>();
            parametros.put("idEmitente", notaFiscalEntity.getEmitenteEntity().getIdEmitente());
            parametros.put("situacao", (Comparable)notaFiscalEntity.getSituacao());
            parametros.put("autorizacaoExportadaXml", notaFiscalEntity.getAutorizacaoExportadaXml());
            return (Integer)super.selectSingleResult("NotaFiscalEntity.findQtityByEmitenteNfeAutorNaoExport", parametros);
        }
        catch (DSGEDAOException e) {
            throw new DSENDAOException((DSGEBaseException)e, e.getMessage());
        }
    }
}

