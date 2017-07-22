/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaEmitenteTO
 *  br.gov.sp.fazenda.dsen.model.business.EmitenteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.EmitenteFacade
 */
package br.gov.sp.fazenda.dsen.model.facade;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaEmitenteTO;
import br.gov.sp.fazenda.dsen.model.business.EmitenteBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import java.util.LinkedHashMap;
import java.util.List;

public class EmitenteFacade {
    private EmitenteBusiness a;

    private EmitenteBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (EmitenteBusiness)BusinessFactory.create((String)EmitenteBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    public EmitenteTO excluirEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().excluirEmitente(emitenteTO);
    }

    public List<EmitenteTO> excluirEmitente(List<EmitenteTO> emitenteTOList) throws DSENBusinessException {
        return this.a().excluirEmitente(emitenteTOList);
    }

    public EmitenteTO incluirEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().incluirEmitente(emitenteTO);
    }

    public List<EmitenteTO> pesquisarEmitente(EmitenteTO emitenteTO, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENBusinessException {
        return this.a().pesquisarEmitente(emitenteTO, sortColumns, start, maxResults);
    }

    public Integer getCountEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().getCountEmitente(emitenteTO);
    }

    public EmitenteTO alterarEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().alterarEmitenteAtual(emitenteTO);
    }

    public PesquisaEmitenteTO carregarPesquisaEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().carregarPesquisaEmitente(emitenteTO);
    }

    public void salvarPesquisaEmitente(PesquisaEmitenteTO pesquisaEmitenteTO) throws DSENBusinessException {
        this.a().salvarPesquisaEmitente(pesquisaEmitenteTO);
    }

    public void exportarEmitente(List<EmitenteTO> listaEmitente, ExtensaoArquivoEnum tipoArquivoEnum, String path) throws DSENBusinessException {
        this.a().exportarEmitente(listaEmitente, tipoArquivoEnum, path);
    }
}

