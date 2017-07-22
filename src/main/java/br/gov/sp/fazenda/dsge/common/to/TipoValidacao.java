/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.TipoValidacao
 */
package br.gov.sp.fazenda.dsge.common.to;

import java.util.HashMap;
import java.util.Map;

public class TipoValidacao {
    private Class a;
    private Map<String, String> a = new HashMap();

    public Class getTipoValidacao() {
        return this.a;
    }

    public void setTipoValidacao(Class tipoValidacao) {
        this.a = tipoValidacao;
    }

    public Map<String, String> getParameterMap() {
        return this.a;
    }

    public void setParameterMap(Map<String, String> parametrosMap) {
        this.a = parametrosMap;
    }

    public String getParameterValue(String param) {
        return (String)this.a.get(param);
    }

    public void addParameter(String param, String value) {
        this.a.put(param, value);
    }
}

