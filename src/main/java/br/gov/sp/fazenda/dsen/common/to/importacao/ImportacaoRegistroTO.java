/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 */
package br.gov.sp.fazenda.dsen.common.to.importacao;

import br.gov.sp.fazenda.dsen.common.enumeration.importacao.SituacaoRegistroEnum;
import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoErroTO;
import java.util.ArrayList;
import java.util.List;

public class ImportacaoRegistroTO {
    private String a;
    private String b;
    private SituacaoRegistroEnum a;
    private List<ImportacaoErroTO> a;

    public ImportacaoRegistroTO() {
    }

    public ImportacaoRegistroTO(String nomeArquivo, String idRegistro, SituacaoRegistroEnum situacaoRegistroEnum) {
        this.a = nomeArquivo;
        this.b = idRegistro;
        this.a = situacaoRegistroEnum;
        this.a = new ArrayList();
    }

    public String getIdRegistro() {
        return this.b;
    }

    public void setIdRegistro(String idArquivo) {
        this.b = idArquivo;
    }

    public List<ImportacaoErroTO> getImportacaoErros() {
        return this.a;
    }

    public void setImportacaoErros(List<ImportacaoErroTO> importacaoErros) {
        this.a = importacaoErros;
    }

    public void addImportacaoErro(ImportacaoErroTO importacaoErro) {
        this.a.add(importacaoErro);
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

    public void setSituacaoRegistro(SituacaoRegistroEnum situacaoRegistro) {
        this.a = situacaoRegistro;
    }
}

