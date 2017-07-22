/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaTransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.model.business.TransportadoraBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroTransportadoraConverter
 *  br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO
 *  br.gov.sp.fazenda.dsen.model.dao.TransportadoraDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity
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
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaTransportadoraTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroTransportadoraConverter;
import br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA;
import br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO;
import br.gov.sp.fazenda.dsen.model.dao.TransportadoraDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity;
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
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExportacaoHelper;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEConverterException;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TransportadoraBusiness {
    private TransportadoraDAO a;
    private PesquisaDAO a = new PesquisaDAO();

    @DSGETransaction
    public TransportadoraTO excluirTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        try {
            TransportadoraEntity entity = null;
            entity = DSENBusinessConverter.getTransportadoraEntity((TransportadoraTO)transportadoraTO);
            this.a.delete((Serializable)entity);
            transportadoraTO.addMessage(MessageFormat.format(DSENMessageConstants.EXCLUIDO_COM_SUCESSO, transportadoraTO.getXNome()));
        }
        catch (DSGEDAOException ex1) {
            throw new DSENBusinessException((DSGEBaseException)ex1, ex1.getMessage());
        }
        catch (DSENConverterException ex2) {
            throw new DSENBusinessException((DSGEBaseException)ex2, ex2.getMessage());
        }
        return transportadoraTO;
    }

    @DSGETransaction
    public List<TransportadoraTO> excluirTransportadora(List<TransportadoraTO> transportadoraTOList) throws DSENBusinessException {
        ArrayList<TransportadoraTO> lista = null;
        if (transportadoraTOList != null) {
            lista = new ArrayList<TransportadoraTO>();
            for (int i = 0; i < transportadoraTOList.size(); ++i) {
                TransportadoraTO transportadora = transportadoraTOList.get(i);
                lista.add(this.excluirTransportadora(transportadora));
            }
        }
        return lista;
    }

    @DSGETransaction
    public TransportadoraTO incluirTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        if (this.a(transportadoraTO)) {
            try {
                transportadoraTO.setVersao(DSENProperties.getInstance().getVersaoSchemaSistema());
                TransportadoraEntity entity = DSENBusinessConverter.getTransportadoraEntity((TransportadoraTO)transportadoraTO);
                TransportadoraEntity duplicatedTransportadoraEntity = this.a.selectByNrDocumento(entity);
                if (duplicatedTransportadoraEntity != null) {
                    transportadoraTO.addError(MessageFormat.format(DSENMessageConstants.JA_CADASTRADO, transportadoraTO.getNrDocumento()));
                } else {
                    this.a.insert((Serializable)entity);
                    transportadoraTO = DSENBusinessConverter.getTransportadoraTO((TransportadoraEntity)entity);
                    transportadoraTO.addMessage(MessageFormat.format(DSENMessageConstants.INCLUIDO_COM_SUCESSO, transportadoraTO.getXNome()));
                }
            }
            catch (DSENDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSGEDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSENConverterException ex1) {
                throw new DSENBusinessException((DSGEBaseException)ex1, ex1.getMessage());
            }
        }
        return transportadoraTO;
    }

    public List<TransportadoraTO> pesquisarTransportadora(TransportadoraTO transportadoraTO, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENBusinessException {
        List lista = null;
        try {
            TransportadoraEntity entity = null;
            entity = DSENBusinessConverter.getTransportadoraEntity((TransportadoraTO)transportadoraTO);
            lista = DSENBusinessConverter.converteListaTransportadora((List)this.a.selectTransportadora(entity, sortColumns, start, maxResults));
        }
        catch (DSENDAOException ex1) {
            throw new DSENBusinessException((DSGEBaseException)ex1, ex1.getMessage());
        }
        catch (DSENConverterException ex2) {
            throw new DSENBusinessException((DSGEBaseException)ex2, ex2.getMessage());
        }
        return lista;
    }

    public Integer getCountTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        try {
            TransportadoraEntity entity = DSENBusinessConverter.getTransportadoraEntity((TransportadoraTO)transportadoraTO);
            return this.a.getCountTransportadora(entity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    public TransportadoraTO pesquisarTransportadoraPorDocumento(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        TransportadoraTO transportadora = null;
        try {
            TransportadoraEntity entity = this.a.selectByNrDocumento(DSENBusinessConverter.getTransportadoraEntity((TransportadoraTO)transportadoraTO));
            transportadora = DSENBusinessConverter.getTransportadoraTO((TransportadoraEntity)entity);
        }
        catch (DSENDAOException ex1) {
            throw new DSENBusinessException((DSGEBaseException)ex1, ex1.getMessage());
        }
        catch (DSENConverterException ex2) {
            throw new DSENBusinessException((DSGEBaseException)ex2, ex2.getMessage());
        }
        return transportadora;
    }

    @DSGETransaction
    public TransportadoraTO alterarTransportadora(TransportadoraTO transportadoraTO) throws DSENBusinessException {
        if (this.a(transportadoraTO)) {
            try {
                TransportadoraEntity duplicatedTransportadoraEntity;
                TransportadoraEntity entity = null;
                entity = DSENBusinessConverter.getTransportadoraEntity((TransportadoraTO)transportadoraTO);
                TransportadoraEntity transportadoraEntity = duplicatedTransportadoraEntity = !StringHelper.isBlankOrNull((Object)entity.getNrDocumento()) ? this.a.selectByNrDocumento(entity) : null;
                if (duplicatedTransportadoraEntity != null && !duplicatedTransportadoraEntity.getIdTransportadora().equals(entity.getIdTransportadora())) {
                    transportadoraTO.addError(MessageFormat.format(DSENMessageConstants.JA_CADASTRADO, transportadoraTO.getNrDocumento()));
                } else {
                    entity = (TransportadoraEntity)this.a.update((Serializable)entity);
                    transportadoraTO.addMessage(MessageFormat.format(DSENMessageConstants.ALTERADO_COM_SUCESSO, transportadoraTO.getXNome()));
                }
            }
            catch (DSGEDAOException ex1) {
                throw new DSENBusinessException((DSGEBaseException)ex1, ex1.getMessage());
            }
            catch (DSENConverterException ex2) {
                throw new DSENBusinessException((DSGEBaseException)ex2, ex2.getMessage());
            }
            catch (DSENDAOException e) {
                throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
            }
        }
        return transportadoraTO;
    }

    @DSGETransaction
    public void salvarPesquisaTransportadora(PesquisaTransportadoraTO pesquisaTransportadoraTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaTransportadoraTO.getIdEmitente());
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(pesquisaTransportadoraTO.getTelaPesquisaEnum());
            List listPesquisaBanco = this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity);
            List listPesquisaTela = DSENBusinessConverter.getPesquisaEntity((PesquisaTransportadoraTO)pesquisaTransportadoraTO);
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

    public PesquisaTransportadoraTO carregarPesquisaTransportadora(EmitenteTO emitenteTO) throws DSENBusinessException {
        PesquisaTransportadoraTO pesquisaTransportadoraTO = null;
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(TelaPesquisaEnum.TRANSPORTADORA);
            pesquisaTransportadoraTO = DSENBusinessConverter.getPesquisaTransportadoraTO((List)this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity));
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaTransportadoraTO;
    }

    private boolean a(TransportadoraTO transportadora) {
        boolean isValid = true;
        if (transportadora.getTpDocumentoEnum() == null && !StringHelper.isBlankOrNull((Object)transportadora.getNrDocumento())) {
            isValid = false;
            transportadora.addError(MessageFormat.format(DSENMessageConstants.CAMPO_X_PREENCHIMENTO_OBRIGATORIO, DSENLabelConstants.TIPO_DE_DOCUMENTO));
        }
        if (transportadora.getTpDocumentoEnum() != null && !StringHelper.isBlankOrNull((Object)transportadora.getNrDocumento())) {
            try {
                DSGEDocumentoHelper.validarDocumento((String)transportadora.getNrDocumento(), (TipoDocumentoEnum)transportadora.getTpDocumentoEnum());
            }
            catch (DSGEValidationException ex) {
                isValid = false;
                transportadora.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, new Object[]{transportadora.getTpDocumentoEnum()}));
            }
        }
        if (StringHelper.isBlankOrNull((Object)transportadora.getXNome())) {
            isValid = false;
            transportadora.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.NOME_RAZAO_SOCIAL));
        }
        if (!StringHelper.isBlankOrNull((Object)transportadora.getIe()) && !DSENConstants.ISENTO.equalsIgnoreCase(transportadora.getIe())) {
            if (StringHelper.isBlankOrNull((Object)transportadora.getUf())) {
                transportadora.addError(MessageFormat.format(DSENMessageConstants.CAMPO_OBRIGATORIO, DSENLabelConstants.UF));
                isValid = false;
            } else {
                try {
                    DSGEDocumentoHelper.validarIE((String)transportadora.getIe(), (String)transportadora.getUf());
                }
                catch (DSGEValidationException ex) {
                    isValid = false;
                    transportadora.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.INSCRICAO_ESTADUAL));
                }
            }
        }
        return isValid;
    }

    public void exportarTransportadora(List<TransportadoraTO> listaTransportadoraTO, ExtensaoArquivoEnum extensaoArquivo, String path) throws DSENBusinessException {
        ArrayList<Object> listaTransportadoraTOExpImp = new ArrayList<Object>();
        int totalRegistros = listaTransportadoraTO.size();
        int qtdeRegistrosExportados = 0;
        int qtdeArquivosGerados = 0;
        try {
            if (ExtensaoArquivoEnum.TXT.equals((Object)extensaoArquivo)) {
                for (TransportadoraTO transportadoraTO : listaTransportadoraTO) {
                    RegistroA registroA = new RegistroA();
                    registroA.setVersao(transportadoraTO.getVersao());
                    listaTransportadoraTOExpImp.add((Object)registroA);
                    listaTransportadoraTOExpImp.add((Object)transportadoraTO);
                }
                DSENRegistroTransportadoraConverter converter = new DSENRegistroTransportadoraConverter();
                Registro registro = converter.getRegistroFromTOs(listaTransportadoraTOExpImp);
                boolean ok = ExportacaoHelper.exportar((String)path, (String)registro.toString());
                if (ok) {
                    qtdeRegistrosExportados += totalRegistros;
                    ++qtdeArquivosGerados;
                }
            } else {
                for (TransportadoraTO transportadoraTO : listaTransportadoraTO) {
                    RegistroA registroA = new RegistroA();
                    registroA.setVersao(transportadoraTO.getVersao());
                    listaTransportadoraTOExpImp = new ArrayList();
                    listaTransportadoraTOExpImp.add((Object)registroA);
                    listaTransportadoraTOExpImp.add((Object)transportadoraTO);
                    DSENRegistroTransportadoraConverter converter = new DSENRegistroTransportadoraConverter();
                    Registro registro = converter.getRegistroFromTOs(listaTransportadoraTOExpImp);
                    List colRegEmitenteXML = registro.getChildren();
                    for (Registro regTranspXML : colRegEmitenteXML) {
                        String nomeArquivo = !StringHelper.isBlankOrNull((Object)transportadoraTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)transportadoraTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (String)DocumentoUtil.getNomePadraoArquivoXML((TransportadoraTO)transportadoraTO));
                        boolean ok = ExportacaoHelper.exportar((String)nomeArquivo, (String)regTranspXML.toXML());
                        if (!ok) continue;
                        ++qtdeRegistrosExportados;
                        ++qtdeArquivosGerados;
                    }
                }
            }
        }
        catch (DSGEConverterException e) {
            e.printStackTrace();
            this.a();
        }
        catch (CancelarExportacaoException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosExportados, qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_TOTAIS});
    }

    private void a() {
        Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_TRANSPORTADORA_NAO_EXPORTADA, ""), new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_RESULTADO});
    }

    public List<ImportacaoRegistroTO> importarTransportadora(ImportacaoTelaTO importacaoTela) {
        return null;
    }
}

