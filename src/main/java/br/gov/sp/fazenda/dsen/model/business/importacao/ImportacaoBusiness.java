/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.exception.DSENImportacaoException
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.model.business.DpecBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoBusiness$2
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoClienteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoEmitenteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoInutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoProdutoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTransportadoraBusiness
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoVinculacao
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.exception.DSENImportacaoException;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.model.business.DpecBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoClienteBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoEmitenteBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoInutilizacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoNotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoProdutoBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTransportadoraBusiness;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoVinculacao;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ImportacaoBusiness {
    private ImportacaoNotaFiscalBusiness a;
    private ImportacaoProdutoBusiness a;
    private ImportacaoEmitenteBusiness a;
    private ImportacaoClienteBusiness a;
    private ImportacaoInutilizacaoBusiness a;
    private DpecBusiness a;
    private ImportacaoTransportadoraBusiness a;

    public List<ImportacaoTelaTO> listarArquivoImportacao(String path) throws DSENBusinessException {
        ImportacaoVinculacao importacaoVinculacao = new ImportacaoVinculacao();
        File filePath = new File(path);
         filenameFilter = new /* Unavailable Anonymous Inner Class!! */;
        File[] filePathFiles = filePath.listFiles((FilenameFilter)filenameFilter);
        for (int i = 0; i < filePathFiles.length; ++i) {
            if (filePathFiles[i].isDirectory()) continue;
            importacaoVinculacao.find(filePathFiles[i]);
        }
        try {
            return importacaoVinculacao.getAll();
        }
        catch (Exception e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    public ImportacaoResultadoTO importarArquivo(List<ImportacaoTelaTO> listaArquivos) throws DSGEBaseException {
        ImportacaoResultadoTO importacaoResultadoTO = new ImportacaoResultadoTO();
        importacaoResultadoTO.setImportacaoRegistros(new ArrayList());
        if (listaArquivos != null) {
            for (ImportacaoTelaTO importacaoTela : listaArquivos) {
                try {
                    switch (2.a[importacaoTela.getTipoArquivo().ordinal()]) {
                        case 1: {
                            this.importarNotaFiscalComVinculados(importacaoTela, importacaoResultadoTO);
                            break;
                        }
                        case 2: {
                            this.importarEmitente(importacaoTela, importacaoResultadoTO);
                            break;
                        }
                        case 3: {
                            this.importarCliente(importacaoTela, importacaoResultadoTO);
                            break;
                        }
                        case 4: {
                            this.importarProduto(importacaoTela, importacaoResultadoTO);
                            break;
                        }
                        case 5: {
                            this.importarTransportadora(importacaoTela, importacaoResultadoTO);
                            break;
                        }
                        case 6: {
                            this.importarDpec(importacaoTela, importacaoResultadoTO);
                            break;
                        }
                        case 7: {
                            this.importarInutilizacao(importacaoTela, importacaoResultadoTO);
                        }
                    }
                }
                catch (DSGEBaseException e) {
                    if (e.getBaseException() instanceof DSENImportacaoException) {
                        DSENImportacaoException validationException = (DSENImportacaoException)e.getBaseException();
                        this.a(validationException.getImportacaoResultadoTO(), importacaoResultadoTO);
                        continue;
                    }
                    throw e;
                }
            }
        }
        return importacaoResultadoTO;
    }

    @DSGETransaction
    public void importarNotaFiscalComVinculados(ImportacaoTelaTO importacaoTela, ImportacaoResultadoTO importacaoResultadoTO) throws DSGEBaseException {
        ImportacaoResultadoTO retorno = this.a().importar(importacaoTela);
        ImportacaoResultadoTO retornoVinculado = null;
        this.a(retorno, importacaoResultadoTO);
        if (importacaoTela.getArquivosVinculados() != null) {
            for (ImportacaoTelaTO vinculado : importacaoTela.getArquivosVinculados()) {
                retornoVinculado = this.a().importar(vinculado);
                this.a(retornoVinculado, importacaoResultadoTO);
            }
        }
    }

    @DSGETransaction
    public void importarEmitente(ImportacaoTelaTO importacaoTela, ImportacaoResultadoTO importacaoResultadoTO) throws DSGEBaseException {
        ImportacaoResultadoTO retorno = this.a().a(importacaoTela);
        this.a(retorno, importacaoResultadoTO);
    }

    @DSGETransaction
    public void importarCliente(ImportacaoTelaTO importacaoTela, ImportacaoResultadoTO importacaoResultadoTO) throws DSGEBaseException {
        ImportacaoResultadoTO retorno = this.a().a(importacaoTela);
        this.a(retorno, importacaoResultadoTO);
    }

    @DSGETransaction
    public void importarProduto(ImportacaoTelaTO importacaoTela, ImportacaoResultadoTO importacaoResultadoTO) throws DSGEBaseException {
        ImportacaoResultadoTO retorno = this.a().a(importacaoTela);
        this.a(retorno, importacaoResultadoTO);
    }

    @DSGETransaction
    public void importarTransportadora(ImportacaoTelaTO importacaoTela, ImportacaoResultadoTO importacaoResultadoTO) throws DSGEBaseException {
        ImportacaoResultadoTO retorno = this.a().a(importacaoTela);
        this.a(retorno, importacaoResultadoTO);
    }

    public void importarDpec(ImportacaoTelaTO importacaoTela, ImportacaoResultadoTO importacaoResultadoTO) throws DSGEBaseException {
        ImportacaoResultadoTO retorno = this.a().importarDPEC(importacaoTela.getCaminhoArquivo());
        this.a(retorno, importacaoResultadoTO);
    }

    @DSGETransaction
    public void importarInutilizacao(ImportacaoTelaTO importacaoTela, ImportacaoResultadoTO importacaoResultadoTO) throws DSGEBaseException {
        ImportacaoResultadoTO retorno = this.a().importar(importacaoTela);
        this.a(retorno, importacaoResultadoTO);
    }

    private void a(ImportacaoResultadoTO retorno, ImportacaoResultadoTO importacaoResultadoTO) {
        if (retorno != null) {
            importacaoResultadoTO.setSucesso(importacaoResultadoTO.getSucesso() + retorno.getSucesso());
            importacaoResultadoTO.setInsucesso(importacaoResultadoTO.getInsucesso() + retorno.getInsucesso());
            importacaoResultadoTO.getImportacaoRegistros().addAll(retorno.getImportacaoRegistros());
        }
    }

    private ImportacaoNotaFiscalBusiness a() {
        if (this.a == null) {
            this.a = new ImportacaoNotaFiscalBusiness();
        }
        return this.a;
    }

    private ImportacaoProdutoBusiness a() {
        if (this.a == null) {
            this.a = new ImportacaoProdutoBusiness();
        }
        return this.a;
    }

    private ImportacaoEmitenteBusiness a() {
        if (this.a == null) {
            this.a = new ImportacaoEmitenteBusiness();
        }
        return this.a;
    }

    private ImportacaoClienteBusiness a() {
        if (this.a == null) {
            this.a = new ImportacaoClienteBusiness();
        }
        return this.a;
    }

    private ImportacaoInutilizacaoBusiness a() {
        if (this.a == null) {
            this.a = new ImportacaoInutilizacaoBusiness();
        }
        return this.a;
    }

    private DpecBusiness a() {
        if (this.a == null) {
            this.a = new DpecBusiness();
        }
        return this.a;
    }

    private ImportacaoTransportadoraBusiness a() {
        if (this.a == null) {
            this.a = new ImportacaoTransportadoraBusiness();
        }
        return this.a;
    }
}

