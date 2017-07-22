/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.model.business.ParametroBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.ParametroFacade
 */
package br.gov.sp.fazenda.dsen.model.facade;

import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.model.business.ParametroBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import java.util.List;

public class ParametroFacade {
    ParametroBusiness a = null;

    private ParametroBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (ParametroBusiness)BusinessFactory.create((String)ParametroBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    public List<ParametroTO> selectParametros() throws DSENBusinessException {
        return this.a().selectParametros();
    }

    public List<ParametroTO> updateParametros(List<ParametroTO> listaParametros) throws DSENBusinessException {
        return this.a().updateParametros(listaParametros);
    }

    public void carregaParametrosAppContext() throws DSENBusinessException {
        this.a().carregaParametrosAppContext();
    }
}

