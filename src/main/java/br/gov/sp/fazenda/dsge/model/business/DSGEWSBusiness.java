/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.StringHelper
 *  br.gov.sp.fazenda.dsge.model.business.DSGEWSBusiness
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException
 *  br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException
 *  org.apache.axis.EngineConfiguration
 */
package br.gov.sp.fazenda.dsge.model.business;

import br.gov.sp.fazenda.dsge.common.util.StringHelper;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionClientException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEConnectionServerException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEProxyException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGESocketException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGETimeoutException;
import br.gov.sp.fazenda.dsge.ws.exception.DSGEWebServiceException;
import org.apache.axis.EngineConfiguration;

public abstract class DSGEWSBusiness {
    public final int TIMEOUT = 60000;

    public void configurarProxy() {
        String porta = this.getPortaProxy();
        String proxy = this.getProxyServidor();
        String senha = this.getSenhaProxy();
        String usuario = this.getUsuarioProxy();
        if (!StringHelper.isBlankOrNull((Object)proxy)) {
            System.setProperty("https.proxyHost", proxy);
            System.setProperty("https.proxyPort", porta);
        } else {
            System.setProperty("https.proxyHost", "");
            System.setProperty("https.proxyPort", "");
        }
        if (!StringHelper.isBlankOrNull((Object)usuario)) {
            System.setProperty("https.proxyUser", usuario);
            System.setProperty("https.proxyPassword", senha);
        } else {
            System.setProperty("https.proxyUser", "");
            System.setProperty("https.proxyPassword", "");
        }
    }

    public void lancarExceptionWS(Exception e) throws DSGEConnectionClientException, DSGEConnectionServerException, DSGETimeoutException, DSGEProxyException, DSGESocketException, DSGEWebServiceException {
        if (System.getProperty("https.proxyHost") == null || System.getProperty("https.proxyHost").equals("false")) {
            if (e.getMessage().indexOf("UnknownHostException") != -1) {
                throw new DSGEConnectionClientException((Throwable)e, e.getMessage());
            }
            if (e.getMessage().indexOf("NoRouteToHostException") != -1) {
                throw new DSGEConnectionClientException((Throwable)e, e.getMessage());
            }
            if (e.getMessage().indexOf("ConnectException") != -1) {
                throw new DSGEConnectionServerException((Throwable)e, e.getMessage());
            }
            if (e.getMessage().indexOf("SocketTimeoutException") != -1) {
                throw new DSGETimeoutException((Throwable)e, e.getMessage());
            }
            if (e.getMessage().indexOf("ConnectTimeoutException") != -1) {
                throw new DSGETimeoutException((Throwable)e, e.getMessage());
            }
            if (e.getMessage().indexOf("IOException") != -1) {
                throw new DSGEProxyException((Throwable)e, e.getMessage());
            }
            if (e.getMessage().indexOf("SocketException") != -1) {
                throw new DSGESocketException((Throwable)e, e.getMessage());
            }
            throw new DSGEWebServiceException((Throwable)e, e.getMessage());
        }
        if (e.getMessage().indexOf("UnknownHostException") != -1) {
            throw new DSGEConnectionClientException((Throwable)e, e.getMessage());
        }
        if (e.getMessage().indexOf("IOException") != -1) {
            throw new DSGETimeoutException((Throwable)e, e.getMessage());
        }
        if (e.getMessage().indexOf("SocketTimeoutException") != -1) {
            throw new DSGETimeoutException((Throwable)e, e.getMessage());
        }
        if (e.getMessage().indexOf("ConnectTimeoutException") != -1) {
            throw new DSGETimeoutException((Throwable)e, e.getMessage());
        }
        if (e.getMessage().indexOf("SocketException") != -1) {
            throw new DSGESocketException((Throwable)e, e.getMessage());
        }
        throw new DSGEWebServiceException((Throwable)e, e.getMessage());
    }

    public abstract String getUsuarioProxy();

    public abstract String getSenhaProxy();

    public abstract String getProxyServidor();

    public abstract String getPortaProxy();

    public abstract EngineConfiguration getEngineConfiguration();

    static {
        System.setProperty("sun.security.ssl.allowUnsafeRenegotiation", "true");
    }
}

