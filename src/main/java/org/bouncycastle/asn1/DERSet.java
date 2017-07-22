/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Encodable
 *  org.bouncycastle.asn1.ASN1Set
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERSet
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DEROutputStream;

public class DERSet
extends ASN1Set {
    public DERSet() {
    }

    public DERSet(DEREncodable obj) {
        this.addObject(obj);
    }

    public DERSet(DEREncodableVector v) {
        this(v, true);
    }

    public DERSet(ASN1Encodable[] a) {
        for (int i = 0; i != a.length; ++i) {
            this.addObject((DEREncodable)a[i]);
        }
        this.sort();
    }

    DERSet(DEREncodableVector v, boolean needsSorting) {
        for (int i = 0; i != v.size(); ++i) {
            this.addObject(v.get(i));
        }
        if (needsSorting) {
            this.sort();
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
        out.a(49, bytes);
    }
}

