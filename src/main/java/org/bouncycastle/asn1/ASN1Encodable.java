/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Encodable
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

public abstract class ASN1Encodable
implements DEREncodable {
    private static final String a = "DER";
    private static final String b = "BER";

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ASN1OutputStream aOut = new ASN1OutputStream((OutputStream)bOut);
        aOut.writeObject((Object)this);
        return bOut.toByteArray();
    }

    public byte[] getEncoded(String encoding) throws IOException {
        if (encoding.equals("DER")) {
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            DEROutputStream dOut = new DEROutputStream((OutputStream)bOut);
            dOut.writeObject((Object)this);
            return bOut.toByteArray();
        }
        return this.getEncoded();
    }

    public byte[] getDEREncoded() {
        try {
            return this.getEncoded("DER");
        }
        catch (IOException e) {
            return null;
        }
    }

    public int hashCode() {
        return this.toASN1Object().hashCode();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DEREncodable)) {
            return false;
        }
        DEREncodable other = (DEREncodable)o;
        return this.toASN1Object().equals((Object)other.getDERObject());
    }

    public DERObject getDERObject() {
        return this.toASN1Object();
    }

    public abstract DERObject toASN1Object();
}

