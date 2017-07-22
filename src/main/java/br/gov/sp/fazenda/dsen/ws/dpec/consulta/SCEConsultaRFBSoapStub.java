/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoapStub
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceConsultaDPECResult
 *  br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceDadosMsg
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
 *  org.apache.axis.soap.SOAP12Constants
 *  org.apache.axis.soap.SOAPConstants
 *  org.apache.axis.utils.JavaUtils
 */
package br.gov.sp.fazenda.dsen.ws.dpec.consulta;

import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SCEConsultaRFBSoap;
import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceConsultaDPECResult;
import br.gov.sp.fazenda.dsen.ws.dpec.consulta.SceDadosMsg;
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
import org.apache.axis.soap.SOAP12Constants;
import org.apache.axis.soap.SOAPConstants;
import org.apache.axis.utils.JavaUtils;
import org.w3c.dom.Element;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class SCEConsultaRFBSoapStub
extends Stub
implements SCEConsultaRFBSoap {
    private Vector a = new Vector();
    private Vector b = new Vector();
    private Vector c = new Vector();
    private Vector d = new Vector();
    static OperationDesc[] a = new OperationDesc[1];

    private static void a() {
        OperationDesc oper = new OperationDesc();
        oper.setName("sceConsultaDPEC");
        ParameterDesc param = new ParameterDesc(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "sceDadosMsg"), 1, new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", ">sceDadosMsg"), SceDadosMsg.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", ">sceConsultaDPECResult"));
        oper.setReturnClass(SceConsultaDPECResult.class);
        oper.setReturnQName(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", "sceConsultaDPECResult"));
        oper.setStyle(Style.DOCUMENT);
        oper.setUse(Use.LITERAL);
        SCEConsultaRFBSoapStub.a[0] = oper;
    }

    public SCEConsultaRFBSoapStub() throws AxisFault {
        this(null);
    }

    public SCEConsultaRFBSoapStub(URL endpointURL, Service service) throws AxisFault {
        this(service);
        this.cachedEndpoint = endpointURL;
    }

    public SCEConsultaRFBSoapStub(Service service) throws AxisFault {
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
        QName qName = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", ">sceConsultaDPECResult");
        this.b.add(qName);
        Class<SceConsultaDPECResult> cls = SceConsultaDPECResult.class;
        this.a.add(cls);
        this.c.add(beansf);
        this.d.add(beandf);
        qName = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB", ">sceDadosMsg");
        this.b.add(qName);
        cls = SceDadosMsg.class;
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

    public SceConsultaDPECResult sceConsultaDPEC(Element element, SceDadosMsg sceDadosMsg) throws RemoteException {
        if (this.cachedEndpoint == null) {
            throw new NoEndPointException();
        }
        Call _call = this.createCall();
        _call.setOperation(a[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.portalfiscal.inf.br/nfe/wsdl/SCEConsultaRFB/sceConsultaDPEC");
        _call.setEncodingStyle(null);
        _call.setProperty("sendXsiTypes", (Object)Boolean.FALSE);
        _call.setProperty("sendMultiRefs", (Object)Boolean.FALSE);
        _call.setSOAPVersion((SOAPConstants)SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new QName("", "sceConsultaDPEC"));
        SOAPHeaderElement headerElement = new SOAPHeaderElement(element);
        _call.addHeader(headerElement);
        this.setRequestHeaders(_call);
        this.setAttachments(_call);
        Object _resp = _call.invoke(new Object[]{sceDadosMsg});
        if (_resp instanceof RemoteException) {
            throw (RemoteException)_resp;
        }
        this.extractAttachments(_call);
        try {
            return (SceConsultaDPECResult)_resp;
        }
        catch (Exception _exception) {
            return (SceConsultaDPECResult)JavaUtils.convert((Object)_resp, SceConsultaDPECResult.class);
        }
    }

    static {
        SCEConsultaRFBSoapStub.a();
    }
}

