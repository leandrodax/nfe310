/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.util.CorDenatranTO
 */
package br.gov.sp.fazenda.dsge.util;

public class CorDenatranTO {
    private String a;
    private String b;

    public String getCodigo() {
        return this.a;
    }

    public void setCodigo(String codigo) {
        this.a = codigo;
    }

    public String getNome() {
        return this.b;
    }

    public void setNome(String nome) {
        this.b = nome;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        result = 31 * result + (this.a == null ? 0 : this.a.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        CorDenatranTO other = (CorDenatranTO)obj;
        if (this.a == null ? other.a != null : !new Integer(this.a).equals(new Integer(other.a))) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.getCodigo();
    }
}

