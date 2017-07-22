/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1ObjectParser
 *  org.bouncycastle.asn1.ASN1OctetStringParser
 *  org.bouncycastle.asn1.BERConstructedOctetString
 *  org.bouncycastle.asn1.BEROctetStringParser
 *  org.bouncycastle.asn1.ConstructedOctetStream
 *  org.bouncycastle.asn1.DERObject
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ObjectParser;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.BERConstructedOctetString;
import org.bouncycastle.asn1.ConstructedOctetStream;
import org.bouncycastle.asn1.DERObject;

public class BEROctetStringParser
implements ASN1OctetStringParser {
    private ASN1ObjectParser a;

    protected BEROctetStringParser(ASN1ObjectParser parser) {
        this.a = parser;
    }

    public InputStream getOctetStream() {
        return new ConstructedOctetStream(this.a);
    }

    public DERObject getDERObject() {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        InputStream in = this.getOctetStream();
        try {
            int ch;
            while ((ch = in.read()) >= 0) {
                bOut.write(ch);
            }
        }
        catch (IOException e) {
            throw new IllegalStateException("IOException converting stream to byte array: " + e.getMessage());
        }
        return new BERConstructedOctetString(bOut.toByteArray());
    }
}

