/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeDadosMsg
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLocator
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLoteResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoapProxy
 *  javax.xml.rpc.ServiceException
 *  javax.xml.rpc.Stub
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao.retorno;

import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeDadosMsg;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLocator;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLoteResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;
import org.w3c.dom.Element;

public class NfeRetAutorizacaoSoapProxy
implements NfeRetAutorizacaoSoap {
    private String a;
    private NfeRetAutorizacaoSoap a = null;

    public NfeRetAutorizacaoSoapProxy() {
        this.a();
    }

    public NfeRetAutorizacaoSoapProxy(String endpoint) {
        this.a = endpoint;
        this.a();
    }

    private void a() {
        try {
            this.a = new NfeRetAutorizacaoLocator().getNfeRetAutorizacaoSoap();
            if (this.a != null) {
                if (this.a != null) {
                    ((Stub)this.a)._setProperty("javax.xml.rpc.service.endpoint.address", (Object)this.a);
                } else {
                    this.a = (String)((Stub)this.a)._getProperty("javax.xml.rpc.service.endpoint.address");
                }
            }
        }
        catch (ServiceException serviceException) {
            // empty catch block
        }
    }

    public String getEndpoint() {
        return this.a;
    }

    public void setEndpoint(String endpoint) {
        this.a = endpoint;
        if (this.a != null) {
            ((Stub)this.a)._setProperty("javax.xml.rpc.service.endpoint.address", (Object)this.a);
        }
    }

    public NfeRetAutorizacaoSoap getNfeRetAutorizacaoSoap() {
        if (this.a == null) {
            this.a();
        }
        return this.a;
    }

    public NfeRetAutorizacaoLoteResult nfeRetAutorizacaoLote(Element element, NfeDadosMsg nfeDadosMsg) throws RemoteException {
        if (this.a == null) {
            this.a();
        }
        return this.a.nfeRetAutorizacaoLote(element, nfeDadosMsg);
    }
}

