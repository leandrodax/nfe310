/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum
 *  br.gov.sp.fazenda.dsen.common.to.CancelamentoTO
 *  br.gov.sp.fazenda.dsen.common.to.CertificadoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsen.model.queue.BuscaRetornoQueueItem
 *  br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException
 *  br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem
 */
package br.gov.sp.fazenda.dsen.model.queue;

import br.gov.sp.fazenda.dsen.common.enumeration.SituacaoNFeEnum;
import br.gov.sp.fazenda.dsen.common.to.CancelamentoTO;
import br.gov.sp.fazenda.dsen.common.to.CertificadoTO;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DSENLabelConstants;
import br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta;
import br.gov.sp.fazenda.dsge.common.exception.DSGEBaseException;
import br.gov.sp.fazenda.dsge.model.queue.QueueRetornoItem;
import java.text.MessageFormat;
import javax.swing.JLabel;

public class BuscaRetornoQueueItem
extends QueueRetornoItem {
    private static final long a = 8321171095211491177L;
    private NotaFiscalTO a;
    private CertificadoTO a;
    private JLabel a;
    private SituacaoNFeEnum a;
    private String a;
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private ErroXmlResposta a;
    private DSGEBaseException a = "";

    public ErroXmlResposta getErroXmlResposta() {
        return this.a;
    }

    public void setErroXmlResposta(ErroXmlResposta erroXmlResposta) {
        this.a = erroXmlResposta;
    }

    public DSGEBaseException getException() {
        return this.a;
    }

    public void setException(DSGEBaseException exception) {
        this.a = exception;
    }

    public BuscaRetornoQueueItem(int id, long timeToGo, NotaFiscalTO notaFiscalTO, CertificadoTO certificadoTO) {
        super(id, timeToGo);
        this.a = certificadoTO;
        this.setNotaFiscalTO(notaFiscalTO);
    }

    public BuscaRetornoQueueItem(int id, BuscaRetornoQueueItem item, long timeToGo) {
        super(id, (QueueRetornoItem)item, timeToGo);
        this.a = item.getCertificadoTO();
        this.setNotaFiscalTO(item.getNotaFiscalTO());
    }

    public NotaFiscalTO getNotaFiscalTO() {
        return this.a;
    }

    public void setNotaFiscalTO(NotaFiscalTO notaFiscalTO) {
        this.a = notaFiscalTO;
        if (notaFiscalTO != null) {
            this.c = notaFiscalTO.getSerie();
            this.d = notaFiscalTO.getNumero();
            this.e = notaFiscalTO.getChaveAcessoFormatada();
        } else {
            this.e = "";
            this.c = "";
            this.d = "";
        }
    }

    public CertificadoTO getCertificadoTO() {
        return this.a;
    }

    public void setCertificadoTO(CertificadoTO certificadoTO) {
        this.a = certificadoTO;
    }

    public boolean equals(Object o) {
        if (!(o instanceof BuscaRetornoQueueItem)) {
            return false;
        }
        if (this.getNotaFiscalTO() == null && ((BuscaRetornoQueueItem)o).getNotaFiscalTO() == null) {
            return true;
        }
        if (this.getNotaFiscalTO() == null) {
            return false;
        }
        if (((BuscaRetornoQueueItem)o).getNotaFiscalTO() == null) {
            return false;
        }
        return this.getNotaFiscalTO().getChaveAcessoFormatada().equals(((BuscaRetornoQueueItem)o).getNotaFiscalTO().getChaveAcessoFormatada());
    }

    public String getSerie() {
        return this.c;
    }

    public String getNumero() {
        return this.d;
    }

    public String getChaveAcessoFormatada() {
        return this.e;
    }

    public String getCodigoErro() {
        return this.b;
    }

    public String getMensagemErro() {
        return this.a;
    }

    public SituacaoNFeEnum getSituacaoNFe() {
        return this.a;
    }

    public String getProgresso() {
        if (this.isExecutado()) {
            return DSENLabelConstants.EXECUTADO;
        }
        long now = System.currentTimeMillis();
        if (now >= this.getTimeToGo()) {
            return DSENLabelConstants.EXECUTANDO;
        }
        return MessageFormat.format(DSENLabelConstants.AGENDADO_PARA_X_SEGUNDOS, (int)(this.getTimeToGo() - now) / 1000);
    }

    public JLabel getBotaoDetalhe() {
        return this.a;
    }

    public void setBotaoDetalhe(JLabel botaoDetalhe) {
        this.a = botaoDetalhe;
    }

    public void setSituacaoNFeToItem() {
        this.a = this.a.getSituacao();
        this.a = this.a.getCancelamentoTO() != null ? this.a.getCancelamentoTO().getMensagemErro() : this.a.getMensagemErro();
        this.b = this.a.getCancelamentoTO() != null ? this.a.getCancelamentoTO().getCodigoErro() : this.a.getCodigoErro();
        this.a = this.a.getErroXmlResposta();
        this.a = this.a.getException();
    }
}

