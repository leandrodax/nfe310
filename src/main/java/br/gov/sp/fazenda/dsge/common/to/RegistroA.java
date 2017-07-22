/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.to.RegistroA
 *  br.gov.sp.fazenda.dsge.common.to.RegistroNfe
 */
package br.gov.sp.fazenda.dsge.common.to;

import br.gov.sp.fazenda.dsge.common.to.RegistroNfe;
import java.util.List;

public class RegistroA
implements RegistroNfe {
    private String a;
    private String b;
    private String c;
    private String d;
    private List a;

    public void setNome(String pNome) {
        this.a = pNome;
    }

    public String getNome() {
        return this.a;
    }

    public String getEnder() {
        return this.b;
    }

    public void setEnder(String ender) {
        this.b = ender;
    }

    public String getTipo() {
        return "A";
    }

    public String getNumero() {
        return this.c;
    }

    public void setNumero(String numero) {
        this.c = numero;
    }

    public String getCPF() {
        return this.d;
    }

    public void setCPF(String cpf) {
        this.d = cpf;
    }

    public List getListaProduto() {
        return this.a;
    }

    public void setListaProduto(List listaProduto) {
        this.a = listaProduto;
    }
}

