/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaTransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.model.business.TransportadoraBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.TransportadoraFacade
 */
package br.gov.sp.fazenda.dsen.model.facade;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaTransportadoraTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.model.business.TransportadoraBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import java.util.LinkedHashMap;
import java.util.List;

public class TransportadoraFacade {
    private TransportadoraBusiness a = null;

    public TransportadoraTO excluirTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        return this.a().excluirTransportadora(transportadoraTO);
    }

    public List<TransportadoraTO> excluirTransportadora(List<TransportadoraTO> transportadoraTOList) throws DSENBusinessException {
        return this.a().excluirTransportadora(transportadoraTOList);
    }

    public TransportadoraTO incluirTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        return this.a().incluirTransportadora(transportadoraTO);
    }

    public List<TransportadoraTO> pesquisarTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        return this.a().pesquisarTransportadora(transportadoraTO, null, -1, -1);
    }

    public List<TransportadoraTO> pesquisarTransportadora(TransportadoraTO transportadoraTO, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENBusinessException {
        return this.a().pesquisarTransportadora(transportadoraTO, sortColumns, start, maxResults);
    }

    public Integer getCountTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        return this.a().getCountTransportadora(transportadoraTO);
    }

    public TransportadoraTO alterarTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        return this.a().alterarTransportadora(transportadoraTO);
    }

    public PesquisaTransportadoraTO carregarPesquisaTransportadora(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().carregarPesquisaTransportadora(emitenteTO);
    }

    public void salvarPesquisaTransportadora(PesquisaTransportadoraTO pesquisaTransportadoraTO) throws DSENBusinessException {
        this.a().salvarPesquisaTransportadora(pesquisaTransportadoraTO);
    }

    private TransportadoraBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (TransportadoraBusiness)BusinessFactory.create((String)TransportadoraBusiness.class.getName());
            }
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        return this.a;
    }

    public void exportarTransportadora(List<TransportadoraTO> listaTransportadoraTO, ExtensaoArquivoEnum tipoArquivoEnum, String path) throws DSENBusinessException {
        this.a().exportarTransportadora(listaTransportadoraTO, tipoArquivoEnum, path);
    }
}

