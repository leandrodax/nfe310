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
 *  org.bouncycastle.asn1.DERVisibleString
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
public class DERVisibleString
extends ASN1Object
implements DERString {
    String a;

    public static DERVisibleString getInstance(Object obj) {
        if (obj == null || obj instanceof DERVisibleString) {
            return (DERVisibleString)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERVisibleString(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERVisibleString.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERVisibleString getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERVisibleString.getInstance((Object)obj.getObject());
    }

    public DERVisibleString(byte[] string) {
        char[] cs = new char[string.length];
        for (int i = 0; i != cs.length; ++i) {
            cs[i] = (char)(string[i] & 255);
        }
        this.a = new String(cs);
    }

    public DERVisibleString(String string) {
        this.a = string;
    }

    public String getString() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    public byte[] getOctets() {
        char[] cs = this.a.toCharArray();
        byte[] bs = new byte[cs.length];
        for (int i = 0; i != cs.length; ++i) {
            bs[i] = (byte)cs[i];
        }
        return bs;
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(26, this.getOctets());
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERVisibleString)) {
            return false;
        }
        return this.getString().equals(((DERVisibleString)o).getString());
    }

    public int hashCode() {
        return this.getString().hashCode();
    }
}

