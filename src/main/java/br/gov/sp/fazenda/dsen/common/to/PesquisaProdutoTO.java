/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaProdutoEnum
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaProdutoTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaProdutoEnum;
import br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO;
import java.util.Map;
import java.util.TreeMap;

public class PesquisaProdutoTO
extends PesquisaBaseTO {
    private static final long a = -852252427190256441L;
    private String a;
    private String b;

    public Map getPesquisaEnumerationMap() {
        TreeMap<FiltroPesquisaProdutoEnum, String> map = new TreeMap<FiltroPesquisaProdutoEnum, String>();
        map.put(FiltroPesquisaProdutoEnum.CODIGO, this.getCodigo() == null ? null : this.getCodigo());
        map.put(FiltroPesquisaProdutoEnum.NOME, this.getNome() == null ? null : this.getNome());
        return map;
    }

    public String getCodigo() {
        return this.a;
    }

    public void setCodigo(String codigo) {
        this.a = codigo;
    }

    public String getNome() {
        return this.b;
    }

    public void setNome(String nome) {
        this.b = nome;
    }
}

