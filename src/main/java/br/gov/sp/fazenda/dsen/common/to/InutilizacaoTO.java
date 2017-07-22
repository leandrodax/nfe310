/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.EmitenteTO
 *  br.gov.sp.fazenda.dsen.common.to.InutilizacaoTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.EmitenteTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.Icon;

public class InutilizacaoTO
extends BaseTO
implements ExpImpInterface {
    private static final long a = 4024777607010991748L;
    private Long a;
    private String a;
    private String b;
    private EmitenteTO a;
    private String c;
    private String d;
    private String e;
    private String f;
    private Icon a;
    private String g;
    private String h;
    private Date a;
    private String i;
    private String j;

    public Icon getIcon() {
        return this.a;
    }

    public void setIcon(Icon icon) {
        this.a = icon;
    }

    public String getCErro() {
        return this.g;
    }

    public void setCErro(String cErro) {
        this.g = cErro;
    }

    public String getMensagemErro() {
        return this.h;
    }

    public void setMensagemErro(String mensagemErro) {
        this.h = mensagemErro;
    }

    public Date getDataInutilizacao() {
        return this.a;
    }

    public void setDataInutilizacao(Date dataInutilizacao) {
        this.a = dataInutilizacao;
    }

    public EmitenteTO getEmitenteTO() {
        return this.a;
    }

    public void setEmitenteTO(EmitenteTO emitenteTO) {
        this.a = emitenteTO;
    }

    public String getNumeroFinal() {
        return this.f;
    }

    public void setNumeroFinal(String numeroFinal) {
        this.f = numeroFinal;
    }

    public String getNumeroInicial() {
        return this.e;
    }

    public void setNumeroInicial(String numeroInicial) {
        this.e = numeroInicial;
    }

    public String getSerie() {
        return this.d;
    }

    public void setSerie(String serie) {
        this.d = serie;
    }

    public Long getIdInutilizacao() {
        return this.a;
    }

    public void setIdInutilizacao(Long idInutilizacao) {
        this.a = idInutilizacao;
    }

    public String getDocXmlString() {
        return this.i;
    }

    public void setDocXmlString(String docXml) {
        this.i = docXml;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String getResultado() {
        String resultado = "";
        if (this.getMessages() != null) {
            Iterator i$ = this.getMessages().iterator();
            while (i$.hasNext()) {
                String message;
                resultado = message = (String)i$.next();
            }
            return resultado;
        } else {
            if (this.getErrors() == null) return resultado;
            Iterator i$ = this.getErrors().iterator();
            while (i$.hasNext()) {
                String error;
                resultado = error = (String)i$.next();
            }
        }
        return resultado;
    }

    public Boolean isSucesso() {
        Boolean sucesso = null;
        if (this.getErrors() != null && this.getErrors().size() > 0) {
            sucesso = Boolean.FALSE;
        } else if (this.getMessages() != null && this.getMessages().size() > 0) {
            sucesso = Boolean.TRUE;
        }
        return sucesso;
    }

    public boolean equals(Object obj) {
        boolean equals = false;
        if (obj != null && obj instanceof InutilizacaoTO) {
            InutilizacaoTO other = (InutilizacaoTO)obj;
            if (other.getIdInutilizacao() != null && this.getIdInutilizacao() != null) {
                equals = this.getIdInutilizacao().equals(other.getIdInutilizacao());
            } else if (other.getSerie() != null && this.getSerie() != null && other.getNumeroFinal() != null && this.getNumeroFinal() != null && other.getNumeroInicial() != null && this.getNumeroInicial() != null) {
                equals = this.getSerie().equals(other.getSerie()) && this.getNumeroFinal().equals(other.getNumeroFinal()) && this.getNumeroInicial().equals(other.getNumeroInicial());
            }
        }
        return equals;
    }

    public void setProtocoloXmlString(String protocoloXmlString) {
        this.j = protocoloXmlString;
    }

    public String getProtocoloXmlString() {
        return this.j;
    }

    public void setAno(String ano) {
        this.b = ano;
    }

    public String getAno() {
        return this.b;
    }

    public String getCodigoUf() {
        return this.a;
    }

    public void setCodigoUf(String c) {
        this.a = c;
    }

    public String getVersao() {
        return this.c;
    }

    public void setVersao(String versao) {
        this.c = versao;
    }

    public String getNomeRegistro() {
        return "E";
    }
}

