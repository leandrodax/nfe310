/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1SequenceParser
 *  org.bouncycastle.asn1.DEREncodable
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.DEREncodable;

public interface ASN1SequenceParser
extends DEREncodable {
    public DEREncodable readObject() throws IOException;
}

