/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  org.bouncycastle.asn1.BERGenerator
 *  org.bouncycastle.asn1.BEROctetStringGenerator
 *  org.bouncycastle.asn1.BEROctetStringGenerator$1
 *  org.bouncycastle.asn1.BEROctetStringGenerator$BEROctetStream
 *  org.bouncycastle.asn1.BEROctetStringGenerator$BufferedBEROctetStream
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.BERGenerator;
import org.bouncycastle.asn1.BEROctetStringGenerator;

public class BEROctetStringGenerator
extends BERGenerator {
    public BEROctetStringGenerator(OutputStream out) throws IOException {
        super(out);
        this.writeBERHeader(36);
    }

    public BEROctetStringGenerator(OutputStream out, int tagNo, boolean isExplicit) throws IOException {
        super(out, tagNo, isExplicit);
        this.writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return new BEROctetStream(this, null);
    }

    public OutputStream getOctetOutputStream(byte[] buf) {
        return new BufferedBEROctetStream(this, buf);
    }
}

