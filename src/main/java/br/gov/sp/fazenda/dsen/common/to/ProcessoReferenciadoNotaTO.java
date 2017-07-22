/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.OrigemProcessoEnum
 *  br.gov.sp.fazenda.dsen.common.to.ProcessoReferenciadoNotaTO
 *  br.gov.sp.fazenda.dsge.common.to.BaseTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.OrigemProcessoEnum;
import br.gov.sp.fazenda.dsge.common.to.BaseTO;

public class ProcessoReferenciadoNotaTO
extends BaseTO {
    private static final long a = -7078365830171359734L;
    private String a;
    private String b;
    private String c;

    public String getIndProc() {
        return this.b;
    }

    public String getNProc() {
        return this.a;
    }

    public void setIndProc(String indProc) {
        this.b = indProc;
    }

    public void setNProc(String nProc) {
        this.a = nProc;
    }

    public String getNItem() {
        return this.c;
    }

    public void setNItem(String nItem) {
        this.c = nItem;
    }

    public String getDescricaoOrigem() {
        String descricao = null;
        if (this.b != null) {
            OrigemProcessoEnum[] values = OrigemProcessoEnum.values();
            for (int i = 0; i < values.length; ++i) {
                if (!values[i].getCodigo().equals(this.b)) continue;
                descricao = values[i].getDescricao();
                break;
            }
        }
        return descricao;
    }
}

