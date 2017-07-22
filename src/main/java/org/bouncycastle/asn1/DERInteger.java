/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERInteger
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public class DERInteger
extends ASN1Object {
    byte[] a;

    public static DERInteger getInstance(Object obj) {
        if (obj == null || obj instanceof DERInteger) {
            return (DERInteger)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERInteger(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERInteger.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERInteger getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERInteger.getInstance((Object)obj.getObject());
    }

    public DERInteger(int value) {
        this.a = BigInteger.valueOf(value).toByteArray();
    }

    public DERInteger(BigInteger value) {
        this.a = value.toByteArray();
    }

    public DERInteger(byte[] bytes) {
        this.a = bytes;
    }

    public BigInteger getValue() {
        return new BigInteger(this.a);
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.a);
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(2, this.a);
    }

    public int hashCode() {
        int value = 0;
        for (int i = 0; i != this.a.length; ++i) {
            value ^= (this.a[i] & 255) << i % 4;
        }
        return value;
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERInteger)) {
            return false;
        }
        DERInteger other = (DERInteger)o;
        if (this.a.length != other.a.length) {
            return false;
        }
        for (int i = 0; i != this.a.length; ++i) {
            if (this.a[i] == other.a[i]) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return this.getValue().toString();
    }
}

