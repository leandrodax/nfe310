/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsen.ws.autorizacao.NfeCabecMsg
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package br.gov.sp.fazenda.dsen.ws.autorizacao;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class NfeCabecMsg
implements Serializable {
    private String a;
    private String b;
    private Object a;
    private boolean a = false;
    private static TypeDesc a = new TypeDesc(NfeCabecMsg.class, true);

    public NfeCabecMsg() {
    }

    public NfeCabecMsg(String cUF, String versaoDados) {
        this.a = cUF;
        this.b = versaoDados;
    }

    public String getCUF() {
        return this.a;
    }

    public void setCUF(String cUF) {
        this.a = cUF;
    }

    public String getVersaoDados() {
        return this.b;
    }

    public void setVersaoDados(String versaoDados) {
        this.b = versaoDados;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NfeCabecMsg)) {
            return false;
        }
        NfeCabecMsg other = (NfeCabecMsg)obj;
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
        boolean _equals = (this.a == null && other.getCUF() == null || this.a != null && this.a.equals(other.getCUF())) && (this.b == null && other.getVersaoDados() == null || this.b != null && this.b.equals(other.getVersaoDados()));
        this.a = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.a) {
            return 0;
        }
        this.a = true;
        int _hashCode = 1;
        if (this.getCUF() != null) {
            _hashCode += this.getCUF().hashCode();
        }
        if (this.getVersaoDados() != null) {
            _hashCode += this.getVersaoDados().hashCode();
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
        a.setXmlType(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "nfeCabecMsg"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("CUF");
        elemField.setXmlName(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "cUF"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        a.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versaoDados");
        elemField.setXmlName(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeAutorizacao", "versaoDados"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        a.addFieldDesc((FieldDesc)elemField);
    }
}

