/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoFields
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.UF
 */
package br.gov.sp.fazenda.dsge.brazilutils.endereco;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;
import br.gov.sp.fazenda.dsge.brazilutils.uf.UF;

class EnderecoFields {
    private String a;
    private Cep a;
    private String b = null;
    private String c = null;
    private Logradouro a;
    private String d = null;
    private String e = null;
    private UF a = null;

    EnderecoFields() {
    }

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public String getBairro() {
        return this.a;
    }

    public Cep getCep() {
        return this.a;
    }

    public String getCidade() {
        return this.b;
    }

    public String getComplemento() {
        return this.c;
    }

    public Logradouro getLogradouro() {
        return this.a;
    }

    public String getNumero() {
        return this.d;
    }

    public String getPais() {
        return this.e;
    }

    public UF getUf() {
        return this.a;
    }

    public void setBairro(String bairro) {
        this.a = bairro;
    }

    public void setCep(Cep cep) {
        this.a = cep;
    }

    public void setCep(String cep) {
        this.a = new Cep(cep);
    }

    public void setCidade(String cidade) {
        this.b = cidade;
    }

    public void setComplemento(String complemento) {
        this.c = complemento;
    }

    public void setFields(EnderecoFields fields) {
        this.a = fields.getLogradouro();
        this.d = fields.getNumero();
        this.c = fields.getComplemento();
        this.a = fields.getBairro();
        this.b = fields.getCidade();
        this.a = fields.getUf();
        this.a = fields.getCep();
    }

    public void setLogradouro(Logradouro logradouro) {
        this.a = logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.a = new Logradouro(logradouro);
    }

    public void setNumero(String numero) {
        this.d = numero;
    }

    public void setPais(String pais) {
        this.e = pais;
    }

    public void setUf(String uf) {
        this.a = UF.valueOf((String)uf);
    }

    public void setUf(UF uf) {
        this.a = uf;
    }

    public String toString() {
        return this.a.toString() + " " + this.d + " " + this.c + " " + this.a + " " + this.b + " " + this.a.toString() + " " + this.a.toString();
    }
}

