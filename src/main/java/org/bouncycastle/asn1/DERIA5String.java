/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERIA5String
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
public class DERIA5String
extends ASN1Object
implements DERString {
    String a;

    public static DERIA5String getInstance(Object obj) {
        if (obj == null || obj instanceof DERIA5String) {
            return (DERIA5String)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERIA5String(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERIA5String.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERIA5String getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERIA5String.getInstance((Object)obj.getObject());
    }

    public DERIA5String(byte[] string) {
        char[] cs = new char[string.length];
        for (int i = 0; i != cs.length; ++i) {
            cs[i] = (char)(string[i] & 255);
        }
        this.a = new String(cs);
    }

    public DERIA5String(String string) {
        this(string, false);
    }

    public DERIA5String(String string, boolean validate) {
        if (validate && !DERIA5String.isIA5String((String)string)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
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
        out.a(22, this.getOctets());
    }

    public int hashCode() {
        return this.getString().hashCode();
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERIA5String)) {
            return false;
        }
        DERIA5String s = (DERIA5String)o;
        return this.getString().equals(s.getString());
    }

    public static boolean isIA5String(String str) {
        for (int i = str.length() - 1; i >= 0; --i) {
            char ch = str.charAt(i);
            if (ch <= '') continue;
            return false;
        }
        return true;
    }
}

