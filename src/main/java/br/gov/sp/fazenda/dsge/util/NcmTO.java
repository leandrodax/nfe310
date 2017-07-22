/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.util.NcmTO
 */
package br.gov.sp.fazenda.dsge.util;

public class NcmTO {
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
        NcmTO other = (NcmTO)obj;
        if (this.a == null ? other.a != null : !this.a.equals(other.a)) {
            return false;
        }
        return true;
    }
}

