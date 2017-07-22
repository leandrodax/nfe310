/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERUnknownTag
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

public class DERUnknownTag
extends DERObject {
    int a;
    byte[] a;

    public DERUnknownTag(int tag, byte[] data) {
        this.a = tag;
        this.a = data;
    }

    public int getTag() {
        return this.a;
    }

    public byte[] getData() {
        return this.a;
    }

    void encode(DEROutputStream out) throws IOException {
        out.a(this.a, this.a);
    }

    public boolean equals(Object o) {
        if (!(o instanceof DERUnknownTag)) {
            return false;
        }
        DERUnknownTag other = (DERUnknownTag)o;
        if (this.a != other.a) {
            return false;
        }
        if (this.a.length != other.a.length) {
            return false;
        }
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] == other.a[i]) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        byte[] b = this.getData();
        int value = 0;
        for (int i = 0; i != b.length; ++i) {
            value ^= (b[i] & 255) << i % 4;
        }
        return value ^ this.getTag();
    }
}

