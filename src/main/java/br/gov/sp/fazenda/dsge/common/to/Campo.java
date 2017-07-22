/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.Campo
 *  br.gov.sp.fazenda.dsge.common.to.TipoValidacao
 */
package br.gov.sp.fazenda.dsge.common.to;

import br.gov.sp.fazenda.dsge.common.to.TipoValidacao;
import java.util.ArrayList;
import java.util.List;

public class Campo {
    public static final String TAG_XML = "tag";
    public static final String ATTRIB_XML = "attrib";
    public static final String TEXT_XML = "text";
    private String a;
    private String b;
    private String c;
    private String d;
    private boolean a;
    private List<TipoValidacao> a;
    private int a = new ArrayList();
    private boolean b;

    public void addTipoValidacao(TipoValidacao t) {
        this.a.add(t);
    }

    public String getNome() {
        return this.a;
    }

    public void setNome(String nome) {
        this.a = nome;
    }

    public List<TipoValidacao> getTipoValidacao() {
        return this.a;
    }

    public void setTipoValidacao(List<TipoValidacao> tipoValidacao) {
        this.a = tipoValidacao;
    }

    public String getValue() {
        return this.b;
    }

    public void setValue(String value) {
        this.b = value;
    }

    public String getXmlType() {
        return this.d;
    }

    public void setXmlType(String xmlType) {
        this.d = xmlType;
    }

    public boolean isXmlOnly() {
        return this.a;
    }

    public void setXmlOnly(boolean xmlOnly) {
        this.a = xmlOnly;
    }

    public int getXmlPos() {
        return this.a;
    }

    public void setXmlPos(int xmlPos) {
        this.a = xmlPos;
    }

    public String getValueExp() {
        return this.c;
    }

    public void setValueExp(String valueExp) {
        this.c = valueExp;
    }

    public boolean isPrintIfEmpty() {
        return this.b;
    }

    public void setPrintIfEmpty(boolean printIfEmpty) {
        this.b = printIfEmpty;
    }
}

