/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoFormatter
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.UF
 */
package br.gov.sp.fazenda.dsge.brazilutils.endereco;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;
import br.gov.sp.fazenda.dsge.brazilutils.uf.UF;

public interface EnderecoFormatter {
    public void setEndereco(Logradouro var1, String var2, String var3, String var4, Cep var5, UF var6, String var7);

    public String getEndereco(String var1);
}

