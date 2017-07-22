/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.to.AvisoTO
 *  br.gov.sp.fazenda.dsen.common.to.PropriedadeTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.to.PropriedadeTO;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class AvisoTO
extends BaseTO {
    private static final long a = 4453784822872029322L;
    private PropriedadeTO a;
    private PropriedadeTO b;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    public int getFaixasInutilizar() {
        return this.a;
    }

    public void setFaixasInutilizar(int faixasInutilizar) {
        this.a = faixasInutilizar;
    }

    public int getNroNfeContNTransm() {
        return this.b;
    }

    public void setNroNfeContNTransm(int nroNfeContNTransm) {
        this.b = nroNfeContNTransm;
    }

    public int getNroNfeAutorNaoExport() {
        return this.d;
    }

    public void setNroNfeAutorNaoExport(int nroNfeAutorNaoExport) {
        this.d = nroNfeAutorNaoExport;
    }

    public int getNroNotasEmProc() {
        return this.c;
    }

    public void setNroNotasEmProc(int nroNotasEmProc) {
        this.c = nroNotasEmProc;
    }

    public PropriedadeTO getUltimaBuscaSefaz() {
        return this.a;
    }

    public void setUltimaBuscaSefaz(PropriedadeTO ultimaBuscaSefaz) {
        this.a = ultimaBuscaSefaz;
    }

    public PropriedadeTO getVisFaixaInutilMes() {
        return this.b;
    }

    public void setVisFaixaInutilMes(PropriedadeTO visFaixaInutilizacaoMes) {
        this.b = visFaixaInutilizacaoMes;
    }

    public int getNroNfeContDpecNTransm() {
        return this.e;
    }

    public void setNroNfeContDpecNTransm(int nroNfeContDpecNTransm) {
        this.e = nroNfeContDpecNTransm;
    }

    public int getNroNfeContFsdaNTransm() {
        return this.f;
    }

    public void setNroNfeContFsdaNTransm(int nroNfeContFsdaNTransm) {
        this.f = nroNfeContFsdaNTransm;
    }
}

