/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1Sequence
 *  org.bouncycastle.asn1.ASN1Sequence$1
 *  org.bouncycastle.asn1.ASN1SequenceParser
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.BERSequence
 *  org.bouncycastle.asn1.BERTaggedObject
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERSequence
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERSequence;

public abstract class ASN1Sequence
extends ASN1Object {
    private Vector a = new Vector();

    public static ASN1Sequence getInstance(Object obj) {
        if (obj == null || obj instanceof ASN1Sequence) {
            return (ASN1Sequence)obj;
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public static ASN1Sequence getInstance(ASN1TaggedObject obj, boolean explicit) {
        if (explicit) {
            if (!obj.isExplicit()) {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            }
            return (ASN1Sequence)obj.getObject();
        }
        if (obj.isExplicit()) {
            if (obj instanceof BERTaggedObject) {
                return new BERSequence((DEREncodable)obj.getObject());
            }
            return new DERSequence((DEREncodable)obj.getObject());
        }
        if (obj.getObject() instanceof ASN1Sequence) {
            return (ASN1Sequence)obj.getObject();
        }
        throw new IllegalArgumentException("unknown object in getInstanceFromTagged");
    }

    public Enumeration getObjects() {
        return this.a.elements();
    }

    public ASN1SequenceParser parser() {
        ASN1Sequence outer = this;
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public DEREncodable getObjectAt(int index) {
        return (DEREncodable)this.a.elementAt(index);
    }

    public int size() {
        return this.a.size();
    }

    public int hashCode() {
        Enumeration e = this.getObjects();
        int hashCode = 0;
        while (e.hasMoreElements()) {
            Object o = e.nextElement();
            if (o == null) continue;
            hashCode ^= o.hashCode();
        }
        return hashCode;
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof ASN1Sequence)) {
            return false;
        }
        ASN1Sequence other = (ASN1Sequence)o;
        if (this.size() != other.size()) {
            return false;
        }
        Enumeration s1 = this.getObjects();
        Enumeration s2 = other.getObjects();
        while (s1.hasMoreElements()) {
            DERObject o2;
            DERObject o1 = ((DEREncodable)s1.nextElement()).getDERObject();
            if (o1 == (o2 = ((DEREncodable)s2.nextElement()).getDERObject()) || o1 != null && o1.equals((Object)o2)) continue;
            return false;
        }
        return true;
    }

    protected void addObject(DEREncodable obj) {
        this.a.addElement(obj);
    }

    abstract void encode(DEROutputStream var1) throws IOException;

    public String toString() {
        return this.a.toString();
    }
}

