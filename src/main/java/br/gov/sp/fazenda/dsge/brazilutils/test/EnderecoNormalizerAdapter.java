/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.test.EnderecoNormalizerAdapter
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.UF
 */
package br.gov.sp.fazenda.dsge.brazilutils.test;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;
import br.gov.sp.fazenda.dsge.brazilutils.uf.UF;

class EnderecoNormalizerAdapter
implements EnderecoNormalizer {
    EnderecoNormalizerAdapter() {
    }

    public String normalizeBairro(String value) {
        return value;
    }

    public Cep a(Cep value) {
        return value;
    }

    public String normalizeCidade(String value) {
        return value;
    }

    public String normalizeComplemento(String value) {
        return value;
    }

    public String a(Logradouro logradouro, String numero, String complemento, String bairro, Cep cep, UF uf, String cidade) {
        String result = this.normalizeLogradouro(logradouro).toString();
        try {
            Integer.parseInt(this.normalizeNumero(numero));
            result = result + ", " + this.normalizeNumero(numero);
        }
        catch (Exception e) {
            result = result + " " + this.normalizeNumero(numero);
        }
        if (this.normalizeComplemento(complemento).length() > 0) {
            result = result + ", " + this.normalizeComplemento(complemento);
        }
        result = result + ", " + this.normalizeBairro(bairro) + ", " + this.a(cep).toString() + ", " + this.a(uf).toString() + ", " + this.normalizeCidade(cidade);
        return result;
    }

    public Logradouro normalizeLogradouro(Logradouro value) {
        return value;
    }

    public String normalizeNumero(String value) {
        return "N\u00famero: " + value;
    }

    public UF a(UF value) {
        return value;
    }

    public String normalizePais(String value) {
        return value;
    }
}

