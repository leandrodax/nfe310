/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFAssinadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFAutorizadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFCanceladaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFDenegadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFEmDigitacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFEmProcessamentoSefazTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFInutilizadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFProblemaTransmissaoTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFRejeitadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNFValidadaTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DocumentoUtil
 *  br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.RelatorioBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter
 *  br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO
 *  br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity
 *  br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENConverterException
 *  br.gov.sp.fazenda.dsen.model.exception.DSENDAOException
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Ide$TpNF$Enum
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ICMSTot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$ISSQNtot
 *  br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe$InfNFe$Total$RetTrib
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.common.util.XMLUtil
 *  br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction
 *  br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException
 *  org.apache.log4j.Logger
 */
package br.gov.sp.fazenda.dsen.model.business;

import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TelaPesquisaEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFAssinadaTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFAutorizadaTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFCanceladaTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFDenegadaTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFEmDigitacaoTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFEmProcessamentoSefazTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFInutilizadaTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFProblemaTransmissaoTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFRejeitadaTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNFValidadaTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DocumentoUtil;
import br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.business.util.DSENBusinessConverter;
import br.gov.sp.fazenda.dsen.model.dao.PesquisaDAO;
import br.gov.sp.fazenda.dsen.model.entity.EmitenteEntity;
import br.gov.sp.fazenda.dsen.model.entity.PesquisaEntity;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.exception.DSENConverterException;
import br.gov.sp.fazenda.dsen.model.exception.DSENDAOException;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.NFeDocument;
import br.gov.sp.fazenda.dsen.schemas.nfe.v310.TNFe;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO;
import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.common.util.XMLUtil;
import br.gov.sp.fazenda.dsge.model.dao.util.DSGETransaction;
import br.gov.sp.fazenda.dsge.model.exception.DSGEDAOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class RelatorioBusiness {
    private Logger a;
    private PesquisaDAO a = new PesquisaDAO();

    public PesquisaRelatorioGerencialTO carregarPesquisaRelatorioGerencial(EmitenteTO emitenteTO) throws DSENBusinessException {
        PesquisaRelatorioGerencialTO pesquisaRelatorioGerencialTO = null;
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)emitenteTO);
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(TelaPesquisaEnum.RELATORIO_GERENCIAL);
            pesquisaRelatorioGerencialTO = DSENBusinessConverter.getPesquisaRelatorioGerencialTO((List)this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity));
        }
        catch (DSENDAOException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        catch (DSENConverterException e) {
            throw new DSENBusinessException((DSGEBaseException)e, e.getMessage());
        }
        return pesquisaRelatorioGerencialTO;
    }

    public PesquisaRelatorioGerencialTO verificarFiltroNFRelatorioGerencial(PesquisaRelatorioGerencialTO pesquisaTO) {
        this.a.debug((Object)"(RelatorioBusiness.verificarFiltroRelatorioGerencial) Inicio");
        if (pesquisaTO.getIdSituacaoNf() == null || pesquisaTO.getIdSituacaoNf().size() == 0) {
            pesquisaTO.addError("\u00c9 necess\u00e1rio selecionar ao menos uma Situa\u00e7\u00e3o");
        }
        if (pesquisaTO.getDataIni() == null || pesquisaTO.getDataFim() == null) {
            pesquisaTO.addError("O intervalo de data de emiss\u00e3o deve ser preenchido");
        } else if (pesquisaTO.getDataFim().before(pesquisaTO.getDataIni())) {
            pesquisaTO.addError("A data inicial do intervalo deve ser menor que a data final");
        }
        this.a.debug((Object)"(RelatorioBusiness.verificarFiltroRelatorioGerencial) Fim");
        return pesquisaTO;
    }

    public PesquisaRelatorioGerencialTO verificarFiltroInutilizacaoRelatorioGerencial(PesquisaRelatorioGerencialTO pesquisaTO) {
        if (pesquisaTO.getDataIni() == null || pesquisaTO.getDataFim() == null) {
            pesquisaTO.addError("O intervalo de data de inutiliza\u00e7\u00e3o deve ser preenchido");
        } else if (pesquisaTO.getDataFim().before(pesquisaTO.getDataIni())) {
            pesquisaTO.addError("A data inicial do intervalo deve ser menor que a data final");
        }
        return pesquisaTO;
    }

    public RelatorioNotaFiscalTO gerarRelatorioGerencialNF(PesquisaRelatorioGerencialTO pesquisaTO) throws DSENBusinessException {
        NotaFiscalBusiness notaFiscalBusiness;
        this.a.debug((Object)"(RelatorioBusiness.gerarRelatorioGerencialNF) Inicio");
        try {
            notaFiscalBusiness = (NotaFiscalBusiness)BusinessFactory.create((String)NotaFiscalBusiness.class.getName());
        }
        catch (Exception exception) {
            throw new DSENBusinessException((Throwable)exception, exception.getMessage());
        }
        RelatorioNotaFiscalTO relatorio = new RelatorioNotaFiscalTO();
        boolean notaFiscalSemXML = false;
        this.a.debug((Object)("(RelatorioBusiness.gerarRelatorioGerencialNF) Data: " + pesquisaTO.getDataIni() + ", " + pesquisaTO.getDataFim()));
        this.a.debug((Object)("(RelatorioBusiness.gerarRelatorioGerencialNF) Tipo: " + (Object)pesquisaTO.getIdTipoEmissaoNf()));
        this.a.debug((Object)("(RelatorioBusiness.gerarRelatorioGerencialNF) Situacao: " + pesquisaTO.getIdSituacaoNf()));
        for (SituacaoNFeEnum situacao : pesquisaTO.getIdSituacaoNf()) {
            ArrayList<Object> resultado;
            RelatorioNFDenegadaTO rel;
            NFeDocument nfe;
            PesquisaNotaFiscalTO pesquisa = new PesquisaNotaFiscalTO();
            pesquisa.setIdEmitente(pesquisaTO.getIdEmitente());
            pesquisa.setDataIni(pesquisaTO.getDataIni());
            pesquisa.setDataFim(pesquisaTO.getDataFim());
            pesquisa.setIdTipoEmissaoNf(pesquisaTO.getIdTipoEmissaoNf());
            pesquisa.setIdSituacaoNf(situacao);
            this.a.debug((Object)("(RelatorioBusiness.gerarRelatorioGerencialNF) Situa\u00e7\u00e3o: " + (Object)situacao));
            List nfCol = notaFiscalBusiness.pesquisarNotaFiscal(pesquisa, new OrdenacaoTO(), false);
            this.a.debug((Object)("(RelatorioBusiness.gerarRelatorioGerencialNF) Resultado: " + nfCol.size()));
            if (situacao.equals((Object)SituacaoNFeEnum.AUTORIZADA)) {
                BigDecimal totalIcms = new BigDecimal("0");
                BigDecimal totalIcmsSt = new BigDecimal("0");
                BigDecimal totalFrete = new BigDecimal("0");
                BigDecimal totalSeguro = new BigDecimal("0");
                BigDecimal totalDesconto = new BigDecimal("0");
                BigDecimal totalIi = new BigDecimal("0");
                BigDecimal totalIpi = new BigDecimal("0");
                BigDecimal totalPis = new BigDecimal("0");
                BigDecimal totalCofins = new BigDecimal("0");
                BigDecimal totalPistSt = new BigDecimal("0");
                BigDecimal totalCofinsSt = new BigDecimal("0");
                BigDecimal totalIssqn = new BigDecimal("0");
                BigDecimal totalNfe = new BigDecimal("0");
                ArrayList<RelatorioNFAutorizadaTO> resultado2 = new ArrayList<RelatorioNFAutorizadaTO>();
                for (NotaFiscalTO nf : nfCol) {
                    NFeDocument nfe2 = null;
                    try {
                        nfe2 = DocumentoUtil.getNFeDocument((String)nf.getDocXmlString());
                    }
                    catch (Exception exception) {
                        this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + exception.getMessage()));
                        throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                    }
                    RelatorioNFAutorizadaTO rel2 = new RelatorioNFAutorizadaTO();
                    rel2.setSituacaoNfe(nf.getSituacao());
                    rel2.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                    rel2.setSerie(nf.getSerie());
                    rel2.setAno(nf.getAno().toString());
                    rel2.setMes(nf.getMes().toString());
                    rel2.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                    rel2.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                    rel2.setDataAutorizacao(DateHelper.formataDataHora((Date)nf.getDataAutorizacao(), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT));
                    rel2.setProtocoloAutorizacao(nf.getNumeroProtocolo());
                    if (nfe2 == null) {
                        notaFiscalSemXML = true;
                        continue;
                    }
                    try {
                        if (nfe2.getNFe().getInfNFe().getIde().getTpNF() == null) {
                            rel2.setEntradaSaida("");
                        } else if (TipoDocumentoNFeEnum.ENTRADA.equals((Object)TipoDocumentoNFeEnum.getEnumPeloCodigo((String)nfe2.getNFe().getInfNFe().getIde().getTpNF().toString()))) {
                            rel2.setEntradaSaida("E");
                        } else {
                            rel2.setEntradaSaida("S");
                        }
                        rel2.setBaseIcms(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVBC(), (int)2, (int)2));
                        rel2.setValorIcms(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVICMS().toString(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVICMS() != null) {
                            totalIcms = totalIcms.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVICMS()));
                        }
                        rel2.setBaseIcmsSt(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVBCST(), (int)2, (int)2));
                        rel2.setValorIcmsSt(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVST(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVST() != null) {
                            totalIcmsSt = totalIcmsSt.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVST()));
                        }
                        rel2.setValotTotalProduto(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVProd().toString(), (int)2, (int)2));
                        rel2.setValorFrete(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVFrete(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVFrete() != null) {
                            totalFrete = totalFrete.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVFrete()));
                        }
                        rel2.setValorSeguro(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVSeg(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVSeg() != null) {
                            totalSeguro = totalSeguro.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVSeg()));
                        }
                        rel2.setValorTotalDesconto(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVDesc(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVDesc() != null) {
                            totalDesconto = totalDesconto.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVDesc()));
                        }
                        rel2.setValorTotalII(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVII(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVII() != null) {
                            totalIi = totalIi.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVII()));
                        }
                        rel2.setValorTotalIpi(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVIPI(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVIPI() != null) {
                            totalIpi = totalIpi.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVIPI()));
                        }
                        rel2.setValorPis(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVPIS(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVPIS() != null) {
                            totalPis = totalPis.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVPIS()));
                        }
                        rel2.setValorCofins(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVCOFINS(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVCOFINS() != null) {
                            totalCofins = totalCofins.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVCOFINS()));
                        }
                        rel2.setOutrasDespesasAcessorias(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVOutro().toString(), (int)2, (int)2));
                        rel2.setValorTotalNfe(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVNF(), (int)2, (int)2));
                        if (nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVNF() != null) {
                            totalNfe = totalNfe.add(new BigDecimal(nfe2.getNFe().getInfNFe().getTotal().getICMSTot().getVNF()));
                        }
                        if (nfe2.getNFe().getInfNFe().getTotal().getISSQNtot() != null) {
                            rel2.setValorTotalNaoTributosIcms(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getISSQNtot().getVServ(), (int)2, (int)2));
                            rel2.setBaseIss(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getISSQNtot().getVBC(), (int)2, (int)2));
                            rel2.setValorTotalIss(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getISSQNtot().getVISS(), (int)2, (int)2));
                            rel2.setValorPisServicos(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getISSQNtot().getVPIS(), (int)2, (int)2));
                            rel2.setValorCofinsServicos(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getISSQNtot().getVCOFINS(), (int)2, (int)2));
                        } else {
                            rel2.setValorTotalNaoTributosIcms("");
                            rel2.setBaseIss("");
                            rel2.setValorTotalIss("");
                            rel2.setValorPisServicos("");
                            rel2.setValorCofinsServicos("");
                        }
                        if (nfe2.getNFe().getInfNFe().getTotal().getRetTrib() != null) {
                            rel2.setValorRetidoPis(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getRetTrib().getVRetPIS(), (int)2, (int)2));
                            rel2.setValorRetidoCofins(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getRetTrib().getVRetCOFINS(), (int)2, (int)2));
                            rel2.setValorRetidoCsll(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getRetTrib().getVRetCSLL(), (int)2, (int)2));
                            rel2.setBaseIrrf(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getRetTrib().getVBCIRRF(), (int)2, (int)2));
                            rel2.setValorRetidoIrrf(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getRetTrib().getVIRRF(), (int)2, (int)2));
                            rel2.setBasePrevidencia(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getRetTrib().getVBCRetPrev(), (int)2, (int)2));
                            rel2.setValorRetidoPrevidencia(StringHelper.formataValor((String)nfe2.getNFe().getInfNFe().getTotal().getRetTrib().getVRetPrev(), (int)2, (int)2));
                        } else {
                            rel2.setValorRetidoPis("");
                            rel2.setValorRetidoCofins("");
                            rel2.setValorRetidoCsll("");
                            rel2.setBaseIrrf("");
                            rel2.setValorRetidoIrrf("");
                            rel2.setBasePrevidencia("");
                            rel2.setValorRetidoPrevidencia("");
                        }
                    }
                    catch (Exception exception) {
                        this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao ler um dos dados do XML: " + exception.getMessage()));
                        throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                    }
                    rel2.setResultadoTotalIcms(StringHelper.formataValor((BigDecimal)totalIcms, (int)2, (int)2));
                    rel2.setResultadoTotalIcmsSt(StringHelper.formataValor((BigDecimal)totalIcmsSt, (int)2, (int)2));
                    rel2.setResultadoTotalFrete(StringHelper.formataValor((BigDecimal)totalFrete, (int)2, (int)2));
                    rel2.setResultadoTotalSeguro(StringHelper.formataValor((BigDecimal)totalSeguro, (int)2, (int)2));
                    rel2.setResultadoTotalDesconto(StringHelper.formataValor((BigDecimal)totalDesconto, (int)2, (int)2));
                    rel2.setResultadoTotalII(StringHelper.formataValor((BigDecimal)totalIi, (int)2, (int)2));
                    rel2.setResultadoTotalIpi(StringHelper.formataValor((BigDecimal)totalIpi, (int)2, (int)2));
                    rel2.setResultadoTotalPis(StringHelper.formataValor((BigDecimal)totalPis, (int)2, (int)2));
                    rel2.setResultadoTotalCofins(StringHelper.formataValor((BigDecimal)totalCofins, (int)2, (int)2));
                    rel2.setResultadoTotalPisSt(StringHelper.formataValor((BigDecimal)totalPistSt, (int)2, (int)2));
                    rel2.setResultadoTotalCofinsSt(StringHelper.formataValor((BigDecimal)totalCofinsSt, (int)2, (int)2));
                    rel2.setResultadoTotalIssqn(StringHelper.formataValor((BigDecimal)totalIssqn, (int)2, (int)2));
                    rel2.setResultadoTotalValorNfe(StringHelper.formataValor((BigDecimal)totalNfe, (int)2, (int)2));
                    resultado2.add(rel2);
                }
                relatorio.setAutorizadas(resultado2);
                continue;
            }
            if (situacao.equals((Object)SituacaoNFeEnum.CANCELADA)) {
                resultado = new ArrayList<Object>();
                for (NotaFiscalTO nf : nfCol) {
                    RelatorioNFCanceladaTO rel3 = new RelatorioNFCanceladaTO();
                    rel3.setSituacaoNfe(nf.getSituacao());
                    rel3.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                    rel3.setSerie(nf.getSerie());
                    rel3.setAno(nf.getAno().toString());
                    rel3.setMes(nf.getMes().toString());
                    rel3.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                    rel3.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                    if (nf.getSituacao().equals((Object)SituacaoNFeEnum.CANCELADA_EVENTO)) {
                        if (nf.getEventoTOList() != null) {
                            for (EventoTO eventoTO : nf.getEventoTOList()) {
                                if (eventoTO.getTpEvento() != TipoEventoEnum.e110111) continue;
                                rel3.setDataCancelamento(DateHelper.formataDataHora((Date)eventoTO.getDataEvento(), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT));
                                rel3.setProtocoloCancelamento(eventoTO.getNumProtocolo());
                                rel3.setMotivoCancelamento(XMLUtil.getFirstTagConteudo((String)eventoTO.getXmlProcString(), (String)"xJust", (boolean)false, (boolean)false));
                            }
                        }
                    } else {
                        CancelamentoTO cancTO = nf.getCancelamentoTO();
                        if (cancTO != null) {
                            rel3.setDataCancelamento(DateHelper.formataDataHora((Date)cancTO.getDataProtocolo(), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT));
                            rel3.setProtocoloCancelamento(cancTO.getNumeroProtocolo());
                            rel3.setMotivoCancelamento(cancTO.getJustificativa());
                        } else {
                            rel3.setMotivoCancelamento("");
                        }
                    }
                    resultado.add((Object)rel3);
                }
                relatorio.setCanceladas(resultado);
                continue;
            }
            if (situacao.equals((Object)SituacaoNFeEnum.DENEGADA)) {
                resultado = new ArrayList();
                for (NotaFiscalTO nf : nfCol) {
                    nfe = null;
                    try {
                        nfe = DocumentoUtil.getNFeDocument((String)nf.getDocXmlString());
                    }
                    catch (Exception exception) {
                        this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + exception.getMessage()));
                        throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                    }
                    rel = new RelatorioNFDenegadaTO();
                    rel.setSituacaoNfe(nf.getSituacao());
                    rel.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                    rel.setSerie(nf.getSerie());
                    rel.setAno(nf.getAno().toString());
                    rel.setMes(nf.getMes().toString());
                    rel.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                    rel.setDataDenegacao(DateHelper.formataDataHora((Date)nf.getDataProtocolo(), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT));
                    rel.setProtocoloDenegacao(nf.getNumeroProtocolo());
                    if (nfe != null) {
                        if (nfe.getNFe().getInfNFe().getIde().getTpNF() == null) {
                            rel.setEntradaSaida("");
                        } else if (nfe.getNFe().getInfNFe().getIde().getTpNF().equals((Object)TNFe.InfNFe.Ide.TpNF.X_0)) {
                            rel.setEntradaSaida("E");
                        } else {
                            rel.setEntradaSaida("S");
                        }
                    }
                    rel.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                    if (nf.getMensagemErro() != null) {
                        rel.setMotivoDenegacao(nf.getMensagemErro());
                    } else {
                        rel.setMotivoDenegacao("");
                    }
                    resultado.add((Object)rel);
                }
                relatorio.setDenegadas(resultado);
                continue;
            }
            if (situacao.equals((Object)SituacaoNFeEnum.REJEITADA)) {
                resultado = new ArrayList();
                for (NotaFiscalTO nf : nfCol) {
                    nfe = null;
                    try {
                        nfe = DocumentoUtil.getNFeDocument((String)nf.getDocXmlString());
                    }
                    catch (Exception exception) {
                        this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + exception.getMessage()));
                        throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                    }
                    rel = new RelatorioNFRejeitadaTO();
                    rel.setSituacaoNfe(nf.getSituacao());
                    rel.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                    rel.setSerie(nf.getSerie());
                    rel.setAno(nf.getAno().toString());
                    rel.setMes(nf.getMes().toString());
                    rel.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                    if (nfe != null) {
                        if (nfe.getNFe().getInfNFe().getIde().getTpNF() == null) {
                            rel.setEntradaSaida("");
                        } else if (nfe.getNFe().getInfNFe().getIde().getTpNF().equals((Object)TNFe.InfNFe.Ide.TpNF.X_0)) {
                            rel.setEntradaSaida("E");
                        } else {
                            rel.setEntradaSaida("S");
                        }
                    }
                    rel.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                    if (nf.getMensagemErro() != null) {
                        rel.setMotivoRejeicao(nf.getMensagemErro());
                    } else {
                        rel.setMotivoRejeicao("");
                    }
                    resultado.add((Object)rel);
                }
                relatorio.setRejeitadas(resultado);
                continue;
            }
            if (situacao.equals((Object)SituacaoNFeEnum.EM_PROCESSAMENTO_SEFAZ)) {
                resultado = new ArrayList();
                for (NotaFiscalTO nf : nfCol) {
                    nfe = null;
                    try {
                        nfe = DocumentoUtil.getNFeDocument((String)nf.getDocXmlString());
                    }
                    catch (Exception exception) {
                        this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + exception.getMessage()));
                        throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                    }
                    rel = new RelatorioNFEmProcessamentoSefazTO();
                    rel.setSituacaoNfe(nf.getSituacao());
                    rel.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                    rel.setSerie(nf.getSerie());
                    rel.setAno(nf.getAno().toString());
                    rel.setMes(nf.getMes().toString());
                    rel.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                    if (nfe != null) {
                        if (nfe.getNFe().getInfNFe().getIde().getTpNF() == null) {
                            rel.setEntradaSaida("");
                        } else if (nfe.getNFe().getInfNFe().getIde().getTpNF().equals((Object)TNFe.InfNFe.Ide.TpNF.X_0)) {
                            rel.setEntradaSaida("E");
                        } else {
                            rel.setEntradaSaida("S");
                        }
                    }
                    rel.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                    resultado.add((Object)rel);
                }
                relatorio.setEmProcessamentoSefaz(resultado);
                continue;
            }
            if (situacao.equals((Object)SituacaoNFeEnum.TRANSMITIDA_COM_PENDENCIA)) {
                resultado = new ArrayList();
                for (NotaFiscalTO nf : nfCol) {
                    nfe = null;
                    try {
                        nfe = DocumentoUtil.getNFeDocument((String)nf.getDocXmlString());
                    }
                    catch (Exception exception) {
                        this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + exception.getMessage()));
                        throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                    }
                    rel = new RelatorioNFProblemaTransmissaoTO();
                    rel.setSituacaoNfe(nf.getSituacao());
                    rel.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                    rel.setSerie(nf.getSerie());
                    rel.setAno(nf.getAno().toString());
                    rel.setMes(nf.getMes().toString());
                    rel.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                    if (nfe != null) {
                        if (nfe.getNFe().getInfNFe().getIde().getTpNF() == null) {
                            rel.setEntradaSaida("");
                        } else if (nfe.getNFe().getInfNFe().getIde().getTpNF().equals((Object)TNFe.InfNFe.Ide.TpNF.X_0)) {
                            rel.setEntradaSaida("E");
                        } else {
                            rel.setEntradaSaida("S");
                        }
                    }
                    rel.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                    resultado.add((Object)rel);
                }
                relatorio.setTransmitidaPendencia(resultado);
                continue;
            }
            if (situacao.equals((Object)SituacaoNFeEnum.VALIDADA)) {
                BigDecimal totalNfe = new BigDecimal("0");
                ArrayList<RelatorioNFValidadaTO> resultado3 = new ArrayList<RelatorioNFValidadaTO>();
                for (NotaFiscalTO nf : nfCol) {
                    NFeDocument nfe3 = null;
                    try {
                        nfe3 = DocumentoUtil.getNFeDocument((String)nf.getDocXmlString());
                    }
                    catch (Exception exception) {
                        this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + exception.getMessage()));
                        throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                    }
                    RelatorioNFValidadaTO rel4 = new RelatorioNFValidadaTO();
                    rel4.setSituacaoNfe(nf.getSituacao());
                    rel4.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                    rel4.setSerie(nf.getSerie());
                    rel4.setAno(nf.getAno().toString());
                    rel4.setMes(nf.getMes().toString());
                    rel4.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                    rel4.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                    if (nfe3 != null) {
                        if (nfe3.getNFe().getInfNFe().getIde().getTpNF() == null) {
                            rel4.setEntradaSaida("");
                        } else if (nfe3.getNFe().getInfNFe().getIde().getTpNF().equals((Object)TNFe.InfNFe.Ide.TpNF.X_0)) {
                            rel4.setEntradaSaida("E");
                        } else {
                            rel4.setEntradaSaida("S");
                        }
                    }
                    rel4.setValorTotalNfe(StringHelper.formataValor((BigDecimal)totalNfe, (int)2, (int)2));
                    resultado3.add(rel4);
                }
                relatorio.setValidada(resultado3);
                continue;
            }
            if (situacao.equals((Object)SituacaoNFeEnum.ASSINADA)) {
                resultado = new ArrayList();
                for (NotaFiscalTO nf : nfCol) {
                    nfe = null;
                    try {
                        nfe = DocumentoUtil.getNFeDocument((String)nf.getDocXmlString());
                    }
                    catch (Exception exception) {
                        this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + exception.getMessage()));
                        throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                    }
                    rel = new RelatorioNFAssinadaTO();
                    rel.setSituacaoNfe(nf.getSituacao());
                    rel.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                    rel.setSerie(nf.getSerie());
                    rel.setAno(nf.getAno().toString());
                    rel.setMes(nf.getMes().toString());
                    rel.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                    if (nfe != null) {
                        if (nfe.getNFe().getInfNFe().getIde().getTpNF() == null) {
                            rel.setEntradaSaida("");
                        } else if (nfe.getNFe().getInfNFe().getIde().getTpNF().equals((Object)TNFe.InfNFe.Ide.TpNF.X_0)) {
                            rel.setEntradaSaida("E");
                        } else {
                            rel.setEntradaSaida("S");
                        }
                    }
                    rel.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                    if (nf.getDanfeImpresso() == null) {
                        rel.setDanfeImpresso("N\u00e3o");
                    } else if (nf.getDanfeImpresso().booleanValue()) {
                        rel.setDanfeImpresso("Sim");
                    } else {
                        rel.setDanfeImpresso("N\u00e3o");
                    }
                    resultado.add((Object)rel);
                }
                relatorio.setAssinada(resultado);
                continue;
            }
            if (!situacao.equals((Object)SituacaoNFeEnum.EM_DIGITACAO)) continue;
            resultado = new ArrayList();
            for (NotaFiscalTO nf : nfCol) {
                nfe = null;
                try {
                    nfe = DocumentoUtil.getNFeDocument((String)nf.getDocXmlString());
                }
                catch (Exception exception) {
                    this.a.error((Object)("(DanfeBusiness.getImpressaoDanfeTOByNotaFiscalTO) Erro ao capturar o objeto NFe: " + exception.getMessage()));
                    throw new DSENBusinessException((Throwable)exception, exception.getMessage());
                }
                rel = new RelatorioNFEmDigitacaoTO();
                rel.setSituacaoNfe(nf.getSituacao());
                rel.setNumero(StringHelper.formataNotaFiscal((String)nf.getNumero()));
                rel.setSerie(nf.getSerie());
                rel.setAno(nf.getAno().toString());
                rel.setMes(nf.getMes().toString());
                rel.setDataEmissao(DateHelper.formataData((Date)nf.getDataEmissao()));
                if (nfe != null) {
                    if (nfe.getNFe().getInfNFe().getIde().getTpNF() == null) {
                        rel.setEntradaSaida("");
                    } else if (nfe.getNFe().getInfNFe().getIde().getTpNF().equals((Object)TNFe.InfNFe.Ide.TpNF.X_0)) {
                        rel.setEntradaSaida("E");
                    } else {
                        rel.setEntradaSaida("S");
                    }
                }
                rel.setTipoNfe(nf.getTipoEmissao().getDescricaoRelatorio());
                resultado.add((Object)rel);
            }
            relatorio.setEmDigitacao(resultado);
        }
        this.a.debug((Object)"(RelatorioBusiness.gerarRelatorioGerencialNF) Fim");
        return relatorio;
    }

    public RelatorioNotaFiscalTO gerarRelatorioGerencialInutilizacao(PesquisaRelatorioGerencialTO pesquisaRelatorioGerencialTO) throws DSENBusinessException {
        InutilizacaoBusiness inutilizacaoBusiness;
        this.a.debug((Object)"(RelatorioBusiness.gerarRelatorioGerencialInutilizacao) Inicio");
        try {
            inutilizacaoBusiness = (InutilizacaoBusiness)BusinessFactory.create((String)InutilizacaoBusiness.class.getName());
        }
        catch (Exception exception) {
            throw new DSENBusinessException((Throwable)exception, exception.getMessage());
        }
        RelatorioNotaFiscalTO relatorio = new RelatorioNotaFiscalTO();
        this.a.debug((Object)("(RelatorioBusiness.gerarRelatorioGerencialInutilizacao) Data: " + pesquisaRelatorioGerencialTO.getDataIni() + ", " + pesquisaRelatorioGerencialTO.getDataFim()));
        ArrayList<RelatorioNFInutilizadaTO> inutilizacaoList = new ArrayList<RelatorioNFInutilizadaTO>();
        List resultado = inutilizacaoBusiness.pesquisarInutilizacaoByData(pesquisaRelatorioGerencialTO);
        if (resultado != null) {
            this.a.debug((Object)("(RelatorioBusiness.gerarRelatorioGerencialInutilizacao) Resultado: " + resultado.size()));
            if (inutilizacaoList != null) {
                for (InutilizacaoTO inutilizacao : resultado) {
                    RelatorioNFInutilizadaTO r = new RelatorioNFInutilizadaTO();
                    r.setFaixaInicial(StringHelper.formataNotaFiscal((String)inutilizacao.getNumeroInicial().toString()));
                    r.setFaixaFinal(StringHelper.formataNotaFiscal((String)inutilizacao.getNumeroFinal().toString()));
                    r.setSerie(inutilizacao.getSerie());
                    String motivo = XMLUtil.getFirstTagConteudo((String)inutilizacao.getProtocoloXmlString(), (String)"xJust", (boolean)false, (boolean)true);
                    r.setMotivoInutilizacao(motivo == null ? "" : motivo);
                    r.setDataInutilizacao(DateHelper.formataDataHora((Date)inutilizacao.getDataInutilizacao(), (SimpleDateFormat)DateHelper.DATE_HOUR_MINUTE_FORMAT));
                    String nProt = XMLUtil.getFirstTagConteudo((String)inutilizacao.getProtocoloXmlString(), (String)"nProt", (boolean)false, (boolean)false);
                    r.setProtocoloInutilizacao(nProt == null ? "" : nProt);
                    inutilizacaoList.add(r);
                }
            }
        }
        this.a.debug((Object)("(RelatorioBusiness.gerarRelatorioGerencialInutilizacao) Inutilizacoes: " + inutilizacaoList.size()));
        relatorio.setInutilizacao(inutilizacaoList);
        this.a.debug((Object)"(RelatorioBusiness.gerarRelatorioGerencialInutilizacao) Fim");
        return relatorio;
    }

    @DSGETransaction
    public void salvarPesquisaRelatorioGerencial(PesquisaRelatorioGerencialTO pesquisaRelatorioGerencialTO) throws DSENBusinessException {
        try {
            EmitenteEntity emitenteEntity = DSENBusinessConverter.getEmitenteEntity((EmitenteTO)pesquisaRelatorioGerencialTO.getIdEmitente());
            PesquisaEntity pesquisaEntity = new PesquisaEntity();
            pesquisaEntity.setIdEmitente(emitenteEntity);
            pesquisaEntity.setTelaEnum(pesquisaRelatorioGerencialTO.getTelaPesquisaEnum());
            List listPesquisaBanco = this.a.selectByEmitenteTelaPesquisaEnum(pesquisaEntity);
            List listPesquisaTela = DSENBusinessConverter.getPesquisaEntity((PesquisaRelatorioGerencialTO)pesquisaRelatorioGerencialTO);
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
}

