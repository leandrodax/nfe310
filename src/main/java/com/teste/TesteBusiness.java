/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  com.teste.TesteBusiness
 */
package com.teste;

import java.io.PrintStream;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class TesteBusiness {
    public X509Certificate certificate = null;
    public PrivateKey privateKey = null;
    private String urlProxy = "proxy1.sede.fazenda.sp.gov.br";
    private String portaProxy = "8080";
    private String usuarioProxy = "";
    private String senhaProxy = "";

    public final void executarStatusServico(String uf) {
        System.out.println("retorno");
    }

    public final String getPortaProxy() {
        return this.portaProxy;
    }

    public final String getProxyServidor() {
        return this.urlProxy;
    }

    public final String getSenhaProxy() {
        return this.senhaProxy;
    }

    public final String getUsuarioProxy() {
        return this.usuarioProxy;
    }
}

