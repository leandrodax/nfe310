/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.certif.RepositorioInfo
 */
package br.gov.sp.fazenda.dsge.certif;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Date;

public class RepositorioInfo
implements Serializable {
    private static final long a = -261710756945875779L;
    private String a;
    private String b;
    private Long a;
    private Date a;
    private String c;

    public String getNome() {
        return this.a;
    }

    public void setNome(String nome) {
        this.a = nome;
    }

    public String getCaminho() {
        return this.b;
    }

    public void setCaminho(String caminho) {
        this.b = caminho;
    }

    public Long getSlot() {
        return this.a;
    }

    public void setSlot(Long slot) {
        this.a = slot;
    }

    public String getTpCertif() {
        return this.c;
    }

    public void setTpCertif(String tpCertif) {
        this.c = tpCertif;
    }

    public Date getDataUtilizacao() {
        return this.a;
    }

    public void setDataUtilizacao(Date dataUtilizacao) {
        this.a = dataUtilizacao;
    }

    public ByteArrayInputStream getFileConfiguration() {
        String pkcs11config = "name = PKCS11\n";
        pkcs11config = pkcs11config + "library = " + this.getCaminho() + '\n';
        pkcs11config = pkcs11config + "slot = " + this.getSlot() + '\n';
        return new ByteArrayInputStream(pkcs11config.getBytes());
    }

    public int hashCode() {
        int prime = 31;
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
        RepositorioInfo other = (RepositorioInfo)obj;
        if (this.a == null ? other.a != null : !this.a.equals(other.a)) {
            return false;
        }
        return true;
    }
}

