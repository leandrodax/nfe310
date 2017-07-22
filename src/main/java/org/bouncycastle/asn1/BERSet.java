/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.BEROutputStream
 *  org.bouncycastle.asn1.BERSet
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERSet
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERSet;

public class BERSet
extends DERSet {
    public BERSet() {
    }

    public BERSet(DEREncodable obj) {
        super(obj);
    }

    public BERSet(DEREncodableVector v) {
        super(v, false);
    }

    BERSet(DEREncodableVector v, boolean needsSorting) {
        super(v, needsSorting);
    }

    void encode(DEROutputStream out) throws IOException {
        if (out instanceof ASN1OutputStream || out instanceof BEROutputStream) {
            out.write(49);
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

