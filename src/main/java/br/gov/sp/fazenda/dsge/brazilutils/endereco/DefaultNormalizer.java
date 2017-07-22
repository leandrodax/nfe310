/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.DefaultNormalizer
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 */
package br.gov.sp.fazenda.dsge.brazilutils.endereco;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;

public class DefaultNormalizer
implements EnderecoNormalizer {
    private int a;
    private boolean a = false;
    private boolean b = true;

    public DefaultNormalizer() {
    }

    public DefaultNormalizer(int charCase, boolean shortFormat, boolean tipoNormalized) {
        this.a = charCase;
        this.a = shortFormat;
        this.b = tipoNormalized;
    }

    protected String applyCharCase(String field) {
        switch (this.a) {
            case 2: {
                return field.toLowerCase();
            }
            case 1: {
                return field.toUpperCase();
            }
        }
        return field;
    }

    public String normalizeBairro(String value) {
        return this.applyCharCase(value);
    }

    public String normalizeCidade(String value) {
        return this.applyCharCase(value);
    }

    public String normalizeComplemento(String value) {
        return this.applyCharCase(value);
    }

    public Logradouro normalizeLogradouro(Logradouro value) {
        value.setShortFormat(this.a);
        value.setTipoNormalized(this.b);
        value.setCharCase(this.a);
        return value;
    }

    public String normalizeNumero(String value) {
        return this.applyCharCase(value);
    }

    public String normalizePais(String value) {
        return this.applyCharCase(value);
    }
}

