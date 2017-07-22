/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacao
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoLocator
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoapStub
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao.retorno;

import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacao;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoap;
import br.gov.sp.fazenda.dsen.ws.autorizacao.retorno.NfeRetAutorizacaoSoapStub;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Stub;

public class NfeRetAutorizacaoLocator
extends org.apache.axis.client.Service
implements NfeRetAutorizacao {
    private String a;
    private String b = "NfeRetAutorizacaoSoap";
    private HashSet a = null;

    public NfeRetAutorizacaoLocator() {
    }

    public NfeRetAutorizacaoLocator(EngineConfiguration config) {
        super(config);
    }

    public NfeRetAutorizacaoLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public String getNfeRetAutorizacaoSoapAddress() {
        return this.a;
    }

    public String getNfeRetAutorizacaoSoapWSDDServiceName() {
        return this.b;
    }

    public void setNfeRetAutorizacaoSoapWSDDServiceName(String name) {
        this.b = name;
    }

    public NfeRetAutorizacaoSoap getNfeRetAutorizacaoSoap() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.a);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getNfeRetAutorizacaoSoap(endpoint);
    }

    public NfeRetAutorizacaoSoap getNfeRetAutorizacaoSoap(URL portAddress) throws ServiceException {
        try {
            NfeRetAutorizacaoSoapStub _stub = new NfeRetAutorizacaoSoapStub(portAddress, (Service)this);
            _stub.setPortName(this.getNfeRetAutorizacaoSoapWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public NfeRetAutorizacaoSoap getNfeRetAutorizacaoSoap(URL portAddress, int timeout) throws ServiceException {
        try {
            NfeRetAutorizacaoSoapStub _stub = new NfeRetAutorizacaoSoapStub(portAddress, (Service)this);
            _stub.setPortName(this.getNfeRetAutorizacaoSoapWSDDServiceName());
            _stub.setTimeout(timeout);
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setNfeRetAutorizacaoSoapEndpointAddress(String address) {
        this.a = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (NfeRetAutorizacaoSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                NfeRetAutorizacaoSoapStub _stub = new NfeRetAutorizacaoSoapStub(new URL(this.a), (Service)this);
                _stub.setPortName(this.getNfeRetAutorizacaoSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return this.getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("NfeRetAutorizacaoSoap".equals(inputPortName)) {
            return this.getNfeRetAutorizacaoSoap();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRetAutorizacao", "NfeRetAutorizacao");
    }

    public Iterator getPorts() {
        if (this.a == null) {
            this.a = new HashSet();
            this.a.add(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRetAutorizacao", "NfeRetAutorizacaoSoap"));
        }
        return this.a.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"NfeRetAutorizacaoSoap".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setNfeRetAutorizacaoSoapEndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

