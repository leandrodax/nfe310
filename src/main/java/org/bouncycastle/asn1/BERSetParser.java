/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.ASN1ObjectParser
 *  org.bouncycastle.asn1.ASN1SetParser
 *  org.bouncycastle.asn1.BERSet
 *  org.bouncycastle.asn1.BERSetParser
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DERObject
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectParser;
import org.bouncycastle.asn1.ASN1SetParser;
import org.bouncycastle.asn1.BERSet;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERObject;

public class BERSetParser
implements ASN1SetParser {
    private ASN1ObjectParser a;

    BERSetParser(ASN1ObjectParser parser) {
        this.a = parser;
    }

    public DEREncodable readObject() throws IOException {
        return this.a.a();
    }

    public DERObject getDERObject() {
        return new BERSet((DEREncodableVector)this.a.a());
    }
}

