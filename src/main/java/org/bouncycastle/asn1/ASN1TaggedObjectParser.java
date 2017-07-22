/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1TaggedObjectParser
 *  org.bouncycastle.asn1.DEREncodable
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.DEREncodable;

public interface ASN1TaggedObjectParser
extends DEREncodable {
    public int getTagNo();

    public DEREncodable getObjectParser(int var1, boolean var2) throws IOException;
}

