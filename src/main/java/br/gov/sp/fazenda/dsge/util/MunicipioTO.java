/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.util.MunicipioTO
 */
package br.gov.sp.fazenda.dsge.util;

import java.text.Collator;
import java.util.Locale;

public class MunicipioTO
implements Comparable {
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

    public void setNome(String descricao) {
        this.b = descricao;
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
        MunicipioTO other = (MunicipioTO)obj;
        if (this.a == null ? other.a != null : !this.a.equals(other.a)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.getNome();
    }

    public int compareTo(Object o) {
        int compare = -1;
        if (o != null && o instanceof MunicipioTO) {
            Collator collator = Collator.getInstance(new Locale("pt", "BR"));
            compare = collator.compare(this.getNome(), ((MunicipioTO)o).getNome());
        }
        return compare;
    }
}

