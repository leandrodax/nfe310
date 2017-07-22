/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERString
 *  org.bouncycastle.asn1.DERT61String
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERString;

/*
 * Exception performing whole class analysis ignored.
 */
public class DERT61String
extends ASN1Object
implements DERString {
    String a;

    public static DERT61String getInstance(Object obj) {
        if (obj == null || obj instanceof DERT61String) {
            return (DERT61String)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERT61String(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERT61String.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERT61String getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERT61String.getInstance((Object)obj.getObject());
    }

    public DERT61String(byte[] string) {
        char[] cs = new char[string.length];
        for (int i = 0; i != cs.length; ++i) {
            cs[i] = (char)(string[i] & 255);
        }
        this.a = new String(cs);
    }

    public DERT61String(String string) {
        this.a = string;
    }

    public String getString() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(20, this.getOctets());
    }

    public byte[] getOctets() {
        char[] cs = this.a.toCharArray();
        byte[] bs = new byte[cs.length];
        for (int i = 0; i != cs.length; ++i) {
            bs[i] = (byte)cs[i];
        }
        return bs;
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERT61String)) {
            return false;
        }
        return this.getString().equals(((DERT61String)o).getString());
    }

    public int hashCode() {
        return this.getString().hashCode();
    }
}

