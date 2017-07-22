/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERNumericString
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
public class DERNumericString
extends ASN1Object
implements DERString {
    String a;

    public static DERNumericString getInstance(Object obj) {
        if (obj == null || obj instanceof DERNumericString) {
            return (DERNumericString)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERNumericString(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERNumericString.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERNumericString getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERNumericString.getInstance((Object)obj.getObject());
    }

    public DERNumericString(byte[] string) {
        char[] cs = new char[string.length];
        for (int i = 0; i != cs.length; ++i) {
            cs[i] = (char)(string[i] & 255);
        }
        this.a = new String(cs);
    }

    public DERNumericString(String string) {
        this(string, false);
    }

    public DERNumericString(String string, boolean validate) {
        if (validate && !DERNumericString.isNumericString((String)string)) {
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
        out.a(18, this.getOctets());
    }

    public int hashCode() {
        return this.getString().hashCode();
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERNumericString)) {
            return false;
        }
        DERNumericString s = (DERNumericString)o;
        return this.getString().equals(s.getString());
    }

    public static boolean isNumericString(String str) {
        for (int i = str.length() - 1; i >= 0; --i) {
            char ch = str.charAt(i);
            if (ch > '') {
                return false;
            }
            if ('0' <= ch && ch <= '9' || ch == ' ') continue;
            return false;
        }
        return true;
    }
}

