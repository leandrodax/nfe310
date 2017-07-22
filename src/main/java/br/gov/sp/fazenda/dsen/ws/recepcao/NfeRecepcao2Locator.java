/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2Locator
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2Soap
 *  br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2SoapStub
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package br.gov.sp.fazenda.dsen.ws.recepcao;

import br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2;
import br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2Soap;
import br.gov.sp.fazenda.dsen.ws.recepcao.NfeRecepcao2SoapStub;
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

public class NfeRecepcao2Locator
extends org.apache.axis.client.Service
implements NfeRecepcao2 {
    private String a;
    private String b = "NfeRecepcao2Soap12";
    private HashSet a = null;

    public NfeRecepcao2Locator() {
    }

    public NfeRecepcao2Locator(EngineConfiguration config) {
        super(config);
    }

    public NfeRecepcao2Locator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public String getNfeRecepcao2Soap12Address() {
        return this.a;
    }

    public String getNfeRecepcao2Soap12WSDDServiceName() {
        return this.b;
    }

    public void setNfeRecepcao2Soap12WSDDServiceName(String name) {
        this.b = name;
    }

    public NfeRecepcao2Soap getNfeRecepcao2Soap12() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.a);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getNfeRecepcao2Soap12(endpoint);
    }

    public NfeRecepcao2Soap getNfeRecepcao2Soap12(URL portAddress) throws ServiceException {
        try {
            NfeRecepcao2SoapStub _stub = new NfeRecepcao2SoapStub(portAddress, (Service)this);
            _stub.setPortName(this.getNfeRecepcao2Soap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public NfeRecepcao2Soap getNfeRecepcao2Soap12(URL portAddress, int timeout) throws ServiceException {
        try {
            NfeRecepcao2SoapStub _stub = new NfeRecepcao2SoapStub(portAddress, (Service)this);
            _stub.setTimeout(timeout);
            _stub.setPortName(this.getNfeRecepcao2Soap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setNfeRecepcao2Soap12EndpointAddress(String address) {
        this.a = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (NfeRecepcao2Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                NfeRecepcao2SoapStub _stub = new NfeRecepcao2SoapStub(new URL(this.a), (Service)this);
                _stub.setPortName(this.getNfeRecepcao2Soap12WSDDServiceName());
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
        if ("NfeRecepcao2Soap12".equals(inputPortName)) {
            return this.getNfeRecepcao2Soap12();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", "NfeRecepcao2");
    }

    public Iterator getPorts() {
        if (this.a == null) {
            this.a = new HashSet();
            this.a.add(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", "NfeRecepcao2Soap12"));
        }
        return this.a.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"NfeRecepcao2Soap12".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setNfeRecepcao2Soap12EndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

