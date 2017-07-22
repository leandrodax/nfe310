/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteZipResult
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoapStub
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeCabecMsg
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeDadosMsg
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.encoding.SerializerFactory
 *  org.apache.axis.AxisFault
 *  org.apache.axis.NoEndPointException
 *  org.apache.axis.client.Call
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 *  org.apache.axis.constants.Style
 *  org.apache.axis.constants.Use
 *  org.apache.axis.description.OperationDesc
 *  org.apache.axis.description.ParameterDesc
 *  org.apache.axis.encoding.DeserializerFactory
 *  org.apache.axis.encoding.SerializerFactory
 *  org.apache.axis.encoding.ser.ArrayDeserializerFactory
 *  org.apache.axis.encoding.ser.ArraySerializerFactory
 *  org.apache.axis.encoding.ser.BeanDeserializerFactory
 *  org.apache.axis.encoding.ser.BeanSerializerFactory
 *  org.apache.axis.encoding.ser.EnumDeserializerFactory
 *  org.apache.axis.encoding.ser.EnumSerializerFactory
 *  org.apache.axis.encoding.ser.SimpleDeserializerFactory
 *  org.apache.axis.encoding.ser.SimpleListDeserializerFactory
 *  org.apache.axis.encoding.ser.SimpleListSerializerFactory
 *  org.apache.axis.encoding.ser.SimpleSerializerFactory
 *  org.apache.axis.message.SOAPHeaderElement
 *  org.apache.axis.soap.SOAP11Constants
 *  org.apache.axis.soap.SOAP12Constants
 *  org.apache.axis.soap.SOAPConstants
 *  org.apache.axis.utils.JavaUtils
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao;

import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoLoteZipResult;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeAutorizacaoSoap;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeCabecMsg;
import br.gov.sp.fazenda.dsen.ws.autorizacao.NfeDadosMsg;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;
import javax.xml.namespace.QName;
import javax.xml.rpc.Service;
import javax.xml.rpc.encoding.SerializerFactory;
import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.client.Stub;
import org.apache.axis.constants.Style;
import org.apache.axis.constants.Use;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.DeserializerFactory;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.axis.encoding.ser.EnumDeserializerFactory;
import org.apache.axis.encoding.ser.EnumSerializerFactory;
import org.apache.axis.encoding.ser.SimpleDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleListDeserializerFactory;
import org.apache.axis.encoding.ser.SimpleListSerializerFactory;
import org.apache.axis.encoding.ser.SimpleSerializerFactory;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.soap.SOAP11Constants;
import org.apache.axis.soap.SOAP12Constants;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;
import org.w3c.dom.Element;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class NfeAutorizacaoSoapStub
extends Stub
implements NfeAutorizacaoSoap {
    private Vector a = new Vector();
    private Vector b = new Vector();
    private Vector c = new Vector();
    private Vector d = new Vector();
    static OperationDesc[] a = new OperationDesc[2];

    private static void a() {
        OperationDesc oper = new OperationDesc();
        oper.setName("nfeAutorizacaoLote");
        ParameterDesc param = new ParameterDesc(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "nfeDadosMsg"), 1, new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", ">nfeDadosMsg"), NfeDadosMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", ">nfeAutorizacaoLoteResult"));
        oper.setReturnClass(NfeAutorizacaoLoteResult.class);
        oper.setReturnQName(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "nfeAutorizacaoLoteResult"));
        oper.setStyle(Style.DOCUMENT);
        oper.setUse(Use.LITERAL);
        NfeAutorizacaoSoapStub.a[0] = oper;
        oper = new OperationDesc();
        oper.setName("nfeAutorizacaoLoteZip");
        param = new ParameterDesc(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "nfeDadosMsgZip"), 1, new QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", ">nfeAutorizacaoLoteZipResult"));
        oper.setReturnClass(NfeAutorizacaoLoteZipResult.class);
        oper.setReturnQName(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "nfeAutorizacaoLoteZipResult"));
        oper.setStyle(Style.DOCUMENT);
        oper.setUse(Use.LITERAL);
        NfeAutorizacaoSoapStub.a[1] = oper;
    }

    public NfeAutorizacaoSoapStub() throws AxisFault {
        this(null);
    }

    public NfeAutorizacaoSoapStub(URL endpointURL, Service service) throws AxisFault {
        this(service);
        this.cachedEndpoint = endpointURL;
    }

    public NfeAutorizacaoSoapStub(Service service) throws AxisFault {
        this.service = service == null ? new org.apache.axis.client.Service() : service;
        ((org.apache.axis.client.Service)this.service).setTypeMappingVersion("1.2");
        Class<BeanSerializerFactory> beansf = BeanSerializerFactory.class;
        Class<BeanDeserializerFactory> beandf = BeanDeserializerFactory.class;
        Class<EnumSerializerFactory> enumsf = EnumSerializerFactory.class;
        Class<EnumDeserializerFactory> enumdf = EnumDeserializerFactory.class;
        Class<ArraySerializerFactory> arraysf = ArraySerializerFactory.class;
        Class<ArrayDeserializerFactory> arraydf = ArrayDeserializerFactory.class;
        Class<SimpleSerializerFactory> simplesf = SimpleSerializerFactory.class;
        Class<SimpleDeserializerFactory> simpledf = SimpleDeserializerFactory.class;
        Class<SimpleListSerializerFactory> simplelistsf = SimpleListSerializerFactory.class;
        Class<SimpleListDeserializerFactory> simplelistdf = SimpleListDeserializerFactory.class;
        QName qName = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", ">nfeAutorizacaoLoteResult");
        this.b.add(qName);
        Class<NfeAutorizacaoLoteResult> cls = NfeAutorizacaoLoteResult.class;
        this.a.add(cls);
        this.c.add(beansf);
        this.d.add(beandf);
        qName = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", ">nfeAutorizacaoLoteZipResult");
        this.b.add(qName);
        cls = NfeAutorizacaoLoteZipResult.class;
        this.a.add(cls);
        this.c.add(beansf);
        this.d.add(beandf);
        qName = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", ">nfeDadosMsg");
        this.b.add(qName);
        cls = NfeDadosMsg.class;
        this.a.add(cls);
        this.c.add(beansf);
        this.d.add(beandf);
        qName = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "nfeCabecMsg");
        this.b.add(qName);
        cls = NfeCabecMsg.class;
        this.a.add(cls);
        this.c.add(beansf);
        this.d.add(beandf);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected Call createCall() throws RemoteException {
        try {
            Object key;
            Call _call = super._createCall();
            if (this.maintainSessionSet) {
                _call.setMaintainSession(this.maintainSession);
            }
            if (this.cachedUsername != null) {
                _call.setUsername(this.cachedUsername);
            }
            if (this.cachedPassword != null) {
                _call.setPassword(this.cachedPassword);
            }
            if (this.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(this.cachedEndpoint);
            }
            if (this.cachedTimeout != null) {
                _call.setTimeout(this.cachedTimeout);
            }
            if (this.cachedPortName != null) {
                _call.setPortName(this.cachedPortName);
            }
            Enumeration keys = this.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                key = (String)keys.nextElement();
                _call.setProperty((String)key, this.cachedProperties.get(key));
            }
            key = this;
            synchronized (key) {
                if (this.firstCall()) {
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < this.c.size(); ++i) {
                        Class df;
                        Class sf;
                        Class cls = (Class)this.a.get(i);
                        QName qName = (QName)this.b.get(i);
                        Object x = this.c.get(i);
                        if (x instanceof Class) {
                            sf = (Class)this.c.get(i);
                            df = (Class)this.d.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                            continue;
                        }
                        if (!(x instanceof SerializerFactory)) continue;
                        sf = (org.apache.axis.encoding.SerializerFactory)this.c.get(i);
                        df = (DeserializerFactory)this.d.get(i);
                        _call.registerTypeMapping(cls, qName, (org.apache.axis.encoding.SerializerFactory)sf, (DeserializerFactory)df, false);
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public NfeAutorizacaoLoteResult nfeAutorizacaoLote(Element element, NfeDadosMsg nfeDadosMsg) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(a[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao/nfeAutorizacaoLote");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new QName("", "nfeAutorizacaoLote"));
        SOAPHeaderElement headerElement = new SOAPHeaderElement(element);
        _call.addHeader(headerElement);
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{nfeDadosMsg});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (NfeAutorizacaoLoteResult)_resp;
        }
        catch (Exception _exception) {
            return (NfeAutorizacaoLoteResult)JavaUtils.convert((Object)_resp, NfeAutorizacaoLoteResult.class);
        }
    }

    public NfeAutorizacaoLoteZipResult nfeAutorizacaoLoteZip(String nfeDadosMsgZip) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(a[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao/nfeAutorizacaoLoteZip");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new QName("", "nfeAutorizacaoLoteZip"));
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{nfeDadosMsgZip});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (NfeAutorizacaoLoteZipResult)_resp;
        }
        catch (Exception _exception) {
            return (NfeAutorizacaoLoteZipResult)JavaUtils.convert((Object)_resp, NfeAutorizacaoLoteZipResult.class);
        }
    }

    static {
        NfeAutorizacaoSoapStub.a();
    }
}

