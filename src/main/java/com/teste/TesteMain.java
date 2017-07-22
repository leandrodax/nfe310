/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  com.teste.TesteBusiness
 *  com.teste.TesteMain
 *  sun.security.mscapi2.DSGEProvider
 */
package com.teste;

import com.teste.TesteBusiness;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import sun.security.mscapi2.DSGEProvider;

public class TesteMain {
    public static void main(String[] args) {
        try {
            if (Security.getProvider("DSGEProvider") == null) {
                Security.addProvider((Provider)new DSGEProvider());
            }
            KeyStore ks = KeyStore.getInstance("Windows-MY", "DSGEProvider");
            ks.load(null, null);
            String alias = "Equipe NF-e S\u00e3o Paulo:99171171171115";
            System.out.println("Alias: " + alias);
            PrivateKey privKey = (PrivateKey)ks.getKey(alias, null);
            X509Certificate cert = (X509Certificate)ks.getCertificate(alias);
            TesteBusiness tb = new TesteBusiness();
            tb.certificate = cert;
            tb.privateKey = privKey;
            tb.executarStatusServico("RS");
            alias = "Secretaria da Fazenda do Estado de Sao Paulo     Key Usage: Digital Signature, Nonrepudiation, Key Encipherment";
            System.out.println("Alias: " + alias);
            privKey = (PrivateKey)ks.getKey(alias, null);
            cert = (X509Certificate)ks.getCertificate(alias);
            tb = new TesteBusiness();
            tb.certificate = cert;
            tb.privateKey = privKey;
            tb.executarStatusServico("RS");
            alias = "Secretaria da Fazenda do Estado de Sao Paulo";
            System.out.println("Alias: " + alias);
            privKey = (PrivateKey)ks.getKey(alias, null);
            cert = (X509Certificate)ks.getCertificate(alias);
            tb = new TesteBusiness();
            tb.certificate = cert;
            tb.privateKey = privKey;
            tb.executarStatusServico("RS");
            alias = "SECRETARIA DOS NEGOCIOS DA FAZENDA DO ESTADO DE SAO PAULO's SERASA Certificadora Digital-Homologa2006 ID";
            System.out.println("Alias: " + alias);
            privKey = (PrivateKey)ks.getKey(alias, null);
            cert = (X509Certificate)ks.getCertificate(alias);
            tb = new TesteBusiness();
            tb.certificate = cert;
            tb.privateKey = privKey;
            tb.executarStatusServico("RS");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

