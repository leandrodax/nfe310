/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Endereco
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoFields
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoFormatter
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.uf.UF
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.endereco;

import br.gov.sp.fazenda.dsge.brazilutils.endereco.Cep;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoFields;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoFormatter;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.EnderecoNormalizer;
import br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro;
import br.gov.sp.fazenda.dsge.brazilutils.uf.UF;
import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

public class Endereco
extends EnderecoFields
implements EnderecoFormatter,
Validable {
    public static final int NORMALCASE = 0;
    public static final int UPPERCASE = 1;
    public static final int LOWERCASE = 2;
    private EnderecoFormatter a;
    private EnderecoNormalizer a;

    public Endereco() {
        this.a = this;
        this.a = null;
    }

    public Endereco(EnderecoFormatter formatter) {
        this.a = this;
        this.a = null;
        this.setFormatter(formatter);
    }

    public Endereco(EnderecoNormalizer normalizer) {
        this.a = this;
        this.a = null;
        this.setNormalizer(normalizer);
    }

    public Endereco(EnderecoNormalizer normalizer, EnderecoFormatter formatter) {
        this.a = this;
        this.a = null;
        this.setNormalizer(normalizer);
        this.setFormatter(formatter);
    }

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public String getEndereco(String addresseeName) {
        if (this.a == this) {
            String result = this.getLogradouro().toString() + "\n" + this.getNumero() + " " + this.getComplemento() + " " + this.getBairro() + "\n" + this.getCep().toString() + " " + this.getUf().toString() + " " + this.getCidade();
            result = addresseeName + "\n" + result;
            return result;
        }
        return this.a.getEndereco(addresseeName);
    }

    public EnderecoFormatter getFormatter() {
        return this.a;
    }

    public String getNomeLogradouro() {
        return this.getLogradouro().getNome();
    }

    public String getTipoLogradouro() {
        return null;
    }

    public boolean isComplete() {
        return this.getBairro().length() > 0 && this.getCep().getValue().length() > 0 && this.getCidade().length() > 0 && this.getLogradouro().getNome().length() > 0 && this.getNumero().length() > 0 && this.getUf() != null;
    }

    public boolean isNormalized() {
        return this.a != null;
    }

    public boolean isValid() {
        return this.isComplete() && this.getCep() != null && this.getLogradouro() != null && this.getUf() != null && this.getLogradouro().isValid();
    }

    public void setBairro(String bairro) {
        if (this.a != null) {
            super.setBairro(this.a.normalizeBairro(bairro));
        } else {
            super.setBairro(bairro);
        }
    }

    public void setCidade(String cidade) {
        if (this.a != null) {
            super.setCidade(this.a.normalizeCidade(cidade));
        } else {
            super.setCidade(cidade);
        }
    }

    public void setComplemento(String complemento) {
        if (this.a != null) {
            super.setComplemento(this.a.normalizeComplemento(complemento));
        } else {
            super.setComplemento(complemento);
        }
    }

    public void setEndereco(Logradouro logradouro, String numero, String complemento, String bairro, Cep cep, UF uf, String cidade) {
        this.setBairro(bairro);
        this.setCep(cep);
        this.setCidade(cidade);
        this.setComplemento(complemento);
        this.setLogradouro(logradouro);
        this.setNumero(numero);
        this.setUf(uf);
    }

    public void setFormatter(EnderecoFormatter formatter) {
        if (formatter != null) {
            this.a = formatter;
            this.a.setEndereco(this.getLogradouro(), this.getNumero(), this.getComplemento(), this.getBairro(), this.getCep(), this.getUf(), this.getCidade());
        }
    }

    public void setLogradouro(Logradouro logradouro) {
        if (this.a != null) {
            super.setLogradouro(this.a.normalizeLogradouro(logradouro));
        } else {
            super.setLogradouro(logradouro);
        }
    }

    public void setLogradouro(String logradouro) {
        this.setLogradouro(new Logradouro(logradouro));
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.getLogradouro().setNome(nomeLogradouro);
    }

    public void setNormalizer(EnderecoNormalizer normalizer) {
        if (normalizer != null) {
            this.a = normalizer;
            this.setBairro(this.getBairro());
            this.setCep(this.getCep());
            this.setCidade(this.getCidade());
            this.setComplemento(this.getComplemento());
            this.setLogradouro(this.getLogradouro());
            this.setNumero(this.getNumero());
        }
    }

    public void setNumero(String numero) {
        if (this.a != null) {
            super.setNumero(this.a.normalizeNumero(numero));
        } else {
            super.setNumero(numero);
        }
    }

    public void setPais(String pais) {
        if (this.a != null) {
            super.setPais(this.a.normalizePais(pais));
        } else {
            super.setNumero(pais);
        }
    }

    public void setTipoLogradouro(String tipoLogradouro) {
    }

    public String toString() {
        return this.getEndereco("").replaceAll("\\n", " ");
    }

    public void validate() throws ValidationException {
        if (!this.isValid()) {
            throw new ValidationException();
        }
    }
}

