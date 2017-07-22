/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum
 *  br.gov.sp.fazenda.dsen.common.to.EventoTO
 *  br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.TipoEventoEnum;
import br.gov.sp.fazenda.dsen.common.to.NotaFiscalTO;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JLabel;

public class EventoTO
extends BaseTO
implements Comparable<EventoTO> {
    private static final long a = -9155208185740595185L;
    private Long a;
    private TipoEventoEnum a;
    private Date a;
    private Integer a;
    private String a;
    private String b;
    private Date b;
    private NotaFiscalTO a;
    private String c;
    private String d;
    private String e;
    private Icon a;
    private JLabel a;
    private String f;

    public Long getIdEvento() {
        return this.a;
    }

    public void setIdEvento(Long idEvento) {
        this.a = idEvento;
    }

    public TipoEventoEnum getTpEvento() {
        return this.a;
    }

    public void setTpEvento(TipoEventoEnum tpEvento) {
        this.a = tpEvento;
    }

    public Date getDataEvento() {
        return this.a;
    }

    public void setDataEvento(Date dataEvento) {
        this.a = dataEvento;
    }

    public void setnSeqEvento(Integer nSeqEvento) {
        this.a = nSeqEvento;
    }

    public Integer getnSeqEvento() {
        return this.a;
    }

    public String getNumSeqEventoStr() {
        if (this.a == null) {
            return "1";
        }
        return this.a.toString();
    }

    public String getNumProtocolo() {
        return this.a;
    }

    public void setNumProtocolo(String numProtocolo) {
        this.a = numProtocolo;
    }

    public String getXmlProcString() {
        return this.b;
    }

    public void setXmlProcString(String xmlProcString) {
        this.b = xmlProcString;
    }

    public Date getDataRegEvento() {
        return this.b;
    }

    public void setDataRegEvento(Date dataRegEvento) {
        this.b = dataRegEvento;
    }

    public NotaFiscalTO getNotaFiscalTO() {
        return this.a;
    }

    public void setNotaFiscalTO(NotaFiscalTO notaFiscalTO) {
        this.a = notaFiscalTO;
    }

    public int hashCode() {
        int hash = 3;
        int primeMultiplier = 11;
        hash = primeMultiplier * hash + (this.getIdEvento() != null ? this.getIdEvento().hashCode() : 0);
        hash = primeMultiplier * hash + (this.getTpEvento() != null ? this.getTpEvento().hashCode() : 0);
        hash = primeMultiplier * hash + (this.getnSeqEvento() != null ? this.getnSeqEvento().hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!(object instanceof EventoTO)) {
            return false;
        }
        EventoTO other = (EventoTO)object;
        if (this.a == null && other.getIdEvento() == null) {
            return this.hashCode() == other.hashCode();
        }
        if (this.a == null || other.getIdEvento() == null) {
            return false;
        }
        return this.a.equals(other.a);
    }

    public void setMensagemErro(String mensagemErro) {
        this.d = mensagemErro;
    }

    public String getMensagemErro() {
        return this.d;
    }

    public void setCErro(String cErro) {
        this.c = cErro;
    }

    public String getCErro() {
        return this.c;
    }

    public void setDocXmlString(String docXmlString) {
        this.e = docXmlString;
    }

    public String getDocXmlString() {
        return this.e;
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

    public String getAnoNfe() {
        if (this.a != null) {
            return this.a.getAno();
        }
        return "";
    }

    public String getSerieNfe() {
        if (this.a != null) {
            return this.a.getSerie();
        }
        return "";
    }

    public String getNumeroNfe() {
        if (this.a != null) {
            return this.a.getNumero();
        }
        return "";
    }

    public String getResultadoEnvio() {
        Boolean sucesso = this.sucessoOperacao();
        if (sucesso == null) {
            return DSENMessageConstants.EVENTO_NAO_FOI_ENVIADO;
        }
        if (!sucesso.booleanValue()) {
            return this.getErrorsString();
        }
        return this.getMessagesString();
    }

    public JLabel getBotaoDetalhe() {
        return this.a;
    }

    public void setBotaoDetalhe(JLabel botaoDetalhe) {
        this.a = botaoDetalhe;
    }

    public String getNomeArquivoXml() {
        return this.f;
    }

    public void setNomeArquivoXml(String nomeArquivoXml) {
        this.f = nomeArquivoXml;
    }

    @Override
    public int compareTo(EventoTO o2) {
        EventoTO o1 = this;
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        if (o1.getDataEvento() != null) {
            return 1;
        }
        if (o2.getDataEvento() != null) {
            return -1;
        }
        return o1.getDataEvento().compareTo(o2.getDataEvento());
    }
}

