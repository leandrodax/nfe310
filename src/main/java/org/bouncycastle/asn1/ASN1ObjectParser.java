/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1EncodableVector
 *  org.bouncycastle.asn1.ASN1ObjectParser
 *  org.bouncycastle.asn1.ASN1StreamParser
 *  org.bouncycastle.asn1.DEREncodable
 *  org.bouncycastle.asn1.DERObject
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1StreamParser;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ASN1ObjectParser {
    private int a;
    private int b;
    private ASN1StreamParser a;

    protected ASN1ObjectParser(int baseTag, int tagNumber, InputStream contentStream) {
        this.a = baseTag;
        this.b = tagNumber;
        this.a = new ASN1StreamParser(contentStream);
    }

    int a() {
        return this.b;
    }

    int b() {
        return this.a;
    }

    DEREncodable a() throws IOException {
        return this.a.readObject();
    }

    ASN1EncodableVector a() throws IllegalStateException {
        ASN1EncodableVector v = new ASN1EncodableVector();
        try {
            DEREncodable obj;
            while ((obj = this.a()) != null) {
                v.add((DEREncodable)obj.getDERObject());
            }
        }
        catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
        return v;
    }
}

