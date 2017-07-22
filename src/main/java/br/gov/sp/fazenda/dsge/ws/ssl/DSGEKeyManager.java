/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.ws.ssl.DSGEKeyManager
 */
package br.gov.sp.fazenda.dsge.ws.ssl;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509KeyManager;

public class DSGEKeyManager
implements X509KeyManager {
    private X509Certificate a;
    private PrivateKey a;

    public DSGEKeyManager(X509Certificate certificate, PrivateKey privateKey) {
        this.a = certificate;
        this.a = privateKey;
    }

    @Override
    public String chooseClientAlias(String[] arg0, Principal[] arg1, Socket arg2) {
        return this.a.getIssuerDN().getName();
    }

    @Override
    public String chooseServerAlias(String arg0, Principal[] arg1, Socket arg2) {
        return null;
    }

    @Override
    public X509Certificate[] getCertificateChain(String arg0) {
        return new X509Certificate[]{this.a};
    }

    @Override
    public String[] getClientAliases(String arg0, Principal[] arg1) {
        return new String[]{this.a.getIssuerDN().getName()};
    }

    @Override
    public PrivateKey getPrivateKey(String arg0) {
        return this.a;
    }

    @Override
    public String[] getServerAliases(String arg0, Principal[] arg1) {
        return null;
    }
}

