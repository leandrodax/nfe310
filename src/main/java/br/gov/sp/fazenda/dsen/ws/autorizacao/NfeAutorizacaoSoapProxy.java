/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLocator
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteZipResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoapProxy
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeDadosMsg
 *  javax.xml.rpc.ServiceException
 *  javax.xml.rpc.Stub
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao;

import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLocator;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteZipResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeDadosMsg;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;
import org.w3c.dom.Element;

public class NfeAutorizacaoSoapProxy
implements NfeAutorizacaoSoap {
    private String a;
    private NfeAutorizacaoSoap a = null;

    public NfeAutorizacaoSoapProxy() {
        this.a();
    }

    public NfeAutorizacaoSoapProxy(String endpoint) {
        this.a = endpoint;
        this.a();
    }

    private void a() {
        try {
            this.a = new NfeAutorizacaoLocator().getNfeAutorizacaoSoap();
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

    public NfeAutorizacaoSoap getNfeAutorizacaoSoap() {
        if (this.a == null) {
            this.a();
        }
        return this.a;
    }

    public NfeAutorizacaoLoteResult nfeAutorizacaoLote(Element element, NfeDadosMsg nfeDadosMsg) throws RemoteException {
        if (this.a == null) {
            this.a();
        }
        return this.a.nfeAutorizacaoLote(element, nfeDadosMsg);
    }

    public NfeAutorizacaoLoteZipResult nfeAutorizacaoLoteZip(String nfeDadosMsgZip) throws RemoteException {
        if (this.a == null) {
            this.a();
        }
        return this.a.nfeAutorizacaoLoteZip(nfeDadosMsgZip);
    }
}

