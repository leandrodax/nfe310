/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.brazilutils.endereco.Logradouro
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.Validable
 *  br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException
 */
package br.gov.sp.fazenda.dsge.brazilutils.endereco;

import br.gov.sp.fazenda.dsge.brazilutils.validation.Validable;
import br.gov.sp.fazenda.dsge.brazilutils.validation.ValidationException;

public class Logradouro
implements Validable {
    private int a;
    private String a;
    private boolean a = false;
    private String b;
    private boolean b = false;

    public Logradouro() {
    }

    public Logradouro(String logradouro) {
        this.setLogradouro(logradouro);
    }

    public String applyCharCase(String field) {
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

    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    public int getCharCase() {
        return this.a;
    }

    public String getNome() {
        if (this.a != null) {
            return this.applyCharCase(this.a);
        }
        return "";
    }

    public boolean isShortFormat() {
        return this.a;
    }

    public boolean isTipoNormalized() {
        return this.b;
    }

    public boolean isTipoValid() {
        return false;
    }

    public boolean isValid() {
        return false;
    }

    public void setCharCase(int charCase) {
        this.a = charCase;
        this.b = this.applyCharCase(this.b);
        this.a = this.applyCharCase(this.a);
    }

    public void setLogradouro(String logradouro) {
        String tipoTmp = "";
        for (int i = 0; i < logradouro.length() && !Character.isSpaceChar(logradouro.charAt(i)); ++i) {
            tipoTmp = tipoTmp + logradouro.charAt(i);
        }
        String nomeTmp = "";
        boolean afterSpace = false;
        for (int i = 0; i < logradouro.length(); ++i) {
            if (Character.isSpaceChar(logradouro.charAt(i)) && !afterSpace) {
                afterSpace = true;
                continue;
            }
            if (!afterSpace) continue;
            nomeTmp = nomeTmp + logradouro.charAt(i);
        }
        this.setNome(nomeTmp);
    }

    public void setNome(String nome) {
        this.a = this.applyCharCase(nome);
    }

    public void setShortFormat(boolean useShortFormat) {
        this.a = useShortFormat;
    }

    public void setTipoNormalized(boolean useTipoNormalized) {
        this.b = useTipoNormalized;
    }

    public void validate() throws ValidationException {
        if (!this.isValid()) {
            throw new ValidationException();
        }
    }
}

