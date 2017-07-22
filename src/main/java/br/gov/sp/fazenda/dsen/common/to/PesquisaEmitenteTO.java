/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaEmitenteEnum
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO
 *  br.gov.sp.fazenda.dsen.common.to.PesquisaEmitenteTO
 */
package br.gov.sp.fazenda.dsen.common.to;

import br.gov.sp.fazenda.dsen.common.enumeration.FiltroPesquisaEmitenteEnum;
import br.gov.sp.fazenda.dsen.common.to.PesquisaBaseTO;
import java.util.Map;
import java.util.TreeMap;

public class PesquisaEmitenteTO
extends PesquisaBaseTO {
    private static final long a = -4430375667819375539L;
    private String a;
    private String b;

    public Map<FiltroPesquisaEmitenteEnum, String> getPesquisaEnumerationMap() {
        TreeMap<FiltroPesquisaEmitenteEnum, String> map = new TreeMap<FiltroPesquisaEmitenteEnum, String>();
        map.put(FiltroPesquisaEmitenteEnum.CNPJ, this.getCnpj() == null ? null : this.getCnpj());
        map.put(FiltroPesquisaEmitenteEnum.RAZAO_SOCIAL, this.getRazaoSocial() == null ? null : this.getRazaoSocial());
        return map;
    }

    public String getCnpj() {
        return this.a;
    }

    public void setCnpj(String cnpj) {
        this.a = cnpj;
    }

    public String getRazaoSocial() {
        return this.b;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.b = razaoSocial;
    }
}

