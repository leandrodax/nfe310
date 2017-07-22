/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Locator
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap
 *  br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap12Stub
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package br.gov.sp.fazenda.dsen.ws.cadastro;

import br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2;
import br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap;
import br.gov.sp.fazenda.dsen.ws.cadastro.CadConsultaCadastro2Soap12Stub;
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

public class CadConsultaCadastro2Locator
extends org.apache.axis.client.Service
implements CadConsultaCadastro2 {
    private String a;
    private String b = "CadConsultaCadastro2Soap12";
    private HashSet a = null;

    public CadConsultaCadastro2Locator() {
    }

    public CadConsultaCadastro2Locator(EngineConfiguration config) {
        super(config);
    }

    public CadConsultaCadastro2Locator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    public String getCadConsultaCadastro2Soap12Address() {
        return this.a;
    }

    public String getCadConsultaCadastro2Soap12WSDDServiceName() {
        return this.b;
    }

    public void setCadConsultaCadastro2Soap12WSDDServiceName(String name) {
        this.b = name;
    }

    public CadConsultaCadastro2Soap getCadConsultaCadastro2Soap12() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.a);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getCadConsultaCadastro2Soap12(endpoint);
    }

    public CadConsultaCadastro2Soap getCadConsultaCadastro2Soap12(URL portAddress) throws ServiceException {
        try {
            CadConsultaCadastro2Soap12Stub _stub = new CadConsultaCadastro2Soap12Stub(portAddress, (Service)this);
            _stub.setPortName(this.getCadConsultaCadastro2Soap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public CadConsultaCadastro2Soap getCadConsultaCadastro2Soap12(URL portAddress, int timeout) throws ServiceException {
        try {
            CadConsultaCadastro2Soap12Stub _stub = new CadConsultaCadastro2Soap12Stub(portAddress, (Service)this);
            _stub.setTimeout(timeout);
            _stub.setPortName(this.getCadConsultaCadastro2Soap12WSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setCadConsultaCadastro2Soap12EndpointAddress(String address) {
        this.a = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (CadConsultaCadastro2Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                CadConsultaCadastro2Soap12Stub _stub = new CadConsultaCadastro2Soap12Stub(new URL(this.a), (Service)this);
                _stub.setPortName(this.getCadConsultaCadastro2Soap12WSDDServiceName());
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
        if ("CadConsultaCadastro2Soap12".equals(inputPortName)) {
            return this.getCadConsultaCadastro2Soap12();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2", "CadConsultaCadastro2");
    }

    public Iterator getPorts() {
        if (this.a == null) {
            this.a = new HashSet();
            this.a.add(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2", "CadConsultaCadastro2Soap12"));
        }
        return this.a.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"CadConsultaCadastro2Soap12".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setCadConsultaCadastro2Soap12EndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

