/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEvento
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoLocator
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoap
 *  br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoapStub
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package br.gov.sp.fazenda.dsen.ws.evento;

import br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEvento;
import br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoap;
import br.gov.sp.fazenda.dsen.ws.evento.RecepcaoEventoSoapStub;
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

public class RecepcaoEventoLocator
extends org.apache.axis.client.Service
implements RecepcaoEvento {
    private String a;
    private String b = "RecepcaoEventoSoap12";
    private HashSet a = null;

    public RecepcaoEventoLocator() {
    }

    public RecepcaoEventoLocator(EngineConfiguration config) {
        super(config);
    }

    public RecepcaoEventoLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public String getRecepcaoEventoSoap12Address() {
        return this.a;
    }

    public String getRecepcaoEventoSoap12WSDDServiceName() {
        return this.b;
    }

    public void setRecepcaoEventoSoap12WSDDServiceName(String name) {
        this.b = name;
    }

    public RecepcaoEventoSoap getRecepcaoEventoSoap12() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.a);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getRecepcaoEventoSoap12(endpoint);
    }

    public RecepcaoEventoSoap getRecepcaoEventoSoap12(URL portAddress) throws ServiceException {
        try {
            RecepcaoEventoSoapStub _stub = new RecepcaoEventoSoapStub(portAddress, (Service)this);
            _stub.setPortName(this.getRecepcaoEventoSoap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public RecepcaoEventoSoap getNfeInutilizacao2Soap12(URL portAddress, int timeout) throws ServiceException {
        try {
            RecepcaoEventoSoapStub _stub = new RecepcaoEventoSoapStub(portAddress, (Service)this);
            _stub.setTimeout(timeout);
            _stub.setPortName(this.getRecepcaoEventoSoap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setRecepcaoEventoSoap12EndpointAddress(String address) {
        this.a = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (RecepcaoEventoSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                RecepcaoEventoSoapStub _stub = new RecepcaoEventoSoapStub(new URL(this.a), (Service)this);
                _stub.setPortName(this.getRecepcaoEventoSoap12WSDDServiceName());
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
        if ("RecepcaoEventoSoap12".equals(inputPortName)) {
            return this.getRecepcaoEventoSoap12();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://www.portalfiscal.inf.br/nfe/wsdl/RecepcaoEvento", "RecepcaoEvento");
    }

    public Iterator getPorts() {
        if (this.a == null) {
            this.a = new HashSet();
            this.a.add(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/RecepcaoEvento", "RecepcaoEventoSoap12"));
        }
        return this.a.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"RecepcaoEventoSoap12".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setRecepcaoEventoSoap12EndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

