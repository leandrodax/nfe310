/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.common.util.DSENProperties
 *  br.gov.sp.fazenda.dsen.ws.ssl.DSENProtocolSocketFactory
 *  br.gov.sp.fazenda.dsge.ws.ssl.DSGEKeyManager
 *  br.gov.sp.fazenda.dsge.ws.ssl.DSGEProtocolSocketFactory
 */
package br.gov.sp.fazenda.dsen.ws.ssl;

import br.gov.sp.fazenda.dsen.common.util.DSENProperties;
import br.gov.sp.fazenda.dsge.ws.ssl.DSGEKeyManager;
import br.gov.sp.fazenda.dsge.ws.ssl.DSGEProtocolSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public class DSENProtocolSocketFactory
extends DSGEProtocolSocketFactory {
    private X509Certificate a;
    private PrivateKey a;

    public DSENProtocolSocketFactory(X509Certificate certificate, PrivateKey privateKey) {
        this.a = certificate;
        this.a = privateKey;
    }

    public KeyManager[] createKeyManagers() {
        DSGEKeyManager keyManager = new DSGEKeyManager(this.a, this.a);
        return new KeyManager[]{keyManager};
    }

    public TrustManager[] createTrustManagers() throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
        KeyStore trustStore = KeyStore.getInstance("JKS");
        trustStore.load(DSENProtocolSocketFactory.class.getResourceAsStream(DSENProperties.getInstance().getArquivoTrustStore()), "emissorNfe".toCharArray());
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(trustStore);
        return trustManagerFactory.getTrustManagers();
    }
}

