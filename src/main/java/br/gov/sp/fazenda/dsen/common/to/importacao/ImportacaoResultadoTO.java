/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO
 *  br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoResultadoTO
 */
package br.gov.sp.fazenda.dsen.common.to.importacao;

import br.gov.sp.fazenda.dsen.common.to.importacao.ImportacaoRegistroTO;
import java.util.ArrayList;
import java.util.List;

public class ImportacaoResultadoTO {
    private int a;
    private int b;
    private List<ImportacaoRegistroTO> a = new ArrayList();

    public List<ImportacaoRegistroTO> getImportacaoRegistros() {
        return this.a;
    }

    public void setImportacaoRegistros(List<ImportacaoRegistroTO> importacaoRegistros) {
        this.a = importacaoRegistros;
    }

    public int getInsucesso() {
        return this.b;
    }

    public void setInsucesso(int insucesso) {
        this.b = insucesso;
    }

    public int getSucesso() {
        return this.a;
    }

    public void setSucesso(int sucesso) {
        this.a = sucesso;
    }

    public void incrementaSucesso() {
        ++this.a;
    }

    public void incrementaInsucesso() {
        ++this.b;
    }
}

