/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFB
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBLocator
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoap
 *  br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoapStub
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package br.gov.sp.fazenda.dsen.ws.dpec.envio;

import br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFB;
import br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoap;
import br.gov.sp.fazenda.dsen.ws.dpec.envio.SCERecepcaoRFBSoapStub;
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

public class SCERecepcaoRFBLocator
extends org.apache.axis.client.Service
implements SCERecepcaoRFB {
    private String a;
    private String b = "SCERecepcaoRFBSoap12";
    private HashSet a = null;

    public SCERecepcaoRFBLocator() {
    }

    public SCERecepcaoRFBLocator(EngineConfiguration config) {
        super(config);
    }

    public SCERecepcaoRFBLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public String getSCERecepcaoRFBSoap12Address() {
        return this.a;
    }

    public String getSCERecepcaoRFBSoap12WSDDServiceName() {
        return this.b;
    }

    public void setSCERecepcaoRFBSoap12WSDDServiceName(String name) {
        this.b = name;
    }

    public SCERecepcaoRFBSoap getSCERecepcaoRFBSoap12() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.a);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getSCERecepcaoRFBSoap12(endpoint);
    }

    public SCERecepcaoRFBSoap getSCERecepcaoRFBSoap12(URL portAddress) throws ServiceException {
        try {
            SCERecepcaoRFBSoapStub _stub = new SCERecepcaoRFBSoapStub(portAddress, (Service)this);
            _stub.setPortName(this.getSCERecepcaoRFBSoap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public SCERecepcaoRFBSoap getSCERecepcaoRFBSoap12(URL portAddress, int timeout) throws ServiceException {
        try {
            SCERecepcaoRFBSoapStub _stub = new SCERecepcaoRFBSoapStub(portAddress, (Service)this);
            _stub.setTimeout(timeout);
            _stub.setPortName(this.getSCERecepcaoRFBSoap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setSCERecepcaoRFBSoap12EndpointAddress(String address) {
        this.a = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (SCERecepcaoRFBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                SCERecepcaoRFBSoapStub _stub = new SCERecepcaoRFBSoapStub(new URL(this.a), (Service)this);
                _stub.setPortName(this.getSCERecepcaoRFBSoap12WSDDServiceName());
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
        if ("SCERecepcaoRFBSoap12".equals(inputPortName)) {
            return this.getSCERecepcaoRFBSoap12();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCERecepcaoRFB", "SCERecepcaoRFB");
    }

    public Iterator getPorts() {
        if (this.a == null) {
            this.a = new HashSet();
            this.a.add(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCERecepcaoRFB", "SCERecepcaoRFBSoap12"));
        }
        return this.a.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"SCERecepcaoRFBSoap12".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setSCERecepcaoRFBSoap12EndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

