/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1OctetStringParser
 *  org.bouncycastle.asn1.ASN1Sequence
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.BERConstructedOctetString
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.util.encoders.Hex
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.util.encoders.Hex;

/*
 * Exception performing whole class analysis ignored.
 */
public abstract class ASN1OctetString
extends ASN1Object
implements ASN1OctetStringParser {
    byte[] a;

    public static ASN1OctetString getInstance(ASN1TaggedObject obj, boolean explicit) {
        return ASN1OctetString.getInstance((Object)obj.getObject());
    }

    public static ASN1OctetString getInstance(Object obj) {
        if (obj == null || obj instanceof ASN1OctetString) {
            return (ASN1OctetString)obj;
        }
        if (obj instanceof ASN1TaggedObject) {
            return ASN1OctetString.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        if (obj instanceof ASN1Sequence) {
            Vector v = new Vector();
            Enumeration e = ((ASN1Sequence)obj).getObjects();
            while (e.hasMoreElements()) {
                v.addElement(e.nextElement());
            }
            return new BERConstructedOctetString(v);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public ASN1OctetString(byte[] string) {
        this.a = string;
    }

    public ASN1OctetString(DEREncodable obj) {
        try {
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            DEROutputStream dOut = new DEROutputStream((OutputStream)bOut);
            dOut.writeObject((Object)obj);
            dOut.close();
            this.a = bOut.toByteArray();
        }
        catch (IOException e) {
            throw new IllegalArgumentException("Error processing object : " + e.toString());
        }
    }

    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.a);
    }

    public ASN1OctetStringParser parser() {
        return this;
    }

    public byte[] getOctets() {
        return this.a;
    }

    public int hashCode() {
        byte[] b = this.getOctets();
        int value = 0;
        for (int i = 0; i != b.length; ++i) {
            value ^= (b[i] & 255) << i % 4;
        }
        return value;
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof ASN1OctetString)) {
            return false;
        }
        ASN1OctetString other = (ASN1OctetString)o;
        byte[] b1 = other.a;
        byte[] b2 = this.a;
        if (b1.length != b2.length) {
            return false;
        }
        for (int i = 0; i != b1.length; ++i) {
            if (b1[i] == b2[i]) continue;
            return false;
        }
        return true;
    }

    abstract void encode(DEROutputStream var1) throws IOException;

    public String toString() {
        return "#" + new String(Hex.encode((byte[])this.a));
    }
}

