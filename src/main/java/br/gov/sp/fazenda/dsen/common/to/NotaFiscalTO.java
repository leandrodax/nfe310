/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.ErroNFeTO
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.LoteTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.ProdutoEspecificoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoEmissaoEnum;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsen.common.to.ErroNFeTO;
import br.gov.sp.fazenda.dsen.common.to.EventoTO;
import br.gov.sp.fazenda.dsen.common.to.LoteTO;
import br.gov.sp.fazenda.dsen.common.util.ChaveAcessoUtil;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;

public class NotaFiscalTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = -8008577711480627010L;
    private String a;
    private TipoEmissaoEnum a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Date a;
    private Date b;
    private Boolean a;
    private Boolean b;
    private SituacaoNFeEnum a;
    private String h;
    private String i;
    private Long a;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private Date c;
    private String p;
    private Date d;
    private String q;
    private EmitenteTO a;
    private CancelamentoTO a;
    private LoteTO a;
    private List<EventoTO> a;
    private boolean a;
    private String r;
    private Date e;
    private List<ErroNFeTO> b = new ArrayList();
    private Map<String, ProdutoEspecificoEnum> a;
    private Boolean c = Boolean.FALSE;
    private Icon a;
    private DSGEBaseException a;
    private ErroXmlResposta a = false;
    private String s;

    public List<ErroNFeTO> getListaErroNFe() {
        return this.b;
    }

    public void setListaErroNFe(List<ErroNFeTO> listaErroCte) {
        this.b = listaErroCte;
    }

    public String getNumeroRegistroDPEC() {
        return this.r;
    }

    public void setNumeroRegistroDPEC(String numeroRegistroDPEC) {
        this.r = numeroRegistroDPEC;
    }

    public Date getDataRegistroDPEC() {
        return this.e;
    }

    public void setDataRegistroDPEC(Date dataRegistroDPEC) {
        this.e = dataRegistroDPEC;
    }

    public String getDigitoChaveAcesso() {
        return this.d;
    }

    public void setDigitoChaveAcesso(String dv) {
        this.d = dv;
    }

    public String getCodigoErro() {
        return this.h;
    }

    public void setCodigoErro(String erro) {
        this.h = erro;
    }

    public String getCodigoNumericoChaveAcesso() {
        return this.c;
    }

    public void setCodigoNumericoChaveAcesso(String nf) {
        this.c = nf;
    }

    public String getDocumentoDest() {
        return this.f;
    }

    public void setDocumentoDest(String documentoDest) {
        this.f = documentoDest;
    }

    public Boolean getDanfeImpresso() {
        return this.a;
    }

    public void setDanfeImpresso(Boolean danfe) {
        if (danfe == null) {
            danfe = Boolean.FALSE;
        }
        this.a = danfe;
    }

    public Boolean getAutorizacaoExportadaXml() {
        return this.b;
    }

    public void setAutorizacaoExportadaXml(Boolean autorizadaExportada) {
        if (autorizadaExportada == null) {
            autorizadaExportada = Boolean.FALSE;
        }
        this.b = autorizadaExportada;
    }

    public Date getDataAutorizacao() {
        return this.b;
    }

    public void setDataAutorizacao(Date dataAtualizacaoNf) {
        this.b = dataAtualizacaoNf;
    }

    public Date getDataEmissao() {
        return this.a;
    }

    public void setDataEmissao(Date dataEmissaoNf) {
        this.a = dataEmissaoNf;
    }

    public String getMensagemErro() {
        return this.i;
    }

    public void setMensagemErro(String mensagemErro) {
        this.i = mensagemErro;
    }

    public String getMes() {
        return this.a;
    }

    public void setMes(String mes) {
        this.a = mes;
    }

    public String getNumero() {
        return this.b;
    }

    public void setNumero(String nf) {
        this.b = nf;
    }

    public Map<String, ProdutoEspecificoEnum> getProdutoEspecifico() {
        return this.a;
    }

    public void setProdutoEspecifico(Map<String, ProdutoEspecificoEnum> produtoEspecifico) {
        this.a = produtoEspecifico;
    }

    public String getNumeroRecibo() {
        return this.e;
    }

    public void setNumeroRecibo(String recibo) {
        this.e = recibo;
    }

    public SituacaoNFeEnum getSituacao() {
        return this.a;
    }

    public void setSituacao(SituacaoNFeEnum situacaoNfEnum) {
        this.a = situacaoNfEnum;
    }

    public TipoEmissaoEnum getTipoEmissao() {
        return this.a;
    }

    public void setTipoEmissao(TipoEmissaoEnum tipoEmissaoEnum) {
        this.a = tipoEmissaoEnum;
    }

    public String getUfDest() {
        return this.g;
    }

    public void setUfDest(String ufDest) {
        this.g = ufDest;
    }

    public Boolean getTotalVerificado() {
        return this.c;
    }

    public void setTotalVerificado(Boolean compararTotal) {
        this.c = compararTotal;
    }

    public String getResultadoConsulta() {
        Boolean sucesso = this.sucessoOperacao();
        if (sucesso == null) {
            return DSENMessageConstants.NOTA_FISCAL_NAO_CONSULTADA;
        }
        if (!sucesso.booleanValue()) {
            return this.getErrorsString();
        }
        return this.getMessagesString();
    }

    public String getResultadoEnvio() {
        Boolean sucesso = this.sucessoOperacao();
        if (sucesso == null) {
            return DSENMessageConstants.NOTA_FISCAL_NAO_ENVIADA;
        }
        if (!sucesso.booleanValue()) {
            return this.getErrorsString();
        }
        return this.getMessagesString();
    }

    public String getResultadoCancelamento() {
        Boolean sucesso = this.sucessoOperacao();
        if (sucesso == null) {
            return DSENMessageConstants.NOTA_FISCAL_NAO_CANCELADA;
        }
        if (!sucesso.booleanValue()) {
            return this.getErrorsString();
        }
        return this.getMessagesString();
    }

    public Boolean sucessoOperacao() {
        if (this.getErrors() != null && this.getErrors().size() > 0) {
            return false;
        }
        if (this.getMessages() != null && this.getMessages().size() > 0) {
            return true;
        }
        return null;
    }

    public void setIcon(Icon icon) {
        this.a = icon;
    }

    public Icon getIcon() {
        return this.a;
    }

    public boolean isAtualizadaPelaConsulta() {
        return this.a;
    }

    public void setAtualizadaPelaConsulta(boolean atualizadaPelaConsulta) {
        this.a = atualizadaPelaConsulta;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof NotaFiscalTO) {
            NotaFiscalTO cte = (NotaFiscalTO)o;
            try {
                return cte.getIdNotaFiscal() != null && this.getIdNotaFiscal() != null && cte.getIdNotaFiscal().equals(this.getIdNotaFiscal()) || (this.getEmitenteTO() == null && cte.getEmitenteTO() == null || this.getEmitenteTO().getIdEmitente().equals(cte.getEmitenteTO().getIdEmitente())) && (this.getAno() == null && cte.getAno() == null || this.getAno().equals(cte.getAno())) && (this.getMes() == null && cte.getMes() == null || this.getMes().equals(cte.getMes())) && (this.getModelo() == null && cte.getModelo() == null || this.getModelo().equals(cte.getModelo())) && (this.getSerie() == null && cte.getSerie() == null || this.getSerie().equals(cte.getSerie())) && (this.getNumero() == null && cte.getNumero() == null || this.getNumero().equals(cte.getNumero()));
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return false;
    }

    public String getNomeRegistro() {
        return null;
    }

    public String getAno() {
        return this.m;
    }

    public void setAno(String ano) {
        this.m = ano;
    }

    public CancelamentoTO getCancelamentoTO() {
        return this.a;
    }

    public void setCancelamentoTO(CancelamentoTO cancelamentoTO) {
        this.a = cancelamentoTO;
    }

    public String getCodigoUfEmitente() {
        return this.q;
    }

    public void setCodigoUfEmitente(String codigoUfEmitente) {
        this.q = codigoUfEmitente;
    }

    public Date getDataProtocolo() {
        return this.d;
    }

    public void setDataProtocolo(Date dataProtocolo) {
        this.d = dataProtocolo;
    }

    public Date getDataSistema() {
        return this.c;
    }

    public void setDataSistema(Date dataSistema) {
        this.c = dataSistema;
    }

    public String getDocXmlString() {
        return this.j;
    }

    public void setDocXmlString(String docXmlString) {
        this.j = docXmlString;
    }

    public EmitenteTO getEmitenteTO() {
        return this.a;
    }

    public void setEmitenteTO(EmitenteTO idEmitente) {
        this.a = idEmitente;
    }

    public Long getIdNotaFiscal() {
        return this.a;
    }

    public void setIdNotaFiscal(Long idNotaFiscal) {
        this.a = idNotaFiscal;
    }

    public LoteTO getLoteTO() {
        return this.a;
    }

    public void setLoteTO(LoteTO lote) {
        this.a = lote;
    }

    public List<EventoTO> getEventoTOList() {
        return this.a;
    }

    public void setEventoTOList(List<EventoTO> eventoTOList) {
        this.a = eventoTOList;
    }

    public String getModelo() {
        return this.o;
    }

    public void setModelo(String modelo) {
        this.o = modelo;
    }

    public String getNumeroProtocolo() {
        return this.p;
    }

    public void setNumeroProtocolo(String numeroProtocolo) {
        this.p = numeroProtocolo;
    }

    public String getProtocoloString() {
        return this.k;
    }

    public void setProtocoloString(String protocoloString) {
        this.k = protocoloString;
    }

    public String getSerie() {
        return this.n;
    }

    public void setSerie(String serie) {
        this.n = serie;
    }

    public String getVersao() {
        return this.l;
    }

    public void setVersao(String versao) {
        this.l = versao;
    }

    public String getChaveAcessoFormatada() {
        if (!SituacaoNFeEnum.EM_DIGITACAO.equals((Object)this.getSituacao())) {
            return ChaveAcessoUtil.formatarChaveAcesso4x4((String)ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)this));
        }
        return "";
    }

    public String getChaveAcesso() {
        if (!SituacaoNFeEnum.EM_DIGITACAO.equals((Object)this.getSituacao())) {
            return ChaveAcessoUtil.gerarChaveAcesso((NotaFiscalTO)this);
        }
        return "";
    }

    public void setException(DSGEBaseException exceptionBuscaRetorno) {
        this.a = exceptionBuscaRetorno;
    }

    public DSGEBaseException getException() {
        return this.a;
    }

    public void setErroXmlResposta(ErroXmlResposta erroRespostaBuscaRetorno) {
        this.a = erroRespostaBuscaRetorno;
    }

    public ErroXmlResposta getErroXmlResposta() {
        return this.a;
    }

    public void setQuestionTotais(String question) {
        this.s = question;
    }

    public String getQuestionTotais() {
        return this.s;
    }
}

