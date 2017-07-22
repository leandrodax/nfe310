/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Choice
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1OctetStringParser
 *  org.bouncycastle.asn1.ASN1Sequence
 *  org.bouncycastle.asn1.ASN1SequenceParser
 *  org.bouncycastle.asn1.ASN1Set
 *  org.bouncycastle.asn1.ASN1SetParser
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.ASN1TaggedObjectParser
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObjectParser;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

public abstract class ASN1TaggedObject
extends ASN1Object
implements ASN1TaggedObjectParser {
    int a;
    boolean a;
    boolean b = true;
    DEREncodable a = null;

    public static ASN1TaggedObject getInstance(ASN1TaggedObject obj, boolean explicit) {
        if (explicit) {
            return (ASN1TaggedObject)obj.getObject();
        }
        throw new IllegalArgumentException("implicitly tagged tagged object");
    }

    public static ASN1TaggedObject getInstance(Object obj) {
        if (obj == null || obj instanceof ASN1TaggedObject) {
            return (ASN1TaggedObject)obj;
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public ASN1TaggedObject(int tagNo, DEREncodable obj) {
        this.b = true;
        this.a = tagNo;
        this.a = obj;
    }

    public ASN1TaggedObject(boolean explicit, int tagNo, DEREncodable obj) {
        this.b = obj instanceof ASN1Choice ? true : explicit;
        this.a = tagNo;
        this.a = obj;
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof ASN1TaggedObject)) {
            return false;
        }
        ASN1TaggedObject other = (ASN1TaggedObject)o;
        if (this.a != other.a || this.a != other.a || this.b != other.b) {
            return false;
        }
        if (this.a == null ? other.a != null : !this.a.getDERObject().equals((Object)other.a.getDERObject())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int code = this.a;
        if (this.a != null) {
            code ^= this.a.hashCode();
        }
        return code;
    }

    public int getTagNo() {
        return this.a;
    }

    public boolean isExplicit() {
        return this.b;
    }

    public boolean isEmpty() {
        return this.a;
    }

    public DERObject getObject() {
        if (this.a != null) {
            return this.a.getDERObject();
        }
        return null;
    }

    public DEREncodable getObjectParser(int tag, boolean isExplicit) {
        switch (tag) {
            case 17: {
                return ASN1Set.getInstance((ASN1TaggedObject)this, (boolean)isExplicit).parser();
            }
            case 16: {
                return ASN1Sequence.getInstance((ASN1TaggedObject)this, (boolean)isExplicit).parser();
            }
            case 4: {
                return ASN1OctetString.getInstance((ASN1TaggedObject)this, (boolean)isExplicit).parser();
            }
        }
        if (isExplicit) {
            return this.getObject();
        }
        throw new RuntimeException("implicit tagging not implemented for tag: " + tag);
    }

    abstract void encode(DEROutputStream var1) throws IOException;

    public String toString() {
        return "[" + this.a + "]" + (Object)this.a;
    }
}

