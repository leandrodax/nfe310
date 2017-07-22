/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERString
 *  org.bouncycastle.asn1.DERUniversalString
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERString;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class DERUniversalString
extends ASN1Object
implements DERString {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private byte[] a;

    public static DERUniversalString getInstance(Object obj) {
        if (obj == null || obj instanceof DERUniversalString) {
            return (DERUniversalString)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERUniversalString(((ASN1OctetString)obj).getOctets());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERUniversalString getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERUniversalString.getInstance((Object)obj.getObject());
    }

    public DERUniversalString(byte[] string) {
        this.a = string;
    }

    public String getString() {
        StringBuffer buf = new StringBuffer("#");
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ASN1OutputStream aOut = new ASN1OutputStream((OutputStream)bOut);
        try {
            aOut.writeObject((Object)this);
        }
        catch (IOException e) {
            throw new RuntimeException("internal error encoding BitString");
        }
        byte[] string = bOut.toByteArray();
        for (int i = 0; i != string.length; ++i) {
            buf.append(a[string[i] >>> 4 & 15]);
            buf.append(a[string[i] & 15]);
        }
        return buf.toString();
    }

    public String toString() {
        return this.getString();
    }

    public byte[] getOctets() {
        return this.a;
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(28, this.getOctets());
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof DERUniversalString)) {
            return false;
        }
        return this.getString().equals(((DERUniversalString)o).getString());
    }

    public int hashCode() {
        return this.getString().hashCode();
    }

    static {
    }
}

