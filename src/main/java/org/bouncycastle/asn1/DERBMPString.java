/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERBMPString
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERString
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
public class DERBMPString
extends ASN1Object
implements DERString {
    String a;

    public static DERBMPString getInstance(Object obj) {
        if (obj == null || obj instanceof DERBMPString) {
            return (DERBMPString)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERBMPString(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERBMPString.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERBMPString getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERBMPString.getInstance((Object)obj.getObject());
    }

    public DERBMPString(byte[] string) {
        char[] cs = new char[string.length / 2];
        for (int i = 0; i != cs.length; ++i) {
            cs[i] = (char)(string[2 * i] << 8 | string[2 * i + 1] & 255);
        }
        this.a = new String(cs);
    }

    public DERBMPString(String string) {
        this.a = string;
    }

    public String getString() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    public int hashCode() {
        return this.getString().hashCode();
    }

    protected boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERBMPString)) {
            return false;
        }
        DERBMPString s = (DERBMPString)o;
        return this.getString().equals(s.getString());
    }

    void encode(DEROutputStream out) throws IOException {
        char[] c = this.a.toCharArray();
        byte[] b = new byte[c.length * 2];
        for (int i = 0; i != c.length; ++i) {
            b[2 * i] = (byte)(c[i] >> 8);
            b[2 * i + 1] = (byte)c[i];
        }
        out.a(30, b);
    }
}

