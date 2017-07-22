/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum
 *  br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ImportacaoTelaTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.ExtensaoArquivoEnum;
import br.gov.sp.fazenda.dsen.common.enumeration.TipoDocumentoArquivoEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;
import java.util.ArrayList;
import java.util.List;

public class ImportacaoTelaTO
extends BaseTO {
    private static final long a = -4697723846585378367L;
    private ExtensaoArquivoEnum a;
    private TipoDocumentoArquivoEnum a;
    private String a;
    private String b;
    private String c;
    private String d;
    private List<ImportacaoTelaTO> a;
    private Integer a = new ArrayList();
    private String e;

    public TipoDocumentoArquivoEnum getTipoArquivo() {
        return this.a;
    }

    public void setTipoArquivo(TipoDocumentoArquivoEnum tipoArquivo) {
        this.a = tipoArquivo;
    }

    public String getIdentificacao() {
        return this.c;
    }

    public void setIdentificacao(String identificacao) {
        this.c = identificacao;
    }

    public String getSituacao() {
        return this.d;
    }

    public void setSituacao(String situacao) {
        this.d = situacao;
    }

    public List<ImportacaoTelaTO> getArquivosVinculados() {
        return this.a;
    }

    public void setArquivosVinculados(List<ImportacaoTelaTO> arquivosVinculados) {
        this.a = arquivosVinculados;
    }

    public String getArquivosVinculadosStr() {
        if (this.a != null) {
            StringBuilder str = new StringBuilder("");
            for (ImportacaoTelaTO to : this.a) {
                if (str.length() == 0) {
                    str.append(to.getNomeArquivo());
                    continue;
                }
                str.append(", " + to.getNomeArquivo());
            }
            return str.toString();
        }
        return "";
    }

    public void addArquivoVinculado(ImportacaoTelaTO arquivoVinculado) {
        this.a.add(arquivoVinculado);
    }

    public ExtensaoArquivoEnum getExtensaoArquivo() {
        return this.a;
    }

    public void setExtensaoArquivo(ExtensaoArquivoEnum extensaoArquivo) {
        this.a = extensaoArquivo;
    }

    public String getCaminhoArquivo() {
        return this.a;
    }

    public void setCaminhoArquivo(String nomeArquivo) {
        this.a = nomeArquivo;
    }

    public Integer getQtdRegistro() {
        return this.a;
    }

    public void setQtdRegistro(Integer qtdRegistro) {
        this.a = qtdRegistro;
    }

    public String toString() {
        return "extensaoArquivo: " + (Object)this.a + "\n" + "tipoArquivo: " + (Object)this.a + "\n" + "nomeArquivo: " + this.b + "\n" + "caminhoArquivo: " + this.a + "\n" + "identificacao: " + this.c + "\n" + "situacao: " + this.d + "\n" + "qtdRegistro: " + this.a;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + (this.c == null ? 0 : this.c.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        ImportacaoTelaTO other = (ImportacaoTelaTO)obj;
        if (this.c == null ? other.c != null : !this.c.equals(other.c)) {
            return false;
        }
        return true;
    }

    public String getNomeArquivo() {
        return this.b;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.b = nomeArquivo;
    }

    public void setCharset(String charset) {
        this.e = charset;
    }

    public String getCharset() {
        return this.e;
    }
}

