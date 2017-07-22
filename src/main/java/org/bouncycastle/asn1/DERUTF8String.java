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
 *  org.bouncycastle.asn1.DERUTF8String
 *  org.bouncycastle.util.Strings
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERString;
import org.bouncycastle.util.Strings;

/*
 * Exception performing whole class analysis ignored.
 */
public class DERUTF8String
extends ASN1Object
implements DERString {
    String a;

    public static DERUTF8String getInstance(Object obj) {
        if (obj == null || obj instanceof DERUTF8String) {
            return (DERUTF8String)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERUTF8String(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERUTF8String.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERUTF8String getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERUTF8String.getInstance((Object)obj.getObject());
    }

    DERUTF8String(byte[] string) {
        this.a = Strings.fromUTF8ByteArray((byte[])string);
    }

    public DERUTF8String(String string) {
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

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERUTF8String)) {
            return false;
        }
        DERUTF8String s = (DERUTF8String)o;
        return this.getString().equals(s.getString());
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(12, Strings.toUTF8ByteArray((String)this.a));
    }
}

