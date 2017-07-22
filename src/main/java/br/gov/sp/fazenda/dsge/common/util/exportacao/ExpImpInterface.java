/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.exportacao.ExpImpInterface
 */
package br.gov.sp.fazenda.dsge.common.util.exportacao;

import java.util.List;

public interface ExpImpInterface {
    public String getNomeRegistro();

    public String getVersao();

    public void setVersao(String var1);

    public List<String> getErrors();

    public List<String> getMessages();

    public boolean hasErrors();

    public boolean hasMessages();

    public String getMessagesString();

    public String getErrorsString();
}

