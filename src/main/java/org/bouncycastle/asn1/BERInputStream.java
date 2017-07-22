/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.BERConstructedOctetString
 *  org.bouncycastle.asn1.BERConstructedSequence
 *  org.bouncycastle.asn1.BERInputStream
 *  org.bouncycastle.asn1.BERInputStream$1
 *  org.bouncycastle.asn1.BERSet
 *  org.bouncycastle.asn1.BERTaggedObject
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DERInputStream
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROctetString
 *  org.bouncycastle.asn1.DERTaggedObject
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BERConstructedSequence;
import org.bouncycastle.asn1.BERInputStream;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERInputStream;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BERInputStream
extends DERInputStream {
    private static final DERObject a = new /* Unavailable Anonymous Inner Class!! */;

    public BERInputStream(InputStream is) {
        super(is);
    }

    private byte[] a() throws IOException {
        int b;
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        int b1 = this.read();
        while ((b = this.read()) >= 0 && (b1 != 0 || b != 0)) {
            bOut.write(b1);
            b1 = b;
        }
        return bOut.toByteArray();
    }

    private BERConstructedOctetString a() throws IOException {
        DERObject o;
        Vector<DERObject> octs = new Vector<DERObject>();
        while ((o = this.readObject()) != a) {
            octs.addElement(o);
        }
        return new BERConstructedOctetString(octs);
    }

    public DERObject readObject() throws IOException {
        int tag = this.read();
        if (tag == -1) {
            throw new EOFException();
        }
        int length = this.readLength();
        if (length < 0) {
            switch (tag) {
                case 5: {
                    return null;
                }
                case 48: {
                    DERObject obj;
                    BERConstructedSequence seq = new BERConstructedSequence();
                    while ((obj = this.readObject()) != a) {
                        seq.addObject((DEREncodable)obj);
                    }
                    return seq;
                }
                case 36: {
                    return this.a();
                }
                case 49: {
                    DERObject obj;
                    ASN1EncodableVector v = new ASN1EncodableVector();
                    while ((obj = this.readObject()) != a) {
                        v.add((DEREncodable)obj);
                    }
                    return new BERSet((DEREncodableVector)v);
                }
            }
            if ((tag & 128) != 0) {
                if ((tag & 31) == 31) {
                    throw new IOException("unsupported high tag encountered");
                }
                if ((tag & 32) == 0) {
                    byte[] bytes = this.a();
                    return new BERTaggedObject(false, tag & 31, (DEREncodable)new DEROctetString(bytes));
                }
                DERObject dObj = this.readObject();
                if (dObj == a) {
                    return new DERTaggedObject(tag & 31);
                }
                DERObject next = this.readObject();
                if (next == a) {
                    return new BERTaggedObject(tag & 31, (DEREncodable)dObj);
                }
                BERConstructedSequence seq = new BERConstructedSequence();
                seq.addObject((DEREncodable)dObj);
                do {
                    seq.addObject((DEREncodable)next);
                } while ((next = this.readObject()) != a);
                return new BERTaggedObject(false, tag & 31, (DEREncodable)seq);
            }
            throw new IOException("unknown BER object encountered");
        }
        if (tag == 0 && length == 0) {
            return a;
        }
        byte[] bytes = new byte[length];
        this.readFully(bytes);
        return this.buildObject(tag, bytes);
    }
}

