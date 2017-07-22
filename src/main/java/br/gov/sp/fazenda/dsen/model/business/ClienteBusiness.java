/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO
 *  br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO$TipoConsultaEnum
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta$ErroXmlRespostaAcao
 *  br.gov.sp.fazenda.dsen.model.business.ClienteBusiness
 *  br.gov.sp.fazenda.dsen.model.business.ClienteBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.WSBusiness
 *  br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroClienteConverter
 *  br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.ClienteDAO
 *  br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO
 *  br.gov.sp.fazenda.dsen.model.entity.ClienteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsen.util.DSENUtilHelper
 *  br.gov.sp.fazenda.dsge.common.app.AppContext
 *  br.gov.sp.fazenda.dsge.common.app.Notificador
 *  br.gov.sp.fazenda.dsge.common.enumeration.EnumItf
 *  br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum
 *  br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao
 *  br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf
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
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.AppContextEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.WSStatusRetorno;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.ConsultaCadastroTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsen.model.business.ClienteBusiness;
import br.gov.sp.fazenda.dsen.model.business.WSBusiness;
import br.gov.sp.fazenda.dsen.model.business.expimp.DSENRegistroClienteConverter;
import br.gov.sp.fazenda.dsen.model.business.expimp.RegistroA;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.ClienteDAO;
import br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO;
import br.gov.sp.fazenda.dsen.model.entity.ClienteEntity;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsen.util.DSENUtilHelper;
import br.gov.sp.fazenda.dsge.common.app.AppContext;
import br.gov.sp.fazenda.dsge.common.app.Notificador;
import br.gov.sp.fazenda.dsge.common.enumeration.EnumItf;
import br.gov.sp.fazenda.dsge.common.enumeration.GrupoNotificacaoEnum;
import br.gov.sp.fazenda.dsge.common.enumeration.ProblemaConexaoAcao;
import br.gov.sp.fazenda.dsge.common.enumeration.ServicoSefazEnumItf;
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
import br.gov.sp.fazenda.dsge.util.EstadoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ClienteBusiness {
    private ClienteDAO a;
    private PesquisaDAO a = new PesquisaDAO();

    @DSGETransaction
    public ClienteTO excluirCliente(ClienteTO clienteTO) throws DSENBusinessException {
        try {
            ClienteEntity entity = DSENBusinessConverter.getClienteEntity((ClienteTO)clienteTO);
            this.a.delete((Serializable)entity);
            clienteTO.addMessage(MessageFormat.format(DSENMessageConstants.EXCLUIDO_COM_SUCESSO, clienteTO.getXNome()));
            return clienteTO;
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSGEDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    @DSGETransaction
    public List<ClienteTO> excluirCliente(List<ClienteTO> clienteTOList) throws DSENBusinessException {
        ArrayList<ClienteTO> lista = null;
        if (clienteTOList != null) {
            lista = new ArrayList<ClienteTO>();
            for (int i = 0; i < clienteTOList.size(); ++i) {
                ClienteTO cliente = clienteTOList.get(i);
                lista.add(this.excluirCliente(cliente));
            }
        }
        return lista;
    }

    @DSGETransaction
    public ClienteTO incluirCliente(ClienteTO clienteTO) throws DSENBusinessException {
        if (this.a(clienteTO)) {
            try {
                clienteTO.setVersao(DSENProperties.getInstance().getVersaoSchemaSistema());
                ClienteEntity entity = DSENBusinessConverter.getClienteEntity((ClienteTO)clienteTO);
                ClienteEntity duplicatedClienteEntity = this.a.selectByNrDocumentoIE(entity);
                if (duplicatedClienteEntity != null) {
                    if (clienteTO.getIe() == null) {
                        clienteTO.addError(MessageFormat.format(DSENMessageConstants.JA_CADASTRADO, "Cliente com CPF: " + clienteTO.getNrDocumento() + " e sem IE preenchida"));
                    } else {
                        clienteTO.addError(MessageFormat.format(DSENMessageConstants.JA_CADASTRADO, "Cliente com CPF: " + clienteTO.getNrDocumento() + " e IE: " + clienteTO.getIeFormatada()));
                    }
                } else {
                    this.a.insert((Serializable)entity);
                    clienteTO = DSENBusinessConverter.getClienteTO((ClienteEntity)entity);
                    clienteTO.addMessage(MessageFormat.format(DSENMessageConstants.INCLUIDO_COM_SUCESSO, clienteTO.getXNome()));
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
        return clienteTO;
    }

    public List<ClienteTO> pesquisarCliente(ClienteTO clienteTO, LinkedHashMap<String, Boolean> sortColumns, int start, int maxResults) throws DSENBusinessException {
        List lista = null;
        try {
            ClienteEntity entity = DSENBusinessConverter.getClienteEntity((ClienteTO)clienteTO);
            lista = DSENBusinessConverter.converteListaCliente((List)this.a.selectCliente(entity, sortColumns, start, maxResults));
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return lista;
    }

    public Integer getCountCliente(ClienteTO clienteTO) throws DSENBusinessException {
        try {
            ClienteEntity entity = DSENBusinessConverter.getClienteEntity((ClienteTO)clienteTO);
            return this.a.getCountCliente(entity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
    }

    public ClienteTO pesquisarClientePorDocumento(ClienteTO clienteTO) throws DSENBusinessException {
        ClienteTO cliente = null;
        try {
            ClienteEntity entity = this.a.selectByNrDocumento(DSENBusinessConverter.getClienteEntity((ClienteTO)clienteTO));
            cliente = DSENBusinessConverter.getClienteTO((ClienteEntity)entity);
        }
        catch (DSENConverterException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        catch (DSENDAOException ex) {
            throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
        }
        return cliente;
    }

    @DSGETransaction
    public ClienteTO alterarCliente(ClienteTO clienteTO) throws DSENBusinessException {
        if (this.a(clienteTO)) {
            try {
                ClienteEntity entity = DSENBusinessConverter.getClienteEntity((ClienteTO)clienteTO);
                entity = (ClienteEntity)this.a.update((Serializable)entity);
                clienteTO = DSENBusinessConverter.getClienteTO((ClienteEntity)entity);
                clienteTO.addMessage(MessageFormat.format(DSENMessageConstants.ALTERADO_COM_SUCESSO, clienteTO.getXNome()));
            }
            catch (DSENConverterException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
            catch (DSGEDAOException ex) {
                throw new DSENBusinessException((DSGEBaseException)ex, ex.getMessage());
            }
        }
        return clienteTO;
    }

    @DSGETransaction
    public void salvarPesquisaCliente(PesquisaClienteTO pesquisaClienteTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaClienteTO.getIdEmitente());
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(pesquisaClienteTO.getTelaPesquisaEnum());
            List listPesquisaBanco = this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity);
            List listPesquisaTela = DSENBusinessConverter.getPesquisaEntity((PesquisaClienteTO)pesquisaClienteTO);
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

    public PesquisaClienteTO carregarPesquisaCliente(EmitenteTO emitenteTO) throws DSENBusinessException {
        PesquisaClienteTO pesquisaClienteTO = null;
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(TelaPesquisaEnum.CLIENTE);
            pesquisaClienteTO = DSENBusinessConverter.getPesquisaClienteTO((List)this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity));
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaClienteTO;
    }

    private boolean a(ClienteTO clienteTO) {
        boolean isValido = true;
        if (StringHelper.isBlankOrNull((Object)clienteTO.getXNome())) {
            isValido = false;
            clienteTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_X_PREENCHIMENTO_OBRIGATORIO, DSENLabelConstants.NOME_RAZAO_SOCIAL));
        }
        if (clienteTO.getTpDocumentoEnum() == null && !StringHelper.isBlankOrNull((Object)clienteTO.getNrDocumento())) {
            isValido = false;
            clienteTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_X_PREENCHIMENTO_OBRIGATORIO, DSENLabelConstants.TIPO_DE_DOCUMENTO));
        }
        if (clienteTO.getTpDocumentoEnum() != null && !StringHelper.isBlankOrNull((Object)clienteTO.getNrDocumento())) {
            try {
                DSGEDocumentoHelper.validarDocumento((String)clienteTO.getNrDocumento(), (TipoDocumentoEnum)clienteTO.getTpDocumentoEnum());
            }
            catch (DSGEValidationException ex) {
                isValido = false;
                clienteTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.CNPJ_CPF));
            }
        }
        if (!StringHelper.isBlankOrNull((Object)clienteTO.getIe()) && !DSENConstants.ISENTO.equalsIgnoreCase(clienteTO.getIe())) {
            if (StringHelper.isBlankOrNull((Object)clienteTO.getUf())) {
                isValido = false;
                clienteTO.addError(DSENMessageConstants.INFORMAR_A_UF);
            } else {
                try {
                    DSGEDocumentoHelper.validarIE((String)clienteTO.getIe(), (String)clienteTO.getUf());
                }
                catch (DSGEValidationException ex) {
                    isValido = false;
                    clienteTO.addError(MessageFormat.format(DSENMessageConstants.CAMPO_INVALIDO, DSENLabelConstants.INSCRICAO_ESTADUAL));
                }
            }
        }
        if (!StringHelper.isBlankOrNull((Object)clienteTO.getIsuf())) {
            if (clienteTO.getIsuf().matches("[0-9]{8,9}")) {
                if ("AC".equals(clienteTO.getUf()) || "AM".equals(clienteTO.getUf()) || "RO".equals(clienteTO.getUf()) || "RR".equals(clienteTO.getUf()) || "AP".equals(clienteTO.getUf()) && !StringHelper.isBlankOrNull((Object)clienteTO.getCMun()) && (DSENConstants.CODIGO_MUNICIPIO_AP_MACAPA.equals(clienteTO.getCMun()) || DSENConstants.CODIGO_MUNICIPIO_AP_SANTANA.equals(clienteTO.getCMun()))) {
                    try {
                        DSGEDocumentoHelper.validarIE((String)clienteTO.getIesuf(), (String)"SU");
                    }
                    catch (DSGEValidationException ex) {
                        isValido = false;
                        clienteTO.addError(DSENMessageConstants.SUFRAMA_INVALIDA);
                    }
                } else {
                    isValido = false;
                    clienteTO.addError(DSENMessageConstants.ERRO_UF_MUN_NAO_PERTENCE_SUFRAMA);
                }
            } else {
                isValido = false;
                clienteTO.addError(DSENMessageConstants.SUFRAMA_INVALIDA);
            }
        }
        return isValido;
    }

    public void exportarCliente(List<ClienteTO> listaClienteTO, ExtensaoArquivoEnum extensaoArquivo, String path) throws DSENBusinessException {
        ArrayList<Object> listaClienteTOExpImp = new ArrayList<Object>();
        int totalRegistros = listaClienteTO.size();
        int qtdeRegistrosExportados = 0;
        int qtdeArquivosGerados = 0;
        try {
            if (ExtensaoArquivoEnum.TXT.equals((Object)extensaoArquivo)) {
                for (ClienteTO clienteTO : listaClienteTO) {
                    RegistroA registroA = new RegistroA();
                    registroA.setVersao(clienteTO.getVersao());
                    listaClienteTOExpImp.add((Object)registroA);
                    listaClienteTOExpImp.add((Object)clienteTO);
                }
                DSENRegistroClienteConverter clienteConverter = new DSENRegistroClienteConverter();
                Registro registro = clienteConverter.getRegistroFromTOs(listaClienteTOExpImp);
                boolean ok = ExportacaoHelper.exportar((String)path, (String)registro.toString());
                if (ok) {
                    qtdeRegistrosExportados += totalRegistros;
                    ++qtdeArquivosGerados;
                }
            } else {
                for (ClienteTO clienteTO : listaClienteTO) {
                    RegistroA registroA = new RegistroA();
                    registroA.setVersao(clienteTO.getVersao());
                    listaClienteTOExpImp = new ArrayList();
                    listaClienteTOExpImp.add((Object)registroA);
                    listaClienteTOExpImp.add((Object)clienteTO);
                    DSENRegistroClienteConverter clienteConverter = new DSENRegistroClienteConverter();
                    Registro registro = clienteConverter.getRegistroFromTOs(listaClienteTOExpImp);
                    List colRegClienteXML = registro.getChildren();
                    for (Registro regClienteXML : colRegClienteXML) {
                        String nomeArquivo = !StringHelper.isBlankOrNull((Object)clienteTO.getNomeArquivoXml()) ? DocumentoUtil.montaNomeArquivoXML((String)path, (String)clienteTO.getNomeArquivoXml()) : DocumentoUtil.montaNomeArquivoXML((String)path, (String)DocumentoUtil.getNomePadraoArquivoXML((ClienteTO)clienteTO));
                        boolean ok = ExportacaoHelper.exportar((String)nomeArquivo, (String)regClienteXML.toXML());
                        if (!ok) continue;
                        ++qtdeRegistrosExportados;
                        ++qtdeArquivosGerados;
                    }
                }
            }
        }
        catch (DSGEConverterException e) {
            this.a();
        }
        catch (CancelarExportacaoException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
        Notificador.getInstance().notificar((Object)new int[]{totalRegistros, qtdeRegistrosExportados, qtdeArquivosGerados}, new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_TOTAIS});
    }

    private void a() {
        Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_CLIENTE_NAO_EXPORTADO, ""), new EnumItf[]{GrupoNotificacaoEnum.EXPORTACAO_RESULTADO});
    }

    public void validarDadosParaConsultaCadastro(ConsultaCadastroTO consultaCadastroTO) {
        if (StringHelper.isBlankOrNull((Object)consultaCadastroTO.getIeSuframa()) && StringHelper.isBlankOrNull((Object)consultaCadastroTO.getIE()) && StringHelper.isBlankOrNull((Object)consultaCadastroTO.getCNPJ().trim().replace(".", "").replace("/", "").replace("-", ""))) {
            switch (1.a[consultaCadastroTO.getTipoConsultaEnum().ordinal()]) {
                case 1: {
                    consultaCadastroTO.addError(DSENMessageConstants.MSG_IE_OU_SUFRAMA_DEVE_SER_INFORMADA);
                    break;
                }
                case 2: {
                    consultaCadastroTO.addError(DSENMessageConstants.MSG_IE_DEVE_SER_INFORMADA);
                }
            }
            return;
        }
        if (!StringHelper.isBlankOrNull((Object)consultaCadastroTO.getIE())) {
            if (StringHelper.isBlankOrNull((Object)consultaCadastroTO.getUf())) {
                consultaCadastroTO.addError(DSENMessageConstants.MSG_UF_DEVE_SER_INFORMADA);
            } else if (DSENConstants.ISENTO.equalsIgnoreCase(consultaCadastroTO.getIE())) {
                consultaCadastroTO.addError(DSENMessageConstants.MSG_CONS_CAD_ISENTO_INVALIDO);
            } else {
                try {
                    DSGEDocumentoHelper.validarIE((String)consultaCadastroTO.getIE(), (String)consultaCadastroTO.getUf());
                }
                catch (DSGEValidationException e) {
                    consultaCadastroTO.addError(MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_IE_INVALIDA, consultaCadastroTO.getIE(), "cadastro", consultaCadastroTO.getUf()));
                }
            }
        }
        if (!StringHelper.isBlankOrNull((Object)consultaCadastroTO.getIeSuframa())) {
            try {
                DSGEDocumentoHelper.validarIE((String)consultaCadastroTO.getIeSuframa(), (String)"SU");
            }
            catch (DSGEValidationException e) {
                consultaCadastroTO.addError(MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_IESU_INVALIDA, consultaCadastroTO.getIeSuframa(), "cadastro"));
            }
        }
        if (!StringHelper.isBlankOrNull((Object)consultaCadastroTO.getCNPJ().trim().replace(".", "").replace("/", "").replace("-", ""))) {
            try {
                DSGEDocumentoHelper.validarDocumento((String)consultaCadastroTO.getCNPJ(), (TipoDocumentoEnum)TipoDocumentoEnum.CNPJ);
            }
            catch (DSGEValidationException e) {
                consultaCadastroTO.addError(MessageFormat.format(DSENMessageConstants.MSG_IMPORTACAO_CNPJ_INVALIDO, consultaCadastroTO.getCNPJ(), "cadastro", consultaCadastroTO.getUf()));
            }
            if (StringHelper.isBlankOrNull((Object)consultaCadastroTO.getUf())) {
                consultaCadastroTO.addError(DSENMessageConstants.MSG_UF_DEVE_SER_INFORMADA);
            }
        }
    }

    public List<ConsultaCadastroTO> consultarCadastro(ConsultaCadastroTO consultaCadastroTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        try {
            EstadoTO estadoTO;
            ConsultaCadastroTO consultado;
            ArrayList<ConsultaCadastroTO> listaConsultaCadastroTO = new ArrayList<ConsultaCadastroTO>();
            if (!(StringHelper.isBlankOrNull((Object)consultaCadastroTO.getIE()) && StringHelper.isBlankOrNull((Object)consultaCadastroTO.getCNPJ()) || (consultado = this.a(consultaCadastroTO, estadoTO = DSENUtilHelper.getInstance().getEstadoTOBySigla(consultaCadastroTO.getUf()), certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey())) == null)) {
                listaConsultaCadastroTO.add(consultado);
            }
            if (!StringHelper.isBlankOrNull((Object)consultaCadastroTO.getIeSuframa())) {
                ConsultaCadastroTO consultaCadastroSuframa = (ConsultaCadastroTO)consultaCadastroTO.clone();
                consultaCadastroSuframa.setUf("SU");
                EstadoTO estadoTO2 = DSENUtilHelper.getInstance().getEstadoTOBySigla(consultaCadastroSuframa.getUf());
                ConsultaCadastroTO consultado2 = this.a(consultaCadastroSuframa, estadoTO2, certificadoTO.getX509Certificate(), certificadoTO.getPrivateKey());
                if (consultado2 != null) {
                    listaConsultaCadastroTO.add(consultado2);
                }
            }
            return listaConsultaCadastroTO.isEmpty() ? null : listaConsultaCadastroTO;
        }
        catch (DSGEUtilException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (CloneNotSupportedException e) {
            throw new DSENBusinessException((Throwable)e, e.getMessage());
        }
    }

    private ConsultaCadastroTO a(ConsultaCadastroTO consultaCadastroTO, EstadoTO estadoTO, X509Certificate certificate, PrivateKey privateKey) {
        block12 : {
            try {
                WSBusiness wsbusiness = new WSBusiness();
                ConsultaCadastroTO cadastroConsultado = new ConsultaCadastroTO();
                String url = DSENUtilHelper.getInstance().getURLPorUF(estadoTO, (ServicoSefazEnumItf)ServicoSefazEnum.ConsultaCadastro);
                if (StringHelper.isBlankOrNull((Object)url)) {
                    Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_X_NAO_POSSUI_CONSULTA_CADASTRO, estadoTO.getNome()), new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.ERRO_FATAL});
                    return null;
                }
                String xmlEnvio = DocumentoUtil.criarConsCadDocument((ConsultaCadastroTO)consultaCadastroTO);
                String consultaCadastroRetorno = wsbusiness.servico(DocumentoUtil.criarCabecalhoMensagem((ServicoSefazEnum)ServicoSefazEnum.ConsultaCadastro, (String)estadoTO.getCodigo(), (String)DSENProperties.getInstance().getVersaoSchemaConsultaCadastro()), xmlEnvio, estadoTO, ServicoSefazEnum.ConsultaCadastro, certificate, privateKey);
                WSStatusRetorno statusRetorno = DocumentoUtil.validarRetornoConsultaCadastro((String)consultaCadastroRetorno, (ConsultaCadastroTO)cadastroConsultado);
                switch (1.b[statusRetorno.ordinal()]) {
                    case 1: {
                        ErroXmlResposta erroXmlResposta = new ErroXmlResposta(ServicoSefazEnum.ConsultaCadastro, url, xmlEnvio, consultaCadastroRetorno, DSENMessageConstants.MSG_WS_SEFAZ);
                        Notificador.getInstance().notificar((Object)erroXmlResposta, new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.ERRO_RESPOSTA_CONSULTA_CADASTRO});
                        ErroXmlResposta.ErroXmlRespostaAcao acao = (ErroXmlResposta.ErroXmlRespostaAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.ERRO_XML_RETORNO_ACAO, ErroXmlResposta.ErroXmlRespostaAcao.class);
                        if (ErroXmlResposta.ErroXmlRespostaAcao.FECHAR.equals((Object)acao)) {
                            return null;
                        }
                        break block12;
                    }
                }
                return cadastroConsultado;
            }
            catch (DSGEConnectionClientException e) {
                Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_CLIENT, DSENMessageConstants.MSG_WS_SEFAZ), new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.CONSULTA_CADASTRO_ERRO});
                return this.b(consultaCadastroTO, estadoTO, certificate, privateKey);
            }
            catch (DSGEConnectionServerException e) {
                Notificador.getInstance().notificar((Object)MessageFormat.format(DSENMessageConstants.MSG_WS_CONEXAO_INEXISTENTE_SERVER, DSENMessageConstants.MSG_WS_SEFAZ), new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.CONSULTA_CADASTRO_ERRO});
                return this.b(consultaCadastroTO, estadoTO, certificate, privateKey);
            }
            catch (DSGETimeoutException e) {
                Notificador.getInstance().notificar((Object)DSENMessageConstants.MSG_WS_CONEXAO_TIMEOUT, new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.CONSULTA_CADASTRO_ERRO});
                return this.b(consultaCadastroTO, estadoTO, certificate, privateKey);
            }
            catch (DSGESocketException e) {
                Notificador.getInstance().notificar((Object)DSENMessageConstants.MSG_WS_SOCKET, new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.CONSULTA_CADASTRO_ERRO});
                return this.b(consultaCadastroTO, estadoTO, certificate, privateKey);
            }
            catch (DSGEProxyException e) {
                Notificador.getInstance().notificar((Object)DSENMessageConstants.MSG_WS_PROXY, new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.ERRO_FATAL});
            }
            catch (Throwable e) {
                DSENBusinessException businessException = new DSENBusinessException(e, e.getMessage());
                Notificador.getInstance().notificar((Object)businessException, new EnumItf[]{br.gov.sp.fazenda.dsen.common.enumeration.GrupoNotificacaoEnum.EXCEPTION});
            }
        }
        return null;
    }

    private ConsultaCadastroTO b(ConsultaCadastroTO consultaCadastroTO, EstadoTO estadoTO, X509Certificate certificate, PrivateKey privateKey) {
        ProblemaConexaoAcao problemaConexaoAcao = (ProblemaConexaoAcao)AppContext.getInstance().getContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO, ProblemaConexaoAcao.class);
        AppContext.getInstance().removeContextParameter((EnumItf)AppContextEnum.PROBLEMA_CONEXAO_ACAO);
        if (problemaConexaoAcao == ProblemaConexaoAcao.RECONECTAR) {
            return this.a(consultaCadastroTO, estadoTO, certificate, privateKey);
        }
        return null;
    }
}

