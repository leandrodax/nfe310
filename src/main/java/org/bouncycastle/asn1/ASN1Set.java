/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OutputStream
 *  org.bouncycastle.asn1.ASN1Sequence
 *  org.bouncycastle.asn1.ASN1Set
 *  org.bouncycastle.asn1.ASN1Set$1
 *  org.bouncycastle.asn1.ASN1SetParser
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERSet
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERSet;

public abstract class ASN1Set
extends ASN1Object {
    protected Vector set = new Vector();

    public static ASN1Set getInstance(Object obj) {
        if (obj == null || obj instanceof ASN1Set) {
            return (ASN1Set)obj;
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public static ASN1Set getInstance(ASN1TaggedObject obj, boolean explicit) {
        if (explicit) {
            if (!obj.isExplicit()) {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            }
            return (ASN1Set)obj.getObject();
        }
        if (obj.isExplicit()) {
            DERSet set = new DERSet((DEREncodable)obj.getObject());
            return set;
        }
        if (obj.getObject() instanceof ASN1Set) {
            return (ASN1Set)obj.getObject();
        }
        ASN1EncodableVector v = new ASN1EncodableVector();
        if (obj.getObject() instanceof ASN1Sequence) {
            ASN1Sequence s = (ASN1Sequence)obj.getObject();
            Enumeration e = s.getObjects();
            while (e.hasMoreElements()) {
                v.add((DEREncodable)e.nextElement());
            }
            return new DERSet((DEREncodableVector)v, false);
        }
        throw new IllegalArgumentException("unknown object in getInstanceFromTagged");
    }

    public Enumeration getObjects() {
        return this.set.elements();
    }

    public DEREncodable getObjectAt(int index) {
        return (DEREncodable)this.set.elementAt(index);
    }

    public int size() {
        return this.set.size();
    }

    public ASN1SetParser parser() {
        ASN1Set outer = this;
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public int hashCode() {
        Enumeration e = this.getObjects();
        int hashCode = 0;
        while (e.hasMoreElements()) {
            hashCode ^= e.nextElement().hashCode();
        }
        return hashCode;
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof ASN1Set)) {
            return false;
        }
        ASN1Set other = (ASN1Set)o;
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

    private boolean a(byte[] a, byte[] b) {
        if (a.length <= b.length) {
            for (int i = 0; i != a.length; ++i) {
                int r = b[i] & 255;
                int l = a[i] & 255;
                if (r > l) {
                    return true;
                }
                if (l <= r) continue;
                return false;
            }
            return true;
        }
        for (int i = 0; i != b.length; ++i) {
            int r = b[i] & 255;
            int l = a[i] & 255;
            if (r > l) {
                return true;
            }
            if (l <= r) continue;
            return false;
        }
        return false;
    }

    private byte[] a(DEREncodable obj) {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ASN1OutputStream aOut = new ASN1OutputStream((OutputStream)bOut);
        try {
            aOut.writeObject((Object)obj);
        }
        catch (IOException e) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
        return bOut.toByteArray();
    }

    protected void sort() {
        if (this.set.size() > 1) {
            boolean swapped = true;
            while (swapped) {
                byte[] a = this.a((DEREncodable)this.set.elementAt(0));
                swapped = false;
                for (int index = 0; index != this.set.size() - 1; ++index) {
                    byte[] b = this.a((DEREncodable)this.set.elementAt(index + 1));
                    if (this.a(a, b)) {
                        a = b;
                        continue;
                    }
                    Object o = this.set.elementAt(index);
                    this.set.setElementAt(this.set.elementAt(index + 1), index);
                    this.set.setElementAt(o, index + 1);
                    swapped = true;
                }
            }
        }
    }

    protected void addObject(DEREncodable obj) {
        this.set.addElement(obj);
    }

    abstract void encode(DEROutputStream var1) throws IOException;

    public String toString() {
        return this.set.toString();
    }
}

