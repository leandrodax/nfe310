/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaTransportadoraEnum
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaTransportadoraTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaTransportadoraEnum;
import br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO;
import java.util.Map;
import java.util.TreeMap;

public class PesquisaTransportadoraTO
extends PesquisaBaseTO {
    private static final long a = -7389030173385093887L;
    private String a;
    private String b;
    private String c;

    public Map getPesquisaEnumerationMap() {
        TreeMap<FiltroPesquisaTransportadoraEnum, String> map = new TreeMap<FiltroPesquisaTransportadoraEnum, String>();
        map.put(FiltroPesquisaTransportadoraEnum.RAZAO_SOCIAL, this.getRazaoSocial() == null ? null : this.getRazaoSocial());
        map.put(FiltroPesquisaTransportadoraEnum.CNPJ_CPF, this.getCnpjCpf() == null ? null : this.getCnpjCpf());
        map.put(FiltroPesquisaTransportadoraEnum.IE, this.getIe() == null ? null : this.getIe());
        return map;
    }

    public String getCnpjCpf() {
        return this.b;
    }

    public void setCnpjCpf(String cnpjCpf) {
        this.b = cnpjCpf;
    }

    public String getIe() {
        return this.c;
    }

    public void setIe(String ie) {
        this.c = ie;
    }

    public String getRazaoSocial() {
        return this.a;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.a = razaoSocial;
    }
}

