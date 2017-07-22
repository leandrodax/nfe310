/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoGuiTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import javax.swing.Icon;

public class ImportacaoResultadoGuiTO
extends BaseTO {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private SituacaoRegistroEnum a;
    private String f;
    private Icon a;

    public String getCampo() {
        return this.c;
    }

    public void setCampo(String campo) {
        this.c = campo;
    }

    public String getIdArquivo() {
        return this.b;
    }

    public void setIdArquivo(String idArquivo) {
        this.b = idArquivo;
    }

    public String getMensagem() {
        return this.f;
    }

    public void setMensagem(String mensagem) {
        this.f = mensagem;
    }

    public String getNomeArquivo() {
        return this.a;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.a = nomeArquivo;
    }

    public SituacaoRegistroEnum getSituacaoRegistro() {
        return this.a;
    }

    public void setSituacaoRegistro(SituacaoRegistroEnum statusRegistro) {
        this.a = statusRegistro;
    }

    public Icon getIcon() {
        return this.a;
    }

    public void setIcon(Icon icon) {
        this.a = icon;
    }

    public String getIdRegistro() {
        return this.d;
    }

    public void setIdRegistro(String idRegistro) {
        this.d = idRegistro;
    }

    public String getQtdeRegistro() {
        return this.e;
    }

    public void setQtdeRegistro(String qtdeRegistros) {
        this.e = qtdeRegistros;
    }
}

