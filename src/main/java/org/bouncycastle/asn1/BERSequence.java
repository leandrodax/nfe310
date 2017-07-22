/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.BEROutputStream
 *  org.bouncycastle.asn1.BERSequence
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERSequence
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERSequence;

public class BERSequence
extends DERSequence {
    public BERSequence() {
    }

    public BERSequence(DEREncodable obj) {
        super(obj);
    }

    public BERSequence(DEREncodableVector v) {
        super(v);
    }

    void encode(DEROutputStream out) throws IOException {
        if (out instanceof ASN1OutputStream || out instanceof BEROutputStream) {
            out.write(48);
            out.write(128);
            Enumeration e = this.getObjects();
            while (e.hasMoreElements()) {
                out.writeObject(e.nextElement());
            }
            out.write(0);
            out.write(0);
        } else {
            super.encode(out);
        }
    }
}

