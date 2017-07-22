/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacao
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLocator
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoapStub
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao;

import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacao;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoapStub;
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

public class NfeAutorizacaoLocator
extends org.apache.axis.client.Service
implements NfeAutorizacao {
    private String a;
    private String b = "NfeAutorizacaoSoap";
    private HashSet a = null;

    public NfeAutorizacaoLocator() {
    }

    public NfeAutorizacaoLocator(EngineConfiguration config) {
        super(config);
    }

    public NfeAutorizacaoLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public String getNfeAutorizacaoSoapAddress() {
        return this.a;
    }

    public String getNfeAutorizacaoSoapWSDDServiceName() {
        return this.b;
    }

    public void setNfeAutorizacaoSoapWSDDServiceName(String name) {
        this.b = name;
    }

    public NfeAutorizacaoSoap getNfeAutorizacaoSoap() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.a);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getNfeAutorizacaoSoap(endpoint);
    }

    public NfeAutorizacaoSoap getNfeAutorizacaoSoap(URL portAddress) throws ServiceException {
        try {
            NfeAutorizacaoSoapStub _stub = new NfeAutorizacaoSoapStub(portAddress, (Service)this);
            _stub.setPortName(this.getNfeAutorizacaoSoapWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public NfeAutorizacaoSoap getNfeAutorizacaoSoap(URL portAddress, int timeout) throws ServiceException {
        try {
            NfeAutorizacaoSoapStub _stub = new NfeAutorizacaoSoapStub(portAddress, (Service)this);
            _stub.setTimeout(timeout);
            _stub.setPortName(this.getNfeAutorizacaoSoapWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setNfeAutorizacaoSoapEndpointAddress(String address) {
        this.a = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (NfeAutorizacaoSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                NfeAutorizacaoSoapStub _stub = new NfeAutorizacaoSoapStub(new URL(this.a), (Service)this);
                _stub.setPortName(this.getNfeAutorizacaoSoapWSDDServiceName());
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
        if ("NfeAutorizacaoSoap".equals(inputPortName)) {
            return this.getNfeAutorizacaoSoap();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "NfeAutorizacao");
    }

    public Iterator getPorts() {
        if (this.a == null) {
            this.a = new HashSet();
            this.a.add(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "NfeAutorizacaoSoap"));
        }
        return this.a.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"NfeAutorizacaoSoap".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setNfeAutorizacaoSoapEndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

