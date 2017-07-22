/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.ASN1ObjectParser
 *  org.bouncycastle.asn1.ASN1SequenceParser
 *  org.bouncycastle.asn1.BERSequence
 *  org.bouncycastle.asn1.BERSequenceParser
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DEREncodableVector
 *  org.bouncycastle.asn1.DERObject
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectParser;
import org.bouncycastle.asn1.ASN1SequenceParser;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DEREncodableVector;
import org.bouncycastle.asn1.DERObject;

public class BERSequenceParser
implements ASN1SequenceParser {
    private ASN1ObjectParser a;

    BERSequenceParser(ASN1ObjectParser parser) {
        this.a = parser;
    }

    public DEREncodable readObject() throws IOException {
        return this.a.a();
    }

    public DERObject getDERObject() {
        return new BERSequence((DEREncodableVector)this.a.a());
    }
}

