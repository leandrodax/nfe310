/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Encodable
 *  org.bouncycastle.asn1.ASN1Sequence
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERSequence
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DEROutputStream;

public class DERSequence
extends ASN1Sequence {
    public DERSequence() {
    }

    public DERSequence(DEREncodable obj) {
        this.addObject(obj);
    }

    public DERSequence(DEREncodableVector v) {
        for (int i = 0; i != v.size(); ++i) {
            this.addObject(v.get(i));
        }
    }

    public DERSequence(ASN1Encodable[] a) {
        for (int i = 0; i != a.length; ++i) {
            this.addObject((DEREncodable)a[i]);
        }
    }

    void encode(DEROutputStream out) throws IOException {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        DEROutputStream dOut = new DEROutputStream((OutputStream)bOut);
        Enumeration e = this.getObjects();
        while (e.hasMoreElements()) {
            Object obj = e.nextElement();
            dOut.writeObject(obj);
        }
        dOut.close();
        byte[] bytes = bOut.toByteArray();
        out.a(48, bytes);
    }
}

