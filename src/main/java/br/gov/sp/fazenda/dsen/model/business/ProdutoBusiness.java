/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.IpiTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.model.business.ProdutoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroProdutoConverter
 *  br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA
 *  br.gov.sp.fazenda.dsen.model.business.expimp.produto.RegistroM
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO
 *  br.gov.sp.fazenda.dsen.model.dao.ProdutoDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.IpiTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroProdutoConverter;
import br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA;
import br.gov.sp.fazenda.dsen.model.business.expimp.produto.RegistroM;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO;
import br.gov.sp.fazenda.dsen.model.dao.ProdutoDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class ProdutoBusiness {
    private ProdutoDAO a;
    private PesquisaDAO a = new PesquisaDAO();

    @DSGETransaction
    public ProdutoTO incluirProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        if (this.a(produtoTO)) {
            try {
                produtoTO.setVersao(DSENProperties.getInstance().getVersaoSchemaSistema());
                ProdutoEntity produtoEntity = DSENBusinessConverter.getProdutoEntity((ProdutoTO)produtoTO);
                ProdutoEntity duplicated = this.a.selectByProduto(produtoEntity);
                if (duplicated != null) {
                    produtoTO.addError(MessageFormat.format(DSENMessageConstants.JA_CADASTRADO, produtoTO.getCProd()));
                } else {
                    this.a.insert((Serializable)produtoEntity);
                    produtoTO = DSENBusinessConverter.getProdutoTO((ProdutoEntity)produtoEntity);
                    produtoTO.addMessage(MessageFormat.format(DSENMessageConstants.INCLUIDO_COM_SUCESSO, produtoTO.getXProd()));
                }
            }
            catch (DSENDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSGEDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSENConverterException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
        }
        return produtoTO;
    }

    @DSGETransaction
    public ProdutoTO excluirProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        try {
            ProdutoEntity produtoEntity = DSENBusinessConverter.getProdutoEntity((ProdutoTO)produtoTO);
            this.a.delete((Serializable)produtoEntity);
            produtoTO.addMessage(MessageFormat.format(DSENMessageConstants.EXCLUIDO_COM_SUCESSO, produtoTO.getXProd()));
        }
        catch (DSGEDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return produtoTO;
    }

    @DSGETransaction
    public List<ProdutoTO> excluirProduto(List<ProdutoTO> listaProdutoTO) throws DSENBusinessException {
        try {
            for (ProdutoTO produtoTO : listaProdutoTO) {
                this.excluirProduto(produtoTO);
            }
        }
        catch (DSENBusinessException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return listaProdutoTO;
    }

    @DSGETransaction
    public ProdutoTO alterarProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        if (this.a(produtoTO)) {
            try {
                ProdutoEntity produtoEntity = DSENBusinessConverter.getProdutoEntity((ProdutoTO)produtoTO);
                produtoEntity = (ProdutoEntity)this.a.update((Serializable)produtoEntity);
                produtoTO = DSENBusinessConverter.getProdutoTO((ProdutoEntity)produtoEntity);
                produtoTO.addMessage(MessageFormat.format(DSENMessageConstants.ALTERADO_COM_SUCESSO, produtoTO.getXProd()));
            }
            catch (DSGEDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSENConverterException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
        }
        return produtoTO;
    }

    public List<ProdutoTO> pesquisarProduto(ProdutoTO produtoTO, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENBusinessException {
        List listaTO = null;
        List listaEntity = null;
        try {
            ProdutoEntity produtoEntity = DSENBusinessConverter.getProdutoEntity((ProdutoTO)produtoTO);
            listaEntity = this.a.selectProduto(produtoEntity, sortColumns, start, maxResults);
            listaTO = DSENBusinessConverter.converteListaProduto((List)listaEntity);
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return listaTO;
    }

    public Integer getCountProduto(ProdutoTO produtoTO) throws DSENBusinessException {
        try {
            ProdutoEntity entity = DSENBusinessConverter.getProdutoEntity((ProdutoTO)produtoTO);
            return this.a.getCountProduto(entity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    public ProdutoTO pesquisarProdutoPorCodigo(ProdutoTO produtoTO) throws DSENBusinessException {
        ProdutoTO produto = null;
        try {
            ProdutoEntity produtoEntity = this.a.selectByProduto(DSENBusinessConverter.getProdutoEntity((ProdutoTO)produtoTO));
            produto = DSENBusinessConverter.getProdutoTO((ProdutoEntity)produtoEntity);
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return produto;
    }

    @DSGETransaction
    public void salvarPesquisaProduto(PesquisaProdutoTO pesquisaProdutoTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaProdutoTO.getIdEmitente());
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(pesquisaProdutoTO.getTelaPesquisaEnum());
            List listPesquisaBanco = this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity);
            List listPesquisaTela = DSENBusinessConverter.getPesquisaEntity((PesquisaProdutoTO)pesquisaProdutoTO);
            if (listPesquisaBanco != null) {
                for (int i = 0; i < listPesquisaBanco.size(); ++i) {
                    PesquisaEntity element = (PesquisaEntity)listPesquisaBanco.get(i);
                    element.setValor(((PesquisaEntity)listPesquisaTela.get(i)).getValor());
                    this.a.update((Serializable)element);
                }
            } else {
                for (PesquisaEntity element : listPesquisaTela) {
                    this.a.insert((Serializable)element);
                }
            }
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSGEDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public PesquisaProdutoTO carregarPesquisaProduto(EmitenteTO emitenteTO) throws DSENBusinessException {
        PesquisaProdutoTO pesquisaProdutoTO = null;
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(TelaPesquisaEnum.PRODUTO);
            pesquisaProdutoTO = DSENBusinessConverter.getPesquisaProdutoTO((List)this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity));
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaProdutoTO;
    }

    private boolean a(ProdutoTO produtoTO) {
        int length;
        boolean isValid = true;
        if (StringHelper.isBlankOrNull((Object)produtoTO.getCProd())) {
            produtoTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.CODIGO));
            isValid = false;
        }
        if (StringHelper.isBlankOrNull((Object)produtoTO.getXProd())) {
            produtoTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.DESCRICAO));
            isValid = false;
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getCEan()) && (length = produtoTO.getCEan().length()) != 8 && length != 12 && length != 13 && length != 14) {
            produtoTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.EAN));
            isValid = false;
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getCEanTrib()) && (length = produtoTO.getCEanTrib().length()) != 8 && length != 12 && length != 13 && length != 14) {
            produtoTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.EAN_TRIB));
            isValid = false;
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getNcm()) && !produtoTO.getNcm().matches("[0-9]{2}|[0-9]{8}")) {
            produtoTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.NCM));
            isValid = false;
        }
        if (!StringHelper.isBlankOrNull((Object)produtoTO.getExTipi()) && (length = produtoTO.getExTipi().length()) != 2 && length != 3) {
            produtoTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.EX_TIPI));
            isValid = false;
        }
        if (isValid && produtoTO.getIpiTOSet() != null) {
            for (IpiTO ipiTO : produtoTO.getIpiTOSet()) {
                if (StringHelper.isBlankOrNull((Object)ipiTO.getCnpjProd())) continue;
                try {
                    DSGEDocumentoHelper.validarDocumento((String)ipiTO.getCnpjProd(), (TipoDocumentoEnum)TipoDocumentoEnum.CNPJ);
                }
                catch (DSGEValidationException ex) {
                    isValid = false;
                    produtoTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.CNPJ_PRODUTOR));
                }
            }
        }
        return isValid;
    }

    private void a(List<ExpImpInterface> listaProdutoTOExpImp, ProdutoTO produtoTO) {
        RegistroA registroA = new RegistroA();
        registroA.setVersao(produtoTO.getVersao());
        listaProdutoTOExpImp.add((ExpImpInterface)registroA);
        listaProdutoTOExpImp.add((ExpImpInterface)produtoTO);
        if (produtoTO.getIpiTOSet() != null || produtoTO.getIcmsTOSet() != null) {
            RegistroM registroM = new RegistroM();
            registroM.setVersao(produtoTO.getVersao());
            if (produtoTO.getIpiTOSet() != null) {
                registroM.setMIPI(Integer.toString(produtoTO.getIpiTOSet().size()));
            }
            if (produtoTO.getIcmsTOSet() != null) {
                registroM.setQtdeN(Integer.toString(produtoTO.getIcmsTOSet().size()));
            }
            listaProdutoTOExpImp.add((ExpImpInterface)registroM);
        }
        for (IcmsTO icmsTO : produtoTO.getIcmsTOSet()) {
            icmsTO.setVersao(produtoTO.getVersao());
            listaProdutoTOExpImp.add((ExpImpInterface)icmsTO);
        }
        for (IpiTO ipiTO : produtoTO.getIpiTOSet()) {
            ipiTO.setVersao(produtoTO.getVersao());
            listaProdutoTOExpImp.add((ExpImpInterface)ipiTO);
        }
    }

    public void exportarProduto(List<ProdutoTO> listaProdutoTO, ExtensaoArquivoEnum extensaoArquivo, String path) throws DSENBusinessException {
        ArrayList listaProdutoTOExpImp = new ArrayList();
        int totalRegistros = listaProdutoTO.size();
        int qtdeRegistrosExportados = 0;
        int qtdeArquivosGerados = 0;
        try {
            if (ExtensaoArquivoEnum.TXT.equals((Object)extensaoArquivo)) {
                for (ProdutoTO produtoTO : listaProdutoTO) {
                    this.a(listaProdutoTOExpImp, produtoTO);
                }
                DSENRegistroProdutoConverter produtoConverter = new DSENRegistroProdutoConverter();
                Registro registro = produtoConverter.getRegistroFromTOs(listaProdutoTOExpImp);
                boolean ok = ExportacaoHelper.exportar((String)path, (String)registro.toString());
                if (ok) {
                    qtdeRegistrosExportados += totalRegistros;
                    ++qtdeArquivosGerados;
                }
            } else {
                for (ProdutoTO produtoTO : listaProdutoTO) {
                    listaProdutoTOExpImp = new ArrayList();
                    this.a(listaProdutoTOExpImp, produtoTO);
                    DSENRegistroProdutoConverter produtoConverter = new DSENRegistroProdutoConverter();
                    Registro registro = produtoConverter.getRegistroFromTOs(listaProdutoTOExpImp);
                    List colRegProdutoXML = registro.getChildren();
                    for (Registro regClienteXML : colRegProdutoXML) {
                        String nomeArquivo = !StringHelper.isBlankOrNull((Object)produtoTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)produtoTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (String)DocumentoUtil.getNomePadraoArquivoXML((ProdutoTO)produtoTO));
                        boolean ok = ExportacaoHelper.exportar((String)nomeArquivo, (String)regClienteXML.toXML());
                        if (!ok) continue;
                        ++qtdeRegistrosExportados;
                        ++qtdeArquivosGerados;
                    }
                }
            }
        }
        catch (CancelarExportacaoException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        catch (Exception e) {
            this.a();
        }
        Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosExportados, qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_TOTAIS});
    }

    private void a() {
        Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_PRODUTO_NAO_EXPORTADO, ""), new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_RESULTADO});
    }

    public List<ImportacaoRegistroTO> importarProduto(ImportacaoTelaTO importacaoTela) {
        return null;
    }
}

