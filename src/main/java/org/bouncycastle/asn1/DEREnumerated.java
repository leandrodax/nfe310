/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DEREnumerated
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
public class DEREnumerated
extends ASN1Object {
    byte[] a;

    public static DEREnumerated getInstance(Object obj) {
        if (obj == null || obj instanceof DEREnumerated) {
            return (DEREnumerated)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DEREnumerated(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DEREnumerated.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DEREnumerated getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DEREnumerated.getInstance((Object)obj.getObject());
    }

    public DEREnumerated(int value) {
        this.a = BigInteger.valueOf(value).toByteArray();
    }

    public DEREnumerated(BigInteger value) {
        this.a = value.toByteArray();
    }

    public DEREnumerated(byte[] bytes) {
        this.a = bytes;
    }

    public BigInteger getValue() {
        return new BigInteger(this.a);
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(10, this.a);
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DEREnumerated)) {
            return false;
        }
        DEREnumerated other = (DEREnumerated)o;
        if (this.a.length != other.a.length) {
            return false;
        }
        for (int i = 0; i != this.a.length; ++i) {
            if (this.a[i] == other.a[i]) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.getValue().hashCode();
    }
}

