/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.cancelamento.NfeCancelamentoNF2Result
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.AnyContentType
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.MixedContentType
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 *  org.apache.axis.message.MessageElement
 */
package br.gov.sp.fazenda.dsen.ws.cancelamento;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.AnyContentType;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.MixedContentType;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;
import org.apache.axis.message.MessageElement;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NfeCancelamentoNF2Result
implements Serializable,
AnyContentType,
MixedContentType {
    private MessageElement[] a;
    private Object a;
    private boolean a = false;
    private static TypeDesc a = new TypeDesc(NfeCancelamentoNF2Result.class, true);

    public NfeCancelamentoNF2Result() {
    }

    public NfeCancelamentoNF2Result(MessageElement[] _any) {
        this.a = _any;
    }

    public MessageElement[] get_any() {
        return this.a;
    }

    public void set_any(MessageElement[] _any) {
        this.a = _any;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NfeCancelamentoNF2Result)) {
            return false;
        }
        NfeCancelamentoNF2Result other = (NfeCancelamentoNF2Result)obj;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.a != null) {
            return this.a == obj;
        }
        this.a = obj;
        boolean _equals = this.a == null && other.get_any() == null || this.a != null && Arrays.equals(this.a, (Object[])other.get_any());
        this.a = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.a) {
            return 0;
        }
        this.a = true;
        int _hashCode = 1;
        if (this.get_any() != null) {
            for (int i = 0; i < Array.getLength(this.get_any()); ++i) {
                Object obj = Array.get(this.get_any(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        this.a = false;
        return _hashCode;
    }

    public static TypeDesc getTypeDesc() {
        return a;
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new BeanSerializer(_javaType, _xmlType, a);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new BeanDeserializer(_javaType, _xmlType, a);
    }

    static {
        a.setXmlType(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeCancelamento2", ">nfeCancelamentoNF2Result"));
    }
}

