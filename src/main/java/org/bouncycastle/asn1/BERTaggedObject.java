/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.ASN1Sequence
 *  org.bouncycastle.asn1.ASN1Set
 *  org.bouncycastle.asn1.BERConstructedOctetString
 *  org.bouncycastle.asn1.BEROutputStream
 *  org.bouncycastle.asn1.BERSequence
 *  org.bouncycastle.asn1.BERTaggedObject
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERTaggedObject
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BEROutputStream;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERTaggedObject;

public class BERTaggedObject
extends DERTaggedObject {
    public BERTaggedObject(int tagNo, DEREncodable obj) {
        super(tagNo, obj);
    }

    public BERTaggedObject(boolean explicit, int tagNo, DEREncodable obj) {
        super(explicit, tagNo, obj);
    }

    public BERTaggedObject(int tagNo) {
        super(false, tagNo, (DEREncodable)new BERSequence());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void encode(DEROutputStream out) throws IOException {
        if (out instanceof ASN1OutputStream || out instanceof BEROutputStream) {
            out.write(160 | this.a);
            out.write(128);
            if (!this.a) {
                if (!this.b) {
                    if (this.a instanceof ASN1OctetString) {
                        Enumeration e;
                        if (this.a instanceof BERConstructedOctetString) {
                            e = ((BERConstructedOctetString)this.a).getObjects();
                        } else {
                            ASN1OctetString octs = (ASN1OctetString)this.a;
                            BERConstructedOctetString berO = new BERConstructedOctetString(octs.getOctets());
                            e = berO.getObjects();
                        }
                        while (e.hasMoreElements()) {
                            out.writeObject(e.nextElement());
                        }
                    } else if (this.a instanceof ASN1Sequence) {
                        Enumeration e = ((ASN1Sequence)this.a).getObjects();
                        while (e.hasMoreElements()) {
                            out.writeObject(e.nextElement());
                        }
                    } else {
                        if (!(this.a instanceof ASN1Set)) throw new RuntimeException("not implemented: " + this.a.getClass().getName());
                        Enumeration e = ((ASN1Set)this.a).getObjects();
                        while (e.hasMoreElements()) {
                            out.writeObject(e.nextElement());
                        }
                    }
                } else {
                    out.writeObject((Object)this.a);
                }
            }
            out.write(0);
            out.write(0);
            return;
        } else {
            super.encode(out);
        }
    }
}

