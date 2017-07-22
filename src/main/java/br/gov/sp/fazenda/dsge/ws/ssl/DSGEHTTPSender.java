/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.ws.ssl.DSGEHTTPSender
 *  org.apache.axis.MessageContext
 *  org.apache.axis.transport.http.CommonsHTTPSender
 *  org.apache.commons.httpclient.Credentials
 *  org.apache.commons.httpclient.HostConfiguration
 *  org.apache.commons.httpclient.HttpClient
 *  org.apache.commons.httpclient.HttpState
 *  org.apache.commons.httpclient.ProxyHost
 *  org.apache.commons.httpclient.UsernamePasswordCredentials
 *  org.apache.commons.httpclient.auth.AuthScope
 */
package br.gov.sp.fazenda.dsge.ws.ssl;

import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import java.net.URL;
import org.apache.axis.MessageContext;
import org.apache.axis.transport.http.CommonsHTTPSender;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.ProxyHost;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;

public class DSGEHTTPSender
extends CommonsHTTPSender {
    private static final long a = -3322927550396757436L;

    protected HostConfiguration getHostConfiguration(HttpClient client, MessageContext context, URL targetURL) {
        HostConfiguration config = super.getHostConfiguration(client, context, targetURL);
        String proxyHost = System.getProperty("https.proxyHost");
        String port = System.getProperty("https.proxyPort");
        int proxyPort = Integer.parseInt(!StringHelper.isBlankOrNull((Object)port) ? port : "-1");
        String proxyUser = System.getProperty("https.proxyUser");
        String proxyPassword = System.getProperty("https.proxyPassword");
        if (!StringHelper.isBlankOrNull((Object)proxyHost)) {
            config.setProxyHost(new ProxyHost(proxyHost, proxyPort));
            if (!StringHelper.isBlankOrNull((Object)proxyUser)) {
                client.getState().setProxyCredentials(AuthScope.ANY, (Credentials)new UsernamePasswordCredentials(proxyUser, proxyPassword));
            }
        } else {
            config.setProxyHost(null);
        }
        return config;
    }
}

