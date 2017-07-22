/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO
 *  br.gov.sp.fazenda.dsen.model.business.ClienteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.ClienteFacade
 */
package br.gov.sp.fazenda.dsen.model.facade;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO;
import br.gov.sp.fazenda.dsen.model.business.ClienteBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import java.util.LinkedHashMap;
import java.util.List;

public class ClienteFacade {
    private ClienteBusiness a = null;

    private ClienteBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (ClienteBusiness)BusinessFactory.create((String)ClienteBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    public ClienteTO excluirCliente(ClienteTO clienteTO) throws DSENBusinessException {
        return this.a().excluirCliente(clienteTO);
    }

    public List<ClienteTO> excluirCliente(List<ClienteTO> clienteTOList) throws DSENBusinessException {
        return this.a().excluirCliente(clienteTOList);
    }

    public ClienteTO incluirCliente(ClienteTO clienteTO) throws DSENBusinessException {
        return this.a().incluirCliente(clienteTO);
    }

    public List<ClienteTO> pesquisarCliente(ClienteTO clienteTO, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENBusinessException {
        return this.a().pesquisarCliente(clienteTO, sortColumns, start, maxResults);
    }

    public List<ClienteTO> pesquisarCliente(ClienteTO clienteTO) throws DSENBusinessException {
        return this.a().pesquisarCliente(clienteTO, null, -1, -1);
    }

    public Integer getCountCliente(ClienteTO clienteTO) throws DSENBusinessException {
        return this.a().getCountCliente(clienteTO);
    }

    public ClienteTO alterarCliente(ClienteTO clienteTO) throws DSENBusinessException {
        return this.a().alterarCliente(clienteTO);
    }

    public PesquisaClienteTO carregarPesquisaCliente(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().carregarPesquisaCliente(emitenteTO);
    }

    public void salvarPesquisaCliente(PesquisaClienteTO pesquisaClienteTO) throws DSENBusinessException {
        this.a().salvarPesquisaCliente(pesquisaClienteTO);
    }

    public void exportarCliente(List<ClienteTO> listaClienteTO, ExtensaoArquivoEnum tipoArquivoEnum, String path) throws DSENBusinessException {
        this.a().exportarCliente(listaClienteTO, tipoArquivoEnum, path);
    }

    public void validarDadosParaConsultaCadastro(ConsultaCadastroTO consultaCadastroTO) throws DSENBusinessException {
        this.a().validarDadosParaConsultaCadastro(consultaCadastroTO);
    }

    public List<ConsultaCadastroTO> consultarCadastro(ConsultaCadastroTO consultaCadastroTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        return this.a().consultarCadastro(consultaCadastroTO, certificadoTO);
    }
}

