/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFB
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBLocator
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoapStub
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package br.gov.sp.fazenda.dsen.ws.dpec.consulta;

import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFB;
import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap;
import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoapStub;
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

public class SCEConsultaRFBLocator
extends org.apache.axis.client.Service
implements SCEConsultaRFB {
    private String a;
    private String b = "https://10.200.140.117/DESV/DPEC/SCeConsultaRFB/SCeConsultaRFB.asmx";
    private String c = "SCEConsultaRFBSoap12";
    private HashSet a = null;

    public SCEConsultaRFBLocator() {
    }

    public SCEConsultaRFBLocator(EngineConfiguration config) {
        super(config);
    }

    public SCEConsultaRFBLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public String getSCEConsultaRFBSoapWSDDServiceName() {
        return this.a;
    }

    public void setSCEConsultaRFBSoapWSDDServiceName(String name) {
        this.a = name;
    }

    public String getSCEConsultaRFBSoap12Address() {
        return this.b;
    }

    public String getSCEConsultaRFBSoap12WSDDServiceName() {
        return this.c;
    }

    public void setSCEConsultaRFBSoap12WSDDServiceName(String name) {
        this.c = name;
    }

    public SCEConsultaRFBSoap getSCEConsultaRFBSoap12() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.b);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getSCEConsultaRFBSoap12(endpoint);
    }

    public SCEConsultaRFBSoap getSCEConsultaRFBSoap12(URL portAddress) throws ServiceException {
        try {
            SCEConsultaRFBSoapStub _stub = new SCEConsultaRFBSoapStub(portAddress, (Service)this);
            _stub.setPortName(this.getSCEConsultaRFBSoap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public SCEConsultaRFBSoap getSCEConsultaRFBSoap12(URL portAddress, int timeout) throws ServiceException {
        try {
            SCEConsultaRFBSoapStub _stub = new SCEConsultaRFBSoapStub(portAddress, (Service)this);
            _stub.setTimeout(timeout);
            _stub.setPortName(this.getSCEConsultaRFBSoap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setSCEConsultaRFBSoap12EndpointAddress(String address) {
        this.b = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (SCEConsultaRFBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                SCEConsultaRFBSoapStub _stub = new SCEConsultaRFBSoapStub(new URL(this.b), (Service)this);
                _stub.setPortName(this.getSCEConsultaRFBSoap12WSDDServiceName());
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
        if ("SCEConsultaRFBSoap12".equals(inputPortName)) {
            return this.getSCEConsultaRFBSoap12();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "SCEConsultaRFB");
    }

    public Iterator getPorts() {
        if (this.a == null) {
            this.a = new HashSet();
            this.a.add(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "SCEConsultaRFBSoap12"));
        }
        return this.a.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"SCEConsultaRFBSoap12".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setSCEConsultaRFBSoap12EndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

