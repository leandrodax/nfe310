/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Null
 *  org.bouncycastle.asn1.ASN1Object
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROutputStream;

public abstract class ASN1Null
extends ASN1Object {
    public int hashCode() {
        return 0;
    }

    boolean asn1Equals(DERObject o) {
        if (!(o instanceof ASN1Null)) {
            return false;
        }
        return true;
    }

    abstract void encode(DEROutputStream var1) throws IOException;

    public String toString() {
        return "NULL";
    }
}

