/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.BERInputStream
 *  org.bouncycastle.asn1.DERBMPString
 *  org.bouncycastle.asn1.DERBitString
 *  org.bouncycastle.asn1.DERBoolean
 *  org.bouncycastle.asn1.DERConstructedSequence
 *  org.bouncycastle.asn1.DERConstructedSet
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DEREnumerated
 *  org.bouncycastle.asn1.DERGeneralString
 *  org.bouncycastle.asn1.DERGeneralizedTime
 *  org.bouncycastle.asn1.DERIA5String
 *  org.bouncycastle.asn1.DERInputStream
 *  org.bouncycastle.asn1.DERInteger
 *  org.bouncycastle.asn1.DERNull
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DERObjectIdentifier
 *  org.bouncycastle.asn1.DEROctetString
 *  org.bouncycastle.asn1.DERPrintableString
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
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.BERInputStream;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERConstructedSequence;
import org.bouncycastle.asn1.DERConstructedSet;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DEREnumerated;
import org.bouncycastle.asn1.DERGeneralString;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERT61String;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DERTags;
import org.bouncycastle.asn1.DERUTCTime;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.DERUniversalString;
import org.bouncycastle.asn1.DERUnknownTag;
import org.bouncycastle.asn1.DERVisibleString;

public class DERInputStream
extends FilterInputStream
implements DERTags {
    public DERInputStream(InputStream is) {
        super(is);
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
        }
        return length;
    }

    protected void readFully(byte[] bytes) throws IOException {
        int left = bytes.length;
        if (left == 0) {
            return;
        }
        while (left > 0) {
            int l = this.read(bytes, bytes.length - left, left);
            if (l < 0) {
                throw new EOFException("unexpected end of stream");
            }
            left -= l;
        }
    }

    protected DERObject buildObject(int tag, byte[] bytes) throws IOException {
        switch (tag) {
            case 5: {
                return null;
            }
            case 48: {
                ByteArrayInputStream bIn = new ByteArrayInputStream(bytes);
                BERInputStream dIn = new BERInputStream((InputStream)bIn);
                DERConstructedSequence seq = new DERConstructedSequence();
                try {
                    do {
                        DERObject obj = dIn.readObject();
                        seq.addObject((DEREncodable)obj);
                    } while (true);
                }
                catch (EOFException ex) {
                    return seq;
                }
            }
            case 49: {
                ByteArrayInputStream bIn = new ByteArrayInputStream(bytes);
                BERInputStream dIn = new BERInputStream((InputStream)bIn);
                ASN1EncodableVector v = new ASN1EncodableVector();
                try {
                    do {
                        DERObject obj = dIn.readObject();
                        v.add((DEREncodable)obj);
                    } while (true);
                }
                catch (EOFException ex) {
                    return new DERConstructedSet((DEREncodableVector)v);
                }
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
            case 28: {
                return new DERUniversalString(bytes);
            }
            case 27: {
                return new DERGeneralString(bytes);
            }
            case 30: {
                return new DERBMPString(bytes);
            }
            case 4: {
                return new DEROctetString(bytes);
            }
            case 23: {
                return new DERUTCTime(bytes);
            }
            case 24: {
                return new DERGeneralizedTime(bytes);
            }
        }
        if ((tag & 128) != 0) {
            if ((tag & 31) == 31) {
                throw new IOException("unsupported high tag encountered");
            }
            if (bytes.length == 0) {
                if ((tag & 32) == 0) {
                    return new DERTaggedObject(false, tag & 31, (DEREncodable)new DERNull());
                }
                return new DERTaggedObject(false, tag & 31, (DEREncodable)new DERConstructedSequence());
            }
            if ((tag & 32) == 0) {
                return new DERTaggedObject(false, tag & 31, (DEREncodable)new DEROctetString(bytes));
            }
            ByteArrayInputStream bIn = new ByteArrayInputStream(bytes);
            BERInputStream dIn = new BERInputStream((InputStream)bIn);
            DERObject dObj = dIn.readObject();
            if (dIn.available() == 0) {
                return new DERTaggedObject(tag & 31, (DEREncodable)dObj);
            }
            DERConstructedSequence seq = new DERConstructedSequence();
            seq.addObject((DEREncodable)dObj);
            try {
                do {
                    dObj = dIn.readObject();
                    seq.addObject((DEREncodable)dObj);
                } while (true);
            }
            catch (EOFException eOFException) {
                return new DERTaggedObject(false, tag & 31, (DEREncodable)seq);
            }
        }
        return new DERUnknownTag(tag, bytes);
    }

    public DERObject readObject() throws IOException {
        int tag = this.read();
        if (tag == -1) {
            throw new EOFException();
        }
        int length = this.readLength();
        byte[] bytes = new byte[length];
        this.readFully(bytes);
        return this.buildObject(tag, bytes);
    }
}

