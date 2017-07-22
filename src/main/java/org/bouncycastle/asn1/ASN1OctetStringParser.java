/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1OctetStringParser
 *  org.bouncycastle.asn1.DEREncodable
 */
package org.bouncycastle.asn1;

import java.io.InputStream;
import org.bouncycastle.asn1.DEREncodable;

public interface ASN1OctetStringParser
extends DEREncodable {
    public InputStream getOctetStream();
}

