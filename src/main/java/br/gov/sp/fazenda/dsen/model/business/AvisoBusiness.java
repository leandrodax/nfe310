/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.AvisoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsen.model.business.AvisoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.AvisoBusiness$1
 *  br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO
 *  br.gov.sp.fazenda.dsen.model.dao.PropriedadeDAO
 *  br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.PropriedadeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.AvisoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsen.model.business.AvisoBusiness;
import br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.DSENBaseDAO;
import br.gov.sp.fazenda.dsen.model.dao.PropriedadeDAO;
import br.gov.sp.fazenda.dsen.model.entity.PropriedadeEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class AvisoBusiness {
    private InutilizacaoBusiness a;
    private NotaFiscalBusiness a;
    private PropriedadeDAO a;
    private DSENBaseDAO a = new DSENBaseDAO();

    private void a(AvisoTO avisoTO, EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            NotaFiscalTO notaFiscalTO = new NotaFiscalTO();
            notaFiscalTO.setEmitenteTO(emitenteTO);
            notaFiscalTO.setSituacao(SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ);
            Integer qtdNotas = this.a.pesquisarQtdadeNotaFiscalSituacaoNf(notaFiscalTO);
            avisoTO.setNroNotasEmProc(qtdNotas.intValue());
            PropriedadeTO propriedadeTO = new PropriedadeTO();
            propriedadeTO.setEmitenteTO(emitenteTO);
            propriedadeTO.setPropriedadeEnum(PropriedadeEnum.DATA_ULTIMA_BUSCA_SEFAZ);
            PropriedadeEntity propriedadeEntity = this.a.selectByEmitenteAndPropriedadeEnum(DSENBusinessConverter.getPropriedadeEntity((PropriedadeTO)propriedadeTO));
            propriedadeTO = DSENBusinessConverter.getPropriedadeTO((PropriedadeEntity)propriedadeEntity);
            avisoTO.setUltimaBuscaSefaz(propriedadeTO);
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    private void a(AvisoTO avisoTO, EmitenteTO emitenteTO, TipoEmissaoEnum tipoEmissao) throws DSENBusinessException {
        try {
            PesquisaNotaFiscalTO pesquisaNotaFiscalTO = new PesquisaNotaFiscalTO();
            pesquisaNotaFiscalTO.setIdEmitente(emitenteTO);
            pesquisaNotaFiscalTO.setIdTipoEmissaoNf(tipoEmissao);
            pesquisaNotaFiscalTO.setIdSituacaoNf(SituacaoNFeEnum.ASSINADA);
            pesquisaNotaFiscalTO.setComDanfeImpresso(Boolean.TRUE);
            int count = this.a.getCountNotaFiscal(pesquisaNotaFiscalTO);
            switch (1.a[tipoEmissao.ordinal()]) {
                case 1: {
                    avisoTO.setNroNfeContNTransm(count);
                    break;
                }
                case 2: {
                    avisoTO.setNroNfeContDpecNTransm(count);
                    break;
                }
                case 3: {
                    avisoTO.setNroNfeContFsdaNTransm(count);
                }
            }
        }
        catch (DSENBusinessException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    private void b(AvisoTO avisoTO, EmitenteTO emitenteTO) throws DSENBusinessException, DSGEUtilException {
        try {
            InutilizacaoTO inutilizacaoTO = new InutilizacaoTO();
            inutilizacaoTO.setEmitenteTO(emitenteTO);
            HashMap map = this.a.obterFaixasParaInutilizar(inutilizacaoTO);
            int qtde = 0;
            for (List lista : map.values()) {
                qtde += lista.size();
            }
            avisoTO.setFaixasInutilizar(qtde);
            PropriedadeTO propriedadeTO = new PropriedadeTO();
            propriedadeTO.setEmitenteTO(emitenteTO);
            propriedadeTO.setPropriedadeEnum(PropriedadeEnum.DATA_VISUALIZACAO_FAIXA_INUTIL_MES);
            PropriedadeEntity propriedadeEntity = this.a.selectByEmitenteAndPropriedadeEnum(DSENBusinessConverter.getPropriedadeEntity((PropriedadeTO)propriedadeTO));
            propriedadeTO = DSENBusinessConverter.getPropriedadeTO((PropriedadeEntity)propriedadeEntity);
            avisoTO.setVisFaixaInutilMes(propriedadeTO);
        }
        catch (DSENBusinessException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    private void c(AvisoTO avisoTO, EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            NotaFiscalTO notaFiscalTO = new NotaFiscalTO();
            notaFiscalTO.setEmitenteTO(emitenteTO);
            notaFiscalTO.setSituacao(SituacaoNFeEnum.AUTORIZADA);
            notaFiscalTO.setAutorizacaoExportadaXml(Boolean.FALSE);
            Integer qtdNotas = this.a.pesquisarQtdadeNotaFiscalAutorizadaNaoExportada(notaFiscalTO);
            avisoTO.setNroNfeAutorNaoExport(qtdNotas.intValue());
        }
        catch (DSENBusinessException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }

    public AvisoTO verificarAvisos(EmitenteTO emitenteTO) throws DSENBusinessException {
        try {
            AvisoTO avisoTO = new AvisoTO();
            this.a(avisoTO, emitenteTO);
            this.b(avisoTO, emitenteTO);
            this.c(avisoTO, emitenteTO);
            this.a(avisoTO, emitenteTO, TipoEmissaoEnum.CONTINGENCIA);
            this.a(avisoTO, emitenteTO, TipoEmissaoEnum.CONTINGENCIA_DPEC);
            this.a(avisoTO, emitenteTO, TipoEmissaoEnum.CONTINGENCIA_FS_DA);
            return avisoTO;
        }
        catch (DSGEBaseException e) {
            throw new DSENBusinessException(e, e.getMessage());
        }
    }

    @DSGETransaction
    public void salvarUltimaVisualFaixaInutil(PropriedadeTO propriedadeTO) throws DSENBusinessException {
        try {
            PropriedadeEntity propriedadeEntity = DSENBusinessConverter.getPropriedadeEntity((PropriedadeTO)propriedadeTO);
            this.a.update((Serializable)propriedadeEntity);
        }
        catch (DSGEDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
    }
}

