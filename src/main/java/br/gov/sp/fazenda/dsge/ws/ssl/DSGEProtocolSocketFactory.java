/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.ws.ssl.DSGEProtocolSocketFactory
 *  org.apache.commons.httpclient.ConnectTimeoutException
 *  org.apache.commons.httpclient.params.HttpConnectionParams
 *  org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory
 */
package br.gov.sp.fazenda.dsge.ws.ssl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.commons.httpclient.ConnectTimeoutException;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory;

public abstract class DSGEProtocolSocketFactory
implements SecureProtocolSocketFactory {
    private SSLContext a = null;

    private SSLContext a() {
        try {
            KeyManager[] keyManagers = this.createKeyManagers();
            TrustManager[] trustManagers = this.createTrustManagers();
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(keyManagers, trustManagers, null);
            return sslContext;
        }
        catch (KeyManagementException e) {
            e.printStackTrace();
        }
        catch (KeyStoreException e) {
            e.printStackTrace();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        catch (CertificateException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private SSLContext b() {
        if (this.a == null) {
            this.a = this.a();
        }
        return this.a;
    }

    public Socket createSocket(String host, int port, InetAddress localAddress, int localPort, HttpConnectionParams params) throws IOException, UnknownHostException, ConnectTimeoutException {
        if (params == null) {
            throw new IllegalArgumentException("Parameters may not be null");
        }
        int timeout = params.getConnectionTimeout();
        SSLSocketFactory socketfactory = this.b().getSocketFactory();
        if (timeout == 0) {
            return socketfactory.createSocket(host, port, localAddress, localPort);
        }
        Socket socket = socketfactory.createSocket();
        InetSocketAddress localaddr = new InetSocketAddress(localAddress, localPort);
        InetSocketAddress remoteaddr = new InetSocketAddress(host, port);
        socket.bind(localaddr);
        try {
            socket.connect(remoteaddr, timeout);
        }
        catch (Throwable t) {
            t.printStackTrace();
            throw new ConnectTimeoutException("Erro na conexao", t);
        }
        return socket;
    }

    public Socket createSocket(String host, int port, InetAddress clientHost, int clientPort) throws IOException, UnknownHostException {
        return this.b().getSocketFactory().createSocket(host, port, clientHost, clientPort);
    }

    public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
        return this.b().getSocketFactory().createSocket(host, port);
    }

    public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException, UnknownHostException {
        return this.b().getSocketFactory().createSocket(socket, host, port, autoClose);
    }

    public abstract KeyManager[] createKeyManagers();

    public abstract TrustManager[] createTrustManagers() throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException;
}

