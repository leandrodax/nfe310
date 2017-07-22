/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaEmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.model.business.EmitenteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroEmitenteConverter
 *  br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.EmitenteDAO
 *  br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO
 *  br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ClienteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EventoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.IcmsEntity
 *  br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.IpiEntity
 *  br.gov.sp.fazenda.dsen.model.entity.LoteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity
 *  br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity
 *  br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException
 *  br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.Registro
 *  br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper
 *  br.gov.sp.fazenda.dsge.common.util.IOHelper
 *  br.gov.sp.fazenda.dsge.common.util.SerializacaoHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.apache.commons.beanutils.PropertyUtils
 *  org.apache.commons.logging.Log
 *  org.apache.commons.logging.LogFactory
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.RegimeTributarioEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaEmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroEmitenteConverter;
import br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.EmitenteDAO;
import br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO;
import br.gov.sp.fazenda.dsen.model.entity.CancelamentoEntity;
import br.gov.sp.fazenda.dsen.model.entity.CertificadoInfoEntity;
import br.gov.sp.fazenda.dsen.model.entity.ClienteEntity;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.EventoEntity;
import br.gov.sp.fazenda.dsen.model.entity.IcmsEntity;
import br.gov.sp.fazenda.dsen.model.entity.InutilizacaoEntity;
import br.gov.sp.fazenda.dsen.model.entity.IpiEntity;
import br.gov.sp.fazenda.dsen.model.entity.LoteEntity;
import br.gov.sp.fazenda.dsen.model.entity.NotaFiscalEntity;
import br.gov.sp.fazenda.dsen.model.entity.NumeracaoEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity;
import br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity;
import br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.QuestionEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.TipoDocumentoEnum;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEValidationException;
import br.gov.sp.fazenda.dsge.common.exception.exportacao.CancelarExportacaoException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.to.Registro;
import br.gov.sp.fazenda.dsge.common.util.DSGEDocumentoHelper;
import br.gov.sp.fazenda.dsge.common.util.IOHelper;
import br.gov.sp.fazenda.dsge.common.util.SerializacaoHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EmitenteBusiness {
    private static Log a = LogFactory.getLog(EmitenteBusiness.class);
    private EmitenteDAO a;
    private PesquisaDAO a = new PesquisaDAO();

    @DSGETransaction
    public EmitenteTO excluirEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            NotaFiscalBusiness notaFiscalBusiness = new NotaFiscalBusiness();
            int numContingDanfe = notaFiscalBusiness.getNumeroNotaFiscalContingenciaDANFE(emitenteTO, TipoEmissaoEnum.CONTINGENCIA);
            int numContingDPECDanfe = notaFiscalBusiness.getNumeroNotaFiscalContingenciaDANFE(emitenteTO, TipoEmissaoEnum.CONTINGENCIA_DPEC);
            int numContingFSDADanfe = notaFiscalBusiness.getNumeroNotaFiscalContingenciaDANFE(emitenteTO, TipoEmissaoEnum.CONTINGENCIA_FS_DA);
            if (numContingDanfe > 0) {
                emitenteTO.addError(MessageFormat.format(DSENMessageConstants.EMITENTE_POSSUI_NOTAS_CONTING_DANFE_PENDENTES_ENVIO, emitenteTO.getXNome(), numContingDanfe, TipoEmissaoEnum.CONTINGENCIA.getDescricao()));
            }
            if (numContingDPECDanfe > 0) {
                emitenteTO.addError(MessageFormat.format(DSENMessageConstants.EMITENTE_POSSUI_NOTAS_CONTING_DANFE_PENDENTES_ENVIO, emitenteTO.getXNome(), numContingDPECDanfe, TipoEmissaoEnum.CONTINGENCIA_DPEC.getDescricao()));
            }
            if (numContingFSDADanfe > 0) {
                emitenteTO.addError(MessageFormat.format(DSENMessageConstants.EMITENTE_POSSUI_NOTAS_CONTING_DANFE_PENDENTES_ENVIO, emitenteTO.getXNome(), numContingFSDADanfe, TipoEmissaoEnum.CONTINGENCIA_FS_DA.getDescricao()));
            }
            if (numContingDanfe == 0 && numContingDPECDanfe == 0 && numContingFSDADanfe == 0) {
                EmitenteEntity entity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
                this.a.delete((Serializable)entity);
                emitenteTO.addMessage(MessageFormat.format(DSENMessageConstants.EXCLUIDO_COM_SUCESSO, emitenteTO.getXNome()));
            }
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return emitenteTO;
    }

    @DSGETransaction
    public List<EmitenteTO> excluirEmitente(List<EmitenteTO> emitenteTOList) throws DSENBusinessException {
        ArrayList<EmitenteTO> lista = null;
        if (emitenteTOList != null) {
            lista = new ArrayList<EmitenteTO>();
            for (int i = 0; i < emitenteTOList.size(); ++i) {
                EmitenteTO emitente = emitenteTOList.get(i);
                lista.add(this.excluirEmitente(emitente));
            }
        }
        return lista;
    }

    @DSGETransaction
    public EmitenteTO incluirEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        if (this.a(emitenteTO)) {
            try {
                emitenteTO.setVersao(DSENProperties.getInstance().getVersaoSchemaSistema());
                EmitenteEntity entity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
                EmitenteEntity duplicatedEmitenteEntity = this.a.selectByNrDocumento(entity);
                if (duplicatedEmitenteEntity != null) {
                    emitenteTO.addError(MessageFormat.format(DSENMessageConstants.JA_CADASTRADO, emitenteTO.getNrDocumento()));
                } else {
                    this.a.insert((Serializable)entity);
                    emitenteTO = DSENBusinessConverter.getEmitenteTO((EmitenteEntity)entity);
                    emitenteTO.addMessage(MessageFormat.format(DSENMessageConstants.INCLUIDO_COM_SUCESSO, emitenteTO.getXNome()));
                }
            }
            catch (DSENConverterException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSENDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSGEDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
        }
        return emitenteTO;
    }

    public List<EmitenteTO> pesquisarEmitente(EmitenteTO emitenteTO, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENBusinessException {
        List lista = null;
        try {
            EmitenteEntity entity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            lista = DSENBusinessConverter.converteListaEmitente((List)this.a.selectEmitente(entity, sortColumns, start, maxResults));
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return lista;
    }

    public Integer getCountEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            EmitenteEntity entity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            return this.a.getCountEmitente(entity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    public EmitenteTO pesquisarEmitentePorDocumento(EmitenteTO emitenteTO) throws DSENBusinessException {
        EmitenteTO emitente = null;
        try {
            EmitenteEntity entity = this.a.selectByNrDocumento(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO));
            emitente = DSENBusinessConverter.getEmitenteTO((EmitenteEntity)entity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return emitente;
    }

    @DSGETransaction
    public EmitenteTO alterarEmitenteAtual(EmitenteTO emitenteTO) throws DSENBusinessException {
        if (this.a(emitenteTO)) {
            try {
                EmitenteEntity entity = this.a.selectByNrDocumento(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO));
                PropertyUtils.copyProperties((Object)entity, (Object)emitenteTO);
                entity = (EmitenteEntity)this.a.update((Serializable)entity);
                emitenteTO = DSENBusinessConverter.getEmitenteTO((EmitenteEntity)entity);
                emitenteTO.addMessage(MessageFormat.format(DSENMessageConstants.ALTERADO_COM_SUCESSO, emitenteTO.getXNome()));
                EmitenteTO emitenteAtual = (EmitenteTO)AppContext.getInstance().getTO((EnumItf)AppContextEnum.EMITENTE, EmitenteTO.class);
                if (emitenteAtual != null && emitenteAtual.getNrDocumento().equals(emitenteTO.getNrDocumento())) {
                    emitenteAtual = DSENBusinessConverter.getEmitenteTO((EmitenteEntity)entity);
                    AppContext.getInstance().setTO((EnumItf)AppContextEnum.EMITENTE, (BaseTO)emitenteAtual);
                }
            }
            catch (DSENConverterException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSENDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (Exception e) {
                throw new DSENBusinessException((Throwable)e, e.getMessage());
            }
        }
        return emitenteTO;
    }

    @DSGETransaction
    public EmitenteTO alterarEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            emitenteEntity = (EmitenteEntity)this.a.update((Serializable)emitenteEntity);
            return DSENBusinessConverter.getEmitenteTO((EmitenteEntity)emitenteEntity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    @DSGETransaction
    public void salvarPesquisaEmitente(PesquisaEmitenteTO pesquisaEmitenteTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaEmitenteTO.getIdEmitente());
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(pesquisaEmitenteTO.getTelaPesquisaEnum());
            List listPesquisaBanco = this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity);
            List listPesquisaTela = DSENBusinessConverter.getPesquisaEntity((PesquisaEmitenteTO)pesquisaEmitenteTO);
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

    public PesquisaEmitenteTO carregarPesquisaEmitente(EmitenteTO emitenteTO) throws DSENBusinessException {
        PesquisaEmitenteTO pesquisaEmitenteTO = null;
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(TelaPesquisaEnum.EMITENTE);
            pesquisaEmitenteTO = DSENBusinessConverter.getPesquisaEmitenteTO((List)this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity));
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaEmitenteTO;
    }

    private boolean a(EmitenteTO emitente) throws DSENBusinessException {
        boolean isValid = true;
        if (StringHelper.isBlankOrNull((Object)emitente.getNrDocumento())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.CNPJ));
        } else {
            try {
                DSGEDocumentoHelper.validarDocumento((String)emitente.getNrDocumento(), (TipoDocumentoEnum)emitente.getTpDocumentoEnum());
            }
            catch (DSGEValidationException ex) {
                isValid = false;
                emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.CNPJ));
            }
        }
        if (StringHelper.isBlankOrNull((Object)emitente.getRegimeTributarioEnum())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.REGIME_TRIBUTARIO));
        }
        if (StringHelper.isBlankOrNull((Object)emitente.getXNome())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.NOME_RAZAO_SOCIAL));
        } else if (emitente.getXNome().length() > 60 || emitente.getXNome().length() < 2) {
            emitente.addError(DSENMessageConstants.INFNFE_EMIT_XNOME_TAMANHO_INVALIDO);
        }
        if (StringHelper.isBlankOrNull((Object)emitente.getXLgr())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.LOGRADOURO));
        } else if (emitente.getXLgr().length() > 60 || emitente.getXLgr().length() < 2) {
            emitente.addError(DSENMessageConstants.INFNFE_EMIT_ENDEREMIT_XLGR_TAMANHO_INVALIDO);
        }
        if (StringHelper.isBlankOrNull((Object)emitente.getNro())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.NUMERO));
        }
        if (StringHelper.isBlankOrNull((Object)emitente.getXBairro())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.BAIRRO));
        } else if (emitente.getXBairro().length() > 60 || emitente.getXBairro().length() < 2) {
            emitente.addError(DSENMessageConstants.INFNFE_EMIT_ENDEREMIT_XBAIRRO_TAMANHO_INVALIDO);
        }
        if (StringHelper.isBlankOrNull((Object)emitente.getCMun())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.MUNICIPIO));
        }
        if (StringHelper.isBlankOrNull((Object)emitente.getUf())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.UF));
        }
        if (!StringHelper.isBlankOrNull((Object)emitente.getIm()) && StringHelper.isBlankOrNull((Object)emitente.getCnae())) {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.CNAE));
        }
        if (!StringHelper.isBlankOrNull((Object)emitente.getIe())) {
            if (!StringHelper.isBlankOrNull((Object)emitente.getUf())) {
                try {
                    DSGEDocumentoHelper.validarIE((String)emitente.getIe(), (String)emitente.getUf());
                }
                catch (DSGEValidationException ex) {
                    isValid = false;
                    emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.INSCRICAO_ESTADUAL));
                }
            }
        } else {
            isValid = false;
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.INSCRICAO_ESTADUAL));
        }
        if (!StringHelper.isBlankOrNull((Object)emitente.getCnae()) && emitente.getCnae().length() != 7) {
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.CNAE));
            isValid = false;
        }
        if (!StringHelper.isBlankOrNull((Object)emitente.getIest()) && emitente.getIest().length() < 2) {
            emitente.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.IEST));
            isValid = false;
        }
        return isValid;
    }

    public void exportarEmitente(List<EmitenteTO> listaEmitenteTO, ExtensaoArquivoEnum extensaoArquivo, String path) throws DSENBusinessException {
        ArrayList<Object> listaEmitenteTOExpImp = new ArrayList<Object>();
        int totalRegistros = listaEmitenteTO.size();
        int qtdeRegistrosExportados = 0;
        int qtdeArquivosGerados = 0;
        try {
            if (ExtensaoArquivoEnum.TXT.equals((Object)extensaoArquivo)) {
                for (EmitenteTO emitenteTO : listaEmitenteTO) {
                    RegistroA registroA = new RegistroA();
                    registroA.setVersao(emitenteTO.getVersao());
                    listaEmitenteTOExpImp.add((Object)registroA);
                    listaEmitenteTOExpImp.add((Object)emitenteTO);
                }
                DSENRegistroEmitenteConverter converter = new DSENRegistroEmitenteConverter();
                Registro registro = converter.getRegistroFromTOs(listaEmitenteTOExpImp);
                boolean ok = ExportacaoHelper.exportar((String)path, (String)registro.toString());
                if (ok) {
                    qtdeRegistrosExportados += totalRegistros;
                    ++qtdeArquivosGerados;
                }
            } else {
                for (EmitenteTO emitenteTO : listaEmitenteTO) {
                    RegistroA registroA = new RegistroA();
                    registroA.setVersao(emitenteTO.getVersao());
                    listaEmitenteTOExpImp = new ArrayList();
                    listaEmitenteTOExpImp.add((Object)registroA);
                    listaEmitenteTOExpImp.add((Object)emitenteTO);
                    DSENRegistroEmitenteConverter converter = new DSENRegistroEmitenteConverter();
                    Registro registro = converter.getRegistroFromTOs(listaEmitenteTOExpImp);
                    List colRegEmitenteXML = registro.getChildren();
                    for (Registro regClienteXML : colRegEmitenteXML) {
                        String nomeArquivo = !StringHelper.isBlankOrNull((Object)emitenteTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)emitenteTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (String)DocumentoUtil.getNomePadraoArquivoXML((EmitenteTO)emitenteTO));
                        boolean ok = ExportacaoHelper.exportar((String)nomeArquivo, (String)regClienteXML.toXML());
                        if (!ok) continue;
                        ++qtdeRegistrosExportados;
                        ++qtdeArquivosGerados;
                    }
                }
            }
        }
        catch (DSGEConverterException e) {
            a.error((Object)e.getMessage(), (Throwable)e);
            this.a();
        }
        catch (CancelarExportacaoException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosExportados, qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_TOTAIS});
    }

    private void a() {
        Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_EMITENTE_NAO_EXPORTADO, ""), new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_RESULTADO});
    }

    public List<ImportacaoRegistroTO> importarEmitente(ImportacaoTelaTO importacaoTela) {
        return null;
    }

    @DSGETransaction
    public void gerarCopiaSeguranca(EmitenteTO emitenteTO, String path) throws DSENBusinessException {
        try {
            EmitenteEntity entity = this.a.selectFullByNrDocumento(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO));
            String serial = SerializacaoHelper.serializa((Serializable)entity);
            a.debug((Object)(" -- entity.nrDocumento: " + entity.getNrDocumento()));
            a.debug((Object)(" -- serial.size: " + serial.length()));
            IOHelper.writeFile((String)path, (String)serial);
        }
        catch (DSGECommonException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENConverterException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    @DSGETransaction
    public EmitenteTO restaurarCopiaSeguranca(String path, Boolean sobrescrever) throws DSENBusinessException {
        try {
            String serializado = IOHelper.readFile((String)path);
            Serializable copiaRecuperada = SerializacaoHelper.deserializa((String)serializado);
            if (copiaRecuperada.getClass() != EmitenteEntity.class) {
                EmitenteTO emitenteTO = new EmitenteTO();
                emitenteTO.addError(DSENMessageConstants.COPIA_SEGURANCA_ARQUIVO_INVALIDO);
                return emitenteTO;
            }
            EmitenteEntity emitenteEntityRecuperado = (EmitenteEntity)copiaRecuperada;
            a.debug((Object)(" cnpj.recuperado: " + emitenteEntityRecuperado.getNrDocumento()));
            EmitenteEntity emitentePesquisado = this.a.selectFullByNrDocumento(emitenteEntityRecuperado);
            if (emitentePesquisado != null) {
                if (sobrescrever.booleanValue()) {
                    this.a.delete((Serializable)emitentePesquisado);
                } else {
                    String msg = MessageFormat.format(DSENMessageConstants.EMITENTE_BACKUP_JA_EXISTENTE, StringHelper.cnpjFormat((String)emitentePesquisado.getNrDocumento()));
                    EmitenteTO emitenteComErro = new EmitenteTO();
                    emitenteComErro.addMessage(msg);
                    emitenteComErro.setQuestionEnum(QuestionEnum.YES_NO);
                    return emitenteComErro;
                }
            }
            HashMap mapCancelamentos = this.c(emitenteEntityRecuperado.getNotaFiscalEntitySet());
            HashMap mapIcms = this.a(emitenteEntityRecuperado.getProdutoEntitySet());
            HashMap mapIpi = this.b(emitenteEntityRecuperado.getProdutoEntitySet());
            HashMap mapEventos = this.d(emitenteEntityRecuperado.getNotaFiscalEntitySet());
            this.a(emitenteEntityRecuperado);
            this.a.insert((Serializable)emitenteEntityRecuperado);
            this.b(mapCancelamentos, emitenteEntityRecuperado.getNotaFiscalEntitySet());
            this.a(mapIcms, emitenteEntityRecuperado);
            this.b(mapIpi, emitenteEntityRecuperado);
            this.a(mapEventos, emitenteEntityRecuperado.getNotaFiscalEntitySet());
            return DSENBusinessConverter.getEmitenteTO((EmitenteEntity)emitenteEntityRecuperado);
        }
        catch (DSGECommonException ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (Exception ex) {
            a.error((Object)ex.getMessage());
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    private void a(HashMap<String, Set<IcmsEntity>> mapIcms, EmitenteEntity emitenteEntity) {
        Set produtos = emitenteEntity.getProdutoEntitySet();
        if (produtos != null && mapIcms != null && !mapIcms.isEmpty()) {
            for (ProdutoEntity prod : produtos) {
                Set<IcmsEntity> icmsSet = mapIcms.get(prod.getCProd());
                if (icmsSet != null) {
                    for (IcmsEntity icms : icmsSet) {
                        icms.setIdProduto(prod);
                        a.debug((Object)(" limpando id do icms: " + icms.getIdIcms()));
                        icms.setIdIcms(null);
                    }
                }
                HashSet<IcmsEntity> newSet = new HashSet<IcmsEntity>();
                newSet.addAll(icmsSet);
                prod.setIcmsEntitySet(newSet);
            }
        }
    }

    private void b(HashMap<String, Set<IpiEntity>> mapIpi, EmitenteEntity emitenteEntity) {
        Set produtos = emitenteEntity.getProdutoEntitySet();
        if (produtos != null && mapIpi != null && !mapIpi.isEmpty()) {
            for (ProdutoEntity prod : produtos) {
                Set<IpiEntity> IpiSet = mapIpi.get(prod.getCProd());
                if (IpiSet != null) {
                    for (IpiEntity ipi : IpiSet) {
                        ipi.setIdProduto(prod);
                        a.debug((Object)(" limpando id do ipi: " + ipi.getIdIpi()));
                        ipi.setIdIpi(null);
                    }
                }
                HashSet<IpiEntity> newSet = new HashSet<IpiEntity>();
                newSet.addAll(IpiSet);
                prod.setIpiEntitySet(newSet);
            }
        }
    }

    private void a(HashMap<String, Set<EventoEntity>> mapEventos, Set<NotaFiscalEntity> nfes) {
        if (nfes != null && mapEventos != null && mapEventos.size() > 0) {
            for (NotaFiscalEntity nfe : nfes) {
                String key = nfe.getAno() + "-" + nfe.getSerie() + "-" + nfe.getNumero();
                Set<EventoEntity> eventosEntitySet = mapEventos.get(key);
                if (eventosEntitySet == null) continue;
                for (EventoEntity eventoEntity : eventosEntitySet) {
                    a.debug((Object)(" limpando id do evento: " + eventoEntity.getIdEvento()));
                    eventoEntity.setIdEvento(null);
                    eventoEntity.setNotaFiscalEntity(nfe);
                }
                nfe.setEventoEntitySet(eventosEntitySet);
            }
        }
    }

    private void b(HashMap<String, CancelamentoEntity> mapCancelamentos, Set<NotaFiscalEntity> nfes) {
        if (nfes != null && mapCancelamentos != null && mapCancelamentos.size() > 0) {
            for (NotaFiscalEntity nfe : nfes) {
                CancelamentoEntity canc = mapCancelamentos.get(nfe.getAno() + "-" + nfe.getSerie() + "-" + nfe.getNumero());
                if (canc == null) continue;
                canc.setIdNotaFiscal(nfe.getIdNotaFiscal());
                nfe.setCancelamentoEntity(canc);
            }
        }
    }

    private HashMap<String, Set<IcmsEntity>> a(Set<ProdutoEntity> produtos) {
        HashMap<String, Set<IcmsEntity>> map = new HashMap<String, Set<IcmsEntity>>();
        if (produtos != null) {
            for (ProdutoEntity prod : produtos) {
                if (prod.getIcmsEntitySet() == null) continue;
                map.put(prod.getCProd(), prod.getIcmsEntitySet());
                prod.setIcmsEntitySet(null);
            }
        }
        return map;
    }

    private HashMap<String, Set<IpiEntity>> b(Set<ProdutoEntity> produtos) {
        HashMap<String, Set<IpiEntity>> map = new HashMap<String, Set<IpiEntity>>();
        if (produtos != null) {
            for (ProdutoEntity prod : produtos) {
                if (prod.getIpiEntitySet() == null) continue;
                map.put(prod.getCProd(), prod.getIpiEntitySet());
                prod.setIpiEntitySet(null);
            }
        }
        return map;
    }

    private HashMap<String, CancelamentoEntity> c(Set<NotaFiscalEntity> nfes) {
        HashMap<String, CancelamentoEntity> map = new HashMap<String, CancelamentoEntity>();
        if (nfes != null) {
            for (NotaFiscalEntity nfe : nfes) {
                if (nfe.getCancelamentoEntity() == null) continue;
                map.put(nfe.getAno() + "-" + nfe.getSerie() + "-" + nfe.getNumero(), nfe.getCancelamentoEntity());
                a.debug((Object)(" limpando id do cancelamento: " + nfe.getCancelamentoEntity().getIdNotaFiscal()));
                nfe.setCancelamentoEntity(null);
            }
        }
        return map;
    }

    private HashMap<String, Set<EventoEntity>> d(Set<NotaFiscalEntity> nfes) {
        HashMap<String, Set<EventoEntity>> map = new HashMap<String, Set<EventoEntity>>();
        if (nfes != null) {
            for (NotaFiscalEntity nfe : nfes) {
                Set eventosEntitySet = nfe.getEventoEntitySet();
                if (eventosEntitySet != null) {
                    for (EventoEntity eventoEntity : eventosEntitySet) {
                        String key = nfe.getAno() + "-" + nfe.getSerie() + "-" + nfe.getNumero();
                        Set<EventoEntity> eventosMapList = map.get(key);
                        if (eventosMapList == null) {
                            eventosMapList = new HashSet<EventoEntity>();
                            map.put(key, eventosMapList);
                        }
                        eventosMapList.add(eventoEntity);
                    }
                }
                nfe.setEventoEntitySet(null);
            }
        }
        return map;
    }

    private void a(EmitenteEntity emitenteEntity) {
        Set propriedadesList;
        Set inutilizacoesList;
        Set numeracoesList;
        Set pesquisasList;
        Set clientesList;
        Set transList;
        Set prodList;
        Set nfesList;
        emitenteEntity.setIdEmitente(null);
        Set certificadosList = emitenteEntity.getCertificadoInfoEntitySet();
        if (certificadosList != null) {
            for (CertificadoInfoEntity cert : certificadosList) {
                a.debug((Object)(" limpando id do certificado: " + cert.getIdCertificadoInfo()));
                cert.setEmitente(emitenteEntity);
                cert.setIdCertificadoInfo(null);
            }
        }
        if ((clientesList = emitenteEntity.getClienteEntitySet()) != null) {
            for (ClienteEntity cliente : clientesList) {
                a.debug((Object)(" limpando id do cliente: " + cliente.getIdCliente()));
                cliente.setIdEmitente(emitenteEntity);
                cliente.setIdCliente(null);
            }
        }
        if ((pesquisasList = emitenteEntity.getPesquisaEntitySet()) != null) {
            for (PesquisaEntity pesquisa : pesquisasList) {
                a.debug((Object)(" limpando id da pesquisa: " + pesquisa.getIdPesquisa()));
                pesquisa.setIdEmitente(emitenteEntity);
                pesquisa.setIdPesquisa(null);
            }
        }
        if ((transList = emitenteEntity.getTransportadoraEntitySet()) != null) {
            for (TransportadoraEntity trans : transList) {
                a.debug((Object)(" limpando id da transportadora: " + trans.getIdTransportadora()));
                trans.setIdEmitente(emitenteEntity);
                trans.setIdTransportadora(null);
            }
        }
        if ((prodList = emitenteEntity.getProdutoEntitySet()) != null) {
            for (ProdutoEntity prod : prodList) {
                a.debug((Object)(" limpando id do produto: " + prod.getIdProduto()));
                prod.setIdProduto(null);
                prod.setIdEmitente(emitenteEntity);
            }
        }
        if ((propriedadesList = emitenteEntity.getPropriedadeEntitySet()) != null) {
            for (PropriedadeEntity prop : propriedadesList) {
                a.debug((Object)(" limpando id da propriedade: " + prop.getIdPropriedade()));
                prop.setIdEmitente(emitenteEntity);
                prop.setIdPropriedade(null);
            }
        }
        if ((numeracoesList = emitenteEntity.getNumeracaoEntitySet()) != null) {
            for (NumeracaoEntity num : numeracoesList) {
                a.debug((Object)(" limpando id da numeracao: " + num.getIdNumeracao()));
                num.setIdEmitente(emitenteEntity);
                num.setIdNumeracao(null);
            }
        }
        if ((inutilizacoesList = emitenteEntity.getInutilizacaoEntitySet()) != null) {
            for (InutilizacaoEntity inut : inutilizacoesList) {
                a.debug((Object)(" limpando id da inutilizacao: " + inut.getIdInutilizacao()));
                inut.setEmitenteEntity(emitenteEntity);
                inut.setIdInutilizacao(null);
            }
        }
        if ((nfesList = emitenteEntity.getNotaFiscalEntitySet()) != null) {
            for (NotaFiscalEntity nfe : nfesList) {
                a.debug((Object)(" limpando id da nfe: " + nfe.getIdNotaFiscal()));
                nfe.setIdNotaFiscal(null);
                nfe.setEmitenteEntity(emitenteEntity);
                if (nfe.getLoteEntity() == null) continue;
                a.debug((Object)(" limpando id do lote: " + nfe.getLoteEntity().getIdLote()));
                nfe.getLoteEntity().setIdLote(null);
            }
        }
    }
}

