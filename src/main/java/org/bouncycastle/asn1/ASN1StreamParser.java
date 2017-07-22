/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.ASN1InputStream
 *  org.bouncycastle.asn1.ASN1ObjectParser
 *  org.bouncycastle.asn1.ASN1SequenceParser
 *  org.bouncycastle.asn1.ASN1SetParser
 *  org.bouncycastle.asn1.ASN1StreamParser
 *  org.bouncycastle.asn1.BERNull
 *  org.bouncycastle.asn1.BEROctetStringParser
 *  org.bouncycastle.asn1.BERSequenceParser
 *  org.bouncycastle.asn1.BERSetParser
 *  org.bouncycastle.asn1.BERTaggedObjectParser
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DERInteger
 *  org.bouncycastle.asn1.DERNull
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DERObjectIdentifier
 *  org.bouncycastle.asn1.DEROctetString
 *  org.bouncycastle.asn1.DERSequence
 *  org.bouncycastle.asn1.DERSet
 *  org.bouncycastle.asn1.DefiniteLengthInputStream
 *  org.bouncycastle.asn1.IndefiniteLengthInputStream
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.BERNull;
import org.bouncycastle.asn1.BEROctetStringParser;
import org.bouncycastle.asn1.BERSequenceParser;
import org.bouncycastle.asn1.BERSetParser;
import org.bouncycastle.asn1.BERTaggedObjectParser;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DefiniteLengthInputStream;
import org.bouncycastle.asn1.IndefiniteLengthInputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ASN1StreamParser {
    InputStream a;
    private int a;
    private boolean a;

    public ASN1StreamParser(InputStream in) {
        this(in, Integer.MAX_VALUE);
    }

    public ASN1StreamParser(InputStream in, int limit) {
        this.a = in;
        this.a = limit;
    }

    public ASN1StreamParser(byte[] encoding) {
        this((InputStream)new ByteArrayInputStream(encoding), encoding.length);
    }

    InputStream a() {
        return this.a;
    }

    private int a() throws IOException {
        int length = this.a.read();
        if (length < 0) {
            throw new EOFException("EOF found when length expected");
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
                int next = this.a.read();
                if (next < 0) {
                    throw new EOFException("EOF found reading length");
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

    public DEREncodable readObject() throws IOException {
        int length;
        int baseTagNo;
        int tag = this.a.read();
        if (tag == -1) {
            if (this.a) {
                throw new EOFException("attempt to read past end of file.");
            }
            this.a = true;
            return null;
        }
        if (this.a instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream)this.a).a(false);
        }
        int tagNo = baseTagNo = tag & -33;
        if ((tag & 128) != 0 && (tagNo = tag & 31) == 31) {
            tagNo = 0;
            int b = this.a.read();
            while (b >= 0 && (b & 128) != 0) {
                tagNo |= b & 127;
                tagNo <<= 7;
                b = this.a.read();
            }
            if (b < 0) {
                this.a = true;
                throw new EOFException("EOF encountered inside tag value.");
            }
            tagNo |= b & 127;
        }
        if ((length = this.a()) < 0) {
            IndefiniteLengthInputStream indIn = new IndefiniteLengthInputStream(this.a);
            if (baseTagNo == 5) {
                return BERNull.a;
            }
            switch (baseTagNo) {
                case 4: {
                    return new BEROctetStringParser(new ASN1ObjectParser(tag, tagNo, (InputStream)indIn));
                }
                case 16: {
                    return new BERSequenceParser(new ASN1ObjectParser(tag, tagNo, (InputStream)indIn));
                }
                case 17: {
                    return new BERSetParser(new ASN1ObjectParser(tag, tagNo, (InputStream)indIn));
                }
            }
            return new BERTaggedObjectParser(tag, tagNo, (InputStream)indIn);
        }
        DefiniteLengthInputStream defIn = new DefiniteLengthInputStream(this.a, length);
        switch (baseTagNo) {
            case 2: {
                return new DERInteger(defIn.a());
            }
            case 5: {
                return DERNull.a;
            }
            case 6: {
                return new DERObjectIdentifier(defIn.a());
            }
            case 4: {
                return new DEROctetString(defIn.a());
            }
            case 16: {
                return new DERSequence((DEREncodableVector)this.a(defIn.a())).parser();
            }
            case 17: {
                return new DERSet((DEREncodableVector)this.a(defIn.a())).parser();
            }
        }
        return new BERTaggedObjectParser(tag, tagNo, (InputStream)defIn);
    }

    private ASN1EncodableVector a(byte[] bytes) throws IOException {
        ASN1InputStream aIn = new ASN1InputStream(bytes);
        ASN1EncodableVector v = new ASN1EncodableVector();
        DERObject obj = aIn.readObject();
        while (obj != null) {
            v.add((DEREncodable)obj);
            obj = aIn.readObject();
        }
        return v;
    }
}

