/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.InutilizacaoDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  org.hibernate.Criteria
 *  org.hibernate.criterion.Criterion
 *  org.hibernate.criterion.Order
 *  org.hibernate.criterion.Restrictions
 */
package br.gov.sp.fazenda.dsen.model.dao;

import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class InutilizacaoDAO
extends DSENBaseDAO {
    public List<InutilizacaoEntity> pesquisarFaixasInutilizadas(InutilizacaoEntity inutilizacaoEntity) throws DSENDAOException {
        try {
            Criteria criteria = this.criteria(InutilizacaoEntity.class);
            if (!StringHelper.isBlankOrNull((Object)inutilizacaoEntity.getSerie())) {
                criteria.add((Criterion)Restrictions.eq((String)"serie", (Object)inutilizacaoEntity.getSerie()));
            }
            if (!StringHelper.isBlankOrNull((Object)inutilizacaoEntity.getNumeroInicial()) && !StringHelper.isBlankOrNull((Object)inutilizacaoEntity.getNumeroFinal())) {
                criteria.add((Criterion)Restrictions.or((Criterion)Restrictions.between((String)"numeroInicial", (Object)inutilizacaoEntity.getNumeroInicial(), (Object)inutilizacaoEntity.getNumeroFinal()), (Criterion)Restrictions.between((String)"numeroFinal", (Object)inutilizacaoEntity.getNumeroInicial(), (Object)inutilizacaoEntity.getNumeroFinal())));
            } else if (!StringHelper.isBlankOrNull((Object)inutilizacaoEntity.getNumeroInicial())) {
                criteria.add((Criterion)Restrictions.ge((String)"numeroFinal", (Object)inutilizacaoEntity.getNumeroInicial()));
            } else if (!StringHelper.isBlankOrNull((Object)inutilizacaoEntity.getNumeroFinal())) {
                criteria.add((Criterion)Restrictions.le((String)"numeroInicial", (Object)inutilizacaoEntity.getNumeroFinal()));
            }
            criteria.add((Criterion)Restrictions.eq((String)"emitenteEntity", (Object)inutilizacaoEntity.getEmitenteEntity()));
            criteria.addOrder(Order.asc((String)"serie")).addOrder(Order.asc((String)"numeroInicial")).addOrder(Order.asc((String)"numeroFinal"));
            return criteria.list();
        }
        catch (Throwable e) {
            throw new DSENDAOException(e, e.getMessage());
        }
    }

    public boolean numeroInutilizado(Integer idEmitente, String serie, String numero) throws DSENDAOException {
        Criteria criteria = this.criteria(InutilizacaoEntity.class);
        criteria.add((Criterion)Restrictions.eq((String)"serie", (Object)serie));
        criteria.add((Criterion)Restrictions.eq((String)"emitenteEntity.idEmitente", (Object)idEmitente));
        criteria.add((Criterion)Restrictions.and((Criterion)Restrictions.le((String)"numeroInicial", (Object)numero), (Criterion)Restrictions.ge((String)"numeroFinal", (Object)numero)));
        List resultado = criteria.list();
        if (resultado == null || resultado.isEmpty()) {
            return false;
        }
        return true;
    }

    public List<InutilizacaoEntity> selectInutilizacaoByIntervaloData(EmitenteEntity emitenteEntity, Date dataInicial, Date dataFinal) throws DSENDAOException {
        Criteria criteria = this.criteria(InutilizacaoEntity.class);
        criteria.add(Restrictions.between((String)"dataInutilizacao", (Object)dataInicial, (Object)dataFinal));
        criteria.add((Criterion)Restrictions.eq((String)"emitenteEntity", (Object)emitenteEntity));
        criteria.addOrder(Order.asc((String)"serie")).addOrder(Order.asc((String)"numeroInicial")).addOrder(Order.asc((String)"numeroFinal"));
        List resultado = criteria.list();
        if (resultado == null || resultado.isEmpty()) {
            return null;
        }
        return resultado;
    }
}

