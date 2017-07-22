/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1InputStream
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

public abstract class ASN1Object
extends DERObject {
    public static ASN1Object fromByteArray(byte[] data) throws IOException {
        ASN1InputStream aIn = new ASN1InputStream(data);
        return (ASN1Object)aIn.readObject();
    }

    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return o instanceof DEREncodable && this.asn1Equals(((DEREncodable)o).getDERObject());
    }

    public abstract int hashCode();

    abstract void encode(DEROutputStream var1) throws IOException;

    abstract boolean asn1Equals(DERObject var1);
}

