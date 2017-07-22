/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Set
 *  org.bouncycastle.asn1.DERConstructedSet
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DEROutputStream;

public class DERConstructedSet
extends ASN1Set {
    public DERConstructedSet() {
    }

    public DERConstructedSet(DEREncodable obj) {
        this.addObject(obj);
    }

    public DERConstructedSet(DEREncodableVector v) {
        for (int i = 0; i != v.size(); ++i) {
            this.addObject(v.get(i));
        }
    }

    public void addObject(DEREncodable obj) {
        super.addObject(obj);
    }

    public int getSize() {
        return this.size();
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

