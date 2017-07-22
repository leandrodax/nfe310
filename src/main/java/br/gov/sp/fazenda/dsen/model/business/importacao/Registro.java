/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.business.importacao.Registro
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsge.common.to.Campo;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Registro {
    private Map<String, Campo> a;
    private String a = new HashMap();

    public String getTipo() {
        return this.a;
    }

    public void setTipo(String tipo) {
        this.a = tipo;
    }

    public Collection<Campo> getCampos() {
        return this.a.values();
    }

    public void addCampo(Campo c) {
        this.a.put(c.getNome(), c);
    }

    public Campo getCampoByName(String name) {
        return (Campo)this.a.get(name);
    }

    public void setCampos(List<Campo> campoL) {
        this.a.clear();
        for (Campo c : campoL) {
            this.addCampo(c);
        }
    }
}

