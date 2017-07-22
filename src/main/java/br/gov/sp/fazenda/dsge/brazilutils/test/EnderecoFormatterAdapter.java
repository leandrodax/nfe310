/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoFormatter
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.test.EnderecoFormatterAdapter
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.UF
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoFormatter;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;
import br.gov.sp.fazenda.dsge.brazilutils.uf.UF;

class EnderecoFormatterAdapter
implements EnderecoFormatter {
    private String a;
    private Cep a;
    private String b;
    private String c;
    private Logradouro a;
    private String d;
    private UF a;

    EnderecoFormatterAdapter() {
    }

    public void setEndereco(Logradouro logradouro, String numero, String complemento, String bairro, Cep cep, UF uf, String cidade) {
        this.a = bairro;
        this.a = cep;
        this.b = cidade;
        this.c = complemento;
        this.a = logradouro;
        this.d = numero;
        this.a = uf;
    }

    public /* varargs */ String a(String ... addresseeName) {
        String result = this.a.toString() + "\n" + this.d + "  " + this.c + "  " + this.a + "\n" + this.a.toString() + "  " + this.a.toString() + "  " + this.b;
        for (int i = addresseeName.length - 1; i >= 0; --i) {
            result = addresseeName[i] + "\n" + result;
        }
        return result;
    }

    public String getEndereco(String addresseeName) {
        return null;
    }
}

