/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.NumeracaoTO
 *  br.gov.sp.fazenda.dsen.model.business.NumeracaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.NumeracaoDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.NumeracaoTO;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.NumeracaoDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NumeracaoBusiness {
    private Log a;
    private NumeracaoDAO a = LogFactory.getLog(NumeracaoBusiness.class);

    private NumeracaoDAO a() throws DSENBusinessException {
        if (this.a == null) {
            this.a = new NumeracaoDAO();
        }
        return this.a;
    }

    public NumeracaoTO pesquisarUltimoNumero(EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            NumeracaoTO numeracaoTO = this.a().pesquisarUltimoNumero(emitenteEntity);
            return numeracaoTO;
        }
        catch (DSENConverterException ex) {
            this.a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            this.a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    public NumeracaoTO pesquisarUltimoNumero(EmitenteTO emitenteTO, String serie) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            NumeracaoEntity numeracaoEntity = this.a().pesquisarUltimoNumero(emitenteEntity, serie);
            NumeracaoTO numeracaoTO = null;
            if (numeracaoEntity != null) {
                numeracaoTO = DSENBusinessConverter.getNumeracaoTO((NumeracaoEntity)numeracaoEntity);
            }
            return numeracaoTO;
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    @DSGETransaction
    public void alterar(NotaFiscalTO NotaFiscal) throws DSENBusinessException {
        NumeracaoEntity numeracaoEntity = null;
        try {
            numeracaoEntity = DSENBusinessConverter.getNumeracaoEntity((NumeracaoTO)this.pesquisarUltimoNumero(NotaFiscal.getEmitenteTO(), NotaFiscal.getSerie()));
            if (numeracaoEntity == null) {
                numeracaoEntity = new NumeracaoEntity();
            }
            numeracaoEntity.setSerie(NotaFiscal.getSerie());
            numeracaoEntity.setNumero(NotaFiscal.getNumero());
            numeracaoEntity.setAno(NotaFiscal.getAno());
            numeracaoEntity.setDataSistema(new Date());
            numeracaoEntity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)NotaFiscal.getEmitenteTO()));
            this.a().update((Serializable)numeracaoEntity);
        }
        catch (DSENConverterException e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            this.a.error((Object)e.getMessage());
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }
}

