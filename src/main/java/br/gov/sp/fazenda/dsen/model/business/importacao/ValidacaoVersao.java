/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.model.business.importacao.Registro
 *  br.gov.sp.fazenda.dsen.model.business.importacao.ValidacaoVersao
 */
package br.gov.sp.fazenda.dsen.model.business.importacao;

import br.gov.sp.fazenda.dsen.model.business.importacao.Registro;
import java.util.HashMap;

public class ValidacaoVersao {
    private HashMap<String, Registro> a;
    private String a = new HashMap();

    public void setVersao(String versao) {
        this.a = versao;
    }

    public void addRegistro(Registro reg) {
        this.a.put(reg.getTipo(), reg);
    }

    public HashMap<String, Registro> getRegistrosMap() {
        return this.a;
    }

    public void setRegistrosMap(HashMap<String, Registro> registrosMap) {
        this.a = registrosMap;
    }

    public Registro getRegistroByTipo(String tipo) {
        return (Registro)this.a.get(tipo);
    }

    public String getVersao() {
        return this.a;
    }
}

