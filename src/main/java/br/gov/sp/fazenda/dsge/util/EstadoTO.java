/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.util.EstadoTO
 */
package br.gov.sp.fazenda.dsge.util;

public class EstadoTO
implements Comparable {
    private String a;
    private String b;
    private String c;

    public EstadoTO() {
    }

    public EstadoTO(String codigo, String sigla, String nome) {
        this.a = codigo;
        this.c = sigla;
        this.b = nome;
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

    public void setNome(String descricao) {
        this.b = descricao;
    }

    public String getSigla() {
        return this.c;
    }

    public void setSigla(String sigla) {
        this.c = sigla;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        result = 31 * result + (this.a == null ? 0 : this.a.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj != null && obj instanceof EstadoTO) {
            EstadoTO other = (EstadoTO)obj;
            if (other.getCodigo() != null && other.getCodigo().equals(this.getCodigo())) {
                equal = true;
            } else if (other.getSigla() != null && other.getSigla().equals(this.getSigla())) {
                equal = true;
            }
        }
        return equal;
    }

    public int compareTo(Object o) {
        return this.c.compareTo(((EstadoTO)o).getSigla());
    }

    public String toString() {
        return this.getSigla();
    }
}

