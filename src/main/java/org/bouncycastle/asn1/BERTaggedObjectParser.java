/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.ASN1ObjectParser
 *  org.bouncycastle.asn1.ASN1OctetStringParser
 *  org.bouncycastle.asn1.ASN1SequenceParser
 *  org.bouncycastle.asn1.ASN1SetParser
 *  org.bouncycastle.asn1.ASN1StreamParser
 *  org.bouncycastle.asn1.ASN1TaggedObjectParser
 *  org.bouncycastle.asn1.BEROctetStringParser
 *  org.bouncycastle.asn1.BERSequence
 *  org.bouncycastle.asn1.BERSequenceParser
 *  org.bouncycastle.asn1.BERSetParser
 *  org.bouncycastle.asn1.BERTaggedObject
 *  org.bouncycastle.asn1.BERTaggedObjectParser
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROctetString
 *  org.bouncycastle.asn1.DERSequence
 *  org.bouncycastle.asn1.DERSet
 *  org.bouncycastle.asn1.DERTaggedObject
 *  org.bouncycastle.asn1.DefiniteLengthInputStream
 *  org.bouncycastle.asn1.IndefiniteLengthInputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectParser;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.BEROctetStringParser;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERSequenceParser;
import org.bouncycastle.asn1.BERSetParser;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DefiniteLengthInputStream;
import org.bouncycastle.asn1.IndefiniteLengthInputStream;

public class BERTaggedObjectParser
implements ASN1TaggedObjectParser {
    private int a;
    private int b;
    private InputStream a;
    private boolean a;

    protected BERTaggedObjectParser(int baseTag, int tagNumber, InputStream contentStream) {
        this.a = baseTag;
        this.b = tagNumber;
        this.a = contentStream;
        this.a = contentStream instanceof IndefiniteLengthInputStream;
    }

    public boolean isConstructed() {
        return (this.a & 32) != 0;
    }

    public int getTagNo() {
        return this.b;
    }

    public DEREncodable getObjectParser(int tag, boolean isExplicit) throws IOException {
        if (isExplicit) {
            return new ASN1StreamParser(this.a).readObject();
        }
        switch (tag) {
            case 17: {
                if (this.a) {
                    return new BERSetParser(new ASN1ObjectParser(this.a, this.b, this.a));
                }
                return new DERSet((DEREncodableVector)this.a(this.a)).parser();
            }
            case 16: {
                if (this.a) {
                    return new BERSequenceParser(new ASN1ObjectParser(this.a, this.b, this.a));
                }
                return new DERSequence((DEREncodableVector)this.a(this.a)).parser();
            }
            case 4: {
                if (this.a || this.isConstructed()) {
                    return new BEROctetStringParser(new ASN1ObjectParser(this.a, this.b, this.a));
                }
                return new DEROctetString(((DefiniteLengthInputStream)this.a).a()).parser();
            }
        }
        throw new RuntimeException("implicit tagging not implemented");
    }

    private ASN1EncodableVector a(InputStream in) throws IOException {
        ASN1StreamParser aIn = new ASN1StreamParser(in);
        ASN1EncodableVector v = new ASN1EncodableVector();
        DEREncodable obj = aIn.readObject();
        while (obj != null) {
            v.add((DEREncodable)obj.getDERObject());
            obj = aIn.readObject();
        }
        return v;
    }

    private ASN1EncodableVector b(InputStream in) {
        try {
            return this.a(in);
        }
        catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public DERObject getDERObject() {
        if (this.a) {
            ASN1EncodableVector v = this.b(this.a);
            if (v.size() > 1) {
                return new BERTaggedObject(false, this.b, (DEREncodable)new BERSequence((DEREncodableVector)v));
            }
            if (v.size() == 1) {
                return new BERTaggedObject(true, this.b, v.get(0));
            }
            return new BERTaggedObject(false, this.b, (DEREncodable)new BERSequence());
        }
        if (this.isConstructed()) {
            ASN1EncodableVector v = this.b(this.a);
            if (v.size() == 1) {
                return new DERTaggedObject(true, this.b, v.get(0));
            }
            return new DERTaggedObject(false, this.b, (DEREncodable)new DERSequence((DEREncodableVector)v));
        }
        try {
            return new DERTaggedObject(false, this.b, (DEREncodable)new DEROctetString(((DefiniteLengthInputStream)this.a).a()));
        }
        catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}

