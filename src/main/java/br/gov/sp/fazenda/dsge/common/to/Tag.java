/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.Tag
 */
package br.gov.sp.fazenda.dsge.common.to;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private String a;
    private List<String> a;
    private List<String> b = new ArrayList();
    private List<String> c = new ArrayList();
    private int a;
    private boolean a = new ArrayList();

    public String getNome() {
        return this.a;
    }

    public void setNome(String nome) {
        this.a = nome;
    }

    public List<String> getCampos() {
        return this.a;
    }

    public void setCampos(List<String> campos) {
        this.a = campos;
    }

    public int getXmlPos() {
        return this.a;
    }

    public void setXmlPos(int xmlPos) {
        this.a = xmlPos;
    }

    public List<String> getRegistros() {
        return this.c;
    }

    public void setRegistros(List<String> registros) {
        this.c = registros;
    }

    public boolean isPrintIfEmpty() {
        return this.a;
    }

    public void setPrintIfEmpty(boolean printIfEmpty) {
        this.a = printIfEmpty;
    }

    public void setValidNames(List<String> validNames) {
        this.b = validNames;
    }

    public List<String> getValidNames() {
        return this.b;
    }
}

