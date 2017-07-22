/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERSequence
 *  org.bouncycastle.asn1.DERTaggedObject
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERSequence;

public class DERTaggedObject
extends ASN1TaggedObject {
    public DERTaggedObject(int tagNo, DEREncodable obj) {
        super(tagNo, obj);
    }

    public DERTaggedObject(boolean explicit, int tagNo, DEREncodable obj) {
        super(explicit, tagNo, obj);
    }

    public DERTaggedObject(int tagNo) {
        super(false, tagNo, (DEREncodable)new DERSequence());
    }

    void encode(DEROutputStream out) throws IOException {
        if (!this.a) {
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            DEROutputStream dOut = new DEROutputStream((OutputStream)bOut);
            dOut.writeObject((Object)this.a);
            dOut.close();
            byte[] bytes = bOut.toByteArray();
            if (this.b) {
                out.a(160 | this.a, bytes);
            } else {
                bytes[0] = (bytes[0] & 32) != 0 ? (byte)(160 | this.a) : (byte)(128 | this.a);
                out.write(bytes);
            }
        } else {
            out.a(160 | this.a, new byte[0]);
        }
    }
}

