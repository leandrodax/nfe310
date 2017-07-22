/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaClienteEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaEmitenteEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaNotaFiscalEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaProdutoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaTransportadoraEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroRelatorioGerencialEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.FormatoImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.ImpressaoDanfeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO
 *  br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO
 *  br.gov.sp.fazenda.dsen.common.to.ClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.IcmsTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.IpiTO
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.NumeracaoTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTO
 *  br.gov.sp.fazenda.dsen.common.to.ParametroTOList
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaEmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaTransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.to.ProdutoTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO
 *  br.gov.sp.fazenda.dsen.common.to.TransportadoraTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENConstants
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
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
 *  br.gov.sp.fazenda.dsen.model.entity.ParametrosEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity
 *  br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsge.certif.RepositorioInfo
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.util.DSGEZip
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  org.apache.commons.beanutils.PropertyUtils
 */
package br.gov.sp.fazenda.dsen.model.business.util;

import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaClienteEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaEmitenteEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaNotaFiscalEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaProdutoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaTransportadoraEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FiltroRelatorioGerencialEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.FormatoImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.ImpressaoDanfeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoInfoTO;
import br.gov.sp.fazenda.dsen.common.to.ChaveAcessoTO;
import br.gov.sp.fazenda.dsen.common.to.ClienteTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.IcmsTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.IpiTO;
import br.gov.sp.fazenda.dsen.common.to.LoteTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.NumeracaoTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTO;
import br.gov.sp.fazenda.dsen.common.to.ParametroTOList;
import br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaEmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaTransportadoraTO;
import br.gov.sp.fazenda.dsen.common.to.ProdutoTO;
import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO;
import br.gov.sp.fazenda.dsen.common.to.TransportadoraTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENConstants;
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
import br.gov.sp.fazenda.dsen.model.entity.ParametrosEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.entity.ProdutoEntity;
import br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity;
import br.gov.sp.fazenda.dsen.model.entity.TransportadoraEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsge.certif.RepositorioInfo;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.util.DSGEZip;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.beanutils.PropertyUtils;

/*
 * Exception performing whole class analysis ignored.
 */
public class DSENBusinessConverter {
    public DSENBusinessConverter() {
    }

    public static List<ParametroTO> converteListaParametro(List<ParametrosEntity> entities) throws DSENConverterException {
        ParametroTOList lista = null;
        try {
            if (entities != null) {
                lista = new ParametroTOList();
                for (ParametrosEntity parametrosEntity : entities) {
                    lista.add(DSENBusinessConverter.getParametroTO((ParametrosEntity)parametrosEntity));
                }
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return lista;
    }

    public static List<EmitenteTO> converteListaEmitente(List<EmitenteEntity> entities) throws DSENConverterException {
        ArrayList<EmitenteTO> lista = null;
        if (entities != null) {
            lista = new ArrayList<EmitenteTO>();
            for (EmitenteEntity emitenteEntity : entities) {
                try {
                    lista.add(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)emitenteEntity));
                }
                catch (DSENConverterException ex) {
                    throw new DSENConverterException((DSGEBaseException)ex, ex.getMessage());
                }
            }
        }
        return lista;
    }

    public static NotaFiscalTO getNotaFiscalTOAnoSerieNumero(NotaFiscalEntity notaFiscalEntity) throws DSENConverterException {
        NotaFiscalTO notaFiscalTO = new NotaFiscalTO();
        notaFiscalTO.setAno(notaFiscalEntity.getAno());
        notaFiscalTO.setSerie(notaFiscalEntity.getSerie());
        notaFiscalTO.setNumero(notaFiscalEntity.getNumero());
        return notaFiscalTO;
    }

    public static PesquisaNotaFiscalTO getPesquisaNotaFiscalTO(List<PesquisaEntity> listEntities) throws DSENConverterException {
        PesquisaNotaFiscalTO pesquisaNotaFiscalTO = null;
        HashMap<Integer, Integer> idPesquisaMap = null;
        try {
            if (listEntities != null) {
                pesquisaNotaFiscalTO = new PesquisaNotaFiscalTO();
                idPesquisaMap = new HashMap<Integer, Integer>();
                for (PesquisaEntity pesquisaEntity : listEntities) {
                    pesquisaNotaFiscalTO.setIdEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)pesquisaEntity.getIdEmitente()));
                    pesquisaNotaFiscalTO.setTelaPesquisaEnum(pesquisaEntity.getTelaEnum());
                    idPesquisaMap.put(pesquisaEntity.getCampoEnum(), pesquisaEntity.getIdPesquisa());
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.DATA_INI.ordinal()) {
                        pesquisaNotaFiscalTO.setDataIni(DateHelper.getDate((String)pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.DATA_FIM.ordinal()) {
                        pesquisaNotaFiscalTO.setDataFim(DateHelper.getDate((String)pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.ID_SITUACAO_NF.ordinal() && pesquisaEntity.getValor() != null) {
                        String[] situacoes = pesquisaEntity.getValor().split(",");
                        ArrayList<SituacaoNFeEnum> arraySituacoes = new ArrayList<SituacaoNFeEnum>();
                        for (int i = 0; i < situacoes.length; ++i) {
                            arraySituacoes.add(SituacaoNFeEnum.class.getEnumConstants()[Integer.parseInt(situacoes[i])]);
                        }
                        pesquisaNotaFiscalTO.setIdSituacaoNf(arraySituacoes);
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.ID_TIPO_EMISSSAO_NF.ordinal() && pesquisaEntity.getValor() != null) {
                        pesquisaNotaFiscalTO.setIdTipoEmissaoNf(TipoEmissaoEnum.class.getEnumConstants()[Integer.parseInt(pesquisaEntity.getValor())]);
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.SERIE.ordinal()) {
                        pesquisaNotaFiscalTO.setSerie(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.NUM_INI.ordinal()) {
                        pesquisaNotaFiscalTO.setNumIni(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.NUM_FIM.ordinal()) {
                        pesquisaNotaFiscalTO.setNumFim(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.DOCUMENTO_DEST.ordinal()) {
                        pesquisaNotaFiscalTO.setDocumentoDest(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.UF_DEST.ordinal()) {
                        pesquisaNotaFiscalTO.setUfDest(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.DANFE_IMPRESSO.ordinal()) {
                        pesquisaNotaFiscalTO.setComDanfeImpresso(Boolean.valueOf(pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaNotaFiscalEnum.AUTORIZADA_EXPORTADA.ordinal()) {
                        pesquisaNotaFiscalTO.setAutorizadaExportada(pesquisaEntity.getValor() == null ? null : Boolean.valueOf(pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() != FiltroPesquisaNotaFiscalEnum.CHAVE_ACESSO.ordinal() || pesquisaEntity.getValor() == null) continue;
                    pesquisaNotaFiscalTO.setChaveAcessoTO(ChaveAcessoUtil.obterChaveAcessoTO((String)pesquisaEntity.getValor()));
                }
                pesquisaNotaFiscalTO.setIdPesquisa(idPesquisaMap);
            }
        }
        catch (Throwable e) {
            throw new DSENConverterException(e, e.getMessage());
        }
        return pesquisaNotaFiscalTO;
    }

    public static List<PesquisaEntity> getPesquisaEntity(PesquisaNotaFiscalTO pesquisaNotaFiscalTO) throws DSENConverterException {
        try {
            ArrayList<PesquisaEntity> listPesquisa = new ArrayList<PesquisaEntity>();
            Map mapa = pesquisaNotaFiscalTO.getPesquisaEnumerationMap();
            for (FiltroPesquisaNotaFiscalEnum key : mapa.keySet()) {
                PesquisaEntity entity = new PesquisaEntity();
                entity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaNotaFiscalTO.getIdEmitente()));
                entity.setTelaEnum(pesquisaNotaFiscalTO.getTelaPesquisaEnum());
                entity.setCampoEnum(Integer.valueOf(key.ordinal()));
                entity.setValor((String)mapa.get((Object)key));
                if (pesquisaNotaFiscalTO.getIdPesquisa() != null) {
                    entity.setIdPesquisa((Integer)pesquisaNotaFiscalTO.getIdPesquisa().get(key.ordinal()));
                }
                listPesquisa.add(entity);
            }
            return listPesquisa;
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
    }

    public static List<ClienteTO> converteListaCliente(List<ClienteEntity> listEntities) throws DSENConverterException {
        ArrayList<ClienteTO> lista = null;
        try {
            if (listEntities != null) {
                lista = new ArrayList<ClienteTO>();
                for (ClienteEntity clienteEntity : listEntities) {
                    lista.add(DSENBusinessConverter.getClienteTO((ClienteEntity)clienteEntity));
                }
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return lista;
    }

    public static ClienteEntity getClienteEntity(ClienteTO clienteTO) throws DSENConverterException {
        ClienteEntity clienteEntity = null;
        try {
            if (clienteTO != null) {
                clienteEntity = new ClienteEntity();
                PropertyUtils.copyProperties((Object)clienteEntity, (Object)clienteTO);
                if (clienteTO.getEmitente() != null) {
                    clienteEntity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)clienteTO.getEmitente()));
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return clienteEntity;
    }

    public static ClienteTO getClienteTO(ClienteEntity clienteEntity) throws DSENConverterException {
        ClienteTO clienteTO = null;
        try {
            if (clienteEntity != null) {
                clienteTO = new ClienteTO();
                PropertyUtils.copyProperties((Object)clienteTO, (Object)clienteEntity);
                if (clienteEntity.getIdEmitente() != null) {
                    clienteTO.setEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)clienteEntity.getIdEmitente()));
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return clienteTO;
    }

    public static InutilizacaoEntity getInutilizacaoEntity(InutilizacaoTO inutilizacaoTO) throws DSENConverterException {
        InutilizacaoEntity inutilizacaoEntity = null;
        try {
            inutilizacaoEntity = new InutilizacaoEntity();
            PropertyUtils.copyProperties((Object)inutilizacaoEntity, (Object)inutilizacaoTO);
            inutilizacaoEntity.setEmitenteEntity(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)inutilizacaoTO.getEmitenteTO()));
            if (!StringHelper.isBlankOrNull((Object)inutilizacaoTO.getProtocoloXmlString())) {
                String procString = inutilizacaoTO.getProtocoloXmlString();
                byte[] procCompactado = DSGEZip.criarConteudoZip((String)procString, (String)DSENConstants.INUTILIZACAO_XML);
                inutilizacaoEntity.setProtocoloXml(procCompactado);
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return inutilizacaoEntity;
    }

    public static InutilizacaoTO getInutilizacaoTO(InutilizacaoEntity inutilizacaoEntity) throws DSENConverterException {
        InutilizacaoTO inutilizacaoTO = null;
        try {
            inutilizacaoTO = new InutilizacaoTO();
            PropertyUtils.copyProperties((Object)inutilizacaoTO, (Object)inutilizacaoEntity);
            inutilizacaoTO.setEmitenteTO(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)inutilizacaoEntity.getEmitenteEntity()));
            if (inutilizacaoEntity.getProtocoloXml() != null) {
                String protDescompactado = DSGEZip.extrairConteudoZip((byte[])inutilizacaoEntity.getProtocoloXml());
                inutilizacaoTO.setProtocoloXmlString(protDescompactado);
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return inutilizacaoTO;
    }

    public static List<InutilizacaoTO> getInutilizacaoTO(List<InutilizacaoEntity> inutilizacaoEntityList) throws DSENConverterException {
        if (inutilizacaoEntityList == null) {
            return null;
        }
        try {
            ArrayList<InutilizacaoTO> inutilizacaoTOList = new ArrayList<InutilizacaoTO>();
            for (InutilizacaoEntity inutilizacaoEntity : inutilizacaoEntityList) {
                inutilizacaoTOList.add(DSENBusinessConverter.getInutilizacaoTO((InutilizacaoEntity)inutilizacaoEntity));
            }
            return inutilizacaoTOList;
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
    }

    public static List<TransportadoraTO> converteListaTransportadora(List<TransportadoraEntity> entities) throws DSENConverterException {
        ArrayList<TransportadoraTO> lista = null;
        try {
            if (entities != null) {
                lista = new ArrayList<TransportadoraTO>();
                for (int i = 0; i < entities.size(); ++i) {
                    TransportadoraEntity entity = entities.get(i);
                    lista.add(DSENBusinessConverter.getTransportadoraTO((TransportadoraEntity)entity));
                }
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return lista;
    }

    public static TransportadoraEntity getTransportadoraEntity(TransportadoraTO transportadoraTO) throws DSENConverterException {
        TransportadoraEntity transportadoraEntity = null;
        try {
            if (transportadoraTO != null) {
                transportadoraEntity = new TransportadoraEntity();
                PropertyUtils.copyProperties((Object)transportadoraEntity, (Object)transportadoraTO);
                if (transportadoraTO.getEmitente() != null) {
                    transportadoraEntity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)transportadoraTO.getEmitente()));
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return transportadoraEntity;
    }

    public static TransportadoraTO getTransportadoraTO(TransportadoraEntity transportadoraEntity) throws DSENConverterException {
        TransportadoraTO transportadoraTO = null;
        try {
            if (transportadoraEntity != null) {
                transportadoraTO = new TransportadoraTO();
                PropertyUtils.copyProperties((Object)transportadoraTO, (Object)transportadoraEntity);
                if (transportadoraEntity.getIdEmitente() != null) {
                    transportadoraTO.setEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)transportadoraEntity.getIdEmitente()));
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return transportadoraTO;
    }

    public static List<ProdutoTO> converteListaProduto(List<ProdutoEntity> listaOrig) throws DSENConverterException {
        ArrayList<ProdutoTO> lista = null;
        if (listaOrig != null) {
            lista = new ArrayList<ProdutoTO>();
            for (ProdutoEntity produtoEntity : listaOrig) {
                try {
                    lista.add(DSENBusinessConverter.getProdutoTO((ProdutoEntity)produtoEntity));
                }
                catch (DSENConverterException ex) {
                    throw new DSENConverterException((DSGEBaseException)ex, ex.getMessage());
                }
            }
        }
        return lista;
    }

    public static ProdutoTO getProdutoTO(ProdutoEntity produtoEntity) throws DSENConverterException {
        ProdutoTO produtoTO = null;
        if (produtoEntity != null) {
            produtoTO = new ProdutoTO();
            try {
                PropertyUtils.copyProperties((Object)produtoTO, (Object)produtoEntity);
            }
            catch (IllegalAccessException ex) {
                throw new DSENConverterException((Throwable)ex, ex.getMessage());
            }
            catch (NoSuchMethodException ex) {
                throw new DSENConverterException((Throwable)ex, ex.getMessage());
            }
            catch (InvocationTargetException ex) {
                throw new DSENConverterException((Throwable)ex, ex.getMessage());
            }
            HashSet<IcmsTO> listaIcmsTO = new HashSet<IcmsTO>();
            if (produtoEntity.getIcmsEntitySet() != null) {
                Set listaEntity = produtoEntity.getIcmsEntitySet();
                for (IcmsEntity icmsEntity : listaEntity) {
                    if (icmsEntity == null) continue;
                    IcmsTO icmsTO = new IcmsTO();
                    try {
                        PropertyUtils.copyProperties((Object)icmsTO, (Object)icmsEntity);
                    }
                    catch (IllegalAccessException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    catch (NoSuchMethodException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    catch (InvocationTargetException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    icmsTO.setProduto(produtoTO);
                    listaIcmsTO.add(icmsTO);
                }
            }
            produtoTO.setIcmsTOSet(listaIcmsTO);
            HashSet<IpiTO> listaIpiTO = new HashSet<IpiTO>();
            if (produtoEntity.getIpiEntitySet() != null) {
                Set listaEntity = produtoEntity.getIpiEntitySet();
                for (IpiEntity ipiEntity : listaEntity) {
                    if (ipiEntity == null) continue;
                    IpiTO ipiTO = new IpiTO();
                    try {
                        PropertyUtils.copyProperties((Object)ipiTO, (Object)ipiEntity);
                    }
                    catch (IllegalAccessException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    catch (NoSuchMethodException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    catch (InvocationTargetException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    ipiTO.setProduto(produtoTO);
                    listaIpiTO.add(ipiTO);
                }
            }
            produtoTO.setIpiTOSet(listaIpiTO);
            if (produtoEntity.getIdEmitente() != null) {
                produtoTO.setEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)produtoEntity.getIdEmitente()));
            }
        }
        return produtoTO;
    }

    public static ProdutoEntity getProdutoEntity(ProdutoTO produtoTO) throws DSENConverterException {
        ProdutoEntity produtoEntity = null;
        if (produtoTO != null) {
            produtoEntity = new ProdutoEntity();
            try {
                PropertyUtils.copyProperties((Object)produtoEntity, (Object)produtoTO);
            }
            catch (IllegalAccessException ex) {
                throw new DSENConverterException((Throwable)ex, ex.getMessage());
            }
            catch (NoSuchMethodException ex) {
                throw new DSENConverterException((Throwable)ex, ex.getMessage());
            }
            catch (InvocationTargetException ex) {
                throw new DSENConverterException((Throwable)ex, ex.getMessage());
            }
            HashSet<IcmsEntity> listaICMSEntity = new HashSet<IcmsEntity>();
            if (produtoTO.getIcmsTOSet() != null) {
                Set listaTO = produtoTO.getIcmsTOSet();
                for (IcmsTO icmsTO : listaTO) {
                    IcmsEntity icmsEntity = new IcmsEntity();
                    try {
                        PropertyUtils.copyProperties((Object)icmsEntity, (Object)icmsTO);
                    }
                    catch (NoSuchMethodException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    catch (InvocationTargetException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    catch (IllegalAccessException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    icmsEntity.setIdProduto(produtoEntity);
                    listaICMSEntity.add(icmsEntity);
                }
            }
            produtoEntity.setIcmsEntitySet(listaICMSEntity);
            HashSet<IpiEntity> listaIPIEntity = new HashSet<IpiEntity>();
            if (produtoTO.getIpiTOSet() != null) {
                Set listaTO = produtoTO.getIpiTOSet();
                for (IpiTO ipiTO : listaTO) {
                    IpiEntity ipiEntity = new IpiEntity();
                    try {
                        PropertyUtils.copyProperties((Object)ipiEntity, (Object)ipiTO);
                    }
                    catch (NoSuchMethodException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    catch (InvocationTargetException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    catch (IllegalAccessException ex) {
                        throw new DSENConverterException((Throwable)ex, ex.getMessage());
                    }
                    ipiEntity.setIdProduto(produtoEntity);
                    listaIPIEntity.add(ipiEntity);
                }
            }
            produtoEntity.setIpiEntitySet(listaIPIEntity);
            if (produtoTO.getEmitente() != null) {
                EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)produtoTO.getEmitente());
                produtoEntity.setIdEmitente(emitenteEntity);
            }
        }
        return produtoEntity;
    }

    public static NumeracaoEntity getNumeracaoEntity(NumeracaoTO numeracaoTO) throws DSENConverterException {
        NumeracaoEntity numeracaoEntity = null;
        try {
            if (numeracaoTO != null) {
                numeracaoEntity = new NumeracaoEntity();
                PropertyUtils.copyProperties((Object)numeracaoEntity, (Object)numeracaoTO);
            }
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return numeracaoEntity;
    }

    public static NumeracaoTO getNumeracaoTO(NumeracaoEntity numeracaoEntity) throws DSENConverterException {
        NumeracaoTO numeracaoTO = null;
        try {
            if (numeracaoEntity != null) {
                numeracaoTO = new NumeracaoTO();
                PropertyUtils.copyProperties((Object)numeracaoTO, (Object)numeracaoEntity);
            }
            return numeracaoTO;
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
    }

    public static CancelamentoTO getCancelamentoTO(CancelamentoEntity cancelamentoEntity) throws DSENConverterException {
        CancelamentoTO cancelamentoTO = null;
        try {
            if (cancelamentoEntity != null) {
                cancelamentoTO = new CancelamentoTO();
                PropertyUtils.copyProperties((Object)cancelamentoTO, (Object)cancelamentoEntity);
                if (cancelamentoEntity.getProtocolo() != null) {
                    String protocoloDescompactado = DSGEZip.extrairConteudoZip((byte[])cancelamentoEntity.getProtocolo());
                    cancelamentoTO.setProtocoloString(protocoloDescompactado);
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return cancelamentoTO;
    }

    public static CancelamentoEntity getCancelamentoEntity(CancelamentoTO cancelamentoTO) throws DSENConverterException {
        try {
            CancelamentoEntity cancelamentoEntity = new CancelamentoEntity();
            PropertyUtils.copyProperties((Object)cancelamentoEntity, (Object)cancelamentoTO);
            if (!StringHelper.isBlankOrNull((Object)cancelamentoTO.getProtocoloString())) {
                String protocoloString = cancelamentoTO.getProtocoloString();
                byte[] protocoloCompactado = DSGEZip.criarConteudoZip((String)protocoloString, (String)DSENConstants.PROTOCOLO_XML);
                cancelamentoEntity.setProtocolo(protocoloCompactado);
            }
            return cancelamentoEntity;
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
    }

    public static NotaFiscalTO getNotaFiscalTO(NotaFiscalEntity notaFiscalEntity, boolean lazy) throws DSENConverterException {
        NotaFiscalTO notaFiscalTO = null;
        try {
            if (notaFiscalEntity != null) {
                notaFiscalTO = new NotaFiscalTO();
                PropertyUtils.copyProperties((Object)notaFiscalTO, (Object)notaFiscalEntity);
                if (notaFiscalEntity.getEmitenteEntity() != null) {
                    notaFiscalTO.setEmitenteTO(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)notaFiscalEntity.getEmitenteEntity()));
                }
                if (!lazy) {
                    CancelamentoEntity cancEntity;
                    if (notaFiscalEntity.getDocXml() != null) {
                        String docXmlDescompactado = DSGEZip.extrairConteudoZip((byte[])notaFiscalEntity.getDocXml());
                        notaFiscalTO.setDocXmlString(docXmlDescompactado);
                    }
                    if (notaFiscalEntity.getProtocolo() != null) {
                        String protDescompactado = DSGEZip.extrairConteudoZip((byte[])notaFiscalEntity.getProtocolo());
                        notaFiscalTO.setProtocoloString(protDescompactado);
                    }
                    if (notaFiscalEntity.getLoteEntity() != null) {
                        notaFiscalTO.setLoteTO(DSENBusinessConverter.getLoteTO((LoteEntity)notaFiscalEntity.getLoteEntity()));
                    }
                    if (notaFiscalEntity.getEventoEntitySet() != null) {
                        notaFiscalTO.setEventoTOList(DSENBusinessConverter.getEventoTO((Collection)notaFiscalEntity.getEventoEntitySet(), (NotaFiscalTO)notaFiscalTO, (boolean)lazy));
                    }
                    if ((cancEntity = notaFiscalEntity.getCancelamentoEntity()) != null) {
                        notaFiscalTO.setCancelamentoTO(DSENBusinessConverter.getCancelamentoTO((CancelamentoEntity)cancEntity));
                    }
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return notaFiscalTO;
    }

    public static NotaFiscalEntity getNotaFiscalEntity(NotaFiscalTO notaFiscalTO) throws DSENConverterException {
        NotaFiscalEntity notaFiscalEntity = null;
        try {
            if (notaFiscalTO != null) {
                CancelamentoTO cancTO;
                notaFiscalEntity = new NotaFiscalEntity();
                PropertyUtils.copyProperties((Object)notaFiscalEntity, (Object)notaFiscalTO);
                if (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getDocXmlString())) {
                    String docXmlString = notaFiscalTO.getDocXmlString();
                    byte[] docXmlCompactado = DSGEZip.criarConteudoZip((String)docXmlString, (String)DSENConstants.NOTA_FISCAL_XML);
                    notaFiscalEntity.setDocXml(docXmlCompactado);
                }
                if (!StringHelper.isBlankOrNull((Object)notaFiscalTO.getProtocoloString())) {
                    String procString = notaFiscalTO.getProtocoloString();
                    byte[] procCompactado = DSGEZip.criarConteudoZip((String)procString, (String)DSENConstants.PROTOCOLO_XML);
                    notaFiscalEntity.setProtocolo(procCompactado);
                }
                if (notaFiscalTO.getEmitenteTO() != null) {
                    notaFiscalEntity.setEmitenteEntity(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)notaFiscalTO.getEmitenteTO()));
                }
                if (notaFiscalTO.getLoteTO() != null) {
                    notaFiscalEntity.setLoteEntity(DSENBusinessConverter.getLoteEntity((LoteTO)notaFiscalTO.getLoteTO()));
                }
                if (notaFiscalTO.getEventoTOList() != null) {
                    notaFiscalEntity.setEventoEntitySet(DSENBusinessConverter.getEventoEntity((Collection)notaFiscalTO.getEventoTOList(), (NotaFiscalEntity)notaFiscalEntity));
                }
                if ((cancTO = notaFiscalTO.getCancelamentoTO()) != null) {
                    notaFiscalEntity.setCancelamentoEntity(DSENBusinessConverter.getCancelamentoEntity((CancelamentoTO)cancTO));
                }
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return notaFiscalEntity;
    }

    public static List<NotaFiscalTO> getListaNotaFiscalTO(List<NotaFiscalEntity> listaNotaFiscalEntity, boolean lazy) throws DSENConverterException {
        ArrayList<NotaFiscalTO> listaConhecimentoTO = null;
        if (listaNotaFiscalEntity != null) {
            listaConhecimentoTO = new ArrayList<NotaFiscalTO>();
            for (NotaFiscalEntity transporteEntity : listaNotaFiscalEntity) {
                listaConhecimentoTO.add(DSENBusinessConverter.getNotaFiscalTO((NotaFiscalEntity)transporteEntity, (boolean)lazy));
            }
        }
        return listaConhecimentoTO;
    }

    public static EmitenteEntity getEmitenteEntity(EmitenteTO emitenteTO) throws DSENConverterException {
        EmitenteEntity emitenteEntity = null;
        try {
            if (emitenteTO != null) {
                emitenteEntity = new EmitenteEntity();
                PropertyUtils.copyProperties((Object)emitenteEntity, (Object)emitenteTO);
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return emitenteEntity;
    }

    public static EmitenteTO getEmitenteTO(EmitenteEntity emitenteEntity) throws DSENConverterException {
        EmitenteTO emitenteTO = null;
        try {
            if (emitenteEntity != null) {
                emitenteTO = new EmitenteTO();
                PropertyUtils.copyProperties((Object)emitenteTO, (Object)emitenteEntity);
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return emitenteTO;
    }

    public static ParametroTO getParametroTO(ParametrosEntity parametrosEntity) throws DSENConverterException {
        ParametroTO parametrosTO = null;
        try {
            if (parametrosEntity != null) {
                parametrosTO = new ParametroTO();
                PropertyUtils.copyProperties((Object)parametrosTO, (Object)parametrosEntity);
            }
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return parametrosTO;
    }

    public static ParametrosEntity getParametrosEntity(ParametroTO parametrosTO) throws DSENConverterException {
        ParametrosEntity parametrosEntity = null;
        try {
            if (parametrosTO != null) {
                parametrosEntity = new ParametrosEntity();
                PropertyUtils.copyProperties((Object)parametrosEntity, (Object)parametrosTO);
            }
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return parametrosEntity;
    }

    public static PropriedadeEntity getPropriedadeEntity(PropriedadeTO propriedadeTO) throws DSENConverterException {
        PropriedadeEntity propriedadeEntity = null;
        try {
            if (propriedadeTO != null) {
                propriedadeEntity = new PropriedadeEntity();
                PropertyUtils.copyProperties((Object)propriedadeEntity, (Object)propriedadeTO);
                propriedadeEntity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)propriedadeTO.getEmitenteTO()));
            }
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return propriedadeEntity;
    }

    public static PropriedadeTO getPropriedadeTO(PropriedadeEntity propriedadeEntity) throws DSENConverterException {
        PropriedadeTO propriedadeTO = null;
        try {
            if (propriedadeEntity != null) {
                propriedadeTO = new PropriedadeTO();
                PropertyUtils.copyProperties((Object)propriedadeTO, (Object)propriedadeEntity);
                propriedadeTO.setEmitenteTO(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)propriedadeEntity.getIdEmitente()));
            }
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return propriedadeTO;
    }

    public static LoteTO getLoteTO(LoteEntity loteEntity) throws DSENConverterException {
        try {
            LoteTO loteTO = new LoteTO();
            PropertyUtils.copyProperties((Object)loteTO, (Object)loteEntity);
            if (loteEntity.getXmlRetorno() != null) {
                String xmlRetornoDescompactado = DSGEZip.extrairConteudoZip((byte[])loteEntity.getXmlRetorno());
                loteTO.setXmlRetornoString(xmlRetornoDescompactado);
            }
            return loteTO;
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
    }

    public static LoteEntity getLoteEntity(LoteTO loteTO) throws DSENConverterException {
        try {
            LoteEntity loteEntity = new LoteEntity();
            PropertyUtils.copyProperties((Object)loteEntity, (Object)loteTO);
            if (!StringHelper.isBlankOrNull((Object)loteTO.getXmlRetornoString())) {
                String xmlRetornoString = loteTO.getXmlRetornoString();
                byte[] xmlRetornoCompactado = DSGEZip.criarConteudoZip((String)xmlRetornoString, (String)DSENConstants.BUSCA_RETORNO_XML);
                loteEntity.setXmlRetorno(xmlRetornoCompactado);
            }
            return loteEntity;
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
    }

    public static EventoTO getEventoTO(EventoEntity eventoEntity, NotaFiscalTO notaFiscalTO, boolean lazy) throws DSENConverterException {
        try {
            EventoTO eventoTO = new EventoTO();
            PropertyUtils.copyProperties((Object)eventoTO, (Object)eventoEntity);
            if (!lazy) {
                if (eventoEntity.getXmlProc() != null) {
                    String xmlDescompactado = DSGEZip.extrairConteudoZip((byte[])eventoEntity.getXmlProc());
                    eventoTO.setXmlProcString(xmlDescompactado);
                }
                eventoTO.setNotaFiscalTO(notaFiscalTO);
            }
            return eventoTO;
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
    }

    public static EventoEntity getEventoEntity(EventoTO eventoTO, NotaFiscalEntity notaFiscalEntity) throws DSENConverterException {
        try {
            EventoEntity eventoEntity = new EventoEntity();
            PropertyUtils.copyProperties((Object)eventoEntity, (Object)eventoTO);
            if (!StringHelper.isBlankOrNull((Object)eventoTO.getXmlProcString())) {
                String xmlRetornoString = eventoTO.getXmlProcString();
                byte[] xmlRetorno = DSGEZip.criarConteudoZip((String)xmlRetornoString, (String)DSENConstants.BUSCA_RETORNO_XML);
                eventoEntity.setXmlProc(xmlRetorno);
            }
            eventoEntity.setNotaFiscalEntity(notaFiscalEntity);
            return eventoEntity;
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (IOException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
    }

    public static List<EventoTO> getEventoTO(Collection<EventoEntity> listaEventoEntity, NotaFiscalTO notaFiscalTO, boolean lazy) throws DSENConverterException {
        if (listaEventoEntity == null) {
            return null;
        }
        ArrayList<EventoTO> listaEventoTO = new ArrayList<EventoTO>();
        for (EventoEntity eventoEntity : listaEventoEntity) {
            listaEventoTO.add(DSENBusinessConverter.getEventoTO((EventoEntity)eventoEntity, (NotaFiscalTO)notaFiscalTO, (boolean)lazy));
        }
        return listaEventoTO;
    }

    public static Set<EventoEntity> getEventoEntity(Collection<EventoTO> listaEventoTO, NotaFiscalEntity notaFiscalEntity) throws DSENConverterException {
        if (listaEventoTO == null) {
            return null;
        }
        HashSet<EventoEntity> setEventoEntity = new HashSet<EventoEntity>();
        for (EventoTO eventoTO : listaEventoTO) {
            setEventoEntity.add(DSENBusinessConverter.getEventoEntity((EventoTO)eventoTO, (NotaFiscalEntity)notaFiscalEntity));
        }
        return setEventoEntity;
    }

    public static PesquisaRelatorioGerencialTO getPesquisaRelatorioGerencialTO(List<PesquisaEntity> listEntities) throws DSENConverterException {
        PesquisaRelatorioGerencialTO pesquisaRelatorioGerencialTO = null;
        HashMap<Integer, Integer> idPesquisaMap = null;
        try {
            if (listEntities != null) {
                pesquisaRelatorioGerencialTO = new PesquisaRelatorioGerencialTO();
                idPesquisaMap = new HashMap<Integer, Integer>();
                for (PesquisaEntity pesquisaEntity : listEntities) {
                    pesquisaRelatorioGerencialTO.setIdEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)pesquisaEntity.getIdEmitente()));
                    pesquisaRelatorioGerencialTO.setTelaPesquisaEnum(pesquisaEntity.getTelaEnum());
                    idPesquisaMap.put(pesquisaEntity.getCampoEnum(), pesquisaEntity.getIdPesquisa());
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroRelatorioGerencialEnum.DATA_INI.ordinal()) {
                        pesquisaRelatorioGerencialTO.setDataIni(DateHelper.getDate((String)pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroRelatorioGerencialEnum.DATA_FIM.ordinal()) {
                        pesquisaRelatorioGerencialTO.setDataFim(DateHelper.getDate((String)pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroRelatorioGerencialEnum.CHK_NRO_INUTILIZADO.ordinal()) {
                        pesquisaRelatorioGerencialTO.setChkNroInutilizacao(Boolean.valueOf(pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroRelatorioGerencialEnum.CHK_NOTA_FISCAL.ordinal()) {
                        pesquisaRelatorioGerencialTO.setChkNotaFiscal(Boolean.valueOf(pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroRelatorioGerencialEnum.ID_SITUACAO_NF.ordinal() && pesquisaEntity.getValor() != null) {
                        String[] situacoes = pesquisaEntity.getValor().split(",");
                        ArrayList<SituacaoNFeEnum> arraySituacoes = new ArrayList<SituacaoNFeEnum>();
                        for (int i = 0; i < situacoes.length; ++i) {
                            arraySituacoes.add(SituacaoNFeEnum.class.getEnumConstants()[Integer.parseInt(situacoes[i])]);
                        }
                        pesquisaRelatorioGerencialTO.setIdSituacaoNf(arraySituacoes);
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() != FiltroRelatorioGerencialEnum.ID_TIPO_EMISSSAO_NF.ordinal() || pesquisaEntity.getValor() == null) continue;
                    pesquisaRelatorioGerencialTO.setIdTipoEmissaoNf(TipoEmissaoEnum.class.getEnumConstants()[Integer.parseInt(pesquisaEntity.getValor())]);
                }
                pesquisaRelatorioGerencialTO.setIdPesquisa(idPesquisaMap);
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaRelatorioGerencialTO;
    }

    public static List<PesquisaEntity> getPesquisaEntity(PesquisaRelatorioGerencialTO pesquisaRelatorioGerencialTO) throws DSENConverterException {
        try {
            ArrayList<PesquisaEntity> listPesquisa = new ArrayList<PesquisaEntity>();
            Map mapa = pesquisaRelatorioGerencialTO.getPesquisaEnumerationMap();
            for (FiltroRelatorioGerencialEnum key : mapa.keySet()) {
                PesquisaEntity entity = new PesquisaEntity();
                entity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaRelatorioGerencialTO.getIdEmitente()));
                entity.setTelaEnum(pesquisaRelatorioGerencialTO.getTelaPesquisaEnum());
                entity.setCampoEnum(Integer.valueOf(key.ordinal()));
                entity.setValor((String)mapa.get((Object)key));
                if (pesquisaRelatorioGerencialTO.getIdPesquisa() != null) {
                    entity.setIdPesquisa((Integer)pesquisaRelatorioGerencialTO.getIdPesquisa().get(key.ordinal()));
                }
                listPesquisa.add(entity);
            }
            return listPesquisa;
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
    }

    public static SelecaoDanfeTO getSelecaoDanfeTO(List<PesquisaEntity> listEntities) throws DSENConverterException {
        SelecaoDanfeTO selecaoDanfeTO = null;
        HashMap<Integer, Integer> idPesquisaMap = null;
        try {
            if (listEntities != null) {
                selecaoDanfeTO = new SelecaoDanfeTO();
                idPesquisaMap = new HashMap<Integer, Integer>();
                for (PesquisaEntity pesquisaEntity : listEntities) {
                    selecaoDanfeTO.setIdEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)pesquisaEntity.getIdEmitente()));
                    selecaoDanfeTO.setTelaPesquisaEnum(pesquisaEntity.getTelaEnum());
                    idPesquisaMap.put(pesquisaEntity.getCampoEnum(), pesquisaEntity.getIdPesquisa());
                    if (pesquisaEntity.getCampoEnum().intValue() == ImpressaoDanfeEnum.CHK_FORMATO_IMPRESSAO.ordinal()) {
                        if (StringHelper.isBlankOrNull((Object)pesquisaEntity.getValor())) {
                            selecaoDanfeTO.setFormatoImpressaoEnum(FormatoImpressaoEnum.FRENTE);
                        } else {
                            selecaoDanfeTO.setFormatoImpressaoEnum(FormatoImpressaoEnum.class.getEnumConstants()[Integer.parseInt(pesquisaEntity.getValor())]);
                        }
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == ImpressaoDanfeEnum.CHK_FORMULARIO_PRE_IMPRESSO.ordinal()) {
                        selecaoDanfeTO.setPreImpresso(Boolean.valueOf(pesquisaEntity.getValor()));
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() != ImpressaoDanfeEnum.CHK_TIPO_PAPEL.ordinal()) continue;
                    if (StringHelper.isBlankOrNull((Object)pesquisaEntity.getValor())) {
                        selecaoDanfeTO.setTipoPapelEnum(TipoPapelImpressaoEnum.A4);
                        continue;
                    }
                    selecaoDanfeTO.setTipoPapelEnum(TipoPapelImpressaoEnum.class.getEnumConstants()[Integer.parseInt(pesquisaEntity.getValor())]);
                }
                selecaoDanfeTO.setIdSelecaoDanfe(idPesquisaMap);
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return selecaoDanfeTO;
    }

    public static List<PesquisaEntity> getPesquisaEntity(SelecaoDanfeTO selecaoDanfeTO) throws DSENConverterException {
        try {
            ArrayList<PesquisaEntity> listPesquisa = new ArrayList<PesquisaEntity>();
            Map mapa = selecaoDanfeTO.getSelecaoEnumerationMap();
            for (ImpressaoDanfeEnum key : mapa.keySet()) {
                PesquisaEntity entity = new PesquisaEntity();
                entity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)selecaoDanfeTO.getIdEmitente()));
                entity.setTelaEnum(selecaoDanfeTO.getTelaPesquisaEnum());
                entity.setCampoEnum(Integer.valueOf(key.ordinal()));
                entity.setValor((String)mapa.get((Object)key));
                if (selecaoDanfeTO.getIdSelecaoDanfe() != null) {
                    entity.setIdPesquisa((Integer)selecaoDanfeTO.getIdSelecaoDanfe().get(key.ordinal()));
                }
                listPesquisa.add(entity);
            }
            return listPesquisa;
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
    }

    public static List<PesquisaEntity> getPesquisaEntity(PesquisaEmitenteTO pesquisaEmitenteTO) throws DSENConverterException {
        try {
            ArrayList<PesquisaEntity> listPesquisa = new ArrayList<PesquisaEntity>();
            Map mapa = pesquisaEmitenteTO.getPesquisaEnumerationMap();
            for (FiltroPesquisaEmitenteEnum key : mapa.keySet()) {
                PesquisaEntity entity = new PesquisaEntity();
                entity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaEmitenteTO.getIdEmitente()));
                entity.setTelaEnum(pesquisaEmitenteTO.getTelaPesquisaEnum());
                entity.setCampoEnum(Integer.valueOf(key.ordinal()));
                entity.setValor((String)mapa.get((Object)key));
                if (pesquisaEmitenteTO.getIdPesquisa() != null) {
                    entity.setIdPesquisa((Integer)pesquisaEmitenteTO.getIdPesquisa().get(key.ordinal()));
                }
                listPesquisa.add(entity);
            }
            return listPesquisa;
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
    }

    public static PesquisaEmitenteTO getPesquisaEmitenteTO(List<PesquisaEntity> listEntities) throws DSENConverterException {
        PesquisaEmitenteTO pesquisaEmitenteTO = null;
        HashMap<Integer, Integer> idPesquisaMap = null;
        try {
            if (listEntities != null) {
                pesquisaEmitenteTO = new PesquisaEmitenteTO();
                idPesquisaMap = new HashMap<Integer, Integer>();
                for (PesquisaEntity pesquisaEntity : listEntities) {
                    pesquisaEmitenteTO.setIdEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)pesquisaEntity.getIdEmitente()));
                    pesquisaEmitenteTO.setTelaPesquisaEnum(pesquisaEntity.getTelaEnum());
                    idPesquisaMap.put(pesquisaEntity.getCampoEnum(), pesquisaEntity.getIdPesquisa());
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaEmitenteEnum.CNPJ.ordinal()) {
                        pesquisaEmitenteTO.setCnpj(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() != FiltroPesquisaEmitenteEnum.RAZAO_SOCIAL.ordinal()) continue;
                    pesquisaEmitenteTO.setCnpj(pesquisaEntity.getValor());
                }
                pesquisaEmitenteTO.setIdPesquisa(idPesquisaMap);
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaEmitenteTO;
    }

    public static List<PesquisaEntity> getPesquisaEntity(PesquisaClienteTO pesquisaClienteTO) throws DSENConverterException {
        try {
            ArrayList<PesquisaEntity> listPesquisa = new ArrayList<PesquisaEntity>();
            Map mapa = pesquisaClienteTO.getPesquisaEnumerationMap();
            for (FiltroPesquisaClienteEnum key : mapa.keySet()) {
                PesquisaEntity entity = new PesquisaEntity();
                entity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaClienteTO.getIdEmitente()));
                entity.setTelaEnum(pesquisaClienteTO.getTelaPesquisaEnum());
                entity.setCampoEnum(Integer.valueOf(key.ordinal()));
                entity.setValor((String)mapa.get((Object)key));
                if (pesquisaClienteTO.getIdPesquisa() != null) {
                    entity.setIdPesquisa((Integer)pesquisaClienteTO.getIdPesquisa().get(key.ordinal()));
                }
                listPesquisa.add(entity);
            }
            return listPesquisa;
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
    }

    public static PesquisaClienteTO getPesquisaClienteTO(List<PesquisaEntity> listEntities) throws DSENConverterException {
        PesquisaClienteTO pesquisaClienteTO = null;
        HashMap<Integer, Integer> idPesquisaMap = null;
        try {
            if (listEntities != null) {
                pesquisaClienteTO = new PesquisaClienteTO();
                idPesquisaMap = new HashMap<Integer, Integer>();
                for (PesquisaEntity pesquisaEntity : listEntities) {
                    pesquisaClienteTO.setIdEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)pesquisaEntity.getIdEmitente()));
                    pesquisaClienteTO.setTelaPesquisaEnum(pesquisaEntity.getTelaEnum());
                    idPesquisaMap.put(pesquisaEntity.getCampoEnum(), pesquisaEntity.getIdPesquisa());
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaClienteEnum.RAZAO_SOCIAL.ordinal()) {
                        pesquisaClienteTO.setRazaoSocial(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaClienteEnum.CNPJ_CPF.ordinal()) {
                        pesquisaClienteTO.setCnpjCpf(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() != FiltroPesquisaClienteEnum.IE.ordinal()) continue;
                    pesquisaClienteTO.setIe(pesquisaEntity.getValor());
                }
                pesquisaClienteTO.setIdPesquisa(idPesquisaMap);
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaClienteTO;
    }

    public static List<PesquisaEntity> getPesquisaEntity(PesquisaTransportadoraTO pesquisaTransportadoraTO) throws DSENConverterException {
        try {
            ArrayList<PesquisaEntity> listPesquisa = new ArrayList<PesquisaEntity>();
            Map mapa = pesquisaTransportadoraTO.getPesquisaEnumerationMap();
            for (FiltroPesquisaTransportadoraEnum key : mapa.keySet()) {
                PesquisaEntity entity = new PesquisaEntity();
                entity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaTransportadoraTO.getIdEmitente()));
                entity.setTelaEnum(pesquisaTransportadoraTO.getTelaPesquisaEnum());
                entity.setCampoEnum(Integer.valueOf(key.ordinal()));
                entity.setValor((String)mapa.get((Object)key));
                if (pesquisaTransportadoraTO.getIdPesquisa() != null) {
                    entity.setIdPesquisa((Integer)pesquisaTransportadoraTO.getIdPesquisa().get(key.ordinal()));
                }
                listPesquisa.add(entity);
            }
            return listPesquisa;
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
    }

    public static PesquisaTransportadoraTO getPesquisaTransportadoraTO(List<PesquisaEntity> listEntities) throws DSENConverterException {
        PesquisaTransportadoraTO pesquisaTransportadoraTO = null;
        HashMap<Integer, Integer> idPesquisaMap = null;
        try {
            if (listEntities != null) {
                pesquisaTransportadoraTO = new PesquisaTransportadoraTO();
                idPesquisaMap = new HashMap<Integer, Integer>();
                for (PesquisaEntity pesquisaEntity : listEntities) {
                    pesquisaTransportadoraTO.setIdEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)pesquisaEntity.getIdEmitente()));
                    pesquisaTransportadoraTO.setTelaPesquisaEnum(pesquisaEntity.getTelaEnum());
                    idPesquisaMap.put(pesquisaEntity.getCampoEnum(), pesquisaEntity.getIdPesquisa());
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaTransportadoraEnum.RAZAO_SOCIAL.ordinal()) {
                        pesquisaTransportadoraTO.setRazaoSocial(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaTransportadoraEnum.CNPJ_CPF.ordinal()) {
                        pesquisaTransportadoraTO.setCnpjCpf(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() != FiltroPesquisaTransportadoraEnum.IE.ordinal()) continue;
                    pesquisaTransportadoraTO.setIe(pesquisaEntity.getValor());
                }
                pesquisaTransportadoraTO.setIdPesquisa(idPesquisaMap);
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaTransportadoraTO;
    }

    public static List<PesquisaEntity> getPesquisaEntity(PesquisaProdutoTO pesquisaProdutoTO) throws DSENConverterException {
        try {
            ArrayList<PesquisaEntity> listPesquisa = new ArrayList<PesquisaEntity>();
            Map mapa = pesquisaProdutoTO.getPesquisaEnumerationMap();
            for (FiltroPesquisaProdutoEnum key : mapa.keySet()) {
                PesquisaEntity entity = new PesquisaEntity();
                entity.setIdEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaProdutoTO.getIdEmitente()));
                entity.setTelaEnum(pesquisaProdutoTO.getTelaPesquisaEnum());
                entity.setCampoEnum(Integer.valueOf(key.ordinal()));
                entity.setValor((String)mapa.get((Object)key));
                if (pesquisaProdutoTO.getIdPesquisa() != null) {
                    entity.setIdPesquisa((Integer)pesquisaProdutoTO.getIdPesquisa().get(key.ordinal()));
                }
                listPesquisa.add(entity);
            }
            return listPesquisa;
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
    }

    public static PesquisaProdutoTO getPesquisaProdutoTO(List<PesquisaEntity> listEntities) throws DSENConverterException {
        PesquisaProdutoTO pesquisaProdutoTO = null;
        HashMap<Integer, Integer> idPesquisaMap = null;
        try {
            if (listEntities != null) {
                pesquisaProdutoTO = new PesquisaProdutoTO();
                idPesquisaMap = new HashMap<Integer, Integer>();
                for (PesquisaEntity pesquisaEntity : listEntities) {
                    pesquisaProdutoTO.setIdEmitente(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)pesquisaEntity.getIdEmitente()));
                    pesquisaProdutoTO.setTelaPesquisaEnum(pesquisaEntity.getTelaEnum());
                    idPesquisaMap.put(pesquisaEntity.getCampoEnum(), pesquisaEntity.getIdPesquisa());
                    if (pesquisaEntity.getCampoEnum().intValue() == FiltroPesquisaProdutoEnum.CODIGO.ordinal()) {
                        pesquisaProdutoTO.setCodigo(pesquisaEntity.getValor());
                    }
                    if (pesquisaEntity.getCampoEnum().intValue() != FiltroPesquisaProdutoEnum.NOME.ordinal()) continue;
                    pesquisaProdutoTO.setNome(pesquisaEntity.getValor());
                }
                pesquisaProdutoTO.setIdPesquisa(idPesquisaMap);
            }
        }
        catch (DSENConverterException e) {
            throw new DSENConverterException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaProdutoTO;
    }

    public static CertificadoInfoEntity getCertificadoEntity(CertificadoInfoTO certificadoTO) throws DSENConverterException {
        CertificadoInfoEntity certificadoInfoEntity = null;
        try {
            if (certificadoTO != null) {
                certificadoInfoEntity = new CertificadoInfoEntity();
                PropertyUtils.copyProperties((Object)certificadoInfoEntity, (Object)certificadoTO);
                certificadoInfoEntity.setEmitente(DSENBusinessConverter.getEmitenteEntity((EmitenteTO)certificadoTO.getEmitenteTO()));
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return certificadoInfoEntity;
    }

    public static CertificadoInfoTO getCertificadoTO(CertificadoInfoEntity certificadoEntity) throws DSENConverterException {
        CertificadoInfoTO certificadoInfoTO = null;
        try {
            if (certificadoEntity != null) {
                certificadoInfoTO = new CertificadoInfoTO();
                PropertyUtils.copyProperties((Object)certificadoInfoTO, (Object)certificadoEntity);
                certificadoInfoTO.setEmitenteTO(DSENBusinessConverter.getEmitenteTO((EmitenteEntity)certificadoEntity.getEmitente()));
            }
        }
        catch (IllegalAccessException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (InvocationTargetException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        catch (NoSuchMethodException e) {
            throw new DSENConverterException((Throwable)e, e.getMessage());
        }
        return certificadoInfoTO;
    }

    public static List<CertificadoInfoTO> getCertificadoInfoTO(List<RepositorioInfo> listRepositorioInfo, EmitenteTO emitenteTO) {
        ArrayList<CertificadoInfoTO> listCertificadoInfoTO = null;
        if (listRepositorioInfo != null) {
            listCertificadoInfoTO = new ArrayList<CertificadoInfoTO>();
            for (RepositorioInfo repositorioInfo : listRepositorioInfo) {
                CertificadoInfoTO to = new CertificadoInfoTO();
                to.setCaminho(repositorioInfo.getCaminho());
                to.setDataUtilizacao(repositorioInfo.getDataUtilizacao());
                to.setAlias(repositorioInfo.getNome());
                to.setNome(repositorioInfo.getNome());
                to.setTipoCertificado(repositorioInfo.getTpCertif());
                to.setEmitenteTO(emitenteTO);
                listCertificadoInfoTO.add(to);
            }
        }
        return listCertificadoInfoTO;
    }

    public static RepositorioInfo getRepositorioInfo(CertificadoInfoTO cto) {
        RepositorioInfo repositorioInfo = new RepositorioInfo();
        repositorioInfo.setCaminho(cto.getCaminho());
        repositorioInfo.setDataUtilizacao(cto.getDataUtilizacao());
        repositorioInfo.setNome(cto.getNome());
        repositorioInfo.setTpCertif(cto.getTipoCertificado());
        return repositorioInfo;
    }

    public static List<LoteTO> getLoteTO(List<LoteEntity> listaLoteEntity) throws DSENConverterException {
        if (listaLoteEntity == null) {
            return null;
        }
        ArrayList<LoteTO> listaLoteTO = new ArrayList<LoteTO>();
        for (LoteEntity loteEntity : listaLoteEntity) {
            listaLoteTO.add(DSENBusinessConverter.getLoteTO((LoteEntity)loteEntity));
        }
        return listaLoteTO;
    }

    public static List<LoteEntity> getLoteEntity(Collection<LoteTO> listaLoteTO) throws DSENConverterException {
        if (listaLoteTO == null) {
            return null;
        }
        ArrayList<LoteEntity> listaLoteEntity = new ArrayList<LoteEntity>();
        for (LoteTO loteTO : listaLoteTO) {
            listaLoteEntity.add(DSENBusinessConverter.getLoteEntity((LoteTO)loteTO));
        }
        return listaLoteEntity;
    }
}

