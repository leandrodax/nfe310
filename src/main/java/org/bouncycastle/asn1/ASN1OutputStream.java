/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

public class ASN1OutputStream
extends DEROutputStream {
    public ASN1OutputStream(OutputStream os) {
        super(os);
    }

    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            this.writeNull();
        } else if (obj instanceof DERObject) {
            ((DERObject)obj).encode((DEROutputStream)this);
        } else if (obj instanceof DEREncodable) {
            ((DEREncodable)obj).getDERObject().encode((DEROutputStream)this);
        } else {
            throw new IOException("object not ASN1Encodable");
        }
    }
}

