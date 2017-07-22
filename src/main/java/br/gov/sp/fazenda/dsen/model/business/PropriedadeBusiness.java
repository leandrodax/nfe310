/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsen.model.business.PropriedadeBusiness
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.PropriedadeDAO
 *  br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.PropriedadeDAO;
import br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;

public class PropriedadeBusiness {
    private PropriedadeDAO a;

    @DSGETransaction
    public PropriedadeTO alterarPropriedade(PropriedadeTO propriedadeTO) throws DSENBusinessException {
        try {
            PropriedadeEntity propriedadeEntity = DSENBusinessConverter.getPropriedadeEntity((PropriedadeTO)propriedadeTO);
            propriedadeEntity = (PropriedadeEntity)this.a().update((Serializable)propriedadeEntity);
            propriedadeTO = DSENBusinessConverter.getPropriedadeTO((PropriedadeEntity)propriedadeEntity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return propriedadeTO;
    }

    public PropriedadeTO pesquisarPropriedade(PropriedadeTO propriedadeTO) throws DSENBusinessException {
        try {
            PropriedadeEntity propriedadeEntity = DSENBusinessConverter.getPropriedadeEntity((PropriedadeTO)propriedadeTO);
            propriedadeEntity = this.a().selectByEmitenteAndPropriedadeEnum(propriedadeEntity);
            propriedadeTO = DSENBusinessConverter.getPropriedadeTO((PropriedadeEntity)propriedadeEntity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return propriedadeTO;
    }

    private PropriedadeDAO a() {
        if (this.a == null) {
            this.a = new PropriedadeDAO();
        }
        return this.a;
    }
}

