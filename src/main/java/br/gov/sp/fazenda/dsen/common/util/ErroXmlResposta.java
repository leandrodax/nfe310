/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum
 *  br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants
 *  br.gov.sp.fazenda.dsen.common.util.ErroXmlResposta
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 */
package br.gov.sp.fazenda.dsen.common.util;

import br.gov.sp.fazenda.dsen.common.enumeration.ServicoSefazEnum;
import br.gov.sp.fazenda.dsen.common.util.DSENMessageConstants;
import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.text.MessageFormat;

public class ErroXmlResposta {
    private String a;
    private String b;
    private String c;
    private ServicoSefazEnum a;
    private String d;

    public ErroXmlResposta(ServicoSefazEnum servicoPrincipal, String url, String xmlEnvio, String xmlRetorno, String localRecepcao) {
        this.a = url;
        this.b = xmlEnvio;
        this.c = xmlRetorno;
        this.a = servicoPrincipal;
        this.d = localRecepcao;
    }

    public ErroXmlResposta(ServicoSefazEnum servicoPrincipal, String urlSefaz, String xmlRetorno, String localRecepcao) {
        this.a = urlSefaz;
        this.c = xmlRetorno;
        this.a = servicoPrincipal;
        this.d = localRecepcao;
    }

    public String toHTML() {
        if (StringHelper.isBlankOrNull((Object)this.b)) {
            return MessageFormat.format(DSENMessageConstants.ERRO_XML_RESPOSTA_HTML_CONSULTA_STATUS, this.a.getDescricao(), this.a, this.a(this.c));
        }
        return MessageFormat.format(DSENMessageConstants.ERRO_XML_RESPOSTA_HTML, this.a.getDescricao(), this.a, this.a(this.b), this.a(this.c));
    }

    private String a(String xml) {
        return xml == null ? "" : xml.replaceAll("<", "&lt;").replace(">", "&gt;").replaceAll("&gt;&lt;", "&gt;<br/>&lt;");
    }

    public ServicoSefazEnum getServicoPrincipal() {
        return this.a;
    }

    public void setServicoPrincipal(ServicoSefazEnum servicoPrincipal) {
        this.a = servicoPrincipal;
    }

    public String getUrl() {
        return this.a;
    }

    public void setUrl(String url) {
        this.a = url;
    }

    public String getXmlEnvio() {
        return this.b;
    }

    public void setXmlEnvio(String xmlEnvio) {
        this.b = xmlEnvio;
    }

    public String getXmlRetorno() {
        return this.c;
    }

    public void setXmlRetorno(String xmlRetorno) {
        this.c = xmlRetorno;
    }

    public String getLocalRecepcao() {
        return this.d;
    }

    public void setLocalRecepcao(String localRecepcao) {
        this.d = localRecepcao;
    }
}

