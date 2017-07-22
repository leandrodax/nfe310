/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.ASN1ObjectParser
 *  org.bouncycastle.asn1.ASN1OctetStringParser
 *  org.bouncycastle.asn1.ConstructedOctetStream
 *  org.bouncycastle.asn1.DEREncodable
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ObjectParser;
import org.bouncycastle.asn1.ASN1OctetStringParser;
import org.bouncycastle.asn1.DEREncodable;

class ConstructedOctetStream
extends InputStream {
    private final ASN1ObjectParser a;
    private boolean a;
    private InputStream a = true;

    ConstructedOctetStream(ASN1ObjectParser parser) {
        this.a = parser;
    }

    @Override
    public int read() throws IOException {
        if (this.a) {
            ASN1OctetStringParser s = (ASN1OctetStringParser)this.a.a();
            if (s == null) {
                return -1;
            }
            this.a = false;
            this.a = s.getOctetStream();
        } else if (this.a == null) {
            return -1;
        }
        int b = this.a.read();
        if (b < 0) {
            ASN1OctetStringParser s = (ASN1OctetStringParser)this.a.a();
            if (s == null) {
                this.a = null;
                return -1;
            }
            this.a = s.getOctetStream();
            return this.a.read();
        }
        return b;
    }
}

