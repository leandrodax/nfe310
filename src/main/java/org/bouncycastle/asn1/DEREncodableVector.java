/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 */
package org.bouncycastle.asn1;

import java.util.Vector;
import org.bouncycastle.asn1.DEREncodable;

public class DEREncodableVector {
    private Vector a = new Vector();

    public void add(DEREncodable obj) {
        this.a.addElement(obj);
    }

    public DEREncodable get(int i) {
        return (DEREncodable)this.a.elementAt(i);
    }

    public int size() {
        return this.a.size();
    }
}

