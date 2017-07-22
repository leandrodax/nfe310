/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1Encodable
 *  org.bouncycastle.asn1.DERObject
 *  org.bouncycastle.asn1.DEROutputStream
 *  org.bouncycastle.asn1.DERTags
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERTags;

public abstract class DERObject
extends ASN1Encodable
implements DERTags {
    public DERObject toASN1Object() {
        return this;
    }

    public abstract int hashCode();

    public abstract boolean equals(Object var1);

    abstract void encode(DEROutputStream var1) throws IOException;
}

