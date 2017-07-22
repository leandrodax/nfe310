/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.ASN1OctetString
 *  org.bouncycastle.asn1.ASN1TaggedObject
 *  org.bouncycastle.asn1.DERBoolean
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Exception performing whole class analysis ignored.
 */
public class DERBoolean
extends ASN1Object {
    byte a;
    static final DERBoolean a = new DERBoolean(false);
    static final DERBoolean b = new DERBoolean(true);

    public static DERBoolean getInstance(Object obj) {
        if (obj == null || obj instanceof DERBoolean) {
            return (DERBoolean)obj;
        }
        if (obj instanceof ASN1OctetString) {
            return new DERBoolean(((ASN1OctetString)obj).getOctets());
        }
        if (obj instanceof ASN1TaggedObject) {
            return DERBoolean.getInstance((Object)((ASN1TaggedObject)obj).getObject());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public static DERBoolean getInstance(boolean value) {
        return value ? b : a;
    }

    public static DERBoolean getInstance(ASN1TaggedObject obj, boolean explicit) {
        return DERBoolean.getInstance((Object)obj.getObject());
    }

    public DERBoolean(byte[] value) {
        this.a = value[0];
    }

    public DERBoolean(boolean value) {
        this.a = value ? -1 : 0;
    }

    public boolean isTrue() {
        return this.a != 0;
    }

    void encode(DEROutputStream out) throws IOException {
        byte[] bytes = new byte[]{this.a};
        out.a(1, bytes);
    }

    protected boolean asn1Equals(DERObject o) {
        if (o == null || !(o instanceof DERBoolean)) {
            return false;
        }
        return this.a == ((DERBoolean)o).a;
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        return this.a != 0 ? "TRUE" : "FALSE";
    }

    static {
    }
}

