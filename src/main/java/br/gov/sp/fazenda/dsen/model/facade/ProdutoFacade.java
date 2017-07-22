/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.model.business.ProdutoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.ProdutoFacade
 */
package br.gov.sp.fazenda.dsen.model.facade;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.model.business.ProdutoBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import java.util.LinkedHashMap;
import java.util.List;

public class ProdutoFacade {
    ProdutoBusiness a;

    private ProdutoBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (ProdutoBusiness)BusinessFactory.create((String)ProdutoBusiness.class.getName());
            }
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
        return this.a;
    }

    public List<ProdutoTO> pesquisarProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        return this.a().pesquisarProduto(produtoTO, null, -1, -1);
    }

    public List<ProdutoTO> pesquisarProduto(ProdutoTO produtoTO, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENBusinessException {
        return this.a().pesquisarProduto(produtoTO, sortColumns, start, maxResults);
    }

    public Integer getCountProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        return this.a().getCountProduto(produtoTO);
    }

    public ProdutoTO incluirProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        return this.a().incluirProduto(produtoTO);
    }

    public ProdutoTO alterarProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        return this.a().alterarProduto(produtoTO);
    }

    public ProdutoTO excluirProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        return this.a().excluirProduto(produtoTO);
    }

    public List<ProdutoTO> excluirProduto(List<ProdutoTO> listaProdutoTO) throws DSENBusinessException {
        return this.a().excluirProduto(listaProdutoTO);
    }

    public PesquisaProdutoTO carregarPesquisaProduto(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().carregarPesquisaProduto(emitenteTO);
    }

    public void salvarPesquisaProduto(PesquisaProdutoTO pesquisaProdutoTO) throws DSENBusinessException {
        this.a().salvarPesquisaProduto(pesquisaProdutoTO);
    }

    public void exportarProduto(List<ProdutoTO> listaProdutoTO, ExtensaoArquivoEnum tipoArquivoEnum, String path) throws DSENBusinessException {
        this.a().exportarProduto(listaProdutoTO, tipoArquivoEnum, path);
    }
}

