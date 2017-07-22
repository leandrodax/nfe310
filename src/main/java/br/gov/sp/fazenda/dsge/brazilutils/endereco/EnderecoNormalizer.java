/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 */
package br.gov.sp.fazenda.dsge.brazilutils.endereco;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;

public interface EnderecoNormalizer {
    public String normalizeBairro(String var1);

    public String normalizeCidade(String var1);

    public String normalizeComplemento(String var1);

    public Logradouro normalizeLogradouro(Logradouro var1);

    public String normalizeNumero(String var1);

    public String normalizePais(String var1);
}

