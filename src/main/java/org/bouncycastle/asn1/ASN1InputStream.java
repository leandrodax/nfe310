/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.ASN1InputStream
 *  org.bouncycastle.asn1.ASN1InputStream$1
 *  org.bouncycastle.asn1.BERConstructedOctetString
 *  org.bouncycastle.asn1.BERNull
 *  org.bouncycastle.asn1.BERSequence
 *  org.bouncycastle.asn1.BERSet
 *  org.bouncycastle.asn1.BERTaggedObject
 *  org.bouncycastle.asn1.DERApplicationSpecific
 *  org.bouncycastle.asn1.DERBMPString
 *  org.bouncycastle.asn1.DERBitString
 *  org.bouncycastle.asn1.DERBoolean
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DEREnumerated
 *  org.bouncycastle.asn1.DERGeneralString
 *  org.bouncycastle.asn1.DERGeneralizedTime
 *  org.bouncycastle.asn1.DERIA5String
 *  org.bouncycastle.asn1.DERInteger
 *  org.bouncycastle.asn1.DERNull
 *  org.bouncycastle.asn1.DERNumericString
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DERObjectIdentifier
 *  org.bouncycastle.asn1.DEROctetString
 *  org.bouncycastle.asn1.DERPrintableString
 *  org.bouncycastle.asn1.DERSequence
 *  org.bouncycastle.asn1.DERSet
 *  org.bouncycastle.asn1.DERT61String
 *  org.bouncycastle.asn1.DERTaggedObject
 *  org.bouncycastle.asn1.DERTags
 *  org.bouncycastle.asn1.DERUTCTime
 *  org.bouncycastle.asn1.DERUTF8String
 *  org.bouncycastle.asn1.DERUniversalString
 *  org.bouncycastle.asn1.DERUnknownTag
 *  org.bouncycastle.asn1.DERVisibleString
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.BERNull;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERGeneralString;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERNumericString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERTags;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.DERUnknownTag;
import org.bouncycastle.asn1.DERVisibleString;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ASN1InputStream
extends FilterInputStream
implements DERTags {
    private static final DERObject a = new /* Unavailable Anonymous Inner Class!! */;
    boolean a;
    int a = Integer.MAX_VALUE;

    public ASN1InputStream(InputStream is) {
        super(is);
    }

    public ASN1InputStream(byte[] input) {
        this((InputStream)new ByteArrayInputStream(input), input.length);
    }

    public ASN1InputStream(InputStream input, int limit) {
        super(input);
        this.a = limit;
    }

    protected int readLength() throws IOException {
        int length = this.read();
        if (length < 0) {
            throw new IOException("EOF found when length expected");
        }
        if (length == 128) {
            return -1;
        }
        if (length > 127) {
            int size = length & 127;
            if (size > 4) {
                throw new IOException("DER length more than 4 bytes");
            }
            length = 0;
            for (int i = 0; i < size; ++i) {
                int next = this.read();
                if (next < 0) {
                    throw new IOException("EOF found reading length");
                }
                length = (length << 8) + next;
            }
            if (length < 0) {
                throw new IOException("corrupted steam - negative length found");
            }
            if (length >= this.a) {
                throw new IOException("corrupted steam - out of bounds length found");
            }
        }
        return length;
    }

    protected void readFully(byte[] bytes) throws IOException {
        int len;
        int left = bytes.length;
        if (left == 0) {
            return;
        }
        while ((len = this.read(bytes, bytes.length - left, left)) > 0) {
            if ((left -= len) != 0) continue;
            return;
        }
        if (left != 0) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    protected DERObject buildObject(int tag, int tagNo, byte[] bytes) throws IOException {
        if ((tag & 64) != 0) {
            return new DERApplicationSpecific(tagNo, bytes);
        }
        switch (tag) {
            case 5: {
                return new DERNull();
            }
            case 48: {
                ASN1InputStream aIn = new ASN1InputStream(bytes);
                ASN1EncodableVector v = new ASN1EncodableVector();
                DERObject obj = aIn.readObject();
                while (obj != null) {
                    v.add((DEREncodable)obj);
                    obj = aIn.readObject();
                }
                return new DERSequence((DEREncodableVector)v);
            }
            case 49: {
                ASN1InputStream aIn = new ASN1InputStream(bytes);
                ASN1EncodableVector v = new ASN1EncodableVector();
                DERObject obj = aIn.readObject();
                while (obj != null) {
                    v.add((DEREncodable)obj);
                    obj = aIn.readObject();
                }
                return new DERSet((DEREncodableVector)v, false);
            }
            case 1: {
                return new DERBoolean(bytes);
            }
            case 2: {
                return new DERInteger(bytes);
            }
            case 10: {
                return new DEREnumerated(bytes);
            }
            case 6: {
                return new DERObjectIdentifier(bytes);
            }
            case 3: {
                byte padBits = bytes[0];
                byte[] data = new byte[bytes.length - 1];
                System.arraycopy(bytes, 1, data, 0, bytes.length - 1);
                return new DERBitString(data, (int)padBits);
            }
            case 18: {
                return new DERNumericString(bytes);
            }
            case 12: {
                return new DERUTF8String(bytes);
            }
            case 19: {
                return new DERPrintableString(bytes);
            }
            case 22: {
                return new DERIA5String(bytes);
            }
            case 20: {
                return new DERT61String(bytes);
            }
            case 26: {
                return new DERVisibleString(bytes);
            }
            case 27: {
                return new DERGeneralString(bytes);
            }
            case 28: {
                return new DERUniversalString(bytes);
            }
            case 30: {
                return new DERBMPString(bytes);
            }
            case 4: {
                return new DEROctetString(bytes);
            }
            case 36: {
                return this.a(bytes);
            }
            case 23: {
                return new DERUTCTime(bytes);
            }
            case 24: {
                return new DERGeneralizedTime(bytes);
            }
        }
        if ((tag & 128) != 0) {
            if (bytes.length == 0) {
                if ((tag & 32) == 0) {
                    return new DERTaggedObject(false, tagNo, (DEREncodable)new DERNull());
                }
                return new DERTaggedObject(false, tagNo, (DEREncodable)new DERSequence());
            }
            if ((tag & 32) == 0) {
                return new DERTaggedObject(false, tagNo, (DEREncodable)new DEROctetString(bytes));
            }
            ASN1InputStream aIn = new ASN1InputStream(bytes);
            DERObject dObj = aIn.readObject();
            if (aIn.available() == 0) {
                return new DERTaggedObject(tagNo, (DEREncodable)dObj);
            }
            ASN1EncodableVector v = new ASN1EncodableVector();
            while (dObj != null) {
                v.add((DEREncodable)dObj);
                dObj = aIn.readObject();
            }
            return new DERTaggedObject(false, tagNo, (DEREncodable)new DERSequence((DEREncodableVector)v));
        }
        return new DERUnknownTag(tag, bytes);
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

    private BERConstructedOctetString a(byte[] input) throws IOException {
        DERObject o;
        Vector<DERObject> octs = new Vector<DERObject>();
        ASN1InputStream aIn = new ASN1InputStream(input);
        while ((o = aIn.readObject()) != null) {
            octs.addElement(o);
        }
        return new BERConstructedOctetString(octs);
    }

    public DERObject readObject() throws IOException {
        int length;
        int tag = this.read();
        if (tag == -1) {
            if (this.a) {
                throw new EOFException("attempt to read past end of file.");
            }
            this.a = true;
            return null;
        }
        int tagNo = 0;
        if ((tag & 128) != 0 || (tag & 64) != 0) {
            tagNo = this.a(tag);
        }
        if ((length = this.readLength()) < 0) {
            switch (tag) {
                case 5: {
                    return new BERNull();
                }
                case 48: {
                    DERObject obj;
                    ASN1EncodableVector v = new ASN1EncodableVector();
                    while ((obj = this.readObject()) != a) {
                        v.add((DEREncodable)obj);
                    }
                    return new BERSequence((DEREncodableVector)v);
                }
                case 49: {
                    DERObject obj;
                    ASN1EncodableVector v = new ASN1EncodableVector();
                    while ((obj = this.readObject()) != a) {
                        v.add((DEREncodable)obj);
                    }
                    return new BERSet((DEREncodableVector)v, false);
                }
                case 36: {
                    return this.a();
                }
            }
            if ((tag & 128) != 0) {
                if ((tag & 32) == 0) {
                    byte[] bytes = this.a();
                    return new BERTaggedObject(false, tagNo, (DEREncodable)new DEROctetString(bytes));
                }
                DERObject dObj = this.readObject();
                if (dObj == a) {
                    return new DERTaggedObject(tagNo);
                }
                DERObject next = this.readObject();
                if (next == a) {
                    return new BERTaggedObject(tagNo, (DEREncodable)dObj);
                }
                ASN1EncodableVector v = new ASN1EncodableVector();
                v.add((DEREncodable)dObj);
                do {
                    v.add((DEREncodable)next);
                } while ((next = this.readObject()) != a);
                return new BERTaggedObject(false, tagNo, (DEREncodable)new BERSequence((DEREncodableVector)v));
            }
            throw new IOException("unknown BER object encountered");
        }
        if (tag == 0 && length == 0) {
            return a;
        }
        byte[] bytes = new byte[length];
        this.readFully(bytes);
        return this.buildObject(tag, tagNo, bytes);
    }

    private int a(int tag) throws IOException {
        int tagNo = tag & 31;
        if (tagNo == 31) {
            int b = this.read();
            tagNo = 0;
            while (b >= 0 && (b & 128) != 0) {
                tagNo |= b & 127;
                tagNo <<= 7;
                b = this.read();
            }
            if (b < 0) {
                this.a = true;
                throw new EOFException("EOF found inside tag value.");
            }
            tagNo |= b & 127;
        }
        return tagNo;
    }
}

