/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaClienteEnum
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaClienteTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaClienteEnum;
import br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO;
import java.util.Map;
import java.util.TreeMap;

public class PesquisaClienteTO
extends PesquisaBaseTO {
    private static final long a = 5627756017986152876L;
    private String a;
    private String b;
    private String c;

    public Map getPesquisaEnumerationMap() {
        TreeMap<FiltroPesquisaClienteEnum, String> map = new TreeMap<FiltroPesquisaClienteEnum, String>();
        map.put(FiltroPesquisaClienteEnum.RAZAO_SOCIAL, this.getRazaoSocial() == null ? null : this.getRazaoSocial());
        map.put(FiltroPesquisaClienteEnum.CNPJ_CPF, this.getCnpjCpf() == null ? null : this.getCnpjCpf());
        map.put(FiltroPesquisaClienteEnum.IE, this.getIe() == null ? null : this.getIe());
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

