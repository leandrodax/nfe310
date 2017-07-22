/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO
 *  br.gov.sp.fazenda.dsen.common.to.DpecTO$DpecStatus
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.NumeracaoTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO
 *  br.gov.sp.fazenda.dsen.common.to.ProblemaDpecDanfeTO
 *  br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 *  br.gov.sp.fazenda.dsen.model.business.DanfeBusiness
 *  br.gov.sp.fazenda.dsen.model.business.DpecBusiness
 *  br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness
 *  br.gov.sp.fazenda.dsen.model.business.NumeracaoBusiness
 *  br.gov.sp.fazenda.dsen.model.business.RelatorioBusiness
 *  br.gov.sp.fazenda.dsen.model.business.TransmissorBusiness
 *  br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory
 *  br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException
 *  br.gov.sp.fazenda.dsen.model.facade.NotaFiscalFacade
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsge.common.exception.DSGECommonException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO
 *  br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException
 */
package br.gov.sp.fazenda.dsen.model.facade;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoConsultaDpecEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoPapelImpressaoEnum;
import br.gov.sp.fazenda.dsen.common.to.CertificadoLoteTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.DpecNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.DpecTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.ImpressaoDanfeTO;
import br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.NumeracaoTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.PesquisaRelatorioGerencialTO;
import br.gov.sp.fazenda.dsen.common.to.ProblemaDpecDanfeTO;
import br.gov.sp.fazenda.dsen.common.to.RelatorioNotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.to.SelecaoDanfeTO;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO;
import br.gov.sp.fazenda.dsen.model.business.DanfeBusiness;
import br.gov.sp.fazenda.dsen.model.business.DpecBusiness;
import br.gov.sp.fazenda.dsen.model.business.InutilizacaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.NotaFiscalBusiness;
import br.gov.sp.fazenda.dsen.model.business.NumeracaoBusiness;
import br.gov.sp.fazenda.dsen.model.business.RelatorioBusiness;
import br.gov.sp.fazenda.dsen.model.business.TransmissorBusiness;
import br.gov.sp.fazenda.dsen.model.business.factory.BusinessFactory;
import br.gov.sp.fazenda.dsen.model.exception.DSENBusinessException;
import br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem;
import br.gov.sp.fazenda.dsge.common.exception.DSGECommonException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.to.OrdenacaoTO;
import br.gov.sp.fazenda.dsge.util.exception.DSGEUtilException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NotaFiscalFacade {
    private DanfeBusiness a;
    private NotaFiscalBusiness a;
    private InutilizacaoBusiness a;
    private RelatorioBusiness a;
    private TransmissorBusiness a;
    private NumeracaoBusiness a;
    private DpecBusiness a;

    private NotaFiscalBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (NotaFiscalBusiness)BusinessFactory.create((String)NotaFiscalBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    private InutilizacaoBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (InutilizacaoBusiness)BusinessFactory.create((String)InutilizacaoBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    private NumeracaoBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (NumeracaoBusiness)BusinessFactory.create((String)NumeracaoBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    private TransmissorBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (TransmissorBusiness)BusinessFactory.create((String)TransmissorBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    private DpecBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (DpecBusiness)BusinessFactory.create((String)DpecBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception ex) {
            throw new DSENBusinessException((Throwable)ex, ex.getMessage());
        }
    }

    public PesquisaNotaFiscalTO carregarPesquisaNotaFiscal(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().carregarPesquisaNotaFiscal(emitenteTO);
    }

    public boolean validarDtAutorizacaoCartaCorrecao(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        return this.a().validarDtAutorizacaoCartaCorrecao(notaFiscalTO);
    }

    public Collection<NotaFiscalTO> pesquisarNotaFiscal(PesquisaNotaFiscalTO pesquisaNotaFiscalTO, OrdenacaoTO ordenacaoTO) throws DSENBusinessException {
        return this.a().pesquisarNotaFiscal(pesquisaNotaFiscalTO, ordenacaoTO);
    }

    public Integer getCountNotaFiscal(PesquisaNotaFiscalTO pesquisaNotaFiscalTO) throws DSENBusinessException {
        return this.a().getCountNotaFiscal(pesquisaNotaFiscalTO);
    }

    public List<NotaFiscalTO> excluirNotaFiscal(List<NotaFiscalTO> listaNotaFiscalTO) throws DSENBusinessException {
        return this.a().excluir(listaNotaFiscalTO);
    }

    public void verificaPesquisaTO(PesquisaNotaFiscalTO pesquisaNotaFiscalTO) throws DSENBusinessException {
        this.a().verificaPesquisaTO(pesquisaNotaFiscalTO);
    }

    public void salvarPesquisaNotaFiscal(PesquisaNotaFiscalTO pesquisaNotaFiscalTO) throws DSENBusinessException {
        this.a().salvarPesquisaNotaFiscal(pesquisaNotaFiscalTO);
    }

    public NotaFiscalTO pesquisarPorId(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        return this.a().pesquisarPorId(notaFiscalTO.getIdNotaFiscal());
    }

    public NotaFiscalTO salvarNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        return this.a().salvar(notaFiscalTO);
    }

    public NotaFiscalTO validarNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        return this.a().validar(notaFiscalTO);
    }

    public List<NotaFiscalTO> validarNotaFiscal(List<NotaFiscalTO> notaFiscalTOList) throws DSENBusinessException {
        return this.a().validar(notaFiscalTOList);
    }

    public NotaFiscalTO detalharNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        return this.a().detalhar(notaFiscalTO);
    }

    public List<NotaFiscalTO> detalhar(List<NotaFiscalTO> notaTOList) throws DSENBusinessException {
        return this.a().detalhar(notaTOList);
    }

    public boolean verificarStatusServicoAtivo(CertificadoLoteTO certificadoLoteTO, boolean isSefaz) throws DSENBusinessException {
        return this.a().verificarStatusServicoAtivo(certificadoLoteTO, isSefaz);
    }

    public NotaFiscalTO editarNotaFiscal(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        return this.a().editar(notaFiscalTO);
    }

    public NotaFiscalTO duplicarNotaFiscal(NotaFiscalTO notaFiscalTO, String novaSerie, String novoNumero) throws DSENBusinessException {
        return this.a().duplicar(notaFiscalTO, novaSerie, novoNumero);
    }

    public NumeracaoTO pesquisarUltimoNumero(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().pesquisarUltimoNumero(emitenteTO);
    }

    public NotaFiscalTO obterRascunho(EmitenteTO emitenteTO) throws DSENBusinessException, DSGEUtilException {
        return this.a().obterRascunho(emitenteTO);
    }

    public NumeracaoTO pesquisarUltimoNumero(EmitenteTO emitenteTO, String serie) throws DSENBusinessException {
        return this.a().pesquisarUltimoNumero(emitenteTO, serie);
    }

    public NotaFiscalTO assinarNotaFiscal(NotaFiscalTO notaFiscalTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        return this.a().assinar(notaFiscalTO, certificadoTO);
    }

    public List<NotaFiscalTO> assinarNotaFiscal(List<NotaFiscalTO> notaFiscalTOList, CertificadoTO certificadoTO) throws DSENBusinessException {
        return this.a().assinar(notaFiscalTOList, certificadoTO);
    }

    public void calcularValorCOFINS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorCOFINS(notaFiscalTO);
    }

    public void calcularValorCOFINSST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorCOFINSST(notaFiscalTO);
    }

    public void calcularValorICMS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorICMS(notaFiscalTO);
    }

    public void calcularValorICMSST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorICMSST(notaFiscalTO);
    }

    public void calcularValorIPI(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorIPI(notaFiscalTO);
    }

    public void calcularValorISSQN(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorISSQN(notaFiscalTO);
    }

    public void calcularValorPIS(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorPIS(notaFiscalTO);
    }

    public void calcularValorPISST(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorPISST(notaFiscalTO);
    }

    public void calcularValorCIDE(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorCIDE(notaFiscalTO);
    }

    public void calcularValorICMSTransporte(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularValorICMSTransporte(notaFiscalTO);
    }

    public void calcularNotaFiscalTotais(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        this.a().calcularNotaFiscalTotais(notaFiscalTO);
    }

    public void inutilizarFaixas(EmitenteTO emitenteTO, List<InutilizacaoTO> listaInutilizacaoTO, CertificadoTO certificado) throws DSENBusinessException {
        this.a().inutilizarFaixas(emitenteTO, listaInutilizacaoTO, certificado);
    }

    public List<InutilizacaoTO> assinarFaixasParaInutilizar(EmitenteTO emitenteTO, List<InutilizacaoTO> listaInutilizacaoTO, CertificadoTO certificado, String justificativa) throws DSENBusinessException {
        return this.a().assinarFaixasParaInutilizar(listaInutilizacaoTO, emitenteTO, certificado, justificativa);
    }

    public List<InutilizacaoTO> obterFaixasInutilizadas(InutilizacaoTO inutilizacaoTO) throws DSENBusinessException {
        return this.a().obterFaixasInutilizadas(inutilizacaoTO);
    }

    public HashMap<String, List<InutilizacaoTO>> obterFaixasParaInutilizar(InutilizacaoTO inutilizacaoTO) throws DSENBusinessException {
        return this.a().obterFaixasParaInutilizar(inutilizacaoTO);
    }

    public InutilizacaoTO validarFiltroPesquisarFaixasParaInutilizar(InutilizacaoTO pesquisaInutilizacaoTO) throws DSENBusinessException {
        return this.a().validarFiltroPesquisarFaixasParaInutilizar(pesquisaInutilizacaoTO);
    }

    public List getSerieNumeroAnoPorSituacoes(Integer idEmitente, String serie, String numeroInicial, String numeroFinal, List<SituacaoNFeEnum> situacoes) throws DSENBusinessException {
        try {
            return this.a().getSerieNumeroAnoPorSituacoes(idEmitente, serie, numeroInicial, numeroFinal, situacoes);
        }
        catch (Throwable e) {
            throw new DSENBusinessException(e, e.getMessage());
        }
    }

    private DanfeBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (DanfeBusiness)BusinessFactory.create((String)DanfeBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception exception) {
            throw new DSENBusinessException((Throwable)exception, exception.getMessage());
        }
    }

    public SelecaoDanfeTO carregarSelecaoImpressaoDanfe(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().carregarSelecaoImpressaoDanfe(emitenteTO);
    }

    public void salvarSelecaoImpressaoDanfe(SelecaoDanfeTO selecaoDanfeTO) throws DSENBusinessException {
        this.a().salvarSelecaoImpressaoDanfe(selecaoDanfeTO);
    }

    public boolean isSelecaoValida(List<NotaFiscalTO> notaFiscalTOList) throws DSENBusinessException {
        return this.a().isSelecaoValida(notaFiscalTOList);
    }

    public boolean canSaveAndPrint(List<NotaFiscalTO> notaFiscalTOList) throws DSENBusinessException {
        return this.a().canSaveAndPrint(notaFiscalTOList);
    }

    public List<ImpressaoDanfeTO> getImpressaoDanfeTOList(List<NotaFiscalTO> notaFiscalTOList, TipoPapelImpressaoEnum tipoPapel) throws DSENBusinessException {
        return this.a().getImpressaoDanfeTOList(notaFiscalTOList, tipoPapel);
    }

    private RelatorioBusiness a() throws DSENBusinessException {
        try {
            if (this.a == null) {
                this.a = (RelatorioBusiness)BusinessFactory.create((String)RelatorioBusiness.class.getName());
            }
            return this.a;
        }
        catch (Exception exception) {
            throw new DSENBusinessException((Throwable)exception, exception.getMessage());
        }
    }

    public PesquisaRelatorioGerencialTO carregarPesquisaRelatorioGerencial(EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().carregarPesquisaRelatorioGerencial(emitenteTO);
    }

    public void salvarPesquisaRelatorioGerencial(PesquisaRelatorioGerencialTO pesquisareRelatorioGerencialTO) throws DSENBusinessException {
        this.a().salvarPesquisaRelatorioGerencial(pesquisareRelatorioGerencialTO);
    }

    public PesquisaRelatorioGerencialTO verificarFiltroNFRelatorioGerencial(PesquisaRelatorioGerencialTO pesquisaTO) throws DSENBusinessException {
        return this.a().verificarFiltroNFRelatorioGerencial(pesquisaTO);
    }

    public RelatorioNotaFiscalTO gerarRelatorioGerencialNF(PesquisaRelatorioGerencialTO pesquisaTO) throws DSENBusinessException {
        return this.a().gerarRelatorioGerencialNF(pesquisaTO);
    }

    public void cancelarNotaFiscal(CertificadoTO certificadoTO, String justificativaCanc, List<NotaFiscalTO> list) throws DSENBusinessException, DSGEUtilException {
    }

    public void cancelarNFENaoCadastrada(String chaveDeAcesso, String nProtocolo, String justificativaCanc, EmitenteTO emitenteTO, CertificadoTO certificadoTO) throws DSENBusinessException, DSGEUtilException {
    }

    public NotaFiscalTO alterarImpressaoDanfe(NotaFiscalTO notaFiscalTO) throws DSENBusinessException {
        return this.a().acrescentarDadosDanfe(notaFiscalTO);
    }

    public RelatorioNotaFiscalTO gerarRelatorioGerencialInutilizacao(PesquisaRelatorioGerencialTO pesquisaTO) throws DSENBusinessException {
        return this.a().gerarRelatorioGerencialInutilizacao(pesquisaTO);
    }

    public void transmitirNotaFiscal(List<NotaFiscalTO> notaFiscalTOList, CertificadoTO certificadoTO) throws DSENBusinessException {
        this.a().transmitir(notaFiscalTOList, certificadoTO);
    }

    public void enviarEvento(EventoTO eventoTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        this.a().enviarEvento(eventoTO, certificadoTO);
    }

    public void consultarSituacaoNFe(List<NotaFiscalTO> listaNotaFiscal, EmitenteTO emitenteTO, CertificadoTO certificadoTO) throws DSENBusinessException, DSGEUtilException {
        this.a().consultarSituacaoNFe(listaNotaFiscal, emitenteTO, certificadoTO);
    }

    public void consultarSituacaoNFePorChaveAcesso(String chaveAcesso, EmitenteTO emitenteTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        this.a().consultarSituacaoNFePorChaveAcesso(chaveAcesso, emitenteTO, certificadoTO);
    }

    public void exportarNotaFiscal(List<NotaFiscalTO> listaNotaFiscalTO, ExtensaoArquivoEnum tipoArquivoEnum, String path) throws DSENBusinessException {
        this.a().exportarNotaFiscal(listaNotaFiscalTO, tipoArquivoEnum, path);
    }

    public void gerarDPEC(List<NotaFiscalTO> listaNotaFiscal, CertificadoTO certificadoTO) throws DSENBusinessException {
        this.a().gerarDPEC(listaNotaFiscal, certificadoTO);
    }

    public Map<DpecTO.DpecStatus, List<DpecTO>> pesquisarDPEC() throws DSENBusinessException {
        return this.a().pesquisarDPEC();
    }

    public List<DpecTO> pesquisarDPEC(String dir, boolean autorizados) throws DSGECommonException, DSENBusinessException {
        return this.a().pesquisarDPEC(dir, autorizados);
    }

    public void detalharDPEC(DpecTO dpecTO, boolean validarAssinatura) throws DSENBusinessException, DSGEUtilException {
        this.a().detalharDPEC(dpecTO, validarAssinatura);
    }

    public int excluirDPEC(List<DpecTO> listaDpecTO) throws DSENBusinessException {
        return this.a().excluirDPEC(listaDpecTO);
    }

    public List<NotaFiscalTO> pesquisarNotaFiscalDPECNotaFiscal(List<DpecNotaFiscalTO> listaDpecNotaFiscalTO, List<ProblemaDpecDanfeTO> problemas) throws DSENBusinessException {
        return this.a().pesquisarNotaFiscalDPECNotaFiscal(listaDpecNotaFiscalTO, problemas);
    }

    public void transmitirDPEC(List<DpecTO> listaDpecTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        this.a().transmitirDPEC(listaDpecTO, certificadoTO);
    }

    public ImportacaoResultadoTO importarDPEC(String pathArquivo) throws DSENBusinessException {
        return this.a().importarDPEC(pathArquivo);
    }

    public void consultarDpec(TipoConsultaDpecEnum tipoConsultaDpecEnum, String chaveConsulta, CertificadoTO certificadoTO) throws DSENBusinessException {
        this.a().consultarDpec(tipoConsultaDpecEnum, chaveConsulta, certificadoTO);
    }

    public void gravarDpec(DpecTO dpecTO) throws DSENBusinessException {
        this.a().gravarDpec(dpecTO);
    }

    public NotaFiscalTO validarDadosParaConsultarNFENaoCadastrada(String chaveAcesso) throws DSENBusinessException {
        return this.a().validarDadosParaConsultarNFENaoCadastrada(chaveAcesso);
    }

    public BaseTO validarCamposParaCancelarNFeNaoCadastrada(String chaveAcesso, String protocolo, String justificativa, EmitenteTO emitenteTO) throws DSENBusinessException {
        return this.a().validarCamposParaCancelarNFENaoCadastrado(chaveAcesso, protocolo, justificativa, emitenteTO);
    }

    public void consultarSituacaoRecibo(NotaFiscalTO nfeTO, CertificadoTO certificadoTO) throws DSENBusinessException {
        this.a().consultarSituacaoRecibo(nfeTO, certificadoTO);
    }

    public void agendarBuscaRetorno(List<NotaFiscalTO> listaNotaFiscalTO, Map<String, CertificadoLoteTO> mapaCertificadoLoteTO) throws DSENBusinessException {
        this.a().agendarBuscaRetorno(listaNotaFiscalTO, mapaCertificadoLoteTO);
    }

    public void reagendarBuscaRetorno(BuscaRetornoQueueItem item, long tempoEspera) throws DSENBusinessException {
        this.a().reagendarBuscaRetorno(item, tempoEspera);
    }

    public String verificarItemFilaBuscaRetorno(NotaFiscalTO nfeTO) throws DSENBusinessException {
        return this.a().verificarItemFilaBuscaRetorno(nfeTO);
    }

    public void exportarInutilizacao(List<InutilizacaoTO> listaInutilizacaoTO, ExtensaoArquivoEnum tipoArquivoEnum, String path) throws DSENBusinessException {
        this.a().exportarInutilizacao(listaInutilizacaoTO, path);
    }
}

